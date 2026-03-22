/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Gauge
 */
import com.codahale.metrics.Gauge;

/*
 * Renamed from Hj
 */
class hj_2<T>
implements hv_2,
Gauge<T> {
    private final String aIr;
    private final Gauge<T> aIs;

    hj_2(String string, Gauge<T> gauge) {
        this.aIr = string;
        this.aIs = gauge;
    }

    public T getValue() {
        return (T)this.aIs.getValue();
    }

    @Override
    public gr_2 a(gh_2 gh_22) {
        return new gp_2(this.aIr, this);
    }

    @Override
    public hu_2 aOH() {
        return hu_2.aJg;
    }
}

