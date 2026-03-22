/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGK
 */
@fyf_0
public class cgk_2 {
    public static final String PACKAGE = "wakfu.pet";
    private static final int mYP = 0;
    private static final int mYQ = 7;
    private static azx_1<Long, Long> mYR = new azx_1();

    public static void pickAccessory(fiq_1 fiq_12, bjm_0 bjm_02, ffV ffV2) {
        dae_0 dae_02 = new dae_0(19532);
        dae_02.sY(ffV2.acs());
        aaw_1.bUq().h(dae_02);
    }

    public static void removeAccessory(fiq_1 fiq_12, bjm_0 bjm_02) {
        dae_0 dae_02 = new dae_0(19532);
        dae_02.D(0);
        aaw_1.bUq().h(dae_02);
    }

    public static void pickColor(fiq_1 fiq_12, bjm_0 bjm_02, ffV ffV2) {
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.lK(16446);
        dbl_02.setItem(ffV2);
        dbl_02.gj(bjm_02.eai().LV());
        aaw_1.bUq().h(dbl_02);
    }

    public static void buyArticle(fiq_1 fiq_12, bpt_1<?, ?> bpt_12) {
        cyr_2.eYA().h(bpt_12);
    }

    public static void dragEquipment(flu_1 flu_12, bjm_0 bjm_02) {
        if (flu_12.getValue() != null && flu_12.getValue() instanceof ffV) {
            ffV ffV2 = (ffV)flu_12.getValue();
            mYR.Q(bjm_02.eai().LV());
            mYR.N(ffV2.LV());
        }
    }

    public static void setPetName(fiq_1 fiq_12, bjm_0 bjm_02, fdu_1 fdu_12) {
        if (fiq_12.gBy() == fzq_0.tJU || fiq_12.gBy() == fzq_0.tJF && ((fli_2)fiq_12).bCC() == 10) {
            boolean bl = bYV.bkY().dB(fdu_12.getText());
            if (bl) {
                dcl dcl2 = new dcl(bjm_02, 19052);
                dcl2.fa(fdu_12.getText());
                aaw_1.bUq().h(dcl2);
            } else {
                aPd.e("error.connection.nicknameInvalidContent", new Object[0]);
            }
        }
    }

    public static void changeDirection(flp_2 flp_22, fax_1 fax_12) {
        int n = flp_22.fca();
        if (n != 1 && n != 3) {
            return;
        }
        int n2 = n == 1 ? -1 : 1;
        int n3 = (fax_12.getDirection() + n2) % 8;
        if (n3 < 0) {
            n3 = 7;
        }
        fax_12.setDirection(n3);
        fax_12.setDirection(n3);
    }

    public static void feedPet(fla_2 fla_22) {
        bjm_0 bjm_02 = (bjm_0)fse_1.gFu().i("pet", fla_22.gDH().getElementMap());
        cgk_2.feedPet(fla_22, bjm_02);
    }

    public static void feedPet(fla_2 fla_22, bjm_0 bjm_02) {
        int n;
        cfe_1.onDropItem();
        Object object = fla_22.getValue();
        if (object == null || !(object instanceof ffV) || bjm_02 == null) {
            return;
        }
        ffV ffV2 = (ffV)object;
        fnl_0 fnl_02 = bjm_02.ead();
        if (fnp_0.a(fnl_02, ffV2.avr()) && (n = fnl_02.geL().agM() - fnl_02.agM()) > 0 && ffV2.bfd() > 1) {
            dbl_0 dbl_02 = new dbl_0();
            che_1.setMessageType((short)16938);
            che_1.setItem(ffV2);
            che_1.setMaxQuantity(Math.min(ffV2.bfd(), n));
            dbl_02.cY((short)fla_22.getScreenX());
            dbl_02.cZ((short)fla_22.getScreenY());
            dbl_02.lK(16021);
            aaw_1.bUq().h(dbl_02);
            return;
        }
        dck dck2 = new dck(bjm_02, (ffV)object);
        dck2.ak((short)1);
        aaw_1.bUq().h(dck2);
    }

    public static long getDraggedPetId() {
        Long l = mYR.getFirst();
        return l == null ? -1L : l;
    }

    public static long getDraggedItemId() {
        Long l = mYR.aHI();
        return l == null ? -1L : l;
    }

    public static void resetDraggedItemAndPetId() {
        mYR = new azx_1();
    }

    public static void togglePetFeedingDialog(fiq_1 fiq_12, bjg_0 bjg_02) {
        dae_0 dae_02 = new dae_0(18798);
        dae_02.D(bjg_02);
        aaw_1.bUq().h(dae_02);
    }

    public static void selectMeal(flg_2 flg_22, bjg_0 bjg_02) {
        if (!(flg_22.getItemValue() instanceof bji_0)) {
            return;
        }
        bjg_02.c((bji_0)flg_22.getItemValue());
    }

    public static void feedMeal(flg_2 flg_22, bjg_0 bjg_02) {
        if (!(flg_22.getItemValue() instanceof bji_0)) {
            return;
        }
        bjg_02.c((bji_0)flg_22.getItemValue());
        dae_0 dae_02 = new dae_0(17520);
        dae_02.cC(flg_22.gDT());
        dae_02.D(bjg_02);
        aaw_1.bUq().h(dae_02);
    }

    public static void feedWithSelectedMeal(flp_2 flp_22, bjg_0 bjg_02) {
        dae_0 dae_02 = new dae_0(17520);
        dae_02.cC(flp_22.gDT());
        dae_02.D(bjg_02);
        aaw_1.bUq().h(dae_02);
    }
}

