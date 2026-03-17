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
 * Find instances of bsT (bags/inventory ViewModel), then:
 *  - dump all primitive fields (int/long/float/double) for any value >= 200k
 *  - safely iterate any java.util.HashMap fields
 *  - call all no-arg methods
 *  - recurse 3 levels into child objects
 *  - report class name of every found instance
 */
public final class RuntimeAgentInventoryProbe {

    public static void premain(String args, Instrumentation inst) { run(args, inst); }
    public static void agentmain(String args, Instrumentation inst) { run(args, inst); }

    private static void run(String rawArgs, Instrumentation inst) {
        String outArg = "logs/realtime/inventory_probe.json";
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
        payload.put("source", "inventory-probe");
        payload.put("hint", hint == Long.MIN_VALUE ? "none" : hint);
        payload.put("updated_at", Instant.now().getEpochSecond());

        try {
            // Find all bsT instances (inventory ViewModel)
            IdentityHashMap<Object, Boolean> bsTInstances = new IdentityHashMap<>();
            IdentityHashMap<Object, Boolean> findVisited = new IdentityHashMap<>();

            for (Class<?> cls : inst.getAllLoadedClasses()) {
                Field[] sf;
                try { sf = cls.getDeclaredFields(); } catch (Throwable ignored) { continue; }
                for (Field f : sf) {
                    if (!Modifier.isStatic(f.getModifiers()) || f.getType().isPrimitive()) continue;
                    Object root;
                    try { f.setAccessible(true); root = f.get(null); } catch (Throwable ignored) { continue; }
                    if (root == null) continue;
                    findClass(root, "bsT", bsTInstances, findVisited, 0, 10);
                }
            }

            payload.put("bsT_instances_found", bsTInstances.size());

            final long hintFinal = hint;
            List<Map<String, Object>> allHits = new ArrayList<>();

            for (Object bsT : bsTInstances.keySet()) {
                Map<String, Object> entry = new LinkedHashMap<>();
                entry.put("class", bsT.getClass().getName());
                List<Map<String, Object>> hits = new ArrayList<>();

                // Dump fields recursively (depth 3), all numeric types + safe HashMap
                dumpFields(bsT, "bsT", hintFinal, hits, new IdentityHashMap<>(), 0, 3);

                // Call all no-arg methods
                probeMethods(bsT, "bsT", hintFinal, hits);

                if (!hits.isEmpty()) {
                    entry.put("hits", hits);
                    allHits.add(entry);
                }
            }

            payload.put("status", "ok");
            payload.put("hits_total", allHits.size());
            payload.put("hits", allHits);

        } catch (Throwable t) {
            payload.put("status", "error");
            payload.put("error", t.getClass().getName() + ": " + t.getMessage());
        }

        write(outPath, payload);
    }

    private static void findClass(Object obj, String targetSimpleName,
                                   IdentityHashMap<Object, Boolean> targets,
                                   IdentityHashMap<Object, Boolean> visited,
                                   int depth, int maxDepth) {
        if (obj == null || depth > maxDepth) return;
        if (visited.containsKey(obj)) return;
        visited.put(obj, Boolean.TRUE);

        Class<?> cls = obj.getClass();
        if (isSkippable(cls)) return;

        if (targetSimpleName.equals(cls.getSimpleName())) {
            targets.put(obj, Boolean.TRUE);
            return;
        }

        Class<?> c = cls;
        while (c != null && c != Object.class) {
            Field[] fields;
            try { fields = c.getDeclaredFields(); } catch (Throwable ignored) { c = c.getSuperclass(); continue; }
            for (Field f : fields) {
                if (Modifier.isStatic(f.getModifiers()) || f.getType().isPrimitive()) continue;
                Object child;
                try { f.setAccessible(true); child = f.get(obj); } catch (Throwable ignored) { continue; }
                if (child == null || child instanceof Iterable<?> || child instanceof Map<?, ?>) continue;
                findClass(child, targetSimpleName, targets, visited, depth + 1, maxDepth);
            }
            c = c.getSuperclass();
        }
    }

    private static void dumpFields(Object obj, String path, long hint,
                                    List<Map<String, Object>> hits,
                                    IdentityHashMap<Object, Boolean> visited,
                                    int depth, int maxDepth) {
        if (obj == null || depth > maxDepth) return;
        if (visited.containsKey(obj)) return;
        visited.put(obj, Boolean.TRUE);

        Class<?> cls = obj.getClass();
        if (isSkippable(cls)) return;

        Class<?> c = cls;
        while (c != null && c != Object.class) {
            Field[] fields;
            try { fields = c.getDeclaredFields(); } catch (Throwable ignored) { c = c.getSuperclass(); continue; }

            for (Field f : fields) {
                boolean isStatic = Modifier.isStatic(f.getModifiers());
                Object target = isStatic ? null : obj;
                String fpath = path + "." + f.getName() + "(" + f.getType().getSimpleName() + ")";

                if (f.getType().isPrimitive()) {
                    try {
                        f.setAccessible(true);
                        Class<?> t = f.getType();
                        double v;
                        if (t == int.class)        v = f.getInt(target);
                        else if (t == long.class)   v = f.getLong(target);
                        else if (t == float.class)  v = f.getFloat(target);
                        else if (t == double.class) v = f.getDouble(target);
                        else continue;

                        boolean match = hint != Long.MIN_VALUE
                                ? Math.abs(v - hint) <= 100
                                : v >= 200_000 && v <= 9_999_999;

                        if (match) {
                            Map<String, Object> h = new LinkedHashMap<>();
                            h.put("path", fpath);
                            h.put("value", (long) v);
                            hits.add(h);
                        }
                    } catch (Throwable ignored) {}
                    continue;
                }

                Object child;
                try { f.setAccessible(true); child = f.get(target); } catch (Throwable ignored) { continue; }
                if (child == null) continue;

                if (child instanceof Number n) {
                    double v = n.doubleValue();
                    boolean match = hint != Long.MIN_VALUE
                            ? Math.abs(v - hint) <= 100
                            : v >= 200_000 && v <= 9_999_999;
                    if (match) {
                        Map<String, Object> h = new LinkedHashMap<>();
                        h.put("path", fpath);
                        h.put("type", child.getClass().getSimpleName());
                        h.put("value", n.longValue());
                        hits.add(h);
                    }
                    continue;
                }

                if (child instanceof String s) {
                    String digits = s.replaceAll("[^0-9]", "");
                    boolean match = digits.length() >= 5
                            && (hint == Long.MIN_VALUE || digits.contains(String.valueOf(hint)));
                    if (match) {
                        Map<String, Object> h = new LinkedHashMap<>();
                        h.put("path", fpath);
                        h.put("type", "String");
                        h.put("value", s);
                        hits.add(h);
                    }
                    continue;
                }

                // Safely iterate java.util.HashMap only
                if (child.getClass() == java.util.HashMap.class) {
                    try {
                        for (Map.Entry<?, ?> e : ((java.util.HashMap<?, ?>) child).entrySet()) {
                            Object v = e.getValue();
                            if (v instanceof Number n) {
                                double dv = n.doubleValue();
                                boolean match = hint != Long.MIN_VALUE
                                        ? Math.abs(dv - hint) <= 100
                                        : dv >= 200_000 && dv <= 9_999_999;
                                if (match) {
                                    Map<String, Object> h = new LinkedHashMap<>();
                                    h.put("path", fpath + "{" + e.getKey() + "}");
                                    h.put("type", v.getClass().getSimpleName());
                                    h.put("value", n.longValue());
                                    hits.add(h);
                                }
                            }
                        }
                    } catch (Throwable ignored) {}
                    continue;
                }

                if (child instanceof Iterable<?> || child instanceof Map<?, ?>) continue;
                if (isSkippable(child.getClass())) continue;

                dumpFields(child, fpath, hint, hits, visited, depth + 1, maxDepth);
            }
            c = c.getSuperclass();
        }
    }

    private static void probeMethods(Object obj, String path, long hint, List<Map<String, Object>> hits) {
        Class<?> c = obj.getClass();
        while (c != null && c != Object.class) {
            for (Method m : c.getDeclaredMethods()) {
                if (m.getParameterCount() != 0 || Modifier.isStatic(m.getModifiers())) continue;
                if (m.getReturnType() == void.class) continue;

                Object result;
                try { m.setAccessible(true); result = m.invoke(obj); } catch (Throwable ignored) { continue; }
                if (result == null) continue;

                if (result instanceof Number n) {
                    double v = n.doubleValue();
                    boolean match = hint != Long.MIN_VALUE
                            ? Math.abs(v - hint) <= 100
                            : v >= 200_000 && v <= 9_999_999;
                    if (match) {
                        Map<String, Object> h = new LinkedHashMap<>();
                        h.put("path", path + "." + m.getName() + "()");
                        h.put("type", result.getClass().getSimpleName());
                        h.put("value", n.longValue());
                        hits.add(h);
                    }
                } else if (result instanceof String s) {
                    String digits = s.replaceAll("[^0-9]", "");
                    boolean match = digits.length() >= 5
                            && (hint == Long.MIN_VALUE || digits.contains(String.valueOf(hint)));
                    if (match) {
                        Map<String, Object> h = new LinkedHashMap<>();
                        h.put("path", path + "." + m.getName() + "()");
                        h.put("type", "String");
                        h.put("value", s);
                        hits.add(h);
                    }
                }
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
