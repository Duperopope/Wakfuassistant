/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cFa
 */
@fyf_0
public class cfa_1 {
    protected static final Logger mVr = Logger.getLogger(cfa_1.class);
    public static final String PACKAGE = "wakfu.heroBuild";
    private static final String mVs = "toggleCritical";
    private static final ccf_2 mVt = new ccf_2();

    public static void toggleBuildReduction(flp_2 flp_22) {
        dae_0 dae_02 = new dae_0(17591);
        aaw_1.bUq().h(dae_02);
    }

    public static void unloadDialog(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(18258));
    }

    private static void bw(ffV ffV2) {
        if (ffV2.adO()) {
            dbo_0<bjm_0> dbo_02 = new dbo_0<bjm_0>(new bjm_0(ffV2));
            dbo_02.lK(17533);
            dbo_02.rb("heroBuildDialog");
            aaw_1.bUq().h(dbo_02);
        } else {
            cdd_2.sendOpenCloseItemDetailMessage("heroBuildDialog", ffV2);
        }
    }

    public static void changeBuildTab(flv_2 flv_22) {
        if (!flv_22.bqr() || !(flv_22.gBE() instanceof fcu_1)) {
            return;
        }
        try {
            int n = Integer.parseInt(((fcu_1)flv_22.gBE()).getValue()) - 1;
            if (n < 0) {
                return;
            }
            dae_0 dae_02 = new dae_0(19957);
            dae_02.sY(n);
            aaw_1.bUq().h(dae_02);
        }
        catch (NumberFormatException numberFormatException) {
            mVr.error((Object)("Invalid tab value: " + ((fcu_1)flv_22.gBE()).getValue()));
        }
    }

    public static void openCreateBuildDialog(flp_2 flp_22) {
        dae_0 dae_02 = new dae_0(18953);
        aaw_1.bUq().h(dae_02);
    }

    public static void addNewBuildSheet(fiq_1 fiq_12, fdv_1 fdv_12, fas_1 fas_12, fbz_2 fbz_22, bws bws2) {
        bfC bfC2 = (bfC)fas_12.getSelectedValue();
        if (bfC2 == null) {
            return;
        }
        if (bws2 == null) {
            return;
        }
        bfB bfB2 = (bfB)fbz_22.getSelectedValue();
        int n = bfB2 == null ? eIp.fww() : bfB2.bnd();
        String string = fdv_12.getText();
        String string2 = string == null || string.isBlank() ? cvu_2.Nh(bfC2.cmL()) : string;
        dak dak2 = new dak(eIn.rZ(string2), bfC2.cmL(), n, bws2.dMs());
        aaw_1.bUq().h(dak2);
        fyw_0.gqw().tl("createBuildDialog");
    }

    public static void selectBuildSheet(flk_2 flk_22) {
        if (!flk_22.bqr()) {
            return;
        }
        if (!(flk_22.getValue() instanceof bfF)) {
            return;
        }
        dae_0 dae_02 = new dae_0(16357);
        dae_02.D(flk_22.getValue());
        aaw_1.bUq().h(dae_02);
    }

    public static void activateBuildSheet(flp_2 flp_22, bfF bfF2) {
        dae_0 dae_02 = new dae_0(19870);
        dae_02.D(bfF2);
        aaw_1.bUq().h(dae_02);
    }

    public static void activateBuildSheet(flp_2 flp_22) {
        dae_0 dae_02 = new dae_0(19870);
        dae_02.D(null);
        aaw_1.bUq().h(dae_02);
    }

    public static void saveBuildChanges(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(17399));
    }

    public static void discardBuildChanges(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(19288));
    }

    public static void deleteBuildSheet(flp_2 flp_22) {
        dae_0 dae_02 = new dae_0(18741);
        aaw_1.bUq().h(dae_02);
    }

    public static void overBuild(flg_2 flg_22, bfE bfE2) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof bfF)) {
            return;
        }
        bfF bfF2 = (bfF)object;
        bfE2.bg((byte)bfF2.wp());
        fse_1.gFu().a((aef_2)bfE2, "currentOverBuildSheet");
    }

    public static void outBuild(flg_2 flg_22, bfE bfE2) {
        bfE2.bg((byte)-2);
        fse_1.gFu().a((aef_2)bfE2, "currentOverBuildSheet");
    }

    public static void searchBuildsList(fiq_1 fiq_12, fdv_1 fdv_12) {
        dae_0 dae_02 = new dae_0(16982);
        dae_02.fa(fdv_12.getText());
        aaw_1.bUq().h(dae_02);
    }

    public static void togglePermanentBuildVisibility(flv_2 flv_22) {
        dae_0 dae_02 = new dae_0(16291);
        dae_02.cC(flv_22.bqr());
        aaw_1.bUq().h(dae_02);
    }

    public static void sortBuildsListBy(fiq_1 fiq_12, String string) {
        bwh bwh2 = bwh.mD(string);
        if (bwh2 == null) {
            return;
        }
        dae_0 dae_02 = new dae_0(16002);
        dae_02.D((Object)bwh2);
        aaw_1.bUq().h(dae_02);
    }

    public static void onDropBuild(fla_2 fla_22) {
        if (!(fla_22.gDy() instanceof bfF)) {
            return;
        }
        if (!(fla_22.gDJ() instanceof bfF)) {
            return;
        }
        if (((bfF)fla_22.gDy()).wp() == 0) {
            return;
        }
        int n = fla_22.gDK();
        bfF bfF2 = (bfF)fla_22.gDJ();
        dam dam2 = new dam(n, bfF2);
        aaw_1.bUq().h(dam2);
    }

    public static void buildNamePopup(fiq_1 fiq_12, frx_1 frx_12, bfF bfF2) {
        fse_1.gFu().f("hoveredBuildName", bfF2.getName());
        fyd_0.popup(fiq_12, frx_12, (fes_2)fiq_12.gBE());
    }

    public static void openEditBuildDialog(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(18814);
        aaw_1.bUq().h(dae_02);
    }

    public static void openSaveBuildAsDialog(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(16963);
        aaw_1.bUq().h(dae_02);
    }

    public static void openCopyBuildToDialog(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(17996);
        dae_02.cC(true);
        aaw_1.bUq().h(dae_02);
    }

    public static void openCopyBuildFromDialog(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(17996);
        dae_02.cC(false);
        aaw_1.bUq().h(dae_02);
    }

    public static void changePartsToCopy(fiq_1 fiq_12, fdd_2 fdd_22, fdd_2 fdd_23, fdd_2 fdd_24) {
        dal dal2 = new dal(fdd_22.getSelected(), fdd_23.getSelected(), fdd_24.getSelected());
        aaw_1.bUq().h(dal2);
    }

    public static void searchBuildsForCopy(fiq_1 fiq_12, fdv_1 fdv_12) {
        dae_0 dae_02 = new dae_0(16295);
        dae_02.fa(fdv_12.getText());
        aaw_1.bUq().h(dae_02);
    }

    public static void filterBuildsForCopyListBySameLevel(flp_2 flp_22, fdd_2 fdd_22) {
        dae_0 dae_02 = new dae_0(16541);
        dae_02.cC(fdd_22.getSelected());
        aaw_1.bUq().h(dae_02);
    }

    public static void toggleAutoCleanBuildOnCopy(fiq_1 fiq_12, fdd_2 fdd_22) {
        dae_0 dae_02 = new dae_0(17672);
        dae_02.cC(fdd_22.getSelected());
        aaw_1.bUq().h(dae_02);
    }

    public static void selectBuildForCopy(flk_2 flk_22) {
        if (!flk_22.bqr()) {
            return;
        }
        if (!(flk_22.getValue() instanceof bwe_0)) {
            return;
        }
        dae_0 dae_02 = new dae_0(16537);
        dae_02.D(((bwe_0)flk_22.getValue()).dLv());
        aaw_1.bUq().h(dae_02);
    }

    public static void copyBuild(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(17257);
        aaw_1.bUq().h(dae_02);
    }

    public static void clickOnEquipmentSlot(flp_2 flp_22, bgp_1 bgp_12) {
        ffV ffV2 = bgp_12.getItem();
        if (aPe.a(flp_22)) {
            aPe.a(bgp_12);
            return;
        }
        if (flp_22.gEk()) {
            dae_0 dae_02 = new dae_0(17135);
            fse_1.gFu().b("itemDetail", ffV2, "heroBuildDialog");
            fse_1.gFu().b("pet", ffV2 != null && ffV2.adO() ? new bjm_0(ffV2) : null, "heroBuildDialog");
            dae_02.D(bgp_12);
            aaw_1.bUq().h(dae_02);
        } else if (flp_22.gEm()) {
            if (ffV2 == null) {
                return;
            }
            cfa_1.bw(ffV2);
        }
        if (flp_22.gEk() && ffV2 != null) {
            if (aue_0.cVJ().c(cwl_1.eVl()) && cwl_1.eVx()) {
                cfp_1.a(flp_22, (Object)ffV2);
            } else if (cui_1.eQx()) {
                cex_1.selectItem(ffV2);
            }
        }
    }

    public static void unselectEquipmentSlot(flp_2 flp_22) {
        dae_0 dae_02 = new dae_0(17135);
        dae_02.D(null);
        aaw_1.bUq().h(dae_02);
    }

    public static void clickCategory(flp_2 flp_22, bwl bwl2) {
        dae_0 dae_02 = new dae_0(16113);
        dae_02.D(bwl2);
        aaw_1.bUq().h(dae_02);
    }

    public static void onDragItem(flu_1 flu_12) {
        ffV ffV2;
        if (flu_12.getValue() instanceof ffV) {
            ffV2 = (ffV)flu_12.getValue();
        } else if (flu_12.getValue() instanceof bgp_1) {
            ffV2 = ((bgp_1)flu_12.getValue()).getItem();
        } else {
            return;
        }
        cvu_2.eTO().onDragItem(ffV2);
    }

    public static void onDropOutItemFromInventory(fiq_1 fiq_12) {
        cvu_2.eTO().dLN();
    }

    public static void itemDroppedOnSlot(fla_2 fla_22, bgp_1 bgp_12) {
        cvu_2.eTO().dLN();
        Object object = fla_22.getValue();
        if (!(object instanceof ffV)) {
            return;
        }
        daj daj2 = new daj((ffV)object, bgp_12.dTQ());
        aaw_1.bUq().h(daj2);
    }

    public static void clickOnItem(flg_2 flg_22) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof ffV)) {
            return;
        }
        ffV ffV2 = (ffV)object;
        if (aPe.a(flg_22)) {
            aPe.a((ejl_0)ffV2);
        } else if (flg_22.gEm()) {
            cfa_1.bw(ffV2);
        }
        if (flg_22.gEk()) {
            fse_1.gFu().b("itemDetail", ffV2, "heroBuildDialog");
            bjm_0 bjm_02 = ffV2.adO() ? new bjm_0(ffV2) : null;
            fse_1.gFu().b("pet", bjm_02, "heroBuildDialog");
            if (bjm_02 != null) {
                cxx_1.b(bjm_02);
            }
            if (cui_1.eQx()) {
                cex_1.selectItem(ffV2);
            }
        }
    }

    public static void doubleClickOnItem(flg_2 flg_22) {
        if (!flg_22.gEk()) {
            return;
        }
        Object object = flg_22.getItemValue();
        if (!(object instanceof ffV)) {
            return;
        }
        ffV ffV2 = (ffV)object;
        if (flg_22.gDR()) {
            cfa_1.removeEquipmentFromAllBuilds(flg_22, ffV2);
            return;
        }
        if (ffV2.fWs() || ffV2.fWt()) {
            ctj_2.a(ffV2, (fcv_1)flg_22.gBD());
            return;
        }
        if (ffV2.bfd() > 1) {
            dae_0 dae_02 = new dae_0(16240);
            dae_02.D(ffV2);
            aaw_1.bUq().h(dae_02);
            return;
        }
        daj daj2 = new daj(ffV2, null);
        aaw_1.bUq().h(daj2);
    }

    public static void unequipItem(flp_2 flp_22, bgp_1 bgp_12) {
        if (flp_22.gDR()) {
            cfa_1.removeEquipmentFromAllBuilds(flp_22, bgp_12.getItem());
        } else if (flp_22.gEk()) {
            cfa_1.az(bgp_12);
        }
    }

    public static void itemDroppedInInventory(fla_2 fla_22) {
        cfa_1.az(fla_22.getValue());
        cvu_2.eTO().dLN();
    }

    public static void itemDroppedOutOfSlot(flc_2 flc_22) {
        cfa_1.az(flc_22.getValue());
        cvu_2.eTO().dLN();
    }

    private static void az(Object object) {
        if (!(object instanceof bgp_1)) {
            return;
        }
        bgp_1 bgp_12 = (bgp_1)object;
        if (bgp_12.getItem() == null) {
            return;
        }
        dae_0 dae_02 = new dae_0(17213);
        dae_02.D(bgp_12);
        aaw_1.bUq().h(dae_02);
    }

    public static void filterItemsByNameOnType(fiq_1 fiq_12, fdv_1 fdv_12) {
        String string = fdv_12.getText();
        if (string == null) {
            return;
        }
        mVt.a(0, () -> cfa_1.py(string));
    }

    public static void filterItemsByName(fiq_1 fiq_12, fdv_1 fdv_12) {
        String string = fdv_12.getText();
        if (string == null) {
            return;
        }
        mVt.LQ(0);
        cfa_1.py(string);
    }

    private static void py(String string) {
        dae_0 dae_02 = new dae_0(16562);
        dae_02.D(new bEn(BH.aT(string)));
        aaw_1.bUq().h(dae_02);
    }

    public static void removeItemsFilterByLevel(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(16562);
        dae_02.D(bww.dMu());
        aaw_1.bUq().h(dae_02);
    }

    public static void filterItemsByBuildLevel(fiq_1 fiq_12, String string) {
        dae_0 dae_02 = new dae_0(18567);
        dae_02.cC(string.equals(Boolean.TRUE.toString()));
        aaw_1.bUq().h(dae_02);
    }

    public static void toggleItemRarityFilter(flv_2 flv_22, bil_1 bil_12) {
        bil_12.setSelected(flv_22.bqr());
        dae_0 dae_02 = new dae_0(18183);
        dae_02.D(bil_12);
        aaw_1.bUq().h(dae_02);
    }

    public static void sortEquipmentsBy(fiq_1 fiq_12, String string) {
        Optional<fhw_0> optional = fhw_0.dh(string.toUpperCase());
        if (optional.isEmpty()) {
            return;
        }
        dae_0 dae_02 = new dae_0(17723);
        dae_02.D((Object)optional.get());
        aaw_1.bUq().h(dae_02);
    }

    public static void toggleSplitByEquipmentPosition(flv_2 flv_22, fdd_2 fdd_22) {
        dae_0 dae_02 = new dae_0(19181);
        dae_02.cC(fdd_22.getSelected());
        aaw_1.bUq().h(dae_02);
    }

    public static void toggleDisplayOtherHeroesItems(flv_2 flv_22, fdd_2 fdd_22) {
        dae_0 dae_02 = new dae_0(16523);
        dae_02.cC(fdd_22.getSelected());
        aaw_1.bUq().h(dae_02);
    }

    public static void changeActorDirection(flp_2 flp_22, fax_1 fax_12) {
        int n = flp_22.fca();
        if (n != 1 && n != 3) {
            return;
        }
        int n2 = n == 1 ? -1 : 1;
        cfa_1.b(fax_12, n2);
    }

    public static void changeActorDirectionOnScroll(flp_2 flp_22, fax_1 fax_12) {
        cfa_1.b(fax_12, flp_22.gEo());
    }

    private static void b(fax_1 fax_12, int n) {
        if (!bnv_1.kCu.egb()) {
            return;
        }
        if (bnv_1.kCu.egc()) {
            fax_12.setDirection(abi_1.dzk.wp());
            fax_12.setAnimName("AnimEmote-Vomis");
            return;
        }
        abi_1 abi_12 = abi_1.wG(fax_12.getDirection()).wI(n);
        fax_12.setDirection(abi_12.dzy);
    }

    public static void removeEquipmentFromAllBuilds(fiq_1 fiq_12, @Nullable ffV ffV2) {
        if (ffV2 == null) {
            return;
        }
        dae_0 dae_02 = new dae_0(19306);
        dae_02.D(ffV2);
        aaw_1.bUq().h(dae_02);
    }

    public static void togglePetFeedingDialog(fiq_1 fiq_12, ffV ffV2) {
        if (ffV2 == null || !ffV2.adO()) {
            return;
        }
        dae_0 dae_02 = new dae_0(18798);
        dae_02.D(new bjm_0(ffV2));
        aaw_1.bUq().h(dae_02);
    }

    public static void doubleClickOnSpell(flg_2 flg_22) {
        if (!flg_22.gEk()) {
            return;
        }
        bmx_0 bmx_02 = (bmx_0)flg_22.getItemValue();
        if (cvu_2.eTO().eUr().dmc() && bmx_02.bM(cvu_2.eUm())) {
            dae_0 dae_02 = new dae_0(18116);
            Optional<bmd_0> optional = cvu_2.eTO().l(bmx_02);
            if (optional.isEmpty()) {
                return;
            }
            dae_02.D(optional.get());
            aaw_1.bUq().h(dae_02);
        } else {
            dcA dcA2 = new dcA(bmx_02, null);
            aaw_1.bUq().h(dcA2);
        }
    }

    public static void spellDrop(fla_2 fla_22, bmd_0 bmd_02) {
        bmx_0 bmx_02;
        Object object = fla_22.getValue();
        if (object instanceof bmx_0) {
            bmx_02 = (bmx_0)object;
        } else if (object instanceof bmd_0) {
            bmx_02 = ((bmd_0)object).eeW();
        } else {
            return;
        }
        dcA dcA2 = new dcA(bmx_02, bmd_02);
        aaw_1.bUq().h(dcA2);
    }

    public static void spellDropOut(flc_2 flc_22) {
        cfa_1.aA(flc_22.getValue());
    }

    public static void spellDropOut(fla_2 fla_22) {
        cfa_1.aA(fla_22.getValue());
    }

    public static void spellRemove(flg_2 flg_22) {
        if (!flg_22.gEk()) {
            return;
        }
        cfa_1.aA(flg_22.getItemValue());
    }

    private static void aA(Object object) {
        bmd_0 bmd_02;
        if (!(object instanceof bmd_0) || (bmd_02 = (bmd_0)object).eeW() == null) {
            return;
        }
        dae_0 dae_02 = new dae_0(18116);
        dae_02.D(bmd_02);
        aaw_1.bUq().h(dae_02);
    }

    public static void onDeckKeyPress(fli_2 fli_22, fdv_1 fdv_12) {
        if (fli_22.bCC() != 10) {
            return;
        }
        String string = fdv_12.getText();
        dae_0 dae_02 = new dae_0(16556);
        dae_02.fa(string);
        aaw_1.bUq().h(dae_02);
    }

    public static void copyDeckKeyToClipboard(fiq_1 fiq_12, fdv_1 fdv_12) {
        bh_0.aI(fdv_12.getText());
    }

    public static void pasteKeyDeckAndApply(fiq_1 fiq_12, fdv_1 fdv_12) {
        Optional<String> optional = bh_0.aHy();
        if (optional.isEmpty()) {
            return;
        }
        String string = cfa_1.a(fdv_12, optional.get());
        if (string == null) {
            return;
        }
        fdv_12.setText(string);
        dae_0 dae_02 = new dae_0(16556);
        dae_02.fa(string);
        aaw_1.bUq().h(dae_02);
    }

    private static String a(@NotNull fdv_1 fdv_12, String string) {
        if (fdv_12.getText() == null) {
            return string;
        }
        Pattern pattern = Pattern.compile(fdv_12.getRestrict());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); ++i) {
            String string2 = Character.toString(string.charAt(i));
            if (!pattern.matcher(string2).matches()) continue;
            stringBuilder.append(string2);
        }
        if (stringBuilder.length() <= 0) {
            return null;
        }
        String string3 = stringBuilder.toString();
        int n = fdv_12.getMaxCharacters();
        if (string3.length() > n) {
            return string3.substring(0, n);
        }
        return string3;
    }

    public static void openCloseSpellDescription(flg_2 flg_22) {
        cgz_2.openCloseDescription(flg_22, "spellPopup");
    }

    public static void clickOnSpell(flg_2 flg_22) {
        bmx_0 bmx_02;
        if (!flg_22.gEk() && !flg_22.gEm()) {
            return;
        }
        if (flg_22.getItemValue() instanceof bmx_0) {
            bmx_02 = (bmx_0)flg_22.getItemValue();
        } else if (flg_22.getItemValue() instanceof bmd_0) {
            bmx_02 = ((bmd_0)flg_22.getItemValue()).eeW();
        } else if (flg_22.getItemValue() instanceof bmt_0) {
            bgt_0 bgt_02 = cvu_2.eUm() != null ? cvu_2.eUm() : aue_0.cVJ().cVK();
            bmx_02 = new bmx_0((bmt_0)flg_22.getItemValue(), 0, -1L, bgt_02);
        } else {
            return;
        }
        if (bmx_02 == null) {
            return;
        }
        short s = cvu_2.eUp();
        bmx_0 bmx_03 = bmx_02.ic(false);
        bmx_03.cj(s);
        if (flg_22.gEk()) {
            fse_1.gFu().b("editableDescribedSpell", bmx_03, "heroBuildDialog");
            fse_1.gFu().b("describedSpellRealLevel", s, "heroBuildDialog");
            cfa_1.eKp();
            fhv_1 fhv_12 = fyw_0.gqw().th("heroBuildDialog");
            fdd_2 fdd_22 = (fdd_2)fhv_12.getChildWithId(mVs);
            fdd_22.setSelected(false);
            return;
        }
        dcC dcC2 = new dcC();
        dcC2.g(bmx_03);
        dcC2.NQ(3);
        dcC2.fa("heroBuildDialog");
        dcC2.lK(18231);
        aaw_1.bUq().h(dcC2);
    }

    private static void eKp() {
        fhv_1 fhv_12 = fyw_0.gqw().th("heroBuildDialog");
        if (fhv_12 == null) {
            return;
        }
        cfa_1.a(fhv_12, "spellEffectScrollContainer");
        cfa_1.a(fhv_12, "spellRequirementsScrollContainer");
        cfa_1.a(fhv_12, "spellDescriptionScrollContainer");
    }

    private static void a(fhv_1 fhv_13, String string) {
        Optional.ofNullable(fhv_13.getElementRecursively(string, fhv_12 -> true)).map(object -> (fcq_2)object).ifPresent(fcq_22 -> fcq_22.fw(1.0f));
    }

    public static void showHideState(fiq_1 fiq_12, fes_2 fes_22, frx_1 frx_12, bmq_0 bmq_02) {
        cfa_1.showHideState(fiq_12, fes_22, frx_12, bmq_02, false);
    }

    public static void showHideState(fiq_1 fiq_12, fes_2 fes_22, frx_1 frx_12, bmq_0 bmq_02, boolean bl) {
        if (fiq_12.gBy() == fzq_0.tJU) {
            bmx_0 bmx_02;
            dbo dbo2 = new dbo();
            dbo2.b(bmq_02);
            if (fes_22.getElementMap() != null && (bmx_02 = (bmx_0)fse_1.gFu().aW("editableDescribedSpell", fes_22.getElementMap().getId())) != null) {
                dbo2.sY(((bmt_0)bmx_02.giP()).d());
            }
            if (bl) {
                dbo2.kW(true);
            }
            dbo2.fa(fes_22.getElementMap().getId());
            aaw_1.bUq().h(dbo2);
        } else {
            fse_1.gFu().f("describedState", bmq_02);
            fyd_0.popup(frx_12, fes_22);
            fes_22.a(fzq_0.tJY, new cfb_1(fes_22), true);
        }
    }

    public static void increaseAptitudeLevel(flp_2 flp_22, bes_2 bes_22) {
        cfa_1.a(flp_22, bes_22, true);
    }

    public static void decreaseAptitudeLevel(flp_2 flp_22, bes_2 bes_22) {
        cfa_1.a(flp_22, bes_22, false);
    }

    public static void setAptitudeLevel(fiq_1 fiq_12, bes_2 bes_22, fdv_1 fdv_12) {
        int n;
        if (fiq_12 instanceof fle_2 && ((fle_2)fiq_12).gDO()) {
            return;
        }
        short s = bes_22.cmL();
        try {
            n = fdv_12.getText().isBlank() ? 0 : Integer.parseInt(fdv_12.getText());
        }
        catch (NumberFormatException numberFormatException) {
            mVr.error((Object)("[Build] Cannot parse " + fdv_12.getText() + " into number"), (Throwable)numberFormatException);
            return;
        }
        dai_0 dai_02 = new dai_0(bes_22, n - s);
        aaw_1.bUq().h(dai_02);
    }

    private static void a(flp_2 flp_22, bes_2 bes_22, boolean bl) {
        dai_0 dai_02 = new dai_0(bes_22, cfa_1.b(flp_22, bes_22, bl));
        aaw_1.bUq().h(dai_02);
    }

    private static int b(flp_2 flp_22, bes_2 bes_22, boolean bl) {
        if (flp_22.gDR()) {
            return bl ? bes_22.bl(cvu_2.eUq()) : (int)(-bes_22.cmL());
        }
        if (flp_22.gDT()) {
            return bl ? 10 : -10;
        }
        return bl ? 1 : -1;
    }

    public static void overAptitude(flg_2 flg_22) {
        cfa_1.overAptitude(flg_22, (aef_2)flg_22.getItemValue());
    }

    public static void overAptitude(fiq_1 fiq_12, aef_2 aef_22) {
        fse_1.gFu().f("describedAptitude", aef_22);
    }

    public static void onAptitudeCodeUpdate(fli_2 fli_22, fdv_1 fdv_12) {
        if (fli_22.bCC() != 10) {
            return;
        }
        String string = fdv_12.getText();
        dae_0 dae_02 = new dae_0(16416);
        dae_02.fa(string);
        aaw_1.bUq().h(dae_02);
    }

    public static void copyAptitudeCodeToClipboard(fiq_1 fiq_12, fdv_1 fdv_12) {
        bh_0.aI(fdv_12.getText());
    }

    public static void pasteAptitudeCodeAndApply(fiq_1 fiq_12, fdv_1 fdv_12) {
        Optional<String> optional = bh_0.aHy();
        if (optional.isEmpty()) {
            return;
        }
        fdv_12.setText(ben_2.lt(optional.get()));
        dae_0 dae_02 = new dae_0(16416);
        dae_02.fa(optional.get());
        aaw_1.bUq().h(dae_02);
    }

    public static void resetCurrentAptitudeSheet(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(17851));
    }
}

