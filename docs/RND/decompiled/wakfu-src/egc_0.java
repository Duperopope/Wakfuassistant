/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eGc
 */
public final class egc_0
extends eGb {
    private static final ArrayList<amz_1[]> pDW = new ArrayList();
    private final amu_1 pDX;

    @Override
    protected List<amz_1[]> bDC() {
        return pDW;
    }

    public egc_0(ArrayList<amx_1> arrayList) {
        super(((anh_2)arrayList.get(0)).getValue(), (amu_1)arrayList.get(1), (amz_2)arrayList.get(2));
        this.r(arrayList);
        this.pDX = (amu_1)arrayList.get(3);
    }

    @Override
    protected boolean a(QQ qQ, Object object, Object object2, Object object3, Object object4) {
        if (qQ == null) {
            return false;
        }
        if (!(qQ instanceof eyo_0)) {
            return false;
        }
        long l = this.pDX.d(object, object2, object3, object4);
        return ((eyo_0)((Object)qQ)).kW(l);
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJJ;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJx, amz_1.cJy, amz_1.cJz, amz_1.cJy};
        pDW.add(amz_1Array);
    }
}

