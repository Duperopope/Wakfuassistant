/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eFW
 */
public class efw_0
extends eAH {
    private static final ArrayList<amz_1[]> pDH = new ArrayList();
    private boolean pvJ;

    @Override
    protected List<amz_1[]> bDC() {
        return pDH;
    }

    public efw_0(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        if (by == 1) {
            this.pvJ = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(this.pvJ, object, object2, object4, object3);
        return eyo_02 != null && eyo_02.baI() ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJC;
    }

    static {
        pDH.add(eAC.pwq);
        pDH.add(eAC.pwr);
    }
}

