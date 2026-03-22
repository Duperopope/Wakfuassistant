/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Timer
 */
import com.codahale.metrics.Timer;

/*
 * Renamed from GX
 */
class gx_2
extends Timer
implements hv_2 {
    final long aHV;

    gx_2(long l) {
        this.aHV = l;
    }

    @Override
    public gr_2 a(gh_2 gh_22) {
        return new gy_2(gh_22, this);
    }

    @Override
    public hu_2 aOH() {
        return hu_2.aIY;
    }
}

