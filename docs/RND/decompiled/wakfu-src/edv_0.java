/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eDv
 */
public final class edv_0
extends eAH {
    private static final ArrayList<amz_1[]> pAp = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pAp;
    }

    public edv_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (!(object3 instanceof QD)) {
            throw new amf_2("Le crit\u00e8re d'effet est employ\u00e9 pour autre chose qu'un effet");
        }
        qu_0 qu_02 = ((QD)object3).bbc();
        if (eAs.aS(object3) != qu_02) {
            return -1;
        }
        return 0;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKE;
    }

    static {
        pAp.add(amz_1.cJI);
    }
}

