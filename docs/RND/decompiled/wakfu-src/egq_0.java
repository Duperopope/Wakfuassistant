/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from eGq
 */
public final class egq_0
extends eAH {
    private static final ArrayList<amz_1[]> pEk = new ArrayList();
    private boolean pvJ;

    @Override
    protected List<amz_1[]> bDC() {
        return pEk;
    }

    public egq_0(ArrayList<amx_1> arrayList) {
        this.pvJ = this.r(arrayList) == 0 && ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(this.pvJ, object, object2, object4, object3);
        if (exP2 == null) {
            return -1;
        }
        ety_0 ety_02 = exP2.dlK();
        if (ety_02 == null) {
            return -1;
        }
        Collection collection = ety_02.dGs();
        for (exP exP3 : collection) {
            if (exP3.doW() == null) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJB;
    }

    static {
        pEk.add(new amz_1[]{amz_1.cJx});
        pEk.add(amz_1.cJI);
    }
}

