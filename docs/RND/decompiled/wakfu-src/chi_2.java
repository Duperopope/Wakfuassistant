/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHi
 */
@fyf_0
public class chi_2 {
    public static final String PACKAGE = "wakfu.storageBox";
    private static long mSK;
    private static fbt_1 mZy;

    public static void selectCompartment(fiq_1 fiq_12, bnl_0 bnl_02) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18892);
        dae_02.ay(bnl_02.deO());
        aaw_1.bUq().h(dae_02);
    }

    public static void dropItem(fla_2 fla_22) {
        boolean bl;
        if (!(fla_22.getValue() instanceof ffV)) {
            return;
        }
        cfe_1.onDropItem();
        ffV ffV2 = (ffV)fla_22.getValue();
        boolean bl2 = cvm_1.eTF().eTG().efZ().bt(ffV2);
        boolean bl3 = bl = aue_0.cVJ().cVK().dno().x(ffV2) != null;
        if (!bl && !bl2) {
            return;
        }
        boolean bl4 = fla_22.gDT();
        boolean bl5 = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljt);
        fcv_1 fcv_12 = fla_22.gDI().getRenderableParent();
        byte by = (byte)fcv_12.getCollection().getTableIndex(fcv_12);
        boolean bl6 = ffV2.LV() == mSK;
        short s = bl6 ? (short)16044 : 17635;
        if (!bl6 && ffV2.bfd() > 1 && bl4 ^ bl5) {
            che_1.setMaxQuantity(ffV2.bfd());
            che_1.setItem(ffV2);
            che_1.setMessageType(s);
            che_1.setDestinationPosition(by);
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
            dbl_03.setDestinationPosition(by);
            dbl_03.lK(s);
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

    public static void onMouseOverFilter(flg_2 flg_22) {
        if (flg_22.getItemValue().equals(cvm_1.eTF().eTG().efZ())) {
            return;
        }
        mZy = (fbt_1)((fcv_1)flg_22.gBD()).getInnerElementMap().uH("image");
        ((frp_1)mZy.getLayoutData()).setYOffset(-1);
        mZy.getContainer().gsm();
    }

    public static void onMouseOutFilter(flg_2 flg_22) {
        if (mZy == null) {
            return;
        }
        ((frp_1)mZy.getLayoutData()).setYOffset(-3);
        mZy.getContainer().gsm();
        mZy = null;
    }

    public static void onItemDoubleClick(flg_2 flg_22) {
        ffV ffV2 = (ffV)flg_22.getItemValue();
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.lK(17100);
        dbl_02.setItem(ffV2);
        dbl_02.ak(ffV2.bfd());
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

    public static void showItemDetails(flg_2 flg_22) {
        if (!flg_22.gEm()) {
            return;
        }
        if (flg_22.getItemValue() instanceof bnp_0) {
            ffV ffV2 = ((bnp_0)flg_22.getItemValue()).getItem();
            cdd_2.sendOpenCloseItemDetailMessage("storageBoxDialog", ffV2);
        } else {
            cdd_2.sendOpenCloseItemDetailMessage("storageBoxDialog", (ffV)flg_22.getItemValue());
        }
    }

    public static void depositMoney(fiq_1 fiq_12, fdz_1 fdz_12) {
        long l = Bw.p(fdz_12.getText());
        fdz_12.setText("");
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19140);
        dae_02.gj(l);
        aaw_1.bUq().h(dae_02);
    }

    public static void withdrawMoney(fiq_1 fiq_12, fdz_1 fdz_12) {
        long l = Bw.p(fdz_12.getText());
        fdz_12.setText("");
        dae_0 dae_02 = new dae_0();
        dae_02.lK(17597);
        dae_02.gj(l);
        aaw_1.bUq().h(dae_02);
    }
}

