/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Metric
 *  com.codahale.metrics.MetricSet
 */
import com.codahale.metrics.Metric;
import com.codahale.metrics.MetricSet;
import java.lang.invoke.CallSite;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/*
 * Renamed from Hd
 */
public class hd_2
implements MetricSet {
    private static final Pattern aIh = Pattern.compile("[\\s]+");
    private final List<GarbageCollectorMXBean> aIi = ManagementFactory.getGarbageCollectorMXBeans();

    public Map<String, Metric> getMetrics() {
        HashMap hashMap = new HashMap();
        for (GarbageCollectorMXBean garbageCollectorMXBean : this.aIi) {
            String string = aIh.matcher(garbageCollectorMXBean.getName()).replaceAll("-");
            hashMap.put((CallSite)((Object)(string + ".count")), new he_2("jvm.gc." + string + ".count", garbageCollectorMXBean::getCollectionCount));
            hashMap.put((CallSite)((Object)(string + ".time")), new he_2("jvm.gc." + string + ".time", garbageCollectorMXBean::getCollectionTime));
        }
        return Collections.unmodifiableMap(hashMap);
    }
}

