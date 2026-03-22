/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Counter
 *  com.codahale.metrics.Gauge
 *  com.codahale.metrics.Histogram
 *  com.codahale.metrics.Meter
 *  com.codahale.metrics.MetricFilter
 *  com.codahale.metrics.MetricRegistry
 *  com.codahale.metrics.ScheduledReporter
 *  com.codahale.metrics.Timer
 *  org.yaml.snakeyaml.DumperOptions
 *  org.yaml.snakeyaml.DumperOptions$FlowStyle
 *  org.yaml.snakeyaml.Yaml
 */
import com.codahale.metrics.Counter;
import com.codahale.metrics.Gauge;
import com.codahale.metrics.Histogram;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricFilter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.ScheduledReporter;
import com.codahale.metrics.Timer;
import java.io.PrintStream;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.TimeUnit;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

/*
 * Renamed from GI
 */
public class gi_2
extends ScheduledReporter {
    private final PrintStream aGR;

    public gi_2(MetricRegistry metricRegistry, PrintStream printStream, MetricFilter metricFilter, TimeUnit timeUnit, TimeUnit timeUnit2) {
        super(metricRegistry, "yaml-reporter", metricFilter, timeUnit, timeUnit2);
        this.aGR = printStream;
    }

    public void report(SortedMap<String, Gauge> sortedMap, SortedMap<String, Counter> sortedMap2, SortedMap<String, Histogram> sortedMap3, SortedMap<String, Meter> sortedMap4, SortedMap<String, Timer> sortedMap5) {
        Gauge gauge;
        String string;
        gn_2 gn_22 = new gn_2();
        if (!sortedMap.isEmpty()) {
            for (Map.Entry<String, Gauge> entry2 : sortedMap.entrySet()) {
                string = entry2.getKey();
                gauge = entry2.getValue();
                gn_22.a(string, new gk_2(gauge.getValue()));
            }
        }
        if (!sortedMap2.isEmpty()) {
            for (Map.Entry<String, Gauge> entry : sortedMap2.entrySet()) {
                string = entry.getKey();
                gauge = (Counter)entry.getValue();
                gn_22.a(string, new gj_2(gauge.getCount()));
            }
        }
        if (!sortedMap3.isEmpty()) {
            for (Map.Entry<String, Gauge> entry : sortedMap3.entrySet()) {
                string = entry.getKey();
                gauge = (Histogram)entry.getValue();
                gn_22.a(string, new gl_2(gauge.getCount(), gauge.getSnapshot()));
            }
        }
        if (!sortedMap4.isEmpty()) {
            for (Map.Entry entry : sortedMap4.entrySet()) {
                string = (String)entry.getKey();
                gauge = (Meter)entry.getValue();
                gn_22.a(string, new gm_2((Meter)gauge));
            }
        }
        if (!sortedMap5.isEmpty()) {
            for (Map.Entry entry : sortedMap5.entrySet()) {
                string = (String)entry.getKey();
                gauge = (Timer)entry.getValue();
                gn_22.a(string, new go_2(this, (Timer)gauge));
            }
        }
        DumperOptions dumperOptions = new DumperOptions();
        dumperOptions.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        dumperOptions.setAllowReadOnlyProperties(true);
        Yaml yaml = new Yaml(dumperOptions);
        this.aGR.println(yaml.dumpAsMap((Object)gn_22));
    }

    static /* synthetic */ double a(gi_2 gi_22, double d2) {
        return gi_22.convertRate(d2);
    }

    static /* synthetic */ String a(gi_2 gi_22) {
        return gi_22.getRateUnit();
    }

    static /* synthetic */ double b(gi_2 gi_22, double d2) {
        return gi_22.convertRate(d2);
    }

    static /* synthetic */ String b(gi_2 gi_22) {
        return gi_22.getRateUnit();
    }

    static /* synthetic */ double c(gi_2 gi_22, double d2) {
        return gi_22.convertRate(d2);
    }

    static /* synthetic */ String c(gi_2 gi_22) {
        return gi_22.getRateUnit();
    }

    static /* synthetic */ double d(gi_2 gi_22, double d2) {
        return gi_22.convertRate(d2);
    }

    static /* synthetic */ String d(gi_2 gi_22) {
        return gi_22.getRateUnit();
    }

    static /* synthetic */ double e(gi_2 gi_22, double d2) {
        return gi_22.convertDuration(d2);
    }

    static /* synthetic */ String e(gi_2 gi_22) {
        return gi_22.getDurationUnit();
    }

    static /* synthetic */ double f(gi_2 gi_22, double d2) {
        return gi_22.convertDuration(d2);
    }

    static /* synthetic */ String f(gi_2 gi_22) {
        return gi_22.getDurationUnit();
    }

    static /* synthetic */ double g(gi_2 gi_22, double d2) {
        return gi_22.convertDuration(d2);
    }

    static /* synthetic */ String g(gi_2 gi_22) {
        return gi_22.getDurationUnit();
    }

    static /* synthetic */ double h(gi_2 gi_22, double d2) {
        return gi_22.convertDuration(d2);
    }

    static /* synthetic */ String h(gi_2 gi_22) {
        return gi_22.getDurationUnit();
    }

    static /* synthetic */ double i(gi_2 gi_22, double d2) {
        return gi_22.convertDuration(d2);
    }

    static /* synthetic */ String i(gi_2 gi_22) {
        return gi_22.getDurationUnit();
    }

    static /* synthetic */ double j(gi_2 gi_22, double d2) {
        return gi_22.convertDuration(d2);
    }

    static /* synthetic */ String j(gi_2 gi_22) {
        return gi_22.getDurationUnit();
    }

    static /* synthetic */ double k(gi_2 gi_22, double d2) {
        return gi_22.convertDuration(d2);
    }

    static /* synthetic */ String k(gi_2 gi_22) {
        return gi_22.getDurationUnit();
    }

    static /* synthetic */ double l(gi_2 gi_22, double d2) {
        return gi_22.convertDuration(d2);
    }

    static /* synthetic */ String l(gi_2 gi_22) {
        return gi_22.getDurationUnit();
    }

    static /* synthetic */ double m(gi_2 gi_22, double d2) {
        return gi_22.convertDuration(d2);
    }

    static /* synthetic */ String m(gi_2 gi_22) {
        return gi_22.getDurationUnit();
    }

    static /* synthetic */ double n(gi_2 gi_22, double d2) {
        return gi_22.convertDuration(d2);
    }

    static /* synthetic */ String n(gi_2 gi_22) {
        return gi_22.getDurationUnit();
    }
}

