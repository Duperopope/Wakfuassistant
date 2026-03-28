package com.wakfuassistant.agent;

import net.bytebuddy.asm.Advice;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CmyDnAdvice {

    static final String LOG_PROTO = "H:\\Code\\Wakfuassistant\\logs\\market_v3_proto.log";
    static final String LOG_MAIN  = "H:\\Code\\Wakfuassistant\\logs\\market_v3.log";

    @Advice.OnMethodEnter
    public static void onEnter(@Advice.This Object self, @Advice.Argument(0) byte[] rawBytes) {
        try {
            String ts = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
            String className = self.getClass().getSimpleName();

            int msgId = -1;
            try {
                Method dMethod = self.getClass().getMethod("d");
                msgId = ((Number) dMethod.invoke(self)).intValue();
            } catch (Exception e) {
                try {
                    Method dMethod = self.getClass().getSuperclass().getMethod("d");
                    msgId = ((Number) dMethod.invoke(self)).intValue();
                } catch (Exception e2) {
                    Class<?> cls = self.getClass();
                    while (cls != null) {
                        try {
                            Method m = cls.getDeclaredMethod("d");
                            m.setAccessible(true);
                            msgId = ((Number) m.invoke(self)).intValue();
                            break;
                        } catch (Exception ignore) {}
                        cls = cls.getSuperclass();
                    }
                }
            }

            String msgType = "UNKNOWN";
            if (msgId == 12294) msgType = "MARKET_ENTRIES";
            else if (msgId == 13653) msgType = "MARKET_OFFERS";
            else if (msgId == 13503) msgType = "KAMAS_UPDATE";   // ctu - solde kamas (meu=long)
            else msgType = "OTHER_" + msgId;

            String logLine = ts + "|" + className + "|msgId=" + msgId + "|type=" + msgType
                + "|rawSize=" + rawBytes.length;

            synchronized (CmyDnAdvice.class) {
                try (java.io.PrintWriter pw = new java.io.PrintWriter(new java.io.FileWriter(LOG_MAIN, true))) {
                    pw.println(logLine);
                } catch (Exception ignore) {}
            }

            if (msgId == 12294 || msgId == 13653 || msgId == 13503) {
                if (rawBytes.length >= 6) {
                    int status = rawBytes[0] & 0xFF;
                    int protoLen = ((rawBytes[1] & 0xFF) << 24)
                                 | ((rawBytes[2] & 0xFF) << 16)
                                 | ((rawBytes[3] & 0xFF) << 8)
                                 | (rawBytes[4] & 0xFF);

                    String protoHex = "";
                    if (protoLen > 0 && protoLen <= rawBytes.length - 5) {
                        byte[] protoBytes = new byte[protoLen];
                        System.arraycopy(rawBytes, 5, protoBytes, 0, protoLen);
                        StringBuilder sb = new StringBuilder(protoLen * 2);
                        for (byte b : protoBytes) {
                            sb.append(String.format("%02X", b & 0xFF));
                        }
                        protoHex = sb.toString();
                    }

                    String protoLine = ts + "|" + className + "|msgId=" + msgId
                        + "|type=" + msgType
                        + "|status=" + status
                        + "|protoLen=" + protoLen
                        + "|rawSize=" + rawBytes.length
                        + "|PROTOHEX=" + protoHex;

                    synchronized (CmyDnAdvice.class) {
                        try (java.io.PrintWriter pw = new java.io.PrintWriter(new java.io.FileWriter(LOG_PROTO, true))) {
                            pw.println(protoLine);
                        } catch (Exception ignore) {}
                    }
                }
            }

        } catch (Exception e) {
            try {
                synchronized (CmyDnAdvice.class) {
                    try (java.io.PrintWriter pw = new java.io.PrintWriter(new java.io.FileWriter(LOG_MAIN, true))) {
                        pw.println("ERROR_CMY|" + e.getClass().getSimpleName() + "|" + e.getMessage());
                    } catch (Exception ignore) {}
                }
            } catch (Exception ignore) {}
        }
    }
}
