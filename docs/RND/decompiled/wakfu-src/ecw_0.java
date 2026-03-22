/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eCw
 */
public class ecw_0
extends eak_0 {
    private static final int pzc = -1;
    private static final ArrayList<amz_1[]> pzd = new ArrayList();
    private amu_1 pze;
    private amu_1 pzf;

    @Override
    protected List<amz_1[]> bDC() {
        return pzd;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public ecw_0(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        if (by == 0) {
            this.pze = null;
            this.pzf = (amu_1)arrayList.get(0);
        } else if (by == 1) {
            this.pze = (amu_1)arrayList.get(0);
            this.pzf = (amu_1)arrayList.get(1);
        }
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        int n;
        Object object5;
        if (this.pze == null) {
            object5 = eAs.k(object, object2, object4, object3);
            if (object5 == null) {
                throw new amf_2("Impossible de r\u00e9cup\u00e9rer la cible du crit\u00e8re");
            }
            n = ((exP)object5).ffF().Xt();
        } else {
            n = (int)this.pze.d(object, object2, object3, object4);
        }
        int n2 = (int)this.pzf.d(object, object2, object3, object4);
        object5 = fjt.syH.WG(n).gbD().WO(n2);
        return super.fny() * (long)((fkc_0)object5).aJr();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHs;
    }

    public amu_1 fnI() {
        return this.pze;
    }

    public amu_1 fnJ() {
        return this.pzf;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pzd.add(amz_1Array);
        amz_1Array = new amz_1[2];
        amz_1Array[0] = amz_1Array[1] = amz_1.cJy;
        pzd.add(amz_1Array);
    }
}

