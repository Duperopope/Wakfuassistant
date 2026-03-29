package com.wakfuassistant.agent;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.matcher.ElementMatchers;

/**
 * CacheBooster v1.1 - Anti micro-freeze pour Wakfu
 *
 * Probleme identifie:
 *   - Cache maps (aaq_0, adk): expire apres 30s -> rechargement constant depuis JAR
 *   - Cache textures (awm_1): TLongObjectHashMap(1024) -> trop petit pour 15461 textures
 *
 * Solution:
 *   1. Intercepte CacheBuilder.expireAfterAccess: 30s -> 600s (10 min)
 *   2. Intercepte CacheBuilder.maximumSize: x4
 *   3. Boost le cache textures: 1024 -> 8192 slots
 */
public class CacheBoosterAdvice {

    private static Instrumentation savedInst;
    private static volatile boolean initialized = false;
    private static final String LOG_DIR = System.getProperty("user.dir") + "/agent/logs";
    private static final String LOG_FILE = LOG_DIR + "/cache_booster.log";
    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
    private static volatile int cacheBoosts = 0;
    private static volatile int textureBoosts = 0;

    private static void log(String msg) {
        try {
            new java.io.File(LOG_DIR).mkdirs();
            try (PrintWriter pw = new PrintWriter(new FileWriter(LOG_FILE, true))) {
                pw.println(LocalTime.now().format(FMT) + " [CACHE] " + msg);
            }
        } catch (Exception ignored) {}
    }

    /**
     * Cherche le TextureManager par sa signature: methode statique bPn() + champ TLongObjectHashMap
     */
    private static Class<?> findTextureManagerBySignature() {
        if (savedInst == null) return null;
        Class<?>[] allClasses = savedInst.getAllLoadedClasses();
        log("TEXTURE_BOOST: recherche par signature parmi " + allClasses.length + " classes...");
        int scanned = 0;
        for (Class<?> c : allClasses) {
            String name = c.getName();
            if (name.contains(".") || name.length() > 10) continue;
            scanned++;
            try {
                Method m = c.getDeclaredMethod("bPn");
                if (m != null && Modifier.isStatic(m.getModifiers())) {
                    for (Field f : c.getDeclaredFields()) {
                        if (f.getType().getName().contains("TLongObjectHashMap")) {
                            log("TEXTURE_BOOST: MATCH par signature: " + name + " (bPn + TLongObjectHashMap)");
                            return c;
                        }
                    }
                }
            } catch (NoSuchMethodException ignored) {
            } catch (Exception ignored) {}
        }
        log("TEXTURE_BOOST: scan termine, " + scanned + " classes courtes, aucun match");
        return null;
    }

    /**
     * Cherche une classe par nom exact via Instrumentation
     */
    private static Class<?> findClassByName(String name) {
        if (savedInst == null) return null;
        for (Class<?> c : savedInst.getAllLoadedClasses()) {
            if (c.getName().equals(name)) {
                log("findClassByName: FOUND " + name + " (loader=" + c.getClassLoader() + ")");
                return c;
            }
        }
        return null;
    }

    /**
     * Boost le cache textures de 1024 a 8192 slots
     */
    public static void boostTextureManager() {
        try {
            String[] candidates = {"awm_1", "awm$1", "awm", "awm_0", "awm_2"};
            Class<?> texMgr = null;
            for (String name : candidates) {
                texMgr = findClassByName(name);
                if (texMgr != null) break;
            }
            if (texMgr == null) {
                texMgr = findTextureManagerBySignature();
            }
            if (texMgr == null) {
                log("TEXTURE_BOOST: TextureManager introuvable");
                return;
            }
            log("TEXTURE_BOOST: classe trouvee = " + texMgr.getName());

            Method getInstance = texMgr.getMethod("bPn");
            Object instance = getInstance.invoke(null);
            if (instance != null) {
                for (Field field : texMgr.getDeclaredFields()) {
                    if (field.getType().getName().contains("TLongObjectHashMap")) {
                        field.setAccessible(true);
                        Object hashMap = field.get(instance);
                        if (hashMap != null) {
                            Method ensureCap = hashMap.getClass().getMethod("ensureCapacity", int.class);
                            ensureCap.invoke(hashMap, 8192);
                            textureBoosts++;
                            log("TEXTURE_BOOST: " + texMgr.getName() + "." + field.getName() + " capacity -> 8192 (was 1024)");
                        }
                    }
                }
            }
        } catch (Exception e) {
            log("TEXTURE_BOOST: echec - " + e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    /**
     * Intercepte expireAfterAccess pour etendre les durees de cache
     */
    public static class ExpireAdvice {
        @Advice.OnMethodEnter
        static void onEnter(@Advice.Argument(value = 0, readOnly = false) long duration,
                           @Advice.Argument(value = 1, readOnly = false) TimeUnit unit) {
            long seconds = unit.toSeconds(duration);
            if (seconds > 0 && seconds <= 120) {
                duration = 600;
                unit = TimeUnit.SECONDS;
            }
        }
    }

    /**
     * Intercepte maximumSize pour augmenter la capacite des caches
     */
    public static class MaxSizeAdvice {
        @Advice.OnMethodEnter
        static void onEnter(@Advice.Argument(value = 0, readOnly = false) long size) {
            if (size > 0 && size < 100000) {
                size = size * 4;
            }
        }
    }

    /**
     * Installe les intercepteurs et lance le boost textures
     */
    public static void install(Instrumentation inst) {
        savedInst = inst;
        if (initialized) return;
        initialized = true;
        log("=== CacheBooster v1.1 ===");
        log("Cibles: CacheBuilder.expireAfterAccess (30s->600s), CacheBuilder.maximumSize (x4)");

        try {
            new AgentBuilder.Default()
                .type(ElementMatchers.nameContains("CacheBuilder"))
                .transform((builder, typeDescription, classLoader, module, protectionDomain) ->
                    builder
                        .visit(Advice.to(ExpireAdvice.class)
                            .on(ElementMatchers.named("expireAfterAccess")))
                        .visit(Advice.to(MaxSizeAdvice.class)
                            .on(ElementMatchers.named("maximumSize")))
                )
                .installOn(inst);
            log("Intercepteurs CacheBuilder installes");
        } catch (Exception e) {
            log("ERREUR intercepteurs: " + e.getMessage());
        }

        Thread boostThread = new Thread(() -> {
            try {
                Thread.sleep(30000);
                boostTextureManager();
                while (!Thread.interrupted()) {
                    Thread.sleep(300000);
                    log("STATS: cacheBoosts=" + cacheBoosts + " textureBoosts=" + textureBoosts);
                }
            } catch (InterruptedException ignored) {}
        });
        boostThread.setDaemon(true);
        boostThread.setPriority(Thread.MIN_PRIORITY);
        boostThread.setName("CacheBooster-Monitor");
        boostThread.start();
        log("CacheBooster thread demarre (boost textures dans 30s)");
    }
}
