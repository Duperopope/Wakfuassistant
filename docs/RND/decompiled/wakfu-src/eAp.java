/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eAp
extends eAH {
    private static final ArrayList<amz_1[]> pvV = new ArrayList();
    private boolean pvW;

    @Override
    protected List<amz_1[]> bDC() {
        return pvV;
    }

    public eAp(ArrayList<amx_1> arrayList) {
        if (this.r(arrayList) == 0) {
            anh_2 anh_22 = (anh_2)arrayList.get(0);
            this.pvW = anh_22.getValue().trim().equalsIgnoreCase("target");
        } else {
            this.pvW = false;
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(this.pvW, object, object2, object4, object3);
        if (exP2 == null) {
            return -1;
        }
        if (!(exP2 instanceof ezi_0)) {
            return -1;
        }
        ezn_0 ezn_02 = exP2.dob();
        if (ezn_02 == null) {
            return -1;
        }
        for (int n = 0; n < 10; n = (int)((byte)(n + 1))) {
            if (ezn_02.Pm(n) == null) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFy;
    }

    static {
        pvV.add(new amz_1[]{amz_1.cJx});
        pvV.add(amz_1.cJI);
    }
}

