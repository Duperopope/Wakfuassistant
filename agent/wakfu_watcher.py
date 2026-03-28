"""
Wakfu Watcher — démarrage automatique du pipeline quand Wakfu est détecté.
Lance les scripts de sync/monitoring dès que le processus Java Wakfu tourne.
"""
import subprocess, time, os, sys, json, shutil, datetime

ZAAP_SETTINGS = r'C:\Users\Smedj\AppData\Roaming\zaap\repositories\production\wakfu\main\settings.json'
AGENT_JAR = r'H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar'
AGENT_OPT = (
    f'-javaagent:{AGENT_JAR}'
    ' --add-opens=java.base/java.lang=ALL-UNNAMED'
    ' --add-opens=java.base/java.lang.reflect=ALL-UNNAMED'
    ' --add-opens=java.base/java.util=ALL-UNNAMED'
)
SYNC_SCRIPT = r'H:\Code\Wakfuassistant\docs\RND\poc-hdv\sync_hdv_to_sqlite.ps1'
LOG_FILE = r'H:\Code\Wakfuassistant\logs\watcher.log'
CHECK_INTERVAL = 15  # secondes


def log(msg):
    ts = datetime.datetime.now().strftime('%H:%M:%S')
    line = f'[{ts}] {msg}'
    print(line, flush=True)
    with open(LOG_FILE, 'a', encoding='utf-8') as f:
        f.write(line + '\n')


def is_wakfu_running():
    """Détecte si Wakfu (JVM) tourne en vérifiant les processus Java avec argument Wakfu."""
    try:
        result = subprocess.run(
            ['powershell', '-Command',
             'Get-Process java -ErrorAction SilentlyContinue | '
             'Where-Object {$_.Path -like "*java*"} | '
             'Select-Object -First 1 Id'],
            capture_output=True, text=True, timeout=5
        )
        return bool(result.stdout.strip())
    except Exception:
        return False


def ensure_agent_in_zaap():
    """S'assure que le javaagent est dans les settings zaap."""
    try:
        with open(ZAAP_SETTINGS, encoding='utf-8') as f:
            s = json.load(f)
        current = s['java_options']['value']
        if 'wakfu-spy-agent' not in current:
            bak = ZAAP_SETTINGS + '.bak_' + datetime.datetime.now().strftime('%Y%m%d_%H%M%S')
            shutil.copy(ZAAP_SETTINGS, bak)
            s['java_options']['value'] = current + ' ' + AGENT_OPT
            with open(ZAAP_SETTINGS, 'w', encoding='utf-8') as f:
                json.dump(s, f, ensure_ascii=False)
            log('Agent injecté dans zaap settings')
        else:
            log('Agent déjà présent dans zaap settings')
    except Exception as e:
        log(f'ERREUR zaap settings: {e}')


def run_sync():
    """Lance le sync HDV vers SQLite si le script existe."""
    if os.path.exists(SYNC_SCRIPT):
        try:
            subprocess.Popen(
                ['powershell', '-ExecutionPolicy', 'Bypass', '-File', SYNC_SCRIPT],
                creationflags=subprocess.CREATE_NO_WINDOW
            )
            log('Sync HDV lancé')
        except Exception as e:
            log(f'ERREUR sync: {e}')


def main():
    log('=== Wakfu Watcher démarré ===')
    ensure_agent_in_zaap()

    was_running = False

    while True:
        running = is_wakfu_running()

        if running and not was_running:
            log('Wakfu DÉTECTÉ — session active')
            was_running = True

        elif not running and was_running:
            log('Wakfu ARRÊTÉ — fin de session')
            was_running = False

        time.sleep(CHECK_INTERVAL)


if __name__ == '__main__':
    main()
