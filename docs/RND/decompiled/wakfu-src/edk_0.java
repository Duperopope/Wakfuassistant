/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eDK
 */
public class edk_0
extends eAH {
    private static final ArrayList<amz_1[]> pAF = new ArrayList();

    public edk_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pAF;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object == null) {
            throw new amf_2("On cherche les summons d'un user null");
        }
        if (!(object instanceof ezi_0)) {
            throw new amf_2("On cherche les summons d'un user qui n'a pas de symbiote");
        }
        Object t = ((ezi_0)object).dob();
        if (t == null) {
            throw new amf_2("On cherche les summons d'un user qui n'a pas de symbiote");
        }
        int n = 10;
        for (int n2 = 0; n2 < 10; n2 = (int)((byte)(n2 + 1))) {
            if (!t.Pn(n2)) continue;
            return 0;
        }
        return -2;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pIX;
    }

    static {
        pAF.add(amz_1.cJI);
    }
}

