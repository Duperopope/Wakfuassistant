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
import java.util.Deque;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Brute-force heap scan: walk every object reachable from static roots,
 * report every field whose int/long value matches the hint exactly.
 *
 * Usage: --out=<path> --hint=576869
 */
public final class RuntimeAgentHeapScan {

    public static void premain(String args, Instrumentation inst) { run(args, inst); }
    public static void agentmain(String args, Instrumentation inst) { run(args, inst); }

    private static void run(String rawArgs, Instrumentation inst) {
        String outArg = "logs/realtime/heap_scan.json";
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
        payload.put("source", "heap-scan");
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

    private static List<Map<String, Object>> scan(Instrumentation inst, long hint) {
        IdentityHashMap<Object, Boolean> visited = new IdentityHashMap<>();
        Deque<Object[]> queue = new ArrayDeque<>(); // [object, pathString]
        List<Map<String, Object>> hits = new ArrayList<>();

        // Seed the queue with all static field values
        for (Class<?> cls : inst.getAllLoadedClasses()) {
            Field[] fields;
            try { fields = cls.getDeclaredFields(); }
            catch (Throwable ignored) { continue; }

            for (Field f : fields) {
                if (!Modifier.isStatic(f.getModifiers())) continue;
                if (f.getType().isPrimitive()) {
                    // Check static primitive fields directly
                    checkPrimitiveField(f, null, cls.getName() + "." + f.getName(), hint, hits);
                    continue;
                }
                Object val;
                try { f.setAccessible(true); val = f.get(null); }
                catch (Throwable ignored) { continue; }
                if (val == null || visited.containsKey(val)) continue;
                visited.put(val, Boolean.TRUE);
                queue.add(new Object[]{val, cls.getName() + "." + f.getName()});
            }
        }

        // BFS
        while (!queue.isEmpty() && hits.size() < 200) {
            Object[] node = queue.removeFirst();
            Object obj = node[0];
            String path = (String) node[1];

            Class<?> cls = obj.getClass();
            if (isUninteresting(cls)) continue;

            // Iterate all fields including superclass chain
            Class<?> c = cls;
            while (c != null && c != Object.class) {
                Field[] fields;
                try { fields = c.getDeclaredFields(); }
                catch (Throwable ignored) { c = c.getSuperclass(); continue; }

                for (Field f : fields) {
                    boolean isStatic = Modifier.isStatic(f.getModifiers());
                    String fieldPath = path + "." + f.getName();

                    if (f.getType().isPrimitive()) {
                        checkPrimitiveField(f, isStatic ? null : obj, fieldPath, hint, hits);
                        continue;
                    }

                    Object child;
                    try {
                        f.setAccessible(true);
                        child = f.get(isStatic ? null : obj);
                    } catch (Throwable ignored) { continue; }

                    if (child == null) continue;

                    // Check boxed numbers inline
                    if (child instanceof Number n) {
                        long v = n.longValue();
                        if (matchesHint(v, hint)) {
                            Map<String, Object> hit = new LinkedHashMap<>();
                            hit.put("path", fieldPath);
                            hit.put("type", child.getClass().getSimpleName());
                            hit.put("value", v);
                            hit.put("diff", Math.abs(v - hint));
                            hits.add(hit);
                        }
                        continue;
                    }

                    if (visited.containsKey(child)) continue;
                    if (isUninteresting(child.getClass())) continue;
                    visited.put(child, Boolean.TRUE);
                    queue.add(new Object[]{child, fieldPath});
                }
                c = c.getSuperclass();
            }

            // Handle collections/arrays element traversal
            if (obj instanceof Iterable<?> it) {
                try {
                    int cnt = 0;
                    for (Object el : it) {
                        if (++cnt > 100 || el == null) continue;
                        if (el instanceof Number n) {
                            long v = n.longValue();
                            if (matchesHint(v, hint)) {
                                Map<String, Object> hit = new LinkedHashMap<>();
                                hit.put("path", path + "[" + cnt + "]");
                                hit.put("type", el.getClass().getSimpleName());
                                hit.put("value", v);
                                hit.put("diff", 0L);
                                hits.add(hit);
                            }
                            continue;
                        }
                        if (visited.containsKey(el)) continue;
                        if (isUninteresting(el.getClass())) continue;
                        visited.put(el, Boolean.TRUE);
                        queue.add(new Object[]{el, path + "[" + cnt + "]"});
                    }
                } catch (Throwable ignored) {}
            }

            if (obj instanceof Map<?, ?> map) {
                try {
                int cnt = 0;
                for (Map.Entry<?, ?> e : map.entrySet()) {
                    if (++cnt > 200) break;
                    Object val = e.getValue();
                    if (val == null) continue;
                    String entryPath = path + "{" + e.getKey() + "}";
                    if (val instanceof Number n) {
                        long v = n.longValue();
                        if (matchesHint(v, hint)) {
                            Map<String, Object> hit = new LinkedHashMap<>();
                            hit.put("path", entryPath);
                            hit.put("type", val.getClass().getSimpleName());
                            hit.put("value", v);
                            hit.put("diff", Math.abs(v - hint));
                            hits.add(hit);
                        }
                        continue;
                    }
                    if (visited.containsKey(val)) continue;
                    if (isUninteresting(val.getClass())) continue;
                    visited.put(val, Boolean.TRUE);
                    queue.add(new Object[]{val, entryPath});
                }
                } catch (Throwable ignored) {}
            }
        }

        return hits;
    }

    private static void checkPrimitiveField(Field f, Object obj, String path, long hint, List<Map<String, Object>> hits) {
        try {
            f.setAccessible(true);
            long v;
            Class<?> t = f.getType();
            if (t == int.class)    v = f.getInt(obj);
            else if (t == long.class)  v = f.getLong(obj);
            else if (t == short.class) v = f.getShort(obj);
            else return;

            if (matchesHint(v, hint)) {
                Map<String, Object> hit = new LinkedHashMap<>();
                hit.put("path", path);
                hit.put("type", t.getName());
                hit.put("value", v);
                hit.put("diff", Math.abs(v - hint));
                hits.add(hit);
            }
        } catch (Throwable ignored) {}
    }

    private static boolean matchesHint(long v, long hint) {
        if (hint == Long.MIN_VALUE) return v > 50_000 && v < 100_000_000L;
        return Math.abs(v - hint) <= 5;
    }

    private static boolean isUninteresting(Class<?> cls) {
        if (cls == null) return true;
        String name = cls.getName();
        return name.startsWith("java.lang.Class")
            || name.startsWith("java.lang.reflect.")
            || name.startsWith("sun.")
            || name.startsWith("jdk.")
            || name.startsWith("com.sun.")
            || name.equals("java.lang.String")
            || name.equals("java.lang.Boolean")
            || name.equals("java.lang.Character")
            || (name.startsWith("java.") && !name.startsWith("java.util."));
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
