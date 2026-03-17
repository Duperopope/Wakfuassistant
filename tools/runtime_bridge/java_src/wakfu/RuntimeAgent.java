package wakfu;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.ArrayDeque;
import java.util.ArrayList;
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
import java.lang.instrument.Instrumentation;

public final class RuntimeAgent {
    private static final Set<String> TARGET_KEYS = new HashSet<>();

    static {
        TARGET_KEYS.add("currentExperience");
        TARGET_KEYS.add("currentLevelPercentage");
        TARGET_KEYS.add("currentLevelPercentageInText");
        TARGET_KEYS.add("hpPercentage");
        TARGET_KEYS.add("APShort");
        TARGET_KEYS.add("MPShort");
        TARGET_KEYS.add("WPShort");
        TARGET_KEYS.add("characteristics");
        TARGET_KEYS.add("kama");
        TARGET_KEYS.add("money");
        TARGET_KEYS.add("wallet");
    }

    private static ScheduledExecutorService scheduler;

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
        final Path outPath = resolveOutput(agentArgs);
        scheduler = Executors.newSingleThreadScheduledExecutor(r -> {
            Thread t = new Thread(r, "wakfu-runtime-bridge");
            t.setDaemon(true);
            return t;
        });

        scheduler.scheduleAtFixedRate(() -> {
            try {
                Map<String, Object> data = scanRuntime(inst);
                writeJson(outPath, data);
            } catch (Throwable t) {
                Map<String, Object> err = new HashMap<>();
                err.put("source", "runtime-agent");
                err.put("status", "error");
                err.put("error", String.valueOf(t.getClass().getName()) + ": " + String.valueOf(t.getMessage()));
                err.put("updated_at", Instant.now().getEpochSecond());
                writeJson(outPath, err);
            }
        }, 0, 1500, TimeUnit.MILLISECONDS);
    }

    private static Path resolveOutput(String agentArgs) {
        if (agentArgs == null || agentArgs.trim().isEmpty()) {
            return Paths.get("logs", "realtime", "interface_state.json");
        }
        return Paths.get(agentArgs.trim());
    }

    private static Map<String, Object> scanRuntime(Instrumentation inst) {
        Map<String, Object> payload = new HashMap<>();
        payload.put("source", "runtime-agent");
        payload.put("status", "ok");
        payload.put("updated_at", Instant.now().getEpochSecond());

        Map<String, Object> extracted = new HashMap<>();
        int classesScanned = 0;
        int mapsSeen = 0;

        Class<?>[] classes = inst.getAllLoadedClasses();
        for (Class<?> cls : classes) {
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

                mapsSeen += scanObject(value, extracted, 2);
            }
        }

        payload.put("classes_scanned", classesScanned);
        payload.put("maps_seen", mapsSeen);
        payload.put("matches", extracted);

        Object levelPct = extracted.get("currentLevelPercentage");
        Object xpCur = extracted.get("currentExperience");
        Object hpPct = extracted.get("hpPercentage");
        if (levelPct != null) {
            payload.put("currentLevelPercentage", String.valueOf(levelPct));
        }
        if (xpCur != null) {
            payload.put("currentExperience", String.valueOf(xpCur));
        }
        if (hpPct != null) {
            payload.put("hp_percent", parseIntSafe(hpPct));
        }

        Object ap = extracted.get("APShort");
        Object mp = extracted.get("MPShort");
        Object wp = extracted.get("WPShort");
        if (ap != null) payload.put("ap", parseIntSafe(ap));
        if (mp != null) payload.put("mp", parseIntSafe(mp));
        if (wp != null) payload.put("wp", parseIntSafe(wp));

        Object kama = firstByContains(extracted, "kama");
        if (kama != null) {
            Integer parsed = parseIntSafe(kama);
            if (parsed != null) {
                payload.put("kamas_total", parsed);
            }
        }

        return payload;
    }

    private static int scanObject(Object root, Map<String, Object> extracted, int maxDepth) {
        if (root == null) {
            return 0;
        }

        int mapsSeen = 0;
        IdentityHashMap<Object, Boolean> visited = new IdentityHashMap<>();
        Deque<Node> dq = new ArrayDeque<>();
        dq.add(new Node(root, 0));

        while (!dq.isEmpty()) {
            Node n = dq.removeFirst();
            if (n.obj == null) {
                continue;
            }
            if (visited.containsKey(n.obj)) {
                continue;
            }
            visited.put(n.obj, Boolean.TRUE);

            Class<?> c = n.obj.getClass();
            if (isLeafType(c)) {
                continue;
            }

            if (n.obj instanceof Map<?, ?> map) {
                mapsSeen++;
                int count = 0;
                for (Map.Entry<?, ?> e : map.entrySet()) {
                    if (++count > 400) {
                        break;
                    }
                    String key = String.valueOf(e.getKey());
                    String lower = key.toLowerCase();
                    for (String target : TARGET_KEYS) {
                        String t = target.toLowerCase();
                        if (lower.contains(t) && e.getValue() != null) {
                            extracted.putIfAbsent(target, e.getValue());
                        }
                    }
                }
            }

            if (n.depth >= maxDepth) {
                continue;
            }

            Field[] fields;
            try {
                fields = c.getDeclaredFields();
            } catch (Throwable ignored) {
                continue;
            }

            for (Field f : fields) {
                if (f.getType().isPrimitive()) {
                    continue;
                }
                Object child;
                try {
                    f.setAccessible(true);
                    child = f.get(n.obj);
                } catch (Throwable ignored) {
                    continue;
                }
                if (child == null) {
                    continue;
                }
                dq.addLast(new Node(child, n.depth + 1));
            }
        }

        return mapsSeen;
    }

    private static Object firstByContains(Map<String, Object> map, String token) {
        String low = token.toLowerCase();
        for (Map.Entry<String, Object> e : map.entrySet()) {
            if (e.getKey().toLowerCase().contains(low)) {
                return e.getValue();
            }
        }
        return null;
    }

    private static Integer parseIntSafe(Object value) {
        String raw = String.valueOf(value);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < raw.length(); i++) {
            char ch = raw.charAt(i);
            if (Character.isDigit(ch)) {
                sb.append(ch);
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException ex) {
            return null;
        }
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
            if (i < keys.size() - 1) {
                sb.append(',');
            }
            sb.append('\n');
        }
        sb.append("}\n");
        return sb.toString();
    }

    private static String jsonValue(Object v) {
        if (v == null) {
            return "null";
        }
        if (v instanceof Number || v instanceof Boolean) {
            return String.valueOf(v);
        }
        if (v instanceof Map<?, ?> map) {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            boolean first = true;
            for (Map.Entry<?, ?> e : map.entrySet()) {
                if (!first) {
                    sb.append(", ");
                }
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
}
