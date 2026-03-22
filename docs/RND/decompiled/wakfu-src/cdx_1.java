/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDX
 */
@fyf_0
public class cdx_1
extends cdu_1 {
    public static final String PACKAGE = "wakfu.companionsManagement";

    public static void selectCompanion(flg_2 flg_22) {
        fse_1.gFu().b("characterSheet", flg_22.getItemValue(), "companionsManagementDialog");
    }

    public static void selectAlphabeticalSorter(flv_2 flv_22) {
        ctu_2.nJd.ePQ().gs(flv_22.bqr());
        ctu_2.nJd.ePR();
    }

    public static void selectLevelSorter(flv_2 flv_22) {
        ctu_2.nJd.ePQ().gt(flv_22.bqr());
        ctu_2.nJd.ePR();
    }

    public static void selectFilter(flv_2 flv_22) {
        if (!flv_22.bqr()) {
            return;
        }
        fcu_1 fcu_12 = (fcu_1)flv_22.gBE();
        int n = Integer.parseInt(fcu_12.getValue());
        blv_0 blv_02 = blv_0.DG(n);
        ctu_2.nJd.ePQ().a(blv_02);
        ctu_2.nJd.ePR();
    }

    public static void setPage(flv_2 flv_22) {
        if (!flv_22.bqr()) {
            return;
        }
        fcu_1 fcu_12 = (fcu_1)flv_22.gBE();
        byte by = Byte.parseByte(fcu_12.getValue());
        fse_1.gFu().f("companionManagementPage", by);
    }

    public static void removeCompanion(fiq_1 fiq_12, blp_0 blp_02) {
        fiq_2.gCw().d(fik_2.a(string -> {
            cjz cjz2 = new cjz(blp_02.doL());
            aue_0.cVJ().etu().d(cjz2);
        }).l("question.unlinkCompanion", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
    }

    public static void retrieveAllItems(fiq_1 fiq_12, blp_0 blp_02) {
        cjB cjB2 = new cjB(blp_02.doL());
        aue_0.cVJ().etu().d(cjB2);
    }

    public static void validRenameCompanion(fiq_1 fiq_12, fdu_1 fdu_12) {
        if (fiq_12.gBy() == fzq_0.tJF && ((fli_2)fiq_12).bCC() != 10) {
            return;
        }
        String string = fdu_12.getText();
        blp_0 blp_02 = (blp_0)fse_1.gFu().aW("characterSheet", "companionsManagementDialog");
        if (string != null && string.length() > 0 && !string.equals(blp_02.getName())) {
            if (!VV.bkY().dB(string)) {
                aPd.e("error.connection.nicknameInvalidContent", new Object[0]);
            } else {
                cjA cjA2 = new cjA(blp_02.doL(), string);
                aue_0.cVJ().etu().d(cjA2);
            }
        }
    }

    public static void openSpellPopup(flg_2 flg_22, fey_2 fey_22) {
        bmx_0 bmx_02 = (bmx_0)flg_22.getItemValue();
        fse_1.gFu().f("describedSpell", bmx_02);
        fse_1.gFu().f("describedSpellRealLevel", bmx_02.cmL());
        frx_1 frx_12 = (frx_1)fey_22.getElementMap().uH("spellDetailPopup");
        if (flg_22.gBy() == fzq_0.tJE && !fbj_1.getInstance().isDragging()) {
            fyd_0.popup(frx_12, fey_22);
        } else if (flg_22.gBy() == fzq_0.tJD) {
            fyd_0.closePopup(flg_22, frx_12);
        }
    }

    public static void buyCompanion(fiq_1 fiq_12, blp_0 blp_02) {
        bpt_1<?, ?> bpt_12 = blp_02.dtB();
        cyr_2.eYA().h(bpt_12);
    }

    public static void displayPage(fiq_1 fiq_12, String string) {
        Byte by = Byte.valueOf(string);
        int n = fse_1.gFu().dq("companionCurrentPageIndex");
        if (by == n) {
            return;
        }
        fse_1.gFu().f("companionCurrentPageIndex", by);
    }

    public static void addCompanionToParty(blp_0 blp_02) {
        long l = blp_02.doL();
        cjw cjw2 = new cjw(l);
        aue_0.cVJ().etu().d(cjw2);
        bqm_0.jbp.b(new brh_1());
        bly_0.ivl.setNetEnabled(false);
    }

    public static void addToParty(flg_2 flg_22) {
        if (!bly_0.ivl.dtY()) {
            return;
        }
        if (!(flg_22.getItemValue() instanceof bgl_0)) {
            return;
        }
        bgl_0 bgl_02 = (bgl_0)flg_22.getItemValue();
        bly_0.ivl.d(bgl_02);
        cdx_1.l(bgl_02);
    }

    public static void manageCharacterSelection(flg_2 flg_22) {
        if (!bly_0.ivl.dtY()) {
            return;
        }
        if (!(flg_22.getItemValue() instanceof bgl_0)) {
            return;
        }
        bgl_0 bgl_02 = (bgl_0)flg_22.getItemValue();
        boolean bl = bly_0.c(bgl_02);
        if (bl) {
            cdx_1.k(bgl_02);
            return;
        }
        fcy fcy2 = bgl_02.dmb();
        if (bgl_02.aXd()) {
            if (bgl_02.dlS()) {
                cdx_1.addCompanionToParty((blp_0)bgl_02);
            }
        } else {
            eww eww2 = fcz.rTU.a(fcy2);
            if (eww2 == eww.oHf) {
                cdx_1.addHeroToParty(bgl_02);
            } else if (eww2 == eww.oHj) {
                cyr_2.eYA().qU("WAKFU_BOOSTER_PACK");
            }
        }
    }

    public static void removeFromParty(fiq_1 fiq_12, bgl_0 bgl_02) {
        cdx_1.k(bgl_02);
    }

    public static void openCompanyRewards(fiq_1 fiq_12) {
        if (fyw_0.gqw().to("companyRewardsDialog")) {
            fyw_0.gqw().tl("companyRewardsDialog");
        } else {
            cus_2.eRQ().ak(aue_0.cVJ().cVK());
            ccj_2.g("companyRewardsDialog", 32768L);
        }
    }

    public static void purchase(fiq_1 fiq_12, bsu_0 bsu_02) {
        dbj dbj2 = new dbj();
        dbj2.f(bsu_02);
        dbj2.ak((short)1);
        dbj2.lK(19032);
        aaw_1.bUq().h(dbj2);
    }

    public static void upgradeSlot(fiq_1 fiq_12) {
        cyr_2.eYA().qU("heros_wakfu");
    }

    public static void mouseOverHeroList(flg_2 flg_22) {
        fse_1.gFu().f("overHero", flg_22.getItemValue());
    }

    public static void mouseOutHeroList(flg_2 flg_22) {
        fse_1.gFu().f("overHero", (Object)null);
    }

    private static void k(bgl_0 bgl_02) {
        bvi_0 bvi_02 = aue_0.cVJ().cVK().dnQ();
        if (!bvi_02.dfG()) {
            return;
        }
        long l = bgl_02.dcP().Sn();
        if (bgl_02.aXd()) {
            l = -((blp_0)bgl_02).doL();
        }
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19043);
        dae_02.gj(l);
        aaw_1.bUq().h(dae_02);
    }

    private static void l(bgl_0 bgl_02) {
        if (bgl_02.aXd()) {
            cdx_1.addCompanionToParty((blp_0)bgl_02);
        } else {
            cdx_1.addHeroToParty(bgl_02);
        }
    }

    public static void addHeroToParty(bgl_0 bgl_02) {
        long l = bgl_02.dcP().Sn();
        cjx cjx2 = new cjx(l);
        aue_0.cVJ().etu().d(cjx2);
        bly_0.ivl.setNetEnabled(false);
    }

    public static void selectExchange(flp_2 flp_22, bsu_0 bsu_02) {
        cee_1.selectExchange(flp_22, bsu_02);
        if (!"exchangeBackground".equals(((fhv_1)flp_22.gBE()).getId())) {
            return;
        }
        if (flp_22.gEk()) {
            if (bly_0.ivl.dtR() == bsu_02) {
                bly_0.ivl.clean();
            } else {
                bly_0.ivl.a(bsu_02);
            }
        }
    }

    public static void unloadRewardPreviewDialog(fiq_1 fiq_12) {
        fyw_0.gqw().tl("companyRewardsDialog");
        bly_0.ivl.clean();
    }

    public static void changeDirection(flp_2 flp_22, fax_1 fax_12) {
        cff_1.changeDirection(flp_22, fax_12);
    }

    public static void displayLevelInfos(flp_2 flp_22, fdz_1 fdz_12, String string) {
        fdz_12.setText(string);
    }
}

