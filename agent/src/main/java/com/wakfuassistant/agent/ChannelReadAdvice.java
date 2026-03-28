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
                String hdvOfferPath = "H:\\Code\\Wakfuassistant\\agent\\logs\\wakfu_hdv_offers.jsonl";
                String hdvErrorPath = "H:\\Code\\Wakfuassistant\\agent\\logs\\wakfu_hdv_errors.log";
                try {
                    // 1. Trouver le champ mgE
                    java.lang.reflect.Field mgEField = null;
                    Class<?> mc = msg.getClass();
                    while (mc != null && mgEField == null) {
                        try { mgEField = mc.getDeclaredField("mgE"); }
                        catch (NoSuchFieldException nsfe) { mc = mc.getSuperclass(); }
                    }
                    if (mgEField == null) {
                        try (java.io.FileWriter ew = new java.io.FileWriter(hdvErrorPath, true)) {
                            ew.write(new java.text.SimpleDateFormat("HH:mm:ss.SSS").format(new java.util.Date()) + "|mgE not found in " + msg.getClass().getName() + "\n");
                        }
                    } else {
                        mgEField.setAccessible(true);
                        Object mgEVal = mgEField.get(msg);
                        
                        // 2. Obtenir keys() et get(long) via reflexion (TLongObjectHashMap)
                        java.lang.reflect.Method keysMethod = mgEVal.getClass().getMethod("keys");
                        long[] offerKeys = (long[]) keysMethod.invoke(mgEVal);
                        java.lang.reflect.Method getMethod = mgEVal.getClass().getMethod("get", long.class);
                        
                        String nowTs = new java.text.SimpleDateFormat("HH:mm:ss.SSS").format(new java.util.Date());
                        
                        for (long offerKey : offerKeys) {
                            Object offerObj = getMethod.invoke(mgEVal, offerKey);
                            if (offerObj == null) continue;
                            
                            StringBuilder ob = new StringBuilder(2048);
                            ob.append("{\"ts\":\"").append(nowTs).append("\"");
                            ob.append(",\"offerId\":").append(offerKey);
                            ob.append(",\"offerClass\":\"").append(offerObj.getClass().getName()).append("\"");
                            // Dump class hierarchy
                            ob.append(",\"hierarchy\":\"");
                            Class<?> hc = offerObj.getClass();
                            while (hc != null && !hc.equals(Object.class)) {
                                ob.append(hc.getName()).append("(");
                                int fc = 0;
                                for (java.lang.reflect.Field hf : hc.getDeclaredFields()) {
                                    if (!java.lang.reflect.Modifier.isStatic(hf.getModifiers())) fc++;
                                }
                                ob.append(fc).append("f)");
                                hc = hc.getSuperclass();
                                if (hc != null && !hc.equals(Object.class)) ob.append(" -> ");
                            }
                            ob.append("\"");
                            ob.append(",\"fields\":{");
                            
                            boolean isFirst = true;
                            Class<?> oc = offerObj.getClass();
                            while (oc != null && !oc.equals(Object.class)) {
                                for (java.lang.reflect.Field of : oc.getDeclaredFields()) {
                                    if (java.lang.reflect.Modifier.isStatic(of.getModifiers())) continue;
                                    try {
                                        of.setAccessible(true);
                                        Object ov = of.get(offerObj);
                                        if (!isFirst) ob.append(",");
                                        isFirst = false;
                                        ob.append("\"").append(of.getName()).append("\":");
                                        
                                        if (ov == null) {
                                            ob.append("null");
                                        } else if (ov instanceof Number) {
                                            ob.append(ov);
                                        } else if (ov instanceof Boolean) {
                                            ob.append(ov);
                                        } else if (ov instanceof String) {
                                            ob.append("\"").append(((String)ov).replace("\\","\\\\").replace("\"","\\\"")).append("\"");
                                        } else if (ov instanceof byte[]) {
                                            byte[] ba = (byte[]) ov;
                                            ob.append("\"byte[").append(ba.length).append("]_");
                                            for (int xi = 0; xi < ba.length; xi++) {
                                                int bv = ba[xi] & 0xFF;
                                                ob.append("0123456789ABCDEF".charAt(bv >> 4));
                                                ob.append("0123456789ABCDEF".charAt(bv & 0xF));
                                            }
                                            ob.append("\"");
                                        } else if (ov instanceof int[]) {
                                            int[] ia = (int[]) ov;
                                            ob.append("[");
                                            for (int xi = 0; xi < Math.min(ia.length, 30); xi++) {
                                                if (xi > 0) ob.append(",");
                                                ob.append(ia[xi]);
                                            }
                                            if (ia.length > 30) ob.append(",...(").append(ia.length).append(")");
                                            ob.append("]");
                                        } else if (ov instanceof long[]) {
                                            long[] la = (long[]) ov;
                                            ob.append("[");
                                            for (int xi = 0; xi < Math.min(la.length, 30); xi++) {
                                                if (xi > 0) ob.append(",");
                                                ob.append(la[xi]);
                                            }
                                            if (la.length > 30) ob.append(",...(").append(la.length).append(")");
                                            ob.append("]");
                                        } else {
                                            // Sous-objet: dump ses champs (1 niveau)
                                            Class<?> sc = ov.getClass();
                                            ob.append("{\"_class\":\"").append(sc.getSimpleName()).append("\"");
                                            java.lang.reflect.Field[] sfs = sc.getDeclaredFields();
                                            for (java.lang.reflect.Field sf : sfs) {
                                                if (java.lang.reflect.Modifier.isStatic(sf.getModifiers())) continue;
                                                try {
                                                    sf.setAccessible(true);
                                                    Object sv = sf.get(ov);
                                                    ob.append(",\"").append(sf.getName()).append("\":");
                                                    if (sv == null) ob.append("null");
                                                    else if (sv instanceof Number) ob.append(sv);
                                                    else if (sv instanceof Boolean) ob.append(sv);
                                                    else if (sv instanceof String) ob.append("\"").append(((String)sv).replace("\\","\\\\").replace("\"","\\\"")).append("\"");
                                                    else ob.append("\"").append(sv.getClass().getSimpleName()).append("\"");
                                                } catch (Exception sfx) {
                                                    ob.append(",\"").append(sf.getName()).append("\":\"ERR\"");
                                                }
                                            }
                                            ob.append("}");
                                        }
                                    } catch (Exception fx) {
                                        if (!isFirst) ob.append(",");
                                        isFirst = false;
                                        ob.append("\"").append(of.getName()).append("\":\"ERROR:").append(fx.getClass().getSimpleName()).append("\"");
                                    }
                                }
                                oc = oc.getSuperclass();
                            }
                            ob.append("}}");
                            
                            try (java.io.FileWriter ofw = new java.io.FileWriter(hdvOfferPath, true)) {
                                ofw.write(ob.toString());
                                ofw.write("\n");
                                ofw.flush();
                            }
                        }
                    }
                } catch (Exception hdvEx) {
                    try (java.io.FileWriter ew2 = new java.io.FileWriter(hdvErrorPath, true)) {
                        java.io.StringWriter sw2 = new java.io.StringWriter();
                        hdvEx.printStackTrace(new java.io.PrintWriter(sw2));
                        ew2.write(new java.text.SimpleDateFormat("HH:mm:ss.SSS").format(new java.util.Date()) + "|" + sw2.toString().replace("\n"," | ") + "\n");
                    } catch (Exception ign) {}
                }
            }
            // === FIN HDV OFFER INSPECTION ===







            

        } catch (Exception e) {
            // silent
        }
    }
}
