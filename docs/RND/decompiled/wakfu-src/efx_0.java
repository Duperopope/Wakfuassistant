/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eFX
 */
public final class efx_0
extends eAH {
    private static final ArrayList<amz_1[]> pDI = new ArrayList();
    private boolean pya = false;

    public efx_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pya = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pDI;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(this.pya, object, object2, object4, object3);
        acd_1 acd_12 = null;
        if (eyo_02 != null) {
            acd_12 = eyo_02.aZw();
        } else if (this.pya && object2 instanceof acd_1) {
            acd_12 = (acd_1)object2;
        }
        if (acd_12 == null) {
            return -1;
        }
        etu_0 etu_02 = eAs.aO(object4);
        if (etu_02.bag().R(acd_12.getX(), acd_12.getY())) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKo;
    }

    static {
        pDI.add(new amz_1[]{amz_1.cJx});
    }
}

