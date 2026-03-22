/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eCz
 */
public class ecz_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pzi = new ArrayList();
    private boolean pxm;

    @Override
    protected List<amz_1[]> bDC() {
        return pzi;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public ecz_0(ArrayList<amx_1> arrayList) {
        this.pxm = this.r(arrayList) == 0 && ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        Object object5;
        Object object6 = object5 = this.pxm ? object2 : object;
        if (object5 != null) {
            int n = 0;
            if (object5 instanceof exP) {
                foP foP2 = ((exP)object5).doW();
                if (foP2 != null) {
                    n = foP2.gfU();
                }
            } else if (object5 instanceof foP) {
                n = ((foP)object5).gfU();
            }
            return super.fny() * (long)n;
        }
        throw new amf_2("On essaie de r\u00e9cup\u00e9rer l'id de nation d'une cible invalide");
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHt;
    }

    static {
        pzi.add(new amz_1[]{amz_1.cJx});
        pzi.add(amz_1.cJI);
    }
}

