/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eFr
 */
public final class efr_0
extends eAH {
    private static final ArrayList<amz_1[]> pDd = new ArrayList();
    private boolean pvJ = false;

    @Override
    protected List<amz_1[]> bDC() {
        return pDd;
    }

    public efr_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pvJ = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(this.pvJ, object, object2, object4, object3);
        return exP2 != null && exP2.fgk() ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJY;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJx};
        pDd.add(amz_1Array);
    }
}

