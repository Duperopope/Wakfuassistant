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
 * Complete diagnostic: dump every field (all types, all depths to 3)
 * of every bgT instance.  Reports numeric values in range [200000, 9999999]
 * plus String fields that contain digits 5+ chars long.
 * Skips Iterable/Map traversal to avoid NPEs.
 */
public final class RuntimeAgentBgTDump {

    public static void premain(String args, Instrumentation inst) { run(args, inst); }
    public static void agentmain(String args, Instrumentation inst) { run(args, inst); }

    private static void run(String rawArgs, Instrumentation inst) {
        String outArg = "logs/realtime/bgt_dump.json";

        if (rawArgs != null && !rawArgs.trim().isEmpty()) {
            String trimmed = rawArgs.trim();
            if (!trimmed.startsWith("hint=")) outArg = trimmed.split("\\|")[0].trim();
        }

        Path outPath = Paths.get(outArg);
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("source", "bgt-dump");
        payload.put("updated_at", Instant.now().getEpochSecond());

        try {
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

            List<Map<String, Object>> interesting = new ArrayList<>();
            for (Object bgT : bgTInstances.keySet()) {
                dumpInteresting(bgT, bgT.getClass().getSimpleName(), interesting,
                        new IdentityHashMap<>(), 0, 3);
            }

            payload.put("status", "ok");
            payload.put("interesting_count", interesting.size());
            payload.put("interesting", interesting);

        } catch (Throwable t) {
            payload.put("status", "error");
            payload.put("error", t.getClass().getName() + ": " + t.getMessage());
        }

        write(outPath, payload);
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

    private static void dumpInteresting(Object obj, String path, List<Map<String, Object>> out,
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
            try { fields = c.getDeclaredFields(); }
            catch (Throwable ignored) { c = c.getSuperclass(); continue; }

            for (Field f : fields) {
                boolean isStatic = Modifier.isStatic(f.getModifiers());
                Object target = isStatic ? null : obj;
                String fpath = path + "." + f.getName() + "(" + f.getType().getSimpleName() + ")";

                if (f.getType().isPrimitive()) {
                    try {
                        f.setAccessible(true);
                        Class<?> t = f.getType();
                        long v;
                        if (t == int.class)        v = f.getInt(target);
                        else if (t == long.class)   v = f.getLong(target);
                        else if (t == short.class)  v = (long) f.getShort(target);
                        else if (t == float.class)  v = (long) f.getFloat(target);
                        else if (t == double.class) v = (long) f.getDouble(target);
                        else continue;

                        if (v >= 200_000 && v <= 9_999_999) {
                            Map<String, Object> entry = new LinkedHashMap<>();
                            entry.put("path", fpath);
                            entry.put("value", v);
                            out.add(entry);
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
                    if (v >= 200_000 && v <= 9_999_999) {
                        Map<String, Object> entry = new LinkedHashMap<>();
                        entry.put("path", fpath);
                        entry.put("type", child.getClass().getSimpleName());
                        entry.put("value", v);
                        out.add(entry);
                    }
                    continue;
                }

                if (child instanceof String s) {
                    // Keep strings with 5+ consecutive digits
                    if (s.replaceAll("[^0-9]", "").length() >= 5) {
                        Map<String, Object> entry = new LinkedHashMap<>();
                        entry.put("path", fpath);
                        entry.put("type", "String");
                        entry.put("value", s);
                        out.add(entry);
                    }
                    continue;
                }

                if (child instanceof Iterable<?> || child instanceof Map<?, ?>) continue;
                if (isSkippable(child.getClass())) continue;

                dumpInteresting(child, fpath, out, visited, depth + 1, maxDepth);
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
