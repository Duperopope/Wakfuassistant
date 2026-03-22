/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDT
 */
@fyf_0
public class cdt_1 {
    public static final String PACKAGE = "wakfu.collectMachine";
    private static long mSK;

    public static void valid(fiq_1 fiq_12, blk_0 blk_02) {
        daC daC2 = new daC(blk_02);
        daC2.lK(18242);
        aaw_1.bUq().h(daC2);
    }

    public static void setContentToMax(fiq_1 fiq_12, blk_0 blk_02) {
        daC daC2 = new daC(blk_02);
        daC2.sY(-1);
        daC2.lK(19061);
        aaw_1.bUq().h(daC2);
    }

    public static void keyType(fiq_1 fiq_12, fdu_1 fdu_12, blk_0 blk_02) {
        String string = fdu_12.getText();
        if (string.length() == 0) {
            return;
        }
        int n = Integer.parseInt(string);
        daC daC2 = new daC(blk_02);
        daC2.sY(n);
        daC2.lK(19061);
        aaw_1.bUq().h(daC2);
    }

    public static void dropItem(fla_2 fla_22) {
        if (!(fla_22.getValue() instanceof ffV)) {
            return;
        }
        ffV ffV2 = (ffV)fla_22.getValue();
        if (aue_0.cVJ().cVK().dno().x(ffV2) == null) {
            return;
        }
        cfe_1.onDropItem();
        boolean bl = fla_22.gDT();
        boolean bl2 = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljt);
        if (ffV2.bfd() > 1 && bl ^ bl2) {
            che_1.setMaxQuantity(ffV2.bfd());
            che_1.setItem(ffV2);
            che_1.setMessageType((short)16784);
            dbl_0 dbl_02 = new dbl_0();
            dbl_02.setItem(ffV2);
            dbl_02.cY((short)fla_22.getScreenX());
            dbl_02.cZ((short)fla_22.getScreenY());
            dbl_02.lK(16021);
            aaw_1.bUq().h(dbl_02);
        } else {
            dbl_0 dbl_03 = new dbl_0();
            dbl_03.gj(ffV2.LV());
            dbl_03.az(ffV2.bfd());
            dbl_03.lK(16784);
            aaw_1.bUq().h(dbl_03);
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

    public static void giveKamas(flp_2 flp_22) {
        cdt_1.moveKamas(flp_22, true);
    }

    public static void takeKamas(flp_2 flp_22) {
        cdt_1.moveKamas(flp_22, false);
    }

    public static void moveKamas(flp_2 flp_22, boolean bl) {
        if (flp_22.gEk()) {
            dbl_0 dbl_02 = new dbl_0();
            fes_2 fes_22 = (fes_2)fyw_0.gqw().gqC().uR("freeCollectMachineDialog").uH("localMoney");
            int n = 65;
            int n2 = 20;
            che_1.setMessageType(bl ? (short)19409 : 17390);
            che_1.setMaxQuantity(bl ? aue_0.cVJ().cVK().dmi() : ctq_1.ePB().ePC().dtp());
            dbl_02.cY((short)(fes_22.getScreenX() + 65));
            dbl_02.cZ((short)(fes_22.getScreenY() + 20));
            dbl_02.lK(16021);
            aaw_1.bUq().h(dbl_02);
        }
    }

    public static void onItemDoubleClick(flg_2 flg_22) {
        ffV ffV2 = (ffV)flg_22.getItemValue();
        mSK = ffV2.LV();
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.setItem(ffV2);
        dbl_02.gj(ffV2.LV());
        dbl_02.ak(ffV2.bfd());
        dbl_02.lK(19660);
        dbl_02.setDestinationUniqueId(che_1.getDestinationUniqueId());
        dbl_02.setDestinationPosition(che_1.getDestinationPosition());
        aaw_1.bUq().h(dbl_02);
    }

    public static void changeItemBackground(flp_2 flp_22, ffV ffV2, fey_2 fey_22, frx_1 frx_12) {
        String string = "";
        fes_2 fes_22 = (fes_2)flp_22.gBE();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (ffV2 != null) {
            boolean bl = false;
            if (flp_22.gBy() == fzq_0.tJQ) {
                bl = true;
                string = ffV2.dOg().dpq() != 0 ? "itemSetSelectedBackground" : "itemSelectedBackground";
            } else if (flp_22.gBy() == fzq_0.tJR) {
                string = bEf.az(ffV2);
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
}

