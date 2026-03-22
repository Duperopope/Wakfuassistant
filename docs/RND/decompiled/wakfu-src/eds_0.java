/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eDS
 */
public final class eds_0
extends eAH {
    private static final ArrayList<amz_1[]> pAS = new ArrayList();
    private boolean pya = false;
    private amu_1 pAT;

    public eds_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pya = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        this.pAT = (amu_1)arrayList.get(1);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pAS;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(this.pya, object, object2, object4, object3);
        int n = (int)this.pAT.d(object, object2, object3, object4);
        return exP2 != null && exP2.OF(n) ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKi;
    }

    static {
        pAS.add(new amz_1[]{amz_1.cJx, amz_1.cJy});
    }
}

