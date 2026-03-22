/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eAh
 */
public final class eah_0
extends eAH {
    private static final ArrayList<amz_1[]> pvI = new ArrayList();
    private boolean pvJ;

    public eah_0(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        switch (by) {
            case 0: {
                this.pvJ = false;
                break;
            }
            case 1: {
                String string = ((anh_2)arrayList.get(0)).getValue();
                if (!string.equalsIgnoreCase("target")) break;
                this.pvJ = true;
            }
        }
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pvI;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(this.pvJ, object, object2, object4, object3);
        if (exP2 == null) {
            return -1;
        }
        fjn_0 fjn_02 = exP2.ffF();
        int n = fjn_02.WA(fjn_02.Xt());
        fkd_0 fkd_02 = fkf_0.gcc().WJ(n);
        if (fkd_02.b(fkj_0.sAJ)) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJj;
    }

    static {
        pvI.add(amz_1.cJI);
        pvI.add(new amz_1[]{amz_1.cJx});
    }
}

