/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Histogram
 *  com.codahale.metrics.Reservoir
 *  org.mpierce.metrics.reservoir.hdrhistogram.HdrHistogramResetOnSnapshotReservoir
 */
import com.codahale.metrics.Histogram;
import com.codahale.metrics.Reservoir;
import org.mpierce.metrics.reservoir.hdrhistogram.HdrHistogramResetOnSnapshotReservoir;

/*
 * Renamed from Hs
 */
class hs_2
extends Histogram
implements hv_2 {
    final int aIU;

    hs_2(int n) {
        super((Reservoir)new HdrHistogramResetOnSnapshotReservoir());
        this.aIU = n;
    }

    @Override
    public gr_2 a(gh_2 gh_22) {
        return new ht_2(this);
    }

    @Override
    public hu_2 aOH() {
        return hu_2.aJa;
    }
}

