import type { Component } from "solid-js";
import { createSignal } from "solid-js";
import { loadSettings, saveSettings } from "../../lib/settings";
import { invoke } from "@tauri-apps/api/core";
import { setEnabled, L } from "../../lib/logger";

const OptionsTab: Component = () => {
  const [theme, setTheme] = createSignal<"dark" | "light">("dark");
  const [language, setLanguage] = createSignal<"fr" | "en">("fr");
  const [opacity, setOpacity] = createSignal(0.9);
  const [verboseLogs, setVerboseLogs] = createSignal(false);
  const [isSaving, setIsSaving] = createSignal(false);
  const [statusMessage, setStatusMessage] = createSignal("");

  // Charger les settings au montage
  const loadSettingsOnMount = async () => {
    L.settings.debug('OptionsTab.loadSettings', 'chargement settings');
    try {
      const settings = await loadSettings();
      setTheme(settings.theme);
      setLanguage(settings.language);
      setOpacity(settings.overlayOpacity);
      setVerboseLogs(settings.verboseLogs ?? false);
      L.settings.debug('OptionsTab.loadSettings', 'settings chargés',
        { theme: settings.theme, language: settings.language, opacity: settings.overlayOpacity, verbose: settings.verboseLogs });
    } catch (e) {
      L.settings.error('OptionsTab.loadSettings', 'Erreur loadSettings', e);
    }
  };
  loadSettingsOnMount();

  const saveCurrentSettings = async () => {
    L.settings.info('OptionsTab.saveSettings', 'sauvegarde manuelle',
      { theme: theme(), language: language(), opacity: opacity(), verbose: verboseLogs() });
    setIsSaving(true);
    try {
      const current = await loadSettings();
      current.theme = theme();
      current.language = language();
      current.overlayOpacity = opacity();
      current.verboseLogs = verboseLogs();
      await saveSettings(current);
      setStatusMessage("Paramètres sauvegardés \u2713");
      setTimeout(() => setStatusMessage(""), 3000);
      L.settings.info('OptionsTab.saveSettings', 'settings sauvegardés');
    } catch (e) {
      L.settings.error('OptionsTab.saveSettings', 'Erreur saveSettings', e);
      setStatusMessage("Erreur sauvegarde \u2717");
    } finally {
      setIsSaving(false);
    }
  };

  const refreshCdnCache = async () => {
    L.ipc.info('OptionsTab.refreshCdn', 'refresh CDN cache');
    setIsSaving(true);
    try {
      const msg = await invoke<string>("refresh_cdn_cache");
      setStatusMessage(msg);
      setTimeout(() => setStatusMessage(""), 4000);
      L.ipc.info('OptionsTab.refreshCdn', 'CDN rafraîchi', { msg });
    } catch (e) {
      L.ipc.error('OptionsTab.refreshCdn', 'Erreur refresh_cdn_cache', e);
      setStatusMessage("Erreur rafraîchissement ✗");
    } finally {
      setIsSaving(false);
    }
  };

  return (
    <div class="flex flex-col h-full p-4 space-y-3 overflow-y-auto text-xs">
      {/* Titre */}
      <div class="text-sm font-bold text-text-primary sticky top-0 bg-overlay-bg/90">
        Options
      </div>

      {/* Langue */}
      <div class="space-y-1">
        <label class="text-text-muted">Langue</label>
        <div class="flex gap-2">
          <button
            onClick={() => setLanguage("fr")}
            class={`px-3 py-1 rounded text-[11px] transition-colors ${
              language() === "fr"
                ? "bg-kamas text-overlay-bg"
                : "bg-overlay-surface hover:bg-overlay-surface/80"
            }`}
          >
            FR
          </button>
          <button
            onClick={() => setLanguage("en")}
            class={`px-3 py-1 rounded text-[11px] transition-colors ${
              language() === "en"
                ? "bg-kamas text-overlay-bg"
                : "bg-overlay-surface hover:bg-overlay-surface/80"
            }`}
          >
            EN
          </button>
        </div>
      </div>

      {/* Thème */}
      <div class="space-y-1">
        <label class="text-text-muted">Thème</label>
        <div class="flex gap-2">
          <button
            onClick={() => setTheme("dark")}
            class={`px-3 py-1 rounded text-[11px] transition-colors ${
              theme() === "dark"
                ? "bg-kamas text-overlay-bg"
                : "bg-overlay-surface hover:bg-overlay-surface/80"
            }`}
          >
            🌙 Sombre
          </button>
          <button
            onClick={() => setTheme("light")}
            class={`px-3 py-1 rounded text-[11px] transition-colors ${
              theme() === "light"
                ? "bg-kamas text-overlay-bg"
                : "bg-overlay-surface hover:bg-overlay-surface/80"
            }`}
          >
            ☀️ Clair
          </button>
        </div>
      </div>

      {/* Opacité */}
      <div class="space-y-2">
        <div class="flex justify-between">
          <label class="text-text-muted">Opacité</label>
          <span class="font-mono text-text-primary">
            {Math.round(opacity() * 100)}%
          </span>
        </div>
        <input
          type="range"
          min="0.5"
          max="1"
          step="0.05"
          value={opacity()}
          onInput={(e) => setOpacity(parseFloat(e.currentTarget.value))}
          class="w-full h-1 bg-overlay-surface rounded appearance-none cursor-pointer"
          style={{
            accentColor: "var(--color-kamas)",
          }}
        />
      </div>

      {/* Logs détaillés */}
      <div class="flex items-center justify-between">
        <label class="text-text-muted">Logs détaillés</label>
        <button
          onClick={() => {
            const next = !verboseLogs();
            L.settings.info('OptionsTab.verboseToggle', `verbose logs: ${verboseLogs()} → ${next}`);
            setVerboseLogs(next);
            setEnabled(next);
            invoke('set_verbose_logging', { enabled: next }).catch(
              (e) => L.settings.error('OptionsTab.verboseToggle', 'invoke set_verbose_logging échoué', e)
            );
          }}
          class={`relative w-10 h-5 rounded-full transition-colors ${
            verboseLogs() ? 'bg-kamas' : 'bg-overlay-surface'
          }`}
        >
          <span class={`absolute top-0.5 w-4 h-4 bg-white rounded-full shadow transition-transform ${
            verboseLogs() ? 'left-5' : 'left-0.5'
          }`} />
        </button>
      </div>

      {/* Séparateur */}
      <div class="border-t border-overlay-border my-2" />

      {/* Actions */}
      <div class="space-y-2">
        <button
          onClick={saveCurrentSettings}
          disabled={isSaving()}
          class="w-full px-3 py-1.5 rounded text-[11px] bg-kamas text-overlay-bg hover:bg-kamas/90 disabled:opacity-50 transition-colors"
        >
          {isSaving() ? "⏳..." : "💾 Sauvegarder"}
        </button>

        <button
          onClick={refreshCdnCache}
          disabled={isSaving()}
          class="w-full px-3 py-1.5 rounded text-[11px] bg-overlay-surface hover:bg-overlay-surface/80 disabled:opacity-50 transition-colors"
        >
          {isSaving() ? "⏳..." : "🔄 Rafraîchir CDN"}
        </button>
      </div>

      {/* Status message */}
      {statusMessage() && (
        <div
          class={`text-center text-[10px] py-1 px-2 rounded ${
            statusMessage().includes("✓")
              ? "bg-victory-green/20 text-victory-green"
              : "bg-defeat-red/20 text-defeat-red"
          }`}
        >
          {statusMessage()}
        </div>
      )}

      {/* Infos */}
      <div class="text-[10px] text-text-muted italic space-y-1 mt-auto pt-2">
        <div>Raccourci click-through : F12</div>
        <div>Version : 2.0.0</div>
      </div>
    </div>
  );
};

export default OptionsTab;
