/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from cEe
 */
@fyf_0
public class cee_2 {
    private static final Logger mUt = Logger.getLogger(cee_2.class);
    public static final String PACKAGE = "wakfu.cosmeticPresets";
    private static final ccf_2 mUu = new ccf_2();

    public static void changeCharacter(fiq_1 fiq_12, bgt_0 bgt_02) {
        dae_0 dae_02 = new dae_0(16567);
        dae_02.gj(bgt_02.Sn());
        aaw_1.bUq().h(dae_02);
    }

    public static void openPresetCreationDialog(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(18823));
    }

    public static void openPresetEditionDialog(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(19348));
    }

    public static void openPresetCopyDialog(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(16985));
    }

    public static void deleteCurrentPreset(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(16371));
    }

    public static void validatePresetName(fiq_1 fiq_12, fdv_1 fdv_12, blU blU2) {
        fyw_0.gqw().tl("cosmeticPresetEditionDialog");
        dae_0 dae_02 = new dae_0(blU2.duT());
        dae_02.fa(fdv_12.getText().trim());
        dae_02.D(blU2.duU());
        aaw_1.bUq().h(dae_02);
    }

    public static void selectPresetForDisplay(flg_2 flg_22) {
        if (!(flg_22.getItemValue() instanceof blZ)) {
            return;
        }
        dae_0 dae_02 = new dae_0(16809);
        dae_02.D(flg_22.getItemValue());
        aaw_1.bUq().h(dae_02);
    }

    public static void activateCurrentPreset(fiq_1 fiq_12, bmk bmk2) {
        bmk2.dvO();
        cee_2.LT(bmk2.d());
    }

    public static void activatePreset(fiq_1 fiq_12, blZ blZ2) {
        cee_2.LT(blZ2.BJ());
    }

    private static void LT(int n) {
        dae_0 dae_02 = new dae_0(19113);
        dae_02.sY(n);
        aaw_1.bUq().h(dae_02);
    }

    public static void filterPresets(fiq_1 fiq_12, fdv_1 fdv_12) {
        dae_0 dae_02 = new dae_0(18435);
        dae_02.fa(fdv_12.getText());
        aaw_1.bUq().h(dae_02);
    }

    public static void dropPreset(fla_2 fla_22) {
        if (!(fla_22.gDy() instanceof blZ)) {
            return;
        }
        if (!(fla_22.gDJ() instanceof blZ)) {
            return;
        }
        int n = fla_22.gDK();
        daH daH2 = new daH(n, (blZ)fla_22.gDJ());
        aaw_1.bUq().h(daH2);
    }

    public static void toggleHatForCurrentPreset(flv_2 flv_22) {
        dae_0 dae_02 = new dae_0(19311);
        dae_02.cC(flv_22.bqr());
        aaw_1.bUq().h(dae_02);
    }

    public static void randomizeCurrentPreset(fiq_1 fiq_12) {
        dae_0.cV((short)18040);
    }

    public static void copyPresetCodeToClipboard(fiq_1 fiq_12, bmk bmk2) {
        bh_0.aI(blT.a(bmk2.dvM()));
    }

    public static void pastePresetCodeAndApply(fiq_1 fiq_12) {
        Optional<String> optional = bh_0.aHy();
        if (optional.isEmpty()) {
            return;
        }
        dae_0 dae_02 = new dae_0(17837);
        dae_02.fa(optional.get());
        aaw_1.bUq().h(dae_02);
    }

    public static void selectIconInEditDialog(flg_2 flg_22, blU blU2) {
        if (!(flg_22.getItemValue() instanceof blW)) {
            return;
        }
        blW blW2 = (blW)flg_22.getItemValue();
        if (blU2.duU() == null || blU2.duU().duW() != blW2.duW()) {
            blU2.a(blW2);
        } else {
            blU2.a(null);
        }
    }

    public static void presetNamePopup(fiq_1 fiq_12, frx_1 frx_12, blZ blZ2) {
        fse_1.gFu().f("hoveredPresetName", blZ2.getName());
        fyd_0.popup(fiq_12, frx_12, (fes_2)fiq_12.gBE());
    }

    public static void togglePresetsListReduction(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(17045));
    }

    public static void changeActorDirectionOnClick(flp_2 flp_22, fax_1 fax_12) {
        if (flp_22.gEk()) {
            cee_2.a(fax_12, -1);
        } else if (flp_22.gEm()) {
            cee_2.a(fax_12, 1);
        }
    }

    public static void changeActorDirectionOnScroll(flp_2 flp_22, fax_1 fax_12) {
        cee_2.a(fax_12, flp_22.gEo());
    }

    public static void turnActorClockwise(fiq_1 fiq_12, fax_1 fax_12) {
        cee_2.a(fax_12, 1);
    }

    public static void turnActorCounterClockwise(fiq_1 fiq_12, fax_1 fax_12) {
        cee_2.a(fax_12, -1);
    }

    private static void a(fax_1 fax_12, int n) {
        if (!bnv_1.kCu.egb()) {
            return;
        }
        if (bnv_1.kCu.egc()) {
            dae_0 dae_02 = new dae_0(17244);
            dae_02.D(abi_1.dzk);
            aaw_1.bUq().h(dae_02);
            fax_12.setAnimName("AnimEmote-Vomis");
            return;
        }
        dae_0 dae_03 = new dae_0(17244);
        dae_03.sY(n);
        aaw_1.bUq().h(dae_03);
    }

    public static void cyclePreviewAnimation(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(18149));
    }

    public static void toggleDisplayEquipments(flv_2 flv_22) {
        dae_0 dae_02 = new dae_0(19893);
        dae_02.cC(flv_22.bqr());
        aaw_1.bUq().h(dae_02);
    }

    public static void togglePreviewPet(flv_2 flv_22) {
        dae_0 dae_02 = new dae_0(18211);
        dae_02.cC(flv_22.bqr());
        aaw_1.bUq().h(dae_02);
    }

    public static void togglePreviewMount(flv_2 flv_22) {
        dae_0 dae_02 = new dae_0(17630);
        dae_02.cC(flv_22.bqr());
        aaw_1.bUq().h(dae_02);
    }

    public static void togglePreviewAura(flv_2 flv_22) {
        dae_0 dae_02 = new dae_0(18342);
        dae_02.cC(flv_22.bqr());
        aaw_1.bUq().h(dae_02);
    }

    public static void clickOnCosmeticSlot(flg_2 flg_22) {
        if (!(flg_22.getItemValue() instanceof bmi)) {
            return;
        }
        bmi bmi2 = (bmi)flg_22.getItemValue();
        if (aPe.a(flg_22) && bmi2.aaz() && bmi2.duf() != fm_1.pA) {
            aPe.a(bmi2);
            return;
        }
        dae_0 dae_02 = new dae_0(17427);
        dae_02.D(bmi2);
        aaw_1.bUq().h(dae_02);
    }

    public static void doubleClickOnCosmeticItem(flg_2 flg_22, bmk bmk2) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof blP)) {
            return;
        }
        blP blP2 = (blP)object;
        if (!bmk2.dvL()) {
            object = new dae_0(18203);
            ((ama_1)object).D(blP2);
            aaw_1.bUq().h((aam_2)object);
        } else if (bmk2.r(blP2.duf()).DW(blP2.dut())) {
            object = new dae_0(19840);
            ((ama_1)object).D(blP2);
            aaw_1.bUq().h((aam_2)object);
        } else {
            object = new dae_0(18022);
            ((ama_1)object).D(blP2);
            aaw_1.bUq().h((aam_2)object);
        }
    }

    public static void addCosmeticToPreset(fla_2 fla_22) {
        if (fla_22.getValue() instanceof blP) {
            dae_0 dae_02 = new dae_0(18022);
            dae_02.D(fla_22.getValue());
            aaw_1.bUq().h(dae_02);
        } else if (fla_22.getValue() instanceof bmi) {
            dae_0 dae_03 = new dae_0(19840);
            dae_03.D(fla_22.getValue());
            aaw_1.bUq().h(dae_03);
        }
        cee_2.eKd();
    }

    public static void removeCosmeticFromPreset(flg_2 flg_22) {
        if (!(flg_22.getItemValue() instanceof bmi)) {
            return;
        }
        dae_0 dae_02 = new dae_0(19840);
        dae_02.D(flg_22.getItemValue());
        aaw_1.bUq().h(dae_02);
    }

    public static void removeCosmeticFromPreset(flc_2 flc_22) {
        if (!(flc_22.getValue() instanceof bmi)) {
            return;
        }
        dae_0 dae_02 = new dae_0(19840);
        dae_02.D(flc_22.getValue());
        aaw_1.bUq().h(dae_02);
    }

    public static boolean selectSlotForIcon(fiq_1 fiq_12, bmi bmi2) {
        if (bmi2.dvG() == null) {
            return true;
        }
        dae_0 dae_02 = new dae_0(19572);
        dae_02.D(bmi2);
        aaw_1.bUq().h(dae_02);
        return true;
    }

    public static void filterCosmeticsByName(fiq_1 fiq_12, fdv_1 fdv_12) {
        mUu.a(0, () -> cee_2.filterCosmeticsByNameInstant(fiq_12, fdv_12));
    }

    public static void filterCosmeticsByNameInstant(fiq_1 fiq_12, fdv_1 fdv_12) {
        dae_0 dae_02 = new dae_0(18402);
        dae_02.fa(fdv_12.getText());
        aaw_1.bUq().h(dae_02);
    }

    public static void sortCosmeticsBy(flv_2 flv_22, String string) {
        if (!flv_22.bqr()) {
            return;
        }
        blQ blQ2 = blQ.lX(string);
        if (blQ2 == null) {
            return;
        }
        dae_0 dae_02 = new dae_0(16625);
        dae_02.D((Object)blQ2);
        aaw_1.bUq().h(dae_02);
    }

    public static void toggleCategoryCollapse(fiq_1 fiq_12, bln_0 bln_02) {
        dae_0 dae_02 = new dae_0(16199);
        dae_02.D(bln_02);
        aaw_1.bUq().h(dae_02);
    }

    public static void uncollapseAllCategories(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(19575);
        dae_02.cC(false);
        aaw_1.bUq().h(dae_02);
    }

    public static void collapseAllCategories(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(19575);
        dae_02.cC(true);
        aaw_1.bUq().h(dae_02);
    }

    public static void clickOnCosmeticItem(flg_2 flg_22) {
        if (!(flg_22.getItemValue() instanceof blP)) {
            return;
        }
        if (aPe.a(flg_22)) {
            aPe.ag(flg_22.getItemValue());
            return;
        }
        dae_0 dae_02 = new dae_0(19828);
        dae_02.D(flg_22.getItemValue());
        aaw_1.bUq().h(dae_02);
    }

    public static void showItemPopup(flg_2 flg_22, frx_1 frx_12) {
        if (flg_22.getItemValue() instanceof bmi && ((bmi)flg_22.getItemValue()).duf() == fm_1.pA) {
            bmi bmi2 = (bmi)flg_22.getItemValue();
            if (!bmi2.aaz()) {
                return;
            }
            int n = bmi2.dvH();
            if (!bmj.DZ(n)) {
                return;
            }
            aei_2 aei_22 = new aei_2("name", bmj.DX(n));
            fse_1.gFu().f("itemPopupDetail", aei_22);
            fyd_0.popup((fiq_1)flg_22, frx_12, (fes_2)flg_22.gBE());
        } else {
            cdd_2.showItemPopup(flg_22, frx_12);
        }
    }

    public static void onDropOnCosmeticItem(fla_2 fla_22) {
        if (fla_22.getValue() instanceof bmi) {
            dae_0 dae_02 = new dae_0(19840);
            dae_02.D(fla_22.getValue());
            aaw_1.bUq().h(dae_02);
        }
    }

    public static void onItemDrag(flu_1 flu_12) {
        Object object = flu_12.getValue();
        if (!(object instanceof blP)) {
            return;
        }
        blP blP2 = (blP)object;
        bmh.dvr().j(blP2);
        if (aue_0.cVJ().c(ctd_2.eQA())) {
            ctd_2.eQA().v(blP2.duf());
        }
    }

    public static void onItemDragStop(fiq_1 fiq_12) {
        cee_2.eKd();
    }

    private static void eKd() {
        bmh.dvr().dvE();
        if (aue_0.cVJ().c(ctd_2.eQA())) {
            ctd_2.eQA().dvW();
        }
    }

    public static void markCosmeticAsNotNew(flg_2 flg_22) {
        if (!(flg_22.getItemValue() instanceof blP)) {
            return;
        }
        dae_0 dae_02 = new dae_0(18422);
        dae_02.D(flg_22.getItemValue());
        aaw_1.bUq().h(dae_02);
    }

    public static void togglePetColorationDialog(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(19019));
    }

    public static void changePetColor(flg_2 flg_22) {
        if (!(flg_22.getItemValue() instanceof ffV)) {
            return;
        }
        daI daI2 = daI.c(fm_1.pv, ((ffV)flg_22.getItemValue()).avr());
        aaw_1.bUq().h(daI2);
    }

    public static void noAccessoryPopup(flg_2 flg_22, frx_1 frx_12) {
        fyd_0.popup((fiq_1)flg_22, frx_12, (fes_2)flg_22.gBE());
    }

    public static void changePetAccessory(flg_2 flg_22) {
        if (!(flg_22.getItemValue() instanceof ffV)) {
            return;
        }
        daI daI2 = daI.d(fm_1.pv, ((ffV)flg_22.getItemValue()).avr());
        aaw_1.bUq().h(daI2);
    }

    public static void removePetAccessory(fiq_1 fiq_12) {
        daI daI2 = daI.y(fm_1.pv);
        aaw_1.bUq().h(daI2);
    }

    public static void setAuraDisplayStyle(flv_2 flv_22, String string) {
        if (!flv_22.bqr()) {
            return;
        }
        bsc_1 bsc_12 = bsc_1.valueOf(string);
        vt_0.b(() -> {
            bsn_1 bsn_12 = bsn_1.lkp;
            ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_12, bsc_12.d());
            aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), bsn_12.getKey());
            bgg_0.dlO().m((TObjectProcedure<bgy>)((TObjectProcedure)bgy2 -> {
                if (bgy2.djT() || bgy2.doP()) {
                    return true;
                }
                bgy2.dlk();
                return true;
            }));
        });
    }

    public static void setTitleColorDisplayStyle(flv_2 flv_22, String string) {
        if (!flv_22.bqr()) {
            return;
        }
        bse_1 bse_12 = bse_1.valueOf(string);
        vt_0.b(() -> {
            bsn_1 bsn_12 = bsn_1.lkq;
            ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_12, bse_12.d());
            aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), bsn_12.getKey());
        });
    }
}

