/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eDj
extends eak_0 {
    private static final ArrayList<amz_1[]> pAc = new ArrayList();
    private amu_1 pvE;

    @Override
    protected List<amz_1[]> bDC() {
        return pAc;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public eDj(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        if (arrayList.size() == 1) {
            this.pvE = (amu_1)arrayList.get(0);
        }
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        int n;
        Object object5;
        if (this.pvE == null) {
            object5 = eAs.k(object, object2, object4, object3);
            if (object5 == null) {
                throw new amf_2("Impossible de r\u00e9cup\u00e9rer d'utilisateur pour ce crit\u00e8re");
            }
            n = ((exP)object5).dlp();
        } else {
            n = (int)this.pvE.d(object, object2, object3, object4);
        }
        object5 = fpk.sNF.Yn(n);
        if (object5 == null) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer le territoire " + n);
        }
        foP foP2 = ((foM)object5).doW();
        if (foP2 == null) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer le protecteur du territoire " + n);
        }
        return super.fny() * (long)foP2.gfT();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHr;
    }

    static {
        pAc.add(new amz_1[]{amz_1.cJy});
        pAc.add(amz_1.cJI);
    }
}

