package com.wakfuassistant.agent;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.JavaModule;

import java.io.*;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Wakfu Spy Agent V3.1
 * 
 * Architecture:
 *   - Byte Buddy instrument aDj.channelRead0 avec ChannelReadAdvice (INLINE)
 *   - L'advice utilise UNIQUEMENT des classes JDK (java.lang.reflect, java.io)
 *   - Pas d'appel a des classes de l'agent depuis l'advice
 *   - RuntimeScanner tourne en background pour documenter les classes
 *
 * Sources:
 *   - Elastic Blog: https://www.elastic.co/blog/embracing-invokedynamic-to-tame-class-loaders-in-java-agents
 *   - Byte Buddy: https://bytebuddy.net/#/tutorial
 *   - Baeldung: https://www.baeldung.com/byte-buddy
 */
public class WakfuSpyAgent {

    // Fichiers de log (chemins absolus pour acces depuis l'advice inline)
    public static final String LOG_DIR = "H:\\Code\\Wakfuassistant\\agent\\logs";
    public static final String SPY_LOG = LOG_DIR + "\\wakfu_agent_spy.log";
// DISABLED v3 - async only:     public static final String MSG_LOG = LOG_DIR + "\\wakfu_messages.log";
    public static final String HDV_LOG = LOG_DIR + "\\wakfu_hdv.log";

    // Stats globales
    public static final AtomicInteger totalMessages = new AtomicInteger(0);
    public static final AtomicInteger hdvMessages = new AtomicInteger(0);
    public static final Set<String> seenMessageTypes = ConcurrentHashMap.newKeySet();

    // Ecriture thread-safe dans les logs
    private static final Object LOCK = new Object();

    public static void premain(String args, Instrumentation inst) {
        init(inst, "premain");
    }

    public static void agentmain(String args, Instrumentation inst) {
        init(inst, "agentmain");
    }

    private static void init(Instrumentation inst, String mode) {
        try {
            // Creer le dossier de logs
            new File(LOG_DIR).mkdirs();

            log("========================================");
            log("WAKFU SPY AGENT V3.1 DEMARRE (mode: " + mode + ")");
            log("Java version: " + System.getProperty("java.version"));
            log("========================================");

            // --- Phase 1: Discovery passive (ClassFileTransformer simple) ---
            inst.addTransformer(new DiscoveryTransformer(), false);
            log("Phase 1: Discovery transformer OK");

            // --- Phase 2: Byte Buddy intercepte aDj.channelRead0 ---
            log("Installation Byte Buddy V3.1...");
            installByteBuddy(inst);
            log("Byte Buddy V3.1 installe");

            // --- Phase 2b: Netty ByteBuf Release (corrige fuite DirectByteBuffer) ---
            new AgentBuilder.Default()
                .disableClassFormatChanges()
                .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
                .type(ElementMatchers.named("aDj"))
                .transform((builder, type, classLoader, module, protectionDomain) ->
                    builder.visit(Advice.to(NettyReleaseAdvice.class)
                        .on(ElementMatchers.named("channelRead0")))
                )
                .installOn(inst);
            log("Phase 2b: NettyReleaseAdvice installe sur aDj.channelRead0");


            // --- Phase 3: Runtime scanner en background ---
            Thread scanner = new Thread(() -> runtimeScan(inst), "WakfuSpy-Scanner");
            scanner.setDaemon(true);
            scanner.start();
            log("RuntimeScanner demarre");

            // --- Phase 4: Memory Monitor ---
            MemoryMonitorAdvice.start();
            log("Phase 4: Memory Monitor OK");

            // --- Phase 5: Heap Profiler ---
            HeapProfilerAdvice.start();
            log("Phase 5: Heap Profiler OK");

            // --- Phase 6: Cache Booster ---
            CacheBoosterAdvice.install(inst);
            log("Phase 6: Cache Booster OK - anti micro-freeze");
        } catch (Throwable t) {
            log("ERREUR INIT: " + t.getMessage());
            t.printStackTrace();
        }
    }

    /**
     * Installe Byte Buddy pour intercepter:
     *  - aDj (handler Netty principal) -> channelRead0
     *  - aXh, aXi, aXj, aXl, aXm, aXn (handlers pipeline secondaires)
     */
    private static void installByteBuddy(Instrumentation inst) {
        // Classes cibles: le handler principal + handlers pipeline
        String[] targetClasses = {"aDj", "aXh", "aXi", "aXj", "aXl", "aXm", "aXn"};

        AgentBuilder builder = new AgentBuilder.Default()
            .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
            .with(new AgentBuilder.Listener() {
                @Override
                public void onDiscovery(String name, ClassLoader cl, JavaModule mod, boolean loaded) {}
                @Override
                public void onTransformation(TypeDescription td, ClassLoader cl, JavaModule mod, boolean loaded, DynamicType dt) {
                    log("BYTE BUDDY TRANSFORMED: " + td.getName());
                }
                @Override
                public void onIgnored(TypeDescription td, ClassLoader cl, JavaModule mod, boolean loaded) {}
                @Override
                public void onError(String name, ClassLoader cl, JavaModule mod, boolean loaded, Throwable t) {
                    log("BYTE BUDDY ERROR on " + name + ": " + t.getMessage());
                }
                @Override
                public void onComplete(String name, ClassLoader cl, JavaModule mod, boolean loaded) {}
            });

        for (String target : targetClasses) {
            if (target.equals("aDj")) {
                // Handler principal: intercepte channelRead0 avec inspection profonde
                builder = builder.type(ElementMatchers.named(target))
                    .transform((b, td, cl, mod, pd) ->
                        b.visit(Advice.to(ChannelReadAdvice.class)
                            .on(ElementMatchers.named("channelRead0")
                                .or(ElementMatchers.named("a")
                                    .and(ElementMatchers.takesArguments(2)))))
                    );
            } else {
                // Handlers pipeline: inspection legere
                builder = builder.type(ElementMatchers.named(target))
                    .transform((b, td, cl, mod, pd) ->
                        b.visit(Advice.to(PipelineAdvice.class)
                            .on(ElementMatchers.named("channelRead0")
                                .or(ElementMatchers.named("channelRead"))))
                    );
            }
        }

        builder.installOn(inst);
        // === HOOK HDV: cmy.dn(byte[]) — capture protobuf HDV brut ===
        // AgentBuilder SEPARE, exactement comme l'ancien MarketPriceAgentV3
        // qui a capture 82918 offres avec succes. Cible cmy (parent de clX/clU).
        // Au runtime, dn() est appelee avec this=clX (sell) ou this=clU (buy).
        try {
            new AgentBuilder.Default()
                .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
                .type(ElementMatchers.named("cmy"))
                .transform((b2, td2, cl2, mod2, pd2) ->
                    b2.method(ElementMatchers.named("dn")
                        .and(ElementMatchers.takesArguments(byte[].class)))
                    .intercept(Advice.to(CmyDnAdvice.class))
                )
                .installOn(inst);
            log("HOOK HDV installe: cmy.dn(byte[]) -> CmyDnAdvice [PROTO LOG]");
        } catch (Throwable t) {
            log("HOOK HDV ECHEC: " + t.getMessage());
        }
                // === HOOK KAMAS: ctu.dn(byte[]) - solde kamas (msgId 13503) ===
        // ctu extends nr_0 (pas cmy!), field meu = getLong() = solde exact
        try {
            new AgentBuilder.Default()
                .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
                .type(ElementMatchers.named("ctu"))
                .transform((b2, td2, cl2, mod2, pd2) ->
                    b2.method(ElementMatchers.named("dn")
                        .and(ElementMatchers.takesArguments(byte[].class)))
                    .intercept(Advice.to(KamasAdvice.class))
                )
                .installOn(inst);
            log("HOOK KAMAS installe: ctu.dn(byte[]) -> KamasAdvice [msgId 13503]");
        } catch (Throwable t) {
            log("HOOK KAMAS ECHEC: " + t.getMessage());
        }
        
        // === HOOK COMBAT SPELLS: crq.dn(byte[]) - sort lancé (msgId 12096) ===
        // crq: bhQ=casterId, huR=spellId, mfA=fightId
        try {
            new AgentBuilder.Default()
                .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
                .type(ElementMatchers.named("crq"))
                .transform((b4, td4, cl4, mod4, pd4) ->
                    b4.method(ElementMatchers.named("dn")
                        .and(ElementMatchers.takesArguments(byte[].class)))
                    .intercept(Advice.to(CrqAdvice.class))
                )
                .installOn(inst);
            log("HOOK COMBAT SPELLS installe: crq.dn(byte[]) -> CrqAdvice [msgId 12096]");
        } catch (Throwable t) {
            log("HOOK COMBAT SPELLS ECHEC: " + t.getMessage());
        }

        // === HOOK CHARACTER: cph.dn(byte[]) - character full data (msgId 12675) ===
        // cph extends nr_0, contient: level, breed, equipmentSheet, spellDeck, bonusLevels
        try {
            new AgentBuilder.Default()
                .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
                .type(ElementMatchers.named("cph").or(ElementMatchers.named("cPh")).or(ElementMatchers.named("cPH")))
                .transform((b3, td3, cl3, mod3, pd3) ->
                    b3.method(ElementMatchers.named("dn")
                        .and(ElementMatchers.takesArguments(byte[].class)))
                    .intercept(Advice.to(CharacterAdvice.class))
                )
                .installOn(inst);
            log("HOOK CHARACTER installe: cph.dn(byte[]) -> CharacterAdvice [msgId 12675]");
        } catch (Throwable t) {
            log("HOOK CHARACTER ECHEC: " + t.getMessage());
        }
        // === HOOKS HDV SUPPLEMENTAIRES (copies de l'ancien MarketPriceAgentV3) ===
        // Ces hooks utilisent des AgentBuilder SEPARES, exactement comme l'ancien agent
        // qui a capture 82918 offres avec succes.

        // HOOK HDV 1: cmy.dn(byte[]) - decodeur parent de TOUTES les reponses HDV
        try {
            new AgentBuilder.Default()
                .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
                .type(ElementMatchers.named("cmy"))
                .transform((b2, td2, cl2, mod2, pd2) ->
                    b2.method(ElementMatchers.named("dn")
                        .and(ElementMatchers.takesArguments(byte[].class)))
                    .intercept(Advice.to(CmyDnAdvice.class))
                )
                .installOn(inst);



            // ====================================================================
            // HOOK UNIVERSEL v2 : Match par methode dn(byte[]) -> boolean
            // Plus besoin de connaitre le nom exact de nr_0
            // ====================================================================
            try {
                new AgentBuilder.Default()
                    .disableClassFormatChanges()
                    .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
                    .type(net.bytebuddy.matcher.ElementMatchers.declaresMethod(
                        net.bytebuddy.matcher.ElementMatchers.named("dn")
                            .and(net.bytebuddy.matcher.ElementMatchers.takesArguments(byte[].class))
                            .and(net.bytebuddy.matcher.ElementMatchers.returns(boolean.class))
                    ).and(net.bytebuddy.matcher.ElementMatchers.not(
                        net.bytebuddy.matcher.ElementMatchers.isAbstract()
                    )).and(net.bytebuddy.matcher.ElementMatchers.not(
                        net.bytebuddy.matcher.ElementMatchers.isInterface()
                    )))
                    .transform((snifferBuilder, typeDescription, classLoader, module, protectionDomain) -> {
                        String cName = typeDescription.getName();
                        log("[SNIFFER] Hooking: " + cName);
                        return snifferBuilder.visit(
                            Advice.to(UniversalSnifferAdvice.class)
                                .on(net.bytebuddy.matcher.ElementMatchers.named("dn")
                                    .and(net.bytebuddy.matcher.ElementMatchers.takesArguments(byte[].class))
                                    .and(net.bytebuddy.matcher.ElementMatchers.returns(boolean.class)))
                        );
                    })
                    .installOn(inst);

            // === HOOK DESERIALIZE bgy.as(byte[]) ===
            // bgy (56288 bytes) = classe abstraite parente de bgT/exP
            // as(byte[]) = methode de deserialization appelee a la connexion
            // On hook APRES l'execution (OnMethodExit) pour lire les champs remplis
            try {
                new AgentBuilder.Default()
                    .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
                    .disableClassFormatChanges()
                    .type(ElementMatchers.named("bgT")
                        .or(ElementMatchers.named("bgy"))
                        .or(ElementMatchers.named("exP"))
                        .or(ElementMatchers.named("bhJ"))
                        .or(ElementMatchers.hasSuperType(ElementMatchers.named("bgy")))
                    )
                    .transform((deserBuilder, typeDescription, classLoader, module, protectionDomain) -> {
                        log("[DESER] Hook as(byte[]) installe sur: " + typeDescription.getName());
                        return deserBuilder.visit(
                            Advice.to(CharacterExtractorAdvice.class)
                                .on(ElementMatchers.named("as")
                                    .and(ElementMatchers.takesArguments(byte[].class))
                                    .and(ElementMatchers.returns(void.class))
                                )
                        );
                    })
                    .installOn(inst);
log("[DESER] Hook as(byte[]) enregistre avec succes");
            } catch (Exception deserEx) {
                log("[DESER] ERREUR hook as(byte[]): " + deserEx.getMessage());
            }
            // === FIN HOOK DESERIALIZE ===

            // === HOOK CHEST cSb.f(Object) ===
            // cSb = csb_1 (Account Chest Controller, 616 lignes)
            // f(lx_0) = methode appelee quand un compartiment du coffre est selectionne
            // Classe UI chargee uniquement quand le coffre est ouvert -> RETRANSFORMATION
            try {
                new AgentBuilder.Default()
                    .disableClassFormatChanges()
                    .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
                    .type(ElementMatchers.named("cSb"))
                    .transform((chestBuilder, typeDescription, classLoader, module, protectionDomain) -> {
                        log("[CHEST] Hook installe sur: " + typeDescription.getName());
                        return chestBuilder.visit(
                            Advice.to(AccountChestAdvice.class)
                                .on(ElementMatchers.named("f")
                                    .and(ElementMatchers.takesArguments(1)))
                        );
                    })
                    .installOn(inst);
                log("[CHEST] Hook cSb.f(lx_0) enregistre avec succes");
            } catch (Throwable chestEx) {
                log("[CHEST] ERREUR hook: " + chestEx.getMessage());
            }
            // === FIN HOOK CHEST ===

            // === HOOK CRAFT (DESACTIVE — V3 causait interface grisee) ===
            // Strategie V4 : lecture passive via baj_2.hzf.cZr() depuis un timer
            // Pas de hook ByteBuddy sur les classes craft
            System.out.println("[CRAFT] Hook DESACTIVE — lecture passive planifiee");
            // === FIN HOOK CRAFT ===

            // === CRAFT V4 : Lecture passive (timer, zero hook) ===
            try {
                CraftPassiveReader.startPassiveCapture();
                System.out.println("[CRAFT-V4] Passive reader scheduled (first attempt in 30s)");

            // === INVENTORY V1 : Lecture passive (timer, zero hook) ===
            try {
                InventoryPassiveReader.startPassiveCapture();
                System.out.println("[INVENTORY-V1] Passive reader scheduled (first attempt in 25s, then every 5s)");
            } catch (Exception e) {
                System.out.println("[INVENTORY-V1] Failed to start passive reader: " + e.getMessage());
            }
            } catch (Exception e) {
                System.out.println("[CRAFT-V4] Failed to start passive reader: " + e.getMessage());
            }

            log("[SNIFFER] Hook universel v2 installe - match par methode dn(byte[])->boolean");
            } catch (Exception snifferEx) {
                log("[SNIFFER-ERROR] " + snifferEx.getClass().getSimpleName() + ": " + snifferEx.getMessage());
            }

            log("HOOK HDV 1 installe: cmy.dn(byte[]) -> CmyDnAdvice");
        } catch (Throwable t) {
            log("HOOK HDV 1 ECHEC: " + t.getMessage());
        }
    }

    // =========================================================
    //  RUNTIME SCANNER - explore les classes chargees
    // =========================================================
    private static void runtimeScan(Instrumentation inst) {
        try {
            Thread.sleep(15000); // Attendre que le jeu charge
        } catch (InterruptedException e) {
            return;
        }

        log("=== RUNTIME SCAN V3.1 DEBUT ===");
        log("Classes chargees: " + inst.getAllLoadedClasses().length);

        // Classes cibles a documenter en detail
        String[] targets = {
            "aDj", "aAM", "ffV", "feG", "fgA", "fhj", "kF", "uY",
            "cAu", "cAv", "aXh", "aXi", "aXj", "aXl", "aXm", "aXn",
            "aXo", "aXp", "aXq", "aXr", "aXt",
            "aza", "aDK", "ayF", "bgZ",
            "RT", "SG", "aEF", "ayZ", "eOd", "bJD", "ddU"
        };

        Set<String> targetSet = new HashSet<>(Arrays.asList(targets));

        for (Class<?> cls : inst.getAllLoadedClasses()) {
            String name = cls.getName();
            if (targetSet.contains(name)) {
                documentClass(cls);
            }
        }

        // Chercher aussi les classes avec "market", "hdv", "exchange", "auction"
        for (Class<?> cls : inst.getAllLoadedClasses()) {
            String name = cls.getName().toLowerCase();
            if (name.contains("market") || name.contains("hdv") ||
                name.contains("exchange") || name.contains("auction") ||
                name.contains("merchant") || name.contains("trade")) {
                log("MARKET-RELATED: " + cls.getName());
                documentClass(cls);
            }
        }

        // --- Extraction des noms de sorts via i18n ---
        extractSpellNames(inst);

        log("=== RUNTIME SCAN V3.1 FIN ===");
    }

    /**
     * Extrait les sorts depuis le jeu : spellId → {name, gfxId}
     *
     * Sources dans le code decompile :
     *   bmb_0.eeV()          → singleton SpellManager
     *   bmb_0.cZg()          → TIntObjectHashMap<bmt_0> (tous les sorts)
     *   bmt_0 extends fqD    → d() = spellId, aVt() = gfxId (kxk)
     *   aum_0.cWf().a(3, id) → nom i18n du sort
     */
    private static void extractSpellNames(Instrumentation inst) {
        try {
            log("=== EXTRACTION SORTS DEBUT ===");

            // --- 1. SpellManager : bmb_0.eeV().cZg() → TIntObjectHashMap<bmt_0> ---
            Class<?> spellMgrClass = null;
            for (Class<?> cls : inst.getAllLoadedClasses()) {
                if (cls.getName().equals("bmb_0")) { spellMgrClass = cls; break; }
            }
            if (spellMgrClass == null) { log("SORTS: bmb_0 non trouvee"); return; }

            java.lang.reflect.Method eeV = spellMgrClass.getDeclaredMethod("eeV");
            eeV.setAccessible(true);
            Object mgr = eeV.invoke(null);

            java.lang.reflect.Method cZg = mgr.getClass().getDeclaredMethod("cZg");
            cZg.setAccessible(true);
            Object spellMap = cZg.invoke(mgr); // TIntObjectHashMap<bmt_0>

            // TIntObjectHashMap.keys() → int[], get(int) → Object
            java.lang.reflect.Method keysMethod = spellMap.getClass().getMethod("keys");
            java.lang.reflect.Method getMethod = spellMap.getClass().getMethod("get", int.class);
            int[] keys = (int[]) keysMethod.invoke(spellMap);
            log("SORTS: " + keys.length + " sorts trouves dans le registre");

            // --- 2. i18n : aum_0.cWf() ---
            Object i18n = null;
            java.lang.reflect.Method translateMethod = null;
            try {
                Class<?> i18nClass = null;
                for (Class<?> cls : inst.getAllLoadedClasses()) {
                    if (cls.getName().equals("aum_0")) { i18nClass = cls; break; }
                }
                if (i18nClass != null) {
                    java.lang.reflect.Method cWf = i18nClass.getDeclaredMethod("cWf");
                    cWf.setAccessible(true);
                    i18n = cWf.invoke(null);
                    for (java.lang.reflect.Method m : i18n.getClass().getDeclaredMethods()) {
                        if (m.getName().equals("a") && m.getParameterCount() == 3) {
                            Class<?>[] p = m.getParameterTypes();
                            if (p[0] == int.class && p[1] == long.class) {
                                translateMethod = m; break;
                            }
                        }
                    }
                    if (translateMethod != null) translateMethod.setAccessible(true);
                }
            } catch (Exception e) {
                log("SORTS: i18n non disponible: " + e.getMessage());
            }

            // --- 3. Iterer et extraire spellId, gfxId, name ---
            StringBuilder json = new StringBuilder();
            json.append("{\n");
            int count = 0;
            Object[] emptyArgs = new Object[0];
            java.util.Arrays.sort(keys);

            for (int spellId : keys) {
                try {
                    Object spell = getMethod.invoke(spellMap, spellId); // bmt_0
                    if (spell == null) continue;

                    // gfxId via aVt() (champ kxk)
                    int gfxId = 0;
                    try {
                        java.lang.reflect.Method aVt = spell.getClass().getMethod("aVt");
                        gfxId = (int) aVt.invoke(spell);
                    } catch (Exception ignored) {}

                    // Nom via i18n
                    String name = "";
                    if (translateMethod != null && i18n != null) {
                        try {
                            String n = (String) translateMethod.invoke(i18n, 3, (long) spellId, emptyArgs);
                            if (n != null && !n.isEmpty() && !n.startsWith("[")) name = n;
                        } catch (Exception ignored) {}
                    }

                    if (name.isEmpty() && gfxId == 0) continue;

                    if (count > 0) json.append(",\n");
                    String escaped = name.replace("\\", "\\\\").replace("\"", "\\\"");
                    json.append("  \"").append(spellId).append("\": {\"name\": \"")
                        .append(escaped).append("\", \"gfxId\": ").append(gfxId).append("}");
                    count++;
                } catch (Exception ignored) {}
            }

            json.append("\n}");

            String outPath = "H:\\Code\\Wakfuassistant\\rnd\\data\\spell_names_fr.json";
            try (java.io.FileWriter fw = new java.io.FileWriter(outPath, false)) {
                fw.write(json.toString());
            }

            log("SORTS: " + count + " sorts extraits (id + gfxId + nom) → " + outPath);
            log("=== EXTRACTION SORTS FIN ===");

        } catch (Throwable t) {
            log("SORTS ERREUR: " + t.getMessage());
            t.printStackTrace();
        }
    }

    private static void documentClass(Class<?> cls) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("CLASS DETAIL|").append(cls.getName());

            // Superclass
            if (cls.getSuperclass() != null) {
                sb.append("|super=").append(cls.getSuperclass().getName());
            }

            // Interfaces
            Class<?>[] ifaces = cls.getInterfaces();
            if (ifaces.length > 0) {
                sb.append("|interfaces=");
                for (int i = 0; i < ifaces.length; i++) {
                    if (i > 0) sb.append(",");
                    sb.append(ifaces[i].getName());
                }
            }

            // Champs (tous, y compris prives)
            java.lang.reflect.Field[] fields = cls.getDeclaredFields();
            if (fields.length > 0) {
                sb.append("|fields=");
                for (int i = 0; i < Math.min(fields.length, 30); i++) {
                    if (i > 0) sb.append(",");
                    sb.append(fields[i].getName()).append(":").append(fields[i].getType().getSimpleName());
                }
                if (fields.length > 30) sb.append("...(").append(fields.length).append(" total)");
            }

            // Methodes
            java.lang.reflect.Method[] methods = cls.getDeclaredMethods();
            if (methods.length > 0) {
                sb.append("|methods=");
                for (int i = 0; i < Math.min(methods.length, 20); i++) {
                    if (i > 0) sb.append(",");
                    sb.append(methods[i].getName()).append("(");
                    Class<?>[] params = methods[i].getParameterTypes();
                    for (int j = 0; j < params.length; j++) {
                        if (j > 0) sb.append(";");
                        sb.append(params[j].getSimpleName());
                    }
                    sb.append(")");
                }
                if (methods.length > 20) sb.append("...(").append(methods.length).append(" total)");
            }

            log(sb.toString());
        } catch (Throwable t) {
            log("CLASS DETAIL ERROR|" + cls.getName() + "|" + t.getMessage());
        }
    }

    // =========================================================
    //  LOGGING UTILITIES
    // =========================================================
    public static void log(String message) {
        String timestamp = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
        String line = "[" + timestamp + "] " + message;
        synchronized (LOCK) {
            try (FileWriter fw = new FileWriter(SPY_LOG, true)) {
                fw.write(line + "\n");
            } catch (IOException e) {
                System.err.println("[WakfuSpy] " + line);
            }
        }
    }

    // v3: desactive - tout passe par ChannelReadAdvice async writer
    public static void logMessage(String line) {
        // no-op
    }

    public static void logHdv(String line) {
        synchronized (LOCK) {
            try (FileWriter fw = new FileWriter(HDV_LOG, true)) {
                fw.write(line + "\n");
            } catch (IOException e) {
                // fallback
            }
        }
    }

    // =========================================================
    //  DECODEUR PROTOBUF - pour cru (builds) et csS (stuff)
    // =========================================================

    /**
     * Decode le payload protobuf d'un message cru ou csS et l'ecrit dans
     * wakfu_items_decoded.jsonl + wakfu_items_summary.log.
     *
     * cru : 12 bytes de header non-protobuf puis protobuf. Field 3 (0x1A) = nom du build.
     * csS : protobuf direct depuis l'offset 0.
     */
    public static void decodeProto(String msgType, byte[] data) {
        if (data == null || data.length < 4) return;
        try {
            String ts = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());

            // cru a un header 12-bytes non-protobuf (00 00 00 XX 00 00 00 XX 00 00 XX XX)
            int protoStart = 0;
            if ("cru".equals(msgType) && data.length > 12 && (data[0] & 0xFF) == 0 && (data[1] & 0xFF) == 0) {
                protoStart = 12;
            }

            // Parse generique du protobuf -> JSON
            String protoJson = parseProtoJson(data, protoStart, data.length, 0);

            // Pour cru: scan rapide des noms de builds (field 0x1A = 3)
            String namesJson = "[]";
            if ("cru".equals(msgType)) {
                namesJson = scanProtoStrings(data, protoStart, data.length);
            }

            // JSON final
            StringBuilder out = new StringBuilder(1024);
            out.append("{\"ts\":\"").append(ts).append("\"");
            out.append(",\"type\":\"").append(msgType).append("\"");
            out.append(",\"size\":").append(data.length);
            out.append(",\"protoStart\":").append(protoStart);
            if ("cru".equals(msgType)) out.append(",\"names\":").append(namesJson);
            out.append(",\"proto\":").append(protoJson);
            out.append("}");

            ItemLogWriter.writeItem(out.toString());

            String summary = ts + "|PROTO|" + msgType + "|size=" + data.length + "|names=" + namesJson;
            log(summary);
            ItemLogWriter.writeSummary(summary);

        } catch (Throwable t) {
            log("PROTO_ERROR|" + msgType + "|" + t.getMessage());
        }
    }

    /**
     * Parse recursif d'un buffer protobuf. Retourne un objet JSON avec les champs
     * groupes en arrays si repetitifs. Profondeur max 3, 50 champs max par niveau.
     */
    private static String parseProtoJson(byte[] data, int start, int end, int depth) {
        if (depth > 3 || data == null || start >= end) return "{}";

        java.util.ArrayList<Integer> fieldNums = new java.util.ArrayList<>();
        java.util.ArrayList<String> fieldVals  = new java.util.ArrayList<>();
        int[] pos = {start};
        int count = 0;

        while (pos[0] < end && count < 50) {
            try {
                long tag = readProtoVarint(data, pos, end);
                if (tag <= 0 || pos[0] > end) break;
                int fieldNum = (int)(tag >>> 3);
                int wireType = (int)(tag & 0x7);
                if (fieldNum <= 0 || fieldNum > 65536) { pos[0] = end; break; }

                String val = null;
                switch (wireType) {
                    case 0: {
                        long v = readProtoVarint(data, pos, end);
                        val = Long.toString(v);
                        break;
                    }
                    case 1: {
                        if (pos[0] + 8 > end) { pos[0] = end; break; }
                        long v = 0;
                        for (int i = 0; i < 8; i++) v |= ((long)(data[pos[0]+i] & 0xFF)) << (i*8);
                        pos[0] += 8;
                        val = Long.toString(v);
                        break;
                    }
                    case 2: {
                        long lenL = readProtoVarint(data, pos, end);
                        if (lenL < 0 || lenL > 200000) { pos[0] = end; break; }
                        int len = (int)lenL;
                        if (pos[0] + len > end) { pos[0] = end; break; }
                        int subStart = pos[0];
                        pos[0] += len;

                        String asStr = tryProtoUtf8(data, subStart, len);
                        if (asStr != null) {
                            val = "\"" + ItemLogWriter.escapeJson(asStr) + "\"";
                        } else if (depth < 3 && len >= 2) {
                            String sub = parseProtoJson(data, subStart, subStart + len, depth + 1);
                            val = "{}".equals(sub)
                                ? "\"0x" + hexProtoStr(data, subStart, Math.min(len, 8)) + "\""
                                : sub;
                        } else {
                            val = "\"0x" + hexProtoStr(data, subStart, Math.min(len, 8)) + "\"";
                        }
                        break;
                    }
                    case 5: {
                        if (pos[0] + 4 > end) { pos[0] = end; break; }
                        int v = 0;
                        for (int i = 0; i < 4; i++) v |= (data[pos[0]+i] & 0xFF) << (i*8);
                        pos[0] += 4;
                        val = Integer.toString(v);
                        break;
                    }
                    default:
                        pos[0] = end;
                        break;
                }

                if (val != null) {
                    fieldNums.add(fieldNum);
                    fieldVals.add(val);
                    count++;
                }
            } catch (Exception e) {
                break;
            }
        }

        // Grouper les champs repetitifs en arrays
        java.util.LinkedHashMap<Integer, java.util.ArrayList<String>> grouped = new java.util.LinkedHashMap<>();
        for (int i = 0; i < fieldNums.size(); i++) {
            int fn = fieldNums.get(i);
            if (!grouped.containsKey(fn)) grouped.put(fn, new java.util.ArrayList<>());
            grouped.get(fn).add(fieldVals.get(i));
        }

        StringBuilder sb = new StringBuilder("{");
        boolean first = true;
        for (java.util.Map.Entry<Integer, java.util.ArrayList<String>> e : grouped.entrySet()) {
            if (!first) sb.append(",");
            first = false;
            sb.append("\"f").append(e.getKey()).append("\":");
            java.util.ArrayList<String> v = e.getValue();
            if (v.size() == 1) {
                sb.append(v.get(0));
            } else {
                sb.append("[");
                int cap = Math.min(v.size(), 15);
                for (int i = 0; i < cap; i++) {
                    if (i > 0) sb.append(",");
                    sb.append(v.get(i));
                }
                if (v.size() > 15) sb.append(",\"+(").append(v.size() - 15).append(")\"");
                sb.append("]");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    /** Lit un varint protobuf, avance pos[0]. */
    private static long readProtoVarint(byte[] data, int[] pos, int limit) {
        long result = 0;
        int shift = 0;
        while (pos[0] < limit && shift < 63) {
            int b = data[pos[0]++] & 0xFF;
            result |= (long)(b & 0x7F) << shift;
            if ((b & 0x80) == 0) return result;
            shift += 7;
        }
        return result;
    }

    /**
     * Retourne les bytes comme String UTF-8 si c'est du texte lisible
     * (au moins une lettre, >= 70% printable, valide UTF-8). Null sinon.
     */
    private static String tryProtoUtf8(byte[] data, int start, int len) {
        if (len < 2 || len > 200) return null;
        try {
            byte[] sub = new byte[len];
            System.arraycopy(data, start, sub, 0, len);
            String s = new String(sub, "UTF-8");
            // Verification round-trip (detecte UTF-8 invalide)
            byte[] back = s.getBytes("UTF-8");
            if (back.length != len) return null;
            int letters = 0, printable = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLetter(c)) letters++;
                if (c >= 0x20 || c == '\t') printable++;
            }
            if (letters < 1 || printable < (int)(s.length() * 0.7)) return null;
            return s;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Scan lineaire pour les strings de field 3 (tag 0x1A) dans un buffer protobuf.
     * Utilise pour extraire les noms de builds depuis les messages cru.
     */
    private static String scanProtoStrings(byte[] data, int start, int end) {
        StringBuilder result = new StringBuilder("[");
        int count = 0;
        for (int i = start; i < end - 2; i++) {
            if ((data[i] & 0xFF) == 0x1A) {
                int len = data[i+1] & 0xFF;
                if (len >= 3 && len <= 80 && i + 2 + len <= end) {
                    String s = tryProtoUtf8(data, i + 2, len);
                    if (s != null) {
                        if (count > 0) result.append(",");
                        result.append("\"").append(ItemLogWriter.escapeJson(s)).append("\"");
                        count++;
                        i += 1 + len; // sauter le string scanne
                    }
                }
            }
        }
        result.append("]");
        return result.toString();
    }

    /** Encode N bytes en hexadecimal (pour les champs binaires non-texte). */
    private static String hexProtoStr(byte[] data, int start, int len) {
        StringBuilder sb = new StringBuilder(len * 2);
        for (int i = 0; i < len && start + i < data.length; i++) {
            int v = data[start + i] & 0xFF;
            sb.append("0123456789ABCDEF".charAt(v >> 4));
            sb.append("0123456789ABCDEF".charAt(v & 0xF));
        }
        return sb.toString();
    }

    // =========================================================
    //  DISCOVERY TRANSFORMER (passive, sans Byte Buddy)
    // =========================================================
    static class DiscoveryTransformer implements ClassFileTransformer {
        private final Set<String> seen = ConcurrentHashMap.newKeySet();
        private final AtomicInteger count = new AtomicInteger(0);

        // Mots-cles interessants
        private static final String[] KEYWORDS = {
            "channel", "handler", "netty", "message", "proto",
            "item", "inventory", "market", "storage", "operation"
        };

        @Override
        public byte[] transform(ClassLoader loader, String className,
                Class<?> classBeingRedefined, ProtectionDomain protectionDomain,
                byte[] classfileBuffer) {
            if (className == null) return null;

            String dotName = className.replace('/', '.');
            if (seen.add(dotName)) {
                int n = count.incrementAndGet();
                String nameLower = dotName.toLowerCase();
                boolean interesting = false;
                for (String kw : KEYWORDS) {
                    if (nameLower.contains(kw)) { interesting = true; break; }
                }
                // Classes courtes (obfusquees Wakfu) = toujours interessantes
                String simpleName = dotName.contains(".") ? dotName.substring(dotName.lastIndexOf('.') + 1) : dotName;
                if (simpleName.length() <= 4 && !dotName.startsWith("java.") && !dotName.startsWith("sun.") && !dotName.startsWith("jdk.")) {
                    interesting = true;
                }

                if (interesting && n <= 15000) {
                    log("DISCOVERY|" + dotName + "|size=" + classfileBuffer.length);
                }

                if (n % 5000 == 0) {
                    log("DISCOVERY STATS|loaded=" + n + " unique=" + seen.size());
                }
            }
            return null; // Ne modifie rien
        }
    }

    // === INSPECT AZY OBJECT (HDV OFFER) ===
    public static void inspectObject(String context, Object obj, String logPath) {
        try {
            if (obj == null) return;
            Class<?> clazz = obj.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("{\"context\":\"").append(context).append("\",\"class\":\"").append(clazz.getName()).append("\",\"ts\":\"").append(new java.text.SimpleDateFormat("HH:mm:ss.SSS").format(new java.util.Date())).append("\"");
            
            // Get ALL fields including inherited
            java.util.List<java.lang.reflect.Field> allFields = new java.util.ArrayList<>();
            Class<?> current = clazz;
            while (current != null && !current.equals(Object.class)) {
                for (java.lang.reflect.Field f : current.getDeclaredFields()) {
                    allFields.add(f);
                }
                current = current.getSuperclass();
            }
            
            sb.append(",\"fieldCount\":").append(allFields.size());
            sb.append(",\"fields\":{");
            boolean first = true;
            for (java.lang.reflect.Field f : allFields) {
                try {
                    f.setAccessible(true);
                    Object val = f.get(obj);
                    if (!first) sb.append(",");
                    first = false;
                    sb.append("\"").append(f.getName()).append("\":");
                    if (val == null) {
                        sb.append("null");
                    } else if (val instanceof Number) {
                        sb.append(val);
                    } else if (val instanceof Boolean) {
                        sb.append(val);
                    } else if (val instanceof String) {
                        sb.append("\"").append(((String)val).replace("\"","\\\"")).append("\"");
                    } else if (val instanceof byte[]) {
                        byte[] bytes = (byte[]) val;
                        sb.append("\"byte[").append(bytes.length).append("]\"");
                    } else if (val instanceof java.util.Map) {
                        java.util.Map<?,?> map = (java.util.Map<?,?>) val;
                        sb.append("{\"size\":").append(map.size());
                        int count = 0;
                        for (java.util.Map.Entry<?,?> e : map.entrySet()) {
                            if (count < 3) {
                                sb.append(",\"").append(e.getKey()).append("\":\"").append(String.valueOf(e.getValue()).substring(0, Math.min(100, String.valueOf(e.getValue()).length()))).append("\"");
                            }
                            count++;
                        }
                        sb.append("}");
                    } else if (val instanceof java.util.Collection) {
                        sb.append("\"Collection[").append(((java.util.Collection<?>)val).size()).append("]\"");
                    } else {
                        String s = String.valueOf(val);
                        if (s.length() > 200) s = s.substring(0, 200);
                        sb.append("\"").append(s.replace("\"","\\\"").replace("\n"," ")).append("\"");
                    }
                } catch (Exception ex) {
                    if (!first) sb.append(",");
                    first = false;
                    sb.append("\"").append(f.getName()).append("\":\"ERROR:").append(ex.getClass().getSimpleName()).append("\"");
                }
            }
            sb.append("}}");
            
            // Write to hdv log
            try (java.io.FileWriter fw = new java.io.FileWriter(logPath, true)) {
                fw.write(sb.toString());
                fw.write("\n");
            }
            
            // Also inspect sub-objects that might be items
            for (java.lang.reflect.Field f : allFields) {
                try {
                    f.setAccessible(true);
                    Object val = f.get(obj);
                    if (val != null && !val.getClass().getName().startsWith("java.") && !val.getClass().isPrimitive() && !(val instanceof String) && !(val instanceof Number) && !(val instanceof byte[])) {
                        Class<?> vc = val.getClass();
                        if (vc.getName().length() <= 5) {
                            // Short obfuscated class - likely game object, inspect it too
                            StringBuilder sub = new StringBuilder();
                            sub.append("{\"context\":\"").append(context).append(".").append(f.getName()).append("\",\"class\":\"").append(vc.getName()).append("\",\"ts\":\"").append(new java.text.SimpleDateFormat("HH:mm:ss.SSS").format(new java.util.Date())).append("\"");
                            sub.append(",\"fields\":{");
                            boolean subFirst = true;
                            Class<?> subCurrent = vc;
                            while (subCurrent != null && !subCurrent.equals(Object.class)) {
                                for (java.lang.reflect.Field sf : subCurrent.getDeclaredFields()) {
                                    try {
                                        sf.setAccessible(true);
                                        Object sval = sf.get(val);
                                        if (!subFirst) sub.append(",");
                                        subFirst = false;
                                        sub.append("\"").append(sf.getName()).append("\":");
                                        if (sval == null) sub.append("null");
                                        else if (sval instanceof Number) sub.append(sval);
                                        else if (sval instanceof Boolean) sub.append(sval);
                                        else if (sval instanceof String) sub.append("\"").append(((String)sval).replace("\"","\\\"")).append("\"");
                                        else if (sval instanceof byte[]) sub.append("\"byte[").append(((byte[])sval).length).append("]\"");
                                        else {
                                            String ss = String.valueOf(sval);
                                            if (ss.length() > 150) ss = ss.substring(0, 150);
                                            sub.append("\"").append(ss.replace("\"","\\\"").replace("\n"," ")).append("\"");
                                        }
                                    } catch (Exception ex2) {
                                        if (!subFirst) sub.append(",");
                                        subFirst = false;
                                        sub.append("\"").append(sf.getName()).append("\":\"ERR\"");
                                    }
                                }
                                subCurrent = subCurrent.getSuperclass();
                            }
                            sub.append("}}");
                            try (java.io.FileWriter fw = new java.io.FileWriter(logPath, true)) {
                                fw.write(sub.toString());
                                fw.write("\n");
                            }
                        }
                    }
                } catch (Exception ignored) {}
            }
        } catch (Exception ex) {
            try (java.io.FileWriter fw = new java.io.FileWriter(logPath, true)) {
                fw.write("{\"error\":\"" + ex.getMessage() + "\"}\n");
            } catch (Exception ignored) {}
        }
    }
}










