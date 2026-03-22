/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cEn
 */
@fyf_0
public class cen_2 {
    public static final String PACKAGE = "wakfu.dimensionalBagFlea";
    private static final Logger mUw = Logger.getLogger(cen_2.class);
    private static boolean mUx = false;
    private static aao_2 mUy;

    public static void closeDimensionalBagFleaDialog(fiq_1 fiq_12) {
        mUw.error((Object)"DimensionalBagFleaDialog.closeDimensionalBagFleaDialog()");
        if (fyw_0.gqw().to("dimensionalBagFleaDialog")) {
            cen_2.eKe();
        }
    }

    private static void eKe() {
        fse_1.gFu().f("showRoomBagDetails", false);
        aue_0.cVJ().b(cwe_1.eVh());
    }

    public static void itemDropOut(flc_2 flc_22) {
        if (flc_22.getValue() instanceof bea_0) {
            bea_0 bea_02 = (bea_0)flc_22.getValue();
            if (!flc_22.gDT() || bea_02.bfd() <= 1) {
                dad_0 dad_02 = new dad_0();
                dad_02.setMerchantItem(bea_02);
                dad_02.lK(16690);
                aaw_1.bUq().h(dad_02);
            }
        }
    }

    public static void removeMarketItem(fiq_1 fiq_12, bea_0 bea_02) {
        dad_0 dad_02 = new dad_0();
        dad_02.setMerchantItem(bea_02);
        dad_02.lK(16690);
        aaw_1.bUq().h(dad_02);
    }

    public static void onMouseEnterIntersection(fiq_1 fiq_12, fkk_1 fkk_12) {
        if (fbj_1.getInstance().isDragging()) {
            fkk_12.setColor(awx_2.dnG);
            mUx = true;
        }
    }

    public static void onMouseExitIntersection(fiq_1 fiq_12, fkk_1 fkk_12) {
        fkk_12.setColor(awx_2.dnC);
        mUx = false;
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

