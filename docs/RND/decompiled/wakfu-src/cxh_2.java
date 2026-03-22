/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cXh
 */
public class cxh_2
implements adi_1 {
    private static final Logger nUM = Logger.getLogger(cxh_2.class);
    private static final cxh_2 nUN = new cxh_2();
    private static final int nUO = 366366;
    private alx_2 ikv;
    private fig_2 ikw;
    private cxn_2 nUP;
    private final TIntObjectHashMap<amc_1> nUQ = new TIntObjectHashMap();
    private dcN nUR;

    public static cxh_2 eWD() {
        return nUN;
    }

    public dcN eWE() {
        return this.nUR;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16529: {
                aue_0.cVJ().b(this);
                return false;
            }
            case 19279: {
                dcf dcf2 = (dcf)aam_22;
                if (aUn.cUM().cUO() != null) {
                    return false;
                }
                fiq_2.gCw().d(fik_2.a(string -> {
                    amc_1 amc_12 = dcf2.fbt().cUD();
                    try {
                        aUm.cUI().a(amc_12, "binding", cxh_2.eWH());
                    }
                    catch (Exception exception) {
                        nUM.error((Object)"Exception during onMessage for CREATE_SHORTCUT_REQUEST", (Throwable)exception);
                    }
                    aUn.cUM().cUN();
                    aUl aUl2 = aUn.cUM().iv(amc_12.bCF());
                    if (aUl2 != null) {
                        cfj_1.bindKey(aUl2, 17654);
                    }
                }).l("question.confirmBindedTest", dcf2.fbt().cUD().bCN()).vG(ccp_2.mRE.byf()).abQ(1));
                return false;
            }
            case 17727: {
                aUl aUl2 = aUn.cUM().cUO();
                if (aUl2 == null) {
                    return false;
                }
                try {
                    aUm.cUI().c(aUl2.cUD(), cxh_2.eWH());
                }
                catch (Exception exception) {
                    nUM.error((Object)"Exception during onMessage for DELETE_CURRENT_BIND_SHORTCUT_REQUEST", (Throwable)exception);
                }
                aUn.cUM().cUN();
                return false;
            }
            case 17654: {
                dcf dcf3 = (dcf)aam_22;
                String string2 = "<u>" + dcf3.fbt().cUF() + "</u>\n" + aum_0.cWf().c("options.enterKeysCombining", new Object[0]);
                fse_1.gFu().f("waitingForKeyTypedDescription", string2);
                fse_1.gFu().f("waitingForKeyTyped", true);
                this.nUP = new cxn_2(this, dcf3.fbt());
                aie_0.cfn().bmE().a(this.nUP, true);
                return false;
            }
            case 17912: {
                dcf dcf4 = (dcf)aam_22;
                amc_1 amc_12 = dcf4.fbt().cUD();
                this.f(amc_12);
                this.d(amc_12, dcf4.bCt());
                aUn.cUM().cUN();
                return false;
            }
            case 19495: {
                fiq_2.gCw().d(fik_2.a(string -> this.eWF()).l("question.restoreOptions", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
                return false;
            }
            case 19622: {
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                if (bgt_02 == null) {
                    fyw_0.gqw().gqB().gAd();
                    aue_0.cVJ().b(this);
                    return false;
                }
                if (!this.eWJ()) {
                    aPd.e("error.localPlayerBusy", new Object[0]);
                    return false;
                }
                aPd.f("notification.theme.reloaded", new Object[0]);
                return false;
            }
            case 19315: {
                fho_2.gzX().gzZ();
                return false;
            }
            case 16188: {
                cxh_2.eWK();
                return false;
            }
        }
        return true;
    }

    public void eWF() {
        ((bsg_1)aie_0.cfn().bmH()).bxl();
        aUm aUm2 = aUm.cUI();
        try {
            String string = auc_0.kG("defaultShortcutsFile");
            aUm2.r(string, false);
            String string2 = cxh_2.eWH();
            fq_0.bD(string2);
        }
        catch (Exception exception) {
            nUM.error((Object)"impossible de recharger le fichier de raccourcis par d\u00e9faut");
        }
        aUn.cUM().cUN();
        fse_1.gFu().a((aef_2)aUn.cUM(), aUn.cUM().bxk());
        fse_1.gFu().a((aef_2)aie_0.cfn().bmH(), ((bsg_1)aie_0.cfn().bmH()).bxk());
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikw = new cxi_1(this);
            ccg_2.eJI().a(this.ikw);
            this.ikv = new cxj_1(this);
            fyw_0.gqw().a(this.ikv);
            this.nUR = new dcN(aie_0.cfn().bmB());
            fse_1.gFu().f("resolutionsManager", this.nUR);
            fse_1.gFu().f("waitingForKeyTyped", false);
            fse_1.gFu().f("shortcutOver", (Object)null);
            fse_1.gFu().f("options.numLOD", 3);
            fse_1.gFu().f("options.numFightLOD", 3);
            fse_1.gFu().f("options.graphicalPresets", bsm_1.values());
            fse_1.gFu().f("options.outgameBackgroundStyles", crf_2.nol);
            ccj_2.g("optionsDialog", 256L);
            fyw_0.gqw().d("wakfu.options", cfj_1.class);
            bon.dAK().a(bor.iPl, "optionsDialog");
            cfj_1.clearOptionActions();
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.nUQ.clear();
            fyw_0.gqw().b(this.ikv);
            ccg_2.eJI().b(this.ikw);
            fse_1.gFu().vX("waitingForKeyTyped");
            fse_1.gFu().vX("shortcutOver");
            fse_1.gFu().vX("options.numLOD");
            fse_1.gFu().vX("resolutionsManager");
            this.nUR = null;
            aie_0.cfn().bmE().a(this.nUP);
            fyw_0.gqw().tl("optionsDialog");
            fyw_0.gqw().tc("wakfu.options");
            cfj_1.setSelectedTabIndex(0);
            cfj_1.clearOptionActions();
        }
    }

    public TIntObjectIterator<amc_1> eWG() {
        return this.nUQ.iterator();
    }

    void f(amc_1 amc_12) {
        String string = amc_12.getId();
        if (string == null) {
            nUM.error((Object)"On tente de modifier un raccourci sans id !");
            return;
        }
        amc_1 amc_13 = amc_12.bCP();
        int n = string.hashCode();
        if (!this.nUQ.containsKey(n)) {
            this.nUQ.put(n, (Object)amc_13);
        }
    }

    public void d(amc_1 amc_12, String string) {
        if (string == null) {
            return;
        }
        try {
            aUm.cUI().b(amc_12, string, aUm.cUJ());
        }
        catch (Exception exception) {
            nUM.error((Object)"Exception during changeBindText", (Throwable)exception);
        }
    }

    private static String eWH() {
        return aUm.cUL().getFile();
    }

    public void a(String string, int n, int n2, @Nullable String string2, int n3) {
        try {
            aUm.cUI().a(string, n, n2, string2, null, n3, cxh_2.eWH());
        }
        catch (Exception exception) {
            nUM.error((Object)"Exception during changeShortcut", (Throwable)exception);
        }
    }

    void eWI() {
        aie_0.cfn().bmE().a(this.nUP);
        fse_1.gFu().f("waitingForKeyTyped", false);
    }

    public boolean eWJ() {
        aue_0 aue_02 = aue_0.cVJ();
        bgt_0 bgt_02 = aue_02.cVK();
        if (bgt_02 == null || bgt_02.djT() || bgt_02.doP()) {
            return false;
        }
        if (cvv_2.nPF.eUz()) {
            return false;
        }
        if (bgt_02.dnB() != null) {
            return false;
        }
        fyw_0.gqw().gqB().gAd();
        cdv_0 cdv_02 = cdv_0.euj();
        fst_1.gGA().cVc();
        aPt.cAg().cAz();
        bgt_02.fZ(false);
        fbj_1.getInstance().setVisible(false);
        byte by = cyt_1.eXX().eXY().ebE();
        long l = System.currentTimeMillis();
        cxk_2 cxk_22 = new cxk_2(this, aue_02, cdv_02, bgt_02, l, by);
        asj_2.bJt().a(cxk_22);
        aIq.cgr().cgs();
        return true;
    }

    public static void eWK() {
        aPb.cyY();
        ArrayList<Mv> arrayList = ((bsg_1)aie_0.cfn().bmH()).bla();
        List<Mv> list = ((bsg_1)aie_0.cfn().bmH()).enb();
        for (apn_0 apn_02 : aPt.cAg().cAt()) {
            fse_1.gFu().a((aef_2)apn_02, "channelsList");
            if (!apn_02.cyI().cBr()) {
                apn_02.a(apn_02.cyI().cBs(), true);
                fse_1.gFu().a((aef_2)apn_02, "currentChannel", "currentChannelName");
            }
            for (Mv mv : list) {
                cdc_1.toggleFilter(apn_02, aPl.k(mv), false);
                cdc_1.toggleFilter(apn_02, aPl.l(mv), false);
            }
            for (Mv mv : arrayList) {
                cdc_1.toggleFilter(apn_02, aPl.k(mv), true);
                cdc_1.toggleFilter(apn_02, aPl.l(mv), true);
            }
        }
        apn_0 apn_03 = aPt.cAg().cAl().czW();
        fse_1.gFu().a((aef_2)apn_03, "allFiltersList", "channelsList");
        cxh_2.eWL();
    }

    public static void eWL() {
        clP clP2 = new clP();
        clP2.l(((bsg_1)aie_0.cfn().bmH()).bla());
        clP2.b(aup_0.cWk());
        aue_0.cVJ().etu().d(clP2);
    }
}

