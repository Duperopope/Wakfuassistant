/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eFJ
extends eAH {
    private static final ArrayList<amz_1[]> pDt = new ArrayList();
    private boolean pya;

    public eFJ(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        if (arrayList.size() >= 1) {
            this.pya = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        }
    }

    protected ArrayList<amz_1[]> fnC() {
        return pDt;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(this.pya, object, object2, object4, object3);
        return eyo_02 != null && eyo_02.djT() ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMh;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pDt.add(eAC.pwq);
        pDt.add(eAC.pwr);
    }
}

