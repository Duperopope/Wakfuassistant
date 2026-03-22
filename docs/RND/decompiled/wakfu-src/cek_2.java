/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cEK
 */
@fyf_0
public class cek_2 {
    public static final String PACKAGE = "wakfu.followedAchievements";
    private static final String mVf = "plainBackground";
    static Runnable mVg;

    public static void fillList(fcv_1 fcv_12, int n, boolean bl) {
        bcx_2 bcx_22 = (bcx_2)fcv_12.getItemValue();
        if (bcx_22 == null) {
            return;
        }
        int n2 = bcx_22.d();
        if (n2 == n && !bl) {
            return;
        }
        fhs_2 fhs_22 = fcv_12.getInnerElementMap();
        cek_2.a((fes_2)fhs_22.uH("environmentQuestContainer"), bl);
        fdf_1 fdf_12 = (fdf_1)fhs_22.uH("goalsList");
        ArrayList<fcv_1> arrayList = fdf_12.getRenderables();
        int n3 = arrayList.size();
        for (int i = 0; i < n3; ++i) {
            fcv_1 fcv_13 = arrayList.get(i);
            fhs_2 fhs_23 = fcv_13.getInnerElementMap();
            cek_2.a((fes_2)fhs_23.uH("goalDesc"), bl);
            cek_2.a((fes_2)fhs_23.uH("goalValue"), bl);
        }
        cek_2.a((fes_2)fhs_22.uH("timeText"), bl);
        cek_2.a((fes_2)fhs_22.uH("timeValue"), bl);
        cek_2.a((fes_2)fhs_22.uH("rankingText"), bl);
        cek_2.a((fes_2)fhs_22.uH("rankingValue"), bl);
    }

    private static void a(fes_2 fes_22, boolean bl) {
        if (fes_22 == null || fes_22.getAppearance() == null) {
            return;
        }
        axb_2 axb_22 = fes_22.getAppearance().getModulationColor();
        axb_2 axb_23 = bl ? awx_2.dnC : awx_2.dnF;
        axb_2 axb_24 = axb_22 != null ? new awx_2(axb_22.aTn()) : awx_2.dnF;
        axb_2 axb_25 = bl ? awx_2.dnF : awx_2.dnC;
        fsa_2 fsa_22 = new fsa_2(axb_24, axb_25, fes_22.getAppearance(), 0, 150, 1, false, abn.cdr);
        fes_22.getAppearance().x(fsa_2.class);
        fes_22.getAppearance().a(fsa_22);
    }

    public static void fadeAll(boolean bl, int n) {
        if (bl) {
            mVg = new cel_1(bl, n);
            abg_2.bUP().a(mVg, 150L, 1);
        } else {
            if (mVg != null) {
                abg_2.bUP().h(mVg);
                mVg = null;
            }
            cek_2.doFadeAll(bl, n);
        }
    }

    public static void doFadeAll(boolean bl, int n) {
        String string = fyw_0.gqw().to("followedAchievementsDialog") ? "followedAchievementsDialog" : "verticalFollowedAchievementsDialog";
        ArrayList arrayList = new ArrayList();
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        cek_2.fillList((fcv_1)fhs_22.uH("environmentRenderable"), n, bl);
        cek_2.fillList((fcv_1)fhs_22.uH("almanaxRenderable"), n, bl);
        fdf_1 fdf_12 = (fdf_1)fhs_22.uH("achievementsList");
        ArrayList<fcv_1> arrayList2 = fdf_12.getRenderables();
        int n2 = arrayList2.size();
        for (int i = 0; i < n2; ++i) {
            cek_2.fillList(arrayList2.get(i), n, bl);
        }
    }

    public static void popup(fiq_1 fiq_12, frx_1 frx_12, bcx_2 bcx_22, fes_2 fes_22) {
        fse_1.gFu().f("displayedAchievement", bcx_22);
        fyd_0.popup(fiq_12, frx_12, fes_22);
    }

    public static void openAchievementDialog(fiq_1 fiq_12, bci_1 bci_12) {
        if (bci_12 == null) {
            return;
        }
        boolean bl = bcm_1.hIK.w(aue_0.cVJ().cVK().Sn(), bci_12.d());
        csc_1.eNJ().a(bl, bci_12);
    }

    public static void onClick(flp_2 flp_22, bcx_2 bcx_22) {
        if (flp_22.gEm() && flp_22.gDT()) {
            csc_1.G(bcx_22.d(), false);
            return;
        }
        if (flp_22.gEm()) {
            cek_2.selectAchievement(flp_22, bcx_22);
            return;
        }
        if (bcx_22 instanceof bci_1) {
            cek_2.openAchievementDialog(flp_22, (bci_1)bcx_22);
        } else {
            cek_2.openQuestDescriptionDialog(flp_22, bcx_22);
        }
    }

    public static void onMouseEnter(flp_2 flp_22, bcx_2 bcx_22) {
        cek_2.fadeAll(false, bcx_22.d());
    }

    public static void onMouseExit(flp_2 flp_22, bcx_2 bcx_22) {
        cek_2.fadeAll(true, bcx_22.d());
    }

    public static void openQuestDescriptionDialog(fiq_1 fiq_12, bcx_2 bcx_22) {
        if (bcx_22 == null) {
            return;
        }
        csc_1.eNJ().a(bcx_22);
    }

    public static boolean followAchievement(flv_2 flv_22, bci_1 bci_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18839);
        dae_02.sY(bci_12.d());
        dae_02.cC(flv_22.bqr());
        aaw_1.bUq().h(dae_02);
        return true;
    }

    public static boolean unfollowAchievement(fiq_1 fiq_12, bcx_2 bcx_22) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18839);
        dae_02.sY(bcx_22.d());
        dae_02.cC(false);
        aaw_1.bUq().h(dae_02);
        return true;
    }

    public static void showAchievementPopup(flr_1 flr_12, frx_1 frx_12, bcx_2 bcx_22) {
        if (!(bcx_22 instanceof bci_1)) {
            return;
        }
        fse_1.gFu().f("describedAchievement", bcx_22);
        fes_2 fes_22 = (fes_2)flr_12.gBE();
        fyd_0.popup(frx_12, fes_22);
    }

    public static void selectAchievement(flp_2 flp_22, bcx_2 bcx_22) {
        if (!(bcx_22 instanceof bci_1)) {
            return;
        }
        bci_1 bci_12 = (bci_1)bcx_22;
        dah_0 dah_02 = new dah_0(bci_12);
        if (flp_22.gEm()) {
            dah_02.fa("verticalFollowedAchievementsDialog");
        }
        aaw_1.bUq().h(dah_02);
    }

    public static void hideFloatingButtonContainer(fiq_1 fiq_12, fes_2 fes_22) {
        fes_22.setVisible(false);
    }

    public static void showFloatingButtonContainer(fiq_1 fiq_12, fes_2 fes_22) {
        fes_22.setVisible(true);
    }

    public static void resizeWindow(fiq_1 fiq_12, fey_2 fey_22) {
        fey_22.setPack(false);
        fro_1 fro_12 = cek_2.g(fey_22);
        fro_12.setAdaptToContentSize(false);
        cek_2.h(fey_22).setColor(awx_2.dnH);
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.lkY, Math.max(fey_22.getHeight() - 28, 55));
        bcm_1.hIK.dcv();
    }

    public static void endResizeWindow(fiq_1 fiq_12, fey_2 fey_22) {
        fey_22.setPack(true);
        fro_1 fro_12 = cek_2.g(fey_22);
        fro_12.setAdaptToContentSize(true);
        cek_2.h(fey_22).setColor(awx_2.dnC);
    }

    private static fro_1 g(fey_2 fey_22) {
        fbw_1 fbw_12 = (fbw_1)fey_22.getChildren().stream().filter(fhv_12 -> fhv_12.getClass() == fbw_1.class).toList().getFirst();
        return (fro_1)fbw_12.getLayoutManager();
    }

    private static fkk_1 h(fey_2 fey_22) {
        return (fkk_1)fey_22.getAppearance().getChildWithId(mVf);
    }
}

