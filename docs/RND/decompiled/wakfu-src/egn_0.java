/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eGn
 */
public final class egn_0
extends eAH {
    private static final ArrayList<amz_1[]> pEg = new ArrayList();

    public egn_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pEg;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object == null || !(object instanceof exP)) {
            throw new amf_2("On essaie d'avoir une info sur une cible invalide " + String.valueOf(object));
        }
        exP exP2 = eAs.k(object, object2, object4, object3);
        exP exP3 = null;
        if (object2 instanceof exP) {
            exP3 = exP2;
        }
        if (exP3 == null) {
            return -1;
        }
        if (exP3.ffF().gaY()) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJh;
    }

    static {
        pEg.add(amz_1.cJI);
    }
}

