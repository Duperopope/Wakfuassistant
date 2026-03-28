package com.wakfuassistant.agent;

import net.bytebuddy.asm.Advice;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KamasAdvice {

    static final String LOG_PROTO = "H:\\Code\\Wakfuassistant\\logs\\market_v3_proto.log";
    static final String LOG_MAIN  = "H:\\Code\\Wakfuassistant\\logs\\market_v3.log";

    @Advice.OnMethodEnter
    public static void onEnter(@Advice.Argument(0) byte[] rawBytes) {
        try {
            String ts = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());

            // rawBytes = 8 bytes BigEndian = solde kamas exact
            long kamas = 0;
            if (rawBytes != null && rawBytes.length >= 8) {
                for (int i = 0; i < 8; i++) {
                    kamas = (kamas << 8) | (rawBytes[i] & 0xFF);
                }
            }

            // Hex du payload
            StringBuilder sb = new StringBuilder(rawBytes.length * 2);
            for (byte b : rawBytes) {
                sb.append(String.format("%02X", b & 0xFF));
            }

            String line = ts + "|ctu|msgId=13503|type=KAMAS_UPDATE|kamas=" + kamas + "|PROTOHEX=" + sb.toString();

            // Ecrire dans les deux logs
            synchronized (KamasAdvice.class) {
                try (java.io.PrintWriter pw = new java.io.PrintWriter(new java.io.FileWriter(LOG_MAIN, true))) {
                    pw.println(line);
                } catch (Exception ignore) {}
                try (java.io.PrintWriter pw = new java.io.PrintWriter(new java.io.FileWriter(LOG_PROTO, true))) {
                    pw.println(line);
                } catch (Exception ignore) {}
            }
        } catch (Exception e) {
            try {
                synchronized (KamasAdvice.class) {
                    try (java.io.PrintWriter pw = new java.io.PrintWriter(new java.io.FileWriter(LOG_MAIN, true))) {
                        pw.println("ERROR_KAMAS|" + e.getClass().getSimpleName() + "|" + e.getMessage());
                    } catch (Exception ignore) {}
                }
            } catch (Exception ignore) {}
        }
    }
}