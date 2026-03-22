/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cSe
 */
class cse_2
implements Runnable {
    final /* synthetic */ int nEW;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cse_2(int n) {
        this.nEW = n;
    }

    @Override
    public void run() {
        Object object;
        boolean bl = !fkj_2.gCW().vS("followedAchievementsDialog") || fkj_2.gCW().vT("followedAchievementsDialog");
        String string = bl ? "verticalFollowedAchievementsDialog" : "followedAchievementsDialog";
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        if (fhs_22 == null) {
            return;
        }
        fdf_1 fdf_12 = (fdf_1)fhs_22.uH("achievementsList");
        ArrayList<Object> arrayList = fdf_12.getItems();
        int n = -1;
        int n2 = arrayList.size();
        for (int i = 0; i < n2; ++i) {
            object = (bcx_2)arrayList.get(i);
            if (object == null || ((bcx_2)object).d() != this.nEW) continue;
            n = i;
            break;
        }
        if (n == -1) {
            return;
        }
        fcv_1 fcv_12 = fdf_12.getRenderables().get(n);
        if (fcv_12 == null) {
            return;
        }
        fes_2 fes_22 = (fes_2)fcv_12.getInnerElementMap().uH("environmentQuestContainer");
        object = new fka_1();
        ((fka_1)object).aVI();
        ((fka_1)object).setFile("6001051.xps");
        ((fka_1)object).setAlignment(faa_2.tLO);
        fes_22.getAppearance().d((fhv_1)object);
    }
}

