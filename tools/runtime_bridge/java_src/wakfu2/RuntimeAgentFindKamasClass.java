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
 * Find every class instance that has a String field whose value is "kamas"
 * or "formatedKamas" (observable property keys), then dump their methods
 * and fields looking for the actual 576869 kamas numeric value.
 *
 * Also searches for any String field containing "576 869" or "576869".
 */
public final class RuntimeAgentFindKamasClass {

    public static void premain(String args, Instrumentation inst) { run(args, inst); }
    public static void agentmain(String args, Instrumentation inst) { run(args, inst); }

    private static void run(String rawArgs, Instrumentation inst) {
        String outArg = "logs/realtime/find_kamas_class.json";
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
        payload.put("source", "find-kamas-class");
        payload.put("hint", hint == Long.MIN_VALUE ? "none" : hint);
        payload.put("updated_at", Instant.now().getEpochSecond());

        try {
            // Phase 1: find all instances that have a field == "kamas" or "formatedKamas"
            IdentityHashMap<Object, Boolean> kamasViewModels = new IdentityHashMap<>();
            IdentityHashMap<Object, Boolean> findVisited = new IdentityHashMap<>();

            for (Class<?> cls : inst.getAllLoadedClasses()) {
                Field[] sf;
                try { sf = cls.getDeclaredFields(); } catch (Throwable ignored) { continue; }
                for (Field f : sf) {
                    if (!Modifier.isStatic(f.getModifiers()) || f.getType().isPrimitive()) continue;
                    Object root;
                    try { f.setAccessible(true); root = f.get(null); } catch (Throwable ignored) { continue; }
                    if (root == null) continue;
                    findKamasViewModels(root, kamasViewModels, findVisited, 0, 8);
                }
            }

            payload.put("kamas_viewmodels_found", kamasViewModels.size());

            final long hintFinal = hint;
            List<Map<String, Object>> classResults = new ArrayList<>();

            // Phase 2: for each, call all methods + dump numeric fields + search formatted string
            for (Object vm : kamasViewModels.keySet()) {
                Map<String, Object> entry = new LinkedHashMap<>();
                entry.put("class", vm.getClass().getSimpleName());
                List<Map<String, Object>> interesting = new ArrayList<>();

                // Methods
                probeAllMethods(vm, hintFinal, interesting);

                // Fields (direct, no recursion)
                dumpNumericFields(vm, hintFinal, interesting);

                if (!interesting.isEmpty()) {
                    entry.put("hits", interesting);
                    classResults.add(entry);
                }
            }

            payload.put("status", "ok");
            payload.put("results_count", classResults.size());
            payload.put("results", classResults);

        } catch (Throwable t) {
            payload.put("status", "error");
            payload.put("error", t.getClass().getName() + ": " + t.getMessage());
        }

        write(outPath, payload);
    }

    /**
     * Traverse the object graph looking for instances where any String field
     * has value "kamas", "formatedKamas", "bags", or where any String field
     * contains "576" (formatted kamas hint).
     */
    private static void findKamasViewModels(Object obj, IdentityHashMap<Object, Boolean> targets,
                                             IdentityHashMap<Object, Boolean> visited,
                                             int depth, int maxDepth) {
        if (obj == null || depth > maxDepth) return;
        if (visited.containsKey(obj)) return;
        visited.put(obj, Boolean.TRUE);

        Class<?> cls = obj.getClass();
        if (isSkippable(cls)) return;

        boolean isTarget = false;
        Class<?> c = cls;
        outer:
        while (c != null && c != Object.class) {
            Field[] fields;
            try { fields = c.getDeclaredFields(); } catch (Throwable ignored) { c = c.getSuperclass(); continue; }
            for (Field f : fields) {
                if (f.getType() != String.class) continue;
                Object val;
                try { f.setAccessible(true); val = f.get(Modifier.isStatic(f.getModifiers()) ? null : obj); }
                catch (Throwable ignored) { continue; }
                if (!(val instanceof String s)) continue;
                // Match known kamas-related keys
                if ("kamas".equals(s) || "formatedKamas".equals(s) || "bags".equals(s)) {
                    isTarget = true;
                    break outer;
                }
                // OR: a string field literally containing the formatted kamas
                if (s.contains("576") && s.length() <= 15 && s.replaceAll("[^0-9]", "").length() >= 5) {
                    isTarget = true;
                    break outer;
                }
            }
            c = c.getSuperclass();
        }

        if (isTarget) {
            targets.put(obj, Boolean.TRUE);
        }

        // Recurse into non-primitive, non-skippable, non-Iterable, non-Map children
        c = cls;
        while (c != null && c != Object.class) {
            Field[] fields;
            try { fields = c.getDeclaredFields(); } catch (Throwable ignored) { c = c.getSuperclass(); continue; }
            for (Field f : fields) {
                if (Modifier.isStatic(f.getModifiers()) || f.getType().isPrimitive()) continue;
                Object child;
                try { f.setAccessible(true); child = f.get(obj); } catch (Throwable ignored) { continue; }
                if (child == null) continue;
                if (child instanceof Iterable<?> || child instanceof Map<?, ?>) continue;
                if (isSkippable(child.getClass())) continue;
                findKamasViewModels(child, targets, visited, depth + 1, maxDepth);
            }
            c = c.getSuperclass();
        }
    }

    private static void probeAllMethods(Object obj, long hint, List<Map<String, Object>> hits) {
        Class<?> c = obj.getClass();
        while (c != null && c != Object.class) {
            for (Method m : c.getDeclaredMethods()) {
                if (m.getParameterCount() != 0 || Modifier.isStatic(m.getModifiers())) continue;
                if (m.getReturnType() == void.class) continue;

                Object result;
                try { m.setAccessible(true); result = m.invoke(obj); } catch (Throwable ignored) { continue; }
                if (result == null) continue;

                if (result instanceof Number n) {
                    long v = n.longValue();
                    boolean match = hint != Long.MIN_VALUE ? Math.abs(v - hint) <= 100 : v >= 200_000 && v <= 9_999_999;
                    if (match) {
                        Map<String, Object> h = new LinkedHashMap<>();
                        h.put("source", "method:" + m.getName() + "()");
                        h.put("type", result.getClass().getSimpleName());
                        h.put("value", v);
                        hits.add(h);
                    }
                } else if (result instanceof String s) {
                    boolean match = s.replaceAll("[^0-9]", "").length() >= 5
                            && (hint == Long.MIN_VALUE || s.replaceAll("[^0-9]", "").contains(String.valueOf(hint)));
                    if (match) {
                        Map<String, Object> h = new LinkedHashMap<>();
                        h.put("source", "method:" + m.getName() + "()");
                        h.put("type", "String");
                        h.put("value", s);
                        hits.add(h);
                    }
                }
            }
            c = c.getSuperclass();
        }
    }

    private static void dumpNumericFields(Object obj, long hint, List<Map<String, Object>> hits) {
        Class<?> c = obj.getClass();
        while (c != null && c != Object.class) {
            Field[] fields;
            try { fields = c.getDeclaredFields(); } catch (Throwable ignored) { c = c.getSuperclass(); continue; }
            for (Field f : fields) {
                boolean isStatic = Modifier.isStatic(f.getModifiers());
                Object target = isStatic ? null : obj;

                if (f.getType().isPrimitive()) {
                    try {
                        f.setAccessible(true);
                        Class<?> t = f.getType();
                        long v;
                        if (t == int.class)       v = f.getInt(target);
                        else if (t == long.class)  v = f.getLong(target);
                        else continue;

                        boolean match = hint != Long.MIN_VALUE ? Math.abs(v - hint) <= 100 : v >= 200_000 && v <= 9_999_999;
                        if (match) {
                            Map<String, Object> h = new LinkedHashMap<>();
                            h.put("source", "field:" + c.getSimpleName() + "." + f.getName());
                            h.put("type", t.getName());
                            h.put("value", v);
                            hits.add(h);
                        }
                    } catch (Throwable ignored) {}
                    continue;
                }

                Object val;
                try { f.setAccessible(true); val = f.get(target); } catch (Throwable ignored) { continue; }
                if (val == null) continue;

                if (val instanceof Number n) {
                    long v = n.longValue();
                    boolean match = hint != Long.MIN_VALUE ? Math.abs(v - hint) <= 100 : v >= 200_000 && v <= 9_999_999;
                    if (match) {
                        Map<String, Object> h = new LinkedHashMap<>();
                        h.put("source", "field:" + c.getSimpleName() + "." + f.getName());
                        h.put("type", val.getClass().getSimpleName());
                        h.put("value", n.longValue());
                        hits.add(h);
                    }
                } else if (val instanceof String s) {
                    boolean match = s.replaceAll("[^0-9]", "").length() >= 5
                            && (hint == Long.MIN_VALUE || s.replaceAll("[^0-9]", "").contains(String.valueOf(hint)));
                    if (match) {
                        Map<String, Object> h = new LinkedHashMap<>();
                        h.put("source", "field:" + c.getSimpleName() + "." + f.getName());
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
