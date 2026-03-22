/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFz
 */
@fyf_0
public class cfz_2 {
    public static final String PACKAGE = "wakfu.nation";
    public static final byte mWt = 0;
    public static final byte mWu = 1;
    public static final byte mWv = 2;
    public static final byte mWw = 3;
    static boolean mWx;

    public static void onKeyPress(fiq_1 fiq_12) {
        if (fiq_12.gBy() == fzq_0.tJF) {
            String string;
            fli_2 fli_22;
            fdu_1 fdu_12 = (fdu_1)fiq_12.gBE();
            if (cfz_2.checkText(fdu_12, (fli_22 = (fli_2)fiq_12).gDW() == '\n')) {
                // empty if block
            }
            if ((string = fdu_12.getText()) != null && string.length() > 0) {
                fse_1.gFu().f("speechDirty", true);
            }
        }
    }

    public static boolean checkText(fdu_1 fdu_12, boolean bl) {
        boolean bl2 = true;
        Object object = fdu_12.getText();
        int n = bl ? 1 : 0;
        for (int i = 0; i < ((String)object).length(); ++i) {
            if (((String)object).charAt(i) != '\n' || ++n <= 3) continue;
            object = ((String)object).substring(0, i) + " " + ((String)object).substring(i + 1, ((String)object).length());
        }
        if (n > 3) {
            bl2 = false;
            fdu_12.setText((String)object);
            cfz_2.a(aum_0.cWf().c("carriageReturnLimitError", new Object[0]), fdu_12);
        }
        return bl2;
    }

    private static void a(String string2, fdu_1 fdu_12) {
        fiq_2.gCw().d(fik_2.gBZ().vE(string2).vG(ccp_2.mRF.byf()).a((n, string) -> fhw_2.gAL().s(fdu_12)).abQ(1));
    }

    public static void cancelGovernorSpeech(fiq_1 fiq_12) {
        brx_1.elI().nx(null);
        brx_1.elI().emy();
        fse_1.gFu().f("speechVisualisationMode", true);
        fse_1.gFu().f("speechDirty", false);
    }

    public static void cancelMarshalSpeech(fiq_1 fiq_12) {
        brx_1.elI().nx(null);
        brx_1.elI().elY();
        fse_1.gFu().f("speechVisualisationMode", true);
        fse_1.gFu().f("speechDirty", false);
    }

    public static void cancelGeneralSpeech(fiq_1 fiq_12) {
        brx_1.elI().nx(null);
        brx_1.elI().elZ();
        fse_1.gFu().f("speechVisualisationMode", true);
        fse_1.gFu().f("speechDirty", false);
    }

    public static void validateGovernorSpeech(fiq_1 fiq_12, fdu_1 fdu_12) {
        cfz_2.validate(fiq_12, fdu_12, fkL.sCr, 16459, brx_1.elI().emu());
    }

    public static void validateMarshalSpeech(fiq_1 fiq_12, fdu_1 fdu_12) {
        cfz_2.validate(fiq_12, fdu_12, fkL.sCt, 16445, brx_1.elI().emv());
    }

    public static void validateGeneralSpeech(fiq_1 fiq_12, fdu_1 fdu_12) {
        cfz_2.validate(fiq_12, fdu_12, fkL.sCu, 17430, brx_1.elI().emw());
    }

    public static void validate(fiq_1 fiq_12, fdu_1 fdu_12, fkL fkL2, int n, brn_2 brn_22) {
        if (!cfz_2.checkText(fdu_12, false)) {
            return;
        }
        String string2 = fdu_12.getText();
        String string3 = bYV.nU(string2);
        fdu_12.setText(string3);
        if (string3.length() == 0 && string2.length() != 0) {
            cfz_2.a(aum_0.cWf().c("error.censoredSentence", new Object[0]), fdu_12);
            return;
        }
        fiq_2.gCw().d(fik_2.a(string -> {
            dae_0 dae_02 = new dae_0();
            dae_02.lK(n);
            dae_02.fa(fdu_12.getText());
            dae_02.gj(fkL2.Sn());
            aaw_1.bUq().h(dae_02);
            brx_1.elI().nx(null);
            brn_22.nw(fdu_12.getText());
            brx_1.elI().a(brn_22);
        }).l("nation.speechWarning", new Object[0]).abQ(1).vG(ccp_2.mRE.byf()));
    }

    public static void changeTitle(flk_2 flk_22) {
        if (flk_22.bqr()) {
            dae_0 dae_02 = new dae_0();
            dae_02.lK(19565);
            brp_2 brp_22 = ((brq_2)flk_22.getValue()).elA();
            dae_02.az(brp_22 == null ? (short)-1 : (short)brp_22.aIi());
            aaw_1.bUq().h(dae_02);
        }
    }

    public static void switchGovernmentVisibility(fiq_1 fiq_12, fad_1 fad_12, faw_2 faw_22) {
        cfz_2.switchVisibility(fad_12, faw_22);
    }

    public static void switchEconomyVisibility(fiq_1 fiq_12, fad_1 fad_12, faw_2 faw_22) {
        if (cfz_2.switchVisibility(fad_12, faw_22)) {
            dae_0.cV((short)19669);
        }
    }

    public static void switchGovernorPopularityVisibility(fiq_1 fiq_12, fad_1 fad_12, faw_2 faw_22) {
        if (cfz_2.switchVisibility(fad_12, faw_22)) {
            dae_0.cV((short)17080);
        }
    }

    public static void switchOtherNationLaws(fiq_1 fiq_12, fad_1 fad_12, faw_2 faw_22, bsn_2 bsn_22) {
        if (cfz_2.switchVisibility(fad_12, faw_22)) {
            brx_1.elI().j(bsn_22.emD());
            dae_0 dae_02 = new dae_0();
            dae_02.lK(16353);
            dae_02.sY(bsn_22.emD().Xt());
            aaw_1.bUq().h(dae_02);
        } else {
            brx_1.elI().k(bsn_22.emD());
        }
    }

    public static boolean switchVisibility(fad_1 fad_12, faw_2 faw_22) {
        boolean bl = !faw_22.isVisible();
        faw_22.setVisible(bl);
        fad_12.setStyle(bl ? "YellowUpArrow" : "YellowDownArrow");
        return bl;
    }

    public static void displayPage(fiq_1 fiq_12, String string) {
        int n;
        Byte by = Byte.valueOf(string);
        int n2 = fse_1.gFu().dq("nationCurrentPageIndex");
        if (by == n2) {
            return;
        }
        fse_1.gFu().f("nationCurrentPageIndex", by);
        fjn_0 fjn_02 = aue_0.cVJ().cVK().ffF();
        bJr bJr2 = bTj.eno().doD();
        int n3 = n = bJr2 == null ? -1 : bJr2.gfR().Xt();
        if (by == 1) {
            cxn_0 cxn_02 = new cxn_0();
            aue_0.cVJ().etu().d(cxn_02);
            cwo_2.eWo().kK(false);
            brx_1.elI().iB(false);
        } else if (by == 2) {
            brx_1.elI().eml();
            fse_1.gFu().a((aef_2)brx_1.elI(), "laws");
            if (fjn_02.Xt() != n) {
                cxr_0 cxr_02 = new cxr_0();
                cxr_02.Le(fjn_02.Xt());
                aue_0.cVJ().etu().d(cxr_02);
                cwo_2.eWo().kK(false);
            }
        } else if (by == 3) {
            brx_1.elI().iB(true);
            cxg_0 cxg_02 = new cxg_0();
            aue_0.cVJ().etu().d(cxg_02);
            cwo_2.eWo().kK(false);
        } else {
            brx_1.elI().iB(false);
        }
    }

    public static void detailRankMember(fiq_1 fiq_12, bsp_2 bsp_22) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16432);
        dae_02.gj(bsp_22.emG());
        aaw_1.bUq().h(dae_02);
    }

    public static void revokeRankMember(fiq_1 fiq_12, bsp_2 bsp_22) {
        fkJ fkJ2 = brx_1.elI().ems().gbB();
        fkH fkH2 = fkJ2.uc(aue_0.cVJ().cVK().Sn());
        String string2 = aum_0.cWf().c(fkH2.emF().Sn() == bsp_22.emG() ? "nation.governmentResignationConfirmation" : "nation.governmentRevokeConfirmation", bsp_22.getName());
        fiq_2.gCw().d(fik_2.a(string -> {
            dae_0 dae_02 = new dae_0();
            dae_02.lK(17264);
            dae_02.gj(bsp_22.emG());
            aaw_1.bUq().h(dae_02);
        }).vE(string2).abQ(1).vG(ccp_2.mRE.byf()));
    }

    public static void addToRank(fiq_1 fiq_12, bsp_2 bsp_22, fdu_1 fdu_12) {
        if (fiq_12.gBy() == fzq_0.tJF && ((fli_2)fiq_12).bCC() != 10) {
            return;
        }
        String string = fdu_12.getText();
        if (string != null && string.length() > 0) {
            dae_0 dae_02 = new dae_0();
            dae_02.lK(16356);
            dae_02.gj(bsp_22.emG());
            dae_02.fa(string);
            aaw_1.bUq().h(dae_02);
            fdu_12.setText("");
            fhw_2.gAL().s(null);
        }
    }

    public static void switchVisualizeSpeech(fiq_1 fiq_12, fdu_1 fdu_12) {
        boolean bl = fse_1.gFu().dp("speechVisualisationMode");
        fse_1.gFu().f("speechVisualisationMode", !bl);
        if (!bl) {
            brx_1.elI().nx(fdu_12.getText());
            brx_1.elI().emy();
        }
    }

    public static void switchVisualizeMarshalSpeech(fiq_1 fiq_12, fdu_1 fdu_12) {
        boolean bl = fse_1.gFu().dp("speechVisualisationMode");
        fse_1.gFu().f("speechVisualisationMode", !bl);
        if (!bl) {
            brx_1.elI().nx(fdu_12.getText());
            brx_1.elI().elY();
        }
    }

    public static void switchVisualizeGeneralSpeech(fiq_1 fiq_12, fdu_1 fdu_12) {
        boolean bl = fse_1.gFu().dp("speechVisualisationMode");
        fse_1.gFu().f("speechVisualisationMode", !bl);
        if (!bl) {
            brx_1.elI().nx(fdu_12.getText());
            brx_1.elI().elZ();
        }
    }

    public static void cancelLawPoints(fiq_1 fiq_12) {
        dae_0.cV((short)18640);
    }

    public static void validateLawPoints(fiq_1 fiq_12) {
        String string2 = aum_0.cWf().c(brx_1.elI().ems().gbo().gdo() ? "nation.firstLawChangesConfirmation" : "nation.lawChangesConfirmation", new Object[0]);
        fiq_2.gCw().d(fik_2.a(string -> dae_0.cV((short)19977)).vE(string2).abQ(1).vG(ccp_2.mRE.byf()));
    }

    public static void chooseLaw(flv_2 flv_22, brs_2 brs_22) {
        if (flv_22.bqr() == brs_22.elE()) {
            return;
        }
        if (flv_22.bqr() && brs_22.elD().csV() + brx_1.elI().elT() > 50) {
            if (mWx) {
                return;
            }
            fhs_2 fhs_22 = ((fhv_1)flv_22.gBD()).getElementMap();
            if (fhs_22 == null) {
                return;
            }
            fdd_2 fdd_22 = (fdd_2)flv_22.gBD();
            fbv_2 fbv_22 = (fbv_2)fhs_22.uH("lawPointsLabel");
            awx_2 awx_22 = new awx_2(1.0f, 0.2f, 0.2f, 1.0f);
            axb_2 axb_22 = awx_2.dnF;
            fbv_22.x(fsa_2.class);
            fdd_22.x(fsa_2.class);
            fsa_2 fsa_22 = new fsa_2(awx_22, axb_22, fbv_22, 0, 250, 5, abn.cdr);
            fbv_22.a(fsa_22);
            fsa_2 fsa_23 = new fsa_2(awx_22, axb_22, fdd_22, 0, 250, 5, abn.cdr);
            fdd_22.a(fsa_23);
            mWx = true;
            fsa_23.a(new cfa_2(fdd_22, fsa_23));
            return;
        }
        brs_22.iz(flv_22.bqr());
        dae_0 dae_02 = new dae_0();
        dae_02.gj(brs_22.elD().Sn());
        dae_02.lK(18937);
        aaw_1.bUq().h(dae_02);
    }

    public static void suggestAlliance(fiq_1 fiq_12, brv_1 brv_12) {
        fiq_2.gCw().d(fik_2.a(string -> {
            dcb_0 dcb_02 = new dcb_0();
            dcb_02.Le(brv_12.Xt());
            dcb_02.dQ(fkc_0.sAp.aJr());
            aaw_1.bUq().h(dcb_02);
        }).l("nation.suggestAllianceConfirmation", brv_12.getName()).abQ(1).vG(ccp_2.mRE.byf()));
    }

    public static void declareWar(fiq_1 fiq_12, brv_1 brv_12) {
        fiq_2.gCw().d(fik_2.a(string -> {
            dcb_0 dcb_02 = new dcb_0();
            dcb_02.Le(brv_12.Xt());
            dcb_02.dQ(fkc_0.sAo.aJr());
            aaw_1.bUq().h(dcb_02);
        }).l("nation.declareWarConfirmation", brv_12.getName()).abQ(1).vG(ccp_2.mRE.byf()));
    }

    public static void validProposal(fiq_1 fiq_12, brv_1 brv_12) {
        dcb_0 dcb_02 = new dcb_0();
        dcb_02.Le(brv_12.Xt());
        dcb_02.dQ(brv_12.elG() ? fkc_0.sAp.aJr() : fkc_0.sAo.aJr());
        aaw_1.bUq().h(dcb_02);
    }

    public static void cancelProposal(fiq_1 fiq_12, brv_1 brv_12) {
        dcb_0 dcb_02 = new dcb_0();
        dcb_02.Le(brv_12.Xt());
        dcb_02.dQ(brv_12.elH().aJr());
        aaw_1.bUq().h(dcb_02);
    }

    public static void changeOpinion(fiq_1 fiq_12, String string) {
        brx_1.elI().cO(Byte.parseByte(string));
    }

    public static void confirmOpinionChange(fiq_1 fiq_12) {
        dae_0.cV((short)18894);
    }

    public static void onZoneOver(flr_1 flr_12, bst_2 bst_22) {
        fse_1.gFu().f("protectorInList", bst_22);
    }

    public static void onZoneOut(flr_1 flr_12) {
        fse_1.gFu().vX("protectorInList");
    }

    public static void onFocusGain(fle_2 fle_22, fad_1 fad_12) {
        fad_12.setEnabled(true);
    }
}

