/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGS
 */
@fyf_0
public class cgs_1 {
    public static final String PACKAGE = "wakfu.ranchBuildingList";

    public static void searchBuilding(fiq_1 fiq_12, fdv_1 fdv_12) {
        dae_0 dae_02 = new dae_0(19904);
        dae_02.fa(fdv_12.getText());
        aaw_1.bUq().h(dae_02);
    }

    public static void clickCategory(flp_2 flp_22, bkf_0 bkf_02) {
        bkf_02.dLG();
    }

    public static void onBuildingClick(flg_2 flg_22) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof bkh_0)) {
            return;
        }
        bkh_0 bkh_02 = (bkh_0)object;
        dae_0.b((short)16420, bkh_02);
    }

    public static void onBuildingHover(flg_2 flg_22, frx_1 frx_12) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof bkh_0)) {
            return;
        }
        bkh_0 bkh_02 = (bkh_0)object;
        fse_1.gFu().a("hoveredRanchBuilding", (Object)bkh_02, ((fhv_1)flg_22.gBE()).getElementMap());
        fyd_0.popup((fiq_1)flg_22, frx_12, (fes_2)flg_22.gBD());
    }

    public static void onBuildingOut(fiq_1 fiq_12) {
        fyd_0.closePopup(fiq_12);
        fse_1.gFu().a("hoveredRanchBuilding", null, ((fhv_1)fiq_12.gBE()).getElementMap());
    }

    public static void toggleRemoveBuildingMode(fiq_1 fiq_12) {
        dae_0.cV((short)16703);
    }

    public static void toggleMoveBuildingMode(fiq_1 fiq_12) {
        dae_0.cV((short)18586);
    }
}

