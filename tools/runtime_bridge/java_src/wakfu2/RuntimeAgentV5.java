package wakfu2;

import java.io.IOException;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class RuntimeAgentV5 {
    private static final Set<String> TARGET_KEYS = new HashSet<>();
    static {
        TARGET_KEYS.add("kama");
        TARGET_KEYS.add("kamas");
        TARGET_KEYS.add("money");
        TARGET_KEYS.add("wallet");
        TARGET_KEYS.add("currency");
        TARGET_KEYS.add("currentExperience");
        TARGET_KEYS.add("currentLevelPercentage");
        TARGET_KEYS.add("currentLevelPercentageInText");
        TARGET_KEYS.add("hpPercentage");
        TARGET_KEYS.add("APShort");
        TARGET_KEYS.add("MPShort");
        TARGET_KEYS.add("WPShort");
    }

    private static ScheduledExecutorService scheduler;
    private static Integer runtimeHint;

    private record AgentConfig(Path outPath, Integer hint) {}

    public static void premain(String agentArgs, Instrumentation inst) {
        start(agentArgs, inst);
    }

    public static void agentmain(String agentArgs, Instrumentation inst) {
        start(agentArgs, inst);
    }

    private static synchronized void start(String agentArgs, Instrumentation inst) {
        if (scheduler != null) {
            return;
        }
        final AgentConfig cfg = parseAgentArgs(agentArgs);
        final Path outPath = cfg.outPath();
        runtimeHint = cfg.hint();
        scheduler = Executors.newSingleThreadScheduledExecutor(r -> {
            Thread t = new Thread(r, "wakfu-runtime-bridge-v5");
            t.setDaemon(true);
            return t;
        });

        scheduler.scheduleAtFixedRate(() -> {
            try {
                Map<String, Object> data = scanRuntime(inst);
                writeJson(outPath, data);
            } catch (Throwable t) {
                Map<String, Object> err = new HashMap<>();
                err.put("source", "runtime-agent-v5");
                err.put("status", "error");
                err.put("error", t.getClass().getName() + ": " + t.getMessage());
                err.put("updated_at", Instant.now().getEpochSecond());
                writeJson(outPath, err);
            }
        }, 0, 1200, TimeUnit.MILLISECONDS);
    }

    private static AgentConfig parseAgentArgs(String agentArgs) {
        if (agentArgs == null || agentArgs.trim().isEmpty()) {
            return new AgentConfig(Paths.get("logs", "realtime", "interface_state.json"), null);
        }

        String raw = agentArgs.trim();
        String[] parts = raw.split("\\|hint=", 2);
        Path out = Paths.get(parts[0].trim());
        Integer hint = null;
        if (parts.length == 2) {
            String cleaned = parts[1].replaceAll("[^0-9-]", "");
            if (!cleaned.isEmpty()) {
                try {
                    hint = Integer.parseInt(cleaned);
                } catch (NumberFormatException ignored) {
                    hint = null;
                }
            }
        }
        return new AgentConfig(out, hint);
    }

    private static Map<String, Object> scanRuntime(Instrumentation inst) {
        Map<String, Object> payload = new HashMap<>();
        payload.put("source", "runtime-agent-v5");
        payload.put("status", "ok");
        payload.put("updated_at", Instant.now().getEpochSecond());

        List<Candidate> kamaCandidates = new ArrayList<>();
        Map<String, Object> extracted = new HashMap<>();
        int classesScanned = 0;
        int mapsSeen = 0;

        for (Class<?> cls : inst.getAllLoadedClasses()) {
            classesScanned++;
            Field[] fields;
            try {
                fields = cls.getDeclaredFields();
            } catch (Throwable ignored) {
                continue;
            }

            for (Field f : fields) {
                if (!Modifier.isStatic(f.getModifiers())) {
                    continue;
                }
                Object value;
                try {
                    f.setAccessible(true);
                    value = f.get(null);
                } catch (Throwable ignored) {
                    continue;
                }
                mapsSeen += scanObject(value, extracted, kamaCandidates, 2);
            }
        }

        payload.put("classes_scanned", classesScanned);
        payload.put("maps_seen", mapsSeen);
        if (runtimeHint != null) {
            payload.put("hint_value", runtimeHint);
        }

        Object levelPct = extracted.get("currentLevelPercentage");
        Object xpCur = extracted.get("currentExperience");
        Object hpPct = extracted.get("hpPercentage");
        if (levelPct != null) payload.put("currentLevelPercentage", String.valueOf(levelPct));
        if (xpCur != null) payload.put("currentExperience", String.valueOf(xpCur));
        Integer hpInt = numericFromValue(hpPct);
        if (hpInt != null) payload.put("hp_percent", hpInt);

        Integer ap = numericFromValue(extracted.get("APShort"));
        Integer mp = numericFromValue(extracted.get("MPShort"));
        Integer wp = numericFromValue(extracted.get("WPShort"));
        if (ap != null) payload.put("ap", ap);
        if (mp != null) payload.put("mp", mp);
        if (wp != null) payload.put("wp", wp);

        Integer kama = selectBestKama(kamaCandidates);
        if (kama != null) {
            payload.put("kamas_total", kama);
        }

        kamaCandidates.sort(Comparator.comparingInt((Candidate c) -> c.score).reversed());
        Map<String, Object> debug = new HashMap<>();
        int limit = Math.min(40, kamaCandidates.size());
        for (int i = 0; i < limit; i++) {
            Candidate c = kamaCandidates.get(i);
            debug.put("c" + i, c.key + "=" + c.value + " (score=" + c.score + ")");
        }
        payload.put("kama_candidates", debug);
        payload.put("kama_candidates_count", kamaCandidates.size());

        return payload;
    }

    private static int scanObject(Object root, Map<String, Object> extracted, List<Candidate> kamaCandidates, int maxDepth) {
        if (root == null) return 0;

        int mapsSeen = 0;
        IdentityHashMap<Object, Boolean> visited = new IdentityHashMap<>();
        Deque<Node> dq = new ArrayDeque<>();
        dq.add(new Node(root, 0));

        while (!dq.isEmpty()) {
            Node node = dq.removeFirst();
            if (node.obj == null) continue;
            if (visited.containsKey(node.obj)) continue;
            visited.put(node.obj, Boolean.TRUE);

            Class<?> c = node.obj.getClass();
            if (isLeafType(c)) continue;

            if (node.obj instanceof Map<?, ?> map) {
                mapsSeen++;
                int count = 0;
                for (Map.Entry<?, ?> e : map.entrySet()) {
                    if (++count > 500) break;
                    String key = safeString(e.getKey());
                    if (key == null || key.isEmpty()) {
                        continue;
                    }
                    String lower = key.toLowerCase();
                    Object val = e.getValue();

                    for (String target : TARGET_KEYS) {
                        if (lower.contains(target.toLowerCase()) && val != null) {
                            Integer numeric = numericFromValue(val);
                            if (numeric != null) {
                                extracted.putIfAbsent(target, numeric);
                            } else {
                                String valText = safeString(val);
                                if (valText != null && !looksLikeObjectRef(valText)) {
                                    extracted.putIfAbsent(target, valText);
                                }
                            }
                        }
                    }

                    Integer numeric = numericFromValue(val);
                    if (numeric != null) {
                        int score = scoreKamaCandidate(lower, numeric);
                        if (score > -20) {
                            kamaCandidates.add(new Candidate(key, numeric, score));
                        }
                    }
                }
            }

            if (node.depth >= maxDepth) continue;

            Field[] fields;
            try {
                fields = c.getDeclaredFields();
            } catch (Throwable ignored) {
                continue;
            }

            for (Field f : fields) {
                if (f.getType().isPrimitive()) continue;
                Object child;
                try {
                    f.setAccessible(true);
                    child = f.get(node.obj);
                } catch (Throwable ignored) {
                    continue;
                }
                if (child != null) dq.addLast(new Node(child, node.depth + 1));
            }
        }

        return mapsSeen;
    }

    private static Integer selectBestKama(List<Candidate> candidates) {
        if (candidates.isEmpty()) return null;
        candidates.sort(Comparator.comparingInt((Candidate c) -> c.score).reversed());
        Candidate best = candidates.get(0);
        if (best.score < 20) return null;
        return best.value;
    }

    private static int scoreKamaCandidate(String keyLower, int value) {
        if (value <= 0) return -100;
        int score = 0;
        if (keyLower.contains("kama")) score += 30;
        if (keyLower.contains("kamas")) score += 15;
        if (keyLower.contains("wallet")) score += 20;
        if (keyLower.contains("money")) score += 12;
        if (keyLower.contains("currency")) score += 10;

        if (value >= 100 && value <= 10_000_000_000L) score += 15;
        if (value < 10) score -= 15;

        if (runtimeHint != null) {
            int diff = Math.abs(value - runtimeHint);
            if (diff == 0) {
                score += 120;
            } else if (diff <= 5) {
                score += 80;
            } else if (diff <= 50) {
                score += 55;
            } else if (diff <= 500) {
                score += 35;
            } else if (diff <= 5000) {
                score += 15;
            }
        }

        return score;
    }

    private static Integer numericFromValue(Object value) {
        if (value == null) return null;
        if (value instanceof Number n) {
            long v = n.longValue();
            if (v < Integer.MIN_VALUE || v > Integer.MAX_VALUE) return null;
            return (int) v;
        }

        String rawSource = safeString(value);
        if (rawSource == null) return null;
        String raw = rawSource.trim();
        if (raw.isEmpty()) return null;
        if (looksLikeObjectRef(raw)) return null;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < raw.length(); i++) {
            char ch = raw.charAt(i);
            if (Character.isDigit(ch)) sb.append(ch);
        }
        if (sb.length() == 0) return null;

        try {
            long v = Long.parseLong(sb.toString());
            if (v < Integer.MIN_VALUE || v > Integer.MAX_VALUE) return null;
            return (int) v;
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    private static String safeString(Object value) {
        try {
            return String.valueOf(value);
        } catch (Throwable ignored) {
            return null;
        }
    }

    private static boolean looksLikeObjectRef(String s) {
        // Java toString() object refs like [F@1a2b3c or com.Foo@abcd
        return s.matches("^[\\[].*@([0-9a-fA-F]+)$") || s.matches("^.+@[0-9a-fA-F]+$");
    }

    private static boolean isLeafType(Class<?> c) {
        return c.isPrimitive()
            || Number.class.isAssignableFrom(c)
            || c == String.class
            || c == Boolean.class
            || c == Character.class
            || c.getName().startsWith("java.time.")
            || c.getName().startsWith("java.lang.Class");
    }

    private static void writeJson(Path outPath, Map<String, Object> data) {
        try {
            if (outPath.getParent() != null) {
                Files.createDirectories(outPath.getParent());
            }
            Files.writeString(outPath, toJson(data), StandardCharsets.UTF_8);
        } catch (IOException ignored) {
        }
    }

    private static String toJson(Map<String, Object> data) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        List<String> keys = new ArrayList<>(data.keySet());
        keys.sort(String::compareTo);
        for (int i = 0; i < keys.size(); i++) {
            String k = keys.get(i);
            Object v = data.get(k);
            sb.append("  \"").append(escape(k)).append("\": ").append(jsonValue(v));
            if (i < keys.size() - 1) sb.append(',');
            sb.append('\n');
        }
        sb.append("}\n");
        return sb.toString();
    }

    private static String jsonValue(Object v) {
        if (v == null) return "null";
        if (v instanceof Number || v instanceof Boolean) return String.valueOf(v);
        if (v instanceof Map<?, ?> map) {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            boolean first = true;
            for (Map.Entry<?, ?> e : map.entrySet()) {
                if (!first) sb.append(", ");
                first = false;
                sb.append("\"").append(escape(String.valueOf(e.getKey()))).append("\": ");
                sb.append(jsonValue(String.valueOf(e.getValue())));
            }
            sb.append("}");
            return sb.toString();
        }
        return "\"" + escape(String.valueOf(v)) + "\"";
    }

    private static String escape(String s) {
        return s
            .replace("\\", "\\\\")
            .replace("\"", "\\\"")
            .replace("\n", "\\n")
            .replace("\r", "\\r")
            .replace("\t", "\\t");
    }

    private record Node(Object obj, int depth) {}
    private record Candidate(String key, int value, int score) {}
}



