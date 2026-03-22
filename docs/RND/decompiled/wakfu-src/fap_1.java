/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

/*
 * Renamed from fAp
 */
class fap_1
implements fis_1 {
    final /* synthetic */ faj_1 tOh;

    fap_1(faj_1 faj_12) {
        this.tOh = faj_12;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (fiq_12.gBE() != this.tOh) {
            return false;
        }
        Point point = this.tOh.getOrientedMouseCoodinates((flp_2)fiq_12);
        azx_1<fgb_2, fgz_1> azx_12 = this.tOh.getTextBuilder().gY(point.x, -point.y);
        fgb_2 fgb_22 = azx_12.getFirst();
        fgz_1 fgz_12 = azx_12.aHI();
        if (fgb_22 != null) {
            int n = 0;
            switch (fgz_12) {
                case utY: 
                case utZ: {
                    n = 0;
                    break;
                }
                case uua: {
                    n = fgb_22.a(this.tOh.getTextBuilder().gyc(), point.x - fgb_22.getX() - fgb_22.gxM().getX());
                    break;
                }
                case uub: 
                case uuc: {
                    n = fgb_22.aPs();
                }
            }
            this.tOh.c(fgb_22, n);
        }
        return true;
    }
}

