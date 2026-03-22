/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cGO
 */
@fyf_0
public class cgo_1 {
    public static final String PACKAGE = "wakfu.protectorManagement";
    private static final Logger mYS = Logger.getLogger(cgo_1.class);

    public static void selectMerchantItem(flg_2 flg_22) {
        fse_1.gFu().f("selectedProtectorMerchantItem", flg_22.getItemValue());
    }

    public static void validateBudgetAllocation(fli_2 fli_22, fad_1 fad_12) {
        fdu_1 fdu_12 = (fdu_1)fli_22.gBE();
        int n = Bw.b((Object)fdu_12.getText(), -1);
        boolean bl = (long)n <= bTj.eno().doD().eav().exS();
        fad_12.setEnabled(bl);
    }

    public static void allocateBudget(fiq_1 fiq_12, fdu_1 fdu_12, bTt bTt2) {
        int n = Bw.b((Object)fdu_12.getText(), -1);
        if (n == -1) {
            mYS.warn((Object)("Impossible d'allouer le budget : " + fdu_12.getText() + " n'est pas une valeur valide."));
            return;
        }
        if ((long)n > bTt2.enA().exS()) {
            mYS.warn((Object)("Impossible d'allouer le budget : on demande " + n + "alors qu'il ne reste que " + bTt2.enA().exS()));
            return;
        }
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18824);
        dae_02.sY(n);
        dae_02.ay(bTt2.enz().sNB);
        aaw_1.bUq().h(dae_02);
        fyw_0.gqw().tl("protectorBudgetAllocateDialog");
    }

    public static void openAllocateBudget(fiq_1 fiq_12, bTt bTt2) {
        fse_1.gFu().f("selectedProtectorBudget", bTt2);
        ccj_2.g("protectorBudgetAllocateDialog", 256L);
    }

    public static void validateBudgetTransfer(fli_2 fli_22, fad_1 fad_12) {
        fdu_1 fdu_12 = (fdu_1)fli_22.gBE();
        int n = Bw.b((Object)fdu_12.getText(), -1);
        boolean bl = (long)n <= bTj.eno().doD().eav().exS();
        fad_12.setEnabled(bl);
    }

    public static void transferBudget(fiq_1 fiq_12, fdu_1 fdu_12, fas_1 fas_12) {
        int n = Bw.b((Object)fdu_12.getText(), -1);
        if (n == -1) {
            mYS.warn((Object)("Impossible de transf\u00e9rer le budget : " + fdu_12.getText() + " n'est pas une valeur valide."));
            return;
        }
        fpg fpg2 = bTj.eno().doD().eav();
        if ((long)n > fpg2.exS()) {
            mYS.warn((Object)("Impossible de transf\u00e9rer le budget : on demande " + n + "alors qu'il ne reste que " + fpg2.exS()));
            return;
        }
        bst_2 bst_22 = (bst_2)fas_12.getSelectedValue();
        dae_0 dae_02 = new dae_0();
        dae_02.lK(17465);
        dae_02.gj(bst_22.ctn());
        dae_02.sY(n);
        aaw_1.bUq().h(dae_02);
        fdu_12.setText("0");
    }

    public static void openTransferBudget(fiq_1 fiq_12) {
        fhv_1 fhv_12 = ccj_2.g("protectorBudgetTransferDialog", 256L);
        fas_1 fas_12 = (fas_1)fhv_12.getElementMap().uH("territoryCombo");
        fas_12.getList().setListFilter(new cgp_1());
    }

    public static void changeChallengeCategory(flv_2 flv_22, bTe bTe2) {
        if (flv_22.bqr()) {
            fcu_1 fcu_12 = (fcu_1)flv_22.gBE();
            byte by = Bw.q(fcu_12.getValue());
            bfS bfS2 = bfS.bh(by);
            bTe2.a(bfS2);
        }
    }

    public static void changeZoologyCategory(flv_2 flv_22, bTp bTp2) {
        if (flv_22.bqr()) {
            fcu_1 fcu_12 = (fcu_1)flv_22.gBE();
            boolean bl = Bw.aK(fcu_12.getValue());
            bTp2.setSelected(bl);
        }
    }

    public static void reintroduce(fiq_1 fiq_12, bTp bTp2, bTo bTo2) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19366);
        dae_02.sY(bTo2.cqy());
        dae_02.cC(bTo2.egX());
        aaw_1.bUq().h(dae_02);
    }

    public static void protect(fiq_1 fiq_12, bTp bTp2, bTo bTo2) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16190);
        dae_02.sY(bTo2.cqy());
        dae_02.cC(bTo2.egX());
        aaw_1.bUq().h(dae_02);
    }

    public static void unprotect(fiq_1 fiq_12, bTp bTp2, bTo bTo2) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18405);
        dae_02.sY(bTo2.cqy());
        dae_02.cC(bTo2.egX());
        aaw_1.bUq().h(dae_02);
    }

    public static void validMerchantItemPurchase(flp_2 flp_22, bkm_0 bkm_02, bkq_0 bkq_02) {
        if (!flp_22.gEk()) {
            return;
        }
        fse_1.gFu().f("selectedProtectorMerchantItem", bkq_02);
        dcs dcs2 = new dcs();
        dcs2.lK(17732);
        dcs2.c(bkm_02);
        aaw_1.bUq().h(dcs2);
    }

    public static void tabSelected(fiq_1 fiq_12) {
        if (fiq_12.gBE() instanceof fcu_1) {
            fse_1.gFu().f("selectedProtectorMerchantItem", (Object)null);
        }
    }

    public static void setTaxValue(flw_2 flw_22) {
        bbr_2 bbr_22 = bTj.eno().b(frk.sXG);
        cgo_1.a(flw_22.getValue(), bbr_22);
        fse_1.gFu().a((aef_2)bbr_22, "taxValue", "taxPercentage", "taxPercentageLongDesc");
    }

    private static void a(float f2, bbr_2 bbr_22) {
        frj frj2 = bbr_22.dar();
        frj2.setValue(f2 * 5.0f / 100.0f);
    }

    public static void applyTaxes(fiq_1 fiq_12) {
        dae_0.cV((short)19216);
    }

    public static void onBoughtChallengeSelectionChange(flv_2 flv_22, bfV bfV2) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18673);
        dae_02.sY(bfV2.dig().d());
        dae_02.cC(flv_22.bqr());
        aaw_1.bUq().h(dae_02);
    }

    public static void applyLaws(fiq_1 fiq_12) {
        dae_0.cV((short)16827);
        cgo_1.a(fiq_12, false);
    }

    public static void openChallengeDescription(flp_2 flp_22, aef_2 aef_22) {
        if (flp_22.gEk()) {
            return;
        }
        bfM bfM2 = null;
        if (aef_22 instanceof bfM) {
            bfM2 = (bfM)aef_22;
        } else if (aef_22 instanceof bkk_0) {
            bkk_0 bkk_02 = (bkk_0)aef_22;
            bfM2 = bgk.hZN.Cx(bkk_02.clS());
        }
        if (bfM2 != null) {
            csc_1.eNJ().a(bfM2);
        }
    }

    public static void openClimateBonusDescription(flp_2 flp_22, bkl_0 bkl_02) {
        if (flp_22.gEk()) {
            return;
        }
        if (bkl_02 != null) {
            fhv_1 fhv_12 = fyw_0.gqw().a("climateBonusDetailDialog" + bkl_02.ebg(), ccj_2.pe("climateBonusDetailDialog"), 16L);
            fse_1.gFu().a("climateDetail", (Object)bkl_02, fhv_12.getElementMap());
        }
    }

    private static void a(fiq_1 fiq_12, boolean bl) {
        fad_1 fad_12 = (fad_1)((fhv_1)fiq_12.gBD()).getElementMap().uH("applyLawsButton");
        fad_12.setEnabled(bl);
    }

    public static void displayPage(flv_2 flv_22) {
        if (flv_22.bqr()) {
            fcu_1 fcu_12 = (fcu_1)flv_22.gBE();
            fse_1.gFu().a("currentPage", (Object)fcu_12.getValue(), fcu_12.getElementMap());
        }
    }
}

