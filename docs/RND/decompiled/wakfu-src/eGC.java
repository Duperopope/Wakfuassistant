/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eGC
extends eAH {
    private static final ArrayList<amz_1[]> pED = new ArrayList();
    private static final int[][] pEE;

    @Override
    protected List<amz_1[]> bDC() {
        return pED;
    }

    public eGC(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    private boolean a(rh_0 rh_02, int n, int n2) {
        if (rh_02.ab(n, n2)) {
            return true;
        }
        rj_0 rj_02 = rh_02.X(n, n2);
        if (rj_02 == null || !rj_02.bcS()) {
            return false;
        }
        if (!(rj_02 instanceof eyo_0)) {
            cKa.error((Object)("Unknown obstacle type : " + String.valueOf(rj_02)));
            return true;
        }
        return !((eyo_0)((Object)rj_02)).a(eyp_0.pmN);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        acd_1 acd_12;
        if (object2 == null) {
            return 0;
        }
        etu_0 etu_02 = eAs.aO(object4);
        if (etu_02 == null) {
            return -1;
        }
        if (object2 instanceof acd_1) {
            acd_12 = (acd_1)object2;
        } else if (object2 instanceof eyo_0) {
            acd_12 = ((eyo_0)object2).aZw();
        } else {
            return -2;
        }
        rh_0 rh_02 = etu_02.bag();
        int n = 0;
        boolean bl = false;
        acd_1 acd_13 = new acd_1();
        acd_1 acd_14 = new acd_1();
        sr_0 sr_02 = sr_0.bgd();
        sr_02.a(6, (byte)0, (short)4);
        sr_02.b(rh_02);
        rh_02.bd(true);
        try {
            for (int i = 0; i <= pEE.length; ++i) {
                boolean bl2;
                int n2;
                int[] nArray = pEE[i % pEE.length];
                int n3 = acd_12.getX() + nArray[0];
                boolean bl3 = rh_02.T(n3, n2 = acd_12.getY() + nArray[1]);
                short s = bl3 ? rh_02.Z(n3, n2) : (short)0;
                acd_14.Q(n3, n2, s);
                boolean bl4 = bl2 = bl3 && !this.a(rh_02, n3, n2);
                if (i != 0) {
                    if (bl2 != bl) {
                        ++n;
                    } else if (bl2 && !sr_02.b(acd_13, acd_14)) {
                        ++n;
                    }
                }
                acd_13.C(acd_14);
                bl = bl2;
            }
        }
        finally {
            rh_02.bd(false);
            sr_02.aZp();
        }
        if (n == 0 || n == 2) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pIQ;
    }

    static {
        pED.add(amz_1.cJI);
        pEE = new int[][]{{-1, -1}, {0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}};
    }
}

