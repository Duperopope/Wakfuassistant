/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eGo
 */
public final class ego_0
extends eAH {
    private static final ArrayList<amz_1[]> pEh = new ArrayList();
    private String pvH;

    public ego_0(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        this.pvH = "target";
        if (by == 1) {
            this.pvH = ((anh_2)arrayList.get(0)).getValue();
        }
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pEh;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.a(this.pvH, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        return eyo_02.a(eyp_0.pmO) ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKV;
    }

    static {
        pEh.add(eAC.pwq);
        pEh.add(eAC.pwr);
    }
}

