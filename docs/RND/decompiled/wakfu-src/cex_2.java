/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEX
 */
@fyf_0
public class cex_2 {
    public static final String PACKAGE = "wakfu.havenWorld";

    public static void evolveBuilding(fiq_1 fiq_12) {
        cex_2.evolveBuilding(fiq_12, (bQW)fse_1.gFu().vY("selectedBuilding"));
    }

    public static void evolveBuilding(fiq_1 fiq_12, bQW bQW2) {
        fbk_0 fbk_02 = bQW2.eko().ejU();
        fbu_0 fbu_02 = fbw_0.rSQ.eF(fbk_02.aIi());
        if (fbu_02 != null) {
            fbk_0 fbk_03 = fbw_0.rSQ.eE(fbu_02.fSk());
            fby_0 fby_02 = fbw_0.rSQ.eG(fbk_03.coj());
            bQJ bQJ2 = new bQJ(bQW2.LV(), fbk_02, fby_02, czc_2.eYH().ekh());
            fse_1.gFu().f("buildingEvolution", bQJ2);
            cex_2.loadEvolveBuildingDialog(fiq_12);
        }
    }

    public static void loadEvolveBuildingDialog(fiq_1 fiq_12) {
        ccj_2.g("buildingEvolutionDialog", 256L);
    }

    public static void payEvolution(fiq_1 fiq_12) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bkb_0 bkb_02 = bgt_02.dps();
        if (!(bkb_02 instanceof bkv_1)) {
            return;
        }
        bQJ bQJ2 = (bQJ)fse_1.gFu().vY("buildingEvolution");
        if (bQJ2 == null) {
            return;
        }
        long l = bQJ2.ejX();
        ckz_0 ckz_02 = new ckz_0(bgt_02.Sn());
        faX faX2 = new faX(l);
        ckz_02.a(faX2);
        aue_0.cVJ().etu().d(ckz_02);
        if (aue_0.cVJ().c(csh_2.eOr())) {
            aue_0.cVJ().b(csh_2.eOr());
        } else {
            fyw_0.gqw().tl("buildingEvolutionDialog");
        }
    }
}

