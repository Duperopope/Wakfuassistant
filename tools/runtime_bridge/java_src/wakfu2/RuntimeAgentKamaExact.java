package wakfu2;

import java.io.IOException;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.Field;
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
 * One-shot probe: find every field in every bgT instance whose numeric value
 * matches the supplied hint (±200).  Outputs a compact JSON to the given path.
 *
 * Usage: --hint=576869 --out=logs/realtime/kama_exact.json
 */
public final class RuntimeAgentKamaExact {

    public static void premain(String args, Instrumentation inst) { run(args, inst); }
    public static void agentmain(String args, Instrumentation inst) { run(args, inst); }

    private static void run(String rawArgs, Instrumentation inst) {
        String outArg = "logs/realtime/kama_exact.json";
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
        payload.put("source", "kama-exact-probe");
        payload.put("hint", hint == Long.MIN_VALUE ? "none" : hint);
        payload.put("updated_at", Instant.now().getEpochSecond());

        try {
            List<Map<String, Object>> hits = scan(inst, hint);
            payload.put("status", "ok");
            payload.put("hits_count", hits.size());
            payload.put("hits", hits);
        } catch (Throwable t) {
            payload.put("status", "error");
            payload.put("error", t.getClass().getName() + ": " + t.getMessage());
        }

        write(outPath, payload);
    }

    /** Walk from every static field root; collect all bgT instances. */
    private static List<Map<String, Object>> scan(Instrumentation inst, long hint) {
        // Step 1 – collect bgT instances reachable from any static field
        IdentityHashMap<Object, Boolean> bgTInstances = new IdentityHashMap<>();
        IdentityHashMap<Object, Boolean> globalVisited = new IdentityHashMap<>();

        for (Class<?> cls : inst.getAllLoadedClasses()) {
            Field[] fields;
            try { fields = cls.getDeclaredFields(); }
            catch (Throwable ignored) { continue; }

            for (Field f : fields) {
                if (!isStaticField(f)) continue;
                Object root;
                try { f.setAccessible(true); root = f.get(null); }
                catch (Throwable ignored) { continue; }
                if (root == null) continue;
                collectBgT(root, bgTInstances, globalVisited, 0, 8);
            }
        }

        // Step 2 – for each bgT instance, dump all numeric fields
        List<Map<String, Object>> hits = new ArrayList<>();
        for (Object bgT : bgTInstances.keySet()) {
            dumpFields(bgT, hint, "", hits, new IdentityHashMap<>(), 0, 3);
        }

        return hits;
    }

    private static void collectBgT(Object obj, IdentityHashMap<Object, Boolean> bgTInstances,
                                    IdentityHashMap<Object, Boolean> visited, int depth, int maxDepth) {
        if (obj == null || depth > maxDepth) return;
        if (visited.containsKey(obj)) return;
        visited.put(obj, Boolean.TRUE);

        Class<?> cls = obj.getClass();
        if (isLeaf(cls)) return;

        if ("bgT".equals(cls.getSimpleName())) {
            bgTInstances.put(obj, Boolean.TRUE);
            return; // no need to recurse inside yet
        }

        // Recurse into instance fields
        Field[] fields;
        try { fields = cls.getDeclaredFields(); }
        catch (Throwable ignored) { return; }

        for (Field f : fields) {
            if (isStaticField(f)) continue;
            if (f.getType().isPrimitive()) continue;
            Object child;
            try { f.setAccessible(true); child = f.get(obj); }
            catch (Throwable ignored) { continue; }
            collectBgT(child, bgTInstances, visited, depth + 1, maxDepth);
        }

        // Also recurse into arrays/collections briefly
        if (obj instanceof Iterable<?> it) {
            int cnt = 0;
            for (Object el : it) {
                if (++cnt > 50) break;
                collectBgT(el, bgTInstances, visited, depth + 1, maxDepth);
            }
        }
    }

    private static void dumpFields(Object obj, long hint, String path,
                                    List<Map<String, Object>> hits,
                                    IdentityHashMap<Object, Boolean> visited,
                                    int depth, int maxDepth) {
        if (obj == null || depth > maxDepth) return;
        if (visited.containsKey(obj)) return;
        visited.put(obj, Boolean.TRUE);

        Class<?> cls = obj.getClass();
        if (isLeaf(cls)) return;

        Field[] fields;
        try { fields = cls.getDeclaredFields(); }
        catch (Throwable ignored) { return; }

        for (Field f : fields) {
            Object value;
            try { f.setAccessible(true); value = f.get(isStaticField(f) ? null : obj); }
            catch (Throwable ignored) { continue; }

            String fieldPath = path.isEmpty()
                    ? cls.getSimpleName() + "." + f.getName()
                    : path + "." + f.getName();

            if (value instanceof Number n) {
                long v = n.longValue();
                if (hint != Long.MIN_VALUE) {
                    long diff = Math.abs(v - hint);
                    if (diff <= 200 && v > 0) {
                        Map<String, Object> hit = new LinkedHashMap<>();
                        hit.put("path", fieldPath);
                        hit.put("type", value.getClass().getSimpleName());
                        hit.put("value", v);
                        hit.put("diff", diff);
                        hits.add(hit);
                    }
                } else if (v > 10_000 && v < 1_000_000_000L) {
                    // no hint: report anything plausible
                    Map<String, Object> hit = new LinkedHashMap<>();
                    hit.put("path", fieldPath);
                    hit.put("type", value.getClass().getSimpleName());
                    hit.put("value", v);
                    hits.add(hit);
                }
            } else if (f.getType() == long.class || f.getType() == int.class) {
                // primitive already boxed above via f.get()
            } else if (value != null && !isLeaf(value.getClass())) {
                dumpFields(value, hint, fieldPath, hits, visited, depth + 1, maxDepth);
            }
        }
    }

    private static boolean isStaticField(Field f) {
        return java.lang.reflect.Modifier.isStatic(f.getModifiers());
    }

    private static boolean isLeaf(Class<?> cls) {
        return cls.isPrimitive()
                || cls == String.class
                || cls == Boolean.class
                || cls == Character.class
                || cls.getName().startsWith("java.time.")
                || cls.getName().startsWith("java.lang.Class")
                || cls.isArray() && cls.getComponentType().isPrimitive();
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
