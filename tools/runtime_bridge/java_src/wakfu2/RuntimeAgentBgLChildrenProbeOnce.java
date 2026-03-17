package wakfu2;

import java.io.IOException;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class RuntimeAgentBgLChildrenProbeOnce {
    public static void premain(String agentArgs, Instrumentation inst) { run(agentArgs, inst); }
    public static void agentmain(String agentArgs, Instrumentation inst) { run(agentArgs, inst); }

    private static void run(String agentArgs, Instrumentation inst) {
        Path outPath = resolveOutput(agentArgs);
        try {
            writeJson(outPath, scanRuntime(inst));
        } catch (Throwable t) {
            Map<String, Object> err = new LinkedHashMap<>();
            err.put("source", "runtime-agent-bgl-children-probe-once");
            err.put("status", "error");
            err.put("error", t.getClass().getName() + ": " + t.getMessage());
            err.put("updated_at", Instant.now().getEpochSecond());
            writeJson(outPath, err);
        }
    }

    private static Path resolveOutput(String agentArgs) {
        if (agentArgs == null || agentArgs.trim().isEmpty()) {
            return Paths.get("logs", "realtime", "bgl_children_probe_once.json");
        }
        return Paths.get(agentArgs.trim());
    }

    private static Map<String, Object> scanRuntime(Instrumentation inst) throws Exception {
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("source", "runtime-agent-bgl-children-probe-once");
        payload.put("status", "ok");
        payload.put("updated_at", Instant.now().getEpochSecond());

        Object bgLObject = null;
        for (Class<?> cls : inst.getAllLoadedClasses()) {
            Field[] fields;
            try { fields = cls.getDeclaredFields(); } catch (Throwable ignored) { continue; }
            for (Field field : fields) {
                if (!Modifier.isStatic(field.getModifiers())) continue;
                Object root;
                try {
                    field.setAccessible(true);
                    root = field.get(null);
                } catch (Throwable ignored) {
                    continue;
                }
                if (root == null) continue;
                bgLObject = findBgL(root, 0);
                if (bgLObject != null) break;
            }
            if (bgLObject != null) break;
        }

        if (bgLObject == null) {
            payload.put("found", false);
            return payload;
        }

        payload.put("found", true);
        payload.put("bgl_fields", summarizeFields(bgLObject));
        Object ids = getField(bgLObject, "ids");
        Object hUy = getField(bgLObject, "hUy");
        payload.put("ids_summary", summarizeFields(ids));
        payload.put("hUy_summary", summarizeCollection(hUy));
        return payload;
    }

    private static Object findBgL(Object root, int depth) {
        if (root == null || depth > 7) return null;
        Class<?> cls = root.getClass();
        if ("bgL".equals(cls.getSimpleName())) return root;
        if (isSimpleValue(cls)) return null;
        try {
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object child = field.get(root);
                if (child == null) continue;
                Object found = findBgL(child, depth + 1);
                if (found != null) return found;
            }
        } catch (Throwable ignored) {
        }
        return null;
    }

    private static Object getField(Object obj, String fieldName) {
        if (obj == null) return null;
        try {
            Field field = obj.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(obj);
        } catch (Throwable ignored) {
            return null;
        }
    }

    private static Map<String, Object> summarizeFields(Object obj) {
        Map<String, Object> out = new LinkedHashMap<>();
        if (obj == null) return out;
        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                Object value = field.get(obj);
                out.put(field.getName(), summarizeValue(value));
            }
        } catch (Throwable ignored) {
        }
        return out;
    }

    private static Object summarizeCollection(Object value) {
        if (value == null) return null;
        if (value instanceof List<?> list) {
            Map<String, Object> out = new LinkedHashMap<>();
            out.put("size", list.size());
            for (int i = 0; i < Math.min(12, list.size()); i++) {
                out.put("item_" + i, summarizeValue(list.get(i)));
            }
            return out;
        }
        if (value.getClass().isArray()) {
            int size = Array.getLength(value);
            Map<String, Object> out = new LinkedHashMap<>();
            out.put("size", size);
            for (int i = 0; i < Math.min(12, size); i++) {
                out.put("item_" + i, summarizeValue(Array.get(value, i)));
            }
            return out;
        }
        return summarizeValue(value);
    }

    private static Object summarizeValue(Object value) {
        if (value == null) return null;
        if (value instanceof Number || value instanceof Boolean || value instanceof String) return value;
        Class<?> cls = value.getClass();
        if (cls.isArray()) return cls.getComponentType().getName() + "[]";
        return summarizeFields(value);
    }

    private static boolean isSimpleValue(Class<?> cls) {
        return Number.class.isAssignableFrom(cls)
            || cls == String.class
            || cls == Boolean.class
            || cls == Character.class
            || cls.getName().startsWith("java.")
            || cls.getName().startsWith("sun.")
            || cls.getName().startsWith("jdk.");
    }

    private static void writeJson(Path outPath, Map<String, Object> data) {
        try {
            if (outPath.getParent() != null) Files.createDirectories(outPath.getParent());
            Files.writeString(outPath, toJson(data), StandardCharsets.UTF_8);
        } catch (IOException ignored) {
        }
    }

    private static String toJson(Object value) {
        if (value == null) return "null";
        if (value instanceof Number || value instanceof Boolean) return String.valueOf(value);
        if (value instanceof Map<?, ?> map) {
            StringBuilder sb = new StringBuilder("{");
            boolean first = true;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                if (!first) sb.append(", ");
                first = false;
                sb.append("\"").append(escape(String.valueOf(entry.getKey()))).append("\": ").append(toJson(entry.getValue()));
            }
            return sb.append("}").toString();
        }
        if (value instanceof List<?> list) {
            StringBuilder sb = new StringBuilder("[");
            boolean first = true;
            for (Object entry : list) {
                if (!first) sb.append(", ");
                first = false;
                sb.append(toJson(entry));
            }
            return sb.append("]").toString();
        }
        return "\"" + escape(String.valueOf(value)) + "\"";
    }

    private static String escape(String s) {
        return s.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    }
}
