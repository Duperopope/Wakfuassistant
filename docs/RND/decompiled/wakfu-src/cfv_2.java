/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.time.Duration;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cFv
 */
@fyf_0
public class cfv_2 {
    public static final String PACKAGE = "wakfu.moderationPanel";
    private static final Logger mWc = Logger.getLogger(cfv_2.class);
    public static final int mWd = 255;
    public static final int mWe = 370;
    public static final int mWf = 80;
    public static final int mWg = 1440;
    public static final int mWh = 1440;
    public static final int mWi = -42;

    public static void backToMainPage(fiq_1 fiq_12) {
        cwj_1.eWf();
        cwj_1.nTI.eWl().a(cbx_2.lLZ);
    }

    public static void onTPLocationChanged(flk_2 flk_22) {
        String string = (String)flk_22.getValue();
        cwj_1.nTI.eWl().ob(string);
    }

    public static void tpToSelectedLocation(fiq_1 fiq_12) {
        cby_2 cby_22 = cwj_1.nTI.eWl().esW();
        cwj_1.b((short)457, cby_22.getX(), cby_22.getY(), cby_22.aqZ());
    }

    public static void onNationChanged(flk_2 flk_22) {
        String string = (String)flk_22.getValue();
        cwj_1.nTI.eWl().oc(string);
    }

    public static void changeToSelectedNation(fiq_1 fiq_12) {
        cbw_2 cbw_22 = cwj_1.nTI.eWl().esX();
        cwj_1.b((short)11, cbw_22.Xt(), (byte)1);
    }

    public static void openInNala(fiq_1 fiq_12) {
        long l = cwj_1.nTI.eWl().esQ().xl();
        cfv_2.oe(l);
    }

    public static void openInNala(fiq_1 fiq_12, cbs_2 cbs_22) {
        cfv_2.oe(cbs_22.xl());
    }

    private static void oe(long l) {
        cfv_2.pD("?id=" + l);
    }

    private static void E(Collection<Long> collection) {
        cfv_2.pD(String.format("/list?gs_account=%s&gs_param_account=account_id", collection.stream().map(String::valueOf).collect(Collectors.joining(","))));
    }

    private static void pD(String string) {
        String string2 = aum_0.cWf().aUXX().aUR();
        if (!"fr".equals(string2) && !"en".equals(string2)) {
            string2 = "en";
        }
        String string3 = String.format("https://nala2.ankama.com/%s/account%s", string2, string);
        aet_1.ht(string3);
    }

    public static void openInBodyguard(fiq_1 fiq_12) {
        long l = cwj_1.nTI.eWl().esQ().xl();
        String string = "https://app.bodyguard.ai/authors?search=" + l;
        aet_1.ht(string);
    }

    public static void openForumProfile(fiq_1 fiq_12) {
        cbu_2 cbu_22 = cwj_1.nTI.eWl().esQ();
        String string = String.valueOf(cbu_22.aqN());
        String string2 = aum_0.cWf().aUXX().aUR();
        if (!"fr".equals(string2) && !"en".equals(string2)) {
            string2 = "en";
        }
        String string3 = string2.equals("fr") ? "profil-ankama" : "ankama-profile";
        String string4 = String.format("https://account.ankama.com/%s/%s/%s-%s", string2, string3, string, cbu_22.getTag());
        aet_1.ht(string4);
    }

    public static void openGuildOfSelectedPlayer(fiq_1 fiq_12) {
        cbu_2 cbu_22 = cwj_1.nTI.eWl().esQ();
        if (cbu_22 == null) {
            return;
        }
        long l = cbu_22.Ya();
        cwj_1.c((short)348, (byte)20, l);
    }

    public static void showPlayerPageOfMember(fiq_1 fiq_12, cbs_2 cbs_22) {
        cwj_1.a(fud_0.thA, fub_0.thi, (Object)cbs_22.getName());
    }

    public static void setOpacityLevel(flw_2 flw_22) {
        float f2 = flw_22.getValue();
        cwj_1.nTI.eWl().eS(f2);
        fse_1.gFu().aT("moderationPanelView", "opacity");
        fse_1.gFu().aT("moderationPanelView", "opacitySliderValue");
    }

    public static void selectPlayer(fiq_1 fiq_12, cbu_2 cbu_22) {
        cwj_1.nTI.eWl().oe(cbu_22.getName());
    }

    public static void removeAllPlayerTabs(fiq_1 fiq_12) {
        cwj_1.nTI.eWl().esR();
        cwj_1.nTI.eWl().a(cbx_2.lLZ);
    }

    public static void removePlayerTab(fiq_1 fiq_12, cbu_2 cbu_22) {
        cwj_1.nTI.eWl().a(cbu_22);
        cwj_1.nTI.eWl().a(cbx_2.lLZ);
    }

    public static void addTabPlayer(fiq_1 fiq_12, String string) {
        cwj_1.nTI.eWl().od(string);
    }

    public static void searchPlayer(fiq_1 fiq_12, fdv_1 fdv_12) {
        if (fiq_12 instanceof fli_2 && ((fli_2)fiq_12).bCC() != 10) {
            return;
        }
        String string = fdv_12.getText().strip();
        if (string.matches("[0-9]+")) {
            long l = Long.parseLong(string);
            cwj_1.a(fud_0.thA, fub_0.thj, (Object)l);
        } else if (string.matches(".+#[0-9]{4}")) {
            cwj_1.a(fud_0.thA, fub_0.thk, (Object)string);
        } else {
            cwj_1.a(fud_0.thA, fub_0.thi, (Object)string);
        }
    }

    public static void searchGuild(fiq_1 fiq_12, fdv_1 fdv_12) {
        if (fiq_12 instanceof fli_2 && ((fli_2)fiq_12).bCC() != 10) {
            return;
        }
        String string = fdv_12.getText().strip();
        if (string.matches("[0-9]+")) {
            long l = Long.parseLong(string);
            cwj_1.c((short)348, (byte)20, l);
        } else {
            cwj_1.c((short)348, (byte)21, string);
        }
    }

    public static void eTargetable(fiq_1 fiq_12, String string) {
        cwj_1.b((short)411, "1".equals(string) ? 1 : 0);
    }

    public static void dnd(fiq_1 fiq_12, String string) {
        cwj_1.a((short)316, "1".equals(string) ? (byte)1 : 0);
    }

    public static void staffMode(fiq_1 fiq_12, String string) {
        cwj_1.b((short)169, "1".equals(string) ? (byte)1 : 0);
    }

    public static void setVisibility(fiq_1 fiq_12, String string) {
        cwj_1.b((short)492, "1".equals(string) ? (byte)1 : 0);
    }

    public static void sanction(fiq_1 fiq_12, ccc_2 ccc_22) {
        cbu_2 cbu_22 = cwj_1.nTI.eWl().esQ();
        int n = ccc_22.eth();
        String string = cbu_22.getName();
        long l = cbu_22.xl();
        int n3 = 399;
        fik_2 fik_22 = new fik_2().l("moderation.sanction.confirmation.popup", string, String.valueOf(l), ccc_22.eu("sanctionText")).vG(ccp_2.mRE.byf()).a(fil_2.gCo()).a(fil_2.gCm()).a(new fil_2(399).m("yesAndDeleteMessages", new Object[0])).a((n2, string2) -> {
            if (n2 != 400 && n2 != 399) {
                return;
            }
            cwj_1.a((short)230, n, l, cbu_22.KU(), string, n2 == 399);
        });
        fiq_2.gCw().d(fik_22);
    }

    public static void redMessage(fiq_1 fiq_12) {
        fiq_2.gCw().d(fik_2.b(string -> {
            if (string != null && !string.isEmpty()) {
                cwj_1.b((short)160, string);
            }
        }).vE("Type a red message to send :").pe(true));
    }

    public static void redMessageToPlayer(fiq_1 fiq_12) {
        String string = cwj_1.nTI.eWl().esQ().getName();
        fiq_2.gCw().d(fik_2.b(string2 -> {
            if (string2 == null || string2.isEmpty()) {
                return;
            }
            int n = BH.aP(string2).length;
            if (n > 255) {
                cfv_2.LW(n);
                return;
            }
            cwj_1.a((short)298, string, string2);
        }).vE("Type a red message to send to player " + string + " :").pe(true));
    }

    private static fis_2 eKw() {
        fis_2 fis_22 = new fis_2();
        fis_22.setMaxCharacters(255);
        fis_22.setMultiline(true);
        fis_22.setPrefSize(new fsm_1(370, 80));
        fis_22.setMaxWidth(370);
        return fis_22;
    }

    private static void LW(int n) {
        cwj_1.nTI.eWl().oh(cfv_2.aLE() + "Incorrect message size (" + n + " > 255), try again.");
    }

    public static void havenBagKick(fiq_1 fiq_12) {
        String string = cwj_1.nTI.eWl().esQ().getName();
        long l = cwj_1.nTI.eWl().esQ().KU();
        cwj_1.a((short)145, (short)312, string, l);
    }

    public static void pum(fiq_1 fiq_12) {
        fiq_2.gCw().d(fik_2.b(string -> {
            if (string == null || string.isEmpty()) {
                return;
            }
            int n = BH.aP(string).length;
            if (n > 255) {
                cfv_2.LW(n);
                return;
            }
            String string2 = cwj_1.nTI.eWl().esQ().getName();
            cwj_1.a((short)175, string, string2);
        }).vE("Type a message for the PopUp (0 < size < 255) :").pe(true));
    }

    public static void toggleLocalizedSysMsg(fiq_1 fiq_12) {
        cwj_1.eWj();
    }

    public static void refreshSendEnabled(fiq_1 fiq_12, fdu_1 fdu_12) {
        String string = fdu_12.getText();
        boolean bl = string != null && !string.isEmpty();
        cwj_1.nTI.kI(bl);
    }

    public static void sendLocalizedSystemMessage(fiq_1 fiq_12, fdu_1 fdu_12, fdu_1 fdu_13, fdu_1 fdu_14, fdu_1 fdu_15) {
        if (fiq_12 instanceof fli_2 && ((fli_2)fiq_12).bCC() != 10) {
            return;
        }
        HashMap<Byte, String> hashMap = new HashMap<Byte, String>();
        String string = fdu_12.getText();
        hashMap.put(Mv.aVl.aJr(), string);
        String string2 = fdu_13.getText();
        hashMap.put(Mv.aVk.aJr(), string2);
        String string3 = fdu_14.getText();
        hashMap.put(Mv.aVm.aJr(), string3);
        String string4 = fdu_15.getText();
        hashMap.put(Mv.aVn.aJr(), string4);
        cwj_1.A(hashMap);
    }

    public static void jail(fiq_1 fiq_12) {
        fis_2 fis_22 = new fis_2();
        fis_22.setMaxCharacters(10);
        fis_22.setPrefSize(new fsm_1(50, 20));
        fis_22.setRestrict("[0-9-]");
        fiq_2.gCw().d(fik_2.b(cfv_2::pE).vE("Enter jailing duration (in minutes) 0=1440 (1 day), default=10\nWARNING: the values are not the same when using the console!").pe(true).a(fis_22));
    }

    private static void pE(@Nullable String string) {
        if (string == null || string.length() > 10) {
            cwj_1.nTI.eWl().oh(cfv_2.aLE() + "Incorrect message size, try again.");
            return;
        }
        try {
            int n = cfv_2.pF(string);
            if (n == -42) {
                cwj_1.a((short)145, (short)489, cwj_1.nTI.eWl().esQ().getName());
                return;
            }
            cwj_1.a((short)145, (short)228, cwj_1.nTI.eWl().esQ().getName(), n);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            cwj_1.nTI.eWl().oh(cfv_2.aLE() + "Incorrect duration, number should be between 0 and 1440");
        }
    }

    private static int pF(String string) {
        if (BH.aU(string)) {
            return 1440;
        }
        int n = Integer.parseInt(string);
        if (n == 0) {
            return 1440;
        }
        if (n == -1) {
            return -42;
        }
        if (n < 0 || n > 1440) {
            throw new IllegalArgumentException();
        }
        return n;
    }

    public static void restrictLanguages(fiq_1 fiq_12) {
        cbu_2 cbu_22 = cwj_1.nTI.eWl().esQ();
        fiq_2.gCw().d(fik_2.a((String string) -> cwj_1.a((short)202, cbu_22.xl(), cbu_22.getName(), true)).vE("Restrict the access of " + cbu_22.getName() + " to their default language channels ?").vG(ccp_2.mRE.byf()));
    }

    public static void unrestrictLanguages(fiq_1 fiq_12) {
        cbu_2 cbu_22 = cwj_1.nTI.eWl().esQ();
        fiq_2.gCw().d(fik_2.a((String string) -> cwj_1.a((short)202, cbu_22.xl(), cbu_22.getName(), false)).vE("Cancel the restriction of " + cbu_22.getName() + " to access their default language channels ?").vG(ccp_2.mRE.byf()));
    }

    public static void kickPlayer(fiq_1 fiq_12) {
        cbu_2 cbu_22 = cwj_1.nTI.eWl().esQ();
        fiq_2.gCw().d(fik_2.a((String string) -> cwj_1.a((short)442, cbu_22.getName())).vE("Do you really want to kick " + cbu_22.getName() + " from the game ?").vG(ccp_2.mRE.byf()));
    }

    public static void unbanPlayer(fiq_1 fiq_12) {
        cbu_2 cbu_22 = cwj_1.nTI.eWl().esQ();
        fiq_2.gCw().d(fik_2.a((String string) -> cwj_1.d((short)92, cbu_22.xl(), false, 0)).vE("Do you really want to unban " + cbu_22.getName() + " ?").vG(ccp_2.mRE.byf()));
    }

    public static void openRenameDialog(fiq_1 fiq_12) {
        List<cbu_2> list = cwj_1.nTI.eWl().esZ();
        if (list.isEmpty()) {
            return;
        }
        fse_1.gFu().f("moderationRenamingPlayers", list);
        ccj_2.g("moderationRenameCharactersDialog", 32784L);
    }

    public static void forceSelectedCharactersRename(fiq_1 fiq_12, fry_1 fry_12, fbz_2 fbz_22) {
        List<cbu_2> list = fbz_22.getRenderables().stream().filter(fcv_12 -> {
            fhv_1 fhv_12 = fcv_12.getChildWithId("nameCB");
            if (!(fhv_12 instanceof fdd_2)) {
                return false;
            }
            fdd_2 fdd_22 = (fdd_2)fhv_12;
            return fdd_22.getSelected();
        }).map(fcv_1::getItemValue).map(object -> (cbu_2)object).toList();
        if (list.isEmpty()) {
            return;
        }
        cbu_2 cbu_22 = list.get(0);
        long l = cbu_22.xl();
        fiq_2.gCw().d(fik_2.a((String string) -> {
            fyw_0.gqw().tl("moderationRenameCharactersDialog");
            cwj_1.a((short)230, exj.oVW.d(), l, cbu_22.KU(), cbu_22.getName(), false);
            abg_2.bUP().a(() -> {
                StringBuilder stringBuilder = new StringBuilder("Forced renamed following characters: \n");
                for (cbu_2 cbu_23 : list) {
                    cwj_1.a((short)354, cbu_23.KU(), "");
                    stringBuilder.append(cbu_23.getName()).append('\n');
                }
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                cwj_1.a((short)440, l, cbu_22.getName(), stringBuilder.toString());
            }, Duration.ofSeconds(5L), 1);
            abg_2.bUP().a(() -> {
                cwj_1.nTI.eWl().esR();
                cwj_1.a(fud_0.thA, fub_0.thj, (Object)l);
            }, Duration.ofSeconds(7L), 1);
        }).vE("Do you really want to rename " + list.size() + " character(s) of account " + l + " ?").vG(ccp_2.mRE.byf()));
    }

    public static void tpCoords(fiq_1 fiq_12) {
        fiq_2.gCw().d(fik_2.b(string -> {
            if (string == null || string.isEmpty()) {
                return;
            }
            String[] stringArray = string.split(" ");
            int n = Integer.parseInt(stringArray[0]);
            int n2 = Integer.parseInt(stringArray[1]);
            if (stringArray.length == 3) {
                long l = Long.parseLong(stringArray[2]);
                cwj_1.b((short)457, n, n2, l);
            } else if (stringArray.length == 2) {
                cwj_1.b((short)71, n, n2);
            }
        }).vE("Type coords with format \"x y <instance>\" (instance facultative) :").vG(ccp_2.mRE.byf()).pe(true));
    }

    public static void tpToPlayer(fiq_1 fiq_12) {
        cwj_1.a((short)145, (short)165, cwj_1.nTI.eWl().esQ().getName());
    }

    public static void tpToMe(fiq_1 fiq_12) {
        cwj_1.a((short)145, (short)187, cwj_1.nTI.eWl().esQ().getName());
    }

    public static void freedom(fiq_1 fiq_12) {
        cwj_1.a((short)145, (short)127, cwj_1.nTI.eWl().esQ().getName());
    }

    public static void hiddenMute(fiq_1 fiq_12) {
        fis_2 fis_22 = new fis_2();
        fis_22.setMaxCharacters(9);
        fis_22.setRestrict("[0-9-]");
        fiq_2.gCw().d(fik_2.b(string -> {
            if (string == null || string.isEmpty()) {
                return;
            }
            try {
                int n = Integer.parseInt(string);
                cwj_1.a((short)114, cwj_1.nTI.eWl().esQ().xl(), n, ftX.tha.d());
            }
            catch (NumberFormatException numberFormatException) {
                mWc.error((Object)"Error with hidden mute duration", (Throwable)numberFormatException);
            }
        }).vE("Hidden mute duration in minute (-1 to cancel)").vG(ccp_2.mRE.byf()).pe(true).a(fis_22));
    }

    public static void addNote(fiq_1 fiq_12) {
        fis_2 fis_22 = new fis_2();
        fis_22.setMaxCharacters(100);
        fiq_2.gCw().d(fik_2.b(string -> {
            if (string == null || string.isEmpty()) {
                return;
            }
            cbu_2 cbu_22 = cwj_1.nTI.eWl().esQ();
            cwj_1.a((short)440, cbu_22.xl(), cbu_22.getName(), string);
        }).l("moderationPanel.addNote.explanation", new Object[0]).vG(ccp_2.mRE.byf()).pe(true).a(fis_22));
    }

    public static void removeNote(fiq_1 fiq_12, cca_2 cca_22) {
        if (!cca_22.ete()) {
            return;
        }
        ftY ftY2 = cca_22.etg();
        fiq_2.gCw().d(fik_2.b(string -> {
            int n = (int)(ftY2.etb().getTime() / 1000L);
            cwj_1.a((short)195, ftY2.Xi(), n);
        }).vE("Do you really want to remove " + ftY2.xO() + "'s note \"" + cca_22.etd() + "\" ?").vG(ccp_2.mRE.byf()));
    }

    public static void copyPenalView(fiq_1 fiq_12) {
        cwj_1.nTI.eWg();
    }

    public static void copyPlayerIntervention(fiq_1 fiq_12) {
        cwj_1.nTI.eWh();
    }

    public static void switchContainerVisibility(fiq_1 fiq_12, fad_1 fad_12, faw_2 faw_22) {
        boolean bl = !faw_22.isVisible();
        faw_22.setVisible(bl);
        fad_12.setStyle(bl ? "arrowCollapseUp" : "arrowCollapseDown");
    }

    public static void changeBackgroundColor(flp_2 flp_22, fkk_1 fkk_12) {
        fkk_12.setColor(flp_22.gBy() == fzq_0.tJQ ? new awx_2(0.5f, 0.5f, 0.5f, 0.1f) : new awx_2(0.5f, 0.5f, 0.5f, 0.0f));
    }

    public static void minimizeOrMaximize(flp_2 flp_22) {
        cwj_1.nTI.eWl().esV();
        fse_1.gFu().aT("moderationPanelView", "maximized");
    }

    @NotNull
    private static String aLE() {
        ux_0 ux_02 = Uq.buK.bjc();
        return "[" + ux_02.bjE() + ":" + ux_02.bjF() + "] ";
    }

    public static void copyAccount(fiq_1 fiq_12, cbs_2 cbs_22) {
        if (!bh_0.aI(String.valueOf(cbs_22.xl()))) {
            cdn.ol("Cannot automatically copy account id \"" + cbs_22.xl() + "\" to clipboard, permission denied");
        }
    }

    public static void renameGuild(fiq_1 fiq_12) {
        fis_2 fis_22 = new fis_2();
        fis_22.setMaxCharacters(30);
        long l = cwj_1.nTI.eWl().esY().Sn();
        fiq_2.gCw().d(fik_2.b(string -> {
            if (string == null || string.isEmpty()) {
                return;
            }
            cwj_1.c((short)177, (byte)0, l, string);
        }).vE("New guild name:").vG(ccp_2.mRE.byf()).pe(true).a(fis_22));
    }

    public static void removeGuildDescription(fiq_1 fiq_12) {
        cfv_2.a("Do you really want to delete the guild description?", (byte)1, null);
    }

    public static void removeGuildMessage(fiq_1 fiq_12) {
        cfv_2.a("Do you really want to delete the guild description?", (byte)2, null);
    }

    public static void resetGuildRanksName(fiq_1 fiq_12) {
        cfv_2.a("Do you really want to reset ALL the guild ranks name?", (byte)3, null);
    }

    public static void setGuildRandomBlazon(fiq_1 fiq_12) {
        cfv_2.a("Do you really want to reset the guild blazon to a random one?", (byte)4, buK.dJw().dJx().dJv().Sn());
    }

    private static void a(String string2, byte by, Object object) {
        long l = cwj_1.nTI.eWl().esY().Sn();
        fiq_2.gCw().d(fik_2.a((String string) -> {
            if (object != null) {
                cwj_1.c((short)177, by, l, object);
            } else {
                cwj_1.c((short)177, by, l);
            }
        }).vE(string2).vG(ccp_2.mRE.byf()));
    }

    public static void togglePanelFile(fiq_1 fiq_12) {
        cwj_1.eWi();
    }

    public static void muteZone(fiq_1 fiq_12) {
        fiq_2.gCw().d(fik_2.a((String string) -> new asf_0(2, List.of(Integer.valueOf(fsh_0.tbQ.aJr()))).bGy()).vE("Confirm the mute of this zone (90x90 cells) ?").vG(ccp_2.mRE.byf()));
    }

    public static void unmuteZone(fiq_1 fiq_12) {
        new atz_0().bGy();
    }

    public static void refreshMainPageInfos(fiq_1 fiq_12) {
        cwj_1.eWf();
    }

    public static void clearConsole(fiq_1 fiq_12) {
        cwj_1.nTI.eWl().esT();
    }

    public static void copyAllMembersInfo(fiq_1 fiq_12) {
        String string = cwj_1.nTI.eWl().esY().esB();
        bh_0.aI(string);
    }

    public static void openAllMembersInNala(fiq_1 fiq_12) {
        List<Long> list = cwj_1.nTI.eWl().esY().esC();
        cfv_2.E(list);
    }
}

