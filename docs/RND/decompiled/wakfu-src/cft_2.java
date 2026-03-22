/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFt
 */
@fyf_0
public class cft_2 {
    public static final String PACKAGE = "wakfu.mimiSymbic";
    private static ffV mVZ;
    private static ffV mWa;

    public static void onValidate(fiq_1 fiq_12) {
        dae_0.cV((short)16596);
    }

    public static void clean() {
        mWa = null;
        mVZ = null;
    }

    public static void onDragStatItem(flu_1 flu_12) {
        mVZ = (ffV)flu_12.getValue();
    }

    public static void onDragSkinItem(flu_1 flu_12) {
        mWa = (ffV)flu_12.getValue();
    }

    public static boolean checkDragItemDropped(ffV ffV2) {
        if (!aue_0.cVJ().c(cww_1.nSJ)) {
            return false;
        }
        if (mVZ == null && mWa == null || ffV2 == null) {
            return false;
        }
        if (mVZ != null && mVZ.LV() == ffV2.LV()) {
            cft_2.onDropOutStatItem(null, ffV2);
            return true;
        }
        if (mWa != null && mWa.LV() == ffV2.LV()) {
            cft_2.onDropOutSkinItem(null, ffV2);
            return true;
        }
        return false;
    }

    public static boolean checkEquipItemDropped(ffV ffV2) {
        if (!aue_0.cVJ().c(cww_1.nSJ)) {
            return false;
        }
        if (ffV2 == null) {
            return false;
        }
        ffV ffV3 = cww_1.nSJ.eVV().dXJ();
        if (ffV3 != null && ffV3.LV() == ffV2.LV()) {
            cft_2.onDropOutStatItem(null, ffV2);
            return true;
        }
        ffV ffV4 = cww_1.nSJ.eVV().dXK();
        if (ffV4 != null && ffV4.LV() == ffV2.LV()) {
            cft_2.onDropOutSkinItem(null, ffV2);
            return true;
        }
        return false;
    }

    public static void onDropInStatItem(fla_2 fla_22) {
        ffV ffV2;
        Object object = fla_22.getValue();
        if (!(object instanceof ffV)) {
            if (!(object instanceof bgp_1)) {
                return;
            }
            ffV2 = ((bgp_1)object).getItem();
        } else {
            ffV2 = (ffV)object;
        }
        mVZ = null;
        cfe_1.onDropItem();
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.setItem(ffV2);
        dbl_02.lK(17719);
        aaw_1.bUq().h(dbl_02);
    }

    public static void onDropInSkinItem(fla_2 fla_22) {
        ffV ffV2;
        Object object = fla_22.getValue();
        if (!(object instanceof ffV)) {
            if (!(object instanceof bgp_1)) {
                return;
            }
            ffV2 = ((bgp_1)object).getItem();
        } else {
            ffV2 = (ffV)object;
        }
        mWa = null;
        cfe_1.onDropItem();
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.setItem(ffV2);
        dbl_02.lK(18288);
        aaw_1.bUq().h(dbl_02);
    }

    public static void onDropOutStatItem(flc_2 flc_22) {
        cft_2.onDropOutStatItem(flc_22, flc_22.getValue());
    }

    public static void onDropOutStatItem(flg_2 flg_22) {
        if (flg_22.gBy() != fzq_0.tJC) {
            return;
        }
        cft_2.onDropOutStatItem(flg_22, flg_22.getItemValue());
    }

    public static void onDropOutStatItem(fiq_1 fiq_12, Object object) {
        if (!(object instanceof ffV)) {
            return;
        }
        mVZ = null;
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.setItem(null);
        dbl_02.lK(17719);
        aaw_1.bUq().h(dbl_02);
    }

    public static void onDropOutSkinItem(flc_2 flc_22) {
        cft_2.onDropOutSkinItem(flc_22, flc_22.getValue());
    }

    public static void onDropOutSkinItem(flg_2 flg_22) {
        if (flg_22.gBy() != fzq_0.tJC) {
            return;
        }
        cft_2.onDropOutSkinItem(flg_22, flg_22.getItemValue());
    }

    public static void onDropOutSkinItem(fiq_1 fiq_12, Object object) {
        if (!(object instanceof ffV)) {
            return;
        }
        mWa = null;
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.setItem(null);
        dbl_02.lK(18288);
        aaw_1.bUq().h(dbl_02);
    }
}

