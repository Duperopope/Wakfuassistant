package com.wakfu.agent;

import net.bytebuddy.asm.Advice;
import java.lang.reflect.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MarketNettyAdvice {

    @Advice.OnMethodEnter
    public static void intercept(@Advice.Argument(1) Object msg) {
        try {
            String className = msg.getClass().getSimpleName();
            String ts = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
            
            // === LOG DE BASE POUR TOUS LES MESSAGES ===
            StringBuilder logLine = new StringBuilder();
            logLine.append(ts).append("|").append(className).append("|");
            
            // Extraire TOUS les champs de l'objet
            StringBuilder fieldsInfo = new StringBuilder();
            StringBuilder hexDump = new StringBuilder();
            byte[] biggestByteArray = null;
            String biggestFieldName = "";
            int msgIdValue = -1;
            
            Field[] fields = msg.getClass().getDeclaredFields();
            for (Field f : fields) {
                f.setAccessible(true);
                Object val = f.get(msg);
                String fname = f.getName();
                
                if (val == null) {
                    fieldsInfo.append(fname).append("=null|");
                } else if (val instanceof byte[]) {
                    byte[] arr = (byte[]) val;
                    fieldsInfo.append(fname).append("=byte[").append(arr.length).append("]|");
                    // Garder le plus gros byte[] (payload principal)
                    if (biggestByteArray == null || arr.length > biggestByteArray.length) {
                        biggestByteArray = arr;
                        biggestFieldName = fname;
                    }
                } else if (val instanceof java.util.List) {
                    java.util.List<?> list = (java.util.List<?>) val;
                    fieldsInfo.append(fname).append("=List[").append(list.size()).append("]|");
                    // Explorer les elements de la liste
                    for (int i = 0; i < Math.min(list.size(), 3); i++) {
                        Object elem = list.get(i);
                        if (elem != null) {
                            fieldsInfo.append(fname).append("[").append(i).append("]=").append(elem.getClass().getSimpleName()).append("{");
                            Field[] elemFields = elem.getClass().getDeclaredFields();
                            for (Field ef : elemFields) {
                                ef.setAccessible(true);
                                Object ev = ef.get(elem);
                                if (ev instanceof byte[]) {
                                    byte[] earr = (byte[]) ev;
                                    fieldsInfo.append(ef.getName()).append("=byte[").append(earr.length).append("],");
                                    if (biggestByteArray == null || earr.length > biggestByteArray.length) {
                                        biggestByteArray = earr;
                                        biggestFieldName = fname + "[" + i + "]." + ef.getName();
                                    }
                                } else {
                                    fieldsInfo.append(ef.getName()).append("=").append(ev).append(",");
                                }
                            }
                            fieldsInfo.append("}|");
                        }
                    }
                } else {
                    fieldsInfo.append(fname).append("=").append(val).append("|");
                    // Detecter msgId / identifiant
                    if (fname.equals("mfZ") || fname.contains("Id") || fname.contains("id")) {
                        try {
                            msgIdValue = ((Number) val).intValue();
                        } catch (Exception ignore) {}
                    }
                }
            }
            
            logLine.append("fields=").append(fields.length).append("|").append(fieldsInfo);
            
            // === HEX DUMP du plus gros byte[] ===
            if (biggestByteArray != null && biggestByteArray.length > 0) {
                hexDump.append("PAYLOAD_FIELD=").append(biggestFieldName);
                hexDump.append("|SIZE=").append(biggestByteArray.length);
                hexDump.append("|HEX=");
                for (int i = 0; i < biggestByteArray.length; i++) {
                    hexDump.append(String.format("%02X", biggestByteArray[i] & 0xFF));
                }
                logLine.append(hexDump);
            }
            
            // === ECRIRE DANS LE LOG PRINCIPAL ===
            String logPath = "H:\\Code\\Wakfuassistant\\logs\\market_v22_all.log";
            synchronized (MarketNettyAdvice.class) {
                try (PrintWriter pw = new PrintWriter(new FileWriter(logPath, true))) {
                    pw.println(logLine.toString());
                }
            }
            
            // === ECRIRE LE JSON POUR LES MESSAGES AVEC PAYLOAD ===
            if (biggestByteArray != null && biggestByteArray.length > 50) {
                String jsonPath = "H:\\Code\\Wakfuassistant\\logs\\market_v22_payloads.json";
                
                // Decoder le protobuf en inline (champs principaux)
                byte[] data = biggestByteArray;
                int pos = 0;
                StringBuilder decoded = new StringBuilder();
                int fieldCount = 0;
                
                while (pos < data.length && fieldCount < 30) {
                    // Lire le tag varint
                    long tag = 0;
                    int shift = 0;
                    while (pos < data.length) {
                        byte b = data[pos++];
                        tag |= ((long)(b & 0x7F)) << shift;
                        shift += 7;
                        if ((b & 0x80) == 0) break;
                    }
                    
                    int fieldNum = (int)(tag >>> 3);
                    int wireType = (int)(tag & 0x07);
                    
                    if (fieldNum == 0 || fieldNum > 100) break;
                    
                    switch (wireType) {
                        case 0: // VARINT
                            long varint = 0;
                            shift = 0;
                            while (pos < data.length) {
                                byte b = data[pos++];
                                varint |= ((long)(b & 0x7F)) << shift;
                                shift += 7;
                                if ((b & 0x80) == 0) break;
                            }
                            long signed = (varint >>> 1) ^ -(varint & 1);
                            decoded.append("\"F").append(fieldNum).append("\":").append(signed).append(",");
                            break;
                        case 1: // FIX64
                            pos += 8;
                            decoded.append("\"F").append(fieldNum).append("_fix64\":true,");
                            break;
                        case 2: // LENGTH DELIMITED
                            long len = 0;
                            shift = 0;
                            while (pos < data.length) {
                                byte b = data[pos++];
                                len |= ((long)(b & 0x7F)) << shift;
                                shift += 7;
                                if ((b & 0x80) == 0) break;
                            }
                            if (len > 0 && len < 500 && pos + len <= data.length) {
                                // Tenter de decoder comme sous-message
                                byte[] sub = new byte[(int) len];
                                System.arraycopy(data, pos, sub, 0, (int) len);
                                decoded.append("\"F").append(fieldNum).append("_bytes\":").append(len).append(",");
                                
                                // Decoder les sous-champs
                                int spos = 0;
                                StringBuilder subDecoded = new StringBuilder();
                                int subCount = 0;
                                while (spos < sub.length && subCount < 15) {
                                    long stag = 0;
                                    int sshift = 0;
                                    while (spos < sub.length) {
                                        byte sb = sub[spos++];
                                        stag |= ((long)(sb & 0x7F)) << sshift;
                                        sshift += 7;
                                        if ((sb & 0x80) == 0) break;
                                    }
                                    int sfn = (int)(stag >>> 3);
                                    int swt = (int)(stag & 0x07);
                                    if (sfn == 0 || sfn > 100) break;
                                    
                                    if (swt == 0) {
                                        long sv = 0;
                                        sshift = 0;
                                        while (spos < sub.length) {
                                            byte sb = sub[spos++];
                                            sv |= ((long)(sb & 0x7F)) << sshift;
                                            sshift += 7;
                                            if ((sb & 0x80) == 0) break;
                                        }
                                        long ssigned = (sv >>> 1) ^ -(sv & 1);
                                        subDecoded.append("\"F").append(fieldNum).append(".F").append(sfn).append("\":").append(ssigned).append(",");
                                    } else if (swt == 2) {
                                        long slen = 0;
                                        sshift = 0;
                                        while (spos < sub.length) {
                                            byte sb = sub[spos++];
                                            slen |= ((long)(sb & 0x7F)) << sshift;
                                            sshift += 7;
                                            if ((sb & 0x80) == 0) break;
                                        }
                                        if (slen >= 0 && spos + slen <= sub.length) {
                                            spos += (int) slen;
                                            subDecoded.append("\"F").append(fieldNum).append(".F").append(sfn).append("_sub\":").append(slen).append(",");
                                        } else break;
                                    } else if (swt == 1) {
                                        spos += 8;
                                    } else if (swt == 5) {
                                        spos += 4;
                                    } else break;
                                    subCount++;
                                }
                                decoded.append(subDecoded);
                                pos += (int) len;
                            } else {
                                if (len >= 0 && pos + len <= data.length) pos += (int) len;
                                else break;
                            }
                            break;
                        case 5: // FIX32
                            pos += 4;
                            decoded.append("\"F").append(fieldNum).append("_fix32\":true,");
                            break;
                        default:
                            fieldCount = 100; // stop
                            break;
                    }
                    fieldCount++;
                }
                
                // Construire le JSON final
                String json = "{\"ts\":\"" + ts + "\",\"msgType\":\"" + className + 
                    "\",\"msgId\":" + msgIdValue + 
                    ",\"payloadField\":\"" + biggestFieldName + 
                    "\",\"payloadSize\":" + biggestByteArray.length + 
                    "," + decoded.toString() + 
                    "\"_end\":true}";
                
                synchronized (MarketNettyAdvice.class) {
                    try (PrintWriter pw = new PrintWriter(new FileWriter(jsonPath, true))) {
                        pw.println(json);
                    }
                }
            }
            
        } catch (Throwable t) {
            try {
                String errPath = "H:\\Code\\Wakfuassistant\\logs\\market_v22_errors.log";
                try (PrintWriter pw = new PrintWriter(new FileWriter(errPath, true))) {
                    pw.println(new SimpleDateFormat("HH:mm:ss.SSS").format(new Date()) + "|ERROR|" + t.getMessage());
                    t.printStackTrace(pw);
                }
            } catch (Throwable ignore) {}
        }
    }
}
