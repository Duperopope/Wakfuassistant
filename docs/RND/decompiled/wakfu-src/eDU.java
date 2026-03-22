/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eDU
extends eAH {
    private static final ArrayList<amz_1[]> pAX = new ArrayList();
    private amu_1 pAY;

    @Deprecated
    public eDU() {
    }

    public eDU(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pAY = (amu_1)arrayList.get(0);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pAX;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJf;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.k(object, object2, object3, object4);
        if (exP2 == null || exP2.a(eyp_0.pmQ)) {
            return -1;
        }
        int n = (int)this.pAY.d(object, object2, object3, object4);
        return eTq.X(exP2.aZj(), n) ? 0 : -1;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pAX.add(amz_1Array);
    }
}

