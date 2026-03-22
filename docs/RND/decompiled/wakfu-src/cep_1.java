/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEP
 */
@fyf_0
public class cep_1 {
    public static final String PACKAGE = "wakfu.giftReward";

    public static void packageListOffset(fiq_1 fiq_12, fbz_2 fbz_22, String string) {
        float f2 = Bw.o(string);
        fbz_22.setListOffset(fbz_22.getOffset() + f2);
    }

    public static void consumeOneGift(flp_2 flp_22, bub_0 bub_02, bud_0 bud_02) {
        if (flp_22.gDT()) {
            cep_1.consumeAllGifts(flp_22, bub_02, bud_02);
            return;
        }
        dcm dcm2 = new dcm(bub_02);
        dcm2.cC(false);
        dcm2.lK(17475);
        dcm2.D(bud_02);
        aaw_1.bUq().h(dcm2);
    }

    public static void consumeAllGifts(fiq_1 fiq_12, bub_0 bub_02, bud_0 bud_02) {
        dcm dcm2 = new dcm(bub_02);
        dcm2.cC(true);
        dcm2.lK(17475);
        dcm2.D(bud_02);
        aaw_1.bUq().h(dcm2);
    }

    public static void consumeGiftPackage(fiq_1 fiq_12, bud_0 bud_02) {
        dae_0 dae_02 = new dae_0();
        dae_02.D(bud_02);
        dae_02.lK(19674);
        aaw_1.bUq().h(dae_02);
    }

    public static void consumeAllGiftPackages(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19864);
        aaw_1.bUq().h(dae_02);
    }

    public static void selectGiftPackage(flg_2 flg_22) {
        dcn_0 dcn_02 = new dcn_0((bud_0)flg_22.getItemValue());
        dcn_02.lK(18277);
        aaw_1.bUq().h(dcn_02);
    }

    public static void showItemDetailPopup(flg_2 flg_22) {
        bub_0 bub_02 = (bub_0)flg_22.getItemValue();
        cgn_1.showPopup(bub_02.duo(), 0);
    }

    public static void hideItemDetailPopup(flg_2 flg_22) {
        bub_0 bub_02 = (bub_0)flg_22.getItemValue();
        cgn_1.hidePopup(flg_22, bub_02.duo());
    }

    public static void openCloseDialog(fiq_1 fiq_12) {
        dae_0.cV((short)18366);
    }

    public static void openItemDetails(fiq_1 fiq_12, bub_0 bub_02, fey_2 fey_22) {
        if (((flp_2)fiq_12).gEm()) {
            bgv_2 bgv_22 = bub_02.duo();
            cep_1.a(bgv_22, fey_22);
        }
    }

    public static void collapseGift(flp_2 flp_22, bud_0 bud_02) {
        if (!flp_22.gEk() || ((fhv_1)flp_22.gBE()).getElementValue() instanceof fad_1) {
            return;
        }
        dae_0 dae_02 = new dae_0(16000);
        dae_02.D(bud_02);
        aaw_1.bUq().h(dae_02);
    }

    public static void displayGiftPopup(flg_2 flg_22, frx_1 frx_12, frx_1 frx_13) {
        cdc_2.displayRewardPopup(flg_22, frx_12, frx_13);
    }

    public static void consumeReward(flp_2 flp_22, bsu_0 bsu_02) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18393);
        dae_02.D(bsu_02);
        aaw_1.bUq().h(dae_02);
    }

    public static void consumeReward(flg_2 flg_22) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18393);
        dae_02.D(flg_22.getItemValue());
        aaw_1.bUq().h(dae_02);
    }

    public static void consumeDisplayedRewards(flp_2 flp_22) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16564);
        aaw_1.bUq().h(dae_02);
    }

    public static void selectType(flk_2 flk_22) {
        if (flk_22.bqr()) {
            dae_0 dae_02 = new dae_0(17690);
            dae_02.D(flk_22.getValue());
            aaw_1.bUq().h(dae_02);
        }
    }

    public static void selectCategory(flk_2 flk_22) {
        if (flk_22.bqr()) {
            dae_0 dae_02 = new dae_0(19680);
            dae_02.D(flk_22.getValue());
            aaw_1.bUq().h(dae_02);
        }
    }

    public static void changeGiftRewardView(flv_2 flv_22) {
        if (!flv_22.bqr()) {
            return;
        }
        fcu_1 fcu_12 = (fcu_1)flv_22.gBE();
        byte by = Byte.parseByte(fcu_12.getValue());
        dae_0 dae_02 = new dae_0(17736);
        dae_02.ay(by);
        aaw_1.bUq().h(dae_02);
    }

    public static void openItemDetails(flg_2 flg_22, fey_2 fey_22) {
        if (!flg_22.gEk()) {
            bsu_0 bsu_02 = (bsu_0)flg_22.getItemValue();
            bgv_2 bgv_22 = bsu_02.duo();
            cep_1.a(bgv_22, fey_22);
        }
    }

    private static void a(bgv_2 bgv_22, fey_2 fey_22) {
        ffV ffV2 = new ffV(bgv_22.d());
        ffV2.l(bgv_22);
        ffV2.ak((short)1);
        dbE dbE2 = cdd_2.getOpenCloseItemDetailMessage(ffV2);
        dbE2.rb(fey_22 == null ? null : fey_22.getElementMap().getId());
        aaw_1.bUq().h(dbE2);
    }
}

