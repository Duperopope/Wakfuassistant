/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEI
 */
@fyf_0
public class cei_1 {
    public static final String PACKAGE = "wakfu.flea";
    public static final String mVe = "fleaControlGroup";

    public static void selectItem(flg_2 flg_22, fey_2 fey_22) {
        if (flg_22.getItemValue() != null && flg_22.getItemValue() instanceof bea_0 && flg_22.gEm()) {
            cdd_2.openItemDetailWindow(flg_22, fey_22);
        }
    }

    public static void showItemDetailPopup(flg_2 flg_22, fey_2 fey_22) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof bea_0)) {
            return;
        }
        if (flg_22.gBy() == fzq_0.tJE) {
            frx_1 frx_12 = (frx_1)fey_22.getElementMap().uH("itemDetailPopup");
            fse_1.gFu().f("itemPopupDetail", flg_22.getItemValue());
            fyd_0.popup(flg_22, frx_12);
        } else if (flg_22.gBy() == fzq_0.tJD) {
            fyd_0.closePopup(flg_22);
        }
    }

    public static void openStuffPreviewWindow(fiq_1 fiq_12, bea_0 bea_02) {
        ctd_2.eQA().bB(bea_02.getItem());
    }
}

