/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.GLAutoDrawable
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.wakfu.client.WakfuClient;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aIe
 */
public class aie_0
extends WL<bsg_1> {
    static final Logger dXa = Logger.getLogger(aie_0.class);
    private static final aie_0 dXb = new aie_0();
    private static final int dXc = 11;
    private static final int dXd = 80;
    private static final Pattern dXe = Pattern.compile(":");
    private final aia_0 dXf = new aia_0();
    private final ArrayList<aaM> dXg = new ArrayList();
    private boolean dXh = false;
    private boolean dXi = false;
    private boolean dXj = false;
    private boolean dXk = false;

    private aie_0() {
    }

    @Override
    public ahv bmB() {
        return this.dXf;
    }

    public static aie_0 cfn() {
        return dXb;
    }

    public static Logger bBx() {
        return dXa;
    }

    public static aue_0 cfo() {
        return aue_0.cVJ();
    }

    @Override
    protected void bmF() {
        aeg_2.caa().a(fse_1.gFu());
    }

    protected bsg_1 cfp() {
        return new bsg_1();
    }

    private void cfq() {
        aeb_1.dGy = ewo_0.oBF.k(ewr_0.oEo);
        ewo_0.oBF.a((ewr_0 ewr_02, Object object) -> {
            if (ewr_02 != ewr_0.oEo) {
                return;
            }
            aeb_1.dGy = ewo_0.oBF.k(ewr_0.oEo);
        });
    }

    @Override
    public void bmJ() {
        this.cfq();
        super.bmJ();
        aeg_2.caa().f("uiScale", bsf_1.emZ());
        ((bsg_1)this.bmH()).bxo().dI(true);
        bsn_1 bsn_12 = bsn_1.liW;
        axm_1.dqM = ((bsg_1)this.bmH()).a(bsn_12);
    }

    @Override
    @Nullable
    protected String bmS() {
        try {
            return auc_0.cVq().bS("gfxPath");
        }
        catch (fu_0 fu_02) {
            dXa.error((Object)"", (Throwable)fu_02);
            return null;
        }
    }

    protected boolean cfr() {
        bsg_1 bsg_12 = (bsg_1)this.bmH();
        String string = bsg_12.f(bsn_1.lla);
        cAY.eHc().ef(WakfuClient.dSV.cfl().cgq());
        if (cAY.eHc().id(string)) {
            cAY.eHc().ee(bsg_12.a(bsn_1.llb));
            cAY.eHc().start();
            bsn_1.lla.a(bsg_12, (aez_1 aez_12) -> cAY.eHc().ic(aez_12.bZU()));
            bsn_1.llb.a(bsg_12, (aez_1 aez_12) -> cAY.eHc().ee(aez_12.bZP()));
            fse_1.gFu().f("sounds", cAY.eHc());
            return true;
        }
        dXa.error((Object)"Probl\u00e8me d'initialisation du SoundManager.");
        return false;
    }

    @Override
    public void aPg() {
        super.aPg();
        FG.aLe().e(caq_0.class).eGx();
        bsg_1 bsg_12 = (bsg_1)this.bmH();
        String string = auc_0.kG("gfxConfigFile");
        aqs_2 aqs_22 = ayu_2.bST().gT(string);
        arn_2.bIc().c(aqs_22);
        cAY.eHc();
        agY.a(new ajw_0());
        Uq.buK.a(ue_0.bjV());
        this.cfu();
        this.cfv();
        ahm ahm2 = ahm.eN(bsg_12.f(aff.cpJ));
        boolean bl = bsg_12.a(bsn_1.liY);
        this.a(ahm2, bl);
        aaj_1.a(aaw_1.bUq(), (GLAutoDrawable)this.dXf.bAy());
        this.dXf.bAC();
        this.a(this.bmE(), new aif_0(this));
        this.dXf.ceS();
        aub_2.a(new ajx_0());
        aum_2.d("wci", 4, 11);
        XQ.bSY.a(ain_0.chd(), this.bPB);
        this.bw(((bsg_1)dXb.bmH()).a(bsn_1.ljO));
        crf_2 crf_22 = this.cfs();
        ((bsg_1)this.bPD).b((afe)bsn_1.llc, crf_22.d());
        euG.fdh();
        ejp_0.fxk().bkZ();
    }

    @NotNull
    public crf_2 cfs() {
        return Optional.ofNullable(this.dXf.bAR().getGraphicsConfiguration()).map(GraphicsConfiguration::getBounds).map(Rectangle::getHeight).map(crf_2::Z).orElse(crf_2.nok);
    }

    public fhv_2 cft() {
        return (fhv_2)this.bPx;
    }

    private void cfu() {
        aig_0 aig_02 = new aig_0(this);
        ue_0.bjV().a(aig_02);
    }

    private void cfv() {
        String string = "Current almanach entry (%s) is missing (Possible cause are : Almanach keys has been used before calendar start, or Almanax API isn't available)";
        String string2 = "Current almanach entry is missing because almanach keys has been used before calendar start";
        Bz.a(() -> {
            if (!ue_0.bjV().bjo()) {
                throw new IllegalStateException("Current almanach entry is missing because almanach keys has been used before calendar start");
            }
            if (!beH.hNP.deH()) {
                throw new IllegalStateException(String.format("Current almanach entry (%s) is missing (Possible cause are : Almanach keys has been used before calendar start, or Almanax API isn't available)", ue_0.bjV().bjc()));
            }
            return beH.hNP.deF().map(beG::deE).orElse("Unknown");
        });
        Bz.b(() -> {
            if (!ue_0.bjV().bjo()) {
                throw new IllegalStateException("Current almanach entry is missing because almanach keys has been used before calendar start");
            }
            if (!beH.hNP.deH()) {
                throw new IllegalStateException(String.format("Current almanach entry (%s) is missing (Possible cause are : Almanach keys has been used before calendar start, or Almanax API isn't available)", ue_0.bjV().bjc()));
            }
            return beH.hNP.deF().map(beG::deD).orElse("Unknown");
        });
        Bz.c(() -> {
            if (!ue_0.bjV().bjo()) {
                throw new IllegalStateException("Current almanach entry is missing because almanach keys has been used before calendar start");
            }
            return beH.hNP.deG().map(beH.hNP::a).orElse("Unknown");
        });
    }

    public void cfw() {
        abo_2.dyC.a(bna_0.kDO);
        aum_0.cWf();
        auc_0 auc_02 = auc_0.cVq();
        aep_2.dFy.ck(auc_02.kF(".cache"));
        aep_2.dFy.buq();
        afn_0.crj = bij_2.khL;
        feh_2.setParticlePath(auc_0.cVq().bS("worldPositionMarkerApsPath"));
        bsg_1 bsg_12 = (bsg_1)this.bmH();
        this.yy(bsg_12.d(aff.cpL));
        try {
            this.cfy();
        }
        catch (Exception exception) {
            dXa.fatal((Object)"Error when loading game managers", (Throwable)exception);
            JOptionPane.showMessageDialog(null, exception, "Error", 0);
            System.exit(0);
        }
    }

    void cfx() {
        auc_0 auc_02 = auc_0.cVq();
        new bal_2().a((My)aum_0.cWf(), ahy_2.dSP);
        aqb_1.bGD().cL(auc_0.cVq().bS("binaryDataFile"));
        aqf_2.bGr().fE(auc_0.cVq().bS("contentStaticDataStorageDirectory"));
        aqf_2.bGr().bGb();
        acq_0.cge.aPg();
        bsg_1 bsg_12 = (bsg_1)this.bmH();
        this.bmE().dt(bsg_12.a(bsn_1.liY));
        bzq_1.lCJ.az(bsg_12.a(bsn_1.liK));
        ZC.bI(bsg_12.a(bsn_1.liZ));
        bzp_2.bkZ();
        bzp_2.eqt().dJ(auc_0.kG("worldInfoFile"));
        String string = auc_0.kG("mapsGfxCoord");
        WX.q(auc_0.kG("mapsTplgCoord"), string);
        acj_0.btR().cL(auc_0.kG("mapsLightPath"));
        wa_0.bms();
        wa_0.bmt();
        wa_0.cL(auc_0.kG("mapsTopologyPath"));
        adk adk2 = adk.buy();
        adk2.eo(auc_0.kG("mapsEnvironmentPath"));
        String string2 = auc_0.kG("mapsGfxPath");
        aaa_0.brC().cL(string2);
        aJU.P(auc_0.cVq().bS("patchMiniImagePath"), auc_0.cVq().bS("buildingMiniImagePath"));
        this.cfG();
        this.rf(2);
        int n = this.bPA.length;
        for (int i = 0; i < n; ++i) {
            this.bPA[i].bra().cL(string2);
        }
        adk2.a(ajo_0::new);
        String string3 = auc_02.bS("ANMDynamicElementPath");
        afe_0.a(new aii_0(string3));
        adk2.a(auc_0.cVq().aK("activateMapParticles") ? agZ.bzy() : null);
        adk2.a(cAY.eHc());
        adu.buC().cL(auc_02.bS("mapsAmbienceDataPath"));
        adg_0.bup().en(auc_02.bS("ambienceBankFile"));
        bzq_1.lCJ.epT();
        bzq_1.lCJ.start();
        bJD.kmg.a(new bJw());
        fjo_0.a(new aih_0());
        frz.a(new bOa(), new bNY(), new bNV(), new bNZ());
        bTj.eno().aPg();
        fpm.sNJ.a(bTa.lmC);
        aie_0.cfB();
        this.cfA();
        String string4 = auc_0.kG("dayLightFile");
        String string5 = auc_0.kG("defaultDayLightFile");
        dXa.info((Object)"Loading embedded DayLight file.");
        try {
            try {
                acz_0.cgH.ek(string4);
            }
            catch (Exception exception) {
                dXa.error((Object)"Le dayLight file n'est pas trouvable, on utilise celui par d\u00e9faut");
                acz_0.cgH.ek(string5);
            }
        }
        catch (Exception exception) {
            dXa.error((Object)"Exception : ", (Throwable)exception);
            throw new Exception("Impossible de charger les d\u00e9finitions de couleur de Jour/Nuit embarqu\u00e9s depuis le fichier " + string4 + " !");
        }
        this.cfz();
        ffV.fWh().a(bex_1.dSm(), aym_2.bSD(), new bEf(), bgl_2.dUj());
        fhy_0.a(new bdp_0());
        bfq_2.dge().dgh();
        eac_0.a(new bak_2());
        aym_2.cy(0, 0);
        fqX.gjM().a(new bao());
        aqe_1<ale_0> aqe_12 = new aqe_1<ale_0>(new ale_0());
        eTo.a(new bbp(aqe_12));
        fgD.a(new bEm());
        ezb_0.a(new blu_1());
        eze_0.a(new blw_1());
        ezx.a(new bls_1());
        ezd_0.a(new blv_1());
        eTC.a(bsk.dFq());
        adn_0.bvh().a(bge.hZk);
        adn_0.bvh().a(bge.hZk);
        bLe.ecw().a(bge.hZk);
        bLe.ecw().a(bge.hZk);
        afh_0.bxU().a(bge.hZk, bge.hZk.Sn());
        afh_0.bxU().a(bge.hZk, bge.hZk.Sn());
        fcL.rUh.a(bwb_0.jwj);
        evx_2.feo().a(axk_0.hxf);
        evx_2.feo().a(bky_2.koP);
        evx_2.feo().a(bll_1.iwg);
        evx_2.feo().a(bot.iPB);
        evx_2.feo().a(bbt_2.hBM);
        evx_2.feo().a(bai_2.hze);
        evx_2.feo().a(bgn_0.idv);
        fhp.sop.a(bgt_1.jVv);
        QD.a(new erq_0());
        arq_1.bHF().w(auc_0.kG("ANMIndexFile"), auc_0.kG("ANMPreloadFilePattern"));
        bNB.kDS.start();
        byf_2.c(this.bmE().bRf());
    }

    private void cfy() {
        boolean bl = auc_0.cVq().b("onStartupClientBenchmark", true);
        boolean bl2 = auc_0.cVq().b("onStartupClientHardwareTest", true);
        this.b(bl2, bl);
    }

    @Override
    public void bmR() {
        super.bmR();
        try {
            this.a(auc_0.cVq(), (aez_0)this.bmH(), dXb.bmC());
        }
        catch (Exception exception) {
            dXa.error((Object)"Exception occured during sound config loading and initialization !", (Throwable)exception);
        }
    }

    private void cfz() {
        afl_2.dHW.a(cao_2.bya());
        afs_1.can().dB(auc_0.cVq().b("useLuaCache", true));
        afs_1.can().hc(auc_0.cVq().bS("scriptPath"));
        this.dXi = afs_1.can().cao();
        byf_2.F("has_anim_scripts", this.dXi);
        ahs_0.bBd().g(this.bPB);
        aht_0.bBe().h(this.bPB);
    }

    private void cfA() {
        aUm aUm2 = aUm.cUI();
        String string = aUm.cUK();
        String string2 = auc_0.kG("defaultShortcutsFile");
        try {
            try {
                aUm2.r(string2, false);
                if (fq_0.bC(aUm.cUL().getFile())) {
                    aUm2.r(string, true);
                }
            }
            catch (Exception exception) {
                dXa.debug((Object)"Exception \u00e0 la lecture des shortcuts : ", (Throwable)exception);
            }
            aUm2.p("debug", true);
            aUm2.p("admin", true);
            aUm2.p("default", true);
            this.dXf.bmE().a(aUm2, false);
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Exception : ", (Throwable)runtimeException);
            throw new Exception("Impossible de charger les raccourcis clavier depuis le fichier " + string + " !");
        }
    }

    private static void cfB() {
        acq_0.cge.a(aaa_0.brC());
        acq_0.cge.a(adn_0.bvh());
        acq_0.cge.a(bLe.ecw());
        acq_0.cge.a(afh_0.bxU());
        acq_0.cge.a(ZM.bqw());
        for (int i = 0; i < dXb.bmD().length; ++i) {
            acq_0.cge.b(dXb.bmD()[i]);
        }
        acq_0.cge.a(agZ.bzy());
        acq_0.cge.a(acz_0.cgH);
        acq_0.cge.a(aJs.eaS);
        acq_0.cge.a(aJs.eaS);
        acz_0.cgH.cb(true);
    }

    private void a(ft_0 ft_02, aez_0 aez_02, afV afV2) {
        boolean bl = !WakfuClient.dSV.cfl().cgo() && ft_02.aK("soundEnable");
        try {
            cAY.eHc().oU(auc_0.cVq().bS("soundSourceFlavor"));
        }
        catch (fu_0 | RuntimeException exception) {
            dXa.error((Object)"Unable to initialize WakfuSoundManager.SOUND_SOURCE_FLAVOR", (Throwable)exception);
        }
        if (bl && this.cfr()) {
            String string;
            cAY.eHc().a(afV2.brf());
            cAY.eHc().eV(aez_02.c(afd.cpz));
            cAY.eHc().jD(aez_02.a(afd.cpC));
            cAY.eHc().eU(aez_02.c(afd.cpA));
            cAY.eHc().jC(aez_02.a(afd.cpD));
            cAY.eHc().eT(aez_02.c(afd.cpy));
            cAY.eHc().jB(aez_02.a(afd.cpB));
            cAY.eHc().jw(aez_02.a(afd.cpE));
            afd.cpz.a(aez_02, (aez_1 aez_12) -> cAY.eHc().eV(aez_12.bZR()));
            afd.cpC.a(aez_02, (aez_1 aez_12) -> cAY.eHc().jD(aez_12.bZP()));
            afd.cpA.a(aez_02, (aez_1 aez_12) -> cAY.eHc().eU(aez_12.bZR()));
            afd.cpD.a(aez_02, (aez_1 aez_12) -> cAY.eHc().jC(aez_12.bZP()));
            afd.cpy.a(aez_02, (aez_1 aez_12) -> cAY.eHc().eT(aez_12.bZR()));
            afd.cpB.a(aez_02, (aez_1 aez_12) -> cAY.eHc().jB(aez_12.bZP()));
            afd.cpE.a(aez_02, (aez_1 aez_12) -> cAY.eHc().jw(aez_12.bZP()));
            try {
                string = auc_0.kG("lowPassPresetFile");
                cAY.eHc().oW(string);
            }
            catch (Exception exception) {
                dXa.error((Object)"Unable to initialize WakfuSoundManager.LOWPASS_PRESET_FILE", (Throwable)exception);
            }
            try {
                string = auc_0.kG("reverbPresetFile");
                cAY.eHc().oV(string);
            }
            catch (Exception exception) {
                dXa.error((Object)"Unable to initialize WakfuSoundManager.REVERB_PRESET", (Throwable)exception);
            }
            try {
                string = auc_0.kG("rollOffPresetFile");
                cAY.eHc().oX(string);
            }
            catch (Exception exception) {
                dXa.error((Object)"Unable to initialize WakfuSoundManager.ROLLOFF_PRESET_FILE", (Throwable)exception);
            }
            try {
                string = auc_0.kG("barksFile");
                cAY.eHc().oY(string);
            }
            catch (Exception exception) {
                dXa.error((Object)"Unable to initialize WakfuSoundManager.BARKS_FILE", (Throwable)exception);
            }
            try {
                string = auc_0.kG("groundsFile");
                cAY.eHc().oZ(string);
            }
            catch (Exception exception) {
                dXa.error((Object)"Unable to initialize WakfuSoundManager.GROUNDS_FILE", (Throwable)exception);
            }
            try {
                string = auc_0.kG("mountsFile");
                cAY.eHc().pa(string);
            }
            catch (Exception exception) {
                dXa.error((Object)"Unable to initialize WakfuSoundManager.MOUNTS_FILE", (Throwable)exception);
            }
            if (!this.bmK()) {
                Object object;
                try {
                    string = auc_0.kG("particlesAudioFile");
                    object = (alf_2)age_1.cbv();
                    ((alf_2)object).eU(string);
                }
                catch (fu_0 | IOException | RuntimeException exception) {
                    dXa.error((Object)"Unable to initialize ParticleSoundManager", (Throwable)exception);
                }
                try {
                    string = auc_0.kG("animatedElementsAudioFile");
                    object = (ale_2)alb_2.bBL();
                    ((ale_2)object).eU(string);
                }
                catch (fu_0 | IOException | RuntimeException exception) {
                    dXa.error((Object)"Unable to initialize AnmActionRunScriptManager", (Throwable)exception);
                }
            }
        }
    }

    protected void cfC() {
        Object object;
        Object object2;
        if (!avh_2.dhF.a(avg_2.dhp) || this.dXj) {
            int n;
            int n2;
            Object[] objectArray;
            boolean bl;
            String string = auc_0.cVq().cVG();
            boolean bl2 = string != null;
            GL2 gL2 = aru_2.cVG.bIv().bIq();
            String string2 = gL2.glGetString(7936);
            String string3 = gL2.glGetString(7937);
            String string4 = gL2.glGetString(7938);
            String string5 = aie_0.d(string2, string3, string4);
            boolean bl3 = bl = string5 != null;
            if (bl2 && bl) {
                objectArray = new Object[]{aum_0.cWf().c("download.driver", new Object[0]), aum_0.cWf().c("learnMore", new Object[0]), aum_0.cWf().c("ok", new Object[0])};
                n2 = 1;
                n = 0;
            } else if (bl2) {
                objectArray = new Object[]{aum_0.cWf().c("learnMore", new Object[0]), aum_0.cWf().c("ok", new Object[0])};
                n2 = 0;
                n = -1;
            } else if (bl) {
                objectArray = new Object[]{aum_0.cWf().c("download.driver", new Object[0]), aum_0.cWf().c("ok", new Object[0])};
                n2 = -1;
                n = 0;
            } else {
                objectArray = new Object[]{aum_0.cWf().c("ok", new Object[0])};
                n2 = -1;
                n = -1;
            }
            SwingUtilities.invokeLater(() -> {
                int n3 = JOptionPane.showOptionDialog(this.dXf.bAR(), aum_0.cWf().c(aua_0.hhB, string, string5, string3, string2, string4), aum_0.cWf().c("configuration.gl.incompatible", new Object[0]), -1, 0, null, objectArray, 0);
                if (bl2 && n3 == n2) {
                    aet_1.ht(string);
                }
                if (bl && n3 == n) {
                    aet_1.ht(string5);
                }
                System.exit(-1);
            });
            return;
        }
        if (avh_2.dhF.a(avg_2.dhq)) {
            object2 = aie_0.a(atj_2.dbA);
            object = aru_2.cVG.bIv().bIq();
            String string = object.glGetString(7936);
            String string6 = object.glGetString(7937);
            String string7 = object.glGetString(7938);
            String string8 = aum_0.cWf().c("configuration.warning.amd.adrenalin.artefactTearing", String.format("<text id=\"%s\">%s</text>", object2, object2), string6, string, string7);
            fiq_2.gCw().d(new fik_2().a(fin_2.uCA).vE(string8).pd(true).pa(true).a(new fil_2(0).m("ignore", new Object[0])).a(new fil_2(1).m("update", new Object[0]).c(arg_0 -> aie_0.O((String)object2, arg_0))));
        }
        object2 = (bsg_1)this.bmH();
        ast_1.bJG().cO(avh_2.dhF.bMS() && ((aez_0)object2).a(bsn_1.liJ));
        object = this.bPB.bRp();
        ast_1.bJG().bY(((axv_1)object).bRD(), ((axv_1)object).bRE());
    }

    public static String a(atj_2 atj_22) {
        return aum_0.cWf().c("drivers.download.page." + atj_22.name().toLowerCase(), new Object[0]);
    }

    @Nullable
    public static String d(String string, String string2, String string3) {
        for (atj_2 atj_22 : atj_2.values()) {
            if (!atj_22.c(string, string2, string3)) continue;
            return aie_0.a(atj_22);
        }
        dXa.error((Object)String.format("Unknown %s from gl values : {glVendor : \"%s\" glRenderer : \"%s\" glVersion : \"%s\"}", atj_2.class, string, string2, string3));
        return null;
    }

    @Override
    protected void bmP() {
        avj_2.dhJ.a(new avj_1());
        avj_2.dhJ.a(new avk_1());
        avj_2.dhJ.a(new avl_1());
        avj_2.dhJ.a(new avh_1());
        avj_2.dhJ.a(new avi_1());
        avj_2.dhJ.a(new avg_1());
        avj_2.dhJ.a(new avm_1());
        avj_2.dhJ.a(new avf_1());
        avj_2.dhJ.a(new avc_1());
        avj_2.dhJ.a(new avd_1());
        avj_2.dhJ.a(new ave_1());
        avj_2.dhJ.a(new avr_1());
        avj_2.dhJ.a(new avk_2());
        avj_2.dhJ.a(new avn_1());
        avj_2.dhJ.a(new avm_2());
        avj_2.dhJ.a(new avl_2());
        avj_2.dhJ.a(new avs_1());
        avj_2.dhJ.a(new avq_1());
        avj_2.dhJ.a(new avo_1());
        avj_2.dhJ.a(new avp_1());
        avj_2.dhJ.aPg();
        avj_2.dhJ.bMV();
        avj_2.dhJ.bmX();
        this.cfC();
    }

    @Override
    protected void bmQ() {
    }

    @Override
    protected void bmT() {
        this.a(new aik_0(this));
        this.a(baf_0.hyZ);
        this.a(new ayc_0());
        this.a(aYw.cYq());
        this.a(aym_0.cYl());
        this.a(new ayg_0());
        this.a(new aYA());
        this.a(new bam());
        this.a(aYE.cYs());
        this.a(aXX.hxp);
        this.a(aXY.hxq);
        this.a(aZP.cYX());
        this.a(new ayx_0());
        this.a(new aYL());
        this.a(aZu.cYV());
        this.a(new aYJ());
        this.a(new bah_0());
        this.a(bau.cZp());
        this.a(aYQ.cYv());
        this.a(new azq_0());
        this.a(aYY.cYw());
        this.a(azs_0.cYU());
        this.a(new ayk_0());
        this.a(new bae_0());
        this.a(new azt_0());
        this.a(new aZA());
        this.a(new azc_0());
        this.a(new azg_0());
        this.a(new aze_0());
        this.a(new bar());
        this.a(ayn_0.cYo());
        this.a(aZN.cYW());
        this.a(new ayq_0());
        this.a(new aZV());
        this.a(azr_0.hyz);
        this.a(aZJ.hys);
        this.a(azk_0.hyt);
        this.a(aZS.hyA);
        this.a(aYp.hxB);
        this.a(bac_0.hyX);
        this.a(aXO.hxj);
        this.a(aXV.hxo);
        this.a(aXT.hxn);
        this.a(aye_0.hxu);
        this.a(ayi_0.hxw);
        this.a(new azl_0());
        this.a(new ayr_0());
        this.a(new aYU());
        this.a(new aYV());
        this.a(new ayw_0());
        this.a(new aXR());
        this.a(bQG.kWi);
        this.a(new aYM());
        this.a(new ayo_0());
        this.a(new baj());
        this.a(new aZy());
        this.a(new aYt());
        this.a(new aZo());
        this.a(new ayv_0());
        this.a(new aYg());
        this.a(new aYC());
        this.a(new bat());
        this.a(new ayt_0());
        this.a(new bal());
        this.a(new aZI());
        this.a(new aYD());
        this.a(new azn_0());
        this.a(new azu_0());
        this.a(new aYI());
    }

    @Override
    public void start() {
        super.start();
        fse_1 fse_12 = fse_1.gFu();
        String string = ((bsg_1)this.bmH()).f(bsn_1.lix);
        fse_12.f("account.name", string == null ? "" : string);
        fse_12.f("account.remember", ((bsg_1)this.bmH()).a(bsn_1.liw));
        aUn.cUM().aPg();
        fse_1.gFu().f("shortcutsList", aUn.cUM());
        boolean bl = auc_0.cVq().b("autopassword", false);
        if (bl) {
            fse_12.f("account.password", "pass");
        }
        fse_1.gFu().f("isAdmin", false);
        fse_1.gFu().f("hasDebugRights", false);
        fse_1.gFu().f("isInAdministratorGroup", false);
        fse_1.gFu().f("isInGame", false);
        fse_1.gFu().f("useXmlTheme", auc_0.cVq().b("useXmlTheme", false));
        fse_1.gFu().f("characteristicIcons", biJ.imm);
        fse_1.gFu().f("elementIcons", bit_0.imV);
        fse_1.gFu().f("itemTypeIcons", bev_1.jOw);
        fse_1.gFu().f("flagIcons", ccl_2.mRk);
        fse_1.gFu().f("playerGift", buc_0.dJg());
    }

    @Override
    public void bmW() {
        aue_0.cVJ().bmW();
        super.bmW();
        this.bmY();
        aub_0.cVb().fK(-1L);
        ((bsg_1)this.bmH()).a((bsz_2)null);
        ((bsg_1)this.bmH()).bxp();
        aub_0.cVb().dm(null);
    }

    @Override
    public void bmX() {
        try {
            aue_0.cVJ().bmX();
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Exception lors du cleanUp de la GameEntity", (Throwable)runtimeException);
        }
        super.bmX();
        this.bmY();
        try {
            aub_0.cVb().ks(null);
            aub_0.cVb().kr(null);
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Exception lors de la sauvegarde des pr\u00e9f\u00e9rences du compte", (Throwable)runtimeException);
        }
        bgn_1.dUk().dUl();
        bsf_0.dGi().clear();
        exu_1.rJd.fPf();
    }

    private void bmY() {
        czr_2.eZh();
        brx_1.elI().clean();
        bvk.dJZ().clean();
        aPb.ez(false);
        bsu_2.lgP.clean();
        bel_2.deM();
        cva_1.eTu().eTx();
        frn.sXO.clear();
        bOU.ehP();
        bOY.ehP();
        WakfuClient.ceU().setApiKey(null);
        WakfuClient.ceV().setApiKey(null);
        WakfuClient.ceW().setBearerToken((String)null);
        if (WakfuClient.dSV.cfl().cgg()) {
            dXa.info((Object)"[WEB-TOKEN-DEBUG] All tokens cleared");
        }
        try {
            aUm.cUI().cD(true);
            aUm.cUI().bCw();
            aUm.cUI().p("world", false);
            aUm.cUI().p("fight", false);
            aUm.cUI().p("common", false);
            aUm.cUI().p("binding", false);
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Exception lors du nettoyage des racourcis", (Throwable)runtimeException);
        }
        try {
            cps_1.jV(true);
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Exception lors du nettoyage du MRU", (Throwable)runtimeException);
        }
        crh_2.eML().bCj();
        try {
            fyw_0.gqw().gqP();
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Exception lors du nettoyage de Xulor", (Throwable)runtimeException);
        }
        try {
            fyw_0.gqw().gqI();
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Exception lors du retrait des ActionClass", (Throwable)runtimeException);
        }
        try {
            fhn_1.gzT().bYz();
            fib_2.gBU().eKH();
            fyw_0.gqw().gqK();
            aie_0.cfE();
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Exception lors du nettoyage des \u00e9l\u00e9ments flottants Xulor", (Throwable)runtimeException);
        }
        try {
            aPt.cAg().cAr();
            aPt.cAg().cAp();
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Exception lors du nettoyage du chat.", (Throwable)runtimeException);
        }
        this.cfH();
        try {
            aPh.czg().clean();
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Exception lors du nettoyage des listes de contacts priv\u00e9s", (Throwable)runtimeException);
        }
        bkc_2.dsD().clear();
        WX.clear();
        aIs aIs2 = (aIs)this.bmC();
        aIs2.el(false);
        aIs2.eo(false);
        this.cfG();
    }

    @Override
    protected void bmL() {
        this.a(fyw_0.gqw());
        ddi.fcw().a(fyw_0.gqw());
        super.bmL();
        fiq_2.gCw().vK(cda_2.LS(7));
        fyw_0.gqw().ta("craftDialog");
        fyw_0.gqw().ta("craftTableDialog");
        fyw_0.gqw().ta("characterSheetDialog");
        fyw_0.gqw().ta("inventoryDialog");
        fhy_2.gBq().a(cAY.eHc().eHn());
        fyw_0.gqw().c(aum_0.cWf());
        fyw_0.gqw().a(aUm.cUI());
        fyw_0.gqw().a(ccg_2.eJI());
        aie_0.cfE();
        try {
            this.dXh = fho_2.gzX().a(WakfuClient.dSV.ceT(), WakfuClient.dSV.cfk(), WakfuClient.dSV.cfi(), aum_0.cWf().aUXX().aUJ());
        }
        catch (IOException iOException) {
            dXa.error((Object)"[THEME] Error while creating the auto generated theme folder", (Throwable)iOException);
        }
        boolean bl = auc_0.cVq().b("useXmlTheme", false);
        if (bl) {
            fyw_0.gqw().ay(auc_0.kG("themeDescriptionFolder"), auc_0.cVq().bS("themeDirectory"));
        } else {
            fhg_2 fhg_22 = (fhg_2)Class.forName("eur").getConstructor(new Class[0]).newInstance(new Object[0]);
            fhi_1 fhi_12 = (fhi_1)Class.forName("eus").getConstructor(new Class[0]).newInstance(new Object[0]);
            fyw_0.gqw().a(fhg_22, fhi_12, auc_0.cVq().bS("themeDirectory"));
        }
        fiq_2.gCw().vJ(ccj_2.pe("messageBoxDialog"));
        fyw_0.gqw().tf(ccj_2.pe("popupDialog"));
        fyw_0.gqw().tg(ccj_2.pe("mruDialog"));
        fse_1.gFu().f("buildVersion", exH.pdr);
        fse_1.gFu().f("wakfu.config", auc_0.cVq());
        fse_1.gFu().f("isWindows", ady_1.bZb());
        fyw_0.gqw().a(new bso_1());
        fyw_0.gqw().w(new awx_2(0.02f, 0.08f, 0.1f, 0.75f));
        fyw_0.gqw().tCt = auc_0.cVq().bS("ANMGUIPath");
        fyw_0.gqw().tCu = auc_0.cVq().bS("particlePath");
        fyw_0.gqw().tCv = auc_0.cVq().bS("shadersPath");
    }

    @Override
    public void bmM() {
        super.bmM();
        ccz_2.eJN();
    }

    protected fhv_2 cfD() {
        fhv_2 fhv_22 = new fhv_2();
        fhv_22.a(this.dXf);
        return fhv_22;
    }

    @Override
    protected void a(alt_2 alt_22) {
        String string = auc_0.cVq().bS("shadersPath");
        aie_0.iw(string);
    }

    @Override
    protected aff_0 bmO() {
        return new aIs(this);
    }

    @Override
    protected void a(aaj_0 aaj_02) {
        super.a(aaj_02);
        auc_0 auc_02 = auc_0.cVq();
        try {
            aeT.dJ(auc_0.kG("elementsFile"));
            WY.bnm().dI(auc_02.bS("groupsFile"));
            aaj_02.ec(auc_02.bS("gfxPath"));
            aaj_02.ed(auc_02.bS("soundBankFile"));
            cas_2.lGp.aPg();
            String string = auc_02.bS("particlePath");
            agY.bzw().hc(string);
            bsn_1 bsn_12 = bsn_1.liV;
            boolean bl = ((bsg_1)this.bmH()).a(bsn_12);
            aaj_02.bqL().cp(bl);
        }
        catch (fu_0 fu_02) {
            dXa.error((Object)"Erreur \u00e0 l'initialisation de la worldScene", (Throwable)fu_02);
        }
    }

    @Override
    public void bnb() {
        try {
            String string = auc_0.kG("highLightGfxDefaultFile");
            agx_0.bze().eh(string);
        }
        catch (fu_0 fu_02) {
            dXa.error((Object)"Erreur \u00e0 l'initialisation du HighLightManager", (Throwable)fu_02);
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Erreur \u00e0 l'initialisation du HighLightManager", (Throwable)runtimeException);
        }
    }

    private static void cfE() {
        fyw_0.gqw().d("wakfu", cdd_2.class);
        fyw_0.gqw().d("wakfu.adminConsole", cdy_1.class);
    }

    @Override
    protected void qt(int n) {
        crh_2.eML().e(true, true).g(aum_0.cWf().c("loading", new Object[0]), n);
        ccr_2.pi("logoSplashScreenDialog");
        aue_0.cVJ().a(cvz_1.eUB());
    }

    @Override
    protected void bmV() {
        bae.hyN.cZd();
        crh_2.eML().bCj();
        if (this.dXh) {
            aaw_1.bUq().h(new vt_0(() -> {
                String string = aum_0.cWf().c("theme.autoGenerated.info", aum_0.cWf().c("theme.auto.generated.name", new Object[0]));
                fiq_2.gCw().d(fik_2.gBZ().vE(string).abQ(1));
            }));
            this.dXh = false;
        }
    }

    @Override
    protected void c(@NotNull afl afl2) {
        crh_2.eML().e(true, true).eZ(afl2.getName());
    }

    @Override
    protected void a(@NotNull afl afl2, @NotNull Exception exception) {
        aaw_1.bUq().h(new vt_0(() -> fiq_2.gCw().d(fik_2.gBZ().a(fin_2.uCu).vE(aum_0.cWf().c("error.loading", new Object[0]) + afl2.getName()).vG(ccp_2.mRF.byf()).abQ(2).a((int n, String string) -> System.exit(-1)))));
    }

    @Override
    protected void a(@NotNull afl afl2, int n) {
        crh_2.eML().e(true, true).sX(n + 1);
        crh_2.eML().e(true, true).eZ(" ");
    }

    @Override
    public void bmZ() {
        super.bmZ();
        try {
            aPb.buR();
        }
        catch (Exception exception) {
            dXa.error((Object)"Echec de la tentative de sauvegarde des param\u00e8tres de chat: ", (Throwable)exception);
        }
        cAY.eHc().cdl();
        fst_1.gGA().cVc();
        aue_0.cVJ().kH("UI Closed");
        FG.aLe().e(caq_0.class).eGy();
    }

    @Override
    public void b(ahm ahm2) {
        super.b(ahm2);
    }

    @Override
    public void a(ahm ahm2) {
        super.a(ahm2);
    }

    @NotNull
    public GraphicsDevice cfF() {
        return this.dXf.bAR().getGraphicsConfiguration().getDevice();
    }

    public void yy(int n) {
        this.dXf.a(n, this.cfF());
    }

    public void rf(int n) {
        aaa_0.brC().rf(n);
        for (aaO aaO2 : this.bPA) {
            aaO2.bra().rf(n);
            if (!aaO2.bsd()) continue;
            this.bPB.b(aaO2);
            this.bPB.a(aaO2);
        }
        int n2 = this.dXg.size();
        for (int i = 0; i < n2; ++i) {
            this.dXg.get(i).onLODChange(n);
        }
    }

    @Override
    public void a(aaM aaM2) {
        if (!this.dXg.contains(aaM2)) {
            this.dXg.add(aaM2);
        }
    }

    public void cfG() {
        this.dXg.clear();
        dXb.a(new ail_0());
    }

    public static void iw(String string) {
        ast_1.bJG().a(new aij_0());
        arn_2.bIc().fV(string);
    }

    @Override
    protected void a(afx_0 afx_02) {
        super.a(afx_02);
        afx_02.n(cbj_1.class);
        afx_02.n(cbi_1.class);
        afx_02.n(cba_2.class);
        afx_02.n(cbd_2.class);
        afx_02.n(cbg_2.class);
        afx_02.n(cbm_1.class);
    }

    @Override
    protected boolean bmK() {
        try {
            boolean bl = auc_0.cVq().aK("useLuaAudio");
            if (bl) {
                dXa.info((Object)"Lua script are used for audio.");
            }
            return bl;
        }
        catch (fu_0 fu_02) {
            return false;
        }
    }

    public void cfH() {
        bzq_1.lCJ.epU();
        boh_1.ehH().b((bof_1)null);
        caf_2.lFq.eqO();
        cap_1.erG().eqO();
        aPG.cAU();
        try {
            this.bmC().bN(false);
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Exception lors du nettoyage de la world scene", (Throwable)runtimeException);
        }
        int n = this.bPA.length;
        for (int i = 0; i < n; ++i) {
            this.bPA[i].reset();
        }
        try {
            afs_1.can().car();
            agm_2.cbu().clean();
            ait_2.bBq().clear();
            ddi.fcw().clean();
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Exception lors du nettoyage du moteur de scripts", (Throwable)runtimeException);
        }
        try {
            ddU.fcI().clear();
            ddt_0.fcE().clear();
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Exception lors du nettoyage des bulles de texte", (Throwable)runtimeException);
        }
    }

    @Override
    public void a(@Nullable bgy bgy2) {
        this.ix(bgy2 != null ? bgy2.getName() : null);
    }

    public void ix(@Nullable String string) {
        String string2 = aum_0.cWf().c("desc.wakfu", new Object[0]);
        Object object = string == null ? string2 : string + " - " + string2;
        this.dXf.eQ((String)object);
    }

    public boolean cfI() {
        return this.dXk;
    }

    public void ej(boolean bl) {
        this.dXk = bl;
    }

    public void cfJ() {
        bsn_1 bsn_12 = bsn_1.liV;
        boolean bl = ((bsg_1)dXb.bmH()).a(bsn_12);
        aag_0 aag_02 = dXb.bmC().bqL();
        if (aag_02 == null) {
            return;
        }
        aag_02.cB(1.0f);
        aag_02.cp(bl);
    }

    public boolean cfK() {
        return this.dXi;
    }

    public void ek(boolean bl) {
        this.dXj = bl;
    }

    @Override
    protected /* synthetic */ alt_2 bmN() {
        return this.cfD();
    }

    @Override
    protected /* synthetic */ aez_0 bmI() {
        return this.cfp();
    }

    private static /* synthetic */ void O(String string, String string2) {
        aet_1.ht(string);
    }
}

