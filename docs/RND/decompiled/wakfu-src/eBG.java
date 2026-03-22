/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eBG
extends eak_0 {
    private static final ArrayList<amz_1[]> pxI = new ArrayList();
    boolean pvJ;
    private final amu_1 pxJ;
    private final amu_1 pxK;
    private final amu_1 pxL;
    private final boolean pxM;

    @Override
    protected List<amz_1[]> bDC() {
        return pxI;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public eBG(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pvJ = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        this.pxJ = (amu_1)arrayList.get(1);
        this.pxK = (amu_1)arrayList.get(2);
        this.pxL = (amu_1)arrayList.get(3);
        this.pxM = arrayList.size() >= 5 ? ((ang_2)arrayList.get(4)).b(null, null, null, null) : false;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (object4 == null) {
            throw new amf_2("Pas de contexte...");
        }
        boolean bl = object4 instanceof etu_0;
        boolean bl2 = object4 instanceof ent_0;
        if (!bl && !bl2) {
            throw new amf_2("On essaie de compter les fighters en dehors d'un combat: " + String.valueOf(object4));
        }
        etu_0 etu_02 = bl ? (etu_0)object4 : ((ent_0)object4).fBq();
        eyo_0 eyo_02 = eAs.b(false, object, object2, object4, object3);
        acd_1 acd_12 = null;
        if (!this.pvJ) {
            if (eyo_02 != null) {
                acd_12 = eyo_02.aZw();
            }
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
        long l2 = this.pxJ.d(object, object2, object3, object4);
        long l3 = this.pxK.d(object, object2, object3, object4);
        long l4 = this.pxL.d(object, object2, object3, object4);
        for (QQ qQ : etu_02.bai().bdh()) {
            if (qQ == eyo_02 || qQ == null || this.e(l2, qQ) || this.pxM && qQ.bci() != eyo_02) continue;
            int n = amf_1.c((amg_1)qQ, acd_12);
            if (l4 >= 0L && ((long)n > l4 || (long)n < l3)) continue;
            ++l;
        }
        return super.fny() * l;
    }

    protected boolean e(long l, QQ qQ) {
        return (long)qQ.aeV() != l;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKa;
    }

    static {
        pxI.add(new amz_1[]{amz_1.cJx, amz_1.cJy, amz_1.cJy, amz_1.cJy});
        pxI.add(new amz_1[]{amz_1.cJx, amz_1.cJy, amz_1.cJy, amz_1.cJy, amz_1.cJz});
    }
}

