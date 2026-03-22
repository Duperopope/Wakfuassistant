/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eDg
extends eak_0 {
    private static final ArrayList<amz_1[]> pzV = new ArrayList();
    private final boolean pzW;
    private final amu_1 pzX;
    private final amu_1 pzY;
    private final amu_1 pzZ;

    @Override
    protected List<amz_1[]> bDC() {
        return pzV;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public eDg(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pzW = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        this.pzX = (amu_1)arrayList.get(1);
        this.pzY = (amu_1)arrayList.get(2);
        this.pzZ = (amu_1)arrayList.get(3);
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (object4 == null) {
            return 0L;
        }
        boolean bl = object4 instanceof etu_0;
        boolean bl2 = object4 instanceof ent_0;
        if (!bl && !bl2) {
            return 0L;
        }
        etu_0 etu_02 = bl ? (etu_0)object4 : ((ent_0)object4).fBq();
        eyo_0 eyo_02 = eAs.b(false, object, object2, object4, object3);
        if (eyo_02 == null) {
            return 0L;
        }
        acd_1 acd_12 = null;
        if (!this.pzW) {
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
            return 0L;
        }
        long l = 0L;
        long l2 = this.pzX.d(object, object2, object3, object4);
        long l3 = this.pzY.d(object, object2, object3, object4);
        long l4 = this.pzZ.d(object, object2, object3, object4);
        for (QQ qQ : etu_02.bai().bdh()) {
            if (qQ == eyo_02 || qQ == null || this.e(l2, qQ) || qQ.bcP() != eyo_02.bcP()) continue;
            int n = amf_1.c((amg_1)qQ, acd_12);
            if (l4 >= 0L && ((long)n > l4 || (long)n < l3)) continue;
            ++l;
        }
        return this.fny() * l;
    }

    protected boolean e(long l, QQ qQ) {
        return (long)qQ.aeV() != l;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKb;
    }

    static {
        pzV.add(new amz_1[]{amz_1.cJx, amz_1.cJy, amz_1.cJy, amz_1.cJy});
    }
}

