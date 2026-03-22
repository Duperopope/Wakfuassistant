/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eGt
extends eAH {
    private static final ArrayList<amz_1[]> pEo = new ArrayList();

    public eGt(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pEo;
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
        if (t.fmP() == null) {
            return -1;
        }
        if (t.Pn(t.fmR())) {
            return 0;
        }
        return -2;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNS;
    }

    static {
        pEo.add(eAC.pwq);
    }
}

