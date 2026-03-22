/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEF
 */
@fyf_0
public class cef_1 {
    public static final String PACKAGE = "wakfu.fightAction";
    public static final int mVd = 5000;

    public static void endPlacement(fiq_1 fiq_12) {
        dae_0.cV((short)17287);
    }

    public static void fighterEndsTurn(fiq_1 fiq_12) {
        if (fse_1.gFu().dp("isInFightPlacement")) {
            dae_0.cV((short)17287);
        } else {
            dae_0.cV((short)19662);
        }
    }

    public static void giveUpFight(fiq_1 fiq_12) {
        dae_0.cV((short)18536);
    }

    public static void callHelp(fiq_1 fiq_12) {
        fey_2 fey_22 = cty_1.ePV().getWindow();
        if (fey_22 != null) {
            cef_1.callHelp(fiq_12, (fdd_2)fey_22.getElementMap().uH("callHelpBtn"));
        }
    }

    public static void callHelp(fiq_1 fiq_12, fdd_2 fdd_22) {
        dae_0.cV((short)19770);
    }

    public static void reportCell(fiq_1 fiq_12, fad_1 fad_12) {
        dae_0.cV((short)17988);
        fad_12.setEnabled(false);
        abg_2.bUP().a(() -> fad_12.setEnabled(true), 5000L, 1);
    }

    public static void addFightMarker(fiq_1 fiq_12, fad_1 fad_12) {
        dae_0.cV((short)19661);
    }

    public static void toggleResistancesOverhead(fiq_1 fiq_12, fdd_2 fdd_22) {
        dae_0 dae_02 = new dae_0();
        dae_02.cC(fdd_22.getSelected());
        dae_02.lK(18208);
        aaw_1.bUq().h(dae_02);
    }

    public static void tacticalViewNextMode(fiq_1 fiq_12) {
        dae_0.cV((short)18906);
    }

    public static void hideFighters(flp_2 flp_22) {
        dae_0.cV((short)19763);
    }

    public static void hideOccluders(flp_2 flp_22) {
        dae_0.cV((short)16428);
    }

    public static void openSpellsPage(fiq_1 fiq_12) {
        czt_2.NF(1);
    }
}

