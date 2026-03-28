package com.wakfuassistant.agent;

import net.bytebuddy.asm.Advice;

/**
 * Universal S2C sniffer - v2 inline-safe
 * ByteBuddy Advice is INLINED into the target class, so we cannot use
 * static fields from this class. Everything must be computed inline.
 */
public class UniversalSnifferAdvice {

    @Advice.OnMethodExit(onThrowable = Throwable.class, suppress = Throwable.class)
    public static void onExit(@Advice.This Object self, @Advice.Return boolean ret) {
        try {
            Class<?> clazz = self.getClass();
            String className = clazz.getSimpleName();
            if (className == null || className.isEmpty()) {
                className = clazz.getName();
            }

            // Get msgId via method d()
            int msgId = -1;
            try {
                java.lang.reflect.Method dMethod = clazz.getMethod("d");
                Object result = dMethod.invoke(self);
                if (result instanceof Integer) {
                    msgId = ((Integer) result).intValue();
                }
            } catch (Exception ignored) {
                try {
                    java.lang.reflect.Method dMethod = clazz.getDeclaredMethod("d");
                    dMethod.setAccessible(true);
                    Object result = dMethod.invoke(self);
                    if (result instanceof Integer) {
                        msgId = ((Integer) result).intValue();
                    }
                } catch (Exception ignored2) { }
            }

            // Count non-null fields and build summary
            StringBuilder sb = new StringBuilder();
            int fieldCount = 0;
            Class<?> c = clazz;
            while (c != null && !c.getName().equals("java.lang.Object")) {
                java.lang.reflect.Field[] fields = c.getDeclaredFields();
                for (int i = 0; i < fields.length; i++) {
                    try {
                        fields[i].setAccessible(true);
                        Object val = fields[i].get(self);
                        if (val != null) {
                            fieldCount++;
                            String valStr;
                            if (val instanceof byte[]) {
                                valStr = "byte[" + ((byte[]) val).length + "]";
                            } else if (val instanceof int[]) {
                                valStr = "int[" + ((int[]) val).length + "]";
                            } else if (val instanceof long[]) {
                                valStr = "long[" + ((long[]) val).length + "]";
                            } else if (val instanceof java.util.Collection) {
                                valStr = "List[" + ((java.util.Collection<?>) val).size() + "]";
                            } else if (val instanceof java.util.Map) {
                                valStr = "Map[" + ((java.util.Map<?,?>) val).size() + "]";
                            } else {
                                valStr = val.toString();
                                if (valStr.length() > 60) {
                                    valStr = valStr.substring(0, 60) + "...";
                                }
                            }
                            if (sb.length() > 0) sb.append(" | ");
                            sb.append(fields[i].getName());
                            sb.append("=");
                            sb.append(valStr);
                        }
                    } catch (Exception ignored3) { }
                }
                c = c.getSuperclass();
            }

            // Build log line
            String timestamp = new java.text.SimpleDateFormat("HH:mm:ss.SSS").format(new java.util.Date());
            String line = "[" + timestamp + "] msgId=" + msgId + " class=" + className
                    + " fields=" + fieldCount + " :: " + sb.toString();

            // Write to file - use hardcoded path since we can't use static fields
            String logPath = "H:\\Code\\Wakfuassistant\\logs\\universal_sniffer.log";
            java.io.File logFile = new java.io.File(logPath);
            logFile.getParentFile().mkdirs();
            java.io.FileWriter fw = new java.io.FileWriter(logFile, true);
            fw.write(line + "\n");
            fw.flush();
            fw.close();

            // Rich messages to separate file
            if (fieldCount > 5 || sb.toString().contains("Map[")) {
                String richPath = "H:\\Code\\Wakfuassistant\\logs\\sniffer_rich_messages.log";
                java.io.FileWriter fw2 = new java.io.FileWriter(new java.io.File(richPath), true);
                fw2.write(line + "\n");
                fw2.flush();
                fw2.close();
            }

        } catch (Throwable t) {
            // Absolute silence - never crash the game
            try {
                String errPath = "H:\\Code\\Wakfuassistant\\logs\\sniffer_errors.log";
                java.io.FileWriter efw = new java.io.FileWriter(new java.io.File(errPath), true);
                efw.write(new java.util.Date() + " " + t.getClass().getName() + ": " + t.getMessage() + "\n");
                efw.flush();
                efw.close();
            } catch (Throwable ignored) { }
        }
    }
}
