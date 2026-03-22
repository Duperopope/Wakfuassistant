/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eEH
extends eAH {
    private static final ArrayList<amz_1[]> pCn = new ArrayList();
    private amu_1 pCm;

    public eEH(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pCm = (amu_1)arrayList.get(0);
    }

    public long fnW() {
        return this.pCm.bDp() && this.pCm.bDo() ? this.pCm.d(null, null, null, null) * 1000L : -1L;
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pCn;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof ezc_0)) {
            throw new amf_2("Le user d'un crit\u00e8re HasWorldProperty doit \u00eatre un character.");
        }
        ezc_0 ezc_02 = (ezc_0)object;
        if (this.pCm != null) {
            long l = this.fnW();
            if (System.currentTimeMillis() - ezc_02.fmJ() >= l) {
                return 0;
            }
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLm;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pCn.add(amz_1Array);
    }
}

