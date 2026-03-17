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
import java.util.LinkedHashMap;
import java.util.Map;

public final class RuntimeAgentAueProbeOnce {
    public static void premain(String agentArgs, Instrumentation inst) { run(agentArgs, inst); }
    public static void agentmain(String agentArgs, Instrumentation inst) { run(agentArgs, inst); }

    private static void run(String agentArgs, Instrumentation inst) {
        Path outPath = resolveOutput(agentArgs);
        try {
            writeJson(outPath, scanRuntime(inst));
        } catch (Throwable t) {
            Map<String, Object> err = new LinkedHashMap<>();
            err.put("source", "runtime-agent-aue-probe-once");
            err.put("status", "error");
            err.put("error", t.getClass().getName() + ": " + t.getMessage());
            err.put("updated_at", Instant.now().getEpochSecond());
            writeJson(outPath, err);
        }
    }

    private static Path resolveOutput(String agentArgs) {
        if (agentArgs == null || agentArgs.trim().isEmpty()) {
            return Paths.get("logs", "realtime", "aue_probe_once.json");
        }
        return Paths.get(agentArgs.trim());
    }

    private static Map<String, Object> scanRuntime(Instrumentation inst) {
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("source", "runtime-agent-aue-probe-once");
        payload.put("status", "ok");
        payload.put("updated_at", Instant.now().getEpochSecond());

        for (Class<?> cls : inst.getAllLoadedClasses()) {
            if (!"aUE".equals(cls.getSimpleName())) {
                continue;
            }
            Field[] fields;
            try {
                fields = cls.getDeclaredFields();
            } catch (Throwable ignored) {
                continue;
            }
            for (Field field : fields) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    continue;
                }
                Object root;
                try {
                    field.setAccessible(true);
                    root = field.get(null);
                } catch (Throwable ignored) {
                    continue;
                }
                if (root == null || !"aUE".equals(root.getClass().getSimpleName())) {
                    continue;
                }
                payload.put("singleton_path", cls.getName() + "." + field.getName());
                payload.put("fields", summarizeFields(root));
                payload.put("children", summarizeChildren(root));
                return payload;
            }
        }

        payload.put("found", false);
        return payload;
    }

    private static Map<String, Object> summarizeFields(Object obj) {
        Map<String, Object> out = new LinkedHashMap<>();
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

    private static Map<String, Object> summarizeChildren(Object obj) {
        Map<String, Object> out = new LinkedHashMap<>();
        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                Object value = field.get(obj);
                if (value == null) {
                    continue;
                }
                Class<?> cls = value.getClass();
                if (cls.getName().startsWith("java.")) {
                    continue;
                }
                out.put(field.getName(), summarizeFields(value));
            }
        } catch (Throwable ignored) {
        }
        return out;
    }

    private static Object summarizeValue(Object value) {
        if (value == null) return null;
        if (value instanceof Number || value instanceof Boolean || value instanceof String) return value;
        Class<?> cls = value.getClass();
        if (cls.isArray()) return cls.getComponentType().getName() + "[]";
        return cls.getName();
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
        return "\"" + escape(String.valueOf(value)) + "\"";
    }

    private static String escape(String s) {
        return s.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    }
}
