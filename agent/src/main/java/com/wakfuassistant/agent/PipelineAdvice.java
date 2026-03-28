package com.wakfuassistant.agent;

import net.bytebuddy.asm.Advice;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * PipelineAdvice V3.1 - Handlers secondaires (aXh, aXi, etc.)
 * 
 * Meme contrainte que ChannelReadAdvice: tout inline, JDK uniquement.
 */
public class PipelineAdvice {

    @Advice.OnMethodEnter(suppress = Throwable.class)
    public static void onEnter(
            @Advice.Argument(0) Object firstArg) {

        try {
            // firstArg peut etre ChannelHandlerContext ou le message selon la signature
            Object msg = firstArg;
            String msgType = msg.getClass().getName();
            String simpleType = msgType.contains(".") ? msgType.substring(msgType.lastIndexOf('.') + 1) : msgType;
            String timestamp = new java.text.SimpleDateFormat("HH:mm:ss.SSS")
                .format(new java.util.Date());

            StringBuilder sb = new StringBuilder(1024);
            sb.append(timestamp).append("|PIPE|").append(simpleType);

            // Extraire les champs primitifs/numériques
            Field[] fields = msg.getClass().getDeclaredFields();
            int count = 0;
            for (Field f : fields) {
                if (Modifier.isStatic(f.getModifiers())) continue;
                count++;
                if (count > 15) { sb.append("|..."); break; }
                try {
                    f.setAccessible(true);
                    Object val = f.get(msg);
                    if (val == null) {
                        sb.append("|").append(f.getName()).append("=null");
                    } else if (val instanceof Number || val instanceof Boolean) {
                        sb.append("|").append(f.getName()).append("=").append(val);
                    } else if (val instanceof String) {
                        String s = (String) val;
                        sb.append("|").append(f.getName()).append("=\"").append(
                            s.length() > 50 ? s.substring(0, 50) + "..." : s).append("\"");
                    } else {
                        sb.append("|").append(f.getName()).append("=").append(val.getClass().getSimpleName());
                    }
                } catch (Throwable ignore) {
                    sb.append("|").append(f.getName()).append("=<err>");
                }
            }

            String logLine = sb.toString();

            try {
                java.io.FileWriter fw = new java.io.FileWriter(
                    "H:\\Code\\Wakfuassistant\\agent\\logs\\wakfu_messages.log", true);
                fw.write(logLine + "\n");
                fw.close();
            } catch (Throwable ignore) {}

        } catch (Throwable t) {
            try {
                java.io.FileWriter fw = new java.io.FileWriter(
                    "H:\\Code\\Wakfuassistant\\agent\\logs\\wakfu_agent_spy.log", true);
                fw.write("[PIPE ADVICE ERROR] " + t.getClass().getName() + ": " + t.getMessage() + "\n");
                fw.close();
            } catch (Throwable ignore) {}
        }
    }
}
