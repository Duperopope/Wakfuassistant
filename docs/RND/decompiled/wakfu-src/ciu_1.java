/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cIu
 */
public class ciu_1
extends ciy_1<fsf_0> {
    private static final Logger ndO = Logger.getLogger(ciu_1.class);
    private final civ_1[] ndP;

    public ciu_1(fsf_0 fsf_02, civ_1 ... civ_1Array) {
        super(fsf_02);
        this.ndP = civ_1Array;
    }

    @Override
    public ciz_1 eLe() {
        return ciz_1.ndW;
    }

    @Override
    public void b(fst fst2) {
        for (civ_1 civ_12 : this.ndP) {
            civ_12.b(fst2);
        }
    }

    @Override
    public void c(cie_1 cie_12) {
        for (civ_1 civ_12 : this.ndP) {
            if (ciu_1.Me(((fsG)civ_12.eLi()).fRN()) && ciu_1.Me(civ_12.eLf())) continue;
            civ_12.c(cie_12);
        }
        acc_1 acc_12 = this.eLj();
        ciu_1.c(cie_12, acc_12.bWx(), acc_12.bWy());
        cie_12.deS();
    }

    private static boolean Me(int n) {
        return fsu.aad(n).bWx() == 1;
    }

    private static void c(cie_1 cie_12, int n, int n2) {
        fst fst2 = cie_12.getWorkingHavenWorld();
        short[][] sArray = fst2.erq();
        for (int i = n2 - 1; i <= n2 + 2; ++i) {
            for (int j = n - 1; j <= n + 2; ++j) {
                short s = fst2.d(sArray, j, i);
                if (s == 0) continue;
                new civ_1(new fsG(null, j, i), s).c(cie_12);
            }
        }
    }

    @Override
    public void e(cie_1 cie_12) {
        for (civ_1 civ_12 : this.ndP) {
            civ_12.g(cie_12);
        }
        cie_12.deS();
        this.c(cie_12);
    }

    @Override
    public void d(cie_1 cie_12) {
    }
}

