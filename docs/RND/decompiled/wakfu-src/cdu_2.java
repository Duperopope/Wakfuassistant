/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDu
 */
@fyf_0
public class cdu_2 {
    public static final String PACKAGE = "wakfu.blindBox";

    public static void showItemDetails(flg_2 flg_22, faw_2 faw_22) {
        ffT ffT2 = (ffT)flg_22.getItemValue();
        frx_1 frx_12 = (frx_1)faw_22.getElementMap().uH("itemDetailPopup");
        if (flg_22.gBy() == fzq_0.tJE && !fbj_1.getInstance().isDragging()) {
            fse_1.gFu().f("itemPopupDetail", ffT2);
            fse_1.gFu().f("isFromShortcut", false);
            fyd_0.popup(frx_12, (fes_2)flg_22.gBE());
        } else if (flg_22.gBy() == fzq_0.tJD) {
            fse_1.gFu().f("itemPopupDetail", (Object)null);
            fse_1.gFu().f("isFromShortcut", false);
            fse_1.gFu().f("isFromEquipedShortcut", false);
            fyd_0.closePopup(flg_22, frx_12);
        }
    }

    public static void launch(flp_2 flp_22) {
        csw_2.eOf().eOk();
    }
}

