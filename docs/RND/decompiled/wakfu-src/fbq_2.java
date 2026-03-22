/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

/*
 * Renamed from fBQ
 */
class fbq_2
implements fis_1 {
    final /* synthetic */ fbn_2 tWA;

    fbq_2(fbn_2 fbn_22) {
        this.tWA = fbn_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        flp_2 flp_22 = (flp_2)fiq_12;
        if (!this.tWA.tWi) {
            return false;
        }
        this.tWA.tVW = true;
        int n = flp_22.x(this.tWA) - this.tWA.tVX.x;
        int n2 = flp_22.y(this.tWA) - this.tWA.tVX.y;
        int n3 = this.tWA.dhZ + n;
        int n4 = this.tWA.dia + n2;
        this.tWA.tWc = n;
        this.tWA.tWd = n2;
        this.tWA.setDeltaX(n3);
        this.tWA.setDeltaY(n4);
        this.tWA.tVX = new Point(flp_22.x(this.tWA), flp_22.y(this.tWA));
        return false;
    }
}

