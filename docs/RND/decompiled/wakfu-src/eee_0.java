/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eEe
 */
public final class eee_0
extends eAH {
    private static final ArrayList<amz_1[]> pBr = new ArrayList();
    private boolean pvJ = false;

    @Override
    protected List<amz_1[]> bDC() {
        return pBr;
    }

    public eee_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pvJ = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKh;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(this.pvJ, object, object2, object4, object3);
        if (!(exP2 instanceof fhu)) {
            return -1;
        }
        return ((fhu)((Object)exP2)).fXQ().aVo() > 0 ? 0 : -1;
    }

    static {
        pBr.add(new amz_1[]{amz_1.cJx});
    }
}

