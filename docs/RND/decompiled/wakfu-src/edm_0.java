/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eDM
 */
public final class edm_0
extends eAH {
    private static final ArrayList<amz_1[]> pAH = new ArrayList();
    private boolean pya;

    public edm_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pya = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pAH;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(this.pya, object, object2, object4, object3);
        if (eyo_02 instanceof exP) {
            return ((exP)eyo_02).fhh() ? 0 : -1;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLd;
    }

    static {
        pAH.add(eAC.pwr);
    }
}

