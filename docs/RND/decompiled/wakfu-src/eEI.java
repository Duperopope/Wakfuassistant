/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eEI
extends eAH {
    private static final ArrayList<amz_1[]> pCo = new ArrayList();
    private boolean pvJ = false;

    @Override
    protected List<amz_1[]> bDC() {
        return pCo;
    }

    public eEI(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        if (by == 1) {
            this.pvJ = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(this.pvJ, object, object2, object4, object3);
        return exP2 != null && exP2.ffZ() ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJD;
    }

    static {
        pCo.add(amz_1.cJI);
        pCo.add(new amz_1[]{amz_1.cJx});
    }
}

