package com.wakfu.agent;

import net.bytebuddy.asm.Advice;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CmyDnAdvice {

    @Advice.OnMethodEnter
    public static void onEnter(@Advice.This Object self, @Advice.Argument(0) byte[] rawBytes) {
        try {
            String ts = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
            String className = self.getClass().getSimpleName();

            // Recuperer le message ID via la methode d()
            int msgId = -1;
            try {
                Method dMethod = self.getClass().getMethod("d");
                msgId = ((Number) dMethod.invoke(self)).intValue();
            } catch (Exception e) {
                try {
                    Method dMethod = self.getClass().getSuperclass().getMethod("d");
                    msgId = ((Number) dMethod.invoke(self)).intValue();
                } catch (Exception e2) {
                    // Chercher dans toute la hierarchie
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

            // Identifier le type de message
            String msgType = "UNKNOWN";
            if (msgId == 12294) msgType = "MARKET_ENTRIES";  // clX - les items en vente avec prix
            else if (msgId == 13653) msgType = "MARKET_OFFERS"; // clU - les offres d'achat
            else msgType = "OTHER_" + msgId;

            // Log de base dans le log principal
            String logLine = ts + "|" + className + "|msgId=" + msgId + "|type=" + msgType
                + "|rawSize=" + rawBytes.length + "|HEX=" + MarketPriceAgentV3.bytesToHex(rawBytes);
            MarketPriceAgentV3.log(logLine);

            // === POUR LES MESSAGES HDV (12294 et 13653) : log detaille dans proto log ===
            if (msgId == 12294 || msgId == 13653) {
                // Le format de rawBytes est :
                //   byte[0] = status (fiY enum)
                //   byte[1..4] = int32 BE = longueur du protobuf
                //   byte[5..5+len] = LE PROTOBUF PUR (mg ou mI)
                //   dernier byte = fjc enum

                if (rawBytes.length >= 6) {
                    int status = rawBytes[0] & 0xFF;

                    // Lire la longueur en big-endian int32
                    int protoLen = ((rawBytes[1] & 0xFF) << 24)
                                 | ((rawBytes[2] & 0xFF) << 16)
                                 | ((rawBytes[3] & 0xFF) << 8)
                                 | (rawBytes[4] & 0xFF);

                    String protoHex = "";
                    if (protoLen > 0 && protoLen <= rawBytes.length - 5) {
                        byte[] protoBytes = new byte[protoLen];
                        System.arraycopy(rawBytes, 5, protoBytes, 0, protoLen);
                        protoHex = MarketPriceAgentV3.bytesToHex(protoBytes);
                    }

                    // Format : timestamp|class|msgId|type|status|protoLen|PROTOHEX=...
                    String protoLine = ts + "|" + className + "|msgId=" + msgId
                        + "|type=" + msgType
                        + "|status=" + status
                        + "|protoLen=" + protoLen
                        + "|rawSize=" + rawBytes.length
                        + "|PROTOHEX=" + protoHex;
                    MarketPriceAgentV3.logProto(protoLine);

                    // Log aussi un marqueur visible
                    MarketPriceAgentV3.log(">>> HDV_PROTO|" + msgType + "|protoLen=" + protoLen
                        + "|status=" + status);
                }
            }

        } catch (Exception e) {
            try {
                MarketPriceAgentV3.log("ERROR_CMY|" + e.getClass().getSimpleName() + "|" + e.getMessage());
            } catch (Exception ignore) {}
        }
    }
}
