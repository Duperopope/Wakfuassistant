/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eBr
 */
public final class ebr_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pxu = new ArrayList();
    private amu_1 pxt;

    @Deprecated
    public ebr_0() {
    }

    public ebr_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pxt = (amu_1)arrayList.get(0);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pxu;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJd;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public int cms() {
        if (this.pxt.bDp() && this.pxt.bDo()) {
            return (int)this.pxt.d(null, null, null, null);
        }
        return -1;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        eki_0 eki_02 = eAs.n(object, object2, object3, object4);
        int n = (int)this.pxt.d(object, object2, object3, object4);
        return eki_02.PG(n);
    }

    static {
        pxu.add(new amz_1[]{amz_1.cJy});
    }
}

