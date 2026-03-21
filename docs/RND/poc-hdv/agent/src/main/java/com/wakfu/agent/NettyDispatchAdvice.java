package com.wakfu.agent;

import net.bytebuddy.asm.Advice;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NettyDispatchAdvice {

    @Advice.OnMethodEnter
    public static void intercept(@Advice.Argument(1) Object msg) {
        try {
            String className = msg.getClass().getSimpleName();
            String ts = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());

            // Log leger : juste le type et la taille
            MarketPriceAgentV3.log(ts + "|NETTY|" + className + "|dispatch");

        } catch (Exception e) {
            // Silently ignore
        }
    }
}
