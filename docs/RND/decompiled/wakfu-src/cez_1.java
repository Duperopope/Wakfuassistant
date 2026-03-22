/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cEZ
 */
@fyf_0
public class cez_1 {
    protected static final Logger mVq = Logger.getLogger(cez_1.class);
    public static final String PACKAGE = "wakfu.havenWorldResourcesCollector";
    private static long mSK = -1L;

    public static void closeWindow(fiq_1 fiq_12) {
        if (!cvr_1.eTM().eTN().aJG()) {
            fiq_2.gCw().d(fik_2.a(string -> cez_1.eKo()).l("question.havenWorldResourcesCollectorClose", new Object[0]).vG(ccp_2.mRM.byf()));
        } else {
            cez_1.eKo();
        }
    }

    private static void eKo() {
        fyw_0.gqw().tl("havenWorldResourcesCollectorDialog");
    }

    public static void validCollect(fiq_1 fiq_12) {
        dae_0.cV((short)16817);
    }

    public static void removeItem(fiq_1 fiq_12) {
        if (fiq_12 instanceof flc_2 && ((flc_2)fiq_12).getValue() instanceof ffT) {
            cez_1.removeItem((ffT)((flc_2)fiq_12).getValue());
        }
    }

    public static void onItemDoubleClick(flg_2 flg_22) {
        if (!(flg_22.getItemValue() instanceof ffT)) {
            return;
        }
        cez_1.removeItem((ffT)flg_22.getItemValue());
    }

    public static void removeItem(ffT ffT2) {
        dbI dbI2 = new dbI(ffT2);
        dbI2.lK(16381);
        aaw_1.bUq().h(dbI2);
    }

    public static void dropItem(fla_2 fla_22) {
        boolean bl;
        if (!(fla_22.getValue() instanceof ffV)) {
            return;
        }
        ffV ffV2 = (ffV)fla_22.getValue();
        boolean bl2 = bl = aue_0.cVJ().cVK().dno().x(ffV2) != null;
        if (!bl) {
            return;
        }
        cfe_1.onDropItem();
        boolean bl3 = fla_22.gDT();
        boolean bl4 = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljt);
        int n = 16215;
        if (ffV2.bfd() > 1 && bl3 ^ bl4) {
            che_1.setMaxQuantity(ffV2.bfd());
            che_1.setItem(ffV2);
            che_1.setMessageType((short)16215);
            dbl_0 dbl_02 = new dbl_0();
            dbl_02.setItem(ffV2);
            dbl_02.cY((short)fla_22.getScreenX());
            dbl_02.cZ((short)fla_22.getScreenY());
            dbl_02.lK(16021);
            aaw_1.bUq().h(dbl_02);
        } else {
            dbl_0 dbl_03 = new dbl_0();
            dbl_03.gj(ffV2.LV());
            dbl_03.ak(ffV2.bfd());
            dbl_03.lK(16215);
            aaw_1.bUq().h(dbl_03);
        }
    }

    public static void changeItemBackground(flp_2 flp_22, ffV ffV2) {
        cez_1.changeItemBackground(flp_22, ffV2, null);
    }

    public static void changeItemBackground(flp_2 flp_22) {
        String string = "";
        fes_2 fes_22 = (fes_2)flp_22.gBE();
        if (flp_22.gBy() == fzq_0.tJQ) {
            string = "itemSelectedBackground";
        } else if (flp_22.gBy() == fzq_0.tJR) {
            string = "itemBackground";
        }
        fes_22.setStyle(string);
    }

    public static void changeItemBackground(flp_2 flp_22, ffV ffV2, frx_1 frx_12) {
        String string = "";
        fes_2 fes_22 = (fes_2)flp_22.gBE();
        if (ffV2 != null) {
            if (flp_22.gBy() == fzq_0.tJQ) {
                string = "itemSelectedBackground";
            } else if (flp_22.gBy() == fzq_0.tJR) {
                string = "itemBackground";
            }
            fes_22.setStyle(string);
        }
        if (frx_12 != null) {
            if (flp_22.gBy() == fzq_0.tJQ) {
                cgn_1.showPopup(flp_22, ffV2, frx_12, fes_22);
            } else {
                cgn_1.closePopup(flp_22);
            }
        }
    }

    public static void dragItem(flu_1 flu_12) {
        ffV ffV2 = (ffV)flu_12.getValue();
        mSK = ffV2.LV();
    }

    public static long getDraggedItemId() {
        return mSK;
    }

    public static void setDraggedItemId(long l) {
        mSK = l;
    }
}

