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

public class aIe
extends WL<bSG> {
    static final Logger dXa = Logger.getLogger(aIe.class);
    private static final aIe dXb = new aIe();
    private static final int dXc = 11;
    private static final int dXd = 80;
    private static final Pattern dXe = Pattern.compile(":");
    private final aIa dXf = new aIa();
    private final ArrayList<aaM> dXg = new ArrayList();
    private boolean dXh = false;
    private boolean dXi = false;
    private boolean dXj = false;
    private boolean dXk = false;

    private aIe() {
    }

    @Override
    public ahv bmB() {
        return this.dXf;
    }

    public static aIe cfn() {
        return dXb;
    }

    public static Logger bBx() {
        return dXa;
    }

    public static aUE cfo() {
        return aUE.cVJ();
    }

    @Override
    protected void bmF() {
        aEG.caa().a(fSe.gFu());
    }

    protected bSG cfp() {
        return new bSG();
    }

    private void cfq() {
        aEB.dGy = ewo.oBF.k(ewr.oEo);
        ewo.oBF.a((ewr ewr2, Object object) -> {
            if (ewr2 != ewr.oEo) {
                return;
            }
            aEB.dGy = ewo.oBF.k(ewr.oEo);
        });
    }

    @Override
    public void bmJ() {
        this.cfq();
        super.bmJ();
        aEG.caa().f("uiScale", bSF.emZ());
        ((bSG)this.bmH()).bxo().dI(true);
        bSN bSN2 = bSN.liW;
        axM.dqM = ((bSG)this.bmH()).a(bSN2);
    }

    @Override
    @Nullable
    protected String bmS() {
        try {
            return aUC.cVq().bS("gfxPath");
        }
        catch (Fu fu) {
            dXa.error((Object)"", (Throwable)fu);
            return null;
        }
    }

    protected boolean cfr() {
        bSG bSG2 = (bSG)this.bmH();
        String string = bSG2.f(bSN.lla);
        cAY.eHc().ef(WakfuClient.dSV.cfl().cgq());
        if (cAY.eHc().id(string)) {
            cAY.eHc().ee(bSG2.a(bSN.llb));
            cAY.eHc().start();
            bSN.lla.a(bSG2, (aEz aEz2) -> cAY.eHc().ic(aEz2.bZU()));
            bSN.llb.a(bSG2, (aEz aEz2) -> cAY.eHc().ee(aEz2.bZP()));
            fSe.gFu().f("sounds", cAY.eHc());
            return true;
        }
        dXa.error((Object)"Probl\u00e8me d'initialisation du SoundManager.");
        return false;
    }

    @Override
    public void aPg() {
        super.aPg();
        FG.aLe().e(cAq.class).eGx();
        bSG bSG2 = (bSG)this.bmH();
        String string = aUC.kG("gfxConfigFile");
        aqS aqS2 = ayU.bST().gT(string);
        arN.bIc().c(aqS2);
        cAY.eHc();
        agY.a(new aJW());
        Uq.buK.a(UE.bjV());
        this.cfu();
        this.cfv();
        ahm ahm2 = ahm.eN(bSG2.f(aff.cpJ));
        boolean bl = bSG2.a(bSN.liY);
        this.a(ahm2, bl);
        aAJ.a(aAW.bUq(), (GLAutoDrawable)this.dXf.bAy());
        this.dXf.bAC();
        this.a(this.bmE(), new aIf(this));
        this.dXf.ceS();
        auB.a(new aJX());
        auM.d("wci", 4, 11);
        XQ.bSY.a(aIN.chd(), this.bPB);
        this.bw(((bSG)dXb.bmH()).a(bSN.ljO));
        cRF cRF2 = this.cfs();
        ((bSG)this.bPD).b((afe)bSN.llc, cRF2.d());
        euG.fdh();
        eJp.fxk().bkZ();
    }

    @NotNull
    public cRF cfs() {
        return Optional.ofNullable(this.dXf.bAR().getGraphicsConfiguration()).map(GraphicsConfiguration::getBounds).map(Rectangle::getHeight).map(cRF::Z).orElse(cRF.nok);
    }

    public fHV cft() {
        return (fHV)this.bPx;
    }

    private void cfu() {
        aIg aIg2 = new aIg(this);
        UE.bjV().a(aIg2);
    }

    private void cfv() {
        String string = "Current almanach entry (%s) is missing (Possible cause are : Almanach keys has been used before calendar start, or Almanax API isn't available)";
        String string2 = "Current almanach entry is missing because almanach keys has been used before calendar start";
        Bz.a(() -> {
            if (!UE.bjV().bjo()) {
                throw new IllegalStateException("Current almanach entry is missing because almanach keys has been used before calendar start");
            }
            if (!beH.hNP.deH()) {
                throw new IllegalStateException(String.format("Current almanach entry (%s) is missing (Possible cause are : Almanach keys has been used before calendar start, or Almanax API isn't available)", UE.bjV().bjc()));
            }
            return beH.hNP.deF().map(beG::deE).orElse("Unknown");
        });
        Bz.b(() -> {
            if (!UE.bjV().bjo()) {
                throw new IllegalStateException("Current almanach entry is missing because almanach keys has been used before calendar start");
            }
            if (!beH.hNP.deH()) {
                throw new IllegalStateException(String.format("Current almanach entry (%s) is missing (Possible cause are : Almanach keys has been used before calendar start, or Almanax API isn't available)", UE.bjV().bjc()));
            }
            return beH.hNP.deF().map(beG::deD).orElse("Unknown");
        });
        Bz.c(() -> {
            if (!UE.bjV().bjo()) {
                throw new IllegalStateException("Current almanach entry is missing because almanach keys has been used before calendar start");
            }
            return beH.hNP.deG().map(beH.hNP::a).orElse("Unknown");
        });
    }

    public void cfw() {
        aBo.dyC.a(bNA.kDO);
        aUM.cWf();
        aUC aUC2 = aUC.cVq();
        aEp.dFy.ck(aUC2.kF(".cache"));
        aEp.dFy.buq();
        afN.crj = bIJ.khL;
        fEH.setParticlePath(aUC.cVq().bS("worldPositionMarkerApsPath"));
        bSG bSG2 = (bSG)this.bmH();
        this.yy(bSG2.d(aff.cpL));
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
        aUC aUC2 = aUC.cVq();
        new baL().a((My)aUM.cWf(), aHY.dSP);
        aqB.bGD().cL(aUC.cVq().bS("binaryDataFile"));
        aqf.bGr().fE(aUC.cVq().bS("contentStaticDataStorageDirectory"));
        aqf.bGr().bGb();
        acq.cge.aPg();
        bSG bSG2 = (bSG)this.bmH();
        this.bmE().dt(bSG2.a(bSN.liY));
        bZq.lCJ.az(bSG2.a(bSN.liK));
        ZC.bI(bSG2.a(bSN.liZ));
        bZP.bkZ();
        bZP.eqt().dJ(aUC.kG("worldInfoFile"));
        String string = aUC.kG("mapsGfxCoord");
        WX.q(aUC.kG("mapsTplgCoord"), string);
        acJ.btR().cL(aUC.kG("mapsLightPath"));
        WA.bms();
        WA.bmt();
        WA.cL(aUC.kG("mapsTopologyPath"));
        adk adk2 = adk.buy();
        adk2.eo(aUC.kG("mapsEnvironmentPath"));
        String string2 = aUC.kG("mapsGfxPath");
        aaA.brC().cL(string2);
        aJU.P(aUC.cVq().bS("patchMiniImagePath"), aUC.cVq().bS("buildingMiniImagePath"));
        this.cfG();
        this.rf(2);
        int n = this.bPA.length;
        for (int i = 0; i < n; ++i) {
            this.bPA[i].bra().cL(string2);
        }
        adk2.a(aJo::new);
        String string3 = aUC2.bS("ANMDynamicElementPath");
        afE.a(new aIi(string3));
        adk2.a(aUC.cVq().aK("activateMapParticles") ? agZ.bzy() : null);
        adk2.a(cAY.eHc());
        adu.buC().cL(aUC2.bS("mapsAmbienceDataPath"));
        adg.bup().en(aUC2.bS("ambienceBankFile"));
        bZq.lCJ.epT();
        bZq.lCJ.start();
        bJD.kmg.a(new bJw());
        fjo.a(new aIh());
        frz.a(new bOa(), new bNY(), new bNV(), new bNZ());
        bTj.eno().aPg();
        fpm.sNJ.a(bTa.lmC);
        aIe.cfB();
        this.cfA();
        String string4 = aUC.kG("dayLightFile");
        String string5 = aUC.kG("defaultDayLightFile");
        dXa.info((Object)"Loading embedded DayLight file.");
        try {
            try {
                acz.cgH.ek(string4);
            }
            catch (Exception exception) {
                dXa.error((Object)"Le dayLight file n'est pas trouvable, on utilise celui par d\u00e9faut");
                acz.cgH.ek(string5);
            }
        }
        catch (Exception exception) {
            dXa.error((Object)"Exception : ", (Throwable)exception);
            throw new Exception("Impossible de charger les d\u00e9finitions de couleur de Jour/Nuit embarqu\u00e9s depuis le fichier " + string4 + " !");
        }
        this.cfz();
        ffV.fWh().a(bEx.dSm(), ayM.bSD(), new bEf(), bGL.dUj());
        fhY.a(new bDP());
        bfq.dge().dgh();
        eAc.a(new baK());
        ayM.cy(0, 0);
        fqX.gjM().a(new bao());
        aqE<aLe> aqE2 = new aqE<aLe>(new aLe());
        eTo.a(new bbp(aqE2));
        fgD.a(new bEm());
        ezB.a(new bLU());
        ezE.a(new bLW());
        ezx.a(new bLS());
        ezD.a(new bLV());
        eTC.a(bsk.dFq());
        adN.bvh().a(bge.hZk);
        adN.bvh().a(bge.hZk);
        bLe.ecw().a(bge.hZk);
        bLe.ecw().a(bge.hZk);
        afH.bxU().a(bge.hZk, bge.hZk.Sn());
        afH.bxU().a(bge.hZk, bge.hZk.Sn());
        fcL.rUh.a(bwb.jwj);
        evx.feo().a(aXK.hxf);
        evx.feo().a(bKy.koP);
        evx.feo().a(blL.iwg);
        evx.feo().a(bot.iPB);
        evx.feo().a(bbT.hBM);
        evx.feo().a(baI.hze);
        evx.feo().a(bgN.idv);
        fhp.sop.a(bGt.jVv);
        QD.a(new eRQ());
        arq.bHF().w(aUC.kG("ANMIndexFile"), aUC.kG("ANMPreloadFilePattern"));
        bNB.kDS.start();
        bYf.c(this.bmE().bRf());
    }

    private void cfy() {
        boolean bl = aUC.cVq().b("onStartupClientBenchmark", true);
        boolean bl2 = aUC.cVq().b("onStartupClientHardwareTest", true);
        this.b(bl2, bl);
    }

    @Override
    public void bmR() {
        super.bmR();
        try {
            this.a(aUC.cVq(), (aeZ)this.bmH(), dXb.bmC());
        }
        catch (Exception exception) {
            dXa.error((Object)"Exception occured during sound config loading and initialization !", (Throwable)exception);
        }
    }

    private void cfz() {
        aFl.dHW.a(cAo.bya());
        aFs.can().dB(aUC.cVq().b("useLuaCache", true));
        aFs.can().hc(aUC.cVq().bS("scriptPath"));
        this.dXi = aFs.can().cao();
        bYf.F("has_anim_scripts", this.dXi);
        ahS.bBd().g(this.bPB);
        ahT.bBe().h(this.bPB);
    }

    private void cfA() {
        aUm aUm2 = aUm.cUI();
        String string = aUm.cUK();
        String string2 = aUC.kG("defaultShortcutsFile");
        try {
            try {
                aUm2.r(string2, false);
                if (Fq.bC(aUm.cUL().getFile())) {
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
        acq.cge.a(aaA.brC());
        acq.cge.a(adN.bvh());
        acq.cge.a(bLe.ecw());
        acq.cge.a(afH.bxU());
        acq.cge.a(ZM.bqw());
        for (int i = 0; i < dXb.bmD().length; ++i) {
            acq.cge.b(dXb.bmD()[i]);
        }
        acq.cge.a(agZ.bzy());
        acq.cge.a(acz.cgH);
        acq.cge.a(aJs.eaS);
        acq.cge.a(aJs.eaS);
        acz.cgH.cb(true);
    }

    private void a(Ft ft, aeZ aeZ2, afV afV2) {
        boolean bl = !WakfuClient.dSV.cfl().cgo() && ft.aK("soundEnable");
        try {
            cAY.eHc().oU(aUC.cVq().bS("soundSourceFlavor"));
        }
        catch (Fu | RuntimeException exception) {
            dXa.error((Object)"Unable to initialize WakfuSoundManager.SOUND_SOURCE_FLAVOR", (Throwable)exception);
        }
        if (bl && this.cfr()) {
            String string;
            cAY.eHc().a(afV2.brf());
            cAY.eHc().eV(aeZ2.c(afd.cpz));
            cAY.eHc().jD(aeZ2.a(afd.cpC));
            cAY.eHc().eU(aeZ2.c(afd.cpA));
            cAY.eHc().jC(aeZ2.a(afd.cpD));
            cAY.eHc().eT(aeZ2.c(afd.cpy));
            cAY.eHc().jB(aeZ2.a(afd.cpB));
            cAY.eHc().jw(aeZ2.a(afd.cpE));
            afd.cpz.a(aeZ2, (aEz aEz2) -> cAY.eHc().eV(aEz2.bZR()));
            afd.cpC.a(aeZ2, (aEz aEz2) -> cAY.eHc().jD(aEz2.bZP()));
            afd.cpA.a(aeZ2, (aEz aEz2) -> cAY.eHc().eU(aEz2.bZR()));
            afd.cpD.a(aeZ2, (aEz aEz2) -> cAY.eHc().jC(aEz2.bZP()));
            afd.cpy.a(aeZ2, (aEz aEz2) -> cAY.eHc().eT(aEz2.bZR()));
            afd.cpB.a(aeZ2, (aEz aEz2) -> cAY.eHc().jB(aEz2.bZP()));
            afd.cpE.a(aeZ2, (aEz aEz2) -> cAY.eHc().jw(aEz2.bZP()));
            try {
                string = aUC.kG("lowPassPresetFile");
                cAY.eHc().oW(string);
            }
            catch (Exception exception) {
                dXa.error((Object)"Unable to initialize WakfuSoundManager.LOWPASS_PRESET_FILE", (Throwable)exception);
            }
            try {
                string = aUC.kG("reverbPresetFile");
                cAY.eHc().oV(string);
            }
            catch (Exception exception) {
                dXa.error((Object)"Unable to initialize WakfuSoundManager.REVERB_PRESET", (Throwable)exception);
            }
            try {
                string = aUC.kG("rollOffPresetFile");
                cAY.eHc().oX(string);
            }
            catch (Exception exception) {
                dXa.error((Object)"Unable to initialize WakfuSoundManager.ROLLOFF_PRESET_FILE", (Throwable)exception);
            }
            try {
                string = aUC.kG("barksFile");
                cAY.eHc().oY(string);
            }
            catch (Exception exception) {
                dXa.error((Object)"Unable to initialize WakfuSoundManager.BARKS_FILE", (Throwable)exception);
            }
            try {
                string = aUC.kG("groundsFile");
                cAY.eHc().oZ(string);
            }
            catch (Exception exception) {
                dXa.error((Object)"Unable to initialize WakfuSoundManager.GROUNDS_FILE", (Throwable)exception);
            }
            try {
                string = aUC.kG("mountsFile");
                cAY.eHc().pa(string);
            }
            catch (Exception exception) {
                dXa.error((Object)"Unable to initialize WakfuSoundManager.MOUNTS_FILE", (Throwable)exception);
            }
            if (!this.bmK()) {
                Object object;
                try {
                    string = aUC.kG("particlesAudioFile");
                    object = (alf)aGE.cbv();
                    ((alf)object).eU(string);
                }
                catch (Fu | IOException | RuntimeException exception) {
                    dXa.error((Object)"Unable to initialize ParticleSoundManager", (Throwable)exception);
                }
                try {
                    string = aUC.kG("animatedElementsAudioFile");
                    object = (ale)alb.bBL();
                    ((ale)object).eU(string);
                }
                catch (Fu | IOException | RuntimeException exception) {
                    dXa.error((Object)"Unable to initialize AnmActionRunScriptManager", (Throwable)exception);
                }
            }
        }
    }

    protected void cfC() {
        Object object;
        Object object2;
        if (!avh.dhF.a(avg.dhp) || this.dXj) {
            int n;
            int n2;
            Object[] objectArray;
            boolean bl;
            String string = aUC.cVq().cVG();
            boolean bl2 = string != null;
            GL2 gL2 = arU.cVG.bIv().bIq();
            String string2 = gL2.glGetString(7936);
            String string3 = gL2.glGetString(7937);
            String string4 = gL2.glGetString(7938);
            String string5 = aIe.d(string2, string3, string4);
            boolean bl3 = bl = string5 != null;
            if (bl2 && bl) {
                objectArray = new Object[]{aUM.cWf().c("download.driver", new Object[0]), aUM.cWf().c("learnMore", new Object[0]), aUM.cWf().c("ok", new Object[0])};
                n2 = 1;
                n = 0;
            } else if (bl2) {
                objectArray = new Object[]{aUM.cWf().c("learnMore", new Object[0]), aUM.cWf().c("ok", new Object[0])};
                n2 = 0;
                n = -1;
            } else if (bl) {
                objectArray = new Object[]{aUM.cWf().c("download.driver", new Object[0]), aUM.cWf().c("ok", new Object[0])};
                n2 = -1;
                n = 0;
            } else {
                objectArray = new Object[]{aUM.cWf().c("ok", new Object[0])};
                n2 = -1;
                n = -1;
            }
            SwingUtilities.invokeLater(() -> {
                int n3 = JOptionPane.showOptionDialog(this.dXf.bAR(), aUM.cWf().c(aUA.hhB, string, string5, string3, string2, string4), aUM.cWf().c("configuration.gl.incompatible", new Object[0]), -1, 0, null, objectArray, 0);
                if (bl2 && n3 == n2) {
                    aEt.ht(string);
                }
                if (bl && n3 == n) {
                    aEt.ht(string5);
                }
                System.exit(-1);
            });
            return;
        }
        if (avh.dhF.a(avg.dhq)) {
            object2 = aIe.a(atj.dbA);
            object = arU.cVG.bIv().bIq();
            String string = object.glGetString(7936);
            String string6 = object.glGetString(7937);
            String string7 = object.glGetString(7938);
            String string8 = aUM.cWf().c("configuration.warning.amd.adrenalin.artefactTearing", String.format("<text id=\"%s\">%s</text>", object2, object2), string6, string, string7);
            fIQ.gCw().d(new fIK().a(fIN.uCA).vE(string8).pd(true).pa(true).a(new fIL(0).m("ignore", new Object[0])).a(new fIL(1).m("update", new Object[0]).c(arg_0 -> aIe.O((String)object2, arg_0))));
        }
        object2 = (bSG)this.bmH();
        ast.bJG().cO(avh.dhF.bMS() && ((aeZ)object2).a(bSN.liJ));
        object = this.bPB.bRp();
        ast.bJG().bY(((axV)object).bRD(), ((axV)object).bRE());
    }

    public static String a(atj atj2) {
        return aUM.cWf().c("drivers.download.page." + atj2.name().toLowerCase(), new Object[0]);
    }

    @Nullable
    public static String d(String string, String string2, String string3) {
        for (atj atj2 : atj.values()) {
            if (!atj2.c(string, string2, string3)) continue;
            return aIe.a(atj2);
        }
        dXa.error((Object)String.format("Unknown %s from gl values : {glVendor : \"%s\" glRenderer : \"%s\" glVersion : \"%s\"}", atj.class, string, string2, string3));
        return null;
    }

    @Override
    protected void bmP() {
        avj.dhJ.a(new avJ());
        avj.dhJ.a(new avK());
        avj.dhJ.a(new avL());
        avj.dhJ.a(new avH());
        avj.dhJ.a(new avI());
        avj.dhJ.a(new avG());
        avj.dhJ.a(new avM());
        avj.dhJ.a(new avF());
        avj.dhJ.a(new avC());
        avj.dhJ.a(new avD());
        avj.dhJ.a(new avE());
        avj.dhJ.a(new avr());
        avj.dhJ.a(new avk());
        avj.dhJ.a(new avn());
        avj.dhJ.a(new avm());
        avj.dhJ.a(new avl());
        avj.dhJ.a(new avs());
        avj.dhJ.a(new avq());
        avj.dhJ.a(new avo());
        avj.dhJ.a(new avp());
        avj.dhJ.aPg();
        avj.dhJ.bMV();
        avj.dhJ.bmX();
        this.cfC();
    }

    @Override
    protected void bmQ() {
    }

    @Override
    protected void bmT() {
        this.a(new aIk(this));
        this.a(baF.hyZ);
        this.a(new aYc());
        this.a(aYw.cYq());
        this.a(aYm.cYl());
        this.a(new aYG());
        this.a(new aYA());
        this.a(new bam());
        this.a(aYE.cYs());
        this.a(aXX.hxp);
        this.a(aXY.hxq);
        this.a(aZP.cYX());
        this.a(new aYx());
        this.a(new aYL());
        this.a(aZu.cYV());
        this.a(new aYJ());
        this.a(new bah());
        this.a(bau.cZp());
        this.a(aYQ.cYv());
        this.a(new aZq());
        this.a(aYY.cYw());
        this.a(aZs.cYU());
        this.a(new aYk());
        this.a(new baE());
        this.a(new aZT());
        this.a(new aZA());
        this.a(new aZC());
        this.a(new aZG());
        this.a(new aZE());
        this.a(new bar());
        this.a(aYn.cYo());
        this.a(aZN.cYW());
        this.a(new aYq());
        this.a(new aZV());
        this.a(aZR.hyz);
        this.a(aZJ.hys);
        this.a(aZK.hyt);
        this.a(aZS.hyA);
        this.a(aYp.hxB);
        this.a(baC.hyX);
        this.a(aXO.hxj);
        this.a(aXV.hxo);
        this.a(aXT.hxn);
        this.a(aYe.hxu);
        this.a(aYi.hxw);
        this.a(new aZL());
        this.a(new aYR());
        this.a(new aYU());
        this.a(new aYV());
        this.a(new aYW());
        this.a(new aXR());
        this.a(bQG.kWi);
        this.a(new aYM());
        this.a(new aYO());
        this.a(new baj());
        this.a(new aZy());
        this.a(new aYt());
        this.a(new aZo());
        this.a(new aYv());
        this.a(new aYg());
        this.a(new aYC());
        this.a(new bat());
        this.a(new aYT());
        this.a(new bal());
        this.a(new aZI());
        this.a(new aYD());
        this.a(new aZn());
        this.a(new aZU());
        this.a(new aYI());
    }

    @Override
    public void start() {
        super.start();
        fSe fSe2 = fSe.gFu();
        String string = ((bSG)this.bmH()).f(bSN.lix);
        fSe2.f("account.name", string == null ? "" : string);
        fSe2.f("account.remember", ((bSG)this.bmH()).a(bSN.liw));
        aUn.cUM().aPg();
        fSe.gFu().f("shortcutsList", aUn.cUM());
        boolean bl = aUC.cVq().b("autopassword", false);
        if (bl) {
            fSe2.f("account.password", "pass");
        }
        fSe.gFu().f("isAdmin", false);
        fSe.gFu().f("hasDebugRights", false);
        fSe.gFu().f("isInAdministratorGroup", false);
        fSe.gFu().f("isInGame", false);
        fSe.gFu().f("useXmlTheme", aUC.cVq().b("useXmlTheme", false));
        fSe.gFu().f("characteristicIcons", biJ.imm);
        fSe.gFu().f("elementIcons", biT.imV);
        fSe.gFu().f("itemTypeIcons", bEv.jOw);
        fSe.gFu().f("flagIcons", cCL.mRk);
        fSe.gFu().f("playerGift", buC.dJg());
    }

    @Override
    public void bmW() {
        aUE.cVJ().bmW();
        super.bmW();
        this.bmY();
        aUB.cVb().fK(-1L);
        ((bSG)this.bmH()).a((bSz)null);
        ((bSG)this.bmH()).bxp();
        aUB.cVb().dm(null);
    }

    @Override
    public void bmX() {
        try {
            aUE.cVJ().bmX();
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Exception lors du cleanUp de la GameEntity", (Throwable)runtimeException);
        }
        super.bmX();
        this.bmY();
        try {
            aUB.cVb().ks(null);
            aUB.cVb().kr(null);
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Exception lors de la sauvegarde des pr\u00e9f\u00e9rences du compte", (Throwable)runtimeException);
        }
        bGN.dUk().dUl();
        bsF.dGi().clear();
        eXU.rJd.fPf();
    }

    private void bmY() {
        cZr.eZh();
        bRX.elI().clean();
        bvk.dJZ().clean();
        aPb.ez(false);
        bSu.lgP.clean();
        beL.deM();
        cVa.eTu().eTx();
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
            cPS.jV(true);
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Exception lors du nettoyage du MRU", (Throwable)runtimeException);
        }
        cRH.eML().bCj();
        try {
            fyw.gqw().gqP();
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Exception lors du nettoyage de Xulor", (Throwable)runtimeException);
        }
        try {
            fyw.gqw().gqI();
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Exception lors du retrait des ActionClass", (Throwable)runtimeException);
        }
        try {
            fHn.gzT().bYz();
            fIB.gBU().eKH();
            fyw.gqw().gqK();
            aIe.cfE();
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
        bkC.dsD().clear();
        WX.clear();
        aIs aIs2 = (aIs)this.bmC();
        aIs2.el(false);
        aIs2.eo(false);
        this.cfG();
    }

    @Override
    protected void bmL() {
        this.a(fyw.gqw());
        ddi.fcw().a(fyw.gqw());
        super.bmL();
        fIQ.gCw().vK(cDa.LS(7));
        fyw.gqw().ta("craftDialog");
        fyw.gqw().ta("craftTableDialog");
        fyw.gqw().ta("characterSheetDialog");
        fyw.gqw().ta("inventoryDialog");
        fHY.gBq().a(cAY.eHc().eHn());
        fyw.gqw().c(aUM.cWf());
        fyw.gqw().a(aUm.cUI());
        fyw.gqw().a(cCG.eJI());
        aIe.cfE();
        try {
            this.dXh = fHo.gzX().a(WakfuClient.dSV.ceT(), WakfuClient.dSV.cfk(), WakfuClient.dSV.cfi(), aUM.cWf().aUXX().aUJ());
        }
        catch (IOException iOException) {
            dXa.error((Object)"[THEME] Error while creating the auto generated theme folder", (Throwable)iOException);
        }
        boolean bl = aUC.cVq().b("useXmlTheme", false);
        if (bl) {
            fyw.gqw().ay(aUC.kG("themeDescriptionFolder"), aUC.cVq().bS("themeDirectory"));
        } else {
            fHG fHG2 = (fHG)Class.forName("eur").getConstructor(new Class[0]).newInstance(new Object[0]);
            fHI fHI2 = (fHI)Class.forName("eus").getConstructor(new Class[0]).newInstance(new Object[0]);
            fyw.gqw().a(fHG2, fHI2, aUC.cVq().bS("themeDirectory"));
        }
        fIQ.gCw().vJ(cCJ.pe("messageBoxDialog"));
        fyw.gqw().tf(cCJ.pe("popupDialog"));
        fyw.gqw().tg(cCJ.pe("mruDialog"));
        fSe.gFu().f("buildVersion", exH.pdr);
        fSe.gFu().f("wakfu.config", aUC.cVq());
        fSe.gFu().f("isWindows", aDY.bZb());
        fyw.gqw().a(new bSO());
        fyw.gqw().w(new awX(0.02f, 0.08f, 0.1f, 0.75f));
        fyw.gqw().tCt = aUC.cVq().bS("ANMGUIPath");
        fyw.gqw().tCu = aUC.cVq().bS("particlePath");
        fyw.gqw().tCv = aUC.cVq().bS("shadersPath");
    }

    @Override
    public void bmM() {
        super.bmM();
        cCZ.eJN();
    }

    protected fHV cfD() {
        fHV fHV2 = new fHV();
        fHV2.a(this.dXf);
        return fHV2;
    }

    @Override
    protected void a(alT alT2) {
        String string = aUC.cVq().bS("shadersPath");
        aIe.iw(string);
    }

    @Override
    protected afF bmO() {
        return new aIs(this);
    }

    @Override
    protected void a(aaj aaj2) {
        super.a(aaj2);
        aUC aUC2 = aUC.cVq();
        try {
            aeT.dJ(aUC.kG("elementsFile"));
            WY.bnm().dI(aUC2.bS("groupsFile"));
            aaj2.ec(aUC2.bS("gfxPath"));
            aaj2.ed(aUC2.bS("soundBankFile"));
            cas.lGp.aPg();
            String string = aUC2.bS("particlePath");
            agY.bzw().hc(string);
            bSN bSN2 = bSN.liV;
            boolean bl = ((bSG)this.bmH()).a(bSN2);
            aaj2.bqL().cp(bl);
        }
        catch (Fu fu) {
            dXa.error((Object)"Erreur \u00e0 l'initialisation de la worldScene", (Throwable)fu);
        }
    }

    @Override
    public void bnb() {
        try {
            String string = aUC.kG("highLightGfxDefaultFile");
            agx.bze().eh(string);
        }
        catch (Fu fu) {
            dXa.error((Object)"Erreur \u00e0 l'initialisation du HighLightManager", (Throwable)fu);
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Erreur \u00e0 l'initialisation du HighLightManager", (Throwable)runtimeException);
        }
    }

    private static void cfE() {
        fyw.gqw().d("wakfu", cDd.class);
        fyw.gqw().d("wakfu.adminConsole", cDY.class);
    }

    @Override
    protected void qt(int n) {
        cRH.eML().e(true, true).g(aUM.cWf().c("loading", new Object[0]), n);
        cCR.pi("logoSplashScreenDialog");
        aUE.cVJ().a(cVz.eUB());
    }

    @Override
    protected void bmV() {
        bae.hyN.cZd();
        cRH.eML().bCj();
        if (this.dXh) {
            aAW.bUq().h(new Vt(() -> {
                String string = aUM.cWf().c("theme.autoGenerated.info", aUM.cWf().c("theme.auto.generated.name", new Object[0]));
                fIQ.gCw().d(fIK.gBZ().vE(string).abQ(1));
            }));
            this.dXh = false;
        }
    }

    @Override
    protected void c(@NotNull afl afl2) {
        cRH.eML().e(true, true).eZ(afl2.getName());
    }

    @Override
    protected void a(@NotNull afl afl2, @NotNull Exception exception) {
        aAW.bUq().h(new Vt(() -> fIQ.gCw().d(fIK.gBZ().a(fIN.uCu).vE(aUM.cWf().c("error.loading", new Object[0]) + afl2.getName()).vG(cCP.mRF.byf()).abQ(2).a((int n, String string) -> System.exit(-1)))));
    }

    @Override
    protected void a(@NotNull afl afl2, int n) {
        cRH.eML().e(true, true).sX(n + 1);
        cRH.eML().e(true, true).eZ(" ");
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
        fST.gGA().cVc();
        aUE.cVJ().kH("UI Closed");
        FG.aLe().e(cAq.class).eGy();
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
        aaA.brC().rf(n);
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
        dXb.a(new aIl());
    }

    public static void iw(String string) {
        ast.bJG().a(new aIj());
        arN.bIc().fV(string);
    }

    @Override
    protected void a(afx afx2) {
        super.a(afx2);
        afx2.n(cbj.class);
        afx2.n(cbi.class);
        afx2.n(cbA.class);
        afx2.n(cbd.class);
        afx2.n(cbg.class);
        afx2.n(cbm.class);
    }

    @Override
    protected boolean bmK() {
        try {
            boolean bl = aUC.cVq().aK("useLuaAudio");
            if (bl) {
                dXa.info((Object)"Lua script are used for audio.");
            }
            return bl;
        }
        catch (Fu fu) {
            return false;
        }
    }

    public void cfH() {
        bZq.lCJ.epU();
        bOH.ehH().b((bOF)null);
        caf.lFq.eqO();
        caP.erG().eqO();
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
            aFs.can().car();
            aGm.cbu().clean();
            ait.bBq().clear();
            ddi.fcw().clean();
        }
        catch (RuntimeException runtimeException) {
            dXa.error((Object)"Exception lors du nettoyage du moteur de scripts", (Throwable)runtimeException);
        }
        try {
            ddU.fcI().clear();
            ddt.fcE().clear();
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
        String string2 = aUM.cWf().c("desc.wakfu", new Object[0]);
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
        bSN bSN2 = bSN.liV;
        boolean bl = ((bSG)dXb.bmH()).a(bSN2);
        aag aag2 = dXb.bmC().bqL();
        if (aag2 == null) {
            return;
        }
        aag2.cB(1.0f);
        aag2.cp(bl);
    }

    public boolean cfK() {
        return this.dXi;
    }

    public void ek(boolean bl) {
        this.dXj = bl;
    }

    @Override
    protected /* synthetic */ alT bmN() {
        return this.cfD();
    }

    @Override
    protected /* synthetic */ aeZ bmI() {
        return this.cfp();
    }

    private static /* synthetic */ void O(String string, String string2) {
        aEt.ht(string);
    }
}
