/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eFp
extends eAH
implements ehm_0 {
    private boolean pvJ = false;
    private exx_2 pxh;
    private static final ArrayList<amz_1[]> pDb = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pDb;
    }

    public eFp(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
        if (s == 0) {
            this.pxh = ebi_0.rS(((anh_2)arrayList.get(0)).getValue());
        }
        if (s == 1) {
            this.pxh = ebi_0.rS(((anh_2)arrayList.get(0)).getValue());
            this.pvJ = ((anh_2)arrayList.get(1)).getValue().equalsIgnoreCase("target");
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        int n;
        eyo_0 eyo_02 = eAs.b(this.pvJ, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        if (!eyo_02.a(this.pxh)) {
            return -1;
        }
        int n2 = eyo_02.c(this.pxh);
        if (n2 == (n = eyo_02.d(this.pxh))) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKC;
    }

    @Override
    public boolean fnF() {
        return this.pvJ;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJx};
        pDb.add(amz_1Array);
        amz_1Array = new amz_1[]{amz_1.cJx, amz_1.cJx};
        pDb.add(amz_1Array);
    }
}

