/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Counter
 *  com.codahale.metrics.Histogram
 *  com.codahale.metrics.Meter
 *  com.codahale.metrics.Metric
 *  com.codahale.metrics.MetricFilter
 *  com.codahale.metrics.MetricRegistry
 *  com.codahale.metrics.ScheduledReporter
 *  com.codahale.metrics.Timer
 *  com.google.inject.Inject
 *  javax.inject.Provider
 *  org.jetbrains.annotations.Nullable
 */
import com.codahale.metrics.Counter;
import com.codahale.metrics.Histogram;
import com.codahale.metrics.Meter;
import com.codahale.metrics.Metric;
import com.codahale.metrics.MetricFilter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.ScheduledReporter;
import com.codahale.metrics.Timer;
import com.google.inject.Inject;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import javax.inject.Provider;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from GG
 */
public class gg_2 {
    private final MetricRegistry aGN;
    private final Provider<ScheduledReporter> aGO;
    @Nullable
    private ScheduledReporter aGP;
    private final Set<String> aGQ = new HashSet<String>();

    @Inject
    private gg_2(MetricRegistry metricRegistry, Provider<ScheduledReporter> provider) {
        this.aGN = metricRegistry;
        this.aGO = provider;
    }

    public void aNU() {
        this.aGN.register("jvm.class", (Metric)new hb_2());
        this.aGN.register("jvm.threads", (Metric)new hk_2());
        this.aGN.register("jvm.gc", (Metric)new hd_2());
        this.aGN.register("jvm.memory", (Metric)new hf_2());
        this.aGN.register("jvm.buffer", (Metric)new gz_2());
    }

    private <T extends Metric> T b(String string, Supplier<T> supplier) {
        this.aGQ.add(string);
        return (T)this.aGN.register(string, (Metric)supplier.get());
    }

    public Meter c(String string, Supplier<Meter> supplier) {
        try {
            return this.aGQ.contains(string) ? this.aGN.meter(string) : this.b(string, supplier);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return this.aGN.meter(string);
        }
    }

    public Histogram d(String string, Supplier<Histogram> supplier) {
        try {
            return this.aGQ.contains(string) ? this.aGN.histogram(string) : this.b(string, supplier);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return this.aGN.histogram(string);
        }
    }

    public Timer e(String string, Supplier<Timer> supplier) {
        try {
            return this.aGQ.contains(string) ? this.aGN.timer(string) : this.b(string, supplier);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return this.aGN.timer(string);
        }
    }

    public Counter f(String string, Supplier<Counter> supplier) {
        try {
            return this.aGQ.contains(string) ? this.aGN.counter(string) : this.b(string, supplier);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return this.aGN.counter(string);
        }
    }

    public SortedSet<String> aNV() {
        return this.aGN.getNames();
    }

    public Map<String, Metric> getMetrics() {
        return this.aGN.getMetrics();
    }

    public gi_2 a(PrintStream printStream, MetricFilter metricFilter) {
        return new gi_2(this.aGN, printStream, metricFilter, TimeUnit.SECONDS, TimeUnit.MILLISECONDS);
    }

    public void a(int n, TimeUnit timeUnit) {
        this.aNW();
        this.aGP = (ScheduledReporter)this.aGO.get();
        this.aGP.start((long)n, timeUnit);
    }

    public void aNW() {
        if (this.aGP != null) {
            this.aGP.stop();
        }
    }

    public String toString() {
        return "MetricsManager{m_registry=" + this.aGN.getNames().size() + "}";
    }
}

