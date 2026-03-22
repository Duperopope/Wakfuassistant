/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHI
 */
@fyf_0
public class chi_1 {
    public static final String PACKAGE = "wakfu.neo.roadmap";

    public static void openRoadmap(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(czf_2.eZv())) {
            aue_0.cVJ().b(czf_2.eZv());
        } else {
            aue_0.cVJ().a(czf_2.eZv());
        }
    }

    public static void showDungeonPopup(fiq_1 fiq_12, frx_1 frx_12, fes_2 fes_22, String string) {
        int n = Integer.parseInt(string);
        czz_1 czz_12 = czy_1.NJ(n);
        if (czz_12 == null) {
            return;
        }
        eIb eIb2 = eId.quO.PM(czz_12.eZp());
        if (eIb2 != null) {
            bny_0 bny_02 = new bny_0(eIb2.d());
            fse_1.gFu().f("overNeoDungeon", bny_02);
        } else {
            fse_1.gFu().f("overNeoDungeon", (Object)null);
        }
        fyd_0.popup(fiq_12, frx_12, fes_22);
    }

    public static void openDungeonUI(flp_2 flp_22) {
        Object object = fse_1.gFu().vY("overNeoDungeon");
        if (object instanceof bny_0) {
            bny_0 bny_02 = (bny_0)object;
            aue_0.cVJ().b(czf_2.eZv());
            cua_2 cua_22 = cua_2.eRq();
            aue_0.cVJ().a(cua_22);
            cua_22.MQ(bny_02.d());
        }
    }

    public static void onBossEnter(flp_2 flp_22, String string) {
        czf_2.eZv().eZw().He(Integer.parseInt(string));
    }

    public static void onBossExit(flp_2 flp_22) {
        czf_2.eZv().eZw().He(0);
    }
}

