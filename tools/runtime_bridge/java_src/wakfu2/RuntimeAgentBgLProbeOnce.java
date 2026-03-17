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

public final class RuntimeAgentBgLProbeOnce {
    private static final String TARGET = "bgL";
    private static final int MAX_DEPTH = 7;
    private static final int MAX_MATCHES = 40;

    public static void premain(String agentArgs, Instrumentation inst) { run(agentArgs, inst); }
    public static void agentmain(String agentArgs, Instrumentation inst) { run(agentArgs, inst); }

    private static void run(String agentArgs, Instrumentation inst) {
        Path outPath = resolveOutput(agentArgs);
        try {
            writeJson(outPath, scanRuntime(inst));
        } catch (Throwable t) {
            Map<String, Object> err = new LinkedHashMap<>();
            err.put("source", "runtime-agent-bgl-probe-once");
            err.put("status", "error");
            err.put("error", t.getClass().getName() + ": " + t.getMessage());
            err.put("updated_at", Instant.now().getEpochSecond());
            writeJson(outPath, err);
        }
    }

    private static Path resolveOutput(String agentArgs) {
        if (agentArgs == null || agentArgs.trim().isEmpty()) {
            return Paths.get("logs", "realtime", "bgl_probe_once.json");
        }
        return Paths.get(agentArgs.trim());
    }

    private static Map<String, Object> scanRuntime(Instrumentation inst) {
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("source", "runtime-agent-bgl-probe-once");
        payload.put("status", "ok");
        payload.put("updated_at", Instant.now().getEpochSecond());
        List<Map<String, Object>> matches = new ArrayList<>();

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
                collectMatches(root, cls.getName() + "." + field.getName(), matches);
                if (matches.size() >= MAX_MATCHES) break;
            }
            if (matches.size() >= MAX_MATCHES) break;
        }

        payload.put("matches_count", matches.size());
        payload.put("matches", matches);
        return payload;
    }

    private static void collectMatches(Object root, String rootPath, List<Map<String, Object>> matches) {
        IdentityHashMap<Object, Boolean> visited = new IdentityHashMap<>();
        Deque<Node> queue = new ArrayDeque<>();
        queue.add(new Node(root, rootPath, 0, null, null));

        while (!queue.isEmpty() && matches.size() < MAX_MATCHES) {
            Node node = queue.removeFirst();
            if (node.obj == null || visited.containsKey(node.obj)) continue;
            visited.put(node.obj, Boolean.TRUE);

            Class<?> cls = node.obj.getClass();
            if (TARGET.equals(cls.getSimpleName())) {
                matches.add(describeNode(node));
            }
            if (node.depth >= MAX_DEPTH || isLeafType(cls)) continue;

            Field[] fields;
            try { fields = cls.getDeclaredFields(); } catch (Throwable ignored) { continue; }
            for (Field field : fields) {
                Object child;
                try {
                    field.setAccessible(true);
                    child = field.get(node.obj);
                } catch (Throwable ignored) {
                    continue;
                }
                if (child == null || isSimpleValue(child.getClass())) continue;
                queue.addLast(new Node(child, node.path + "." + field.getName(), node.depth + 1, node, field.getName()));
            }
        }
    }

    private static Map<String, Object> describeNode(Node node) {
        Map<String, Object> out = new LinkedHashMap<>();
        out.put("path", node.path);
        out.put("fields", summarizeFields(node.obj));
        if (node.parent != null) {
            out.put("parent_class", node.parent.obj.getClass().getName());
            out.put("parent_path", node.parent.path);
            out.put("via_field", node.viaField);
            out.put("parent_fields", summarizeFields(node.parent.obj));
        }
        return out;
    }

    private static Map<String, Object> summarizeFields(Object obj) {
        Map<String, Object> out = new LinkedHashMap<>();
        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                Object value = field.get(obj);
                if (value == null) continue;
                if (value instanceof Number || value instanceof Boolean || value instanceof String) {
                    out.put(field.getName(), value);
                } else {
                    out.put(field.getName(), value.getClass().getName());
                }
            }
        } catch (Throwable ignored) {
        }
        return out;
    }

    private static boolean isLeafType(Class<?> cls) { return cls.isPrimitive() || isSimpleValue(cls); }
    private static boolean isSimpleValue(Class<?> cls) {
        return Number.class.isAssignableFrom(cls)
            || cls == String.class
            || cls == Boolean.class
            || cls == Character.class
            || cls.getName().startsWith("java.time.")
            || cls.getName().startsWith("java.lang.Class");
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

    private record Node(Object obj, String path, int depth, Node parent, String viaField) {}
}
