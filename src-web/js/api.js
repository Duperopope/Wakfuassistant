// API client - toutes les requetes vers le backend
const API_BASE = typeof window !== "undefined" && window.location.hostname === "localhost"
  ? "http://localhost:8042"
  : "http://127.0.0.1:8042";

export async function fetchJson(url) {
  const res = await fetch(API_BASE + url);
  if (!res.ok) throw new Error(`HTTP ${res.status}`);
  return res.json();
}

export async function reloadData() {
  const res = await fetch(API_BASE + "/api/reload", { method: "POST" });
  return res.json();
}

export function connectSSE(onReload) {
  const es = new EventSource(API_BASE + "/api/events");
  es.addEventListener("reload", () => onReload());
  es.onerror = () => {
    es.close();
    setTimeout(() => connectSSE(onReload), 5000);
  };
  return es;
}
