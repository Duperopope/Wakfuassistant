/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eFm
 */
public final class efm_0
extends eAH {
    private static final ArrayList<amz_1[]> pCY = new ArrayList();
    private String pvH;

    public efm_0(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        this.pvH = "target";
        if (by == 1) {
            this.pvH = ((anh_2)arrayList.get(0)).getValue();
        }
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pCY;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.a(this.pvH, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        return eyo_02.a(eyp_0.pmO) || eyo_02.a(eyp_0.pmQ) ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLQ;
    }

    static {
        pCY.add(eAC.pwq);
        pCY.add(eAC.pwr);
    }
}

