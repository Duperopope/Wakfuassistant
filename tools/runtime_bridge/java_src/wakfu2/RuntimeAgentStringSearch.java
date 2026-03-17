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
 * Scan every String field in every reachable object, looking for
 * the formatted kamas string (e.g. "576 869", "576869", "576\u202f869").
 * Also scans Object[] arrays for String elements.
 * Reports class + field path where the string was found.
 */
public final class RuntimeAgentStringSearch {

    public static void premain(String args, Instrumentation inst) { run(args, inst); }
    public static void agentmain(String args, Instrumentation inst) { run(args, inst); }

    private static void run(String rawArgs, Instrumentation inst) {
        String outArg = "logs/realtime/string_search.json";
        String needle = "576";  // default — digits of kamas value

        if (rawArgs != null) {
            for (String part : rawArgs.split("\\|")) {
                part = part.trim();
                if (part.startsWith("needle=")) {
                    needle = part.substring(7);
                } else if (!part.isEmpty()) {
                    outArg = part;
                }
            }
        }

        final String needleFinal = needle;
        Path outPath = Paths.get(outArg);
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("source", "string-search");
        payload.put("needle", needleFinal);
        payload.put("updated_at", Instant.now().getEpochSecond());

        try {
            IdentityHashMap<Object, Boolean> visited = new IdentityHashMap<>();
            List<Map<String, Object>> hits = new ArrayList<>();

            for (Class<?> cls : inst.getAllLoadedClasses()) {
                Field[] sf;
                try { sf = cls.getDeclaredFields(); } catch (Throwable ignored) { continue; }
                for (Field f : sf) {
                    if (!Modifier.isStatic(f.getModifiers()) || f.getType().isPrimitive()) continue;
                    Object root;
                    try { f.setAccessible(true); root = f.get(null); } catch (Throwable ignored) { continue; }
                    if (root == null || visited.containsKey(root)) continue;
                    scanForString(root, cls.getName() + "." + f.getName(), needleFinal, hits, visited, 0, 8);
                }
                if (hits.size() >= 100) break;
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

    private static void scanForString(Object obj, String path, String needle,
                                       List<Map<String, Object>> hits,
                                       IdentityHashMap<Object, Boolean> visited,
                                       int depth, int maxDepth) {
        if (obj == null || depth > maxDepth || hits.size() >= 100) return;
        if (visited.containsKey(obj)) return;
        visited.put(obj, Boolean.TRUE);

        // Handle String directly
        if (obj instanceof String s) {
            if (isKamasLike(s, needle)) {
                Map<String, Object> hit = new LinkedHashMap<>();
                hit.put("path", path);
                hit.put("value", s);
                hits.add(hit);
            }
            return;
        }

        Class<?> cls = obj.getClass();

        // Handle Object[] arrays — scan elements
        if (cls.isArray() && !cls.getComponentType().isPrimitive()) {
            Object[] arr = (Object[]) obj;
            for (int i = 0; i < Math.min(arr.length, 200); i++) {
                if (arr[i] instanceof String s) {
                    if (isKamasLike(s, needle)) {
                        Map<String, Object> hit = new LinkedHashMap<>();
                        hit.put("path", path + "[" + i + "]");
                        hit.put("value", s);
                        hits.add(hit);
                    }
                } else if (arr[i] != null && !visited.containsKey(arr[i])) {
                    scanForString(arr[i], path + "[" + i + "]", needle, hits, visited, depth + 1, maxDepth);
                }
            }
            return;
        }

        if (isUninteresting(cls)) return;

        // Iterate fields including superclass chain
        Class<?> c = cls;
        while (c != null && c != Object.class) {
            Field[] fields;
            try { fields = c.getDeclaredFields(); } catch (Throwable ignored) { c = c.getSuperclass(); continue; }

            for (Field f : fields) {
                if (f.getType().isPrimitive()) continue;
                boolean isStatic = Modifier.isStatic(f.getModifiers());

                Object child;
                try { f.setAccessible(true); child = f.get(isStatic ? null : obj); }
                catch (Throwable ignored) { continue; }

                if (child == null) continue;

                if (child instanceof String s) {
                    if (isKamasLike(s, needle)) {
                        Map<String, Object> hit = new LinkedHashMap<>();
                        hit.put("path", path + "." + f.getName());
                        hit.put("class", cls.getSimpleName());
                        hit.put("field_class", c.getSimpleName());
                        hit.put("value", s);
                        hits.add(hit);
                    }
                    continue;
                }

                if (visited.containsKey(child)) continue;

                // Safe iteration: java.util.HashMap only
                if (child.getClass() == java.util.HashMap.class) {
                    try {
                        for (Map.Entry<?, ?> e : ((java.util.HashMap<?, ?>) child).entrySet()) {
                            if (e.getValue() instanceof String s && isKamasLike(s, needle)) {
                                Map<String, Object> hit = new LinkedHashMap<>();
                                hit.put("path", path + "." + f.getName() + "{" + e.getKey() + "}");
                                hit.put("class", cls.getSimpleName());
                                hit.put("value", s);
                                hits.add(hit);
                            }
                        }
                    } catch (Throwable ignored) {}
                    continue;
                }

                if (child instanceof Iterable<?> || child instanceof Map<?, ?>) continue;
                if (isUninteresting(child.getClass())) continue;

                scanForString(child, path + "." + f.getName(), needle, hits, visited, depth + 1, maxDepth);
            }
            c = c.getSuperclass();
        }
    }

    private static boolean isKamasLike(String s, String needle) {
        if (s == null || s.length() > 20) return false;
        // Must contain the needle AND have mostly digits (with possible spaces/punctuation)
        if (!s.replaceAll("\\s", "").contains(needle.replaceAll("\\s", ""))) return false;
        // Must have at least 5 digits
        return s.replaceAll("[^0-9]", "").length() >= 5;
    }

    private static boolean isUninteresting(Class<?> cls) {
        if (cls == null) return true;
        String name = cls.getName();
        return name.startsWith("java.lang.Class")
            || name.startsWith("java.lang.reflect.")
            || name.startsWith("sun.")
            || name.startsWith("jdk.")
            || name.startsWith("com.sun.")
            || name.startsWith("java.lang.Thread")
            || (cls.isPrimitive());
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
