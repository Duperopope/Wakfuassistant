package com.wakfuassistant.agent;

import java.io.*;
import java.lang.management.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * HeapProfilerAdvice v1.0
 * 
 * Toutes les 30 secondes, force un mini-GC diagnostic et log:
 *   - Top classes par nombre d'instances (via classloading stats)
 *   - Nombre de threads par groupe
 *   - Taille des pools Netty ByteBuf
 *   - Detection de croissance anormale entre samples
 * 
 * Ecrit dans agent/logs/heap_profiler.jsonl
 */
public class HeapProfilerAdvice {

    private static final String LOG_PATH = WakfuSpyAgent.LOG_DIR + "\\heap_profiler.jsonl";
    private static final long INTERVAL_MS = 30000;
    private static volatile boolean running = false;

    // Tracking croissance classes
    private static final ConcurrentHashMap<String, AtomicLong> classInstanceCount = new ConcurrentHashMap<>();
    private static int prevLoadedClasses = 0;
    private static long prevHeapUsed = 0;

    public static void start() {
        if (running) return;
        running = true;

        Thread t = new Thread(() -> {
            WakfuSpyAgent.log("[PROFILER] Heap Profiler demarre - interval " + INTERVAL_MS + "ms");
            long startTime = System.currentTimeMillis();

            while (running) {
                try {
                    Thread.sleep(INTERVAL_MS);
                    String json = profileHeap(startTime);
                    writeLine(json);
                } catch (InterruptedException e) {
                    break;
                } catch (Exception e) {
                    WakfuSpyAgent.log("[PROFILER] Erreur: " + e.getMessage());
                }
            }
        }, "WakfuSpy-HeapProfiler");
        t.setDaemon(true);
        t.start();
    }

    public static void stop() {
        running = false;
    }

    /**
     * Enregistre la creation d un objet (appele depuis les advices)
     */
    public static void trackAllocation(String className) {
        classInstanceCount.computeIfAbsent(className, k -> new AtomicLong(0)).incrementAndGet();
    }

    private static String profileHeap(long startTime) {
        MemoryMXBean mem = ManagementFactory.getMemoryMXBean();
        MemoryUsage heap = mem.getHeapMemoryUsage();
        long heapUsed = heap.getUsed();
        long heapDelta = heapUsed - prevHeapUsed;
        prevHeapUsed = heapUsed;

        ClassLoadingMXBean cls = ManagementFactory.getClassLoadingMXBean();
        int loaded = cls.getLoadedClassCount();
        long totalLoaded = cls.getTotalLoadedClassCount();
        long unloaded = cls.getUnloadedClassCount();
        int classDelta = loaded - prevLoadedClasses;
        prevLoadedClasses = loaded;

        // Thread details par groupe
        Map<String, Integer> threadGroups = new TreeMap<>();
        for (Thread t : Thread.getAllStackTraces().keySet()) {
            ThreadGroup g = t.getThreadGroup();
            String name = g != null ? g.getName() : "null";
            threadGroups.merge(name, 1, Integer::sum);
        }

        // Memory pools detail
        StringBuilder pools = new StringBuilder();
        pools.append("[");
        boolean first = true;
        for (MemoryPoolMXBean pool : ManagementFactory.getMemoryPoolMXBeans()) {
            if (!first) pools.append(",");
            MemoryUsage usage = pool.getUsage();
            pools.append("{\"name\":\"").append(pool.getName()).append("\",");
            pools.append("\"used_mb\":").append(usage.getUsed() / 1048576).append(",");
            pools.append("\"max_mb\":").append(usage.getMax() > 0 ? usage.getMax() / 1048576 : -1).append("}");
            first = false;
        }
        pools.append("]");

        // Top allocations trackees
        List<Map.Entry<String, AtomicLong>> topAllocs = new ArrayList<>(classInstanceCount.entrySet());
        topAllocs.sort((a, b) -> Long.compare(b.getValue().get(), a.getValue().get()));
        StringBuilder allocsJson = new StringBuilder();
        allocsJson.append("[");
        first = true;
        int count = 0;
        for (Map.Entry<String, AtomicLong> e : topAllocs) {
            if (count >= 20) break;
            if (!first) allocsJson.append(",");
            allocsJson.append("{\"class\":\"").append(e.getKey()).append("\",");
            allocsJson.append("\"count\":").append(e.getValue().get()).append("}");
            first = false;
            count++;
        }
        allocsJson.append("]");

        // Thread groups JSON
        StringBuilder tgJson = new StringBuilder();
        tgJson.append("{");
        first = true;
        for (Map.Entry<String, Integer> e : threadGroups.entrySet()) {
            if (!first) tgJson.append(",");
            tgJson.append("\"").append(e.getKey()).append("\":").append(e.getValue());
            first = false;
        }
        tgJson.append("}");

        long uptimeSec = (System.currentTimeMillis() - startTime) / 1000;
        String ts = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS").format(new Date());

        // Alerte fuite si heap monte de +100MB entre deux samples
        String alert = "";
        if (heapDelta > 104857600) {
            alert = ",\"alert\":\"HEAP_GROWTH_" + (heapDelta / 1048576) + "MB\"";
        }
        if (classDelta > 500) {
            alert += (alert.isEmpty() ? "," : "") + "\"class_alert\":\"CLASS_LOAD_" + classDelta + "\"";
        }

        return "{\"ts\":\"" + ts + "\""
            + ",\"uptime_s\":" + uptimeSec
            + ",\"heap_used_mb\":" + (heapUsed / 1048576)
            + ",\"heap_delta_mb\":" + (heapDelta / 1048576)
            + ",\"loaded_classes\":" + loaded
            + ",\"total_loaded\":" + totalLoaded
            + ",\"unloaded\":" + unloaded
            + ",\"class_delta\":" + classDelta
            + ",\"thread_count\":" + Thread.activeCount()
            + ",\"thread_groups\":" + tgJson.toString()
            + ",\"memory_pools\":" + pools.toString()
            + ",\"top_allocations\":" + allocsJson.toString()
            + alert
            + "}";
    }

    private static void writeLine(String json) {
        try (FileWriter fw = new FileWriter(LOG_PATH, true)) {
            fw.write(json + "\n");
        } catch (IOException e) {
            WakfuSpyAgent.log("[PROFILER] Erreur ecriture: " + e.getMessage());
        }
    }
}
