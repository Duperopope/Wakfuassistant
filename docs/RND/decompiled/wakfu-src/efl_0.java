/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eFl
 */
public class efl_0
extends eAH {
    private final TIntArrayList pCW = new TIntArrayList();
    private static final ArrayList<amz_1[]> pCX = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pCX;
    }

    public TIntArrayList foc() {
        return this.pCW;
    }

    public efl_0(ArrayList<amx_1> arrayList) {
        if (this.r(arrayList) == 0) {
            return;
        }
        for (amx_1 amx_12 : arrayList) {
            int n = (int)((amu_1)amx_12).d(null, null, null, null);
            this.pCW.add(n);
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        Object object5 = object;
        if (!(object5 instanceof eIt)) {
            throw new amf_2("On essaie de r\u00e9cup\u00e9rer la pr\u00e9sence d'un challenge sur une cible invalide");
        }
        eIt eIt2 = (eIt)object5;
        if (this.pCW.isEmpty()) {
            return eIt2.dnD() ? 0 : -1;
        }
        for (int n : this.pCW.toArray()) {
            if (eIt2.CP(n)) continue;
            return -1;
        }
        return 0;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGR;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJA};
        pCX.add(eAC.pwq);
        pCX.add(amz_1Array);
    }
}

