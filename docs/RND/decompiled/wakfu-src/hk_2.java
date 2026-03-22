/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Metric
 *  com.codahale.metrics.MetricSet
 *  com.codahale.metrics.jvm.ThreadDeadlockDetector
 *  com.google.common.primitives.Ints
 */
import com.codahale.metrics.Metric;
import com.codahale.metrics.MetricSet;
import com.codahale.metrics.jvm.ThreadDeadlockDetector;
import com.google.common.primitives.Ints;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

/*
 * Renamed from Hk
 */
public class hk_2
implements MetricSet {
    private static final int aIt = 0;
    private final ThreadMXBean aIu = ManagementFactory.getThreadMXBean();
    private final ThreadDeadlockDetector aIv = new ThreadDeadlockDetector();

    public Map<String, Metric> getMetrics() {
        HashMap hashMap = new HashMap();
        for (Thread.State state : Thread.State.values()) {
            String string = state.toString().toLowerCase();
            hashMap.put(string + ".count", new hl_2("jvm.threads." + string + ".count", () -> this.a(state)));
        }
        hashMap.put("count", new hl_2("jvm.threads.count", this.aIu::getThreadCount));
        hashMap.put("daemon.count", new hl_2("jvm.threads.daemon.count", this.aIu::getDaemonThreadCount));
        hashMap.put("deadlock.count", new hl_2("jvm.threads.deadlock.count", () -> this.aIv.getDeadlockedThreads().size()));
        hashMap.put("deadlocks", new hl_2("jvm.threads.deadlocks", () -> ((ThreadDeadlockDetector)this.aIv).getDeadlockedThreads()));
        return Collections.unmodifiableMap(hashMap);
    }

    private int a(Thread.State state) {
        ThreadInfo[] threadInfoArray = this.aIu.getThreadInfo(this.aIu.getAllThreadIds(), 0);
        return Ints.saturatedCast((long)Stream.of(threadInfoArray).filter(Objects::nonNull).filter(threadInfo -> threadInfo.getThreadState() == state).count());
    }
}

