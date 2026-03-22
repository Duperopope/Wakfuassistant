/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

/*
 * Renamed from fAo
 */
class fao_2
implements fis_1 {
    final /* synthetic */ faj_1 tOg;

    fao_2(faj_1 faj_12) {
        this.tOg = faj_12;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        flp_2 flp_22 = (flp_2)fiq_12;
        Point point = this.tOg.getOrientedMouseCoodinates(flp_22);
        azx_1<fgb_2, fgz_1> azx_12 = this.tOg.getTextBuilder().gY(point.x, -point.y);
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
                    n = fgb_22.a(this.tOg.getTextBuilder().gyc(), point.x - fgb_22.getX() - fgb_22.gxM().getX());
                    break;
                }
                case uub: 
                case uuc: {
                    n = fgb_22.aPs();
                }
            }
            if (flp_22.gEn() % 2 != 0) {
                this.tOg.b(fgb_22, n);
            }
        }
        return false;
    }
}

