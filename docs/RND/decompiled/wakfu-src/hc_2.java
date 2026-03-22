/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Gauge
 */
import com.codahale.metrics.Gauge;

/*
 * Renamed from Hc
 */
class hc_2<T>
implements hv_2,
Gauge<T> {
    private final String aIf;
    private final Gauge<T> aIg;

    hc_2(String string, Gauge<T> gauge) {
        this.aIf = string;
        this.aIg = gauge;
    }

    public T getValue() {
        return (T)this.aIg.getValue();
    }

    @Override
    public gr_2 a(gh_2 gh_22) {
        return new gp_2(this.aIf, this);
    }

    @Override
    public hu_2 aOH() {
        return hu_2.aJd;
    }
}

