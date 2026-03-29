// State manager - etat global reactif
const state = {
  currentTab: "players",
  players: [],
  guilds: [],
  classes: [],
  stats: {},
  filters: {
    search: "",
    breed: "",
    guild: "",
    minLevel: 0,
    maxLevel: 245,
    sort: "score_global",
    order: "desc",
    offset: 0,
    limit: 50,
  },
  modal: {
    open: false,
    playerName: null,
    tranche: null,
    activeTab: "equip",
  },
};

const listeners = new Set();

export function getState() {
  return state;
}

export function setState(partial) {
  Object.assign(state, partial);
  notify();
}

export function updateFilters(partial) {
  Object.assign(state.filters, partial);
  notify();
}

export function subscribe(fn) {
  listeners.add(fn);
  return () => listeners.delete(fn);
}

function notify() {
  listeners.forEach((fn) => fn(state));
}

export default state;
