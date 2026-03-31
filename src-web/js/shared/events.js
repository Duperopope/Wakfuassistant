/* shared/events.js — SSE unifie pour tous les onglets */
import { fetchJson } from "../api.js";

const listeners = {};
let evtSource = null;
let reconnectTimer = null;

export function on(event, fn) {
  if (!listeners[event]) listeners[event] = [];
  listeners[event].push(fn);
  return () => { listeners[event] = listeners[event].filter(f => f !== fn); };
}

export function emit(event, data) {
  (listeners[event] || []).forEach(fn => fn(data));
}

export function connectSSE(url) {
  if (evtSource) evtSource.close();
  url = url || "/api/events";
  evtSource = new EventSource(url);

  evtSource.addEventListener("reload", () => emit("reload", {}));
  evtSource.addEventListener("update", (e) => {
    try { emit("update", JSON.parse(e.data)); } catch(_) { emit("update", {}); }
  });
  evtSource.addEventListener("hdv", (e) => {
    try { emit("hdv", JSON.parse(e.data)); } catch(_) { emit("hdv", {}); }
  });
  evtSource.addEventListener("inventory", (e) => {
    try { emit("inventory", JSON.parse(e.data)); } catch(_) { emit("inventory", {}); }
  });
  evtSource.addEventListener("chest", (e) => {
    try { emit("chest", JSON.parse(e.data)); } catch(_) { emit("chest", {}); }
  });

  evtSource.onerror = () => {
    evtSource.close();
    if (reconnectTimer) clearTimeout(reconnectTimer);
    reconnectTimer = setTimeout(() => connectSSE(url), 5000);
  };
}

export function disconnectSSE() {
  if (evtSource) evtSource.close();
  if (reconnectTimer) clearTimeout(reconnectTimer);
}
