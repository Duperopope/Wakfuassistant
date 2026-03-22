/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from cEO
 */
@fyf_0
public class ceo_2 {
    public static final String PACKAGE = "wakfu.furniture.management";

    public static void startFurnitureDeploy(fiq_1 fiq_12, buw_0 buw_02) {
        if (!buw_02.dJa().booleanValue()) {
            return;
        }
        bgv_2 bgv_22 = buw_02.duo();
        int n = bgv_22.d();
        if (!fdb.fSX().Uf(n)) {
            return;
        }
        if (!ceo_2.LV(n)) {
            return;
        }
        long l2 = fdb.fSX().Ue(n);
        bDr.a(l2, (l, bDv2) -> {
            cnm cnm2 = new cnm(n, (long)l, bDv2.getX(), bDv2.getY(), bDv2.bdi(), bDv2.bcB().wp());
            aue_0.cVJ().etu().d(cnm2);
        });
    }

    public static void clickCategory(flp_2 flp_22, bur_0 bur_02) {
        bur_02.dLG();
    }

    public static void selectMode(flp_2 flp_22, String string) {
        but_0 but_02 = but_0.mr(string);
        if (but_02 == null) {
            return;
        }
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19574);
        dae_02.D((Object)but_02);
        aaw_1.bUq().h(dae_02);
    }

    private static boolean LV(int n) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return true;
        }
        long l = bgt_02.Xi();
        Optional optional = evx_2.feo().b(l, eva_1.owB);
        if (optional.isEmpty()) {
            return true;
        }
        fnu fnu2 = (fnu)optional.get();
        return fnu2.Xn(n);
    }
}

