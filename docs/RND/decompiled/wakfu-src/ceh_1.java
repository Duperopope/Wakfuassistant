/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEH
 */
@fyf_0
public class ceh_1 {
    public static final String PACKAGE = "wakfu.fightResult";

    public static void closeFightResultDialog(fiq_1 fiq_12) {
        dae_0.cV((short)19329);
    }

    public static void switchCompactMode(fiq_1 fiq_12) {
        dae_0.cV((short)17121);
    }

    public static void switchOtherTeamDisplay(fiq_1 fiq_12) {
        dae_0.cV((short)17895);
    }

    public static void enterPlusLootDots(fiq_1 fiq_12, btt_1 btt_12) {
        dae_0 dae_02 = new dae_0(16288);
        dae_02.cC(true);
        dae_02.D(btt_12);
        aaw_1.bUq().h(dae_02);
    }

    public static void exitPlusLootDots(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(16288);
        dae_02.cC(false);
        aaw_1.bUq().h(dae_02);
    }

    public static void enterUiFocus(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(17813);
        dae_02.cC(true);
        aaw_1.bUq().h(dae_02);
    }

    public static void exitUiFocus(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(17813);
        dae_02.cC(false);
        aaw_1.bUq().h(dae_02);
    }

    public static void openItemDetails(flg_2 flg_22) {
        if (flg_22.gBy() == fzq_0.tJB && flg_22.gEm()) {
            cdd_2.sendOpenCloseItemDetailMessage(null, ((btx)flg_22.getItemValue()).duo());
        }
    }
}

