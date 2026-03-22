/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Gauge
 */
import com.codahale.metrics.Gauge;

/*
 * Renamed from Hl
 */
class hl_2<T>
implements hv_2,
Gauge<T> {
    private final String aIw;
    private final Gauge<T> aIx;

    hl_2(String string, Gauge<T> gauge) {
        this.aIw = string;
        this.aIx = gauge;
    }

    public T getValue() {
        return (T)this.aIx.getValue();
    }

    @Override
    public gr_2 a(gh_2 gh_22) {
        return new gp_2(this.aIw, this);
    }

    @Override
    public hu_2 aOH() {
        return hu_2.aJe;
    }
}

