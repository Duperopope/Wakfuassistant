/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cDy
 */
@fyf_0
public class cdy_2 {
    public static final String PACKAGE = "wakfu.characterChoice";
    public static final int mTo = 8;
    public static final int mTp = 9;
    protected static final Logger mTq = Logger.getLogger(cdy_2.class);

    public static void selectCharacter(flg_2 flg_22) {
        if (flg_22.gBE() instanceof fad_1) {
            return;
        }
        biz_1 biz_12 = (biz_1)flg_22.getItemValue();
        bhJ bhJ2 = (bhJ)biz_12.dcP();
        if (bhJ2.equals(bgr_0.dmo().dmq())) {
            return;
        }
        daq daq2 = new daq();
        daq2.aG(bhJ2);
        daq2.lK(16166);
        aaw_1.bUq().h(daq2);
    }

    public static void deleteCharacter(fiq_1 fiq_12, bhJ bhJ2) {
        if (cdy_2.eJS()) {
            cdy_2.eJT();
            return;
        }
        daq daq2 = new daq();
        daq2.aG(bhJ2);
        daq2.lK(19805);
        aaw_1.bUq().h(daq2);
    }

    public static void createNewCharacter(fiq_1 fiq_12) {
        if (cdy_2.eJS()) {
            cdy_2.eJT();
            return;
        }
        if (cdy_2.eJU()) {
            cdy_2.eJV();
            return;
        }
        dae_0.cV((short)19830);
    }

    public static void enterWorld(fiq_1 fiq_12, bhJ bhJ2) {
        boolean bl;
        Object object;
        if (bhJ2 == null) {
            return;
        }
        if (fiq_12 instanceof fli_2) {
            object = (fli_2)fiq_12;
            switch (((fli_2)object).bCC()) {
                case 10: {
                    break;
                }
                default: {
                    return;
                }
            }
        }
        boolean bl2 = bl = !evm_2.c((int[])(object = (Object)aue_0.cVJ().cVO().cWq()), evm_2.osZ);
        if (ewo_0.oBF.k(ewr_0.oCt) && !bl) {
            cdy_2.displayMailPopup(bhJ2);
        } else {
            daq daq2 = new daq();
            daq2.aG(bhJ2);
            daq2.lK(17105);
            aaw_1.bUq().h(daq2);
        }
    }

    public static void enterWorldDoubleClick(fiq_1 fiq_12, bhJ bhJ2) {
        boolean bl;
        if (bhJ2 == null) {
            return;
        }
        int[] nArray = aue_0.cVJ().cVO().cWq();
        boolean bl2 = bl = !evm_2.c(nArray, evm_2.osZ);
        if (ewo_0.oBF.k(ewr_0.oCt) && !bl) {
            cdy_2.displayMailPopup(bhJ2);
        } else {
            daq daq2 = new daq();
            daq2.aG(bhJ2);
            daq2.lK(17105);
            aaw_1.bUq().h(daq2);
        }
    }

    public static void displayMailPopup(bhJ bhJ2) {
        daq daq2 = new daq();
        daq2.aG(bhJ2);
        daq2.lK(18847);
        aaw_1.bUq().h(daq2);
    }

    public static void cancelCharacterChoice(fiq_1 fiq_12) {
        czc_1.b("characterChoiceDialog", () -> {
            csm_1.eOv().eOw();
            aue_0.cVJ().ets();
        });
    }

    public static void onMouseOverDeletionButton(fiq_1 fiq_12, bhJ bhJ2, fax_1 fax_12, frx_1 frx_12) {
        if (bhJ2 != null) {
            fax_12.setAnimName("AnimEmote-Defaite");
            fyd_0.popup(fiq_12, frx_12);
        }
    }

    public static void onMouseOutDeletionButton(fiq_1 fiq_12, bhJ bhJ2, fax_1 fax_12, frx_1 frx_12) {
        if (bhJ2 != null) {
            fax_12.setAnimName(bhJ2.ddI().bpT());
            fyd_0.closePopup(fiq_12, frx_12);
        }
    }

    public static void onMouseOverCharacter(fiq_1 fiq_12, bhJ bhJ2, fax_1 fax_12) {
        if (bhJ2 != fse_1.gFu().vY("characterChoice.selectedCharacter")) {
            fax_12.setAnimName("AnimEmote-Coucou");
        }
    }

    public static void onMouseOutCharacter(fiq_1 fiq_12, bhJ bhJ2, fax_1 fax_12) {
        if (bhJ2 != fse_1.gFu().vY("characterChoice.selectedCharacter")) {
            fax_12.setAnimName(bhJ2.ddI().bpT());
        }
    }

    public static void onMouseOverAnimNewCharacter(fiq_1 fiq_12, fax_1 fax_12) {
    }

    public static void onMouseOutAnimNewCharacter(fiq_1 fiq_12, fax_1 fax_12) {
    }

    public static void validRename(fiq_1 fiq_12, fdv_1 fdv_12) {
        String string = fdv_12.getText();
        bgy bgy2 = (bgy)fse_1.gFu().vY("characterChoice.selectedCharacter");
        if (fiq_12 == null || fiq_12.gBy() == fzq_0.tJU || fiq_12 instanceof fli_2 && ((fli_2)fiq_12).bCC() == 10) {
            string = eii_0.sb(fdv_12.getText());
            if (cdz_2.validateCharacterCreationForm(fdv_12)) {
                long l = bgy2.Sn();
                mTq.info((Object)("Demande de renommage du personnage characterId=" + l + " en " + string));
                long l2 = fse_1.gFu().getProperty("renameCharater.availableId").bGK();
                String string2 = fse_1.gFu().du("renameCharater.availableUid");
                cyh_0 cyh_02 = new cyh_0();
                cyh_02.db(l);
                cyh_02.dm(string);
                cyh_02.nK(l2);
                cyh_02.oD(string2);
                aue_0.cVJ().etu().d(cyh_02);
                aaw_1.bUq().h(new dae_0(18940));
            } else {
                mTq.info((Object)"Formulaire invalide");
            }
        } else if (fiq_12 instanceof fli_2) {
            fse_1.gFu().f("renameCharacter.dirty", !string.equals(bgy2.getName()));
        }
    }

    public static void buySlot(fiq_1 fiq_12, bpt_1<?, ?> bpt_12) {
        cyr_2.eYA().h(bpt_12);
    }

    private static boolean eJS() {
        return auc_0.cVq().b("disableCharacterManagement", false);
    }

    private static void eJT() {
        fiq_2.gCw().d(fik_2.gBZ().a(fin_2.uCx).l("error.disabled.character.management", new Object[0]).abQ(1));
    }

    private static boolean eJU() {
        return bgr_0.dmo().dmr() >= 150;
    }

    private static void eJV() {
        fiq_2.gCw().d(fik_2.gBZ().a(fin_2.uCx).l("error.account.too.many.characters", new Object[0]).abQ(1));
    }

    public static void openRenameDialog(fiq_1 fiq_12, bhJ bhJ2) {
        if (!bhJ2.dpW()) {
            return;
        }
        bgr_0.dmo().aB(bhJ2);
        csm_1.eOv().a(bhJ2.Sn(), 0L, "", false);
    }

    public static void moveCharacterUp(flp_2 flp_22, bhJ bhJ2) {
        if (csm_1.eOv().eOA()) {
            return;
        }
        dae_0 dae_02 = new dae_0(19447);
        dae_02.D(bhJ2);
        aaw_1.bUq().h(dae_02);
    }

    public static void moveCharacterDown(flp_2 flp_22, bhJ bhJ2) {
        if (csm_1.eOv().eOA()) {
            return;
        }
        dae_0 dae_02 = new dae_0(16345);
        dae_02.D(bhJ2);
        aaw_1.bUq().h(dae_02);
    }

    public static void showCharacterOption(flp_2 flp_22, biy_0 biy_02) {
        biy_02.gk(true);
        fse_1.gFu().a((aef_2)biy_02, "hovered");
    }

    public static void hideCharacterOption(flp_2 flp_22, biy_0 biy_02) {
        biy_02.gk(false);
        fse_1.gFu().a((aef_2)biy_02, "hovered");
    }

    public static void setNextTileSize(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(17532);
        bib_0 bib_02 = bib_0.ilf;
        bic_0 bic_02 = bib_02.dqr().dqs();
        if (bib_02.dqm().size() > 9 && bic_02 == bic_0.ilu) {
            bic_02 = bic_02.dqs();
        }
        dae_02.D((Object)bic_02);
        fdf_1 fdf_12 = (fdf_1)((fhv_1)fiq_12.gBE()).getElementMap().uH("characterList");
        for (fes_2 fes_22 : fdf_12.getWidgetChildren()) {
            fes_22.setUsePositionTween(true);
        }
        aaw_1.bUq().h(dae_02);
    }

    public static void onDrag(flu_1 flu_12) {
        fbd_1 fbd_12 = flu_12.getDragNDropable();
        fcv_1 fcv_12 = fbd_12.getParentOfType(fcv_1.class);
        fes_2 fes_22 = (fes_2)fbd_12.getElementMap().uH("separator");
        fhn_1.gzT().a(fzo_0.tHW, true);
        fes_22.setVisible(false);
        fcv_12.setExpandable(false);
        fdf_1 fdf_12 = fcv_12.getParentOfType(fdf_1.class);
        for (fes_2 fes_23 : fdf_12.getWidgetChildren()) {
            fes_23.setUsePositionTween(true);
        }
        fbd_12.setVisible(false);
    }

    public static void onDragOver(fly_1 fly_12) {
        fes_2 fes_22 = (fes_2)fly_12.gDE().getElementMap().uH("separator");
        fes_22.setPrefSize(new fsm_1(1.0f, fly_12.gDA().getHeight() + 16));
    }

    public static void onDragOut(flw_1 flw_12) {
        fes_2 fes_22 = (fes_2)flw_12.gDB().getElementMap().uH("separator");
        fes_22.setPrefSize(new fsm_1(1.0f, 8));
    }

    public static void onDrop(fla_2 fla_22) {
        biz_1 biz_12;
        Object object;
        fhn_1.gzT().bYz();
        Object object2 = fla_22.gDJ();
        if (object2 instanceof biz_1) {
            object = (biz_1)object2;
            biz_12 = object;
        } else {
            biz_12 = null;
        }
        object = new dce();
        object2 = (biz_1)fla_22.gDy();
        ((dce)object).a((biz_1)object2);
        ((dce)object).A(fla_22.gDH());
        ((dce)object).B(fla_22.gDI());
        ((dce)object).b(biz_12);
        aaw_1.bUq().h((aam_2)object);
    }

    public static void onDropOut(flc_2 flc_22) {
        cdy_2.a(flc_22.getDragNDropable());
    }

    private static void a(fbd_1 fbd_12) {
        fes_2 fes_22 = (fes_2)fbd_12.getElementMap().uH("separator");
        fcv_1 fcv_12 = fbd_12.getParentOfType(fcv_1.class);
        fdf_1 fdf_12 = fcv_12.getParentOfType(fdf_1.class);
        fhn_1.gzT().bYz();
        fhn_1.gzT().a(fzo_0.tHq);
        fes_22.setPrefSize(new fsm_1(1.0f, 8));
        fes_22.setVisible(true);
        fcv_12.setExpandable(fdf_12.isInnerExpandable());
        fbd_12.setVisible(true);
    }

    public static void changeCursorOnMouseRelease(flp_2 flp_22) {
        fhn_1.gzT().bYz();
    }

    public static void changeCursorOnMousePress(flp_2 flp_22) {
        fhn_1.gzT().a(fzo_0.tHW, true);
    }
}

