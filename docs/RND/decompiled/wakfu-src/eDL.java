/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eDL
extends eAH {
    private static final ArrayList<amz_1[]> pAG = new ArrayList();
    private amu_1 pxw;

    @Deprecated
    public eDL() {
    }

    public eDL(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pxw = (amu_1)arrayList.get(0);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pAG;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMq;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.k(object, object2, object3, object4);
        if (exP2 == null || !(exP2 instanceof fjm)) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer la cible du crit\u00e8re");
        }
        return exP2.ffF().WC((int)this.pxw.d(object, object2, object3, object4)) ? 0 : -1;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pAG.add(amz_1Array);
    }
}

