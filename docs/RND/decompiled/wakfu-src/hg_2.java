/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.RatioGauge
 *  com.codahale.metrics.RatioGauge$Ratio
 */
import com.codahale.metrics.RatioGauge;
import java.lang.management.MemoryUsage;

/*
 * Renamed from Hg
 */
class hg_2
extends RatioGauge {
    final /* synthetic */ hf_2 aIo;

    hg_2(hf_2 hf_22) {
        this.aIo = hf_22;
    }

    protected RatioGauge.Ratio getRatio() {
        MemoryUsage memoryUsage = this.aIo.aIm.getHeapMemoryUsage();
        return RatioGauge.Ratio.of((double)memoryUsage.getUsed(), (double)memoryUsage.getMax());
    }
}

