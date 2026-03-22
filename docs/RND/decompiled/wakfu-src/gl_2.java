/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Snapshot
 */
import com.codahale.metrics.Snapshot;

/*
 * Renamed from GL
 */
class gl_2 {
    private final long aGU;
    private final Snapshot aGV;

    gl_2(long l, Snapshot snapshot) {
        this.aGU = l;
        this.aGV = snapshot;
    }

    public long aNZ() {
        return this.aGU;
    }

    public long aOa() {
        return this.aGV.getMin();
    }

    public long aOb() {
        return this.aGV.getMax();
    }

    public double aOc() {
        return this.aGV.getMean();
    }

    public double aOd() {
        return this.aGV.getMedian();
    }

    public double aOe() {
        return this.aGV.getStdDev();
    }

    public double aOf() {
        return this.aGV.get75thPercentile();
    }

    public double aOg() {
        return this.aGV.get95thPercentile();
    }

    public double aOh() {
        return this.aGV.get98thPercentile();
    }

    public double aOi() {
        return this.aGV.get99thPercentile();
    }

    public double aOj() {
        return this.aGV.get999thPercentile();
    }

    public String toString() {
        return "HistogramReport{m_count=" + this.aGU + ", m_snapshot=" + this.aGV.size() + "}";
    }
}

