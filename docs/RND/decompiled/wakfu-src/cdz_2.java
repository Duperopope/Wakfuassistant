/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cDz
 */
@fyf_0
public class cdz_2 {
    public static final String PACKAGE = "wakfu.characterCreation";
    private static final int mTr = 6;
    private static final String mTs = "colorSelectionGroup";
    private static final String mTt = "characterAEV";
    private static final String mTu = "spellPopup";
    private static final String mTv = "characterPreview";
    private static final String mTw = "petPreview";
    private static boolean mTx = false;
    private static final ccf_2 mTy = new ccf_2(Duration.ofSeconds(5L));
    protected static final Logger mTz = Logger.getLogger(cdz_2.class);
    public static final int mTA = 0;
    public static final int mTB = 7;

    private cdz_2() {
    }

    public static void setCreateCharacterFlag(boolean bl) {
        mTx = bl;
    }

    public static void cancelCharacterCreation(fiq_1 fiq_12) {
        dae_0.cV((short)18465);
    }

    public static boolean validateCharacterCreationForm(fdv_1 fdv_12) {
        if (fdv_12 != null) {
            String string = fdv_12.getText();
            String string2 = eii_0.sb(string);
            if (!string2.equals(string)) {
                fdv_12.setText(string2);
            }
            return cdd_2.checkNameValidity(string2);
        }
        return false;
    }

    public static void stopCharacterNameTween(fiq_1 fiq_12) {
        csp_1.eOC().eOK();
    }

    public static void createCharacter(fiq_1 fiq_12, fdv_1 fdv_12, fdh_1 fdh_12) {
        if (csp_1.eOC().eOP()) {
            fdh_12.setSelectedTabIndex(1);
            return;
        }
        cdz_2.stopCharacterNameTween(fiq_12);
        if (fiq_12 == null || fiq_12.gBy() == fzq_0.tJU || fiq_12 instanceof fli_2 && ((fli_2)fiq_12).bCC() == 10) {
            if (cdz_2.validateCharacterCreationForm(fdv_12)) {
                if (!mTx) {
                    daq daq2 = new daq();
                    daq2.fa(fdv_12.getText());
                    daq2.lK(18401);
                    aaw_1.bUq().h(daq2);
                    mTx = true;
                }
            } else {
                mTz.info((Object)"Formulaire invalide");
                fse_1.gFu().f("characterCreation.enableNameChange", true);
            }
        }
        mTy.a(0, () -> csp_1.eOC().ePb());
    }

    public static void setCharacterSex(flp_2 flp_22) {
        fcu_1 fcu_12 = (fcu_1)flp_22.gBE();
        daq daq2 = new daq();
        daq2.ay(Byte.parseByte(fcu_12.getValue()));
        daq2.lK(16365);
        aaw_1.bUq().h(daq2);
    }

    public static void onMouseEnterPart(flp_2 flp_22, String string) {
        Optional<bjd_1> optional = bjd_1.lL(string);
        if (optional.isEmpty()) {
            return;
        }
        bhJ bhJ2 = csp_1.eOD();
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("characterCreationDialog");
        bjd_1 bjd_12 = optional.get();
        cdz_2.a(bjd_12, bhJ2, (fax_1)fhs_22.uH(mTt));
        cdz_2.eJY().forEach(fax_12 -> cdz_2.a(bjd_12, bhJ2, fax_12));
    }

    private static void a(bjd_1 bjd_12, bhJ bhJ2, fax_1 fax_12) {
        fst_2 fst_22 = new fst_2(new bjc_1(bjd_12.r(bhJ2)).dqY(), awx_2.dnI, awx_2.dnF, bjd_12.dqZ(), fax_12, 0, 150, abn.cdp, -1);
        fax_12.a(fst_22);
    }

    public static void onMouseExitPart(flp_2 flp_22, String string) {
        cdz_2.eJX();
    }

    private static void eJX() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("characterCreationDialog");
        fax_1 fax_12 = (fax_1)fhs_22.uH(mTt);
        cdz_2.b(fax_12);
        cdz_2.eJY().forEach(cdz_2::b);
    }

    private static void b(fax_1 fax_12) {
        for (fst_2 fst_22 : fax_12.getTweensOfType(fst_2.class)) {
            bjd_1.d(fst_22.dqZ()).ifPresent(bjd_12 -> {
                float[] fArray = new bjc_1(bjd_12.r(csp_1.eOD())).dqY();
                fst_22.ag(fArray);
            });
        }
        fax_12.x(fst_2.class);
    }

    @NotNull
    private static List<fax_1> eJY() {
        fax_1 fax_12;
        fey_2 fey_22 = (fey_2)fyw_0.gqw().th("cosmeticPresetsDialog");
        if (fey_22 == null) {
            return Collections.emptyList();
        }
        ArrayList<fax_1> arrayList = new ArrayList<fax_1>(2);
        fax_1 fax_13 = (fax_1)fey_22.getChildWithId(mTv);
        if (fax_13 != null) {
            arrayList.add(fax_13);
        }
        if ((fax_12 = (fax_1)fey_22.getChildWithId(mTw)) != null) {
            arrayList.add(fax_12);
        }
        return arrayList;
    }

    public static void onColorizablePartSelected(flv_2 flv_22) {
        if (!flv_22.bqr()) {
            return;
        }
        fcu_1 fcu_12 = (fcu_1)flv_22.gBE();
        String string = fcu_12.getValue();
        cdz_2.pq(string);
        Optional<bjd_1> optional = bjd_1.lL(string);
        if (optional.isEmpty()) {
            return;
        }
        int n = optional.get().r(csp_1.eOD());
        csp_1.Mv(n);
    }

    private static void pq(String string) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("characterCreationDialog");
        fry_1 fry_12 = (fry_1)fhs_22.uH(mTs);
        fry_12.setValue(string);
        Optional<bjd_1> optional = bjd_1.lL(string);
        if (optional.isEmpty()) {
            return;
        }
        String string2 = optional.get().t(csp_1.eOD());
        fse_1.gFu().f("characterCreation.colorizablePartDescription", string2.toUpperCase());
    }

    public static void onColorPicked(flz_2 flz_22) {
        axb_2 axb_22 = (axb_2)flz_22.getValue();
        String string = cdz_2.getColorizablePartName();
        dae_0 dae_02 = new dae_0(18364);
        dae_02.sY(axb_22.bPU());
        dae_02.fa(string);
        aaw_1.bUq().h(dae_02);
    }

    public static void onColorType(fli_2 fli_22, fdu_1 fdu_12) {
        cdz_2.onColorType(fli_22, fdu_12, cdz_2.getColorizablePartName());
    }

    public static void onColorType(fli_2 fli_22, fdu_1 fdu_12, String string) {
        awx_2 awx_22;
        String string2 = fdu_12.getText();
        if (string2.length() < 6) {
            return;
        }
        try {
            awx_22 = awx_2.gD(string2);
        }
        catch (RuntimeException runtimeException) {
            mTz.error((Object)("Error when creating color from hex " + string2), (Throwable)runtimeException);
            return;
        }
        fse_1.gFu().f("characterCreation.colorPickerValue", awx_22);
        fse_1.gFu().f("characterCreation.colorPickerHexValue", awx_22.bQk().toUpperCase());
        dae_0 dae_02 = new dae_0(18364);
        dae_02.sY(awx_22.bPU());
        dae_02.fa(string);
        aaw_1.bUq().h(dae_02);
    }

    public static void cancelColor(fiq_1 fiq_12, String string) {
        cdz_2.eJX();
        dae_0 dae_02 = new dae_0(16913);
        dae_02.fa(string);
        aaw_1.bUq().h(dae_02);
    }

    public static void cancelColor(fiq_1 fiq_12) {
        String string = "";
        dae_0 dae_02 = new dae_0(16913);
        if (fyw_0.gqw().to("characterCreationDialog")) {
            fry_1 fry_12 = (fry_1)fyw_0.gqw().th("characterCreationDialog").getChildWithId(mTs);
            string = fry_12.getValue();
        }
        cdz_2.eJX();
        dae_02.fa(string);
        aaw_1.bUq().h(dae_02);
    }

    public static void cancelAllColors(fiq_1 fiq_12) {
        cdz_2.eJX();
        aaw_1.bUq().h(new dae_0(16216));
    }

    public static void randomColor(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(19253);
        dae_02.fa(cdz_2.getColorizablePartName());
        aaw_1.bUq().h(dae_02);
    }

    public static String getColorizablePartName() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("characterCreationDialog");
        fry_1 fry_12 = (fry_1)fhs_22.uH(mTs);
        return fry_12.getValue();
    }

    public static void setRandomCharacterName(fiq_1 fiq_12, fdv_1 fdv_12) {
        bhJ bhJ2 = (bhJ)fse_1.gFu().vY("characterCreation.editablePlayerInfo");
        bhJ2.setName(bjz_2.dsb().dsa());
        fdv_12.setText(bhJ2.getName());
        csp_1.eOC().eOK();
    }

    public static void changeDirectionClockWise(flp_2 flp_22, fax_1 fax_12) {
        if (!flp_22.gEk()) {
            return;
        }
        if (csp_1.eOC().eOX()) {
            return;
        }
        int n = fax_12.getDirection() + 1 > 7 ? 0 : fax_12.getDirection() + 1;
        fax_12.setAnimName("AnimStatique");
        fax_12.setDirection(n);
        bhJ bhJ2 = (bhJ)fse_1.gFu().vY("characterCreation.editablePlayerInfo");
        bhJ2.a(abi_1.wG(n));
    }

    public static void changeDirectionCounterClockwise(flp_2 flp_22, fax_1 fax_12) {
        if (!flp_22.gEk()) {
            return;
        }
        if (csp_1.eOC().eOX()) {
            return;
        }
        int n = fax_12.getDirection() - 1 < 0 ? 7 : fax_12.getDirection() - 1;
        fax_12.setAnimName("AnimStatique");
        fax_12.setDirection(n);
        bhJ bhJ2 = (bhJ)fse_1.gFu().vY("characterCreation.editablePlayerInfo");
        bhJ2.a(abi_1.wG(n));
    }

    public static void selectBreed(flg_2 flg_22) {
        cdz_2.pq(bjd_1.inc.getName());
        das das2 = new das();
        das2.lK(16424);
        das2.a((bgx_0)flg_22.getItemValue());
        aaw_1.bUq().h(das2);
    }

    public static void selectRole(flg_2 flg_22) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(17879);
        dae_02.sY(((bfx_2)flg_22.getItemValue()).d());
        aaw_1.bUq().h(dae_02);
    }

    public static void overBreed(flg_2 flg_22) {
        fse_1.gFu().f("characterCreation.breedOver", flg_22.getItemValue());
        bhJ bhJ2 = (bhJ)fse_1.gFu().vY("characterCreation.editablePlayerInfo");
        fse_1.gFu().a((aef_2)bhJ2, "breedChartValues");
    }

    public static void outBreed(flg_2 flg_22) {
        fse_1.gFu().f("characterCreation.breedOver", (Object)null);
        bhJ bhJ2 = (bhJ)fse_1.gFu().vY("characterCreation.editablePlayerInfo");
        fse_1.gFu().a((aef_2)bhJ2, "breedChartValues");
    }

    public static void setNextHairStyle(fiq_1 fiq_12) {
        dae_0.cV((short)18420);
    }

    public static void setPreviousHairStyle(fiq_1 fiq_12) {
        dae_0.cV((short)19560);
    }

    public static void setNextDressStyle(fiq_1 fiq_12) {
        dae_0.cV((short)17282);
    }

    public static void setPreviousDressStyle(fiq_1 fiq_12) {
        dae_0.cV((short)19188);
    }

    public static void clickOnSpell(flg_2 flg_22) {
        bmt_0 bmt_02 = (bmt_0)flg_22.getItemValue();
        bmx_0 bmx_02 = new bmx_0(bmt_02, 0, -1L, csp_1.eOD());
        cyk_1.eXO().a(bmx_02, "characterCreationDialog", true);
    }

    public static void openCloseSpellDescription(flg_2 flg_22) {
        bmt_0 bmt_02 = (bmt_0)flg_22.getItemValue();
        fes_2 fes_22 = (fes_2)flg_22.gBE();
        fzq_0 fzq_02 = flg_22.gBy();
        bmx_0 bmx_02 = null;
        if (bmt_02 != null) {
            bmx_02 = new bmx_0(bmt_02, 1, -1L, csp_1.eOD());
        }
        fse_1.gFu().f("describedSpell", bmx_02);
        frx_1 frx_12 = (frx_1)fes_22.getElementMap().uH(mTu);
        if (fzq_02 == fzq_0.tJE && !fbj_1.getInstance().isDragging()) {
            fyd_0.popup(frx_12, fes_22);
        } else if (fzq_02 == fzq_0.tJD || fzq_02 == fzq_0.tJC) {
            fse_1.gFu().f("describedSpell", (Object)null);
            fse_1.gFu().f("describedSpellRealLevel", (short)-1);
            fyd_0.closePopup(new fiq_1(), frx_12);
        }
    }

    public static void showHideState(fiq_1 fiq_12, fes_2 fes_22, frx_1 frx_12, bmq_0 bmq_02) {
        cfa_1.showHideState(fiq_12, fes_22, frx_12, bmq_02, true);
    }

    public static void openColorPicker(fiq_1 fiq_12) {
        if (fyw_0.gqw().to("characterCreationColorPickerDialog")) {
            return;
        }
        ccj_2.pd("characterCreationColorPickerDialog");
    }

    public static void selectHairStyle(flg_2 flg_22) {
        dae_0.b((short)18826, flg_22.getItemValue());
    }

    public static void selectCostumeStyle(flg_2 flg_22) {
        dae_0.b((short)19111, flg_22.getItemValue());
    }

    public static void setRandomCharacterColors(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dar(true, true));
    }

    public static void setRandomHeadStyle(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dar(true, false));
    }

    public static void setRandomDressStyle(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dar(false, true));
    }

    public static void scrollUp(fiq_1 fiq_12, fcq_2 fcq_22) {
        fcq_22.setVerticalScrollBarPosition(1.0f);
    }

    public static void onTabChanged(flv_2 flv_22) {
        if (!flv_22.bqr()) {
            return;
        }
        int n = ((fdh_1)flv_22.gBD()).getSelectedTabIndex();
        if (n == -1) {
            return;
        }
        csp_1.eOC().eOO();
    }

    public static void openCosmeticPresets(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(ctb_2.eQr())) {
            aue_0.cVJ().b(ctb_2.eQr());
        } else {
            csp_1.eOC().v(() -> bmh.dvr().dvu());
            ctb_2.eQr().setReadOnly(true);
            ctb_2.eQr().aE(csp_1.eOD());
            aue_0.cVJ().a(ctb_2.eQr());
        }
    }
}

