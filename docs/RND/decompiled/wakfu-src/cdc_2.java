/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.text.ParseException;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cDc
 */
@fyf_0
public class cdc_2 {
    private static final Logger mSL = Logger.getLogger(cdc_2.class);
    public static final String PACKAGE = "wakfu.achievements";
    public static final ccf_2 mSM = new ccf_2();

    @Nullable
    private static Long pk(@Nullable String string) {
        if (string == null || string.isBlank()) {
            return null;
        }
        try {
            return aum_0.cWf().cQ(string);
        }
        catch (ParseException parseException) {
            return null;
        }
    }

    public static void selectCategory(flg_2 flg_22) {
        dag dag2 = new dag((bcy_1)flg_22.getItemValue());
        aaw_1.bUq().h(dag2);
    }

    public static void sortQuests(fiq_1 fiq_12, String string) {
        Optional<bde_2> optional = bde_2.dh(string);
        if (optional.isEmpty()) {
            return;
        }
        dae_0 dae_02 = new dae_0(19755);
        dae_02.D((Object)optional.get());
        aaw_1.bUq().h(dae_02);
    }

    public static void filterAchievementsByName(fiq_1 fiq_12, fdv_1 fdv_12) {
        String string = fdv_12.getText();
        if (string == null) {
            return;
        }
        mSM.a(buh_0.jot.ordinal(), () -> cdc_2.pl(string));
    }

    public static void filterAchievementsByNameInstant(fiq_1 fiq_12, fdv_1 fdv_12) {
        String string = fdv_12.getText();
        if (string == null) {
            return;
        }
        cdc_2.pl(string);
    }

    private static void pl(@NotNull String string) {
        mSM.LQ(buh_0.jot.ordinal());
        cdc_2.e(new bcu_1(BH.aT(string)));
    }

    public static void filterByLevel(fiq_1 fiq_12, fdz_1 fdz_12, fdz_1 fdz_13) {
        Long l = cdc_2.pk(fdz_12.getText());
        Long l2 = cdc_2.pk(fdz_13.getText());
        mSM.a(buh_0.jou.ordinal(), () -> cdc_2.e(new bct_1(l, l2)));
    }

    public static void filterByPlayerCount(fiq_1 fiq_12, fdz_1 fdz_12, fdz_1 fdz_13) {
        Long l = cdc_2.pk(fdz_12.getText());
        Long l2 = cdc_2.pk(fdz_13.getText());
        mSM.a(buh_0.jox.ordinal(), () -> cdc_2.e(new bcv_2(l, l2)));
    }

    public static void toggleXpRewardsFilter(flv_2 flv_22) {
        cdc_2.e(new bdd_2(flv_22.bqr()));
    }

    public static void toggleKamasRewardsFilter(flv_2 flv_22) {
        cdc_2.e(new bcy_2(flv_22.bqr()));
    }

    public static void toggleTokensRewardsFilter(flv_2 flv_22) {
        cdc_2.e(new bdc_2(flv_22.bqr()));
    }

    public static void toggleItemsRewardsFilter(flv_2 flv_22) {
        cdc_2.e(new bcx_1(flv_22.bqr()));
    }

    public static void toggleOtherRewardsFilter(flv_2 flv_22) {
        cdc_2.e(new bcz_2(flv_22.bqr()));
    }

    private static void e(bug_0<bci_1> bug_02) {
        dae_0 dae_02 = new dae_0(19202);
        dae_02.D(bug_02);
        aaw_1.bUq().h(dae_02);
    }

    public static void selectAchievementCategory(flv_2 flv_22) {
        if (!flv_22.bqr() || !(flv_22.gBE() instanceof fcu_1)) {
            return;
        }
        try {
            int n = Integer.parseInt(((fcu_1)flv_22.gBE()).getValue());
            dae_0 dae_02 = new dae_0(19202);
            dae_02.D(new bcw_2(bbz_2.AJ(n)));
            aaw_1.bUq().h(dae_02);
        }
        catch (NumberFormatException numberFormatException) {
            mSL.warn((Object)("Invalid tab value: " + ((fcu_1)flv_22.gBE()).getValue()));
        }
    }

    public static void displayHistory(fiq_1 fiq_12) {
        dag dag2 = new dag(null);
        aaw_1.bUq().h(dag2);
    }

    public static void selectAchievement(flg_2 flg_22, fdf_1 fdf_12) {
        dah_0 dah_02 = new dah_0((bci_1)flg_22.getItemValue());
        cdc_2.a(fdf_12, "questList");
        if (flg_22.gEm()) {
            dah_02.fa("logBookDialog");
        }
        aaw_1.bUq().h(dah_02);
    }

    public static void selectAchievement(flg_2 flg_22, String string) {
        dah_0 dah_02 = new dah_0((bci_1)flg_22.getItemValue());
        if (flg_22.gEm()) {
            dah_02.fa(string);
        }
        aaw_1.bUq().h(dah_02);
    }

    public static void selectAchievementList(flg_2 flg_22, fdf_1 fdf_12) {
        cdc_2.a(fdf_12, "AchievementList");
        bcy_1 bcy_12 = (bcy_1)flg_22.getItemValue();
        dae_0 dae_02 = new dae_0(17221);
        dae_02.D(bcy_12);
        aaw_1.bUq().h(dae_02);
    }

    private static void a(fdf_1 fdf_12, String string) {
        fdf_12.getRenderables().forEach(fcv_12 -> {
            fbz_2 fbz_22 = (fbz_2)fcv_12.getChildWithId(string);
            fbz_22.setSelected(null);
        });
    }

    public static void mouseOverAchievementQuickList(flg_2 flg_22) {
        fse_1.gFu().f("overQuickAchievement", flg_22.getItemValue());
    }

    public static void mouseOutAchievementQuickList(flg_2 flg_22) {
        fse_1.gFu().f("overQuickAchievement", fse_1.gFu().vY("selectedAchievement"));
    }

    public static void changeRewardBackgroundAndPopup(flp_2 flp_22, frx_1 frx_12, fes_2 fes_22) {
        if (flp_22.gBy() == fzq_0.tJQ) {
            fes_22.setStyle("itemSelectedBackground");
            fyd_0.popup(flp_22, frx_12);
        } else if (flp_22.gBy() == fzq_0.tJR) {
            fes_22.setStyle("itemBackground");
            fyd_0.closePopup(flp_22, frx_12);
        }
    }

    public static void changeAchievementFilter(flk_2 flk_22) {
        if (!flk_22.bqr()) {
            return;
        }
        dae_0 dae_02 = new dae_0(19202);
        dae_02.D(new bcr_1((csf_1)((Object)flk_22.getValue())));
        aaw_1.bUq().h(dae_02);
    }

    public static void selectLastCompletedAchievement(fiq_1 fiq_12) {
        dah_0 dah_02 = new dah_0(null);
        aaw_1.bUq().h(dah_02);
    }

    public static void selectPreviousAchievementQuickList(fiq_1 fiq_12) {
        bcu_2 bcu_22 = csc_1.eNJ().eNP();
        if (bcu_22 == null) {
            return;
        }
        bci_1 bci_12 = bcu_22.dbo().dbD();
        if (bci_12 == null) {
            return;
        }
        dah_0 dah_02 = new dah_0(bci_12);
        aaw_1.bUq().h(dah_02);
    }

    public static void selectNextAchievementQuickList(fiq_1 fiq_12) {
        bcu_2 bcu_22 = csc_1.eNJ().eNP();
        if (bcu_22 == null) {
            return;
        }
        bci_1 bci_12 = bcu_22.dbo().dbE();
        if (bci_12 == null) {
            return;
        }
        dah_0 dah_02 = new dah_0(bci_12);
        aaw_1.bUq().h(dah_02);
    }

    public static void goBackCategory(fiq_1 fiq_12) {
        bcu_2 bcu_22 = csc_1.eNJ().eNP();
        if (bcu_22 == null) {
            return;
        }
        dag dag2 = new dag(bcu_22.dbo());
        aaw_1.bUq().h(dag2);
    }

    public static void hideShowAchievement(flv_2 flv_22, bci_1 bci_12) {
        if (flv_22.bqr() == bci_12.bqp()) {
            return;
        }
        dae_0 dae_02 = new dae_0();
        dae_02.lK(17386);
        dae_02.D(bci_12);
        dae_02.cC(flv_22.bqr());
        aaw_1.bUq().h(dae_02);
    }

    public static boolean followAchievement(flv_2 flv_22, bci_1 bci_12) {
        return cdc_2.followAchievement(flv_22.bqr(), bci_12);
    }

    public static boolean followAchievement(boolean bl, bci_1 bci_12) {
        if (bl == bci_12.dcc()) {
            return true;
        }
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18839);
        dae_02.sY(bci_12.d());
        dae_02.cC(bl);
        aaw_1.bUq().h(dae_02);
        return true;
    }

    public static void share(fiq_1 fiq_12, bci_1 bci_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16242);
        dae_02.sY(bci_12.d());
        aaw_1.bUq().h(dae_02);
    }

    public static void switchCharacterInQuestDialog(fiq_1 fiq_12, bhJ bhJ2) {
        cdc_2.a(bhJ2, "logBookDialog");
    }

    private static void a(bhJ bhJ2, String string) {
        fse_1.gFu().b("characterSheet", bwa_0.jwi.aj((bhJ)fcL.rUh.sw(bhJ2.Sn())), string);
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19663);
        dae_02.gj(bhJ2.Sn());
        aaw_1.bUq().h(dae_02);
    }

    public static void openItemDetailWindow(flg_2 flg_22) {
        if (!flg_22.gEm()) {
            return;
        }
        Object object = flg_22.getItemValue();
        if (!(object instanceof bce_2)) {
            return;
        }
        bce_2 bce_22 = (bce_2)object;
        if (bce_22.dbV() == null) {
            return;
        }
        bby_2 bby_22 = bce_22.dbV().dbb();
        if (bby_22 == bby_2.hCJ) {
            dcC dcC2 = new dcC();
            bmx_0 bmx_02 = bce_22.dbZ();
            dcC2.g(bmx_02);
            dcC2.NQ(flg_22.fca());
            dcC2.fa(((fhv_1)flg_22.gBD()).getElementMap().getId());
            dcC2.lK(18231);
            aaw_1.bUq().h(dcC2);
        } else if (bby_22 == bby_2.hCy) {
            cdd_2.sendOpenCloseItemDetailMessage("logBookDialog", bce_22.dbY());
        }
    }

    public static void openCloseRewardDescription(flg_2 flg_22, faw_2 faw_22) {
        int n;
        if (!(flg_22.getItemValue() instanceof bce_2)) {
            return;
        }
        bce_2 bce_22 = (bce_2)flg_22.getItemValue();
        int n2 = n = bce_22.dbV().dba() != null && bce_22.dbV().dba().length > 0 ? bce_22.dbV().dba()[0] : 0;
        if (bce_22.dbV().dbb() == bby_2.hCJ) {
            bmt_0 bmt_02 = bmb_0.eeV().If(n);
            bmx_0 bmx_02 = new bmx_0(bmt_02, 0, -1L, null);
            fse_1.gFu().f("describedSpell", bmx_02);
            fse_1.gFu().f("describedSpellRealLevel", bmx_02.cmL());
            frx_1 frx_12 = (frx_1)faw_22.getElementMap().uH("spellDetailPopup");
            frx_12.setHotSpotPosition(faa_2.tLR);
            frx_12.setAlign(faa_2.tLL);
            if (flg_22.gBy() == fzq_0.tJE && !fbj_1.getInstance().isDragging()) {
                fyd_0.popup(frx_12, (fes_2)flg_22.gBE());
            } else if (flg_22.gBy() == fzq_0.tJD) {
                fyd_0.closePopup(flg_22, frx_12);
            }
        } else if (bce_22.dbV().dbb() == bby_2.hCy) {
            Object r = fgD.fXh().Vd(n);
            if (r == null) {
                return;
            }
            frx_1 frx_13 = (frx_1)faw_22.getElementMap().uH("itemDetailPopup");
            frx_13.setHotSpotPosition(faa_2.tLR);
            frx_13.setAlign(faa_2.tLL);
            if (flg_22.gBy() == fzq_0.tJE && !fbj_1.getInstance().isDragging()) {
                fse_1.gFu().f("itemPopupDetail", r);
                fyd_0.popup(frx_13, (fes_2)flg_22.gBE());
            } else if (flg_22.gBy() == fzq_0.tJD) {
                fse_1.gFu().f("itemPopupDetail", (Object)null);
                fyd_0.closePopup(flg_22, frx_13);
            }
        }
    }

    public static void collapseCategory(fiq_1 fiq_12, bch_2 bch_22) {
        dae_0 dae_02 = new dae_0(16040);
        dae_02.D(bch_22);
        aaw_1.bUq().h(dae_02);
    }

    public static void collapseAllCategories(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(17517);
        dae_02.cC(true);
        aaw_1.bUq().h(dae_02);
    }

    public static void unCollapseAllCategories(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(17517);
        dae_02.cC(false);
        aaw_1.bUq().h(dae_02);
    }

    public static void showAchievementPopup(flg_2 flg_22, frx_1 frx_12) {
        if (flg_22.getItemValue() == null) {
            return;
        }
        if (!(flg_22.getItemValue() instanceof bci_1)) {
            return;
        }
        bci_1 bci_12 = (bci_1)flg_22.getItemValue();
        fse_1.gFu().f("describedAchievement", bci_12);
        faw_2 faw_22 = (faw_2)flg_22.gBE();
        fyd_0.popup(frx_12, faw_22);
    }

    public static void showAchievementPopup(fiq_1 fiq_12, frx_1 frx_12, bci_1 bci_12) {
        if (bci_12 == null) {
            return;
        }
        fse_1.gFu().f("describedAchievement", bci_12);
        fes_2 fes_22 = (fes_2)fiq_12.gBE();
        fyd_0.popup(frx_12, fes_22);
    }

    public static void displayRewardPopup(flg_2 flg_22, frx_1 frx_12, frx_1 frx_13) {
        if (!(flg_22.getItemValue() instanceof bce_2)) {
            return;
        }
        bce_2 bce_22 = (bce_2)flg_22.getItemValue();
        if (bce_22.dbV().dbb() == bby_2.hCy) {
            cdd_2.showItemPopup(flg_22, frx_13);
        } else if (bce_22.dbV().dbb() == bby_2.hCJ) {
            bmx_0 bmx_02 = bce_22.dbZ();
            cgz_2.openCloseDescription(flg_22, bmx_02, "spellDetailPopup");
        } else {
            fse_1.gFu().f("rewardDescriptionText", bce_22.dbU());
            fyd_0.popup(frx_12, (fes_2)flg_22.gBE());
        }
    }

    public static void openBoosterXpPopup(fiq_1 fiq_12, frx_1 frx_12, bci_1 bci_12) {
        if (bci_12 == null || bci_12.dcg() == null) {
            return;
        }
        fse_1.gFu().f("rewardXPBoosterDescription", bci_12.dcg().dbS());
        fse_1.gFu().f("rewardXPDescription", bci_12.dcg().dbU());
        fes_2 fes_22 = (fes_2)fiq_12.gBE();
        fyd_0.popup(frx_12, fes_22);
    }

    public static void removeBulletPoints(flg_2 flg_22) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof bci_1)) {
            return;
        }
        bci_1 bci_12 = (bci_1)object;
        bci_12.fn(false);
        bci_12.fo(false);
        fse_1.gFu().a((aef_2)bci_12, "justActivated", "justCompleted");
    }

    public static void collapseAchievement(flg_2 flg_22) {
        if (!flg_22.gEk() || !(flg_22.getItemValue() instanceof bci_1)) {
            return;
        }
        dae_0 dae_02 = new dae_0(17055);
        dae_02.D(flg_22.getItemValue());
        aaw_1.bUq().h(dae_02);
    }

    public static void changeLogBookView(flv_2 flv_22) {
        if (!flv_22.bqr()) {
            return;
        }
        fcu_1 fcu_12 = (fcu_1)flv_22.gBE();
        byte by = Byte.parseByte(fcu_12.getValue());
        dae_0 dae_02 = new dae_0(18924);
        dae_02.ay(by);
        aaw_1.bUq().h(dae_02);
    }
}

