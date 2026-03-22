/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eBs
 */
public final class ebs_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pxv = new ArrayList();
    private amu_1 pxw;

    @Override
    protected List<amz_1[]> bDC() {
        return pxv;
    }

    public ebs_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        if (arrayList.size() == 1) {
            this.pxw = (amu_1)arrayList.get(0);
        }
    }

    public int Xt() {
        if (this.pxw != null && this.pxw.bDp() && this.pxw.bDo()) {
            return (int)this.pxw.d(null, null, null, null);
        }
        return -1;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = null;
        if (object instanceof exP) {
            exP2 = (exP)object;
        } else if (object3 instanceof ehe_0) {
            exP2 = ((ehe_0)object3).fog();
        }
        if (exP2 == null) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer la cible du crit\u00e8re");
        }
        if (this.pxw != null) {
            int n = (int)this.pxw.d(object, object2, object3, object4);
            return exP2.ffF().WA(n);
        }
        return exP2.ffF().WA(exP2.ffF().Xt());
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHF;
    }

    static {
        pxv.add(amz_1.cJI);
        pxv.add(new amz_1[]{amz_1.cJy});
    }
}

