/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

/*
 * Renamed from fBO
 */
class fbo_1
implements fis_1 {
    final /* synthetic */ fbn_2 tWy;

    fbo_1(fbn_2 fbn_22) {
        this.tWy = fbn_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        flp_2 flp_22 = (flp_2)fiq_12;
        this.tWy.tVX = new Point(flp_22.x(this.tWy), flp_22.y(this.tWy));
        this.tWy.x(fbt_2.class);
        this.tWy.tVW = false;
        return false;
    }
}

