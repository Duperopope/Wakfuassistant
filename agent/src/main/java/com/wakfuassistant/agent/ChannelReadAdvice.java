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
                simpleType.startsWith("cs") || simpleType.startsWith("cl") ||
                simpleType.startsWith("cr")) {
                com.wakfuassistant.agent.WakfuSpyAgent.logHdv(line);
            }

            // Decodage protobuf pour messages items/builds
            // cru : builds d'equipement avec noms (field mgi)
            // csS : equipement complet (field mhJ)
            if ("cru".equals(simpleType) || "csS".equals(simpleType)) {
                try {
                    String payloadField = "cru".equals(simpleType) ? "mgi" : "mhJ";
                    Field pf = null;
                    Class<?> lookupClass = msg.getClass();
                    while (lookupClass != null && pf == null) {
                        try {
                            pf = lookupClass.getDeclaredField(payloadField);
                        } catch (NoSuchFieldException nfe) {
                            lookupClass = lookupClass.getSuperclass();
                        }
                    }
                    if (pf != null) {
                        pf.setAccessible(true);
                        Object payloadVal = pf.get(msg);
                        if (payloadVal instanceof byte[]) {
                            com.wakfuassistant.agent.WakfuSpyAgent.decodeProto(simpleType, (byte[]) payloadVal);
                        }
                    }
                } catch (Exception ignored) {}
            }


            // === HDV OFFER INSPECTION (crV) ===
            if ("crV".equals(simpleType)) {
                try {
                    java.lang.reflect.Field mgEField = null;
                    Class<?> mc = msg.getClass();
                    while (mc != null) {
                        try { mgEField = mc.getDeclaredField("mgE"); break; }
                        catch (NoSuchFieldException e2) { mc = mc.getSuperclass(); }
                    }
                    if (mgEField != null) {
                        mgEField.setAccessible(true);
                        Object mgE = mgEField.get(msg);
                        if (mgE instanceof java.util.Map) {
                            java.util.Map<?,?> offers = (java.util.Map<?,?>) mgE;
                            for (java.util.Map.Entry<?,?> entry : offers.entrySet()) {
                                Object offerObj = entry.getValue();
                                if (offerObj == null) continue;
                                Class<?> oc = offerObj.getClass();
                                StringBuilder hdvSb = new StringBuilder();
                                hdvSb.append("{\"offerId\":\"").append(entry.getKey()).append("\",\"class\":\"").append(oc.getName()).append("\",\"ts\":\"");
                                hdvSb.append(new java.text.SimpleDateFormat("HH:mm:ss.SSS").format(new java.util.Date())).append("\"");
                                // Inspect ALL fields of the offer object
                                Class<?> walk = oc;
                                hdvSb.append(",\"fields\":{");
                                boolean first = true;
                                while (walk != null && !walk.equals(Object.class)) {
                                    for (java.lang.reflect.Field f : walk.getDeclaredFields()) {
                                        if (java.lang.reflect.Modifier.isStatic(f.getModifiers())) continue;
                                        try {
                                            f.setAccessible(true);
                                            Object val = f.get(offerObj);
                                            if (!first) hdvSb.append(",");
                                            first = false;
                                            hdvSb.append("\"").append(f.getName()).append("\":");
                                            if (val == null) hdvSb.append("null");
                                            else if (val instanceof Number) hdvSb.append(val);
                                            else if (val instanceof Boolean) hdvSb.append(val);
                                            else if (val instanceof String) hdvSb.append("\"").append(((String)val).replace("\"","\\\"")).append("\"");
                                            else if (val instanceof byte[]) hdvSb.append("\"byte[").append(((byte[])val).length).append("]\"");
                                            else {
                                                String sv = String.valueOf(val);
                                                if (sv.length() > 300) sv = sv.substring(0, 300);
                                                hdvSb.append("\"").append(sv.replace("\"","\\\"").replace("\n"," ")).append("\"");
                                            }
                                        } catch (Exception fx) {
                                            if (!first) hdvSb.append(",");
                                            first = false;
                                            hdvSb.append("\"").append(f.getName()).append("\":\"ERR\"");
                                        }
                                    }
                                    walk = walk.getSuperclass();
                                }
                                hdvSb.append("}}");
                                // Write to file using pure JDK
                                java.io.File hdvDir = new java.io.File("logs");
                                hdvDir.mkdirs();
                                try (java.io.FileWriter fw2 = new java.io.FileWriter(new java.io.File(hdvDir, "wakfu_hdv_offers.jsonl"), true)) {
                                    fw2.write(hdvSb.toString());
                                    fw2.write("\n");
                                }
                            }
                        }
                    }
                } catch (Exception hdvEx) {
                    // Log error to file
                    try (java.io.FileWriter fw3 = new java.io.FileWriter(new java.io.File("logs", "wakfu_hdv_offers.jsonl"), true)) {
                        fw3.write("{\"error\":\"" + hdvEx.getClass().getName() + ": " + hdvEx.getMessage() + "\"}\n");
                    } catch (Exception ignored2) {}
                }
            }
            // === FIN HDV OFFER INSPECTION ===

        } catch (Exception e) {
            // silent
        }
    }
}
