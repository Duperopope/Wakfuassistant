package com.wakfu.agent;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.matcher.ElementMatchers;
import java.lang.instrument.Instrumentation;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MarketPriceAgentV3 {

    static final String LOG_DIR = "H:\\Code\\Wakfuassistant\\logs";
    static final String LOG_MAIN = LOG_DIR + "\\market_v3.log";
    static final String LOG_PROTO = LOG_DIR + "\\market_v3_proto.log";

    public static void premain(String args, Instrumentation inst) {
        log("=== MARKET PRICE AGENT V3 STARTED === " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        log("Strategy: Hook cmy.dn(byte[]) + d() pour capturer le protobuf HDV");

        // Creer le dossier logs
        new File(LOG_DIR).mkdirs();

        // === HOOK 1 : cmy.dn(byte[]) - le decodeur parent de TOUTES les reponses HDV ===
        // cmy.dn() recoit le byte[] brut : [1 byte status][4 bytes length][protobuf...]
        // Puis appelle fd(ByteBuffer) qui dans clX lit le protobuf via mg.bV()
        new AgentBuilder.Default()
            .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
            .type(ElementMatchers.named("cmy"))
            .transform((builder, typeDescription, classLoader, module, protectionDomain) ->
                builder.method(ElementMatchers.named("dn")
                    .and(ElementMatchers.takesArguments(byte[].class)))
                .intercept(Advice.to(CmyDnAdvice.class))
            )
            .installOn(inst);
        log("Hook 1 installe: cmy.dn(byte[])");

        // === HOOK 2 : aDj.channelRead0 - le dispatch Netty (garde du V2.2 pour contexte) ===
        new AgentBuilder.Default()
            .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
            .type(ElementMatchers.named("aDj"))
            .transform((builder, typeDescription, classLoader, module, protectionDomain) ->
                builder.method(ElementMatchers.named("channelRead0"))
                .intercept(Advice.to(NettyDispatchAdvice.class))
            )
            .installOn(inst);
        log("Hook 2 installe: aDj.channelRead0 (contexte)");

        log("Agent V3 pret. En attente de messages HDV...");
    }

    public static void log(String message) {
        try {
            synchronized (MarketPriceAgentV3.class) {
                try (PrintWriter pw = new PrintWriter(new FileWriter(LOG_MAIN, true))) {
                    pw.println(message);
                }
            }
        } catch (Exception e) {
            System.err.println("[V3-AGENT] Log error: " + e.getMessage());
        }
    }

    public static void logProto(String message) {
        try {
            synchronized (MarketPriceAgentV3.class) {
                try (PrintWriter pw = new PrintWriter(new FileWriter(LOG_PROTO, true))) {
                    pw.println(message);
                }
            }
        } catch (Exception e) {
            System.err.println("[V3-AGENT] Proto log error: " + e.getMessage());
        }
    }

    public static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) {
            sb.append(String.format("%02X", b & 0xFF));
        }
        return sb.toString();
    }
}
