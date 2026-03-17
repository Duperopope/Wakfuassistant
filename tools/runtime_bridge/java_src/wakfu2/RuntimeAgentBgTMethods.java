package wakfu2;

import java.io.IOException;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Invoke every no-arg method on bgT instances and report results that
 * look like kamas values (numeric in range 200k-10M, or String with 5+ digits).
 * Also probe the bgT data Map (ieN/ieO) safely using java.util.HashMap entrySet.
 */
public final class RuntimeAgentBgTMethods {

    public static void premain(String args, Instrumentation inst) { run(args, inst); }
    public static void agentmain(String args, Instrumentation inst) { run(args, inst); }

    private static void run(String rawArgs, Instrumentation inst) {
        String outArg = "logs/realtime/bgt_methods.json";
        long hint = Long.MIN_VALUE;

        if (rawArgs != null) {
            for (String part : rawArgs.split("\\|")) {
                part = part.trim();
                if (part.startsWith("hint=")) {
                    try { hint = Long.parseLong(part.substring(5).replaceAll("[^0-9\\-]", "")); }
                    catch (NumberFormatException ignored) {}
                } else if (!part.isEmpty()) {
                    outArg = part;
                }
            }
        }

        Path outPath = Paths.get(outArg);
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("source", "bgt-methods-probe");
        payload.put("hint", hint == Long.MIN_VALUE ? "none" : hint);
        payload.put("updated_at", Instant.now().getEpochSecond());

        try {
            IdentityHashMap<Object, Boolean> bgTInstances = new IdentityHashMap<>();
            IdentityHashMap<Object, Boolean> findVisited = new IdentityHashMap<>();

            for (Class<?> cls : inst.getAllLoadedClasses()) {
                Field[] staticFields;
                try { staticFields = cls.getDeclaredFields(); }
                catch (Throwable ignored) { continue; }

                for (Field sf : staticFields) {
                    if (!Modifier.isStatic(sf.getModifiers()) || sf.getType().isPrimitive()) continue;
                    Object root;
                    try { sf.setAccessible(true); root = sf.get(null); }
                    catch (Throwable ignored) { continue; }
                    if (root == null) continue;
                    findBgT(root, bgTInstances, findVisited, 0, 10);
                }
            }

            payload.put("bgt_instances_found", bgTInstances.size());

            final long hintFinal = hint;
            List<Map<String, Object>> methodHits = new ArrayList<>();
            List<Map<String, Object>> mapHits = new ArrayList<>();

            for (Object bgT : bgTInstances.keySet()) {
                // Probe all no-arg methods
                probeAllMethods(bgT, hintFinal, methodHits);
                // Probe ieN and ieO maps safely
                probeDataMaps(bgT, hintFinal, mapHits);
            }

            payload.put("status", "ok");
            payload.put("method_hits_count", methodHits.size());
            payload.put("method_hits", methodHits);
            payload.put("map_hits_count", mapHits.size());
            payload.put("map_hits", mapHits);

        } catch (Throwable t) {
            payload.put("status", "error");
            payload.put("error", t.getClass().getName() + ": " + t.getMessage());
        }

        write(outPath, payload);
    }

    private static void probeAllMethods(Object bgT, long hint, List<Map<String, Object>> hits) {
        Class<?> c = bgT.getClass();
        while (c != null && c != Object.class) {
            for (Method m : c.getDeclaredMethods()) {
                if (m.getParameterCount() != 0) continue;
                if (Modifier.isStatic(m.getModifiers())) continue;

                Object result;
                try {
                    m.setAccessible(true);
                    result = m.invoke(bgT);
                } catch (Throwable ignored) { continue; }

                if (result == null) continue;

                boolean interesting = false;
                String display = null;

                if (result instanceof Number n) {
                    long v = n.longValue();
                    interesting = (hint == Long.MIN_VALUE)
                            ? v >= 200_000 && v <= 9_999_999
                            : Math.abs(v - hint) <= 50;
                    display = String.valueOf(v);
                } else if (result instanceof String s) {
                    String digits = s.replaceAll("[^0-9]", "");
                    interesting = digits.length() >= 5
                            && (hint == Long.MIN_VALUE || digits.contains(String.valueOf(hint)));
                    display = s;
                }

                if (interesting) {
                    Map<String, Object> hit = new LinkedHashMap<>();
                    hit.put("class", bgT.getClass().getSimpleName());
                    hit.put("method", m.getName() + "()");
                    hit.put("return_type", m.getReturnType().getSimpleName());
                    hit.put("value", display);
                    hits.add(hit);
                }
            }
            c = c.getSuperclass();
        }
    }

    /** Safely iterate standard java.util.HashMap fields named ieN, ieO on bgT. */
    private static void probeDataMaps(Object bgT, long hint, List<Map<String, Object>> hits) {
        Class<?> c = bgT.getClass();
        while (c != null && c != Object.class) {
            for (Field f : c.getDeclaredFields()) {
                if (Modifier.isStatic(f.getModifiers())) continue;

                Object val;
                try { f.setAccessible(true); val = f.get(bgT); }
                catch (Throwable ignored) { continue; }

                if (!(val instanceof java.util.HashMap)) continue;

                java.util.HashMap<?, ?> map = (java.util.HashMap<?, ?>) val;
                try {
                    for (Map.Entry<?, ?> e : map.entrySet()) {
                        String key = e.getKey() != null ? String.valueOf(e.getKey()) : "";
                        Object v = e.getValue();
                        if (v == null) continue;

                        boolean interesting = false;
                        String display = null;

                        if (v instanceof Number n) {
                            long num = n.longValue();
                            interesting = (hint == Long.MIN_VALUE)
                                    ? num >= 200_000 && num <= 9_999_999
                                    : Math.abs(num - hint) <= 50;
                            display = String.valueOf(num);
                        } else if (v instanceof String s) {
                            String digits = s.replaceAll("[^0-9]", "");
                            interesting = digits.length() >= 5
                                    && (hint == Long.MIN_VALUE || digits.contains(String.valueOf(hint)));
                            display = s;
                        }

                        if (interesting) {
                            Map<String, Object> hit = new LinkedHashMap<>();
                            hit.put("field", f.getName());
                            hit.put("map_key", key);
                            hit.put("value_type", v.getClass().getSimpleName());
                            hit.put("value", display);
                            hits.add(hit);
                        }
                    }
                } catch (Throwable ignored) {}
            }
            c = c.getSuperclass();
        }
    }

    private static void findBgT(Object obj, IdentityHashMap<Object, Boolean> bgTInstances,
                                 IdentityHashMap<Object, Boolean> visited, int depth, int maxDepth) {
        if (obj == null || depth > maxDepth) return;
        if (visited.containsKey(obj)) return;
        visited.put(obj, Boolean.TRUE);

        Class<?> cls = obj.getClass();
        if (isSkippable(cls)) return;

        if ("bgT".equals(cls.getSimpleName())) {
            bgTInstances.put(obj, Boolean.TRUE);
            return;
        }

        Class<?> c = cls;
        while (c != null && c != Object.class) {
            Field[] fields;
            try { fields = c.getDeclaredFields(); }
            catch (Throwable ignored) { c = c.getSuperclass(); continue; }

            for (Field f : fields) {
                if (Modifier.isStatic(f.getModifiers()) || f.getType().isPrimitive()) continue;
                Object child;
                try { f.setAccessible(true); child = f.get(obj); }
                catch (Throwable ignored) { continue; }
                findBgT(child, bgTInstances, visited, depth + 1, maxDepth);
            }
            c = c.getSuperclass();
        }
    }

    private static boolean isSkippable(Class<?> cls) {
        if (cls == null) return true;
        String name = cls.getName();
        return cls.isPrimitive()
            || cls == String.class
            || cls == Boolean.class
            || cls == Character.class
            || Number.class.isAssignableFrom(cls)
            || name.startsWith("java.lang.Class")
            || name.startsWith("java.lang.reflect.")
            || name.startsWith("sun.")
            || name.startsWith("jdk.")
            || name.startsWith("com.sun.");
    }

    private static void write(Path path, Map<String, Object> data) {
        try {
            if (path.getParent() != null) Files.createDirectories(path.getParent());
            Files.writeString(path, toJson(data), StandardCharsets.UTF_8);
        } catch (IOException ignored) {}
    }

    private static String toJson(Object v) {
        if (v == null) return "null";
        if (v instanceof Boolean || v instanceof Number) return String.valueOf(v);
        if (v instanceof Map<?, ?> map) {
            StringBuilder sb = new StringBuilder("{\n");
            boolean first = true;
            for (Map.Entry<?, ?> e : map.entrySet()) {
                if (!first) sb.append(",\n");
                first = false;
                sb.append("  \"").append(esc(String.valueOf(e.getKey()))).append("\": ").append(toJson(e.getValue()));
            }
            return sb.append("\n}").toString();
        }
        if (v instanceof List<?> list) {
            StringBuilder sb = new StringBuilder("[");
            boolean first = true;
            for (Object el : list) {
                if (!first) sb.append(", ");
                first = false;
                sb.append(toJson(el));
            }
            return sb.append("]").toString();
        }
        return "\"" + esc(String.valueOf(v)) + "\"";
    }

    private static String esc(String s) {
        return s.replace("\\", "\\\\").replace("\"", "\\\"")
                .replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    }
}
