/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eGL
 */
public class egl_0
extends eAH {
    private static final ArrayList<amz_1[]> pEN = new ArrayList();

    public egl_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pEN;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object == null || object2 == null || !(object instanceof exP) || !(object2 instanceof qu_0)) {
            throw new amf_2("On cherche les summons d'un user null");
        }
        if (((exP)object).js(((qu_0)object2).Sn()) != null) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHe;
    }

    static {
        pEN.add(amz_1.cJI);
    }
}

