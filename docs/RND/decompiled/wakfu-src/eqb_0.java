/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eQB
 */
public final class eqb_0 {
    private static final int rgi = 2;

    private eqb_0() {
    }

    public static boolean em(short s) {
        List<Long> list = ewo_0.oBF.o(ewr_0.oDE);
        return list.contains(s);
    }

    public static int a(int n, eso_0 eso_02, qi_0 qi_02, qi_0 qi_03) {
        switch (eso_02) {
            case rjE: {
                return n;
            }
            case rjF: {
                return qi_02 != null ? VJ.bt((float)(eqb_0.b(qi_02, false) * n) / 100.0f) : 0;
            }
            case rjG: {
                return qi_02 != null ? VJ.bt((float)(eqb_0.a(qi_02, false) * n) / 100.0f) : 0;
            }
            case rjI: {
                return qi_03 != null ? VJ.bt((float)(eqb_0.b(qi_03, false) * n) / 100.0f) : 0;
            }
            case rjJ: {
                return qi_03 != null ? VJ.bt((float)(eqb_0.a(qi_03, false) * n) / 100.0f) : 0;
            }
            case rjH: {
                return qi_02 != null ? VJ.bt((float)((eqb_0.b(qi_02, false) - eqb_0.a(qi_02, false)) * n) / 100.0f) : 0;
            }
            case rjK: {
                return qi_03 != null ? VJ.bt((float)((eqb_0.b(qi_03, false) - eqb_0.a(qi_03, false)) * n) / 100.0f) : 0;
            }
        }
        return 0;
    }

    public static int a(qi_0 qi_02, boolean bl) {
        pr_0 pr_02 = qi_02.b(exx_2.rGi);
        pr_0 pr_03 = qi_02.b(exx_2.rHp);
        int n = 0;
        if (pr_02 != null) {
            n += pr_02.aYB();
        }
        if (pr_03 != null && bl) {
            n += pr_03.aYB();
        }
        return n;
    }

    public static int b(qi_0 qi_02, boolean bl) {
        pr_0 pr_02 = qi_02.b(exx_2.rGi);
        pr_0 pr_03 = qi_02.b(exx_2.rHp);
        int n = 0;
        if (pr_02 != null) {
            n += pr_02.aYD();
        }
        if (pr_03 != null && bl) {
            n += pr_03.aYD();
        }
        return n;
    }

    @Nullable
    public static eNd a(qi_0 qi_02) {
        eNd[] eNdArray = eNd.values();
        eNd eNd2 = null;
        int n = 0;
        for (int i = 0; i < eNdArray.length; ++i) {
            exx_2 exx_22;
            eNd eNd3 = eNdArray[i];
            if (eNd3 == eNd.qPd || eNd3 == eNd.qPe || (exx_22 = eNd3.fAU()) == null || !qi_02.a(exx_22) || eNd2 != null && n >= qi_02.c(eNd3.fAU())) continue;
            eNd2 = eNd3;
            n = qi_02.c(eNd3.fAU());
        }
        return eNd2;
    }

    @Nullable
    public static eNd b(qi_0 qi_02) {
        if (qi_02 == null) {
            return null;
        }
        eNd[] eNdArray = eNd.values();
        eNd eNd2 = null;
        int n = Integer.MAX_VALUE;
        for (int i = 0; i < eNdArray.length; ++i) {
            exx_2 exx_22;
            eNd eNd3 = eNdArray[i];
            if (eNd3 == eNd.qPd || eNd3 == eNd.qPe || !qi_02.a(exx_22 = eNd3.fAV()) || eNd2 != null && n <= qi_02.c(exx_22)) continue;
            eNd2 = eNd3;
            n = qi_02.c(exx_22);
        }
        return eNd2;
    }

    public static List<qu_0> e(ero_0 ero_02, boolean bl) {
        enk_0 enk_02 = (enk_0)ero_02.bba();
        acd_1 acd_12 = ero_02.bbe();
        List<qu_0> list = ero_02.a(enk_02, (anu_1)ero_02.bbc(), (qm_0<enk_0>)ero_02.bbh(), acd_12.getX(), acd_12.getY(), acd_12.bdi());
        ang_2 ang_22 = enk_02.fAx();
        ArrayList<qu_0> arrayList = new ArrayList<qu_0>();
        for (qu_0 qu_02 : list) {
            if (bl && ang_22 != null && !ang_22.b(ero_02.bbc(), qu_02, ero_02, ero_02.bbh())) continue;
            arrayList.add(qu_02);
        }
        return arrayList;
    }

    public static boolean a(qu_0 qu_02, qu_0 qu_03, enk_0 enk_02) {
        int n = amf_1.c((amg_1)qu_02, qu_03);
        return eqb_0.a(enk_02, eNi.qWL) || !eqb_0.u(enk_02) && n > 2;
    }

    public static boolean b(qu_0 qu_02, qu_0 qu_03, enk_0 enk_02) {
        int n = amf_1.c((amg_1)qu_02, qu_03);
        return eqb_0.a(enk_02, eNi.qWK) || !eqb_0.u(enk_02) && n <= 2;
    }

    private static boolean u(enk_0 enk_02) {
        return eqb_0.a(enk_02, eNi.qWL) || eqb_0.a(enk_02, eNi.qWK);
    }

    public static boolean a(enk_0 enk_02, eNi eNi2) {
        return enk_02 != null && enk_02.a(eNi2);
    }

    public static int a(exx_2 exx_22, qu_0 qu_02) {
        exf_2 exf_22;
        int n = 0;
        if (qu_02.a(exx_22) && (n += (exf_22 = (exf_2)qu_02.b(exx_22)).aYC()) > exf_22.aYY()) {
            n = exf_22.aYY();
        }
        return n;
    }
}

