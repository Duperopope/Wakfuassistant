/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from eFY
 */
public class efy_0
extends eAH {
    private static final ArrayList<amz_1[]> pDJ = new ArrayList();
    private final boolean pDK;
    private final amu_1 pDL;
    private final amz_2 pDM;

    @Override
    protected List<amz_1[]> bDC() {
        return pDJ;
    }

    public efy_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pDK = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        this.pDL = (amu_1)arrayList.get(1);
        this.pDM = arrayList.size() >= 3 ? (amz_2)arrayList.get(2) : null;
    }

    public efy_0(String string, int n, boolean bl) {
        this.pDK = string.equalsIgnoreCase("target");
        this.pDL = new amb_2(n);
        this.pDM = new amz_2(bl);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(this.pDK, object, object2, object4, object3);
        if (exP2 == null) {
            return -1;
        }
        int n = (int)this.pDL.d(object, object2, object3, object4);
        etm_0 etm_02 = etm_0.Sr(n);
        if (etm_02 == null) {
            cKa.error((Object)("Error while checking IsOnEffectAreaType : area type " + n + " doesn't exist"));
            return -1;
        }
        etu_0 etu_02 = null;
        if (object4 instanceof etu_0) {
            etu_02 = (etu_0)object4;
        } else if (object4 instanceof ent_0) {
            etu_02 = ((ent_0)object4).fBq();
        }
        if (etu_02 == null) {
            return -1;
        }
        boolean bl = this.pDM != null && this.pDM.b(object, object3, object3, object4);
        qu_0 qu_02 = bl ? eAs.aP(exP2) : null;
        Collection<QQ> collection = etu_02.bai().bdh();
        for (QQ qQ : collection) {
            if (qQ.aeV() != n || qu_02 != null && eAs.aP(qQ) != qu_02 || !qQ.d(exP2.aZw())) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJH;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJx, amz_1.cJy};
        pDJ.add(amz_1Array);
        amz_1Array = new amz_1[]{amz_1.cJx, amz_1.cJy, amz_1.cJz};
        pDJ.add(amz_1Array);
    }
}

