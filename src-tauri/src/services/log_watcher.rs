use std::fs::File;
use std::io::{BufRead, BufReader, Seek, SeekFrom};
use std::path::PathBuf;
use std::sync::{Arc, Mutex};
use std::time::Duration;

use notify::RecursiveMode;
use notify_debouncer_mini::new_debouncer;
use tauri::ipc::Channel;
use tracing::info;

use crate::models::game_event::{GameEvent, LogSource};
use crate::services::log_parser::LogParser;
use crate::services::state_machine::{GameState, StateMachine, StateTransition};

/// Événement streamé vers le frontend via Tauri Channel.
#[derive(Debug, Clone, serde::Serialize)]
#[serde(tag = "event", content = "data")]
pub enum GameStreamEvent {
    /// Événement de jeu parsé
    #[serde(rename = "gameEvent")]
    GameEvent(GameEvent),
    /// Transition d'état du FSM
    #[serde(rename = "stateChange")]
    StateChange(StateTransition),
    /// Santé du parser (périodique)
    #[serde(rename = "parserHealth")]
    ParserHealth(crate::services::log_parser::ParserHealth),
    /// Disponibilité des fichiers log
    #[serde(rename = "logStatus")]
    LogStatus { main: bool, chat: bool },
}

/// Lecteur incrémental pour un fichier log.
struct LogFileReader {
    path: PathBuf,
    cursor: u64,
    source: LogSource,
}

impl LogFileReader {
    fn new(path: PathBuf, source: LogSource) -> Self {
        // Démarrer à la fin du fichier pour ne pas re-parser l'historique
        let cursor = std::fs::metadata(&path).map(|m| m.len()).unwrap_or(0);

        info!(
            path = %path.display(),
            cursor = cursor,
            "Lecteur incrémental initialisé"
        );

        Self {
            path,
            cursor,
            source,
        }
    }

    /// Lit les nouvelles lignes depuis la dernière position.
    /// Gère la rotation de fichier (si le fichier rétrécit → reset curseur).
    fn read_new_lines(&mut self) -> Vec<String> {
        let file = match File::open(&self.path) {
            Ok(f) => f,
            Err(_) => return vec![],
        };

        let file_size = file.metadata().map(|m| m.len()).unwrap_or(0);

        // Détection rotation : fichier plus petit qu'avant
        if file_size < self.cursor {
            info!(
                path = %self.path.display(),
                old = self.cursor,
                new = file_size,
                "Rotation de log détectée"
            );
            self.cursor = 0;
        }

        if file_size == self.cursor {
            return vec![];
        }

        let mut reader = BufReader::new(file);
        if reader.seek(SeekFrom::Start(self.cursor)).is_err() {
            return vec![];
        }

        let mut new_lines = Vec::new();
        let mut line_buf = String::new();

        while reader.read_line(&mut line_buf).unwrap_or(0) > 0 {
            let trimmed = line_buf.trim_end().to_string();
            if !trimmed.is_empty() {
                new_lines.push(trimmed);
            }
            line_buf.clear();
        }

        self.cursor = reader.stream_position().unwrap_or(file_size);
        new_lines
    }

    fn source(&self) -> LogSource {
        self.source.clone()
    }
}

/// État partagé du pipeline (parser + FSM + readers).
pub struct PipelineState {
    parser: LogParser,
    fsm: StateMachine,
    main_reader: Option<LogFileReader>,
    chat_reader: Option<LogFileReader>,
}

impl PipelineState {
    fn new(log_dir: &PathBuf) -> Self {
        let main_path = log_dir.join("wakfu.log");
        let chat_path = log_dir.join("wakfu_chat.log");

        let main_reader = if main_path.exists() {
            Some(LogFileReader::new(main_path, LogSource::WakfuMain))
        } else {
            info!(path = %main_path.display(), "wakfu.log absent — surveillance du répertoire");
            None
        };

        let chat_reader = if chat_path.exists() {
            Some(LogFileReader::new(chat_path, LogSource::WakfuChat))
        } else {
            info!(path = %chat_path.display(), "wakfu_chat.log absent — surveillance du répertoire");
            None
        };

        Self {
            parser: LogParser::new(),
            fsm: StateMachine::new(),
            main_reader,
            chat_reader,
        }
    }

    /// Lit les nouvelles lignes de tous les fichiers, parse, et retourne les événements.
    pub fn poll(&mut self) -> Vec<GameStreamEvent> {
        let mut stream_events = Vec::new();

        // Vérifier si les fichiers sont apparus (joueur vient de lancer Wakfu)
        self.check_file_creation();

        // Lire les deux logs
        for reader in [&mut self.main_reader, &mut self.chat_reader] {
            if let Some(ref mut r) = reader {
                let lines = r.read_new_lines();
                let source = r.source();
                for line in &lines {
                    let event = self.parser.parse_line(line, source.clone());

                    // Passer l'événement au FSM
                    if let Some(transition) = self.fsm.process(&event) {
                        stream_events.push(GameStreamEvent::StateChange(transition));
                    }

                    // Ne pas streamer les Unrecognized (bruit)
                    if !matches!(event, GameEvent::Unrecognized { .. }) {
                        stream_events.push(GameStreamEvent::GameEvent(event));
                    }
                }
            }
        }

        stream_events
    }

    fn check_file_creation(&mut self) {
        // Si les readers n'existent pas encore, vérifier si les fichiers sont apparus
        if self.main_reader.is_none() {
            if let Some(dir) = self.log_dir() {
                let path = dir.join("wakfu.log");
                if path.exists() {
                    info!("wakfu.log détecté — démarrage du parsing");
                    self.main_reader = Some(LogFileReader::new(path, LogSource::WakfuMain));
                }
            }
        }
        if self.chat_reader.is_none() {
            if let Some(dir) = self.log_dir() {
                let path = dir.join("wakfu_chat.log");
                if path.exists() {
                    info!("wakfu_chat.log détecté — démarrage du parsing");
                    self.chat_reader = Some(LogFileReader::new(path, LogSource::WakfuChat));
                }
            }
        }
    }

    fn log_dir(&self) -> Option<PathBuf> {
        self.main_reader
            .as_ref()
            .or(self.chat_reader.as_ref())
            .and_then(|r| r.path.parent().map(|p| p.to_path_buf()))
    }

    pub fn game_state(&self) -> &GameState {
        self.fsm.state()
    }

    pub fn parser_health(&self) -> crate::services::log_parser::ParserHealth {
        self.parser.health()
    }
}

/// Démarre le pipeline de surveillance des logs.
///
/// Stratégie hybride :
/// 1. notify-rs détecte les changements fichier en < 200ms
/// 2. Timer de sécurité (2s) rattrape les événements manqués par le buffer OS
pub fn start_pipeline(
    log_dir: PathBuf,
    channel: Channel<GameStreamEvent>,
) -> Result<Arc<Mutex<PipelineState>>, Box<dyn std::error::Error>> {
    let state = Arc::new(Mutex::new(PipelineState::new(&log_dir)));

    // Émettre le statut initial des fichiers
    {
        let s = state.lock().unwrap();
        let _ = channel.send(GameStreamEvent::LogStatus {
            main: s.main_reader.is_some(),
            chat: s.chat_reader.is_some(),
        });
    }

    // --- 1. notify-rs pour la détection rapide ---
    let state_notify = state.clone();
    let channel_notify = channel.clone();
    let mut debouncer = new_debouncer(
        Duration::from_millis(200),
        move |result: Result<Vec<notify_debouncer_mini::DebouncedEvent>, _>| {
            if result.is_ok() {
                if let Ok(mut s) = state_notify.lock() {
                    let events = s.poll();
                    for event in events {
                        let _ = channel_notify.send(event);
                    }
                }
            }
        },
    )?;

    debouncer
        .watcher()
        .watch(&log_dir, RecursiveMode::NonRecursive)?;

    info!(
        dir = %log_dir.display(),
        "Pipeline démarré (notify-rs + debounce 200ms)"
    );

    // Garder le debouncer vivant
    std::mem::forget(debouncer);

    // --- 2. Timer de sécurité (2s) en backup ---
    let state_timer = state.clone();
    let channel_timer = channel.clone();
    std::thread::spawn(move || {
        let mut health_counter: u32 = 0;
        loop {
            std::thread::sleep(Duration::from_secs(2));

            if let Ok(mut s) = state_timer.lock() {
                let events = s.poll();
                for event in events {
                    let _ = channel_timer.send(event);
                }

                // Émettre la santé du parser toutes les 30s (15 cycles de 2s)
                health_counter += 1;
                if health_counter >= 15 {
                    health_counter = 0;
                    let health = s.parser_health();
                    let _ = channel_timer.send(GameStreamEvent::ParserHealth(health));
                }
            }
        }
    });

    Ok(state)
}
