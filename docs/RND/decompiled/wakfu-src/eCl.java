/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eCl
extends eak_0 {
    private static final ArrayList<amz_1[]> pyO = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pyO;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public eCl(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.k(object, object2, object4, object3);
        if (exP2 != null) {
            return exP2.aqZ();
        }
        if (object instanceof fpZ) {
            return ((fpZ)object).aqZ();
        }
        if (object4 instanceof tt_0) {
            return ((tt_0)object4).bhh();
        }
        if (object instanceof foP) {
            return ((foP)object).aqZ();
        }
        if (object instanceof fhx) {
            fhx fhx2 = (fhx)object;
            return fhx2.aqZ();
        }
        throw new amf_2("Impossible d'evaluer le critere GetInstanceId sur user=" + String.valueOf(object));
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGn;
    }

    static {
        pyO.add(amz_1.cJI);
    }
}

