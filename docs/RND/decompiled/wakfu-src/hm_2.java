/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Timer
 */
import com.codahale.metrics.Timer;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from Hm
 */
class hm_2
extends Timer
implements hv_2 {
    final int aIy;
    long aHQ;

    hm_2(int n) {
        this.aIy = n;
    }

    @Override
    public gr_2 a(gh_2 gh_22) {
        return new hn_2(gh_22, this);
    }

    public void update(long l, TimeUnit timeUnit) {
        super.update(l, timeUnit);
        this.aHQ += timeUnit.toMillis(l);
    }

    @Override
    public hu_2 aOH() {
        return hu_2.aJi;
    }
}

