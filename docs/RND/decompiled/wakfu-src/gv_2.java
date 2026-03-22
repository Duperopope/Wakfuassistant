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
 * Renamed from GV
 */
class gv_2
extends Histogram
implements hv_2 {
    final long aHT;

    gv_2(long l) {
        super((Reservoir)new HdrHistogramResetOnSnapshotReservoir());
        this.aHT = l;
    }

    @Override
    public gr_2 a(gh_2 gh_22) {
        return new gw_2(this);
    }

    @Override
    public hu_2 aOH() {
        return hu_2.aIX;
    }
}

