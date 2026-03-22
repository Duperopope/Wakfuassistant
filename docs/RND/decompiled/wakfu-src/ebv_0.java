/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eBv
 */
public class ebv_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pxz = new ArrayList();
    private uw_0 bvv;

    public ebv_0(ArrayList<amx_1> arrayList) {
        if (this.r(arrayList) == 1) {
            this.bvv = new uw_0((int)((amu_1)arrayList.get(5)).d(null, null, null, null), (int)((amu_1)arrayList.get(4)).d(null, null, null, null), (int)((amu_1)arrayList.get(3)).d(null, null, null, null), (int)((amu_1)arrayList.get(0)).d(null, null, null, null), (int)((amu_1)arrayList.get(1)).d(null, null, null, null), (int)((amu_1)arrayList.get(2)).d(null, null, null, null));
        }
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pxz;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (this.bvv != null) {
            return this.bvv.bjB();
        }
        return ue_0.bjV().bjc().bjB();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHw;
    }

    static {
        pxz.add(amz_1.cJI);
        pxz.add(new amz_1[]{amz_1.cJy, amz_1.cJy, amz_1.cJy, amz_1.cJy, amz_1.cJy, amz_1.cJy});
    }
}

