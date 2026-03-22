/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eBq
 */
public final class ebq_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pxs = new ArrayList();
    private amu_1 pxt;

    @Override
    protected List<amz_1[]> bDC() {
        return pxs;
    }

    @Deprecated
    public ebq_0() {
    }

    public ebq_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        if (arrayList.size() == 1) {
            this.pxt = (amu_1)arrayList.get(0);
        }
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        int n = (int)this.pxt.d(object, object2, object3, object4);
        eKW eKW2 = eKQ.qEb.QV(n);
        if (eKW2 == null) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer la nation d'ID " + n);
        }
        return super.fny() * (long)eKW2.fzd();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJb;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pxs.add(amz_1Array);
    }
}

