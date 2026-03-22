/*
 * Decompiled with CFR 0.152.
 */
import java.lang.runtime.SwitchBootstraps;

/*
 * Renamed from cHo
 */
@fyf_0
public class cho_1 {
    public static final String PACKAGE = "wakfu.toast";

    public static void closeCurrentToast(flp_2 flp_22) {
        if (!flp_22.gEk()) {
            return;
        }
        if (flp_22.gBE() instanceof fad_1) {
            return;
        }
        byj_1.epo().nP(((fhv_1)flp_22.gBE()).getElementMap().gAt());
    }

    public static void enterToast(fiq_1 fiq_12) {
        byj_1.epo().nQ(((fhv_1)fiq_12.gBE()).getElementMap().getId());
    }

    public static void exitToast(fiq_1 fiq_12) {
        byj_1.epo().nR(((fhv_1)fiq_12.gBE()).getElementMap().getId());
    }

    public static void openBoosterXpPopup(fiq_1 fiq_12, frx_1 frx_12, bci_1 bci_12) {
        cdc_2.openBoosterXpPopup(fiq_12, frx_12, bci_12);
    }

    public static void displayRewardPopup(flg_2 flg_22, frx_1 frx_12, frx_1 frx_13) {
        cdc_2.displayRewardPopup(flg_22, frx_12, frx_13);
    }

    public static void openItemDetailWindow(flg_2 flg_22) {
        cdc_2.openItemDetailWindow(flg_22);
    }

    public static boolean followAchievement(fiq_1 fiq_12, bci_1 bci_12, fdd_2 fdd_22) {
        return cdc_2.followAchievement(fdd_22.getSelected(), bci_12);
    }

    public static void showAchievementPopup(fiq_1 fiq_12, frx_1 frx_12, bci_1 bci_12) {
        cdc_2.showAchievementPopup(fiq_12, frx_12, bci_12);
    }

    public static void showAchievementPopup(flg_2 flg_22, frx_1 frx_12) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof bys_2)) {
            return;
        }
        bys_2 bys_22 = (bys_2)object;
        cdc_2.showAchievementPopup(flg_22, frx_12, bys_22.eoY());
    }

    public static void onAchievementToastTitleClick(flp_2 flp_22, bci_1 bci_12) {
        cek_2.onClick(flp_22, bci_12);
    }

    public static void openAchievementDialog(flp_2 flp_22, bci_1 bci_12, String string) {
        cek_2.openAchievementDialog(flp_22, bci_12);
        if (Boolean.TRUE.toString().equalsIgnoreCase(string)) {
            byj_1.epo().nP(((fhv_1)flp_22.gBE()).getElementMap().getId());
        }
    }

    public static void openAchievementDialogOnRightClick(flp_2 flp_22, bci_1 bci_12, String string) {
        if (flp_22.gEm()) {
            cho_1.openAchievementDialog(flp_22, bci_12, string);
        }
    }

    public static void compassObjective(fiq_1 fiq_12, bcc_2 bcc_22, fdd_2 fdd_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (fdd_22.getSelected()) {
            bcm_1.hIK.a(bgt_02.Sn(), bcc_22.d(), bgt_02.aqZ());
        } else if (bcm_1.hIK.Bp(bcc_22.d())) {
            bcm_1.hIK.a(bgt_02.Sn(), -1, bgt_02.aqZ());
        }
    }

    public static void openCosmeticPresetsDialog(fiq_1 fiq_12) {
        aaw_1.bUq().h(new vt_0(() -> aue_0.cVJ().a(ctb_2.eQr())));
    }

    public static void clickLevelUpDataButton(fiq_1 fiq_12, byw_1 byw_12) {
        String string;
        bhJ bhJ2 = (bhJ)fcL.rUh.sw(byw_12.KU());
        if (bhJ2 == null) {
            return;
        }
        bya_1 bya_12 = byw_12.eoZ();
        int n = 0;
        switch (SwitchBootstraps.enumSwitch("enumSwitch", new Object[]{"CHARACTER_SHEET", "BUILDS", "APTITUDES", "SPELLS"}, (bya_1)bya_12, n)) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                if (!aue_0.cVJ().c(csx_1.ePi())) {
                    aue_0.cVJ().a(csx_1.ePi());
                }
                String string2 = "characterSheetDialog";
                break;
            }
            case 1: {
                czt_2.NG(0);
                String string2 = "heroBuildDialog";
                break;
            }
            case 2: {
                czt_2.NG(2);
                String string2 = "heroBuildDialog";
                break;
            }
            case 3: {
                czt_2.NG(1);
                String string2 = "heroBuildDialog";
                break;
            }
            case -1: {
                String string2 = string = null;
            }
        }
        if (string != null) {
            cdu_1.selectHero(null, bhJ2, (fey_2)fyw_0.gqw().th(string));
        }
    }
}

