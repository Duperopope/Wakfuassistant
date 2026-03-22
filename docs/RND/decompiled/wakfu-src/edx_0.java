/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eDX
 */
public final class edx_0
extends eAH {
    private static final ArrayList<amz_1[]> pBf = new ArrayList();
    private boolean pya = false;

    public edx_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pya = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pBf;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(this.pya, object, object2, object4, object3);
        if (exP2 == null) {
            return -1;
        }
        ers_0 ers_02 = exP2.doc();
        for (QD qD : ers_02) {
            fqU fqU2;
            if (!(qD instanceof erh_0) || (fqU2 = ((erh_0)qD).fGk()) == null || !fqU2.gjH()) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKu;
    }

    static {
        pBf.add(new amz_1[]{amz_1.cJx});
    }
}

