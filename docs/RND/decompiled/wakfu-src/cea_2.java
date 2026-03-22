/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.console.command.commonIn.CosmeticPresetsCommand;
import com.ankamagames.wakfu.client.console.command.commonIn.MapCommand;
import com.ankamagames.wakfu.client.console.command.display.EnableMiniMapCommand;
import com.ankamagames.wakfu.client.console.command.world.EnterLeaveDimensionalBagCommand;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from cEa
 */
@fyf_0
public class cea_2 {
    public static final String PACKAGE = "wakfu.controlCenter";
    private static final Logger mUq = Logger.getLogger(cea_2.class);
    private static int kmy = 0;

    public static void openCloseShortcutBar(fiq_1 fiq_12) {
        dae_0.cV((short)16889);
    }

    public static void openCloseStateBar(fiq_1 fiq_12) {
        dae_0.cV((short)19096);
    }

    public static void openCloseEventsCalendarDialog(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(cun_1.eRJ())) {
            aue_0.cVJ().b(cun_1.eRJ());
        } else {
            aue_0.cVJ().a(cun_1.eRJ());
        }
    }

    public static void setMode(fiq_1 fiq_12, String string) {
        fse_1.gFu().f("controlCenterDisplayMode", string);
    }

    public static void dropCommand(fiq_1 fiq_12, String string) {
        if (fiq_12 instanceof fla_2) {
            fla_2 fla_22 = (fla_2)fiq_12;
        }
    }

    public static void openInventory(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(cvo_2.eUK())) {
            aue_0.cVJ().b(cvo_2.eUK());
        } else {
            cvo_2.eUK().eUN();
        }
    }

    public static void openCharacterSheet(fiq_1 fiq_12) {
        csx_1 csx_12 = csx_1.ePi();
        if (!aue_0.cVJ().c(csx_12)) {
            aue_0.cVJ().a(csx_12);
        } else {
            aue_0.cVJ().b(csx_12);
        }
    }

    public static void openSpellsPage(fiq_1 fiq_12) {
        czt_2.NF(1);
    }

    public static void openBuildSheetSet(fiq_1 fiq_12) {
        czt_2.NF(0);
    }

    public static void openCloseGuildManagement(fiq_1 fiq_12) {
        if (!aue_0.cVJ().c(cvg_2.eTB())) {
            aue_0.cVJ().a(cvg_2.eTB());
        } else {
            aue_0.cVJ().b(cvg_2.eTB());
        }
    }

    public static void openCloseDimensionBagRoomManager(fiq_1 fiq_12) {
        if (!aue_0.cVJ().c(ctt_2.eRh())) {
            aue_0.cVJ().a(ctt_2.eRh());
        } else {
            aue_0.cVJ().b(ctt_2.eRh());
        }
    }

    public static void openCloseMiniMap(fiq_1 fiq_12) {
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        boolean bl = bsg_12.a(bsn_1.ljK);
        EnableMiniMapCommand.eW(!bl);
    }

    public static void openCloseGlobalMap(fiq_1 fiq_12) {
        MapCommand.cTQ();
    }

    public static void openCloseCraftDialog(fiq_1 fiq_12) {
        if (!aue_0.cVJ().c(cte_2.eQC())) {
            aue_0.cVJ().a(cte_2.eQC());
        } else {
            aue_0.cVJ().b(cte_2.eQC());
        }
    }

    public static void togglePresetDialog(fiq_1 fiq_12) {
        CosmeticPresetsCommand.cTH();
    }

    public static void toggleHudMenuExpansion(fiq_1 fiq_12) {
        boolean bl = !fse_1.gFu().dp("hudButtonMenuExpanded");
        fse_1.gFu().f("hudButtonMenuExpanded", bl);
        cty_1.ePV().eQb();
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        bsg_12.a((afe)bsn_1.lkX, bsg_12.a(bsn_1.lkW) && bl);
    }

    public static void toggleRide(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19014);
        aaw_1.bUq().h(dae_02);
    }

    public static void openOptionsDialog(fiq_1 fiq_12) {
        dae_0.cV((short)18539);
    }

    public static void cycleProgressBarDisplayMode(fiq_1 fiq_12, fcp_2 fcp_22) {
        cea_2.a(fcp_22, false);
    }

    public static void cycleProgressBarDisplayModeFull(fiq_1 fiq_12, fcp_2 fcp_22) {
        cea_2.a(fcp_22, true);
    }

    private static void a(fcp_2 fcp_22, boolean bl) {
        fzh_0 fzh_02;
        int n = fcp_22.getDisplayValue().ordinal();
        fzh_0[] fzh_0Array = fzh_0.values();
        do {
            fzh_02 = fzh_0Array[(n + 1) % fzh_0Array.length];
            ++n;
        } while (!bl && fzh_02 == fzh_0.tGW);
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.ljl, fzh_02.ordinal());
        cAY.eHc().nP(600004L);
    }

    public static void toggleStatesVisibility(flp_2 flp_22, String string) {
        if (string == null) {
            return;
        }
        boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ew(string));
        ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ew(string), !bl);
    }

    public static void clickHp(flp_2 flp_22, fcp_2 fcp_22) {
        if (flp_22.gEk()) {
            cea_2.a(fcp_22, true);
        }
    }

    public static void openCloseSmallWeatherDialog(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(cyp_2.eYz())) {
            aue_0.cVJ().b(cyp_2.eYz());
        } else {
            aue_0.cVJ().a(cyp_2.eYz());
        }
    }

    public static void openCloseWeatherDialog(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(cyn_1.eYy())) {
            aue_0.cVJ().b(cyn_1.eYy());
        } else {
            aue_0.cVJ().a(cyn_1.eYy());
        }
    }

    public static void openCloseEcosystemEquilibriumDialog(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(cud_2.eRs())) {
            aue_0.cVJ().b(cud_2.eRs());
        } else {
            aue_0.cVJ().a(cud_2.eRs());
        }
    }

    public static void openAchievementsDialog(fiq_1 fiq_12, bci_1 bci_12) {
        boolean bl = bcm_1.hIK.w(aue_0.cVJ().cVK().Sn(), bci_12.d());
        csc_1.eNJ().a(bl, bci_12);
    }

    public static void openCloseAchievementsDialog(fiq_1 fiq_12) {
        csc_1.eNJ().jZ(false);
    }

    public static void openCloseQuestsDialog(fiq_1 fiq_12) {
        csc_1.eNJ().jZ(true);
    }

    public static void openCloseProtectorView(fiq_1 fiq_12) {
        if (!aue_0.cVJ().c(cxk_1.eXu())) {
            aue_0.cVJ().a(cxk_1.eXu());
        } else {
            aue_0.cVJ().b(cxk_1.eXu());
        }
    }

    public static void openClosePassport(fiq_1 fiq_12) {
        if (!aue_0.cVJ().c(cxu_1.eXd())) {
            aue_0.cVJ().a(cxu_1.eXd());
        } else {
            aue_0.cVJ().b(cxu_1.eXd());
        }
    }

    public static void openCloseCitizen(fiq_1 fiq_12) {
        if (!aue_0.cVJ().c(cwo_2.eWo())) {
            aue_0.cVJ().a(cwo_2.eWo());
        } else {
            aue_0.cVJ().b(cwo_2.eWo());
        }
    }

    public static void onMiniMapItemOver(fln_2 fln_22) {
        cty_1.ePV().a(fln_22);
    }

    public static void onMiniMapItemOut(fln_2 fln_22) {
        fbj_1.getInstance().getPopupContainer().eKH();
    }

    public static void adminTP(fll_2 fll_22) {
        if (fll_22.gDT() || fll_22.gDQ() || fll_22.gDR() || fll_22.gDU() || fll_22.gDS()) {
            return;
        }
        if (!fll_22.gEk()) {
            return;
        }
        int[] nArray = aue_0.cVJ().cVK().dpL().cWq();
        if (!evm_2.b(nArray, evn_2.ote)) {
            return;
        }
        new atq_0(2, (int)fll_22.gEb(), (int)fll_22.gEc(), bif_2.dYO().dYd(), true).bGy();
    }

    public static void openRunningEffectDescription(flg_2 flg_22) {
        bMn bMn2 = (bMn)flg_22.getItemValue();
        if (bMn2 == null) {
            return;
        }
        bMn bMn3 = bMn2.eeB();
        if (flg_22.gEk()) {
            Iterable<Object> iterable = bMn2.eex();
            if (iterable instanceof bmq_0) {
                short s;
                bmq_0 bmq_02 = (bmq_0)iterable;
                iterable = new HashSet<Short>(((bsg_1)aie_0.cfn().bmH()).g(bsn_1.ljs));
                if (iterable.contains(s = bmq_02.gjy())) {
                    iterable.remove(s);
                } else {
                    iterable.add(s);
                }
                ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.ljs, (Set<Short>)iterable);
                fse_1.gFu().a((aef_2)aue_0.cVJ().cVK(), "positiveFavoriteStates", "neutralFavoriteStates", "negativeFavoriteStates");
            }
            return;
        }
        String string = "runningEffectDetailDialog" + bMn2.eex().QF();
        if (fyw_0.gqw().to(string)) {
            fyw_0.gqw().tl(string);
        } else {
            fyw_0.gqw().a(string, ccj_2.pe("runningEffectDetailDialog"), 16L);
            fse_1.gFu().b("describedRunningEffect", bMn3, string);
        }
    }

    public static void openCloseOsamodasSymbiotDialog(fiq_1 fiq_12) {
        dae_0.cV((short)18027);
    }

    public static void openCloseDimensionalBag(fiq_1 fiq_12) {
        EnterLeaveDimensionalBagCommand.cUv();
    }

    public static void openCloseDungeonListDialog(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(cua_2.eRq())) {
            aue_0.cVJ().b(cua_2.eRq());
        } else {
            aue_0.cVJ().a(cua_2.eRq());
        }
    }

    public static void openCloseBattlegroundListDialog(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(csu_1.eOe())) {
            aue_0.cVJ().b(csu_1.eOe());
        } else {
            aue_0.cVJ().a(csu_1.eOe());
        }
    }

    public static void openCloseRewardsDialog(fiq_1 fiq_12) {
        cuv_2.eTk().kq(false);
    }

    public static void openCloseGiftDialog(fiq_1 fiq_12) {
        cuv_2.eTk().kq(true);
    }

    public static void openCloseGuideListDialog(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(cuy_1.eTo())) {
            aue_0.cVJ().b(cuy_1.eTo());
        } else {
            aue_0.cVJ().a(cuy_1.eTo());
        }
    }

    public static void openHavenWorldCatalog(fiq_1 fiq_12) {
    }

    public static void leaveInstance(fiq_1 fiq_12) {
        if (fse_1.gFu().dp("isInHavenWorld")) {
            clb clb2 = new clb();
            aue_0.cVJ().etu().d(clb2);
            if (fyw_0.gqw().to("furnitureListDialog")) {
                fyw_0.gqw().tl("furnitureListDialog");
            }
        } else if (fse_1.gFu().dp("isInBattleground")) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (bgt_02.dnC()) {
                aPd.e("error.cantLeaveBGDuringSpectate", new Object[0]);
                return;
            }
            cni_0 cni_02 = new cni_0();
            aue_0.cVJ().etu().d(cni_02);
        }
    }

    public static void openCompanionsManagement(fiq_1 fiq_12) {
        if (!fcI.fSN()) {
            return;
        }
        if (aue_0.cVJ().c(ctu_2.nJd)) {
            aue_0.cVJ().b(ctu_2.nJd);
        } else {
            aue_0.cVJ().a(ctu_2.nJd);
        }
    }

    public static void openStasisDungeon(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(cyo_2.eXQ())) {
            aue_0.cVJ().b(cyo_2.eXQ());
        } else {
            cyo_2.eXQ().eXR();
        }
    }

    public static void openCloseFurnitureDialog(fiq_1 fiq_12) {
        cus_1 cus_12 = cus_1.eTb();
        if (!aue_0.cVJ().c(cus_12)) {
            aue_0.cVJ().a(cus_12);
        } else {
            aue_0.cVJ().b(cus_12);
        }
    }

    public static void openCloseEnvironmentQuest(fiq_1 fiq_12) {
        boolean bl = !((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljN);
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.ljN, bl);
    }

    public static void showStatePopup(flg_2 flg_22, frx_1 frx_12) {
        if (frx_12 == null) {
            return;
        }
        if (flg_22.getItemValue() == null) {
            return;
        }
        cgn_1.showPopup(flg_22, frx_12);
    }

    public static void openCloseEncyclopediaDialog(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(cuj_2.eRB())) {
            aue_0.cVJ().b(cuj_2.eRB());
        } else {
            aue_0.cVJ().a(cuj_2.eRB());
        }
    }
}

