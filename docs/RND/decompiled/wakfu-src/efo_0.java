/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eFO
 */
public final class efo_0
extends eAH {
    private static final ArrayList<amz_1[]> pDw = new ArrayList();
    private boolean pya;

    public efo_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        if (arrayList.size() >= 1) {
            this.pya = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        }
    }

    protected ArrayList<amz_1[]> fnC() {
        return pDw;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(this.pya, object, object2, object4, object3);
        return eyo_02 != null && eyo_02.baH() ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLT;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pDw.add(eAC.pwq);
        pDw.add(eAC.pwr);
    }
}

