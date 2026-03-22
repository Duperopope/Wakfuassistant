/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 */
import gnu.trove.set.hash.TByteHashSet;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eED
 */
public class eed_0
extends eAH {
    private static final ArrayList<amz_1[]> pBV = new ArrayList();
    private final boolean pBW;
    private final amu_1 pBX;
    private final amu_1 pBY;

    @Override
    protected List<amz_1[]> bDC() {
        return pBV;
    }

    public eed_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pBW = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        this.pBX = (amu_1)arrayList.get(1);
        this.pBY = (amu_1)arrayList.get(2);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object4 == null) {
            return 0;
        }
        boolean bl = object4 instanceof etu_0;
        boolean bl2 = object4 instanceof ent_0;
        if (!bl && !bl2) {
            return 0;
        }
        etu_0 etu_02 = bl ? (etu_0)object4 : ((ent_0)object4).fBq();
        eyo_0 eyo_02 = eAs.b(false, object, object2, object4, object3);
        if (eyo_02 == null) {
            return 0;
        }
        acd_1 acd_12 = null;
        if (!this.pBW) {
            acd_12 = eyo_02.aZw();
        } else if (object2 instanceof acd_1) {
            acd_12 = (acd_1)object2;
        } else {
            eyo_0 eyo_03 = eAs.b(true, object, object2, object4, object3);
            if (eyo_03 != null) {
                acd_12 = eyo_03.aZw();
            }
        }
        if (acd_12 == null) {
            return 0;
        }
        long l = 0L;
        long l2 = etm_0.rnG.aHp();
        long l3 = this.pBX.d(object, object2, object3, object4);
        long l4 = this.pBY.d(object, object2, object3, object4);
        for (QQ qQ : etu_02.bai().bdh()) {
            if (qQ == eyo_02 || qQ == null || this.e(l2, qQ) || qQ.bcP() != eyo_02.bcP()) continue;
            acd_1 acd_13 = qQ.aZw();
            TByteHashSet tByteHashSet = etu_02.bag().W(acd_13.getX(), acd_13.getY());
            if (tByteHashSet != null && !tByteHashSet.isEmpty()) continue;
            int n = amf_1.c((amg_1)qQ, acd_12);
            if (l4 >= 0L && ((long)n > l4 || (long)n < l3)) continue;
            ++l;
        }
        return l > 0L ? 0 : -1;
    }

    protected boolean e(long l, QQ qQ) {
        return (long)qQ.aeV() != l;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMu;
    }

    static {
        pBV.add(new amz_1[]{amz_1.cJx, amz_1.cJy, amz_1.cJy});
    }
}

