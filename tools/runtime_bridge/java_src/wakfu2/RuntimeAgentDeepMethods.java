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
 * For each bgT instance, collect all objects reachable via field traversal
 * (depth 1-4, no Iterable/Map), then call every no-arg method on each collected
 * object and report any result in range [100_000, 50_000_000] or matching hint.
 */
public final class RuntimeAgentDeepMethods {

    public static void premain(String args, Instrumentation inst) { run(args, inst); }
    public static void agentmain(String args, Instrumentation inst) { run(args, inst); }

    private static void run(String rawArgs, Instrumentation inst) {
        String outArg = "logs/realtime/deep_methods.json";
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
        payload.put("source", "deep-methods-probe");
        payload.put("hint", hint == Long.MIN_VALUE ? "none" : hint);
        payload.put("updated_at", Instant.now().getEpochSecond());

        try {
            // Find bgT instances
            IdentityHashMap<Object, Boolean> bgTInstances = new IdentityHashMap<>();
            IdentityHashMap<Object, Boolean> findVisited = new IdentityHashMap<>();

            for (Class<?> cls : inst.getAllLoadedClasses()) {
                Field[] sf;
                try { sf = cls.getDeclaredFields(); } catch (Throwable ignored) { continue; }
                for (Field f : sf) {
                    if (!Modifier.isStatic(f.getModifiers()) || f.getType().isPrimitive()) continue;
                    Object root;
                    try { f.setAccessible(true); root = f.get(null); } catch (Throwable ignored) { continue; }
                    if (root == null) continue;
                    findBgT(root, bgTInstances, findVisited, 0, 10);
                }
            }

            payload.put("bgt_instances_found", bgTInstances.size());

            // Collect all objects reachable from each bgT (depth 1-4, skip Iterable/Map)
            final long hintFinal = hint;
            List<Map<String, Object>> hits = new ArrayList<>();
            IdentityHashMap<Object, Boolean> collectVisited = new IdentityHashMap<>();

            for (Object bgT : bgTInstances.keySet()) {
                collectAndProbeMethods(bgT, "bgT", hintFinal, hits, collectVisited, 0, 4);
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

    private static void collectAndProbeMethods(Object obj, String path, long hint,
                                                List<Map<String, Object>> hits,
                                                IdentityHashMap<Object, Boolean> visited,
                                                int depth, int maxDepth) {
        if (obj == null || depth > maxDepth || hits.size() > 300) return;
        if (visited.containsKey(obj)) return;
        visited.put(obj, Boolean.TRUE);

        Class<?> cls = obj.getClass();
        if (isSkippable(cls)) return;

        // Probe all no-arg instance methods on this object
        Class<?> c = cls;
        while (c != null && c != Object.class) {
            for (Method m : c.getDeclaredMethods()) {
                if (m.getParameterCount() != 0 || Modifier.isStatic(m.getModifiers())) continue;
                if (m.getReturnType() == void.class) continue;

                Object result;
                try { m.setAccessible(true); result = m.invoke(obj); }
                catch (Throwable ignored) { continue; }

                if (!isInteresting(result, hint)) continue;

                Map<String, Object> hit = new LinkedHashMap<>();
                hit.put("path", path);
                hit.put("class", cls.getSimpleName());
                hit.put("method", m.getName() + "():" + m.getReturnType().getSimpleName());
                hit.put("value", formatValue(result));
                hits.add(hit);
            }
            c = c.getSuperclass();
        }

        if (depth >= maxDepth) return;

        // Recurse via fields
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
                collectAndProbeMethods(child, path + "." + f.getName() + "(" + child.getClass().getSimpleName() + ")",
                        hint, hits, visited, depth + 1, maxDepth);
            }
            c = c.getSuperclass();
        }
    }

    private static boolean isInteresting(Object result, long hint) {
        if (result == null) return false;
        if (result instanceof Number n) {
            long v = n.longValue();
            if (hint != Long.MIN_VALUE) return Math.abs(v - hint) <= 100;
            return v >= 100_000 && v <= 50_000_000;
        }
        if (result instanceof String s) {
            String digits = s.replaceAll("[^0-9]", "");
            if (digits.length() < 5) return false;
            if (hint != Long.MIN_VALUE) return digits.contains(String.valueOf(hint));
            return true;
        }
        return false;
    }

    private static String formatValue(Object result) {
        if (result instanceof Number n) return String.valueOf(n.longValue());
        return String.valueOf(result);
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
            try { fields = c.getDeclaredFields(); } catch (Throwable ignored) { c = c.getSuperclass(); continue; }
            for (Field f : fields) {
                if (Modifier.isStatic(f.getModifiers()) || f.getType().isPrimitive()) continue;
                Object child;
                try { f.setAccessible(true); child = f.get(obj); } catch (Throwable ignored) { continue; }
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
