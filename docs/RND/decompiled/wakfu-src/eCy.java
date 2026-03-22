/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eCy
extends eak_0 {
    private static final ArrayList<amz_1[]> pzh = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pzh;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public eCy(ArrayList<amx_1> arrayList) {
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.k(object, object2, object4, object3);
        if (exP2 == null) {
            throw new amf_2("on cherche le rang gouvernemental d'un user null");
        }
        if (!(object instanceof fjm)) {
            throw new amf_2("on cherche le gouvernemental d'un user qui n'est pas citoyen");
        }
        fkL fkL2 = exP2.ffF().emF();
        if (fkL2 == null) {
            return -1L;
        }
        return super.fny() * (long)fkL2.gcC();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJm;
    }

    static {
        pzh.add(amz_1.cJI);
    }
}

