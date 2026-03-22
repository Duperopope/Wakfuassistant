/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eFq
 */
public final class efq_0
extends eAH {
    private static final ArrayList<amz_1[]> pDc = new ArrayList();
    private String pvH;

    public efq_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pvH = ((anh_2)arrayList.get(0)).getValue();
    }

    protected ArrayList<amz_1[]> fnC() {
        return pDc;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.a(this.pvH, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        return eyo_02.a(eyp_0.pmQ) ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMe;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pDc.add(eAC.pwr);
    }
}

