/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntByteHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.wakfu.client.console.command.commonIn.ChatCommand;
import com.ankamagames.wakfu.client.console.command.commonIn.GetPrivateContactCommand;
import gnu.trove.map.hash.TIntByteHashMap;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cDC
 */
@fyf_0
public class cdc_1 {
    private static final Logger mTD = Logger.getLogger(cdc_1.class);
    public static final String PACKAGE = "wakfu.chat";
    public static final String mTE = "textEditorRenderableContainer.chatInput";
    public static final String mTF = "%s \"%s\" ";
    public static final String mTG = ".*\".*\".*";
    public static final String mTH = "chatMainContainer";
    private static String mTI = null;
    private static ffV mTJ = null;
    private static fkk_1 mTK;
    private static final String mTL = "/w (&quot;.*&quot;|[^&quot;][\\p{L}'-]*[^&quot;])\\s+(.*)(^(.*)$)*";
    private static final String mTM = "/c (&quot;.*&quot;|[^&quot;][\\p{L}\\p{N}'-]*[^&quot;])\\s+(.*)(^(.*)$)*";
    private static final TIntByteHashMap mTN;
    private static final cdp_1 mTO;
    private static final fis_1 mTP;

    public static boolean processKeyTyped(fli_2 fli_22, fix_2 fix_22, aOY aOY2) {
        fix_22.gBS();
        fsf_1 fsf_12 = fix_22.getProperty("chat").wf("currentView");
        if (fsf_12 == null) {
            return false;
        }
        fsf_12.gFC();
        String string = aOY2.cyL();
        Object object = fsf_12.wc("input");
        if (!aPh.czg().czh().cBz()) {
            aPh.czg().czh().jA((String)object);
        }
        boolean bl = fli_22.gDQ();
        if (fli_22.gDW() == '\n') {
            fix_22.gBS();
            if (((String)object).isEmpty() || aPh.czg().czk()) {
                aPh.czg().eB(false);
                return true;
            }
            if (!((String)object).startsWith("/") && string != null && !string.isEmpty()) {
                object = string + " " + (String)object;
            }
            String string2 = cdc_1.pr((String)object);
            daw daw2 = new daw();
            daw2.co(string2);
            daw2.b(aOY2);
            aaw_1.bUq().h(daw2);
            fsf_12.c("input", (Object)"");
            if (((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljz)) {
                fhw_2.gAL().s(null);
            }
            return true;
        }
        return false;
    }

    public static boolean processKeyPressed(fli_2 fli_22, fix_2 fix_22, aOY aOY2) {
        fsf_1 fsf_12 = fix_22.getProperty("chat").wf("currentView");
        if (fsf_12 == null) {
            return false;
        }
        switch (fli_22.bCC()) {
            case 10: {
                fix_22.gBS();
                String string = fsf_12.wc("input");
                if (string.isEmpty()) {
                    fhw_2.gAL().s(null);
                }
                return true;
            }
            case 27: {
                fhw_2.gAL().s(null);
                ((fdz_1)fli_22.gBE()).setText("");
                return true;
            }
            case 38: {
                if (fli_22.gDQ()) {
                    GetPrivateContactCommand.eR(false);
                    return true;
                }
                String string = aPh.czg().czh().cBx();
                string = cdc_1.al(aOY2.cyL(), string);
                fsf_12.c("input", (Object)string);
                return true;
            }
            case 40: {
                if (fli_22.gDQ()) {
                    GetPrivateContactCommand.eR(true);
                    return true;
                }
                String string = aPh.czg().czh().cBy();
                string = cdc_1.al(aOY2.cyL(), string);
                fsf_12.c("input", (Object)string);
                return true;
            }
        }
        return false;
    }

    @NotNull
    private static String pr(String string) {
        if (string.matches(mTG)) {
            return string;
        }
        Optional<String> optional = cdc_1.ps(string);
        if (optional.isEmpty()) {
            return string;
        }
        String string2 = optional.get();
        return string2.length() <= 2 ? string : string.replaceFirst(string2, "\"" + string2 + "\"");
    }

    private static Optional<String> ps(String string) {
        Optional<String> optional = cdc_1.a(string, mTL, aPa.evr);
        if (optional.isPresent()) {
            return optional;
        }
        return cdc_1.a(string, mTM, aPa.evw);
    }

    private static Optional<String> a(String string, String string2, aPa aPa2) {
        if (!string.matches(string2)) {
            return Optional.empty();
        }
        aPO aPO2 = aPb.iE(aPa2.cyR());
        String string3 = aPO2.cBl();
        String string4 = string.replaceFirst(string3 + " ", "");
        return Optional.of(string4.substring(0, string4.indexOf(32)));
    }

    private static String al(String string, String string2) {
        if (!string.isEmpty()) {
            if (string2.matches(mTL) && string.matches(mTL)) {
                return string2.replaceFirst("(/w \"[a-zA-Z_0-9'-]+\"\\s)", "");
            }
            if (!string2.startsWith("/") || string2.startsWith(string)) {
                return string2.replaceFirst(string + " ", "");
            }
        }
        return string2;
    }

    public static void chooseChannel(flk_2 flk_22, aOY aOY2) {
        apr_0 apr_02 = aPt.cAg().c((apn_0)aOY2);
        if (apr_02 != null) {
            aPd.o(apr_02.czm(), false);
        }
        if (flk_22.getValue() != null) {
            dav dav2 = new dav();
            dav2.d((aPR)flk_22.getValue());
            dav2.b(aOY2);
            aaw_1.bUq().h(dav2);
        }
    }

    public static void openCloseContactList(fiq_1 fiq_12) {
        dae_0.cV((short)16466);
    }

    public static void openCloseEmoteBar(fiq_1 fiq_12) {
        dae_0.cV((short)18012);
    }

    public static void filterButtonActivation(flp_2 flp_22, aOY aOY2, frx_1 frx_12) {
        if (flp_22.gBy() == fzq_0.tJU) {
            fse_1.gFu().a("chat.popupCurrentView", (Object)aOY2, ((fhv_1)flp_22.gBE()).getElementMap());
            fyd_0.openClosePopup(flp_22, frx_12);
        }
    }

    public static void scrollBarDown(fiq_1 fiq_12, fcq_2 fcq_22) {
        fcq_22.fw(0.0f);
    }

    public static void notifyFocusChange(fle_2 fle_22, apr_0 apr_02) {
        fdu_1 fdu_12 = (fdu_1)fle_22.gBE();
        fhs_2 fhs_22 = fdu_12.getRenderableParent().getElementMap();
        fes_2 fes_22 = fhw_2.gAL().gAM();
        if (fes_22 != null && fhs_22 == fes_22.getElementMap() && fes_22.getId() == fdu_12.getId()) {
            return;
        }
        boolean bl = !fle_22.gDO();
        int n = apr_02.czm();
        mTN.put(n, (byte)(bl ? 1 : 0));
        if (bl) {
            aPd.p(n, false);
        } else {
            aPd.o(n, false);
        }
    }

    public static void windowFocusChange(fle_2 fle_22, apr_0 apr_02) {
        if (fle_22.gDO() && apr_02 != null) {
            dae_0 dae_02 = new dae_0();
            dae_02.lK(17252);
            dae_02.sY(apr_02.czm());
            aaw_1.bUq().h(dae_02);
        }
    }

    public static void addPrivatePipe(fiq_1 fiq_12, apc_0 apc_02) {
        cdc_1.addPrivatePipe(fiq_12, apc_02.xO());
    }

    public static void addPrivatePipe(fiq_1 fiq_12, String string) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19776);
        dae_02.fa(string);
        aaw_1.bUq().h(dae_02);
    }

    public static void closeChat(fiq_1 fiq_12, apr_0 apr_02) {
        fyw_0.gqw().tl(cza_2.NL(apr_02.czm()));
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18691);
        dae_02.sY(apr_02.czm());
        aaw_1.bUq().h(dae_02);
    }

    public static void insertItem(fla_2 fla_22, aOY aOY2) {
        fhs_2 fhs_22;
        cfe_1.onDropItem();
        cee_2.onItemDragStop(fla_22);
        apr_0 apr_02 = aPt.cAg().cAl();
        if (aOY2 == null) {
            aOY2 = apr_02.czW();
        }
        if ((fhs_22 = fyw_0.gqw().gqC().uR(cza_2.NL(apr_02.czm()))) == null) {
            return;
        }
        fdu_1 fdu_12 = (fdu_1)fhs_22.uH("chatInput");
        if (fdu_12 == null) {
            return;
        }
        aPe.a(aOY2, fla_22.getValue());
        if (!fdu_12.equals(fhw_2.gAL().gAM())) {
            fhw_2.gAL().s(fdu_12);
        }
    }

    public static void processLinkAction(fiq_1 fiq_12) {
        cdc_1.processLinkAction(fiq_12, null, null);
    }

    public static void processLinkAction(fiq_1 fiq_12, aOY aOY2) {
        cdc_1.processLinkAction(fiq_12, null, aOY2);
    }

    public static void processLinkAction(fiq_1 fiq_12, fey_2 fey_22, aOY aOY2) {
        String[] stringArray;
        String string;
        fgk_2 fgk_22;
        fdy_1 fdy_12 = (fdy_1)fiq_12.gBE();
        fgb_2 fgb_22 = fdy_12.getBlockUnderMouse();
        if (fgb_22 != null && fgb_22.gyV() == fgc_2.uuh && (fgk_22 = fgb_22.gyW()).gzE() == ahr_2.dSC && (string = ((fgm_1)fgk_22).getId()) != null && string.length() > 0 && (stringArray = string.split("_")).length == 2) {
            String string2 = stringArray[0];
            String string3 = stringArray[1];
            if (string2 == null || string2.length() == 0) {
                return;
            }
            if (fiq_12.gBy() == fzq_0.tJU) {
                cdc_1.a((flp_2)fiq_12, fey_22, aOY2, string2, string3, fgk_22.esy());
            } else if (fiq_12.gBy() == fzq_0.tJM) {
                cdc_1.a(fiq_12, fey_22, aOY2, string2, string3, fgk_22.esy());
            }
        }
    }

    private static void a(flp_2 flp_22, fey_2 fey_22, aOY aOY2, String string, String string2, String string3) {
        ejm_0 ejm_02 = ejm_0.si(string);
        if (ejm_02 != null) {
            if (ejm_02.fxh()) {
                cdc_1.a(flp_22, fey_22, string2, ejm_02);
            } else if (ejm_02 == ejm_0.qyW) {
                dae_0 dae_02 = new dae_0(19862);
                dae_02.gj(Long.parseLong(string2));
                aaw_1.bUq().h(dae_02);
            } else if (ejm_02 == ejm_0.qyX) {
                bpm_1.dCG().bI(Short.parseShort(string2)).ifPresent(bpg_12 -> cuj_2.eRB().f((bpg_1)bpg_12));
            } else if (ejm_02 == ejm_0.qyZ) {
                cua_2.eRq().MT(Integer.parseInt(string2));
            }
        } else if (string.equals("state")) {
            int n = Integer.parseInt(string2);
            short s = GC.mS(n);
            short s2 = GC.mT(n);
            bmq_0 bmq_02 = (bmq_0)fqX.gjM().Zr(s);
            if (bmq_02.cmL() != s2) {
                bmq_02 = bmq_02.cl(s2);
            }
            dbo dbo2 = new dbo();
            dbo2.b(bmq_02);
            dbo2.fa(((fhv_1)flp_22.gBE()).getElementMap().getId());
            aaw_1.bUq().h(dbo2);
        } else if (string.equals("characterName")) {
            String string4;
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            long l = Long.parseLong(string2.split(";")[0]);
            String string5 = string4 = string2.contains(";") ? string2.split(";")[1] : string3;
            if (string4 == null || string4.equals(bgt_02.getName())) {
                return;
            }
            if (flp_22.gEm()) {
                boolean bl;
                if (flp_22.gDT() && evm_2.b(aue_0.cVJ().cVO().cWq(), evn_2.ota)) {
                    cwj_1.nTI.eWl().oe(string4);
                    if (!aue_0.cVJ().c(cwj_1.nTI)) {
                        aue_0.cVJ().a(cwj_1.nTI);
                    }
                    return;
                }
                fcb_2 fcb_22 = fyw_0.gqw().gqJ();
                fcb_22.a(string4, (awg_1)null);
                bgy bgy2 = adn_0.bvh().fM(l) == null ? bgg_0.dlO().lI(string4) : bgg_0.dlO().ju(l);
                boolean bl2 = bl = l < 0L;
                if (!bl) {
                    Object object;
                    if (!evm_2.c(aue_0.cVJ().cVO().cWq(), evm_2.osZ)) {
                        fcb_22.a(aum_0.cWf().c("desc.mru.openModerationPanel", new Object[0]), "negativeMedium", new cdd_1(string4), true);
                    }
                    fcb_22.a(aum_0.cWf().c("desc.mru.createPrivateChat", string4), new cdh_1(string4), true);
                    if (apd_0.cAO().cAQ().ii(l) == null) {
                        fcb_22.a(aum_0.cWf().c("chat.addToFriendList", new Object[0]), new cdi_2(string4), true);
                    }
                    if (apd_0.cAO().cAR().ii(l) == null) {
                        fcb_22.a(aum_0.cWf().c("chat.addToIgnoreList", new Object[0]), "negativeMedium", new cdj_1(string4), true);
                    }
                    boolean bl3 = true;
                    if (bgt_02.dnQ().dfG() && (object = bgt_02.dnQ().dKL()).hC(string4)) {
                        bl3 = false;
                    }
                    if (bl3) {
                        fcb_22.a(aum_0.cWf().c("desc.mru.invitToJoinGroup", string4), new cdk_1(bgt_02, string4), true);
                    }
                    object = (bhJ)bgy2;
                    bvk bvk2 = bvk.dJZ();
                    if (bvk2.ai((bhJ)object)) {
                        fcb_22.a(aum_0.cWf().c("desc.mru.inviteToJoinGuild", string4), new cdl_1(string4), true);
                    }
                }
                if (bgy2 != null) {
                    fcb_22.a(aum_0.cWf().c("desc.show", new Object[0]), new cdm_2(string4), true);
                }
                fcb_22.setHotSpotPosition(faa_2.tLN);
                fcb_22.gL(fhz_2.gAS().getX() + 50, fhz_2.gAS().getY() + 10);
            } else if (flp_22.gEk()) {
                if (flp_22.gDT()) {
                    dae_0 dae_03 = new dae_0();
                    dae_03.lK(19776);
                    dae_03.fa(string4);
                    aaw_1.bUq().h(dae_03);
                    return;
                }
                aOY2.c("input", (Object)cdc_1.b(string4, aPa.evr));
                fse_1.gFu().a((aef_2)aOY2, "input");
                fdu_1 fdu_12 = (fdu_1)csz_1.ePn().ePo().getElementMap().uH(mTE);
                if (fdu_12 == null) {
                    return;
                }
                if (!fdu_12.equals(fhw_2.gAL().gAM())) {
                    fhw_2.gAL().s(fdu_12);
                }
            }
        } else if ("accountName".equals(string)) {
            if (flp_22.gEk()) {
                aOY2.c("input", (Object)cdc_1.b(string3, aPa.evw));
                fse_1.gFu().a((aef_2)aOY2, "input");
                fdu_1 fdu_13 = (fdu_1)csz_1.ePn().ePo().getElementMap().uH(mTE);
                if (fdu_13 == null) {
                    return;
                }
                if (!fdu_13.equals(fhw_2.gAL().gAM())) {
                    fhw_2.gAL().s(fdu_13);
                }
            } else if (flp_22.gEm()) {
                fcb_2 fcb_23 = fyw_0.gqw().gqJ();
                fcb_23.a(string3, (awg_1)null);
                fcb_23.a(aum_0.cWf().c("desc.mru.createPrivateChat", string3), new cdn_1(string3), true);
                fcb_23.gL(fhz_2.gAS().getX() + 50, fhz_2.gAS().getY() + 10);
            }
        } else if ("fileExplorer".equals(string)) {
            try {
                Desktop.getDesktop().open(new File(string2));
            }
            catch (IOException | IllegalArgumentException exception) {
                mTD.error((Object)("Failed to open the screenshot located at " + string2), (Throwable)exception);
            }
        }
    }

    private static void a(flp_2 flp_22, fey_2 fey_22, String string, ejm_0 ejm_02) {
        ffV ffV2 = aPe.czf().b(ejm_02, string);
        if (flp_22.gEm()) {
            if (mTJ != null) {
                cdd_2.sendCloseItemDetailMessage(fey_22.getElementMap().getId(), mTJ, true);
            }
            cdd_2.sendOpenCloseItemDetailMessage(fey_22.getElementMap().getId(), mTJ, false);
        }
    }

    private static String b(String string, aPa aPa2) {
        aPO aPO2 = aPb.iE(aPa2.cyR());
        String string2 = aPO2.cBl();
        return String.format(mTF, string2, string);
    }

    private static void a(fiq_1 fiq_12, fey_2 fey_22, aOY aOY2, String string, String string2, String string3) {
        ejm_0 ejm_02;
        if (string2.equals(mTI)) {
            return;
        }
        if (mTJ != null) {
            cdd_2.sendCloseItemDetailMessage(fey_22.getElementMap().getId(), mTJ, true);
        }
        if ((ejm_02 = ejm_0.si(string)) != null && ejm_02.fxh()) {
            ffV ffV2;
            mTJ = ffV2 = aPe.czf().b(ejm_02, string2);
            mTI = string2;
            vt_0.b(() -> fse_1.gFu().f("hoveredItemNotOwned", ejm_02 == ejm_0.qyY));
            cdd_2.sendOpenItemDetailMessage(fey_22.getElementMap().getId(), ffV2, true);
        }
    }

    public static void onMouseExitSelectableText(fiq_1 fiq_12, fey_2 fey_22) {
        if (mTJ != null) {
            cdd_2.sendCloseItemDetailMessage(fey_22.getElementMap().getId(), mTJ, true);
        }
        mTJ = null;
        mTI = null;
        vt_0.b(() -> fse_1.gFu().f("hoveredItemNotOwned", false));
    }

    public static void setPrivateName(fiq_1 fiq_12, apn_0 apn_02) {
        if (fiq_12 instanceof fle_2 && apn_02.cyK() != null) {
            fle_2 fle_22 = (fle_2)fiq_12;
            fdu_1 fdu_12 = (fdu_1)fiq_12.gBE();
            if (fle_22.gBE() == fle_22.gBD() && !fle_22.gDO()) {
                apn_02.iC(apn_0.jh(fdu_12.getText()));
            } else if (fle_22.gDO() && fdu_12.getText().contains("<")) {
                apn_02.iC(apn_0.jh(""));
            }
        }
    }

    public static void onClickView(flp_2 flp_22, apr_0 apr_02, apn_0 apn_02, fdu_1 fdu_12) {
        if (flp_22.gEl()) {
            if (!apn_02.czL() && !apn_02.cyN()) {
                cdc_1.deleteView(apn_02);
            }
            return;
        }
        cdc_1.selectView(flp_22, apr_02, apn_02, fdu_12);
    }

    public static void selectView(flp_2 flp_22, apr_0 apr_02, apn_0 apn_02, fdu_1 fdu_12) {
        if (apr_02 != null) {
            aPd.n(apr_02.czm(), false);
        }
        if (flp_22.gEm()) {
            if (apn_02.czL() || apn_02.cyN()) {
                return;
            }
            fse_1.gFu().f("chat.editedView", apn_02);
            fhw_2.gAL().s(fdu_12);
        } else {
            apr_02.a((aOY)apn_02);
            fse_1.gFu().b("chat", "currentView", ((fhv_1)flp_22.gBE()).getElementMap());
        }
    }

    public static void selectView(apn_0 apn_02) {
        apr_0 apr_02 = aPt.cAg().c(apn_02);
        if (apr_02 == null) {
            return;
        }
        aPd.n(apr_02.czm(), false);
        apr_02.a((aOY)apn_02);
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(cza_2.NL(apr_02.czm()));
        fse_1.gFu().b("chat", "currentView", fhs_22);
        ChatCommand.a(fhs_22);
    }

    public static void dropView(fla_2 fla_22, apr_0 apr_02, apn_0 apn_02) {
    }

    public static void dragView(flu_1 flu_12, apr_0 apr_02) {
        aPd.o(apr_02.czm(), false);
    }

    public static void dropView(flc_2 flc_22, apr_0 apr_02) {
        cdc_1.dropView((apn_0)flc_22.getValue(), flc_22, apr_02);
    }

    public static void dropView(fla_2 fla_22) {
        if (!(fla_22.gDy() instanceof apn_0)) {
            return;
        }
        apn_0 apn_02 = (apn_0)fla_22.gDy();
        cdc_1.dropView(apn_02, fla_22, aPt.cAg().c(apn_02));
    }

    public static void dropView(apn_0 apn_02, flp_2 flp_22, apr_0 apr_02) {
        Object object;
        int n = flp_22.getScreenX();
        int n2 = flp_22.getScreenY();
        apr_0 apr_03 = csz_1.ePn().c(flp_22);
        if (apr_03 != null && mTK != null) {
            mTK.setColor(awx_2.dnC);
        }
        int n3 = apr_02.czm();
        if (apr_03 == apr_02) {
            object = csz_1.ePn().e(flp_22);
            if (apn_02 != object && object != null) {
                int n4 = ((aOY)object).cyJ();
                apr_02.a(apn_02, false);
                apr_02.a(apn_02, n4);
                apr_02.a((aOY)apn_02);
                aPt.cAg().cAy();
                aPt.cAg().cAw();
                return;
            }
        } else if (apr_03 != null && apr_03.czY() < 12) {
            aPt.cAg().a(apn_02, n3, apr_03.czm());
            fey_2 fey_22 = csz_1.ePn().My(apr_03.czm());
            fey_22.a(new cdo_1(fey_22, apr_03));
            aPt.cAg().cAw();
            aPd.n(apr_03.czm(), false);
            aPd.p(n3, false);
            return;
        }
        if (apr_02.czY() == 1) {
            object = csz_1.ePn().My(apr_02.czm());
            ((fes_2)object).setPosition(n - 50, n2 + 10 - ((fes_2)object).getHeight());
            aPd.p(n3, false);
            return;
        }
        if (apr_03 == apr_02) {
            return;
        }
        object = aPt.cAg().a(apn_02, n3, -1);
        fey_2 fey_23 = (fey_2)csz_1.ePn().a((apr_0)object, null);
        fey_23.a(new cde_1(fey_23, n, n2, (apr_0)object));
        fey_2 fey_24 = csz_1.ePn().My(n3);
        fey_24.a(new cdf_1(fey_24, apr_02));
        aPt.cAg().cAw();
        aPd.p(n3, false);
        aPd.p(((apr_0)object).czm(), false);
    }

    public static void createView(fiq_1 fiq_12, apr_0 apr_02) {
        apr_02.czP();
        aPt.cAg().cAw();
    }

    public static void openChatOptions(fiq_1 fiq_12) {
        aue_0.cVJ().a(cte_1.ePp());
    }

    public static void deleteView(apn_0 apn_02) {
        apr_0 apr_02 = aPt.cAg().ze(aPt.cAg().d(apn_02));
        aPt.cAg().a(apr_02, apn_02, -1);
        fse_1.gFu().a((aef_2)aPt.cAg(), aPt.eyQ);
        fse_1.gFu().a((aef_2)aPt.cAg(), aPt.eyQ);
        fse_1.gFu().a((aef_2)apr_02, apr_0.eyF);
        aPt.cAg().cAw();
        fse_1.gFu().f("chat.editedView", (Object)null);
    }

    public static void setViewName(fiq_1 fiq_12, fdu_1 fdu_12, apr_0 apr_02) {
        apn_0 apn_02 = (apn_0)fse_1.gFu().vY("chat.editedView");
        if (apn_02 == null) {
            return;
        }
        apn_02.setName(fdu_12.getText());
        apn_02.eE(true);
        fse_1.gFu().a((aef_2)apn_02, apn_0.evc);
        fse_1.gFu().a((aef_2)apr_02, apr_0.eyF);
        aPt.cAg().cAw();
        if (fiq_12 instanceof fle_2 && !((fle_2)fiq_12).gDO() || fiq_12 instanceof fli_2 && ((fli_2)fiq_12).bCC() == 10) {
            fse_1.gFu().f("chat.editedView", (Object)null);
            fhw_2.gAL().s(null);
        }
    }

    public static void activateDisactivateFilter(fiq_1 fiq_12, apn_0 apn_02, String string) {
        apr_0 apr_02 = aPt.cAg().c(apn_02);
        if (apr_02 != null) {
            aPd.p(apr_02.czm(), false);
        }
        fdd_2 fdd_22 = (fdd_2)fiq_12.gBD();
        boolean bl = fdd_22.getSelected();
        aPl aPl2 = aPh.czg().iX(string).czu();
        cdc_1.toggleFilter(apn_02, aPl2, bl);
    }

    public static void toggleFilter(apn_0 apn_02, aPl aPl2, boolean bl) {
        ewf_0 ewf_02;
        if (aPl2 == aPl.exp) {
            return;
        }
        if (apn_02.a(aPl2, bl) && (ewf_02 = aPl2.czG()) != null) {
            if (bl && aPb.a(aPl2, aPl2.aUXX())) {
                aPb.a(ewf_02);
            } else if (!bl && aPb.e(aPl2)) {
                aPb.b(ewf_02);
            }
        }
        apn_02.cyE();
        aPt.cAg().cAw();
    }

    public static void deleteView(fiq_1 fiq_12, apn_0 apn_02) {
        cdc_1.deleteView(apn_02);
    }

    public static void toggleChatInline(fiq_1 fiq_12, fey_2 fey_22, apr_0 apr_02) {
        fse_1 fse_12 = fse_1.gFu();
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        boolean bl = apr_02.czZ();
        apr_02.eH(!bl);
        if (bl) {
            Integer n = apr_02.cAa();
            if (n != null) {
                fey_22.setHeight(n);
                apr_02.q(null);
                aPt.cAg().cAw();
            }
            if (fey_22.getSize().getHeight() < (double)aPc.ewr.height) {
                fey_22.setHeight(aPc.ewr.height);
            }
            fse_1.gFu().a("chat.minDimension", (Object)aPc.ewr, fey_22.getElementMap());
        } else {
            apr_02.q((int)fey_22.getSize().getHeight());
            fey_22.setHeight(aPc.ews.height);
            aPt.cAg().cAw();
            fse_1.gFu().a("chat.minDimension", (Object)aPc.ews, fey_22.getElementMap());
        }
    }

    public static void updateScrollBarPosition(fiq_1 fiq_12, fcq_2 fcq_22) {
        fse_1.gFu().b("chat.scrollOffset", Float.valueOf(fcq_22.getVerticalScrollBar().getValue()), ((fhv_1)fiq_12.gBD()).getElementMap().getId());
    }

    public static void goDownText(fiq_1 fiq_12, fcq_2 fcq_22) {
        cdc_1.goDownText(fiq_12, fcq_22, true);
    }

    public static void goDownText(fiq_1 fiq_12, fcq_2 fcq_22, boolean bl) {
        if (bl && mTO.bhl()) {
            return;
        }
        mTO.b(fcq_22);
        mTO.i(false);
        mTO.cL(true);
        mTO.run();
        if (bl) {
            abg_2.bUP().a((Runnable)mTO, 100L);
            fbj_1.getInstance().a(fzq_0.tJT, mTP, true);
        }
    }

    public static void goUpText(fiq_1 fiq_12, fcq_2 fcq_22) {
        cdc_1.goUpText(fiq_12, fcq_22, true);
    }

    public static void goUpText(fiq_1 fiq_12, fcq_2 fcq_22, boolean bl) {
        if (bl && mTO.bhl()) {
            return;
        }
        mTO.b(fcq_22);
        mTO.i(true);
        mTO.cL(true);
        mTO.run();
        if (bl) {
            abg_2.bUP().a((Runnable)mTO, 100L);
            fbj_1.getInstance().a(fzq_0.tJT, mTP, true);
        }
    }

    public static void goDownBundaryText(fiq_1 fiq_12, fcq_2 fcq_22) {
        float f2 = 0.0f;
        fcq_22.setVerticalScrollBarPosition(0.0f);
        fse_1.gFu().b("chat.scrollOffset", Float.valueOf(fcq_22.getVerticalScrollBar().getValue()), ((fhv_1)fiq_12.gBD()).getElementMap().getId());
    }

    public static void transferClickEventToWorldInteractionFrame(flp_2 flp_22) {
        if (mTH.equals(((fhv_1)flp_22.gBE()).getId())) {
            cdd_2.transferClickEventToWorldInteractionFrame(flp_22);
        }
    }

    static void eKb() {
        abg_2.bUP().h(mTO);
        mTO.cL(false);
        fbj_1.getInstance().b(fzq_0.tJT, mTP, true);
    }

    static {
        mTN = new TIntByteHashMap();
        mTO = new cdp_1();
        mTP = new cdg_1();
    }
}

