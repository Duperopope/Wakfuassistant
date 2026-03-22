/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEY
 */
@fyf_0
public class cey_1 {
    public static final String PACKAGE = "wakfu.havenWorldEntrance";

    public static void selectHavenWorld(flg_2 flg_22) {
        bvx_0 bvx_02 = (bvx_0)flg_22.getItemValue();
        dbD dbD2 = new dbD(bvx_02);
        aaw_1.bUq().h(dbD2);
    }

    public static void enterHavenWorld(flp_2 flp_22) {
        aaw_1.bUq().h(new dae_0(19538));
    }

    public static void openHavenWorld(flp_2 flp_22) {
        aaw_1.bUq().h(new dae_0(18069));
    }

    public static void validNameFilter(fiq_1 fiq_12, fdu_1 fdu_12) {
        bvy_0 bvy_02 = (bvy_0)fse_1.gFu().vY("havenWorldViewList");
        bvy_02.mB(fdu_12.getText());
    }

    public static void firstPage(flp_2 flp_22) {
        bvy_0 bvy_02 = (bvy_0)fse_1.gFu().vY("havenWorldViewList");
        if (bvy_02 == null) {
            return;
        }
        bvy_02.dxn();
    }

    public static void previousPage(flp_2 flp_22) {
        bvy_0 bvy_02 = (bvy_0)fse_1.gFu().vY("havenWorldViewList");
        if (bvy_02 == null) {
            return;
        }
        bvy_02.dxo();
    }

    public static void nextPage(flp_2 flp_22) {
        bvy_0 bvy_02 = (bvy_0)fse_1.gFu().vY("havenWorldViewList");
        if (bvy_02 == null) {
            return;
        }
        bvy_02.dxp();
    }

    public static void lastPage(flp_2 flp_22) {
        bvy_0 bvy_02 = (bvy_0)fse_1.gFu().vY("havenWorldViewList");
        if (bvy_02 == null) {
            return;
        }
        bvy_02.dxq();
    }

    public static void checkOpenedFilter(fiq_1 fiq_12) {
        ((bvy_0)fse_1.gFu().vY("havenWorldViewList")).dLg();
    }

    public static void checkGuildFilter(fiq_1 fiq_12) {
        ((bvy_0)fse_1.gFu().vY("havenWorldViewList")).dLi();
    }
}

