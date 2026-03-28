package com.wakfuassistant.agent;

import java.io.*;
import java.lang.management.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * MemoryMonitorAdvice v1.0
 * 
 * Thread daemon qui log les metriques memoire/GC toutes les 5 secondes.
 * Ecrit dans agent/logs/memory_monitor.jsonl (une ligne JSON par sample).
 * 
 * Metriques:
 *   - heap_used_mb / heap_max_mb / heap_pct
 *   - non_heap_used_mb
 *   - gc_count / gc_time_ms (par collecteur)
 *   - thread_count / daemon_count
 *   - loaded_classes
 *   - cpu_load (si disponible)
 *   - delta_gc_time_ms (temps GC depuis le dernier sample = proxy micro-freeze)
 * 
 * Usage: appeler MemoryMonitorAdvice.start() depuis WakfuSpyAgent.init()
 */
public class MemoryMonitorAdvice {

    private static final String LOG_PATH = WakfuSpyAgent.LOG_DIR + "\\memory_monitor.jsonl";
    private static final long INTERVAL_MS = 5000;
    private static volatile boolean running = false;

    public static void start() {
        if (running) return;
        running = true;

        Thread t = new Thread(() -> {
            WakfuSpyAgent.log("[MEMORY] Monitor demarre - interval " + INTERVAL_MS + "ms");
            WakfuSpyAgent.log("[MEMORY] Log: " + LOG_PATH);

            long prevGcTime = getTotalGcTime();
            long prevGcCount = getTotalGcCount();
            long startTime = System.currentTimeMillis();

            while (running) {
                try {
                    Thread.sleep(INTERVAL_MS);
                    String json = sample(prevGcTime, prevGcCount, startTime);
                    prevGcTime = getTotalGcTime();
                    prevGcCount = getTotalGcCount();
                    writeLine(json);
                } catch (InterruptedException e) {
                    break;
                } catch (Exception e) {
                    WakfuSpyAgent.log("[MEMORY] Erreur: " + e.getMessage());
                }
            }
        }, "WakfuSpy-MemoryMonitor");
        t.setDaemon(true);
        t.start();
    }

    public static void stop() {
        running = false;
    }

    private static String sample(long prevGcTime, long prevGcCount, long startTime) {
        MemoryMXBean mem = ManagementFactory.getMemoryMXBean();
        MemoryUsage heap = mem.getHeapMemoryUsage();
        MemoryUsage nonHeap = mem.getNonHeapMemoryUsage();

        long heapUsed = heap.getUsed();
        long heapMax = heap.getMax();
        double heapPct = heapMax > 0 ? (heapUsed * 100.0 / heapMax) : 0;

        long gcTime = getTotalGcTime();
        long gcCount = getTotalGcCount();
        long deltaGcTime = gcTime - prevGcTime;
        long deltaGcCount = gcCount - prevGcCount;

        ThreadMXBean threads = ManagementFactory.getThreadMXBean();
        int threadCount = threads.getThreadCount();
        int daemonCount = threads.getDaemonThreadCount();

        ClassLoadingMXBean cls = ManagementFactory.getClassLoadingMXBean();
        int loadedClasses = cls.getLoadedClassCount();

        long uptimeSec = (System.currentTimeMillis() - startTime) / 1000;

        // GC detail par collecteur
        StringBuilder gcDetail = new StringBuilder();
        gcDetail.append("[");
        boolean first = true;
        for (GarbageCollectorMXBean gc : ManagementFactory.getGarbageCollectorMXBeans()) {
            if (!first) gcDetail.append(",");
            gcDetail.append("{\"name\":\"").append(gc.getName()).append("\",");
            gcDetail.append("\"count\":").append(gc.getCollectionCount()).append(",");
            gcDetail.append("\"time_ms\":").append(gc.getCollectionTime()).append("}");
            first = false;
        }
        gcDetail.append("]");

        // Alerte freeze si delta GC > 100ms
        String alert = deltaGcTime > 100 ? ",\"alert\":\"GC_FREEZE_" + deltaGcTime + "ms\"" : "";

        String ts = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS").format(new Date());

        return "{\"ts\":\"" + ts + "\""
            + ",\"uptime_s\":" + uptimeSec
            + ",\"heap_used_mb\":" + (heapUsed / 1048576)
            + ",\"heap_max_mb\":" + (heapMax / 1048576)
            + ",\"heap_pct\":" + String.format("%.1f", heapPct)
            + ",\"non_heap_mb\":" + (nonHeap.getUsed() / 1048576)
            + ",\"gc_total_count\":" + gcCount
            + ",\"gc_total_time_ms\":" + gcTime
            + ",\"gc_delta_count\":" + deltaGcCount
            + ",\"gc_delta_time_ms\":" + deltaGcTime
            + ",\"gc_collectors\":" + gcDetail.toString()
            + ",\"threads\":" + threadCount
            + ",\"daemon_threads\":" + daemonCount
            + ",\"loaded_classes\":" + loadedClasses
            + alert
            + "}";
    }

    private static long getTotalGcTime() {
        long total = 0;
        for (GarbageCollectorMXBean gc : ManagementFactory.getGarbageCollectorMXBeans()) {
            if (gc.getCollectionTime() > 0) total += gc.getCollectionTime();
        }
        return total;
    }

    private static long getTotalGcCount() {
        long total = 0;
        for (GarbageCollectorMXBean gc : ManagementFactory.getGarbageCollectorMXBeans()) {
            if (gc.getCollectionCount() > 0) total += gc.getCollectionCount();
        }
        return total;
    }

    private static void writeLine(String json) {
        try (FileWriter fw = new FileWriter(LOG_PATH, true)) {
            fw.write(json + "\n");
        } catch (IOException e) {
            WakfuSpyAgent.log("[MEMORY] Erreur ecriture: " + e.getMessage());
        }
    }
}
