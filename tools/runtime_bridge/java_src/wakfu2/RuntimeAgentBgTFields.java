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
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Targeted probe: find all bgT instances, then dump every numeric/string field
 * at depth 1-3 looking for the kamas value (hint ± 10) or the formatted kamas
 * string.  Never iterates collections to avoid NPEs in Wakfu custom code.
 */
public final class RuntimeAgentBgTFields {

    public static void premain(String args, Instrumentation inst) { run(args, inst); }
    public static void agentmain(String args, Instrumentation inst) { run(args, inst); }

    private static void run(String rawArgs, Instrumentation inst) {
        String outArg = "logs/realtime/bgt_fields.json";
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
        payload.put("source", "bgt-fields-probe");
        payload.put("hint", hint == Long.MIN_VALUE ? "none" : hint);
        payload.put("updated_at", Instant.now().getEpochSecond());

        try {
            // Step 1: find bgT instances via pure field traversal (no collections)
            IdentityHashMap<Object, Boolean> bgTInstances = new IdentityHashMap<>();
            IdentityHashMap<Object, Boolean> visited = new IdentityHashMap<>();

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
                    findBgT(root, bgTInstances, visited, 0, 10);
                }
            }

            payload.put("bgt_instances_found", bgTInstances.size());

            // Step 2: for each bgT, dump numeric/string fields recursively (no collection traversal)
            List<Map<String, Object>> hits = new ArrayList<>();
            final long hintFinal = hint;
            for (Object bgT : bgTInstances.keySet()) {
                dumpAllNumericFields(bgT, bgT.getClass().getSimpleName(), hintFinal, hits,
                        new IdentityHashMap<>(), 0, 3);
            }

            payload.put("status", "ok");
            payload.put("hits_count", hits.size());
            payload.put("hits", hits);

        } catch (Throwable t) {
            payload.put("status", "error");
            payload.put("error", t.getClass().getName() + ": " + t.getMessage());
        }

        write(outPath, payload);
    }

    /** Traverse pure object field graph (no Iterable/Map/array traversal) to find bgT instances. */
    private static void findBgT(Object obj, IdentityHashMap<Object, Boolean> bgTInstances,
                                 IdentityHashMap<Object, Boolean> visited, int depth, int maxDepth) {
        if (obj == null || depth > maxDepth) return;
        if (visited.containsKey(obj)) return;
        visited.put(obj, Boolean.TRUE);

        Class<?> cls = obj.getClass();
        if (isLeafType(cls)) return;

        if ("bgT".equals(cls.getSimpleName())) {
            bgTInstances.put(obj, Boolean.TRUE);
            return;
        }

        // Only recurse via declared instance fields (no collection traversal)
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

    /**
     * Recursively dump numeric and string fields of obj, reporting any that match the hint.
     * Never traverses Iterable or Map implementations to avoid NPEs.
     */
    private static void dumpAllNumericFields(Object obj, String path, long hint,
                                              List<Map<String, Object>> hits,
                                              IdentityHashMap<Object, Boolean> visited,
                                              int depth, int maxDepth) {
        if (obj == null || depth > maxDepth) return;
        if (visited.containsKey(obj)) return;
        visited.put(obj, Boolean.TRUE);

        Class<?> cls = obj.getClass();
        if (isLeafType(cls)) return;

        // Walk the full class hierarchy for fields
        Class<?> c = cls;
        while (c != null && c != Object.class) {
            Field[] fields;
            try { fields = c.getDeclaredFields(); }
            catch (Throwable ignored) { c = c.getSuperclass(); continue; }

            for (Field f : fields) {
                String fpath = path + "." + f.getName();
                boolean isStatic = Modifier.isStatic(f.getModifiers());
                Object target = isStatic ? null : obj;

                if (f.getType().isPrimitive()) {
                    try {
                        f.setAccessible(true);
                        Class<?> t = f.getType();
                        long v;
                        if (t == int.class)        v = f.getInt(target);
                        else if (t == long.class)   v = f.getLong(target);
                        else if (t == short.class)  v = f.getShort(target);
                        else continue;

                        if (matchesHint(v, hint)) {
                            Map<String, Object> hit = new LinkedHashMap<>();
                            hit.put("path", fpath);
                            hit.put("type", t.getName());
                            hit.put("value", v);
                            hit.put("diff", hint == Long.MIN_VALUE ? 0 : Math.abs(v - hint));
                            hits.add(hit);
                        }
                    } catch (Throwable ignored) {}
                    continue;
                }

                Object child;
                try { f.setAccessible(true); child = f.get(target); }
                catch (Throwable ignored) { continue; }
                if (child == null) continue;

                if (child instanceof Number n) {
                    long v = n.longValue();
                    if (matchesHint(v, hint)) {
                        Map<String, Object> hit = new LinkedHashMap<>();
                        hit.put("path", fpath);
                        hit.put("type", child.getClass().getSimpleName());
                        hit.put("value", v);
                        hit.put("diff", hint == Long.MIN_VALUE ? 0 : Math.abs(v - hint));
                        hits.add(hit);
                    }
                    continue;
                }

                if (child instanceof String s) {
                    // Report strings that look like they contain the kamas value
                    if (hint != Long.MIN_VALUE && s.replaceAll("[^0-9]", "").contains(String.valueOf(hint))) {
                        Map<String, Object> hit = new LinkedHashMap<>();
                        hit.put("path", fpath);
                        hit.put("type", "String");
                        hit.put("value", s);
                        hit.put("diff", 0);
                        hits.add(hit);
                    }
                    continue;
                }

                // Skip Iterable and Map to avoid NPEs — recurse only into plain objects
                if (child instanceof Iterable<?> || child instanceof Map<?, ?>) continue;
                if (isLeafType(child.getClass())) continue;

                dumpAllNumericFields(child, fpath, hint, hits, visited, depth + 1, maxDepth);
            }
            c = c.getSuperclass();
        }
    }

    private static boolean matchesHint(long v, long hint) {
        if (hint == Long.MIN_VALUE) return v > 50_000 && v < 100_000_000L;
        return Math.abs(v - hint) <= 10;
    }

    private static boolean isLeafType(Class<?> cls) {
        String name = cls.getName();
        return cls.isPrimitive()
            || cls == String.class
            || cls == Boolean.class
            || cls == Character.class
            || Number.class.isAssignableFrom(cls)
            || name.startsWith("java.lang.Class")
            || name.startsWith("java.lang.reflect.")
            || name.startsWith("sun.")
            || name.startsWith("jdk.");
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
