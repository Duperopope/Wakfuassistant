/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cSM
 */
public class csm_1
implements adi_1,
fig_2 {
    private static final Logger nGy = Logger.getLogger(csm_1.class);
    private static final csm_1 nGz = new csm_1();
    public static final String nGA = "AnimEmote-Coucou";
    public static final String nGB = "AnimEmote-Defaite";
    public static final String nGC = "AnimEmote-Defaite";
    public static final String nGD = "AnimStatique02-Debut";
    public static final String nGE = "characterList";
    public static final String nGF = "separator";
    private static final String nGG = "-BackgroundOnly";
    boolean nGH;
    fhv_1 nGI;
    private long nGJ;
    private boolean nGK;
    private boolean nGL;
    private List<biy_0> ilm = new ArrayList<biy_0>();

    private csm_1() {
    }

    public static csm_1 eOv() {
        return nGz;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 17105: {
                this.eOw();
                daq daq2 = (daq)aam_22;
                bhJ bhJ2 = daq2.eOD();
                this.ay(bhJ2);
                return false;
            }
            case 19805: {
                this.eOw();
                daq daq3 = (daq)aam_22;
                bhJ bhJ3 = daq3.eOD();
                if (bhJ3 != null) {
                    bdj_2 bdj_22 = bhJ3.ddI();
                    bdj_22.dT("AnimEmote-Defaite");
                    fiq_2.gCw().d(fik_2.b(string -> {
                        boolean bl = evm_2.b(aue_0.cVJ().cVO().cWq(), evn_2.ovm);
                        if (bl || string != null && string.equalsIgnoreCase(bhJ3.getName())) {
                            cyf_0 cyf_02 = new cyf_0();
                            cyf_02.db(bhJ3.Sn());
                            aue_0.cVJ().etu().d(cyf_02);
                        }
                    }).a(fin_2.uCr).vE(csm_1.qj(bhJ3.getName())).pe(true));
                }
                return false;
            }
            case 19830: {
                boolean bl;
                this.eOw();
                boolean bl2 = auc_0.cVq().b("characterCreation.tuto.force", false);
                boolean bl3 = auc_0.cVq().b("dontAskForTuto", false);
                boolean bl4 = bl = bgr_0.dmo().dmr() > 0 || btc_2.eoi().eoj();
                if (bl2 || !bl && !bl3) {
                    this.a(ccc_1.lPn, -1L, null, (short)0, null);
                    return false;
                }
                if (bl3) {
                    this.a(ccc_1.lPl, -1L, null, (short)0, null);
                    return false;
                }
                fiq_2.gCw().d(new fik_2().a(fin_2.uCr).l("question.characterCreation.tutorial", new Object[0]).vG(ccp_2.mRE.byf()).a(fil_2.gCq()).a(fil_2.gCo().c(string -> this.a(ccc_1.lPl, -1L, null, (short)0, null))).a(fil_2.gCm().c(string -> this.a(ccc_1.lPn, -1L, null, (short)0, null))));
                return false;
            }
            case 16543: {
                cie_0 cie_02 = new cie_0();
                aue_0.cVJ().etu().d(cie_02);
                return false;
            }
            case 16166: {
                daq daq4 = (daq)aam_22;
                csm_1.bX(daq4.eOD());
                return false;
            }
            case 18847: {
                daq daq5 = (daq)aam_22;
                bhJ bhJ4 = daq5.eOD();
                fiq_2.gCw().d(new fik_2().l("desc.mail.request", new Object[0]).pe(true).a(fil_2.gCp()).a(new fil_2(299).m("skip.mail.request", new Object[0])).a((int n, String string) -> {
                    if (n == 300) {
                        if (this.qk(string)) {
                            nGy.info((Object)("[MAIL] Mail send to World : " + string));
                            this.ql(string);
                            this.ax(bhJ4);
                        } else {
                            cdy_2.displayMailPopup(bhJ4);
                        }
                    } else {
                        this.ax(bhJ4);
                    }
                }));
                return false;
            }
            case 18940: {
                this.nGK = true;
                fse_1.gFu().f("renameCharacter.locked", true);
                return false;
            }
            case 19447: {
                if (this.nGL) {
                    return false;
                }
                dae_0 dae_02 = (dae_0)aam_22;
                bhJ bhJ5 = (bhJ)dae_02.bCv();
                Optional<bgy> optional = bib_0.ilf.aJ(bhJ5);
                if (optional.isEmpty()) {
                    return false;
                }
                cyk_0 cyk_02 = new cyk_0(optional.get().Sn(), bhJ5.Sn());
                aue_0.cVJ().etu().d(cyk_02);
                this.nGL = true;
                return false;
            }
            case 16345: {
                if (this.nGL) {
                    return false;
                }
                dae_0 dae_03 = (dae_0)aam_22;
                bhJ bhJ6 = (bhJ)dae_03.bCv();
                Optional<bgy> optional = bib_0.ilf.aK(bhJ6);
                if (optional.isEmpty()) {
                    return false;
                }
                cyk_0 cyk_03 = new cyk_0(bhJ6.Sn(), optional.get().Sn());
                aue_0.cVJ().etu().d(cyk_03);
                this.nGL = true;
                return false;
            }
            case 17532: {
                dae_0 dae_04 = (dae_0)aam_22;
                bic_0 bic_02 = (bic_0)((Object)dae_04.bCv());
                bib_0.ilf.a(bic_02);
                return false;
            }
            case 17916: {
                fes_2 fes_222;
                Object object;
                dce dce2 = (dce)aam_22;
                fdf_1 fdf_12 = (fdf_1)fyw_0.gqw().th("characterChoiceDialog").getChildWithId(nGE);
                Object object2 = fse_1.gFu().vY("characterChoice.selectedCharacter");
                if (!(object2 instanceof bgy)) {
                    return false;
                }
                bgy bgy2 = (bgy)object2;
                biz_1 biz_12 = dce2.fbp();
                bib_0 bib_02 = bib_0.ilf;
                List<biy_0> list = bib_02.dqm();
                if (dce2.fbq() != null) {
                    object = dce2.fbq();
                    list.remove(biz_12);
                    list.add(list.indexOf(object), biz_12);
                } else {
                    list.remove(biz_12);
                    list.add(biz_12);
                }
                bib_02.dqo();
                fdf_12.setSelectedValue(fdf_12.getValue(bib_02.aI(bgy2)));
                object = dce2.fbr();
                fbd_1 fbd_12 = dce2.fbs();
                for (fes_2 fes_222 : fdf_12.getWidgetChildren()) {
                    fes_222.setUsePositionTween(false);
                    fes_222.getTweensOfType(fsb_2.class).forEach(fsb_22 -> fsb_22.gGa().b((fsr_2)fsb_22));
                }
                fes_2 fes_23 = (fes_2)fbd_12.getElementMap().uH(nGF);
                fes_222 = (fes_2)((fhv_1)object).getElementMap().uH(nGF);
                fcv_1 fcv_12 = ((fhi_2)object).getParentOfType(fcv_1.class);
                ArrayList<fcv_1> arrayList = fdf_12.getRenderables();
                fcv_12.setExpandable(fdf_12.isInnerExpandable());
                fes_222.setVisible(true);
                for (int i = 0; i < arrayList.size(); ++i) {
                    fes_2 fes_24;
                    fes_2 fes_25 = arrayList.get(i);
                    if (!(fes_25 instanceof fes_2) || (fes_25 = (fes_2)(fes_24 = (fes_2)fes_25).getChildWithId(nGF)) == null) continue;
                    fes_25.setPrefSize(new fsm_1(1.0f, 8));
                }
                fes_23.setSizeToPrefSize();
                ((fes_2)object).setVisible(true);
                return false;
            }
        }
        return true;
    }

    public void eOw() {
        List<biy_0> list = bib_0.ilf.dqm();
        boolean bl = this.au(list);
        if (!bl) {
            return;
        }
        ArrayList<Long> arrayList = new ArrayList<Long>();
        ArrayList<bgy> arrayList2 = new ArrayList<bgy>();
        for (short s = 0; s < list.size(); s = (short)((short)(s + 1))) {
            Optional<bgy> optional = list.get(s).dqj();
            if (optional.isEmpty()) continue;
            bgy bgy2 = optional.get();
            arrayList.add(bgy2.Sn());
            bgt_0 bgt_02 = (bgt_0)bgy2;
            bgt_02.bv(s);
            arrayList2.add(bgy2);
        }
        cyn_0 cyn_02 = new cyn_0(arrayList);
        aue_0.cVJ().etu().d(cyn_02);
        this.ilm.clear();
        this.ilm.addAll(bib_0.ilf.dqm());
        bgr_0.dmo().p(arrayList2);
    }

    private boolean au(List<biy_0> list) {
        if (this.ilm.size() != list.size()) {
            return true;
        }
        for (int i = 0; i < this.ilm.size(); ++i) {
            if (!this.ilm.get(i).dqj().isPresent() || !list.get(i).dqj().isPresent() || this.ilm.get(i).dqj().get().Sn() == list.get(i).dqj().get().Sn()) continue;
            return true;
        }
        return false;
    }

    @NotNull
    private static String qj(String string) {
        if (!bib_0.ilf.dqq()) {
            return aum_0.cWf().c("question.removeCharacter", string);
        }
        StringBuilder stringBuilder = new StringBuilder(aum_0.cWf().c("question.removeCharacter", string));
        stringBuilder.append("\n\n").append(aum_0.cWf().c("characterChoice.delete.warning", new Object[0]));
        return stringBuilder.toString();
    }

    private boolean qk(@Nullable String string) {
        if (string == null) {
            return false;
        }
        return Pattern.matches("\\b[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\\b", string);
    }

    private void ql(String string) {
        cyc_0 cyc_02 = new cyc_0();
        cyc_02.oC(string);
        aue_0.cVJ().etu().d(cyc_02);
    }

    private void ax(bhJ bhJ2) {
        daq daq2 = new daq();
        daq2.aG(bhJ2);
        daq2.lK(17105);
        aaw_1.bUq().h(daq2);
    }

    private void a(ccc_1 ccc_12, long l, String string, short s, bhJ bhJ2) {
        czc_1.b("characterChoiceDialog", () -> {
            aue_0.cVJ().b(ccz_1.etG());
            ccb_1.etJ().a(ccc_12);
            ccb_1.etJ().db(l);
            ccb_1.etJ().dm(string);
            ccb_1.etJ().at(bhJ2);
            ccb_1.etJ().cx(s);
            ccb_1.etJ().jd(true);
            aue_0.cVJ().a(ccb_1.etJ());
        });
    }

    public static void bX(bgy bgy2) {
        csm_1.bY(bgy2);
        bgr_0.dmo().aB(bgy2);
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        bgr_0 bgr_02 = bgr_0.dmo();
        bib_0.ilf.Dc(((bsg_1)aie_0.cfn().bmH()).d(bsn_1.ljH));
        fse_1.gFu().f("characterChoice.characterInfosList", bib_0.ilf);
        fse_1.gFu().f("characterChoice.selectedCharacter", (Object)null);
        crm_2.eMO().eMP().nE(nGG);
        this.ilm.clear();
        this.ilm.addAll(bib_0.ilf.dqm());
        cvz_1.eUC();
        this.nGI = czc_1.j("characterChoiceDialog", 8192L);
        this.nGI.a(new csn_1(this));
        fdf_1 fdf_12 = (fdf_1)this.nGI.getElementMap().uH(nGE);
        fdf_12.a(new cso_1(this, bgr_02, fdf_12));
        ccg_2.eJI().a(this);
        fyw_0.gqw().d("wakfu.characterChoice", cdy_2.class);
        cAY.eHc().eGX();
        this.eOz();
        cyr_2.eYA().qT("characterChoiceDialog");
        this.nGJ = 0L;
        this.nGK = false;
        fse_1.gFu().f("renameCharacter.locked", false);
    }

    boolean eOx() {
        return auc_0.cVq().b("autoLogin_selectCharacter", false);
    }

    static Optional<bgy> eOy() {
        String string = ((bsg_1)aie_0.cfn().bmH()).f(bsn_1.ljG);
        if (BH.aU(string)) {
            return Optional.empty();
        }
        return Optional.ofNullable(bgr_0.dmo().lK(string));
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        this.nGH = false;
        bgr_0.dmo().lJ(null);
        bgr_0.dmo().aB(null);
        fhn_1.gzT().bYz();
        fse_1.gFu().vX("characterChoice.characterInfosList");
        fse_1.gFu().vX("renameCharacter.locked");
        fiq_2.gCw().a(fin_2.uCr, false);
        ccg_2.eJI().b(this);
        fse_1.gFu().vX("characterChoice.selectedCharacter");
        fyw_0.gqw().tl("characterChoiceDialog");
        czc_1.qX("webShopDialog");
        fyw_0.gqw().tc("wakfu.characterChoice");
    }

    @Override
    public fif_2 onDialogCloseRequest(String string) {
        if (crh_2.eML().bhl()) {
            aue_0.cVJ().etr();
            crh_2.eML().bCj();
        }
        return fif_2.uAv;
    }

    void ay(bhJ bhJ2) {
        if (bhJ2 == null) {
            return;
        }
        boolean bl = evm_2.b(aue_0.cVJ().cVO().cWq(), evn_2.ouZ);
        if (!bl && bgr_0.dmo().jz(bhJ2.Sn())) {
            this.a(bhJ2.Sn(), 0L, "", false);
            return;
        }
        cAY.eHc().nP(600003L);
        if (bhJ2.dpn()) {
            short s = bhJ2.dpx();
            if (bhJ2.fhC()) {
                s = (short)(s | 2);
            }
            this.a(ccc_1.lPm, bhJ2.Sn(), bhJ2.getName(), s, bhJ2);
        } else {
            csm_1.az(bhJ2);
        }
    }

    private static void bY(bgy bgy2) {
        if (bgy2 == null) {
            return;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        bdj_22.dT(nGD);
        bdj_22.dV(nGD);
        fse_1.gFu().a((aef_2)bgy2, "actorDescriptorLibrary", "actorAnimation");
    }

    public void eOz() {
        bgy bgy2 = bgr_0.dmo().dmq();
        csm_1.bY(bgy2);
        fse_1.gFu().f("characterChoice.selectedCharacter", bgy2);
    }

    public void kb(boolean bl) {
        this.nGH = bl;
    }

    public boolean eOA() {
        return this.nGL;
    }

    public void kc(boolean bl) {
        this.nGL = bl;
    }

    public void a(long l, long l2, String string, boolean bl) {
        if (this.nGK) {
            return;
        }
        bgy bgy2 = bgr_0.dmo().dmq();
        if (bgy2 == null || l != bgy2.Sn()) {
            bgr_0.dmo().aB(bgr_0.dmo().jB(l));
        }
        this.nGJ = l;
        String string2 = "renameCharacterDialog";
        long l3 = bl ? 8448L : 256L;
        ccj_2.g("renameCharacterDialog", l3);
        fse_1.gFu().f("renameCharacter.dirty", false);
        fse_1.gFu().f("renameCharater.availableId", l2);
        fse_1.gFu().f("renameCharater.availableUid", string);
        fse_1.gFu().f("renameCharacter.closable", !bl);
        boolean bl2 = evm_2.b(aue_0.cVJ().cVO().cWq(), evn_2.ouZ);
        fse_1.gFu().b("renameCharater.regex", (Object)(bl2 ? "[\\p{L} '\\-\\u00b7\\[\\]]+" : "[\\p{L} '\\-]+"), "renameCharacterDialog");
        fse_1.gFu().b("renameCharater.maxChars", (short)25, "renameCharacterDialog");
        fhn_1.gzT().bYz();
    }

    public void a(cyw_0 cyw_02) {
        this.nGK = false;
        fse_1.gFu().f("renameCharacter.locked", false);
        byte by = cyw_02.evi();
        if (by != 0) {
            nGy.error((Object)("Result of character rename : " + by));
            fse_1.gFu().f("renameCharacter.dirty", false);
            ccb_1.cX(by);
            return;
        }
        bgr_0.dmo().jy(this.nGJ);
        fyw_0.gqw().tl("renameCharacterDialog");
        fse_1.gFu().vX("renameCharacter.dirty");
        bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(this.nGJ);
        if (bgt_02 != null) {
            bgt_02.setName(cyw_02.aMy());
            fse_1.gFu().a((aef_2)bgt_02, "name");
        }
        this.nGJ = 0L;
        if (bgt_02 != null) {
            if (!bgt_02.dpn()) {
                csm_1.az(bgt_02);
            } else {
                this.a(ccc_1.lPm, bgt_02.Sn(), bgt_02.getName(), bgt_02.dpx(), bgt_02);
            }
        }
    }

    private static void az(bhJ bhJ2) {
        czc_1.b("characterChoiceDialog", () -> {
            crh_2.eML().a(true, false, true).g(aum_0.cWf().c("loadingWorld.progress", new Object[0]), 0);
            aIq.cgr().e(() -> {
                crh_2.eML().bCj();
                aue_0.cVJ().b(cvz_1.eUB());
                aie_0.cfn().bmC().bqL().byW();
            });
            csm_1.aA(bhJ2);
        });
    }

    private static void aA(bhJ bhJ2) {
        cyj_0 cyj_02 = new cyj_0();
        cyj_02.db(bhJ2.Sn());
        cyj_02.dm(bhJ2.getName());
        cdv_0.euj().je(true);
        aue_0.cVJ().etu().d(cyj_02);
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.ljG, bhJ2.getName());
    }
}

