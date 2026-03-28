import type { Component } from "solid-js";
import { createSignal, For } from "solid-js";
import {
  loadSettings, saveSettings, applyThemeColors,
  THEME_PRESETS,
} from "../../lib/settings";
import { invoke } from "@tauri-apps/api/core";
import { setEnabled, L } from "../../lib/logger";

const PRESET_NAMES: Record<string, string> = {
  "wakfu-classic": "\uD83C\uDFAE Wakfu Classic",
  "wakfu-dark": "\uD83C\uDF19 Wakfu Dark",
  "wakfu-nature": "\uD83C\uDF3F Wakfu Nature",
  "wakfu-fire": "\uD83D\uDD25 Wakfu Fire",
};

const OptionsTab: Component = () => {
  const [language, setLanguage] = createSignal<"fr" | "en">("fr");
  const [opacity, setOpacity] = createSignal(0.9);
  const [verboseLogs, setVerboseLogs] = createSignal(false);
  const [isSaving, setIsSaving] = createSignal(false);
  const [statusMessage, setStatusMessage] = createSignal("");
  const [themePreset, setThemePreset] = createSignal("wakfu-classic");

  // Charger les settings au montage
  const loadOnMount = async () => {
    try {
      const s = await loadSettings();
      setLanguage(s.language);
      setOpacity(s.overlayOpacity);
      setVerboseLogs(s.verboseLogs ?? false);
      setThemePreset(s.themePreset ?? "wakfu-classic");
      L.settings.debug("OptionsTab", "settings charges");
    } catch (e) {
      L.settings.error("OptionsTab", "Erreur loadSettings", e);
    }
  };
  loadOnMount();

  const handleThemeChange = async (presetKey: string) => {
    L.settings.info("OptionsTab", `theme -> ${presetKey}`);
    setThemePreset(presetKey);
    const colors = THEME_PRESETS[presetKey];
    if (colors) {
      applyThemeColors(colors);
    }
    // Sauvegarde immediate
    try {
      const s = await loadSettings();
      s.themePreset = presetKey;
      s.customColors = null;
      await saveSettings(s);
    } catch (e) {
      L.settings.error("OptionsTab", "Erreur save theme", e);
    }
  };

  const saveCurrentSettings = async () => {
    setIsSaving(true);
    try {
      const current = await loadSettings();
      current.language = language();
      current.overlayOpacity = opacity();
      current.verboseLogs = verboseLogs();
      current.themePreset = themePreset();
      await saveSettings(current);
      setStatusMessage("Param\u00e8tres sauvegard\u00e9s \u2713");
      setTimeout(() => setStatusMessage(""), 3000);
    } catch (e) {
      L.settings.error("OptionsTab", "Erreur saveSettings", e);
      setStatusMessage("Erreur sauvegarde \u2717");
    } finally {
      setIsSaving(false);
    }
  };

  const refreshCdnCache = async () => {
    setIsSaving(true);
    try {
      const msg = await invoke<string>("refresh_cdn_cache");
      setStatusMessage(msg);
      setTimeout(() => setStatusMessage(""), 4000);
    } catch (e) {
      L.ipc.error("OptionsTab", "Erreur refresh_cdn_cache", e);
      setStatusMessage("Erreur rafra\u00eechissement \u2717");
    } finally {
      setIsSaving(false);
    }
  };

  return (
    <div class="flex flex-col h-full p-4 space-y-3 overflow-y-auto text-xs">

      {/* === SECTION THEME === */}
      <div class="space-y-2">
        <label class="text-text-muted text-[11px] uppercase tracking-wider">Th\u00e8me</label>
        <div class="grid grid-cols-2 gap-2">
          <For each={Object.entries(PRESET_NAMES)}>
            {([key, name]) => (
              <button
                onClick={() => handleThemeChange(key)}
                class={`px-3 py-2 rounded-lg text-[11px] transition-all border ${
                  themePreset() === key
                    ? "bg-accent/20 border-accent text-text-primary shadow-sm"
                    : "bg-overlay-surface border-overlay-border hover:border-accent/50 text-text-secondary"
                }`}
              >
                {name}
              </button>
            )}
          </For>
        </div>
      </div>

      <div class="border-t border-overlay-border my-1" />

      {/* === SECTION LANGUE === */}
      <div class="space-y-1">
        <label class="text-text-muted text-[11px] uppercase tracking-wider">Langue</label>
        <div class="flex gap-2">
          <button
            onClick={() => setLanguage("fr")}
            class={`px-3 py-1 rounded text-[11px] transition-colors ${
              language() === "fr"
                ? "bg-accent text-overlay-bg"
                : "bg-overlay-surface hover:bg-overlay-surface/80"
            }`}
          >
            FR
          </button>
          <button
            onClick={() => setLanguage("en")}
            class={`px-3 py-1 rounded text-[11px] transition-colors ${
              language() === "en"
                ? "bg-accent text-overlay-bg"
                : "bg-overlay-surface hover:bg-overlay-surface/80"
            }`}
          >
            EN
          </button>
        </div>
      </div>

      {/* === OPACITE === */}
      <div class="space-y-2">
        <div class="flex justify-between">
          <label class="text-text-muted text-[11px] uppercase tracking-wider">Opacit\u00e9</label>
          <span class="font-mono text-text-primary">{Math.round(opacity() * 100)}%</span>
        </div>
        <input
          type="range" min="0.5" max="1" step="0.05"
          value={opacity()}
          onInput={(e) => setOpacity(parseFloat(e.currentTarget.value))}
          class="w-full h-1 bg-overlay-surface rounded appearance-none cursor-pointer"
        />
      </div>

      {/* === LOGS === */}
      <div class="flex items-center justify-between">
        <label class="text-text-muted text-[11px] uppercase tracking-wider">Logs d\u00e9taill\u00e9s</label>
        <button
          onClick={() => {
            const next = !verboseLogs();
            setVerboseLogs(next);
            setEnabled(next);
            invoke("set_verbose_logging", { enabled: next }).catch(() => {});
          }}
          class={`relative w-10 h-5 rounded-full transition-colors ${
            verboseLogs() ? "bg-accent" : "bg-overlay-surface"
          }`}
        >
          <span class={`absolute top-0.5 w-4 h-4 bg-white rounded-full shadow transition-transform ${
            verboseLogs() ? "left-5" : "left-0.5"
          }`} />
        </button>
      </div>

      <div class="border-t border-overlay-border my-1" />

      {/* === ACTIONS === */}
      <div class="space-y-2">
        <button
          onClick={saveCurrentSettings}
          disabled={isSaving()}
          class="w-full px-3 py-1.5 rounded-lg text-[11px] bg-accent text-overlay-bg hover:bg-accent-hover disabled:opacity-50 transition-colors"
        >
          {isSaving() ? "\u23F3..." : "\uD83D\uDCBE Sauvegarder"}
        </button>
        <button
          onClick={refreshCdnCache}
          disabled={isSaving()}
          class="w-full px-3 py-1.5 rounded-lg text-[11px] bg-overlay-surface hover:bg-overlay-surface/80 disabled:opacity-50 transition-colors"
        >
          {isSaving() ? "\u23F3..." : "\uD83D\uDD04 Rafra\u00eechir CDN"}
        </button>
      </div>

      {/* Status */}
      {statusMessage() && (
        <div class={`text-center text-[10px] py-1 px-2 rounded ${
          statusMessage().includes("\u2713")
            ? "bg-victory-green/20 text-victory-green"
            : "bg-defeat-red/20 text-defeat-red"
        }`}>
          {statusMessage()}
        </div>
      )}

      {/* === VERSION === */}
      <div class="text-[10px] text-text-muted italic space-y-1 mt-auto pt-2">
        <div>Raccourci click-through : F12</div>
        <div>Version : 4.0.4</div>
        <div class="text-text-muted/50">Wakfu Overlay by Smedj</div>
      </div>
    </div>
  );
};

export default OptionsTab;
