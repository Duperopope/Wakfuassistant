/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHp
 */
@fyf_0
public class chp_1 {
    public static final String PACKAGE = "wakfu.tutorialBook";

    public static void launchTutorial(flg_2 flg_22) {
        chp_1.launchTutorial(flg_22, (bog_2)flg_22.getItemValue());
    }

    public static void launchTutorial(fiq_1 fiq_12, bog_2 bog_22) {
        if (bog_22.dil()) {
            dae_0 dae_02 = new dae_0();
            ((aam_2)dae_02).lK(17279);
            aaw_1.bUq().h(dae_02);
        } else {
            bog_22.egG();
        }
    }

    public static void searchTutorial(fiq_1 fiq_12) {
        fdu_1 fdu_12 = (fdu_1)fiq_12.gBE();
        fse_1.gFu().f("tutorialSearchDirty", fdu_12.getText().length() > 0);
        chp_1.searchTutorial(fiq_12, fdu_12);
    }

    public static void searchTutorial(fiq_1 fiq_12, fdu_1 fdu_12) {
        String string = fdu_12.getText();
        if (string != null) {
            dae_0 dae_02 = new dae_0();
            dae_02.lK(16100);
            dae_02.fa(string);
            aaw_1.bUq().h(dae_02);
        }
    }

    public static void setPreviousTutorialPage(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18293);
        aaw_1.bUq().h(dae_02);
    }

    public static void setNextTutorialPage(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18007);
        aaw_1.bUq().h(dae_02);
    }

    public static void clearSearch(fiq_1 fiq_12, fdu_1 fdu_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16100);
        dae_02.fa(null);
        aaw_1.bUq().h(dae_02);
        fdu_12.guD();
    }
}

