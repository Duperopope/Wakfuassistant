/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Gauge
 */
import com.codahale.metrics.Gauge;

/*
 * Renamed from He
 */
class he_2<T>
implements hv_2,
Gauge<T> {
    private final String aIj;
    private final Gauge<T> aIk;

    he_2(String string, Gauge<T> gauge) {
        this.aIj = string;
        this.aIk = gauge;
    }

    public T getValue() {
        return (T)this.aIk.getValue();
    }

    @Override
    public gr_2 a(gh_2 gh_22) {
        return new gp_2(this.aIj, this);
    }

    @Override
    public hu_2 aOH() {
        return hu_2.aJf;
    }
}

