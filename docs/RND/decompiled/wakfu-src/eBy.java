/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eBy
extends eak_0 {
    private static final ArrayList<amz_1[]> pxC = new ArrayList();
    private uw_0 bvv;

    public eBy(ArrayList<amx_1> arrayList) {
        this.bvv = new uw_0((int)((amu_1)arrayList.get(5)).d(null, null, null, null), (int)((amu_1)arrayList.get(4)).d(null, null, null, null), (int)((amu_1)arrayList.get(3)).d(null, null, null, null), (int)((amu_1)arrayList.get(0)).d(null, null, null, null), (int)((amu_1)arrayList.get(1)).d(null, null, null, null), (int)((amu_1)arrayList.get(2)).d(null, null, null, null));
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pxC;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (this.bvv == null) {
            throw new IllegalStateException("No valid date defined on the criterion GetDayIntervalSince");
        }
        ux_0 ux_02 = ue_0.bjV().bjc();
        uz_0 uz_02 = this.bvv.l(ux_02);
        return uz_02.bjR();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHx;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy, amz_1.cJy, amz_1.cJy, amz_1.cJy, amz_1.cJy, amz_1.cJy};
        pxC.add(amz_1Array);
    }
}

