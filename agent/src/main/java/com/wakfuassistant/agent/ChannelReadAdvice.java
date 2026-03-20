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
                        // Pour les messages HDV (coy, cmm, cmq, cmv, csf, cso, cmb, ctu)
                        // on dumpe aussi le contenu hex complet
                        if (simpleType.equals("coy") || simpleType.equals("cmm") ||
                            simpleType.equals("cmq") || simpleType.equals("cmv") ||
                            simpleType.equals("csf") || simpleType.equals("cso") ||
                            simpleType.equals("cmb") || simpleType.equals("ctu")) {
                            StringBuilder hex = new StringBuilder(arr.length * 3);
                            for (int i = 0; i < arr.length; i++) {
                                if (i > 0 && i % 16 == 0) hex.append(" ");
                                int b2 = arr[i] & 0xFF;
                                hex.append("0123456789ABCDEF".charAt(b2 >> 4));
                                hex.append("0123456789ABCDEF".charAt(b2 & 0xF));
                            }
                            valStr += "|HEX=" + hex.toString();
                            // Aussi tenter de lire comme texte ASCII les parties lisibles
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
                    } else if (val.getClass().isArray()) {
                        valStr = val.getClass().getComponentType().getSimpleName() + "[" + java.lang.reflect.Array.getLength(val) + "]";
                    } else if (val instanceof java.util.Collection) {
                        java.util.Collection<?> col = (java.util.Collection<?>) val;
                        valStr = val.getClass().getSimpleName() + "(size=" + col.size() + ")";
                        if (col.size() > 0 && col.size() <= 5) {
                            StringBuilder csb = new StringBuilder("[");
                            int ci = 0;
                            for (Object item : col) {
                                if (ci > 0) csb.append(",");
                                if (item == null) { csb.append("null"); }
                                else {
                                    csb.append(item.getClass().getSimpleName());
                                    try { String its = item.toString(); if (its.length() < 80) csb.append("=").append(its); } catch (Throwable ignore) {}
                                }
                                ci++;
                            }
                            csb.append("]");
                            valStr += csb.toString();
                        }
                    } else if (val instanceof java.util.Map) {
                        java.util.Map<?,?> map = (java.util.Map<?,?>) val;
                        valStr = val.getClass().getSimpleName() + "(size=" + map.size() + ")";
                    } else {
                        String typeName = val.getClass().getSimpleName();
                        StringBuilder osb = new StringBuilder(typeName).append("{");
                        try {
                            Field[] subFields = val.getClass().getDeclaredFields();
                            int si = 0;
                            for (Field sf : subFields) {
                                if (Modifier.isStatic(sf.getModifiers())) continue;
                                if (si >= 8) { osb.append("..."); break; }
                                if (si > 0) osb.append(",");
                                sf.setAccessible(true);
                                Object sv = sf.get(val);
                                osb.append(sf.getName()).append("=");
                                if (sv == null) osb.append("null");
                                else if (sv instanceof Number || sv instanceof Boolean) osb.append(sv);
                                else if (sv instanceof String) {
                                    String ss = (String) sv;
                                    osb.append("\"").append(ss.length() > 50 ? ss.substring(0, 50) + "..." : ss).append("\"");
                                } else osb.append(sv.getClass().getSimpleName());
                                si++;
                            }
                        } catch (Throwable ignore) { osb.append("?"); }
                        osb.append("}");
                        valStr = osb.toString();
                    }
                    sb.append("|").append(f.getName()).append("=").append(valStr);
                } catch (Throwable fieldErr) {
                    sb.append("|").append(f.getName()).append("=<ERR:").append(fieldErr.getClass().getSimpleName()).append(">");
                }
            }
            sb.append("|_fieldCount=").append(fieldCount);

            boolean isHdv = simpleType.equals("coy") || simpleType.equals("cmq") || simpleType.equals("cmv") ||
                simpleType.equals("cmb") || simpleType.equals("ctu") || simpleType.equals("cmm") ||
                simpleType.equals("csf") || simpleType.equals("cso");

            String logLine = sb.toString();

            try {
                java.io.FileWriter fw = new java.io.FileWriter(
                    "H:\\Code\\Wakfuassistant\\agent\\logs\\wakfu_messages.log", true);
                fw.write(logLine + "\n");
                fw.close();
            } catch (Throwable ignore) {}

            if (isHdv) {
                try {
                    java.io.FileWriter fw = new java.io.FileWriter(
                        "H:\\Code\\Wakfuassistant\\agent\\logs\\wakfu_hdv.log", true);
                    fw.write(logLine + "\n");
                    fw.close();
                } catch (Throwable ignore) {}
            }

            try {
                java.io.FileWriter fw = new java.io.FileWriter(
                    "H:\\Code\\Wakfuassistant\\agent\\logs\\wakfu_agent_spy.log", true);
                fw.write("[" + timestamp + "] MSG|" + simpleType + "|fields=" + fieldCount +
                    (isHdv ? "|HDV" : "") + "\n");
                fw.close();
            } catch (Throwable ignore) {}

        } catch (Throwable t) {
            try {
                java.io.FileWriter fw = new java.io.FileWriter(
                    "H:\\Code\\Wakfuassistant\\agent\\logs\\wakfu_agent_spy.log", true);
                fw.write("[ADVICE ERROR] " + t.getClass().getName() + ": " + t.getMessage() + "\n");
                fw.close();
            } catch (Throwable ignore) {}
        }
    }
}
