/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.commonIn.MapCommand;

/*
 * Renamed from cDt
 */
@fyf_0
public class cdt_2 {
    public static final String PACKAGE = "wakfu.battlegroundList";

    public static void outBattleground(fiq_1 fiq_12, fes_2 fes_22) {
        if (fes_22 != null) {
            fes_22.setVisible(false);
        }
    }

    public static void overBattleground(fiq_1 fiq_12, fes_2 fes_22) {
        if (fes_22 != null) {
            fes_22.setVisible(true);
        }
    }

    public static void selectBattleground(flk_2 flk_22) {
        dae_0 dae_02 = new dae_0(19169);
        dae_02.D(flk_22.getValue());
        aaw_1.bUq().h(dae_02);
    }

    public static void previousPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(19701));
    }

    public static void nextPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(19512));
    }

    public static void validMinLevelFilter(fiq_1 fiq_12, fdu_1 fdu_12) {
        bfa bfa2 = (bfa)fse_1.gFu().vY("battlegroundListView");
        short s = -1;
        String string = fdu_12.getText();
        if (string != null && string.length() > 0) {
            s = Bw.r(string);
        }
        if (s != bfa2.dfu()) {
            bfa2.bn(s);
        }
    }

    public static void validMaxLevelFilter(fiq_1 fiq_12, fdu_1 fdu_12) {
        bfa bfa2 = (bfa)fse_1.gFu().vY("battlegroundListView");
        short s = Short.MAX_VALUE;
        String string = fdu_12.getText();
        if (string != null && string.length() > 0) {
            s = Bw.r(string);
        }
        if (s != bfa2.dfv()) {
            bfa2.bo(s);
        }
    }

    public static void checkFinishedFilter(fiq_1 fiq_12) {
        ((bfa)fse_1.gFu().vY("battlegroundListView")).dfx();
    }

    public static void selectBattlegroundType(flk_2 flk_22) {
        if (flk_22.bqr()) {
            dae_0 dae_02 = new dae_0(17437);
            dae_02.D(flk_22.getValue());
            aaw_1.bUq().h(dae_02);
        }
    }

    public static boolean onCompassClick(flp_2 flp_22, bml_2 bml_22) {
        MapCommand.cTQ();
        biq_1 biq_12 = big_2.l((short)bml_22.bhh(), true);
        biq_1 biq_13 = big_2.y(bml_22.clk(), (short)bml_22.bhh());
        bif_2.dYO().a(biq_13 != null ? biq_13 : biq_12);
        return true;
    }
}

