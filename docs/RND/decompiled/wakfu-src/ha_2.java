/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Gauge
 */
import com.codahale.metrics.Gauge;

/*
 * Renamed from Ha
 */
class ha_2<T>
implements hv_2,
Gauge<T> {
    private final String aIc;
    private final Gauge<T> aId;

    ha_2(String string, Gauge<T> gauge) {
        this.aIc = string;
        this.aId = gauge;
    }

    public T getValue() {
        return (T)this.aId.getValue();
    }

    @Override
    public gr_2 a(gh_2 gh_22) {
        return new gp_2(this.aIc, this);
    }

    @Override
    public hu_2 aOH() {
        return hu_2.aJh;
    }
}

