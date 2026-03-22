/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.RatioGauge
 *  com.codahale.metrics.RatioGauge$Ratio
 */
import com.codahale.metrics.RatioGauge;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryUsage;

/*
 * Renamed from Hi
 */
class hi_2
extends RatioGauge {
    final /* synthetic */ MemoryPoolMXBean aIq;

    hi_2(hf_2 hf_22, MemoryPoolMXBean memoryPoolMXBean) {
        this.aIq = memoryPoolMXBean;
    }

    protected RatioGauge.Ratio getRatio() {
        MemoryUsage memoryUsage = this.aIq.getUsage();
        return RatioGauge.Ratio.of((double)memoryUsage.getUsed(), (double)(memoryUsage.getMax() == -1L ? (double)memoryUsage.getCommitted() : (double)memoryUsage.getMax()));
    }
}

