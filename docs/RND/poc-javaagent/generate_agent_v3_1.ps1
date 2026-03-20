# ============================================================
# generate_agent_v3_1.ps1  -  CORRECTION Advice Inline
# Tout le code reflection est DIRECTEMENT dans l'advice
# Aucun appel à des classes externes (tout JDK standard)
# ============================================================

$agentRoot = "H:\Code\Wakfuassistant\agent"
$srcDir    = "$agentRoot\src\main\java\com\wakfuassistant\agent"

Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  AGENT V3.1 - INLINE ADVICE FIX" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

# -----------------------------------------------------------
# 1. WakfuSpyAgent.java - V3.1 simplifié
# -----------------------------------------------------------
$agentJava = @'
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
    public static final String MSG_LOG = LOG_DIR + "\\wakfu_messages.log";
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

            // --- Phase 3: Runtime scanner en background ---
            Thread scanner = new Thread(() -> runtimeScan(inst), "WakfuSpy-Scanner");
            scanner.setDaemon(true);
            scanner.start();
            log("RuntimeScanner demarre");

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

        log("=== RUNTIME SCAN V3.1 FIN ===");
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

    public static void logMessage(String line) {
        synchronized (LOCK) {
            try (FileWriter fw = new FileWriter(MSG_LOG, true)) {
                fw.write(line + "\n");
            } catch (IOException e) {
                // fallback
            }
        }
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
}
'@

Set-Content -Path "$srcDir\WakfuSpyAgent.java" -Value $agentJava -Encoding UTF8
Write-Host "  [OK] WakfuSpyAgent.java (V3.1)" -ForegroundColor Green

# -----------------------------------------------------------
# 2. ChannelReadAdvice.java - TOUT INLINE, JDK UNIQUEMENT
#    C'est le coeur de la V3.1 : aucune reference a nos classes
# -----------------------------------------------------------
$channelAdvice = @'
package com.wakfuassistant.agent;

import net.bytebuddy.asm.Advice;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * ChannelReadAdvice V3.1
 * 
 * REGLE CRITIQUE: Ce code est INLINE dans la classe cible (aDj).
 * Il ne doit JAMAIS appeler de methodes de com.wakfuassistant.agent.*
 * car ces classes ne sont pas visibles depuis le classloader de aDj.
 * 
 * Seules les classes JDK standard (java.lang, java.lang.reflect, java.io,
 * java.text, java.util) sont utilisables ici.
 *
 * Ref: https://www.elastic.co/blog/embracing-invokedynamic-to-tame-class-loaders-in-java-agents
 *      "the advice code is no longer executed in the context that it is defined within"
 */
public class ChannelReadAdvice {

    @Advice.OnMethodEnter(suppress = Throwable.class)
    public static void onEnter(
            @Advice.Argument(0) Object ctx,
            @Advice.Argument(1) Object msg) {

        // === TOUT LE CODE CI-DESSOUS EST COPIE (INLINE) DANS aDj ===
        // === Il ne doit utiliser QUE des classes JDK standard     ===

        try {
            String msgType = msg.getClass().getName();
            String timestamp = new java.text.SimpleDateFormat("HH:mm:ss.SSS")
                .format(new java.util.Date());

            // Construire la ligne de log avec tous les champs du message
            StringBuilder sb = new StringBuilder(2048);
            sb.append(timestamp).append("|MSG|").append(msgType);

            // Extraire TOUS les champs non-statiques du message par reflection
            Field[] fields = msg.getClass().getDeclaredFields();
            int fieldCount = 0;
            for (Field f : fields) {
                if (Modifier.isStatic(f.getModifiers())) continue;
                fieldCount++;
                try {
                    f.setAccessible(true);
                    Object val = f.get(msg);
                    String valStr;
                    if (val == null) {
                        valStr = "null";
                    } else if (val instanceof Number || val instanceof Boolean || val instanceof Character) {
                        valStr = val.toString();
                    } else if (val instanceof String) {
                        String s = (String) val;
                        valStr = "\"" + (s.length() > 100 ? s.substring(0, 100) + "..." : s) + "\"";
                    } else if (val instanceof byte[]) {
                        valStr = "byte[" + ((byte[]) val).length + "]";
                    } else if (val instanceof int[]) {
                        int[] arr = (int[]) val;
                        if (arr.length <= 10) {
                            StringBuilder asb = new StringBuilder("int[");
                            for (int i = 0; i < arr.length; i++) {
                                if (i > 0) asb.append(",");
                                asb.append(arr[i]);
                            }
                            asb.append("]");
                            valStr = asb.toString();
                        } else {
                            valStr = "int[" + arr.length + "]";
                        }
                    } else if (val instanceof long[]) {
                        long[] arr = (long[]) val;
                        if (arr.length <= 10) {
                            StringBuilder asb = new StringBuilder("long[");
                            for (int i = 0; i < arr.length; i++) {
                                if (i > 0) asb.append(",");
                                asb.append(arr[i]);
                            }
                            asb.append("]");
                            valStr = asb.toString();
                        } else {
                            valStr = "long[" + arr.length + "]";
                        }
                    } else if (val.getClass().isArray()) {
                        valStr = val.getClass().getComponentType().getSimpleName() + "[" + java.lang.reflect.Array.getLength(val) + "]";
                    } else if (val instanceof java.util.Collection) {
                        java.util.Collection<?> col = (java.util.Collection<?>) val;
                        valStr = val.getClass().getSimpleName() + "(size=" + col.size() + ")";
                        // Si petite collection, lister les elements
                        if (col.size() > 0 && col.size() <= 5) {
                            StringBuilder csb = new StringBuilder("[");
                            int ci = 0;
                            for (Object item : col) {
                                if (ci > 0) csb.append(",");
                                if (item == null) {
                                    csb.append("null");
                                } else {
                                    csb.append(item.getClass().getSimpleName());
                                    // Essayer toString si court
                                    try {
                                        String its = item.toString();
                                        if (its.length() < 80) csb.append("=").append(its);
                                    } catch (Throwable ignore) {}
                                }
                                ci++;
                            }
                            csb.append("]");
                            valStr += csb.toString();
                        }
                    } else if (val instanceof java.util.Map) {
                        java.util.Map<?,?> map = (java.util.Map<?,?>) val;
                        valStr = val.getClass().getSimpleName() + "(size=" + map.size() + ")";
                    } else {
                        // Objet complexe: type + tenter reflection un niveau
                        String typeName = val.getClass().getSimpleName();
                        StringBuilder osb = new StringBuilder(typeName).append("{");
                        try {
                            Field[] subFields = val.getClass().getDeclaredFields();
                            int si = 0;
                            for (Field sf : subFields) {
                                if (Modifier.isStatic(sf.getModifiers())) continue;
                                if (si >= 8) { osb.append("..."); break; }
                                if (si > 0) osb.append(",");
                                sf.setAccessible(true);
                                Object sv = sf.get(val);
                                osb.append(sf.getName()).append("=");
                                if (sv == null) osb.append("null");
                                else if (sv instanceof Number || sv instanceof Boolean)
                                    osb.append(sv);
                                else if (sv instanceof String) {
                                    String ss = (String) sv;
                                    osb.append("\"").append(ss.length() > 50 ? ss.substring(0, 50) + "..." : ss).append("\"");
                                } else {
                                    osb.append(sv.getClass().getSimpleName());
                                }
                                si++;
                            }
                        } catch (Throwable ignore) {
                            osb.append("?");
                        }
                        osb.append("}");
                        valStr = osb.toString();
                    }

                    sb.append("|").append(f.getName()).append("=").append(valStr);
                } catch (Throwable fieldErr) {
                    sb.append("|").append(f.getName()).append("=<ERR:").append(fieldErr.getClass().getSimpleName()).append(">");
                }
            }
            sb.append("|_fieldCount=").append(fieldCount);

            // Determiner si c'est un message HDV
            String typeLower = msgType.toLowerCase();
            boolean isHdv = typeLower.contains("market") || typeLower.contains("hdv") ||
                typeLower.contains("auction") || typeLower.contains("exchange") ||
                typeLower.contains("merchant");

            // Aussi verifier par le contenu des champs (noms obfusques)
            // Les classes coy, cmq, cmv, cmb, ctu, cmm sont des messages HDV connus
            String simpleType = msgType.contains(".") ? msgType.substring(msgType.lastIndexOf('.') + 1) : msgType;
            if (simpleType.equals("coy") || simpleType.equals("cmq") || simpleType.equals("cmv") ||
                simpleType.equals("cmb") || simpleType.equals("ctu") || simpleType.equals("cmm") ||
                simpleType.equals("csf") || simpleType.equals("cso")) {
                isHdv = true;
            }

            String logLine = sb.toString();

            // Ecrire dans wakfu_messages.log (TOUJOURS)
            try {
                java.io.FileWriter fw = new java.io.FileWriter(
                    "H:\\Code\\Wakfuassistant\\agent\\logs\\wakfu_messages.log", true);
                fw.write(logLine + "\n");
                fw.close();
            } catch (Throwable writeErr) {
                // Silencieux
            }

            // Ecrire dans wakfu_hdv.log si pertinent
            if (isHdv) {
                try {
                    java.io.FileWriter fw = new java.io.FileWriter(
                        "H:\\Code\\Wakfuassistant\\agent\\logs\\wakfu_hdv.log", true);
                    fw.write(logLine + "\n");
                    fw.close();
                } catch (Throwable writeErr) {
                    // Silencieux
                }
            }

            // Ecrire un resume dans le spy log
            try {
                java.io.FileWriter fw = new java.io.FileWriter(
                    "H:\\Code\\Wakfuassistant\\agent\\logs\\wakfu_agent_spy.log", true);
                fw.write("[" + timestamp + "] MSG|" + simpleType + "|fields=" + fieldCount +
                    (isHdv ? "|HDV" : "") + "\n");
                fw.close();
            } catch (Throwable writeErr) {
                // Silencieux
            }

        } catch (Throwable t) {
            // Erreur globale - ne pas crasher le jeu
            try {
                java.io.FileWriter fw = new java.io.FileWriter(
                    "H:\\Code\\Wakfuassistant\\agent\\logs\\wakfu_agent_spy.log", true);
                fw.write("[ADVICE ERROR] " + t.getClass().getName() + ": " + t.getMessage() + "\n");
                fw.close();
            } catch (Throwable ignore) {}
        }
    }
}
'@

Set-Content -Path "$srcDir\ChannelReadAdvice.java" -Value $channelAdvice -Encoding UTF8
Write-Host "  [OK] ChannelReadAdvice.java (V3.1 - full inline)" -ForegroundColor Green

# -----------------------------------------------------------
# 3. PipelineAdvice.java - Handlers secondaires, leger
# -----------------------------------------------------------
$pipelineAdvice = @'
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
'@

Set-Content -Path "$srcDir\PipelineAdvice.java" -Value $pipelineAdvice -Encoding UTF8
Write-Host "  [OK] PipelineAdvice.java (V3.1)" -ForegroundColor Green

# -----------------------------------------------------------
# 4. Supprimer les anciens fichiers obsoletes
# -----------------------------------------------------------
$oldFiles = @(
    "$srcDir\ChannelReadAdvice.java.bak",
    "$srcDir\PipelineHandlerAdvice.java",
    "$srcDir\MessageInterceptorTransformer.java",
    "$srcDir\RuntimeInterceptor.java",
    "$srcDir\ReflectionInspector.java",
    "$srcDir\NettyInterceptorTransformer.java",
    "$srcDir\RuntimeInterceptorV3.java",
    "$srcDir\ClassDiscoveryTransformer.java"
)
foreach ($f in $oldFiles) {
    if (Test-Path $f) {
        Remove-Item $f -Force
        Write-Host "  [OK] Supprime: $(Split-Path $f -Leaf)" -ForegroundColor DarkGray
    }
}

# Supprimer les anciens logs
Remove-Item "$agentRoot\logs\*.log" -Force -ErrorAction SilentlyContinue
Write-Host "  [OK] Anciens logs supprimes" -ForegroundColor DarkGray

# -----------------------------------------------------------
# 5. Compiler avec Maven
# -----------------------------------------------------------
Write-Host "`n--- Compilation V3.1 ---" -ForegroundColor Cyan
$mvn = "$agentRoot\tools\apache-maven-3.9.14\bin\mvn.cmd"

# Verifier que les 3 fichiers Java existent
$javaFiles = Get-ChildItem "$srcDir\*.java"
Write-Host "  Fichiers Java: $($javaFiles.Count)" -ForegroundColor White
$javaFiles | ForEach-Object { Write-Host "    $($_.Name) ($([Math]::Round($_.Length/1KB, 1))KB)" -ForegroundColor White }

& $mvn clean package -q -f "$agentRoot\pom.xml" 2>&1 | ForEach-Object {
    if ($_ -match "ERROR|FAILURE|BUILD FAILURE") {
        Write-Host "  $_" -ForegroundColor Red
    }
}

$jar = "$agentRoot\target\wakfu-spy-agent-1.0.0.jar"
if (Test-Path $jar) {
    $size = [Math]::Round((Get-Item $jar).Length / 1KB)
    Copy-Item $jar "$agentRoot\wakfu-spy-agent.jar" -Force
    Write-Host "  [OK] BUILD V3.1 REUSSI - wakfu-spy-agent.jar (${size}KB)" -ForegroundColor Green
} else {
    Write-Host "  [ERREUR] JAR non genere!" -ForegroundColor Red
    Write-Host "  Relance avec details:" -ForegroundColor Yellow
    Write-Host "  & `"$mvn`" clean package -f `"$agentRoot\pom.xml`"" -ForegroundColor Yellow
}

Write-Host "`n============================================" -ForegroundColor Cyan
Write-Host "  AGENT V3.1 PRET" -ForegroundColor Green
Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  1. Ferme Wakfu + launcher Ankama" -ForegroundColor White
Write-Host "  2. Lance: $agentRoot\launch_wakfu_with_agent.bat" -ForegroundColor White
Write-Host "  3. Joue - va au HDV" -ForegroundColor White
Write-Host "  4. Verifie: $agentRoot\logs\wakfu_messages.log" -ForegroundColor White
Write-Host "  5. HDV:     $agentRoot\logs\wakfu_hdv.log" -ForegroundColor White
Write-Host "============================================" -ForegroundColor Cyan