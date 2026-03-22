/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

/*
 * Renamed from fAn
 */
class fan_1
implements fis_1 {
    final /* synthetic */ faj_1 tOf;

    fan_1(faj_1 faj_12) {
        this.tOf = faj_12;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        Point point = this.tOf.getOrientedMouseCoodinates((flp_2)fiq_12);
        azx_1<fgb_2, fgz_1> azx_12 = this.tOf.getTextBuilder().gY(point.x, -point.y);
        fgb_2 fgb_22 = azx_12.getFirst();
        if (fgb_22 != null) {
            int n = 0;
            switch (azx_12.aHI()) {
                case utY: 
                case utZ: {
                    n = 0;
                    break;
                }
                case uua: {
                    n = fgb_22.a(this.tOf.getTextBuilder().gyc(), point.x - fgb_22.getX() - fgb_22.gxM().getX());
                    break;
                }
                case uub: 
                case uuc: {
                    n = fgb_22.aPs();
                }
            }
            this.tOf.a(fgb_22, n);
        }
        return false;
    }
}

