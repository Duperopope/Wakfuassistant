/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Timer
 */
import com.codahale.metrics.Timer;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from GT
 */
class gt_2
extends Timer
implements hv_2 {
    final int aHP;
    long aHQ;

    gt_2(int n) {
        this.aHP = n;
    }

    @Override
    public gr_2 a(gh_2 gh_22) {
        return new gu_2(gh_22, this);
    }

    public void update(long l, TimeUnit timeUnit) {
        super.update(l, timeUnit);
        this.aHQ += timeUnit.toMillis(l);
    }

    @Override
    public hu_2 aOH() {
        return hu_2.aIW;
    }
}

