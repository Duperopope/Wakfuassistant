/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.zaap.ZaapParametersSources
 *  com.ankamagames.steam.wrapper.SteamApi
 *  org.apache.log4j.Logger
 */
import com.ankama.zaap.ZaapParametersSources;
import com.ankamagames.steam.wrapper.SteamApi;
import com.ankamagames.wakfu.client.console.command.debug.CinematicsSelectorCommand;
import com.ankamagames.wakfu.client.console.command.xulor.NinePatchCommand;
import com.ankamagames.wakfu.client.console.command.xulor.ThemeInfoCommand;
import org.apache.log4j.Logger;

/*
 * Renamed from cDd
 */
@fyf_0
public class cdd_2 {
    protected static final Logger mSN = Logger.getLogger(cdd_2.class);
    public static final String PACKAGE = "wakfu";
    public static final String mSO = "item";
    public static final String mSP = "state";
    private static faw_2 mSQ;
    private static final alx_2 mSR;

    public static void quit(fiq_1 fiq_12) {
        dae_0.cV((short)18253);
    }

    public static void cancelSteamLink(fiq_1 fiq_12) {
        fyw_0.gqw().tl("steamLinkAccountDialog");
        crh_2.eML().bCj();
        aue_0.cVJ().kH("Cancel Steam Link");
        aue_0.cVJ().a(csn_2.eNY());
    }

    public static void moderatorRequestUserRequest(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(cwl_2.eWm())) {
            fiq_2.gCw().d(fik_2.gBZ().l("moderator.error.chatStillOpened", new Object[0]));
        } else {
            nh_0 nh_02 = new nh_0();
            aue_0.cVJ().etu().d(nh_02);
        }
    }

    public static void onLanguageSelected(flk_2 flk_22) {
        if (flk_22.bqr()) {
            auo_0 auo_02 = (auo_0)flk_22.getValue();
            daE daE2 = new daE();
            daE2.d(auo_02.aUXX());
            aaw_1.bUq().h(daE2);
            ((bsg_1)aie_0.cfn().bmH()).a((afe)aff.cpI, auo_02.aUXX().aUK());
        }
    }

    public static void setLanguage(fiq_1 fiq_12, String string) {
        daE daE2 = new daE();
        daE2.d(Mv.cM(string));
        aaw_1.bUq().h(daE2);
        ((bsg_1)aie_0.cfn().bmH()).a((afe)aff.cpI, string);
    }

    public static void selectServer(fiq_1 fiq_12, fdu_1 fdu_12, fdu_1 fdu_13) {
        cdd_2.selectServer(fiq_12, fdu_12, fdu_13, null);
    }

    public static void selectServer(fiq_1 fiq_12, fdu_1 fdu_12, fdu_1 fdu_13, fdd_2 fdd_22) {
        boolean bl;
        if (fiq_12 instanceof fli_2 && ((fli_2)fiq_12).bCC() != 10) {
            return;
        }
        boolean bl2 = fse_1.gFu().dp("demo");
        String string = fdu_12.getText();
        String string2 = bl2 ? "demo" : fdu_13.getText();
        boolean bl3 = bl = fdd_22 != null && fdd_22.getSelected();
        if (string != null && string2 != null && !string.isEmpty() && !string2.isEmpty()) {
            daF daF2 = new daF();
            daF2.oi(string);
            daF2.oj(string2);
            daF2.k(bl);
            aaw_1.bUq().h(daF2);
            cAY.eHc().nP(600002L);
        } else {
            fiq_2.gCw().d(fik_2.gBZ().a(fin_2.uCs).l("logon.invalidForm", new Object[0]).vG(ccp_2.mRF.byf()).abQ(2));
        }
    }

    public static void loginWithLauncher(flp_2 flp_22) {
        mSN.info((Object)"Launcher Button clicked");
        boolean bl = fse_1.gFu().dp("demo");
        if (bl) {
            mSN.info((Object)"Demo mode. Pushing normal auth frame.");
            euG.fdj();
            return;
        }
        ZaapParametersSources zaapParametersSources = euG.fdi();
        euG.ors.a(new cde_2(), zaapParametersSources);
        czc_1.qY("logonDialog");
    }

    public static void fadeLogonDialogBackIn() {
        vt_0.b(() -> czc_1.qW("logonDialog"));
    }

    public static void openMenuDialog(fiq_1 fiq_12) {
        dae_0.cV((short)18539);
    }

    public static void openReportBugDialog(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(cwq_2.eVS())) {
            aue_0.cVJ().b(cwq_2.eVS());
        }
        dae_0.cV((short)16121);
    }

    public static void openAdminMonitorPanel(fiq_1 fiq_12) {
        dae_0.cV((short)19471);
    }

    public static void openAdminCharacterEditor(fiq_1 fiq_12) {
        dae_0.cV((short)19040);
    }

    public static void openThemeInfoDialog(fiq_1 fiq_12) {
        ThemeInfoCommand.cUx();
    }

    public static void reloadTheme(fiq_1 fiq_12) {
        cxh_2.eWD().eWJ();
    }

    public static void changeGameLanguage(fiq_1 fiq_12, String string) {
        Mv mv = Mv.f(string, true);
        if (mv == null) {
            return;
        }
        aum_0.cWf().d(mv);
        cxh_2.eWD().eWJ();
    }

    public static void openNinePatch(fiq_1 fiq_12) {
        NinePatchCommand.cUw();
    }

    public static void openCinematicsSelectorDialog(fiq_1 fiq_12) {
        CinematicsSelectorCommand.cTS();
    }

    public static void openAdminTranslatorDialog(fiq_1 fiq_12) {
        cdo_2.openAdminTranslatorDialog(fiq_12);
    }

    public static void openAdminTextFormattingDialog(fiq_1 fiq_12) {
        cdn_2.openAdminTranslatorDialog(fiq_12);
    }

    public static void openNeoRoadmap(fiq_1 fiq_12) {
        chi_1.openRoadmap(fiq_12);
    }

    public static void openRanchBuildingList(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(cxn_1.eXv())) {
            aue_0.cVJ().b(cxn_1.eXv());
        } else {
            aue_0.cVJ().a(cxn_1.eXv());
        }
    }

    public static void openStuffDebugPreviewEditor(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(cys_2.eXV())) {
            aue_0.cVJ().b(cys_2.eXV());
        } else {
            aue_0.cVJ().a(cys_2.eXV());
        }
    }

    public static void hackClientRights(fiq_1 fiq_12) {
        evd_2 evd_22 = aue_0.cVJ().cVK().dpL();
        boolean bl = !evd_22.fdW();
        evd_22.ld(bl);
        fse_1.gFu().f("rightsHackMode", bl);
    }

    public static void moderation(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(cwj_1.nTI)) {
            aue_0.cVJ().b(cwj_1.nTI);
        } else {
            aue_0.cVJ().a(cwj_1.nTI);
        }
    }

    public static void toggleXulorInspector(fiq_1 fiq_12) {
        if (fht_2.gBk().gBl()) {
            cdd_2.eJP();
        } else {
            cdd_2.eJO();
        }
    }

    private static void eJO() {
        fyw_0.gqw().a(mSR);
        ccj_2.g("xulorInspectionResultDialog", 32768L);
        faw_2 faw_22 = (faw_2)ccj_2.g("xulorInspectionHighlightDialog", 8200L);
        fht_2.gBk().a(fes_22 -> {
            if (fes_22 == null) {
                return;
            }
            faw_22.setPosition(fbj_1.getInstance().getRelativePosition(fes_22));
            faw_22.setSize(fes_22.getSize());
        });
        fht_2.gBk().start();
    }

    private static void eJP() {
        fyw_0.gqw().b(mSR);
        fyw_0.gqw().tl("xulorInspectionResultDialog");
        fyw_0.gqw().tl("xulorInspectionHighlightDialog");
        fht_2.gBk().a(null);
        fht_2.gBk().bhk();
    }

    public static void closePrivateMessageDialog(fiq_1 fiq_12) {
        dae_0.cV((short)16719);
    }

    public static boolean checkNameValidity(String string) {
        String string2;
        int[] nArray = aue_0.cVJ().cVO().cWq();
        if (evm_2.b(nArray, evn_2.ouZ) && string.length() <= 25 && string.length() >= 3) {
            return true;
        }
        eik_0 eik_02 = eii_0.sc(string);
        char c2 = eik_02.fwE();
        switch (eik_02.fwM()) {
            case qxr: {
                string2 = aum_0.cWf().c("error.characterCreation.forbiddenName", new Object[0]);
                break;
            }
            case qxs: {
                if (c2 != '\uffffffff') {
                    string2 = aum_0.cWf().c("error.characterCreation.invalidDashPosition2", Character.valueOf(c2));
                    break;
                }
                string2 = aum_0.cWf().c("error.characterCreation.invalidDashPosition", new Object[0]);
                break;
            }
            case qxj: {
                string2 = aum_0.cWf().c("error.characterCreation.tooManyConsonant", new Object[0]);
                break;
            }
            case qxk: {
                string2 = aum_0.cWf().c("error.characterCreation.tooManyVowel", new Object[0]);
                break;
            }
            case qxh: {
                string2 = aum_0.cWf().c("error.characterCreation.nameTooLong", new Object[0]);
                break;
            }
            case qxg: {
                string2 = aum_0.cWf().c("error.characterCreation.nameTooShort", new Object[0]);
                break;
            }
            case qxi: {
                if (c2 != '\uffffffff') {
                    string2 = aum_0.cWf().c("error.characterCreation.badChar2", String.valueOf(c2));
                    break;
                }
                string2 = aum_0.cWf().c("error.characterCreation.badChar", new Object[0]);
                break;
            }
            case qxl: {
                string2 = aum_0.cWf().c("error.characterCreation.tooManyConsecutiveIdentical", new Object[0]);
                break;
            }
            case qxm: {
                string2 = aum_0.cWf().c("error.characterCreation.tooFewVowelInPart", new Object[0]);
                break;
            }
            case qxn: {
                string2 = aum_0.cWf().c("error.characterCreation.tooFewConsonantInPart", new Object[0]);
                break;
            }
            case qxo: {
                string2 = aum_0.cWf().c("error.characterCreation.tooManySpecialInPart", new Object[0]);
                break;
            }
            case qxp: {
                string2 = aum_0.cWf().c("error.characterCreation.parTooLong", new Object[0]);
                break;
            }
            case qxq: {
                string2 = aum_0.cWf().c("error.characterCreation.tooManySpecial", new Object[0]);
                break;
            }
            case qxt: {
                string2 = aum_0.cWf().c("error.characterCreation.nameWithBadCase", new Object[0]);
                break;
            }
            default: {
                return true;
            }
        }
        fiq_2.gCw().d(fik_2.gBZ().a(fin_2.uCs).vE(string2).vG(ccp_2.mRF.byf()).abQ(2));
        return false;
    }

    public static String formatNumber(String string) {
        Object object = "";
        if (string != null && string.length() > 0) {
            int n = 1;
            while (string.length() > 3 * n) {
                object = "." + string.substring(string.length() - 3 * n, string.length() - 3 * (n - 1)) + (String)object;
                ++n;
            }
            object = string.substring(0, string.length() - 3 * (n - 1)) + (String)object;
        }
        return object;
    }

    public static int parseStringNumber(String string) {
        string = string.replaceAll("\\.", "");
        try {
            return Integer.parseInt(string);
        }
        catch (Exception exception) {
            mSN.error((Object)("Exception during parseStringNumber(" + string + ")"), (Throwable)exception);
            return Integer.MAX_VALUE;
        }
    }

    public static void openItemDetailWindow(flg_2 flg_22, fey_2 fey_22) {
        if (flg_22.gEm()) {
            ffV ffV2 = null;
            Object object = flg_22.getItemValue();
            if (object instanceof bea_0) {
                ffV2 = ((bea_0)object).getItem();
            } else if (object instanceof btx) {
                ffV2 = fgD.fXh().Ve(((btx)object).duo().d());
            }
            cdd_2.sendOpenCloseItemDetailMessage(fey_22 == null ? null : fey_22.getElementMap().getId(), ffV2);
        }
    }

    public static ffV getItemWithReferenceItem(fhc_0 fhc_02) {
        ffV ffV2 = new ffV(fhc_02.d());
        ffV2.l(fhc_02);
        ffV2.ak((short)1);
        return ffV2;
    }

    public static void sendOpenCloseItemDetailMessage(String string, fhc_0 fhc_02) {
        cdd_2.sendOpenCloseItemDetailMessage(string, cdd_2.getItemWithReferenceItem(fhc_02));
    }

    public static void sendOpenCloseItemDetailMessage(fhc_0 fhc_02, int n, int n2) {
        cdd_2.sendOpenCloseItemDetailMessage(cdd_2.getItemWithReferenceItem(fhc_02), n, n2);
    }

    public static dbE getOpenCloseItemDetailMessage(ffV ffV2) {
        dbE dbE2;
        if (ffV2.adO()) {
            dbE2 = new dbo_0<bjm_0>(new bjm_0(ffV2));
            dbE2.lK(19685);
        } else {
            dbE2 = new dbk_0();
            dbE2.lK(16264);
            dbE2.c(ffV2);
        }
        return dbE2;
    }

    public static void sendOpenCloseItemDetailMessage(String string, ffV ffV2) {
        cdd_2.sendOpenCloseItemDetailMessage(string, ffV2, false);
    }

    public static void sendOpenCloseItemDetailMessage(String string, ffV ffV2, boolean bl) {
        dbE dbE2 = cdd_2.getOpenCloseItemDetailMessage(ffV2);
        dbE2.rb(string);
        dbE2.kX(bl);
        aaw_1.bUq().h(dbE2);
    }

    public static void sendOpenCloseItemDetailMessage(ffV ffV2, int n, int n2) {
        dbE dbE2 = cdd_2.getOpenCloseItemDetailMessage(ffV2);
        dbE2.setX(n);
        dbE2.setY(n2);
        aaw_1.bUq().h(dbE2);
    }

    public static void openRefItemDetailWindow(fiq_1 fiq_12, bgv_2 bgv_22) {
        cdd_2.sendOpenCloseItemDetailMessage(((fhv_1)fiq_12.gBE()).getElementMap().gAt(), bgv_22);
    }

    public static void sendOpenItemDetailMessage(String string, ffV ffV2, boolean bl) {
        dbE dbE2;
        if (ffV2.adO()) {
            dbE2 = new dbo_0<bjm_0>(new bjm_0(ffV2));
            dbE2.lK(18746);
        } else {
            dbE2 = new dbk_0();
            dbE2.lK(16369);
            dbE2.c(ffV2);
        }
        dbE2.rb(string);
        dbE2.kX(bl);
        aaw_1.bUq().h(dbE2);
    }

    public static void sendCloseItemDetailMessage(String string, ffV ffV2, boolean bl) {
        dbE dbE2;
        if (ffV2.adO()) {
            dbE2 = new dbo_0<bjm_0>(new bjm_0(ffV2));
            dbE2.lK(19865);
        } else {
            dbE2 = new dbk_0();
            dbE2.lK(19714);
            dbE2.c(ffV2);
        }
        dbE2.rb(string);
        dbE2.kX(bl);
        aaw_1.bUq().h(dbE2);
    }

    public static void openItemDetailWindow(flg_2 flg_22) {
        cdd_2.openItemDetailWindow(flg_22, null);
    }

    public static boolean openLinkInBrowser(fiq_1 fiq_12) {
        fdy_1 fdy_12;
        fgb_2 fgb_22;
        if (fiq_12.gBE() instanceof fdy_1 && (fgb_22 = (fdy_12 = (fdy_1)fiq_12.gBE()).getBlockUnderMouse()) != null && fgb_22.gyV() == fgc_2.uuh) {
            String string;
            fgk_2 fgk_22 = fgb_22.gyW();
            if (fgk_22 == null) {
                return false;
            }
            if (fgk_22.gzE() == ahr_2.dSC && (string = ((fgm_1)fgk_22).getId()) != null) {
                cdd_2.pn(string);
                return true;
            }
        }
        return false;
    }

    public static void openInBrowser(fiq_1 fiq_12, String string) {
        cdd_2.pn(string);
    }

    static void pn(String string) {
        if (string == null) {
            return;
        }
        if (bMX.kAi.blc()) {
            SteamApi.SteamFriends().ActivateGameOverlayToWebPage(string);
        } else {
            aet_1.ht(string);
        }
    }

    public static void createAccount(fiq_1 fiq_12) {
        try {
            String string = auc_0.cVq().bS("accountCreationUrl");
            String string2 = String.format(string, aum_0.cWf().aUXX().aUR());
            cdd_2.pn(string2);
        }
        catch (fu_0 fu_02) {
            fu_02.printStackTrace();
        }
    }

    public static void forgottenPassword(fiq_1 fiq_12) {
        try {
            String string = auc_0.cVq().bS("forgottenPasswordUrl");
            String string2 = String.format(string, aum_0.cWf().aUXX().aUR());
            cdd_2.pn(string2);
        }
        catch (fu_0 fu_02) {
            fu_02.printStackTrace();
        }
    }

    public static void linkSteamAccount(fiq_1 fiq_12) {
        try {
            String string = auc_0.cVq().bS("linkSteamAccountUrl");
            awt_0.hvW.a(new cdg_2(string));
        }
        catch (fu_0 fu_02) {
            fu_02.printStackTrace();
        }
    }

    public static void checkAntiAddictionAccount(fiq_1 fiq_12) {
        try {
            String string = auc_0.cVq().bS("antiAddictionAccountCheckURL");
            String string2 = String.format(string, aum_0.cWf().aUXX().aUR());
            cdd_2.pn(string2);
        }
        catch (fu_0 fu_02) {
            fu_02.printStackTrace();
        }
    }

    public static void validateNickname(fiq_1 fiq_12, fdu_1 fdu_12) {
        String string = fdu_12.getText();
        if (string.length() < 3) {
            fiq_2.gCw().d(fik_2.gBZ().a(fin_2.uCs).l("error.connection.nicknameTooShort", new Object[0]).vG(ccp_2.mRF.byf()).abQ(2));
        } else if (string.equalsIgnoreCase(aue_0.cVJ().etm())) {
            fiq_2.gCw().d(fik_2.gBZ().a(fin_2.uCs).l("error.connection.nicknameEqualsLogin", new Object[0]).vG(ccp_2.mRF.byf()).abQ(2));
        } else {
            dae_0 dae_02 = new dae_0();
            dae_02.lK(16834);
            dae_02.fa(string);
            aaw_1.bUq().h(dae_02);
            fyw_0.gqw().tl("nicknameChoiceDialog");
        }
    }

    private static void a(boolean bl, fes_2 fes_22) {
        int n;
        int n2;
        if (bl) {
            n2 = awx_2.dnC.aTn();
            n = awx_2.dnF.aTn();
        } else {
            n2 = awx_2.dnF.aTn();
            n = awx_2.dnC.aTn();
        }
        if (bl) {
            cAY.eHc().eHq();
        } else {
            cAY.eHc().eHr();
        }
        awx_2 awx_22 = new awx_2(n2);
        awx_2 awx_23 = new awx_2(n);
        fes_22.getAppearance().x(fsa_2.class);
        fsa_2 fsa_22 = new fsa_2(awx_22, awx_23, fes_22.getAppearance(), 0, 500, 1, false, abn.cdr);
        fes_22.getAppearance().a(fsa_22);
    }

    public static void displayQuests(fiq_1 fiq_12) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("verticalFollowedAchievementsDialog");
        if (fhs_22 == null) {
            fhs_22 = fyw_0.gqw().gqC().uR("followedAchievementsDialog");
        }
        if (fhs_22 == null) {
            return;
        }
        fey_2 fey_22 = (fey_2)fhs_22.uH("window");
        int n = fey_22.getY() + fey_22.getHeight();
        fey_22.setVisible(false);
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        boolean bl = !fse_1.gFu().dp("followedQuestsDisplay");
        bsg_12.a((afe)bsn_1.ljM, bl);
        czm_2.eZa();
        fey_22.a(new cdh_2(fey_22, n));
    }

    public static void compassObjective(flv_2 flv_22, bcc_2 bcc_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (flv_22.bqr()) {
            bcm_1.hIK.a(bgt_02.Sn(), bcc_22.d(), bgt_02.aqZ());
        } else if (bcm_1.hIK.Bp(bcc_22.d())) {
            bcm_1.hIK.a(bgt_02.Sn(), -1, bgt_02.aqZ());
        }
    }

    public static void shop(fiq_1 fiq_12) {
        cyr_2.eYA().eYB();
    }

    public static void openShopOnConversionStone(fiq_1 fiq_12) {
        cyr_2.eYA().eYD();
    }

    public static void openBoosterShop(fiq_1 fiq_12) {
        cyr_2.eYA().qU("WAKFU_BOOSTER_PACK");
    }

    public static void connectWithSteam(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(17064);
        aaw_1.bUq().h(dae_02);
        cAY.eHc().nP(600002L);
    }

    public static void nationPvpLadderDialog(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(cwu_2.nTW)) {
            aue_0.cVJ().b(cwu_2.nTW);
        } else {
            aue_0.cVJ().a(cwu_2.nTW);
        }
    }

    public static void toggleBattlegroundBarDetail(flv_2 flv_22) {
        if (flv_22.bqr() != fse_1.gFu().dp("battlegroundBarDetail")) {
            dae_0 dae_02 = new dae_0(16419);
            dae_02.cC(flv_22.bqr());
            aaw_1.bUq().h(dae_02);
        }
    }

    public static boolean displayBattlegroundExplanation(fiq_1 fiq_12, bfh_0 bfh_02) {
        dae_0 dae_02 = new dae_0(17294);
        dae_02.sY(bfh_02.dfF().ghb());
        aaw_1.bUq().h(dae_02);
        return true;
    }

    public static void showItemPopup(flg_2 flg_22, frx_1 frx_12) {
        cdd_2.showItemPopup(flg_22, frx_12, (fes_2)flg_22.gBE());
    }

    public static void showItemPopup(flg_2 flg_22, frx_1 frx_12, fes_2 fes_22) {
        Object object = flg_22.getItemValue();
        if (object == null) {
            return;
        }
        if (object instanceof ffV) {
            cgn_1.showPopup(flg_22, (ffV)object, frx_12, fes_22);
        } else if (object instanceof fgf_0) {
            fgf_0 fgf_02 = (fgf_0)object;
            if (!fgf_02.fWI()) {
                return;
            }
            ffV ffV2 = fgf_02.getItem();
            if (ffV2 == null) {
                return;
            }
            cgn_1.showPopup(flg_22, ffV2, frx_12, fes_22);
        } else if (object instanceof bek_0) {
            bgv_2 bgv_22 = ((bek_0)object).duo();
            if (bgv_22 == null) {
                return;
            }
            ffV ffV3 = fgD.fXh().Ve(bgv_22.d());
            if (ffV3 == null) {
                mSN.warn((Object)String.format("ReferenceItem with id %s(%d) isn't found by ReferenceItemManager", bgv_22.getName(), bgv_22.d()));
                cgn_1.showPopup(flg_22, bgv_22, frx_12, fes_22);
            } else {
                cgn_1.showPopup(flg_22, ffV3, frx_12, fes_22);
            }
        }
    }

    public static void transferClickEventToWorldInteractionFrame(flp_2 flp_22) {
        if (flp_22.gBE() instanceof fad_1) {
            return;
        }
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        float f2 = fyw_0.gqw().gqD().getScale();
        float f3 = aIs2.bRr() - f2 * (float)flp_22.getScreenY();
        dcm_0.aj(Math.round(f2 * (float)flp_22.getScreenX()), Math.round(f3), flp_22.fca());
    }

    public static void openGuide(fiq_1 fiq_12, String string) {
        cuy_1.eTo().Nd(Integer.parseInt(string));
    }

    public static void switchPvpMode(fiq_1 fiq_12, String string) {
        fpu_0 fpu_02 = fpu_0.valueOf(string);
        aaw_1.bUq().h(new dae_0(17589, (Object)fpu_02));
    }

    public static void logEvent(fiq_1 fiq_12) {
        StringBuilder stringBuilder = new StringBuilder(fiq_12.toString());
        Object t = fiq_12.gBE();
        if (t instanceof fgt_2) {
            stringBuilder.append(String.format(" with following text : \"%s\"", ((fgt_2)t).getText()));
        }
        mSN.info((Object)stringBuilder.toString());
    }

    public static void hideAchievementPopup(fiq_1 fiq_12) {
        fse_1.gFu().f("describedAchievement", (Object)null);
        fyd_0.closePopup(fiq_12);
    }

    public static void openRanch(fiq_1 fiq_12, String string) {
        vt_0.b(() -> aue_0.cVJ().etu().d(new cnl_0(Integer.parseInt(string))));
    }

    public static void closeRanch(fiq_1 fiq_12) {
        vt_0.b(() -> aue_0.cVJ().etu().d(new cnk_0()));
    }

    static {
        mSR = string -> {
            if ("xulorInspectionResultDialog".equals(string)) {
                cdd_2.eJP();
            }
        };
    }
}

