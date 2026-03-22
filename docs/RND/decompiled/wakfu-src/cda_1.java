/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDA
 */
@fyf_0
public class cda_1
extends cdu_1 {
    public static final String PACKAGE = "wakfu.characterSheet";

    public static void switchToCharacteristicsMode(fiq_1 fiq_12) {
        boolean bl = fse_1.gFu().dp("characterSheetSecondMode");
        fse_1.gFu().f("characterSheetSecondMode", !bl);
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.ljk, !bl);
    }

    public static void openCloseAptitudes(fiq_1 fiq_12) {
        bgl_0 bgl_02 = (bgl_0)fse_1.gFu().aW("characterSheet", "characterSheetDialog");
        if (bgl_02 != null && bgl_02.Sn() != aue_0.cVJ().cVK().Sn()) {
            fyw_0.gqw().a(new cdb_1(bgl_02));
        }
        czt_2.NF(2);
    }

    public static void highlightCharacteristic(flv_2 flv_22, bih_0 bih_02) {
        bgl_0 bgl_02 = (bgl_0)fse_1.gFu().i("characterSheet", ((fhv_1)flv_22.gBE()).getElementMap());
        bim_0 bim_02 = bgl_02.dcP().dlE();
        bim_02.a(bih_02.dqy(), flv_22.bqr());
    }

    public static void displayAllCharacteristics(flv_2 flv_22) {
        csx_1.ke(flv_22.bqr());
    }

    public static void dropView(flc_2 flc_22) {
        bli_1 bli_12 = (bli_1)flc_22.gDy();
        if (bli_12.dtZ()) {
            return;
        }
        int n = flc_22.getScreenX();
        int n2 = flc_22.getScreenY();
        csx_1.ePi().a(cts_1.MC(bli_12.xT()), "characterSheetWindow", n, n2);
    }
}

