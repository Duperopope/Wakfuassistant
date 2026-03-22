/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.wakfu.client.console.command.commonIn.MapCommand;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cEt
 */
@fyf_0
public class cet_1 {
    public static final String PACKAGE = "wakfu.dungeon";
    private static final alx_2 mUY = new ceu_1();

    public static void selectDungeon(flg_2 flg_22) {
        bny_0 bny_02 = (bny_0)flg_22.getItemValue();
        if (aPe.a(flg_22)) {
            aPe.a(bny_02);
            return;
        }
        if (cua_2.eRq().eRr().dzV().d() == bny_02.d()) {
            return;
        }
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19191);
        dae_02.sY(bny_02.d());
        aaw_1.bUq().h(dae_02);
    }

    public static void setFilter(fiq_1 fiq_12, bnu_0 bnu_02) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18986);
        dae_02.ay(bnu_02.dzF().aJr());
        aaw_1.bUq().h(dae_02);
    }

    public static void validNameFilter(fiq_1 fiq_12, fdv_1 fdv_12) {
        String string = fdv_12.getText();
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16571);
        dae_02.fa(string);
        aaw_1.bUq().h(dae_02);
    }

    public static void validMinLevelFilter(fiq_1 fiq_12, fdu_1 fdu_12) {
        short s = -1;
        String string = fdu_12.getText();
        if (string != null && !string.isEmpty()) {
            s = Bw.r(string);
        }
        dae_0 dae_02 = new dae_0();
        dae_02.lK(17935);
        dae_02.az(s);
        aaw_1.bUq().h(dae_02);
    }

    public static void validMaxLevelFilter(fiq_1 fiq_12, fdu_1 fdu_12) {
        short s = Short.MAX_VALUE;
        String string = fdu_12.getText();
        if (string != null && !string.isEmpty()) {
            s = Bw.r(string);
        }
        dae_0 dae_02 = new dae_0();
        dae_02.lK(17408);
        dae_02.az(s);
        aaw_1.bUq().h(dae_02);
    }

    public static void toggleCurrentLevel(fiq_1 fiq_12, fdu_1 fdu_12, fdu_1 fdu_13) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        Bu<Short, Short> bu = eIi.dD(bgt_02.cmL());
        long l = bu.getFirst().shortValue();
        long l2 = bu.aHI().shortValue();
        String string = fdu_12.getText();
        String string2 = fdu_13.getText();
        if (!string.isEmpty() && !string2.isEmpty() && (long)Integer.parseInt(string) == l && (long)Integer.parseInt(string2) == l2) {
            fdu_12.guD();
            fdu_13.guD();
            bu = new Bu<Short, Short>((short)0, (short)ewo_0.oBF.i(ewr_0.oCk));
        } else {
            fdu_12.setText(String.valueOf(l));
            fdu_13.setText(String.valueOf(l2));
        }
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16060);
        dae_02.D(bu);
        aaw_1.bUq().h(dae_02);
    }

    public static void changeDungeonGameplayFilter(flk_2 flk_22) {
        if (!flk_22.bqr() || !(flk_22.getValue() instanceof bnv_0)) {
            return;
        }
        bnv_0 bnv_02 = (bnv_0)flk_22.getValue();
        dae_0 dae_02 = new dae_0(18888);
        dae_02.D(bnv_02.dzH());
        aaw_1.bUq().h(dae_02);
    }

    public static void changeDungeonDoneFilter(fiq_1 fiq_12, String string) {
        @Nullable Boolean bl = Boolean.parseBoolean(string);
        cet_1.j(bl);
    }

    public static void changeDungeonDoneFilter(fiq_1 fiq_12) {
        cet_1.j(null);
    }

    private static void j(Boolean bl) {
        if (cua_2.eRq().eRr().dzT() == bl) {
            return;
        }
        dae_0 dae_02 = new dae_0(16094);
        dae_02.D(bl);
        aaw_1.bUq().h(dae_02);
    }

    public static void heroPrevious(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18359);
        dae_02.cC(true);
        aaw_1.bUq().h(dae_02);
    }

    public static void heroNext(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18359);
        dae_02.cC(false);
        aaw_1.bUq().h(dae_02);
    }

    public static void next(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18815);
        dae_02.cC(false);
        aaw_1.bUq().h(dae_02);
    }

    public static void previous(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18815);
        dae_02.cC(true);
        aaw_1.bUq().h(dae_02);
    }

    public static void scrollPages(flp_2 flp_22) {
        if (flp_22.gEo() > 0) {
            cet_1.next(flp_22);
        } else {
            cet_1.previous(flp_22);
        }
    }

    public static void first(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18615);
        aaw_1.bUq().h(dae_02);
    }

    public static void last(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19011);
        aaw_1.bUq().h(dae_02);
    }

    public static void changeLadderType(flv_2 flv_22, String string) {
        if (!flv_22.bqr()) {
            return;
        }
        int n = Integer.parseInt(string);
        dae_0 dae_02 = new dae_0();
        dae_02.lK(17241);
        dae_02.sY(n);
        aaw_1.bUq().h(dae_02);
    }

    public static void changeFilterType(flv_2 flv_22, String string) {
        if (!flv_22.bqr()) {
            return;
        }
        int n = Integer.parseInt(string);
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18777);
        dae_02.sY(n);
        aaw_1.bUq().h(dae_02);
    }

    public static void searchPlayer(fiq_1 fiq_12, fdv_1 fdv_12) {
        String string = fdv_12.getText();
        cdc_2.mSM.a(0, () -> cet_1.pt(string));
    }

    private static void pt(String string) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16225);
        dae_02.fa(string);
        aaw_1.bUq().h(dae_02);
    }

    public static void cancelSearchPlayer(fiq_1 fiq_12, fdv_1 fdv_12) {
        fdv_12.setText("");
        dae_0 dae_02 = new dae_0();
        dae_02.lK(17022);
        aaw_1.bUq().h(dae_02);
    }

    public static void toggleLadderRewards(fiq_1 fiq_12, bny_0 bny_02) {
        boolean bl = fse_1.gFu().aU("dungeonLadderOpenedRewards", "dungeonDialog");
        if (cua_2.eRq().eRr().dzP() != bny_02.d() && bl) {
            return;
        }
        fse_1.gFu().b("dungeonLadderOpenedRewards", !bl, "dungeonDialog");
    }

    public static void closeLadderRewards(fiq_1 fiq_12) {
        fse_1.gFu().b("dungeonLadderOpenedRewards", false, "dungeonDialog");
    }

    public static void openLadderRewards(fiq_1 fiq_12) {
        fse_1.gFu().b("dungeonLadderOpenedRewards", true, "dungeonDialog");
    }

    public static void switchToNextRewards(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(16737);
        dae_02.cC(false);
        aaw_1.bUq().h(dae_02);
    }

    public static void switchToAvailableRewards(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(16737);
        dae_02.cC(true);
        aaw_1.bUq().h(dae_02);
    }

    public static void unloadRewardPreviewDialog(flp_2 flp_22) {
        fyw_0.gqw().tl("ladderRewardsDialog");
    }

    public static void openItemDetailWindow(flp_2 flp_22, beg_1 beg_12, fey_2 fey_22) {
        fhc_0 fhc_02 = beg_12.dOg();
        ffV ffV2 = new ffV(beg_12.dOg().d());
        ffV2.l(fhc_02);
        cfe_1.openItemDetailWindow(flp_22, fey_22, ffV2);
    }

    public static void openMap(fiq_1 fiq_12, bny_0 bny_02) {
        MapCommand.cTQ();
        biq_1 biq_12 = big_2.l(bny_02.dAk(), false);
        bif_2.dYO().a(biq_12);
    }

    public static boolean requestSteleInformation(fiq_1 fiq_12, bny_0 bny_02) {
        int n = bny_02.ayQ();
        if (n < 0) {
            return true;
        }
        dae_0 dae_02 = new dae_0(16666);
        dae_02.sY(n);
        aaw_1.bUq().h(dae_02);
        return true;
    }

    public static void openDungeonMonstersInEncyclopedia(fiq_1 fiq_12, bny_0 bny_02) {
        cuj_2.eRB().a(bpr_1.iVl, new bpZ(bny_02.d()));
    }
}

