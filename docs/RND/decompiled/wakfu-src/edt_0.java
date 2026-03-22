/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eDT
 */
public final class edt_0
extends eAH {
    private static final ArrayList<amz_1[]> pAU = new ArrayList();
    private final boolean pAV;
    private final long pAW;

    public edt_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pAV = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        this.pAW = ((amu_1)arrayList.get(1)).d(null, null, null, null);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pAU;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(this.pAV, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        QE qE = eyo_02.baz();
        if (qE == null) {
            return -1;
        }
        boolean bl = qE.oL((int)this.pAW);
        if (bl) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKj;
    }

    static {
        pAU.add(new amz_1[]{amz_1.cJx, amz_1.cJy});
    }
}

