/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from czO
 */
public final class czo_0
implements aaq_2<ctv> {
    private static final Logger mnp = Logger.getLogger(czo_0.class);

    @Override
    public boolean a(ctv ctv2) {
        long l = ctv2.KU();
        long l2 = ctv2.Qy();
        bjx_1 bjx_12 = bjy_1.drw().Dl(ctv2.eCh());
        if (bjx_12 != null) {
            bhx_0 bhx_02 = (bhx_0)bgg_0.dlO().ju(l);
            bgy bgy2 = bgg_0.dlO().ju(l2);
            aWc aWc2 = bgy2 != null ? new aWc(agb_1.cbm(), 0, 0, bjx_12.cbt(), bhx_02, bgy2) : new aWc(agb_1.cbm(), 0, 0, bjx_12.cbt(), bhx_02, l2);
            if (bhx_02 != null) {
                if (bhx_02.doI() != null) {
                    bhx_02.doI().cXd();
                }
                bhx_02.a(aWc2);
                bdj_2 bdj_22 = bhx_02.ddI();
                if (bdj_22.bvF() != null && bjx_12.drv()) {
                    bdj_22.b(new czp_0(this, aWc2));
                } else {
                    awb_0.htX.h(aWc2);
                    awb_0.htX.cbb();
                }
            }
        } else {
            mnp.error((Object)("R\u00e9ception d'un MonsterBehaviour inconnu id=" + ctv2.eCh()));
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13341;
    }
}

