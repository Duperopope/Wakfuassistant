package com.wakfuassistant.agent;

import net.bytebuddy.asm.Advice;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class ChannelReadAdvice {

    private static final String LOG_DIR = System.getProperty("user.dir") + "/../agent/logs/";
    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

    // Compteurs atomiques (zero allocation)
    private static final AtomicLong totalMessages = new AtomicLong(0);
    private static final AtomicLong hdvMessages = new AtomicLong(0);
    private static final AtomicLong droppedMessages = new AtomicLong(0);
    private static final ConcurrentHashMap<String, AtomicLong> typeCounts = new ConcurrentHashMap<>();

    // Buffer async pour les logs HDV
    private static final LinkedBlockingQueue<String> hdvQueue = new LinkedBlockingQueue<>(5000);
    private static final LinkedBlockingQueue<String> offerQueue = new LinkedBlockingQueue<>(5000);
    private static volatile boolean writerStarted = false;

    // Prefixes HDV qu'on veut capturer
    private static final String[] HDV_PREFIXES = {"cr", "co", "cq", "cs", "cl"};

    static {
        startAsyncWriter();
    }

    private static void startAsyncWriter() {
        if (writerStarted) return;
        writerStarted = true;

        // Thread dedie pour ecrire les logs HDV sans bloquer le game thread
        Thread writer = new Thread(() -> {
            try {
                File dir = new File(LOG_DIR);
                if (!dir.exists()) dir.mkdirs();

                BufferedWriter hdvWriter = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(LOG_DIR + "wakfu_hdv.log", true), StandardCharsets.UTF_8), 
                    65536  // 64KB buffer - ecrit par gros blocs
                );
                BufferedWriter offerWriter = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(LOG_DIR + "wakfu_hdv_offers.jsonl", true), StandardCharsets.UTF_8),
                    32768
                );

                long lastFlush = System.currentTimeMillis();

                while (true) {
                    // Poll avec timeout pour permettre le flush periodique
                    String hdvLine = hdvQueue.poll(2, TimeUnit.SECONDS);
                    if (hdvLine != null) {
                        hdvWriter.write(hdvLine);
                        hdvWriter.newLine();
                    }

                    // Vider la queue offers
                    String offerLine;
                    while ((offerLine = offerQueue.poll()) != null) {
                        offerWriter.write(offerLine);
                        offerWriter.newLine();
                    }

                    // Flush toutes les 5 secondes max (pas a chaque ligne)
                    long now = System.currentTimeMillis();
                    if (now - lastFlush > 5000) {
                        hdvWriter.flush();
                        offerWriter.flush();
                        lastFlush = now;
                    }
                }
            } catch (Exception e) {
                // Silent - on ne veut pas crasher le jeu
            }
        }, "WakfuSpy-AsyncWriter");
        writer.setDaemon(true);
        writer.setPriority(Thread.MIN_PRIORITY);
        writer.start();
    }

    private static boolean isHdvMessage(String typeName) {
        for (String prefix : HDV_PREFIXES) {
            if (typeName.startsWith(prefix)) return true;
        }
        return false;
    }

    @Advice.OnMethodEnter
    public static void onEnter(@Advice.Argument(1) Object msg) {
        try {
            if (msg == null) return;

            String typeName = msg.getClass().getSimpleName();
            totalMessages.incrementAndGet();

            // Compteur par type (lightweight)
            typeCounts.computeIfAbsent(typeName, k -> new AtomicLong(0)).incrementAndGet();

            // Seuls les messages HDV sont logges
            if (!isHdvMessage(typeName)) return;

            hdvMessages.incrementAndGet();
            String ts = LocalDateTime.now().format(FMT);

            // Extraire les champs sans creer de gros StringBuilder
            StringBuilder sb = new StringBuilder(256);
            sb.append(ts).append(" | ").append(typeName).append(" | ");

            Field[] fields = msg.getClass().getDeclaredFields();
            int fieldCount = 0;
            boolean isOffer = typeName.startsWith("crV") || typeName.startsWith("crW");
            StringBuilder offerSb = isOffer ? new StringBuilder(128) : null;
            if (isOffer) offerSb.append("{");

            for (Field f : fields) {
                if (Modifier.isStatic(f.getModifiers())) continue;
                f.setAccessible(true);
                Object val = f.get(msg);
                if (val == null) continue;

                fieldCount++;
                String fname = f.getName();
                String valStr;

                if (val instanceof byte[]) {
                    valStr = "bytes[" + ((byte[]) val).length + "]";
                } else if (val instanceof String) {
                    String s = (String) val;
                    valStr = s.length() > 60 ? s.substring(0, 60) + "..." : s;
                } else if (val instanceof Number || val instanceof Boolean) {
                    valStr = val.toString();
                } else if (val.getClass().isArray()) {
                    valStr = val.getClass().getSimpleName() + "[" + java.lang.reflect.Array.getLength(val) + "]";
                } else {
                    valStr = val.getClass().getSimpleName();
                }

                sb.append(fname).append("=").append(valStr).append(" ");

                if (isOffer) {
                    if (fieldCount > 1) offerSb.append(",");
                    offerSb.append("\"").append(fname).append("\":");
                    if (val instanceof Number) {
                        offerSb.append(val);
                    } else if (val instanceof Boolean) {
                        offerSb.append(val);
                    } else {
                        offerSb.append("\"").append(valStr.replace("\"", "\\\"")).append("\"");
                    }
                }

                // Max 20 champs pour eviter les gros messages
                if (fieldCount >= 20) {
                    sb.append("...(+").append(fields.length - fieldCount).append(")");
                    break;
                }
            }

            sb.append("[").append(fieldCount).append("f]");

            // Envoyer au writer async (non-bloquant)
            if (!hdvQueue.offer(sb.toString())) {
                droppedMessages.incrementAndGet();
            }

            // Log les offres HDV en JSON
            if (isOffer && offerSb != null) {
                offerSb.append(",\"_ts\":\"").append(ts).append("\"}");
                offerQueue.offer(offerSb.toString());
            }

        } catch (Exception e) {
            // Silent
        }
    }

    // Methode appelee par le MemoryMonitor pour les stats
    public static String getStats() {
        long total = totalMessages.get();
        long hdv = hdvMessages.get();
        long dropped = droppedMessages.get();
        int types = typeCounts.size();
        return String.format("msgs=%d hdv=%d dropped=%d types=%d hdvQ=%d", 
            total, hdv, dropped, types, hdvQueue.size());
    }

    // Top 10 message types
    public static String getTopTypes() {
        return typeCounts.entrySet().stream()
            .sorted((a, b) -> Long.compare(b.getValue().get(), a.getValue().get()))
            .limit(10)
            .map(e -> e.getKey() + ":" + e.getValue().get())
            .reduce((a, b) -> a + ", " + b)
            .orElse("none");
    }
}
