/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eEl
extends eAH {
    private static final ArrayList<amz_1[]> pBx = new ArrayList();
    private amu_1 pBy;

    @Deprecated
    public eEl() {
    }

    public eEl(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pBy = (amu_1)arrayList.get(0);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pBx;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMm;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.k(object, object2, object3, object4);
        if (exP2 == null || !(exP2 instanceof fjm)) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer la cible du crit\u00e8re");
        }
        byte by = (byte)this.pBy.d(object, object2, object3, object4);
        fpp_0 fpp_02 = fpp_0.hk(by);
        return exP2.ffF().gbb().c(fpp_02) ? -1 : 0;
    }

    public byte fnR() {
        return (byte)this.pBy.d(null, null, null, null);
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pBx.add(amz_1Array);
    }
}

