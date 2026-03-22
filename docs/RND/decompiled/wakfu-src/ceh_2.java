/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 */
import com.ankamagames.wakfu.client.console.command.commonIn.MapCommand;
import com.google.common.base.Strings;

/*
 * Renamed from cEh
 */
@fyf_0
public class ceh_2 {
    public static final String PACKAGE = "wakfu.crafts";

    public static void openLinkedBook(fiq_1 fiq_12) {
        ((bmf_2)fse_1.gFu().aW("craft", ((fhv_1)fiq_12.gBE()).getElementMap().getId())).dwj();
    }

    public static void selectCraft(flg_2 flg_22) {
        dal_0 dal_02 = new dal_0((bmf_2)flg_22.getItemValue());
        aaw_1.bUq().h(dal_02);
    }

    public static void scrollCraft(flp_2 flp_22) {
        cte_2.eQC().f(flp_22);
    }

    public static void scrollRecipe(flp_2 flp_22) {
        cte_2.eQC().g(flp_22);
    }

    public static void checkOkFilter(fiq_1 fiq_12) {
        ((bmf_2)fse_1.gFu().aW("craft", ((fhv_1)fiq_12.gBE()).getElementMap().getId())).dwT();
    }

    public static void checkUpgradeFilter(fiq_1 fiq_12) {
        ((bmf_2)fse_1.gFu().aW("craft", ((fhv_1)fiq_12.gBE()).getElementMap().getId())).dwU();
    }

    public static void checkXpFilter(fiq_1 fiq_12) {
        ((bmf_2)fse_1.gFu().aW("craft", ((fhv_1)fiq_12.gBE()).getElementMap().getId())).dwV();
    }

    public static void validNameFilter(fiq_1 fiq_12, fdv_1 fdv_12) {
        bmf_2 bmf_22 = (bmf_2)fse_1.gFu().aW("craft", ((fhv_1)fiq_12.gBE()).getElementMap().getId());
        String string = fdv_12.getText();
        if (!string.equals(bmf_22.dwS())) {
            bmf_22.md(string);
        }
    }

    public static void validMinLevelFilter(fiq_1 fiq_12, fdu_1 fdu_12) {
        bmf_2 bmf_22 = (bmf_2)fse_1.gFu().aW("craft", ((fhv_1)fiq_12.gBE()).getElementMap().getId());
        short s = -1;
        String string = fdu_12.getText();
        if (string != null && string.length() > 0) {
            s = Bw.r(string);
        }
        if (s != bmf_22.dfu()) {
            bmf_22.bn(s);
        }
    }

    public static void validMaxLevelFilter(fiq_1 fiq_12, fdu_1 fdu_12) {
        bmf_2 bmf_22 = (bmf_2)fse_1.gFu().aW("craft", ((fhv_1)fiq_12.gBE()).getElementMap().getId());
        short s = Short.MAX_VALUE;
        String string = fdu_12.getText();
        if (string != null && string.length() > 0) {
            s = Bw.r(string);
        }
        if (s != bmf_22.dfv()) {
            bmf_22.bo(s);
        }
    }

    public static void previousPage(fiq_1 fiq_12, bmf_2 bmf_22) {
        int n = bmf_22.dfz() - 1;
        if (n < 0) {
            return;
        }
        bmf_22.BH(n);
    }

    public static void nextPage(fiq_1 fiq_12, bmf_2 bmf_22) {
        int n = bmf_22.dfz() + 1;
        if (n >= bmf_22.dxd()) {
            return;
        }
        bmf_22.BH(n);
    }

    public static void firstPage(fiq_1 fiq_12, bmf_2 bmf_22) {
        bmf_22.BH(0);
    }

    public static void lastPage(fiq_1 fiq_12, bmf_2 bmf_22) {
        int n = bmf_22.dxd() - 1;
        bmf_22.BH(n);
    }

    public static void displayRecipesWithIngredient(fiq_1 fiq_12, bmq_1 bmq_12) {
        cte_2.eQC().MJ(bmq_12.azv());
    }

    public static void displayLinkedZones(fiq_1 fiq_12, bmq_1 bmq_12) {
        cte_2.eQC().a(bmq_12.ccu(), bmq_12.dwe());
    }

    public static void displayRecipesWithIngredient(fiq_1 fiq_12, bmv_1 bmv_12) {
        cte_2.eQC().MJ(bmv_12.dxB().d());
    }

    public static void onCraftTypeChanged(flv_2 flv_22, String string) {
    }

    public static void onCraftTypeChanged(flv_2 flv_22, String string, bmf_2 bmf_22) {
        if (!flv_22.bqr()) {
            return;
        }
        int n = Integer.parseInt(string);
        bmf_22.a(bme_2.bt((byte)n));
        fse_1.gFu().f("craftDisplayType", (byte)n);
    }

    public static void openIngredientDescription(flp_2 flp_22, bmj_2 bmj_22, fey_2 fey_22) {
        if (!flp_22.gEm()) {
            return;
        }
        if (flp_22.gDR()) {
            aPe.a(bmj_22.duo());
        } else {
            cdd_2.sendOpenCloseItemDetailMessage(fey_22 == null ? null : fey_22.getElementMap().getId(), bmj_22.duo());
        }
    }

    public static void openProducedItemDescription(flg_2 flg_22, fey_2 fey_22) {
        if (flg_22.getItemValue() instanceof bmv_1) {
            ceh_2.openProducedItemDescription((flp_2)flg_22, (bmv_1)flg_22.getItemValue(), fey_22);
        } else if (flg_22.getItemValue() instanceof bmq_1) {
            ceh_2.openProducedItemDescription((flp_2)flg_22, (bmq_1)flg_22.getItemValue(), fey_22);
        }
    }

    public static void expandJobInLinkedRecipes(flp_2 flp_22, bmk_2 bmk_22) {
        bmk_22.gB(!bmk_22.dxl());
        fse_1.gFu().a((aef_2)bmk_22, "isExpanded");
    }

    public static void expandWorldInLinkedZones(flp_2 flp_22, bmm_2 bmm_22) {
        bmm_22.gB(!bmm_22.dxl());
        fse_1.gFu().a((aef_2)bmm_22, "isExpanded");
    }

    public static void firstPage(flp_2 flp_22, bmk_2 bmk_22) {
        bmk_22.dxn();
    }

    public static void previousPage(flp_2 flp_22, bmk_2 bmk_22) {
        bmk_22.dxo();
    }

    public static void nextPage(flp_2 flp_22, bmk_2 bmk_22) {
        bmk_22.dxp();
    }

    public static void lastPage(flp_2 flp_22, bmk_2 bmk_22) {
        bmk_22.dxq();
    }

    public static void openProducedItemDescription(flp_2 flp_22, bmq_1 bmq_12, fey_2 fey_22) {
        if (!flp_22.gEm()) {
            return;
        }
        Object r = fgD.fXh().Vd(bmq_12.azv());
        if (r == null) {
            return;
        }
        ffV ffV2 = new ffV(((fhc_0)r).d());
        ffV2.l((fhc_0)r);
        dbk_0 dbk_02 = new dbk_0();
        dbk_02.lK(16264);
        dbk_02.rb(fey_22 == null ? null : fey_22.getElementMap().getId());
        dbk_02.c(ffV2);
        aaw_1.bUq().h(dbk_02);
    }

    public static void openProducedItemDescription(flp_2 flp_22, bmv_1 bmv_12, fey_2 fey_22) {
        if (!flp_22.gEm()) {
            return;
        }
        if (flp_22.gDR()) {
            aPe.a(bmv_12.duo());
        } else {
            bgv_2 bgv_22 = bmv_12.dxB();
            cdd_2.sendOpenCloseItemDetailMessage(fey_22 == null ? null : fey_22.getElementMap().getId(), bgv_22);
        }
    }

    public static void outRecipe(fiq_1 fiq_12, fbt_1 fbt_12) {
        ceh_2.outRecipe(fiq_12, fbt_12, null);
    }

    public static void overRecipe(fiq_1 fiq_12, fbt_1 fbt_12) {
        ceh_2.overRecipe(fiq_12, fbt_12, null);
    }

    public static void outRecipe(fiq_1 fiq_12, fbt_1 fbt_12, fes_2 fes_22) {
        fbt_12.setDisplaySize(new fsm_1(46, 46));
        if (fes_22 != null) {
            fes_22.setVisible(false);
        }
    }

    public static void overRecipe(fiq_1 fiq_12, fbt_1 fbt_12, fes_2 fes_22) {
        fbt_12.setDisplaySize(new fsm_1(50, 50));
        if (fes_22 != null) {
            fes_22.setVisible(true);
        }
    }

    public static void switchToFreeMode(flv_2 flv_22) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(17994);
        dae_02.cC(flv_22.bqr());
        aaw_1.bUq().h(dae_02);
    }

    public static void overJobTitle(flp_2 flp_22, bmk_2 bmk_22) {
        bmk_22.gC(true);
    }

    public static void outJobTitle(flp_2 flp_22, bmk_2 bmk_22) {
        bmk_22.gC(false);
    }

    public static void overWorldTitle(flp_2 flp_22, bmm_2 bmm_22) {
        bmm_22.gC(true);
    }

    public static void outWorldTitle(flp_2 flp_22, bmm_2 bmm_22) {
        bmm_22.gC(false);
    }

    public static void onCompassClick(flp_2 flp_22, bml_2 bml_22) {
        MapCommand.cTQ();
        biq_1 biq_12 = big_2.l((short)bml_22.bhh(), true);
        biq_1 biq_13 = big_2.y(bml_22.clk(), (short)bml_22.bhh());
        bif_2.dYO().a(biq_13 != null ? biq_13 : biq_12);
    }

    public static void toggleLevelSort(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(18466));
    }

    public static void toggleRegisterView(flp_2 flp_22, bmf_2 bmf_22) {
        fsf_1 fsf_12 = fse_1.gFu().getProperty("craftDisplayType");
        if (fsf_12 != null && ((Byte)fsf_12.getValue()).byteValue() == bme_2.iCq.aJr()) {
            fse_1.gFu().f("craftDisplayType", bme_2.iCo.aJr());
            bmf_22.a(bme_2.iCo);
            return;
        }
        fse_1.gFu().f("craftDisplayType", bme_2.iCq.aJr());
    }

    public static void setCraftServiceMinLevel(fiq_1 fiq_12, fdu_1 fdu_12, bmf_2 bmf_22) {
        String string = fdu_12.getText();
        if (Strings.isNullOrEmpty((String)string)) {
            return;
        }
        try {
            int n = Integer.parseInt(string);
            dae_0 dae_02 = new dae_0(19888);
            dae_02.sY(n);
            dae_02.D(bmf_22);
            aaw_1.bUq().h(dae_02);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
    }

    public static void toggleCraftServiceEnabled(flp_2 flp_22, bmf_2 bmf_22) {
        dae_0 dae_02 = new dae_0(19760);
        dae_02.D(bmf_22);
        aaw_1.bUq().h(dae_02);
    }

    public static void saveRegistrationChanges(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(17795));
    }

    public static void cancelRegistrationChanges(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(18745));
    }

    public static void changeArtisanStatus(fiq_1 fiq_12, String string) {
        boolean bl = "1".equals(string);
        dae_0 dae_02 = new dae_0(18458);
        dae_02.cC(bl);
        aaw_1.bUq().h(dae_02);
    }

    public static void clickOnRecipeIngredient(flg_2 flg_22) {
        if (!flg_22.gEk()) {
            return;
        }
        if (aue_0.cVJ().c(cwl_1.eVl())) {
            cfp_1.a((flp_2)flg_22, flg_22.getItemValue());
        }
    }

    public static void clickOnRecipeResult(flp_2 flp_22, bmv_1 bmv_12) {
        if (!flp_22.gEk()) {
            return;
        }
        if (aue_0.cVJ().c(cwl_1.eVl())) {
            cfp_1.a(flp_22, bmv_12);
        }
    }
}

