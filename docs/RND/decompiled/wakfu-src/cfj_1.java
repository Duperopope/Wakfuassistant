/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.wakfu.client.WakfuClient;
import com.ankamagames.wakfu.client.console.command.display.AlphaMaskCommand;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cFJ
 */
@fyf_0
public class cfj_1 {
    public static final String PACKAGE = "wakfu.options";
    private static final Logger mWL = Logger.getLogger(cfj_1.class);
    private static boolean mWM;
    private static boolean mWN;
    static int mWO;
    private static boolean mWP;
    public static final int mWQ = 3;
    private static final TIntObjectHashMap<cgz_1> mWR;
    private static int mWS;
    private static ahk_1 mWT;

    public static void setSelectedTabIndex(int n) {
        if (mWS == n) {
            return;
        }
        if (n == 3) {
            cAY.eHc().e(1.0f, 1000);
            cAY.eHc().f(1.0f, 1000);
            cAY.eHc().eHe();
        } else {
            cAY.eHc().e(0.2f, 1000);
            cAY.eHc().f(0.2f, 1000);
        }
        mWS = n;
    }

    public static int getCurrentIndex() {
        return mWS;
    }

    public static void tabClick(flp_2 flp_22, fdh_1 fdh_12) {
        cfj_1.setSelectedTabIndex(fdh_12.getSelectedTabIndex());
    }

    public static void clearOptionActions() {
        mWR.clear();
    }

    public static void setMusicVolume(flw_2 flw_22) {
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        afd afd2 = afd.cpy;
        float f2 = flw_22.getValue();
        cAY.eHc().eT(f2);
        mWR.put(afd2.hashCode(), (Object)new cfk_1(bsg_12, afd2, f2));
    }

    public static void setAmbianceSoundsVolume(flw_2 flw_22) {
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        afd afd2 = afd.cpz;
        float f2 = flw_22.getValue();
        cAY.eHc().eV(f2);
        mWR.put(afd2.hashCode(), (Object)new cfv_1(bsg_12, afd2, f2));
    }

    public static void setUiSoundsVolume(flw_2 flw_22) {
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        afd afd2 = afd.cpA;
        float f2 = flw_22.getValue();
        cAY.eHc().eU(f2);
        mWR.put(afd2.hashCode(), (Object)new cgg_2(bsg_12, afd2, f2));
    }

    public static void setMusicMute(flv_2 flv_22) {
        afd afd2 = afd.cpB;
        int n = afd2.hashCode();
        boolean bl = flv_22.bqr();
        cAY.eHc().jB(bl);
        mWR.put(n, (Object)new cgr_2(afd2, bl));
    }

    public static void setMusicContinuousMode(flv_2 flv_22) {
        afd afd2 = afd.cpE;
        int n = afd2.hashCode();
        boolean bl = flv_22.bqr();
        cAY.eHc().jw(bl);
        mWR.put(n, (Object)new cgu_1(afd2, bl));
    }

    public static void setAmbianceSoundsMute(flv_2 flv_22) {
        afd afd2 = afd.cpC;
        int n = afd2.hashCode();
        boolean bl = flv_22.bqr();
        cAY.eHc().jD(bl);
        mWR.put(n, (Object)new cgv_2(afd2, bl));
    }

    public static void setUiSoundsMute(flv_2 flv_22) {
        afd afd2 = afd.cpD;
        int n = afd2.hashCode();
        boolean bl = flv_22.bqr();
        cAY.eHc().jC(bl);
        mWR.put(n, (Object)new cgw_1(afd2, bl));
    }

    public static void onAudioDeviceSelectedChanged(flk_2 flk_22) {
        cAM cAM2 = (cAM)flk_22.getValue();
        bsn_1 bsn_12 = bsn_1.lla;
        cAM cAM3 = cAY.eHc().eHK();
        if (Objects.equals(cAM2.eGP(), cAM3.eGP())) {
            return;
        }
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_12, cAM2.eGQ());
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), bsn_12.getKey());
        mWR.put(bsn_12.hashCode(), (Object)new cgx_2(bsn_12, cAM3));
    }

    public static void setReconnectAudioDeviceOnDeviceDisconnect(flv_2 flv_22) {
        bsn_1 bsn_12 = bsn_1.llb;
        boolean bl = flv_22.bqr();
        mWR.put(bsn_12.hashCode(), (Object)new cgy_2(bsn_12, bl));
    }

    public static void startAmbianceSoundTest(fiq_1 fiq_12) {
        mWT = cAY.eHc().s(600025L, true);
    }

    public static void startUiSoundTest(fiq_1 fiq_12) {
        mWT = cAY.eHc().r(600025L, true);
    }

    public static void stopSoundTest(fiq_1 fiq_12) {
        if (mWT != null) {
            mWT.ee(0.2f);
            mWT = null;
        }
    }

    public static void closeOptionsDialog(fiq_1 fiq_12) {
        dae_0.cV((short)16529);
    }

    public static void closeOptionsAndMenuDialogs(fiq_1 fiq_12) {
        dae_0.cV((short)16529);
        dae_0.cV((short)19531);
    }

    public static void onScreenModeChanged(flk_2 flk_22) {
        if (!flk_22.bqr()) {
            return;
        }
        dcQ dcQ2 = (dcQ)flk_22.getValue();
        mWN = mWN || aie_0.cfn().bmB().bAz() != dcQ2.oge;
        cxh_2.eWD().eWE().a(dcQ2);
    }

    public static void onScreenSizeChanged(flk_2 flk_22) {
        if (!flk_22.bqr()) {
            return;
        }
        mWN = true;
        cxh_2.eWD().eWE().aM(flk_22.getValue());
    }

    public static void toggleHideTaskBar(flv_2 flv_22) {
        mWN = true;
        cxh_2.eWD().eWE().lc(flv_22.bqr());
    }

    public static void toggleUseLargeMinResolution(flv_2 flv_22) {
        aff aff2 = aff.cpK;
        boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(aff2);
        ((bsg_1)aie_0.cfn().bmH()).a((afe)aff2, flv_22.bqr());
        fse_1.gFu().a((aef_2)aie_0.cfn().bmH(), aff2.getKey());
        fyw_0.gqw().gqD().gBm();
        mWR.put(aff2.hashCode(), (Object)new cfl_2(aff2, bl));
    }

    private static void eKB() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.liI, bsm_1.lim.aJr());
    }

    public static void onGraphicalPresetsChanged(flk_2 flk_22) {
        bsm_1 bsm_12;
        if (!flk_22.bqr()) {
            return;
        }
        bsn_1 bsn_12 = bsn_1.liI;
        bsm_1 bsm_13 = bsm_1.cS((byte)((bsg_1)aie_0.cfn().bmH()).d(bsn_12));
        if (bsm_13 == (bsm_12 = (bsm_1)flk_22.getValue())) {
            return;
        }
        switch (bsm_12) {
            case lim: {
                break;
            }
            case lin: {
                cfj_1.activateVSync(true);
                cfj_1.enableRunningRadius(false);
                cfj_1.jN(false);
                cfj_1.jP(false);
                cfj_1.a(crf_2.noi);
                break;
            }
            case lio: {
                cfj_1.activateVSync(true);
                cfj_1.enableRunningRadius(false);
                cfj_1.jN(true);
                cfj_1.jP(true);
                cfj_1.a(crf_2.nok);
                break;
            }
            case lip: {
                cfj_1.activateVSync(true);
                cfj_1.enableRunningRadius(true);
                cfj_1.jN(true);
                cfj_1.jP(true);
                cfj_1.a(aie_0.cfn().cfs());
            }
        }
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_12, bsm_12.aJr());
    }

    public static void onOutgameBackgroundStyleChanged(flk_2 flk_22) {
        if (!flk_22.bqr()) {
            return;
        }
        crf_2 crf_22 = (crf_2)flk_22.getValue();
        if (cfj_1.a(crf_22)) {
            cfj_1.eKB();
        }
    }

    private static boolean a(@NotNull crf_2 crf_22) {
        bsn_1 bsn_12 = bsn_1.llc;
        int n = ((bsg_1)aie_0.cfn().bmH()).d(bsn_12);
        if (n == crf_22.d()) {
            return false;
        }
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_12, crf_22.d());
        mWR.put(bsn_12.hashCode(), (Object)new cfm_1(bsn_12, n));
        return true;
    }

    public static void setUIScale(flp_2 flp_22) {
        float f2 = ((fcz_2)flp_22.gBD()).getValue() / 25.0f - 5.0f;
        cfj_1.setUIScale((byte)f2);
    }

    public static void resetUIScaleToDefault(fiq_1 fiq_12) {
        cfj_1.setUIScale((byte)0);
    }

    public static boolean setUIScale(byte by) {
        aff aff2 = aff.cpL;
        int n = ((bsg_1)aie_0.cfn().bmH()).d(aff2);
        if (n == by) {
            return false;
        }
        ((bsg_1)aie_0.cfn().bmH()).a((afe)aff2, by);
        aie_0.cfn().yy(by);
        fse_1.gFu().a((aef_2)bsf_1.emZ(), "currentUiScaleText");
        mWR.put(aff2.hashCode(), (Object)new cfn_1(aff2, n));
        abg_2.bUP().a(() -> {
            faw_2 faw_22 = (faw_2)fyw_0.gqw().th("optionsDialog");
            faw_2 faw_23 = (faw_2)faw_22.getElementMap().uH("optionsWindow");
            int n = (fbj_1.getInstance().getWidth() - faw_23.getWidth()) / 2;
            int n2 = (fbj_1.getInstance().getHeight() - faw_23.getHeight()) / 2;
            faw_23.setPosition(n, n2);
        }, 1L, 1);
        return true;
    }

    public static void onSelectedThemeChanged(flk_2 flk_22) {
        if (!(flk_22.getValue() instanceof fsp_2)) {
            return;
        }
        fsp_2 fsp_22 = (fsp_2)flk_22.getValue();
        fsf_1 fsf_12 = fse_1.gFu().getProperty("selectedTheme");
        fsp_2 fsp_23 = fsf_12 != null && fsf_12.getValue() instanceof fsp_2 ? (fsp_2)fsf_12.getValue() : null;
        fho_2.a(WakfuClient.dSV.cfk(), fsp_22);
        if (!fsp_22.equals(fsp_23) && fsp_23 != null) {
            mWR.put("selectedTheme".hashCode(), (Object)new cfo_1());
        }
    }

    public static void saveSelectedTheme(fsp_2 fsp_22) {
        try {
            Properties properties = new Properties();
            if (fsp_22.gFV() != null) {
                properties.setProperty("selectedTheme", fsp_22.gFV());
            }
            properties.store(new FileOutputStream(WakfuClient.dSV.cfk()), null);
            fse_1.gFu().f("selectedTheme", fsp_22);
        }
        catch (IOException iOException) {
            mWL.error((Object)"[THEME] Error while saving selected custom theme", (Throwable)iOException);
        }
    }

    public static void setActivateAreaChallenges(flv_2 flv_22) {
        bsn_1 bsn_12 = bsn_1.lja;
        int n = bsn_12.hashCode();
        boolean bl = flv_22.bqr();
        mWR.put(bsn_12.hashCode(), (Object)new cfp_2(bsn_12, bl));
    }

    public static void activateVSync(flv_2 flv_22) {
        if (cfj_1.activateVSync(flv_22.bqr())) {
            cfj_1.eKB();
        }
    }

    public static boolean activateVSync(boolean bl) {
        bsn_1 bsn_12 = bsn_1.liY;
        int n = bsn_12.hashCode();
        boolean bl2 = ((bsg_1)aie_0.cfn().bmH()).a(bsn_12);
        if (bl2 == bl) {
            return false;
        }
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_12, bl);
        aie_0.cfn().bmE().dt(bl);
        mWR.put(n, (Object)new cfq_1(bl2, bsn_12));
        return true;
    }

    public static void enableRunningRadius(flv_2 flv_22) {
        if (cfj_1.enableRunningRadius(flv_22.bqr())) {
            cfj_1.eKB();
        }
    }

    public static boolean enableRunningRadius(boolean bl) {
        bsn_1 bsn_12 = bsn_1.liZ;
        int n = bsn_12.hashCode();
        boolean bl2 = ((bsg_1)aie_0.cfn().bmH()).a(bsn_12);
        if (bl2 == bl) {
            return false;
        }
        ZC.bI(bl);
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_12, bl);
        mWR.put(n, (Object)new cfr_2(bl2, bsn_12));
        return true;
    }

    public static void setAutoLockFights(flv_2 flv_22) {
        bsn_1 bsn_12 = bsn_1.ljb;
        int n = bsn_12.hashCode();
        boolean bl = flv_22.bqr();
        mWR.put(bsn_12.hashCode(), (Object)new cfs_2(bsn_12));
    }

    public static void setAutoJoinFights(flv_2 flv_22) {
        bsn_1 bsn_12 = bsn_1.ljY;
        int n = bsn_12.hashCode();
        boolean bl = flv_22.bqr();
        mWR.put(n, (Object)new cft_1(bsn_12));
    }

    public static void onTacticalViewModeChanged(flk_2 flk_22) {
        aKj aKj2;
        aKe aKe2 = aKe.cix();
        aKj aKj3 = aKe2.ciy();
        if (aKj3 == (aKj2 = (aKj)flk_22.getValue())) {
            return;
        }
        aKe2.a(aKj2, true);
        bsn_1 bsn_12 = bsn_1.ljc;
        mWR.put(bsn_12.hashCode(), (Object)new cfu_2(bsn_12, aKj2, aKj3, aKe2));
        fhs_2 fhs_22 = ((fhv_1)flk_22.gBE()).getElementMap();
        faw_2 faw_22 = (faw_2)fhs_22.uH("semiTacticalViewContainer");
        faw_2 faw_23 = (faw_2)fhs_22.uH("tacticalViewContainer");
        switch (aKj2) {
            case edw: {
                faw_22.setVisible(true);
                faw_23.setVisible(false);
                break;
            }
            case edx: {
                faw_22.setVisible(false);
                faw_23.setVisible(true);
                break;
            }
            default: {
                faw_22.setVisible(false);
                faw_23.setVisible(false);
            }
        }
    }

    public static void onPlayerAutoRunModeChanged(flk_2 flk_22) {
        cfj_1.a(bsn_1.ljS, (bgv_0)flk_22.getValue(), false);
    }

    public static void onMountAutoRunModeChanged(flk_2 flk_22) {
        cfj_1.a(bsn_1.ljT, (bgv_0)flk_22.getValue(), true);
    }

    private static void a(bsn_1 bsn_12, bgv_0 bgv_02, boolean bl) {
        mWR.put(bsn_12.hashCode(), (Object)new cfw_1(bsn_12, bgv_02, bl));
    }

    public static void setSemiTacticalDisplayParallax(flv_2 flv_22) {
        cfj_1.setDisplayParallax(flv_22, aKj.edw);
    }

    public static void setTacticalDisplayParallax(flv_2 flv_22) {
        cfj_1.setDisplayParallax(flv_22, aKj.edx);
    }

    public static void setDisplayParallax(flv_2 flv_22, aKj aKj2) {
        boolean bl;
        aKe aKe2 = aKe.cix();
        boolean bl2 = aKe2.b(aKj2);
        if (bl2 == (bl = flv_22.bqr())) {
            return;
        }
        aKe2.b(bl, aKj2);
        bsn_1 bsn_12 = aKj2.ciA().ciE();
        mWR.put(bsn_12.hashCode(), (Object)new cfx_1(bsn_12, bl, bl2, aKe2, aKj2));
    }

    public static void setSemiTacticalDisplayExternalCells(flv_2 flv_22) {
        cfj_1.setDisplayExternalCells(flv_22, aKj.edw);
    }

    public static void setTacticalDisplayExternalCells(flv_2 flv_22) {
        cfj_1.setDisplayExternalCells(flv_22, aKj.edx);
    }

    public static void setDisplayExternalCells(flv_2 flv_22, aKj aKj2) {
        boolean bl;
        aKe aKe2 = aKe.cix();
        boolean bl2 = aKe2.a(aKj2);
        if (bl2 == (bl = flv_22.bqr())) {
            return;
        }
        aKe2.a(bl, aKj2);
        bsn_1 bsn_12 = aKj2.ciA().ciD();
        mWR.put(bsn_12.hashCode(), (Object)new cfy_1(bsn_12, bl, bl2, aKe2, aKj2));
    }

    public static void setSpellBarStairsMode(flv_2 flv_22) {
        cfj_1.a(flv_22.bqr(), bsn_1.lkr);
    }

    public static void setMaskWorld(flv_2 flv_22) {
        bsn_1 bsn_12 = bsn_1.liL;
        int n = bsn_12.hashCode();
        boolean bl = flv_22.bqr();
        AlphaMaskCommand.eT(bl);
        mWR.put(bsn_12.hashCode(), (Object)new cfz_1(bsn_12, bl));
    }

    public static void onDisplayHPBarChanged(flk_2 flk_22) {
        bsn_1 bsn_12 = bsn_1.liS;
        int n = bsn_12.hashCode();
        String string = (String)flk_22.getValue();
        bsa_1 bsa_12 = bsa_1.nz(string);
        if (bsa_12 == null) {
            return;
        }
        mWR.put(n, (Object)new cga_2(bsa_12, bsn_12));
    }

    public static void onSpecificEffectAreaDisplayModeChanged(flk_2 flk_22) {
        bsn_1 bsn_12 = bsn_1.liU;
        int n = bsn_12.hashCode();
        String string = (String)flk_22.getValue();
        bsd_1 bsd_12 = bsd_1.nA(string);
        if (bsd_12 == null) {
            return;
        }
        mWR.put(n, (Object)new cgb_1(bsn_12, bsd_12));
    }

    public static void setHideFightOccluders(flv_2 flv_22) {
        bsn_1 bsn_12 = bsn_1.liM;
        int n = bsn_12.hashCode();
        boolean bl = flv_22.bqr();
        cfj_1.proceedHideFightOccluders(bl);
        mWR.put(bsn_12.hashCode(), (Object)new cgc_1(bsn_12, bl));
    }

    public static void setFightersTransparency(flv_2 flv_22) {
        bsn_1 bsn_12 = bsn_1.liN;
        int n = bsn_12.hashCode();
        boolean bl = flv_22.bqr();
        cfj_1.proceedFightersTransparency(bl);
        mWR.put(bsn_12.hashCode(), (Object)new cgd_1(bsn_12, bl));
    }

    public static void proceedHideFightOccluders(boolean bl) {
        aJL.es(bl);
    }

    public static void proceedFightersTransparency(boolean bl) {
        aJL.et(bl);
    }

    public static void setCellSelection(flv_2 flv_22) {
        bsn_1 bsn_12 = bsn_1.liX;
        int n = bsn_12.hashCode();
        boolean bl = flv_22.bqr();
        mWR.put(n, (Object)new cge_1(bsn_12, bl));
    }

    public static void setFollowedQuestAutoDisplay(flv_2 flv_22) {
        bsn_1 bsn_12 = bsn_1.liO;
        int n = bsn_12.hashCode();
        boolean bl = flv_22.bqr();
        mWR.put(n, (Object)new cgf_2(bsn_12, bl));
    }

    public static void displayRangeOnOver(flv_2 flv_22) {
        bsn_1 bsn_12 = bsn_1.liP;
        int n = bsn_12.hashCode();
        boolean bl = flv_22.bqr();
        mWR.put(bsn_12.hashCode(), (Object)new cgh_2(bsn_12, bl));
    }

    public static void setDisplayAppliedStateName(flv_2 flv_22) {
        cfj_1.a(flv_22.bqr(), bsn_1.liQ);
    }

    public static void activateShaders(flv_2 flv_22) {
        if (cfj_1.jN(flv_22.bqr())) {
            cfj_1.eKB();
        }
    }

    private static boolean jN(boolean bl) {
        if (!avh_2.dhF.bMS()) {
            return false;
        }
        bsn_1 bsn_12 = bsn_1.liJ;
        boolean bl2 = ((bsg_1)aie_0.cfn().bmH()).a(bsn_12);
        if (bl2 == bl) {
            return false;
        }
        cfj_1.jO(bl);
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_12, bl);
        mWR.put(bsn_12.hashCode(), (Object)new cgi_1(bl2, bsn_12));
        return true;
    }

    protected static void jO(boolean bl) {
        aaa_0 aaa_02;
        ast_1.bJG().cO(bl);
        acq_0.cge.btE();
        adn_0.bvh().bpg();
        bLe.ecw().bpg();
        ZM.bqw().bpg();
        afh_0.bxU().bpg();
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        if (aIs2 != null && (aaa_02 = aIs2.bra()) != null) {
            aaa_02.brK();
        }
    }

    public static void activateMeteoEffect(flv_2 flv_22) {
        if (cfj_1.jP(flv_22.bqr())) {
            cfj_1.eKB();
        }
    }

    private static boolean jP(boolean bl) {
        bsn_1 bsn_12 = bsn_1.liK;
        boolean bl2 = ((bsg_1)aie_0.cfn().bmH()).a(bsn_12);
        if (bl2 == bl) {
            return false;
        }
        bzq_1.lCJ.az(bl);
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_12, bl);
        mWR.put(bsn_12.hashCode(), (Object)new cgj_1(bl2, bsn_12));
        return true;
    }

    public static void activateFixedCamera(flv_2 flv_22) {
        if (cfj_1.activateFixedCamera(flv_22.bqr())) {
            cfj_1.eKB();
        }
    }

    public static boolean activateFixedCamera(boolean bl) {
        bsn_1 bsn_12 = bsn_1.liV;
        boolean bl2 = ((bsg_1)aie_0.cfn().bmH()).a(bsn_12);
        if (bl2 == bl) {
            return false;
        }
        aie_0.cfn().bmC().cn(bl);
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_12, bl);
        mWR.put(bsn_12.hashCode(), (Object)new cgk_1(bl2, bsn_12));
        return true;
    }

    public static void setFpsBackgroundCapDisabled(flv_2 flv_22) {
        if (cfj_1.setFpsBackgroundCapDisabled(flv_22.bqr())) {
            cfj_1.eKB();
        }
    }

    public static boolean setFpsBackgroundCapDisabled(boolean bl) {
        bsn_1 bsn_12 = bsn_1.liW;
        boolean bl2 = ((bsg_1)aie_0.cfn().bmH()).a(bsn_12);
        if (bl2 == bl) {
            return false;
        }
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_12, bl);
        axm_1.dqM = bl;
        return true;
    }

    public static void clickOnBindTextEditor(flp_2 flp_22) {
        mWM = true;
    }

    public static void bindKey(flg_2 flg_22) {
        if (mWM) {
            return;
        }
        cfj_1.bindKey((aUl)flg_22.getItemValue(), 17654);
    }

    public static void bindKey(fiq_1 fiq_12, fdu_1 fdu_12) {
        String string = fdu_12.getText();
        if (string == null || string.isEmpty()) {
            fiq_2.gCw().d(fik_2.gBZ().l("notification.emptyField", new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
            return;
        }
        amc_1 amc_12 = aUn.cUM().kk(string);
        cfj_1.bindKey(new aUl(amc_12), 19279);
    }

    public static void bindKey(aUl aUl2, int n) {
        dcf dcf2 = new dcf(aUl2);
        dcf2.lK(n);
        aaw_1.bUq().h(dcf2);
    }

    public static void selectCurrentBind(flk_2 flk_22, fdu_1 fdu_12) {
        aUl aUl2 = (aUl)flk_22.gDZ().getItemValue();
        fdu_12.setText(aUl2.getText());
        aUn.cUM().a(aUl2);
    }

    public static void changeBindText(fiq_1 fiq_12, fdu_1 fdu_12, aUl aUl2) {
        String string = fdu_12.getText();
        if (string == null || string.isEmpty()) {
            fiq_2.gCw().d(fik_2.gBZ().l("notification.emptyField", new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
            return;
        }
        if (!string.equals(aUl2.getText())) {
            dcf dcf2 = new dcf(aUl2);
            dcf2.fa(string);
            dcf2.lK(17912);
            aaw_1.bUq().h(dcf2);
        }
    }

    public static void activateBindTextEdition(fiq_1 fiq_12) {
        fdd_2 fdd_22 = (fdd_2)fiq_12.gBD();
        if (fdd_22.getSelected()) {
            aUn.cUM().eX(false);
        } else {
            aUn.cUM().eX(true);
        }
    }

    public static void deleteCurrentBind(fiq_1 fiq_12) {
        dae_0.cV((short)17727);
    }

    public static void onShortcutOver(flg_2 flg_22) {
        fse_1.gFu().f("shortcutOver", flg_22.getItemValue());
    }

    public static void onShortcutOut(flg_2 flg_22) {
        fse_1.gFu().f("shortcutOver", (Object)null);
    }

    public static void restore(fiq_1 fiq_12) {
        dae_0.cV((short)19495);
    }

    public static void setInteractionOnLeftClick(flv_2 flv_22) {
        cfj_1.a(flv_22.bqr(), bsn_1.ljj);
    }

    public static void setDefaultSplitMode(flv_2 flv_22) {
        cfj_1.a(flv_22.bqr(), bsn_1.ljt);
    }

    public static void setOverHeadDelay(fiq_1 fiq_12) {
        if (fiq_12 != null && fiq_12 instanceof flw_2) {
            bsn_1 bsn_12 = bsn_1.lju;
            mWR.put(bsn_12.hashCode(), (Object)new cgl_1(fiq_12, bsn_12));
        }
    }

    public static void setAutoSwitchBarsMode(flv_2 flv_22) {
        cfj_1.a(flv_22.bqr(), bsn_1.ljw);
    }

    public static void setEmoteIconsActivated(flv_2 flv_22) {
        cfj_1.a(flv_22.bqr(), bsn_1.ljB);
    }

    public static void setTipsActivated(flv_2 flv_22) {
        cfj_1.a(flv_22.bqr(), bsn_1.ljD);
    }

    public static void setBattlegroundNotificationActivated(flv_2 flv_22) {
        cfj_1.a(flv_22.bqr(), bsn_1.ljE);
    }

    public static void setShowPvpExtractionActivation(flv_2 flv_22) {
        cfj_1.a(flv_22.bqr(), bsn_1.lkz);
    }

    public static void setAddSeedsToShortcutBar(flv_2 flv_22) {
        cfj_1.a(flv_22.bqr(), bsn_1.ljR);
    }

    public static void setChatAutomaticDisactivation(flv_2 flv_22) {
        cfj_1.a(flv_22.bqr(), bsn_1.ljz);
    }

    public static void setChatLockFade(flv_2 flv_22) {
        bsn_1 bsn_12 = bsn_1.lji;
        int n = bsn_12.hashCode();
        boolean bl = flv_22.bqr();
        cfj_1.jQ(bl);
        mWR.put(bsn_12.hashCode(), (Object)new cgm_2(bsn_12, bl));
    }

    public static void setChatTime(flv_2 flv_22) {
        cfj_1.a(flv_22.bqr(), bsn_1.ljI);
        aPt.cAg().cAz();
    }

    public static void setChatAutoChangeChannel(flv_2 flv_22) {
        cfj_1.a(flv_22.bqr(), bsn_1.ljJ);
    }

    static void jQ(boolean bl) {
        Object object = aPt.cAg().cAn();
        while (object.hasNext()) {
            object.advance();
            int n = ((apr_0)object.value()).czm();
            if (bl) {
                aPd.p(n, true);
                continue;
            }
            aPd.o(n, true);
        }
        object = new dae_0();
        ((ama_1)object).lK(17698);
        ((ama_1)object).cC(!bl);
        aaw_1.bUq().h((aam_2)object);
    }

    public static void setFontSize(flw_2 flw_22) {
        bsn_1 bsn_12 = bsn_1.ljA;
        int n = (int)flw_22.getValue();
        if (mWO == -1) {
            mWO = ((bsg_1)aie_0.cfn().bmH()).d(bsn_12);
        }
        cfj_1.LX(n);
        mWR.put(bsn_12.hashCode(), (Object)new cgn_2());
    }

    static void LX(int n) {
        bsn_1 bsn_12 = bsn_1.ljA;
        apv_0 apv_02 = apv_0.values()[n];
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_12, apv_02.ordinal());
        fse_1.gFu().a((aef_2)aPt.cAg(), "chatTextStyle");
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), bsn_12.getKey());
        for (apn_0 apn_02 : aPt.cAg().cAt()) {
            fse_1.gFu().a((aef_2)apn_02, "history");
        }
    }

    public static void setViewedLanguage(flv_2 flv_22, String string) {
        bsn_1 bsn_12;
        if (fse_1.gFu().dp("isClientLanguageRestricted")) {
            return;
        }
        switch (Mv.f(string, true)) {
            case aVk: {
                bsn_12 = bsn_1.lks;
                break;
            }
            case aVl: {
                bsn_12 = bsn_1.lkt;
                break;
            }
            case aVm: {
                bsn_12 = bsn_1.lku;
                break;
            }
            case aVn: {
                bsn_12 = bsn_1.lkv;
                break;
            }
            default: {
                return;
            }
        }
        cfj_1.a(flv_22.bqr(), bsn_12);
        mWP = true;
    }

    public static void onLanguageDisplayModeChange(flk_2 flk_22) {
        bsn_1 bsn_12 = bsn_1.lkx;
        bsb_1 bsb_12 = bsb_1.Ju(((bsg_1)aie_0.cfn().bmH()).d(bsn_12));
        bsb_1 bsb_13 = (bsb_1)flk_22.getValue();
        if (bsb_12 == null || bsb_13 == null || bsb_12 == bsb_13) {
            return;
        }
        mWR.put(bsn_12.hashCode(), (Object)new cgo_2(bsn_12, bsb_13, bsb_12));
    }

    private static void a(boolean bl, afe afe2) {
        mWR.put(afe2.hashCode(), (Object)new cgp_2(afe2, bl));
    }

    public static void cancel(fiq_1 fiq_12) {
        if (mWR.isEmpty()) {
            cfj_1.closeOptionsDialog(fiq_12);
            return;
        }
        fiq_2.gCw().d(fik_2.a((String string) -> {
            cfj_1.cancel();
            cfj_1.closeOptionsDialog(fiq_12);
        }).l("question.confirmCloseOptionsWithChanges", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
    }

    public static void cancel() {
        TIntObjectIterator<amc_1> tIntObjectIterator = mWR.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((cgz_1)tIntObjectIterator.value()).cancel();
        }
        mWR.clear();
        tIntObjectIterator = cxh_2.eWD().eWG();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            amc_1 amc_12 = (amc_1)tIntObjectIterator.value();
            amc_1 amc_13 = aUm.cUI().fb(amc_12.getId());
            try {
                cxh_2.eWD().a(amc_12.getId(), amc_12.bCC(), amc_12.bCD(), amc_12.bCE(), amc_12.bCM());
                String string = amc_12.bCN();
                cxh_2.eWD().d(amc_13, string);
            }
            catch (Exception exception) {
                mWL.error((Object)"Exception during cancel", (Throwable)exception);
            }
        }
        mWP = false;
    }

    public static void apply(fiq_1 fiq_12) {
        Object object = mWR.iterator();
        while (object.hasNext()) {
            object.advance();
            ((cgz_1)object.value()).eKD();
        }
        mWR.clear();
        if (mWN) {
            object = cxh_2.eWD().eWE();
            ((dcN)object).a(((dcN)object).fco(), ((dcN)object).fcp(), ((dcN)object).fcq());
            mWN = false;
        }
        if (mWP) {
            dae_0.cV((short)16188);
            mWP = false;
        }
        cfj_1.closeOptionsDialog(fiq_12);
    }

    public static void setBindText(fiq_1 fiq_12, fdu_1 fdu_12, aUl aUl2) {
        if (fiq_12 instanceof fle_2 && ((fle_2)fiq_12).gDO()) {
            mWM = true;
            return;
        }
        if (fiq_12 instanceof fle_2 && !((fle_2)fiq_12).gDO() || fiq_12 instanceof fli_2 && ((fli_2)fiq_12).bCC() == 10) {
            String string = fdu_12.getText();
            if (string == null) {
                fiq_2.gCw().d(fik_2.gBZ().l("notification.emptyField", new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
                return;
            }
            if (!string.equals(aUl2.getText())) {
                dcf dcf2 = new dcf(aUl2);
                dcf2.fa(string);
                dcf2.lK(17912);
                aaw_1.bUq().h(dcf2);
            }
            mWM = false;
        }
    }

    public static void reloadTheme(flp_2 flp_22) {
        dae_0.cV((short)19622);
    }

    public static void refreshCustomThemeList(flp_2 flp_22) {
        dae_0.cV((short)19315);
    }

    public static void openThemeFolder(flp_2 flp_22) {
        String string = WakfuClient.dSV.cfi();
        if (fq_0.bQ(string)) {
            return;
        }
        String string2 = WakfuClient.dSV.ceT();
        if (!fq_0.bQ(string2)) {
            cfj_1.showErrorOpenOnOpenFolderError(string);
        }
    }

    public static void openSelectedThemeFolder(flp_2 flp_22) {
        fsp_2 fsp_22;
        fsf_1 fsf_12 = fse_1.gFu().getProperty("selectedTheme");
        fsp_2 fsp_23 = fsp_22 = fsf_12 != null && fsf_12.getValue() instanceof fsp_2 ? (fsp_2)fsf_12.getValue() : null;
        if (fsp_22 == null) {
            mWL.info((Object)"selectedTheme is null ");
            return;
        }
        if (fsp_22.gFV() == null) {
            cfj_1.openThemeFolder(flp_22);
            return;
        }
        String string = WakfuClient.dSV.cfi() + "/" + fsp_22.gFV();
        if (!fq_0.bQ(string)) {
            cfj_1.showErrorOpenOnOpenFolderError(string);
        }
    }

    public static void showErrorOpenOnOpenFolderError(@NotNull String string) {
        String string3 = string;
        try {
            string3 = fq_0.bP(string).getAbsolutePath();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        String string4 = string3;
        fiq_2.gCw().d(fik_2.gBZ().l("error.unable.to.open.folder", string4).a(fin_2.uCz).pc(true).vG(ccp_2.mRF.byf()).a(new fil_2(301).m("copy", new Object[0]).c(string2 -> bh_0.aI(string4))));
    }

    public static void toggleReverseYesNoButtons(flv_2 flv_22) {
        cfj_1.a(flv_22.bqr(), aff.cpO);
    }

    public static void toggleEnchantUIParticles(flv_2 flv_22) {
        aff aff2 = aff.cpP;
        boolean bl = flv_22.bqr();
        mWR.put(aff2.hashCode(), (Object)new cgq_2(aff2, bl));
    }

    public static void toggleKeepSecondHudButtonsColumn(flv_2 flv_22) {
        bsn_1 bsn_12 = bsn_1.lkW;
        boolean bl = flv_22.bqr();
        mWR.put(bsn_12.hashCode(), (Object)new cgs_2(bsn_12, bl));
    }

    static {
        mWN = false;
        mWO = -1;
        mWP = false;
        mWR = new TIntObjectHashMap();
        mWS = -1;
        mWT = null;
    }
}

