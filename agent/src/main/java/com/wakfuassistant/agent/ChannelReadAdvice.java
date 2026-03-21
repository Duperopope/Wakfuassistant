package com.wakfuassistant.agent;

import net.bytebuddy.asm.Advice;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ChannelReadAdvice {

    @Advice.OnMethodEnter(suppress = Throwable.class)
    public static void onEnter(
            @Advice.Argument(0) Object ctx,
            @Advice.Argument(1) Object msg) {

        try {
            String msgType = msg.getClass().getName();
            String simpleType = msgType.contains(".") ? msgType.substring(msgType.lastIndexOf('.') + 1) : msgType;
            String timestamp = new java.text.SimpleDateFormat("HH:mm:ss.SSS")
                .format(new java.util.Date());

            StringBuilder sb = new StringBuilder(4096);
            sb.append(timestamp).append("|MSG|").append(simpleType);

            Field[] fields = msg.getClass().getDeclaredFields();
            int fieldCount = 0;
            for (Field f : fields) {
                if (Modifier.isStatic(f.getModifiers())) continue;
                fieldCount++;
                try {
                    f.setAccessible(true);
                    Object val = f.get(msg);
                    String valStr;
                    if (val == null) {
                        valStr = "null";
                    } else if (val instanceof byte[]) {
                        byte[] arr = (byte[]) val;
                        valStr = "byte[" + arr.length + "]";
                        // Dump hex pour tout byte array entre 10 et 50000 bytes
                        if (arr.length > 10 && arr.length < 50000) {
                            StringBuilder hex = new StringBuilder(arr.length * 3);
                            for (int i = 0; i < arr.length; i++) {
                                // espace supprime pour parsing continu
                                int b2 = arr[i] & 0xFF;
                                hex.append("0123456789ABCDEF".charAt(b2 >> 4));
                                hex.append("0123456789ABCDEF".charAt(b2 & 0xF));
                            }
                            valStr += "|HEX=" + hex.toString();
                            StringBuilder ascii = new StringBuilder(arr.length);
                            for (int i = 0; i < arr.length; i++) {
                                int c = arr[i] & 0xFF;
                                if (c >= 32 && c < 127) {
                                    ascii.append((char) c);
                                } else {
                                    ascii.append('.');
                                }
                            }
                            valStr += "|ASCII=" + ascii.toString();
                        }
                    } else if (val instanceof Number || val instanceof Boolean || val instanceof Character) {
                        valStr = val.toString();
                    } else if (val instanceof String) {
                        String s = (String) val;
                        valStr = "\"" + (s.length() > 100 ? s.substring(0, 100) + "..." : s) + "\"";
                    } else if (val instanceof int[]) {
                        int[] arr = (int[]) val;
                        if (arr.length <= 10) {
                            StringBuilder asb = new StringBuilder("int[");
                            for (int i = 0; i < arr.length; i++) {
                                if (i > 0) asb.append(",");
                                asb.append(arr[i]);
                            }
                            asb.append("]");
                            valStr = asb.toString();
                        } else {
                            valStr = "int[" + arr.length + "]";
                        }
                    } else if (val instanceof long[]) {
                        long[] arr = (long[]) val;
                        if (arr.length <= 10) {
                            StringBuilder asb = new StringBuilder("long[");
                            for (int i = 0; i < arr.length; i++) {
                                if (i > 0) asb.append(",");
                                asb.append(arr[i]);
                            }
                            asb.append("]");
                            valStr = asb.toString();
                        } else {
                            valStr = "long[" + arr.length + "]";
                        }
                    } else {
                        String s = val.toString();
                        if (s.length() > 100) s = s.substring(0, 100) + "...";
                        valStr = s;
                    }
                    sb.append("|").append(f.getName()).append("=").append(valStr);
                } catch (Exception e) {
                    // skip field
                }
            }
            sb.append("|_fieldCount=").append(fieldCount);

            String line = sb.toString();
            com.wakfuassistant.agent.WakfuSpyAgent.logMessage(line);

            // Route vers HDV log si c'est un message marche
            if (simpleType.startsWith("co") || simpleType.startsWith("cq") ||
                simpleType.startsWith("cs") || simpleType.startsWith("cl")) {
                com.wakfuassistant.agent.WakfuSpyAgent.logHdv(line);
            }

        } catch (Exception e) {
            // silent
        }
    }
}
