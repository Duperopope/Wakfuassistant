# Agent Quick Check
**Date** : 2026-03-21 21:26:26

## 1. Build System
**Type** : Maven
**pom.xml** : H:\Code\Wakfuassistant\agent\pom.xml (4446 B)
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.wakfuassistant</groupId>
    <artifactId>wakfu-spy-agent</artifactId>
    <version>1.0.0</version>
    <packaging>jar</packaging>

    <name>Wakfu Spy Agent</name>
    <description>Java Agent pour intercepter les messages Netty du client Wakfu</description>

    <properties>
        <maven.compiler.source>21</maven.compiler.source>
        <maven.compiler.target>21</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <byte-buddy.version>1.15.11</byte-buddy.version>
    </properties>

    <dependencies>
        <!-- Byte Buddy - Instrumentation bytecode -->
        <dependency>
            <groupId>net.bytebuddy</groupId>
            <artifactId>byte-buddy</artifactId>
            <version>${byte-buddy.version}</version>
        </dependency>
        <dependency>
            <groupId>net.bytebuddy</groupId>
            <artifactId>byte-buddy-agent</artifactId>
            <version>${byte-buddy.version}</version>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <!-- Compiler plugin -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.13.0</version>
                <configuration>
                    <source>21</source>
                    <target>21</target>
                </configuration>
            </plugin>

            <!-- JAR plugin avec manifest agent -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <version>3.4.2</version>
                <configuration>
                    <archive>
                        <manifestEntries>
                            <Premain-Class>com.wakfuassistant.agent.WakfuSpyAgent</Premain-Class>
                            <Agent-Class>com.wakfuassistant.agent.WakfuSpyAgent</Agent-Class>
                            <Can-Redefine-Classes>true</Can-Redefine-Classes>
                            <Can-Retransform-Classes>true</Can-Retransform-Classes>
                            <Can-Set-Native-Method-Prefix>true</Can-Set-Native-Method-Prefix>
                        </manifestEntries>
                    </archive>
                </configuration>
            </plugin>

            <!-- Shade plugin pour creer un fat-jar avec Byte Buddy inclus -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-shade-plugin</artifactId>
                <version>3.6.0</version>
                <executions>
                    <execution>
                        <phase>package</phase>
                        <goals>
                            <goal>shade</goal>
                        </goals>
                        <configuration>
                            <createDependencyReducedPom>false</createDependencyReducedPom>
                            <transformers>
                                <transformer implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
                                    <manifestEntries>
                                        <Premain-Class>com.wakfuassistant.agent.WakfuSpyAgent</Premain-Class>
                                        <Agent-Class>com.wakfuassistant.agent.WakfuSpyAgent</Agent-Class>
                                        <Can-Redefine-Classes>true</Can-Redefine-Classes>
                                        <Can-Retransform-Classes>true</Can-Retransform-Classes>
                                        <Can-Set-Native-Method-Prefix>true</Can-Set-Native-Method-Prefix>
                                    </manifestEntries>
                                </transformer>
                            </transformers>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
</project>

```

## 2. Fichiers Java sources
### ChannelReadAdvice.java (5300 B, 114 lignes)
**Path** : H:\Code\Wakfuassistant\agent\src\main\java\com\wakfuassistant\agent\ChannelReadAdvice.java
```java
package com.wakfuassistant.agent;

import net.bytebuddy.asm.Advice;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ChannelReadAdvice {

    @Advice.OnMethodEnter(suppress = Throwable.class)
    public static void onEnter(
            @Advice.Argument(0) Object ctx,
            @Advice.Argument(1) Object msg) {

        try {
            String msgType = msg.getClass().getName();
            String simpleType = msgType.contains(".") ? msgType.substring(msgType.lastIndexOf('.') + 1) : msgType;
            String timestamp = new java.text.SimpleDateFormat("HH:mm:ss.SSS")
                .format(new java.util.Date());

            StringBuilder sb = new StringBuilder(4096);
            sb.append(timestamp).append("|MSG|").append(simpleType);

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
                    } else if (val instanceof byte[]) {
                        byte[] arr = (byte[]) val;
                        valStr = "byte[" + arr.length + "]";
                        // Dump hex pour tout byte array entre 10 et 50000 bytes
                        if (arr.length > 10 && arr.length < 50000) {
                            StringBuilder hex = new StringBuilder(arr.length * 3);
                            for (int i = 0; i < arr.length; i++) {
                                // espace supprime pour parsing continu
                                int b2 = arr[i] & 0xFF;
                                hex.append("0123456789ABCDEF".charAt(b2 >> 4));
                                hex.append("0123456789ABCDEF".charAt(b2 & 0xF));
                            }
                            valStr += "|HEX=" + hex.toString();
                            StringBuilder ascii = new StringBuilder(arr.length);
                            for (int i = 0; i < arr.length; i++) {
                                int c = arr[i] & 0xFF;
                                if (c >= 32 && c < 127) {
                                    ascii.append((char) c);
                                } else {
                                    ascii.append('.');
                                }
                            }
                            valStr += "|ASCII=" + ascii.toString();
                        }
                    } else if (val instanceof Number || val instanceof Boolean || val instanceof Character) {
                        valStr = val.toString();
                    } else if (val instanceof String) {
                        String s = (String) val;
                        valStr = "\"" + (s.length() > 100 ? s.substring(0, 100) + "..." : s) + "\"";
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
                    } else {
                        String s = val.toString();
                        if (s.length() > 100) s = s.substring(0, 100) + "...";
                        valStr = s;
                    }
                    sb.append("|").append(f.getName()).append("=").append(valStr);
                } catch (Exception e) {
                    // skip field
                }
            }
            sb.append("|_fieldCount=").append(fieldCount);

            String line = sb.toString();
            com.wakfuassistant.agent.WakfuSpyAgent.logMessage(line);

            // Route vers HDV log si c'est un message marche
            if (simpleType.startsWith("co") || simpleType.startsWith("cq") ||
                simpleType.startsWith("cs") || simpleType.startsWith("cl")) {
                com.wakfuassistant.agent.WakfuSpyAgent.logHdv(line);
            }

        } catch (Exception e) {
            // silent
        }
    }
}

```

### PipelineAdvice.java (3132 B, 73 lignes)
**Path** : H:\Code\Wakfuassistant\agent\src\main\java\com\wakfuassistant\agent\PipelineAdvice.java
```java
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

```

### WakfuSpyAgent.java (13423 B, 318 lignes)
**Path** : H:\Code\Wakfuassistant\agent\src\main\java\com\wakfuassistant\agent\WakfuSpyAgent.java
```java
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

```


## 3. JARs compiles
- `H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar` (8639.7 KB)
- `H:\Code\Wakfuassistant\agent\target\original-wakfu-spy-agent-1.0.0.jar` (17 KB)
- `H:\Code\Wakfuassistant\agent\target\wakfu-spy-agent-1.0.0.jar` (8639.7 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\boot\plexus-classworlds-2.9.0.jar` (52.8 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\aopalliance-1.0.jar` (4.4 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\asm-9.9.1.jar` (123.3 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\commons-cli-1.11.0.jar` (107.6 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\commons-codec-1.21.0.jar` (393.1 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\error_prone_annotations-2.41.0.jar` (19.9 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\failureaccess-1.0.3.jar` (10.5 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\gson-2.13.2.jar` (283.1 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\guava-33.5.0-jre.jar` (2946.6 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\guice-5.1.0-classes.jar` (641.5 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\httpclient-4.5.14.jar` (767.2 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\httpcore-4.4.16.jar` (320.2 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\jansi-2.4.2.jar` (250.5 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\javax.annotation-api-1.3.2.jar` (26 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\javax.inject-1.jar` (2.4 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\jcl-over-slf4j-1.7.36.jar` (16.2 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\jspecify-1.0.0.jar` (3.7 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-artifact-3.9.14.jar` (57.5 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-builder-support-3.9.14.jar` (14.1 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-compat-3.9.14.jar` (279.9 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-core-3.9.14.jar` (704.5 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-embedder-3.9.14.jar` (114.7 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-model-3.9.14.jar` (212.9 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-model-builder-3.9.14.jar` (203.8 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-plugin-api-3.9.14.jar` (46.5 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-repository-metadata-3.9.14.jar` (27.9 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-resolver-api-1.9.27.jar` (154.5 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-resolver-connector-basic-1.9.27.jar` (39.4 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-resolver-impl-1.9.27.jar` (319.7 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-resolver-named-locks-1.9.27.jar` (37.1 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-resolver-provider-3.9.14.jar` (77.2 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-resolver-spi-1.9.27.jar` (50.4 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-resolver-transport-file-1.9.27.jar` (15.8 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-resolver-transport-http-1.9.27.jar` (58.8 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-resolver-transport-wagon-1.9.27.jar` (31.7 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-resolver-util-1.9.27.jar` (192.7 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-settings-3.9.14.jar` (43.6 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-settings-builder-3.9.14.jar` (41.4 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-shared-utils-3.4.2.jar` (147.6 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\maven-slf4j-provider-3.9.14.jar` (23.2 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\org.eclipse.sisu.inject-1.0.0.jar` (297.1 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\org.eclipse.sisu.plexus-1.0.0.jar` (210.7 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\plexus-cipher-2.0.jar` (12.7 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\plexus-component-annotations-2.2.0.jar` (4.1 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\plexus-interpolation-1.29.jar` (86.1 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\plexus-sec-dispatcher-2.0.jar` (23.1 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\plexus-utils-3.6.0.jar` (265.4 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\slf4j-api-1.7.36.jar` (40.2 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\wagon-file-3.5.3.jar` (11.1 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\wagon-http-3.5.3.jar` (9.2 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\wagon-http-shared-3.5.3.jar` (39.9 KB)
- `H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\lib\wagon-provider-api-3.5.3.jar` (53.8 KB)

## 4. Launchers
### launch_wakfu_with_agent.bat (1404 B)
**Path** : H:\Code\Wakfuassistant\agent\launch_wakfu_with_agent.bat
```batch
@echo off
echo ============================================
echo   LANCEMENT WAKFU AVEC SPY AGENT V3
echo ============================================
echo.

set AGENT_JAR=H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar

if not exist "%AGENT_JAR%" (
    echo ERREUR: Agent JAR non trouve!
    pause
    exit /b 1
)

echo [1] Definition de JAVA_TOOL_OPTIONS...
set JAVA_TOOL_OPTIONS=-javaagent:%AGENT_JAR% --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED

echo   JAVA_TOOL_OPTIONS=%JAVA_TOOL_OPTIONS%
echo.
echo [2] Lancement du launcher Ankama...

start "" "G:\ankama\Ankama Launcher.exe"

echo.
echo [3] Clique JOUER dans le launcher.
echo   Appuyez sur une touche apres que le jeu demarre.
echo.
pause

echo.
echo [4] Surveillance des logs (Ctrl+C pour arreter)...
echo.

if exist "H:\Code\Wakfuassistant\agent\logs\wakfu_messages.log" (
    powershell -Command "Get-Content 'H:\Code\Wakfuassistant\agent\logs\wakfu_messages.log' -Wait -Tail 50"
) else (
    echo   En attente de wakfu_messages.log...
    :wait_loop
    timeout /t 2 >nul
    if exist "H:\Code\Wakfuassistant\agent\logs\wakfu_messages.log" (
        powershell -Command "Get-Content 'H:\Code\Wakfuassistant\agent\logs\wakfu_messages.log' -Wait -Tail 50"
    ) else (
        goto wait_loop
    )
)

```

### start_watcher.bat (866 B)
**Path** : H:\Code\Wakfuassistant\agent\start_watcher.bat
```batch
@echo off
title Wakfu Assistant
set AGENT_JAR=H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar

if not exist "%AGENT_JAR%" (
    echo ERREUR: Agent JAR non trouve: %AGENT_JAR%
    pause
    exit /b 1
)

set JAVA_TOOL_OPTIONS=-javaagent:%AGENT_JAR% --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED

echo [OK] Agent configure
echo [..] Lancement du launcher Ankama...
start "" "G:\ankama\Ankama Launcher.exe"
echo [OK] Launcher lance - clique JOUER
echo [..] Attente de Wakfu...

:wait_wakfu
timeout /t 3 >nul
tasklist /fi "imagename eq java.exe" 2>nul | findstr /i "java.exe" >nul
if errorlevel 1 goto wait_wakfu

echo [OK] Wakfu detecte - attente agent (10s)...
timeout /t 10 >nul
echo [OK] Lancement du dashboard...

python "H:\Code\Wakfuassistant\agent\dashboard.py"
pause

```


## 5. MANIFEST.MF
Aucun MANIFEST.MF trouve

## 6. POC HDV Agent
### CmyDnAdvice.java (4243 B, 96 lignes)
**Path** : H:\Code\Wakfuassistant\docs\RND\poc-hdv\agent\src\main\java\com\wakfu\agent\CmyDnAdvice.java
```java
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

```

### MarketNettyAdvice.java (12967 B, 251 lignes)
**Path** : H:\Code\Wakfuassistant\docs\RND\poc-hdv\agent\src\main\java\com\wakfu\agent\MarketNettyAdvice.java
```java
package com.wakfu.agent;

import net.bytebuddy.asm.Advice;
import java.lang.reflect.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MarketNettyAdvice {

    @Advice.OnMethodEnter
    public static void intercept(@Advice.Argument(1) Object msg) {
        try {
            String className = msg.getClass().getSimpleName();
            String ts = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
            
            // === LOG DE BASE POUR TOUS LES MESSAGES ===
            StringBuilder logLine = new StringBuilder();
            logLine.append(ts).append("|").append(className).append("|");
            
            // Extraire TOUS les champs de l'objet
            StringBuilder fieldsInfo = new StringBuilder();
            StringBuilder hexDump = new StringBuilder();
            byte[] biggestByteArray = null;
            String biggestFieldName = "";
            int msgIdValue = -1;
            
            Field[] fields = msg.getClass().getDeclaredFields();
            for (Field f : fields) {
                f.setAccessible(true);
                Object val = f.get(msg);
                String fname = f.getName();
                
                if (val == null) {
                    fieldsInfo.append(fname).append("=null|");
                } else if (val instanceof byte[]) {
                    byte[] arr = (byte[]) val;
                    fieldsInfo.append(fname).append("=byte[").append(arr.length).append("]|");
                    // Garder le plus gros byte[] (payload principal)
                    if (biggestByteArray == null || arr.length > biggestByteArray.length) {
                        biggestByteArray = arr;
                        biggestFieldName = fname;
                    }
                } else if (val instanceof java.util.List) {
                    java.util.List<?> list = (java.util.List<?>) val;
                    fieldsInfo.append(fname).append("=List[").append(list.size()).append("]|");
                    // Explorer les elements de la liste
                    for (int i = 0; i < Math.min(list.size(), 3); i++) {
                        Object elem = list.get(i);
                        if (elem != null) {
                            fieldsInfo.append(fname).append("[").append(i).append("]=").append(elem.getClass().getSimpleName()).append("{");
                            Field[] elemFields = elem.getClass().getDeclaredFields();
                            for (Field ef : elemFields) {
                                ef.setAccessible(true);
                                Object ev = ef.get(elem);
                                if (ev instanceof byte[]) {
                                    byte[] earr = (byte[]) ev;
                                    fieldsInfo.append(ef.getName()).append("=byte[").append(earr.length).append("],");
                                    if (biggestByteArray == null || earr.length > biggestByteArray.length) {
                                        biggestByteArray = earr;
                                        biggestFieldName = fname + "[" + i + "]." + ef.getName();
                                    }
                                } else {
                                    fieldsInfo.append(ef.getName()).append("=").append(ev).append(",");
                                }
                            }
                            fieldsInfo.append("}|");
                        }
                    }
                } else {
                    fieldsInfo.append(fname).append("=").append(val).append("|");
                    // Detecter msgId / identifiant
                    if (fname.equals("mfZ") || fname.contains("Id") || fname.contains("id")) {
                        try {
                            msgIdValue = ((Number) val).intValue();
                        } catch (Exception ignore) {}
                    }
                }
            }
            
            logLine.append("fields=").append(fields.length).append("|").append(fieldsInfo);
            
            // === HEX DUMP du plus gros byte[] ===
            if (biggestByteArray != null && biggestByteArray.length > 0) {
                hexDump.append("PAYLOAD_FIELD=").append(biggestFieldName);
                hexDump.append("|SIZE=").append(biggestByteArray.length);
                hexDump.append("|HEX=");
                for (int i = 0; i < biggestByteArray.length; i++) {
                    hexDump.append(String.format("%02X", biggestByteArray[i] & 0xFF));
                }
                logLine.append(hexDump);
            }
            
            // === ECRIRE DANS LE LOG PRINCIPAL ===
            String logPath = "H:\\Code\\Wakfuassistant\\logs\\market_v22_all.log";
            synchronized (MarketNettyAdvice.class) {
                try (PrintWriter pw = new PrintWriter(new FileWriter(logPath, true))) {
                    pw.println(logLine.toString());
                }
            }
            
            // === ECRIRE LE JSON POUR LES MESSAGES AVEC PAYLOAD ===
            if (biggestByteArray != null && biggestByteArray.length > 50) {
                String jsonPath = "H:\\Code\\Wakfuassistant\\logs\\market_v22_payloads.json";
                
                // Decoder le protobuf en inline (champs principaux)
                byte[] data = biggestByteArray;
                int pos = 0;
                StringBuilder decoded = new StringBuilder();
                int fieldCount = 0;
                
                while (pos < data.length && fieldCount < 30) {
                    // Lire le tag varint
                    long tag = 0;
                    int shift = 0;
                    while (pos < data.length) {
                        byte b = data[pos++];
                        tag |= ((long)(b & 0x7F)) << shift;
                        shift += 7;
                        if ((b & 0x80) == 0) break;
                    }
                    
                    int fieldNum = (int)(tag >>> 3);
                    int wireType = (int)(tag & 0x07);
                    
                    if (fieldNum == 0 || fieldNum > 100) break;
                    
                    switch (wireType) {
                        case 0: // VARINT
                            long varint = 0;
                            shift = 0;
                            while (pos < data.length) {
                                byte b = data[pos++];
                                varint |= ((long)(b & 0x7F)) << shift;
                                shift += 7;
                                if ((b & 0x80) == 0) break;
                            }
                            long signed = (varint >>> 1) ^ -(varint & 1);
                            decoded.append("\"F").append(fieldNum).append("\":").append(signed).append(",");
                            break;
                        case 1: // FIX64
                            pos += 8;
                            decoded.append("\"F").append(fieldNum).append("_fix64\":true,");
                            break;
                        case 2: // LENGTH DELIMITED
                            long len = 0;
                            shift = 0;
                            while (pos < data.length) {
                                byte b = data[pos++];
                                len |= ((long)(b & 0x7F)) << shift;
                                shift += 7;
                                if ((b & 0x80) == 0) break;
                            }
                            if (len > 0 && len < 500 && pos + len <= data.length) {
                                // Tenter de decoder comme sous-message
                                byte[] sub = new byte[(int) len];
                                System.arraycopy(data, pos, sub, 0, (int) len);
                                decoded.append("\"F").append(fieldNum).append("_bytes\":").append(len).append(",");
                                
                                // Decoder les sous-champs
                                int spos = 0;
                                StringBuilder subDecoded = new StringBuilder();
                                int subCount = 0;
                                while (spos < sub.length && subCount < 15) {
                                    long stag = 0;
                                    int sshift = 0;
                                    while (spos < sub.length) {
                                        byte sb = sub[spos++];
                                        stag |= ((long)(sb & 0x7F)) << sshift;
                                        sshift += 7;
                                        if ((sb & 0x80) == 0) break;
                                    }
                                    int sfn = (int)(stag >>> 3);
                                    int swt = (int)(stag & 0x07);
                                    if (sfn == 0 || sfn > 100) break;
                                    
                                    if (swt == 0) {
                                        long sv = 0;
                                        sshift = 0;
                                        while (spos < sub.length) {
                                            byte sb = sub[spos++];
                                            sv |= ((long)(sb & 0x7F)) << sshift;
                                            sshift += 7;
                                            if ((sb & 0x80) == 0) break;
                                        }
                                        long ssigned = (sv >>> 1) ^ -(sv & 1);
                                        subDecoded.append("\"F").append(fieldNum).append(".F").append(sfn).append("\":").append(ssigned).append(",");
                                    } else if (swt == 2) {
                                        long slen = 0;
                                        sshift = 0;
                                        while (spos < sub.length) {
                                            byte sb = sub[spos++];
                                            slen |= ((long)(sb & 0x7F)) << sshift;
                                            sshift += 7;
                                            if ((sb & 0x80) == 0) break;
                                        }
                                        if (slen >= 0 && spos + slen <= sub.length) {
                                            spos += (int) slen;
                                            subDecoded.append("\"F").append(fieldNum).append(".F").append(sfn).append("_sub\":").append(slen).append(",");
                                        } else break;
                                    } else if (swt == 1) {
                                        spos += 8;
                                    } else if (swt == 5) {
                                        spos += 4;
                                    } else break;
                                    subCount++;
                                }
                                decoded.append(subDecoded);
                                pos += (int) len;
                            } else {
                                if (len >= 0 && pos + len <= data.length) pos += (int) len;
                                else break;
                            }
                            break;
                        case 5: // FIX32
                            pos += 4;
                            decoded.append("\"F").append(fieldNum).append("_fix32\":true,");
                            break;
                        default:
                            fieldCount = 100; // stop
                            break;
                    }
                    fieldCount++;
                }
                
                // Construire le JSON final
                String json = "{\"ts\":\"" + ts + "\",\"msgType\":\"" + className + 
                    "\",\"msgId\":" + msgIdValue + 
                    ",\"payloadField\":\"" + biggestFieldName + 
                    "\",\"payloadSize\":" + biggestByteArray.length + 
                    "," + decoded.toString() + 
                    "\"_end\":true}";
                
                synchronized (MarketNettyAdvice.class) {
                    try (PrintWriter pw = new PrintWriter(new FileWriter(jsonPath, true))) {
                        pw.println(json);
                    }
                }
            }
            
        } catch (Throwable t) {
            try {
                String errPath = "H:\\Code\\Wakfuassistant\\logs\\market_v22_errors.log";
                try (PrintWriter pw = new PrintWriter(new FileWriter(errPath, true))) {
                    pw.println(new SimpleDateFormat("HH:mm:ss.SSS").format(new Date()) + "|ERROR|" + t.getMessage());
                    t.printStackTrace(pw);
                }
            } catch (Throwable ignore) {}
        }
    }
}

```

### MarketPriceAgentV2.java (2099 B, 50 lignes)
**Path** : H:\Code\Wakfuassistant\docs\RND\poc-hdv\agent\src\main\java\com\wakfu\agent\MarketPriceAgentV2.java
```java
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

```

### MarketPriceAgentV3.java (3353 B, 83 lignes)
**Path** : H:\Code\Wakfuassistant\docs\RND\poc-hdv\agent\src\main\java\com\wakfu\agent\MarketPriceAgentV3.java
```java
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

```

### NettyDispatchAdvice.java (621 B, 22 lignes)
**Path** : H:\Code\Wakfuassistant\docs\RND\poc-hdv\agent\src\main\java\com\wakfu\agent\NettyDispatchAdvice.java
```java
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

```


