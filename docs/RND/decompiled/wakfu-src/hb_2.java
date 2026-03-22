/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Metric
 *  com.codahale.metrics.MetricSet
 */
import com.codahale.metrics.Metric;
import com.codahale.metrics.MetricSet;
import java.lang.management.ClassLoadingMXBean;
import java.lang.management.ManagementFactory;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from Hb
 */
public class hb_2
implements MetricSet {
    private final ClassLoadingMXBean aIe = ManagementFactory.getClassLoadingMXBean();

    public Map<String, Metric> getMetrics() {
        HashMap hashMap = new HashMap();
        hashMap.put("loaded", new hc_2("jvm.class.loaded", this.aIe::getTotalLoadedClassCount));
        hashMap.put("unloaded", new hc_2("jvm.class.unloaded", this.aIe::getUnloadedClassCount));
        return Collections.unmodifiableMap(hashMap);
    }
}

