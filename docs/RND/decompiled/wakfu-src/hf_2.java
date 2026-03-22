/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Metric
 *  com.codahale.metrics.MetricRegistry
 *  com.codahale.metrics.MetricSet
 */
import com.codahale.metrics.Metric;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.MetricSet;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryPoolMXBean;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/*
 * Renamed from Hf
 */
public class hf_2
implements MetricSet {
    private static final Pattern aIl = Pattern.compile("[\\s]+");
    final MemoryMXBean aIm = ManagementFactory.getMemoryMXBean();
    private final List<MemoryPoolMXBean> aIn = ManagementFactory.getMemoryPoolMXBeans();

    public Map<String, Metric> getMetrics() {
        HashMap hashMap = new HashMap();
        hashMap.put("total.init", new hj_2("jvm.memory.total.init", () -> this.aIm.getHeapMemoryUsage().getInit() + this.aIm.getNonHeapMemoryUsage().getInit()));
        hashMap.put("total.used", new hj_2("jvm.memory.total.used", () -> this.aIm.getHeapMemoryUsage().getUsed() + this.aIm.getNonHeapMemoryUsage().getUsed()));
        hashMap.put("total.max", new hj_2("jvm.memory.total.max", () -> this.aIm.getHeapMemoryUsage().getMax() + this.aIm.getNonHeapMemoryUsage().getMax()));
        hashMap.put("total.committed", new hj_2("jvm.memory.total.committed", () -> this.aIm.getHeapMemoryUsage().getCommitted() + this.aIm.getNonHeapMemoryUsage().getCommitted()));
        hashMap.put("heap.init", new hj_2("jvm.memory.heap.init", () -> this.aIm.getHeapMemoryUsage().getInit()));
        hashMap.put("heap.used", new hj_2("jvm.memory.heap.used", () -> this.aIm.getHeapMemoryUsage().getUsed()));
        hashMap.put("heap.max", new hj_2("jvm.memory.heap.max", () -> this.aIm.getHeapMemoryUsage().getMax()));
        hashMap.put("heap.committed", new hj_2("jvm.memory.heap.committed", () -> this.aIm.getHeapMemoryUsage().getCommitted()));
        hashMap.put("heap.usage", new hj_2("jvm.memory.heap.usage", new hg_2(this)));
        hashMap.put("non-heap.init", new hj_2("jvm.memory.non-heap.init", () -> this.aIm.getNonHeapMemoryUsage().getInit()));
        hashMap.put("non-heap.used", new hj_2("jvm.memory.non-heap.used", () -> this.aIm.getNonHeapMemoryUsage().getUsed()));
        hashMap.put("non-heap.max", new hj_2("jvm.memory.non-heap.max", () -> this.aIm.getNonHeapMemoryUsage().getMax()));
        hashMap.put("non-heap.committed", new hj_2("jvm.memory.non-heap.committed", () -> this.aIm.getNonHeapMemoryUsage().getCommitted()));
        hashMap.put("non-heap.usage", new hj_2("jvm.memory.non-heap.usage", new hh_2(this)));
        for (MemoryPoolMXBean memoryPoolMXBean : this.aIn) {
            String string = MetricRegistry.name((String)"pools", (String[])new String[]{aIl.matcher(memoryPoolMXBean.getName()).replaceAll("-")});
            hashMap.put(string + ".usage", new hj_2("jvm.memory." + string + ".usage", new hi_2(this, memoryPoolMXBean)));
            hashMap.put(string + ".max", new hj_2("jvm.memory." + string + ".max", () -> memoryPoolMXBean.getUsage().getMax()));
            hashMap.put(string + ".used", new hj_2("jvm.memory." + string + ".used", () -> memoryPoolMXBean.getUsage().getUsed()));
            hashMap.put(string + ".committed", new hj_2("jvm.memory." + string + ".committed", () -> memoryPoolMXBean.getUsage().getCommitted()));
            if (memoryPoolMXBean.getCollectionUsage() != null) {
                hashMap.put(string + ".used-after-gc", new hj_2("jvm.memory." + string + ".used-after-gc", () -> memoryPoolMXBean.getCollectionUsage().getUsed()));
            }
            hashMap.put(string + ".init", new hj_2("jvm.memory." + string + ".init", () -> memoryPoolMXBean.getUsage().getInit()));
        }
        return Collections.unmodifiableMap(hashMap);
    }
}

