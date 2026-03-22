/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bjK
 */
public class bjk_2 {
    private static final Logger ipD = Logger.getLogger(bjk_2.class);

    public static void a(bjf_2 bjf_22, bgy bgy2) {
        String string;
        if (bjf_22 == null) {
            return;
        }
        if (!bjf_22.drO()) {
            return;
        }
        try {
            string = auc_0.cVq().bS("ANMEquipmentPath");
        }
        catch (fu_0 fu_02) {
            ipD.error((Object)"", (Throwable)fu_02);
            return;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        bjf_22.o(new bjl_2(string, bdj_22));
    }

    public static void b(bjf_2 bjf_22, bgy bgy2) {
        if (bjf_22 == null) {
            return;
        }
        bjh_2[] bjh_2Array = bjf_22.drP();
        if (bjh_2Array == null) {
            return;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        block5: for (bjh_2 bjh_22 : bjh_2Array) {
            switch (bjh_22.ipy) {
                case 1: {
                    bdj_22.dV(bjh_22.ipz);
                    bdj_22.dT(bjh_22.ipz);
                    continue block5;
                }
                case 2: {
                    bdj_22.dX(bjh_22.ipz);
                    continue block5;
                }
                case 3: {
                    bdj_22.dT(bjh_22.ipz);
                }
            }
        }
    }

    public static void c(bjf_2 bjf_22, bgy bgy2) {
        if (bjf_22 == null) {
            return;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        bjf_22.p(new bjm_2(bdj_22));
    }

    public static void a(adj_0 adj_02, bji_2 bji_22) {
        float[] fArray = bji_22.ipB.bQj();
        fArray[0] = fArray[0] * 1.25f;
        fArray[1] = fArray[1] * 1.25f;
        fArray[2] = fArray[2] * 1.25f;
        adj_02.a(bji_22.ipA, fArray);
    }
}

