package com.wakfu.agent;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.matcher.ElementMatchers;
import java.io.*;
import java.lang.instrument.Instrumentation;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MarketPriceAgentV2 {

    public static void premain(String args, Instrumentation inst) {
        try {
            // Creer les dossiers de logs
            new File("H:\\Code\\Wakfuassistant\\logs").mkdirs();
            
            String ts = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String logPath = "H:\\Code\\Wakfuassistant\\logs\\market_v22_all.log";
            
            try (PrintWriter pw = new PrintWriter(new FileWriter(logPath, true))) {
                pw.println("=== MARKET PRICE AGENT V2.2 STARTED === " + ts);
                pw.println("Mode: FULL CAPTURE - tous les messages Netty");
            }
            
            // Intercepter aDj.channelRead0 (handler Netty principal)
            new AgentBuilder.Default()
                .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
                .type(ElementMatchers.named("aDj"))
                .transform((builder, typeDescription, classLoader, module, protectionDomain) ->
                    builder.visit(Advice.to(MarketNettyAdvice.class)
                        .on(ElementMatchers.named("channelRead0")))
                )
                .installOn(inst);
            
            try (PrintWriter pw = new PrintWriter(new FileWriter(logPath, true))) {
                pw.println("Hook installe sur aDj.channelRead0 - capture de TOUS les messages");
            }
            
        } catch (Throwable t) {
            try {
                try (PrintWriter pw = new PrintWriter(new FileWriter(
                    "H:\\Code\\Wakfuassistant\\logs\\market_v22_errors.log", true))) {
                    pw.println("STARTUP ERROR: " + t.getMessage());
                    t.printStackTrace(pw);
                }
            } catch (Throwable ignore) {}
        }
    }
}
