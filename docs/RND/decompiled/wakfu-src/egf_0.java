/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eGf
 */
public class egf_0
extends eAH {
    private static final ArrayList<amz_1[]> pEa = new ArrayList();
    private final amz_2 pEb;

    @Override
    protected List<amz_1[]> bDC() {
        return pEa;
    }

    public egf_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pEb = arrayList.isEmpty() ? null : (amz_2)arrayList.get(0);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        qu_0 qu_02 = eAs.aP(object);
        qu_0 qu_03 = eAs.aP(object2);
        if (object == null) {
            return -1;
        }
        if (object2 instanceof QP) {
            if ((this.fnY() == null || ((QP)object2).aeV() == this.fnY().aHp()) && qu_03 == qu_02) {
                return 0;
            }
            return -1;
        }
        if (object2 == null) {
            for (QQ qQ : ((etu_0)object4).bai().bdh()) {
                if (this.fnY() != null && qQ.aeV() != this.fnY().aHp() || !this.c(qu_02, qQ)) continue;
                return 0;
            }
            return -1;
        }
        boolean bl = this.pEb != null && this.pEb.b(object, object3, object3, object4);
        etu_0 etu_02 = eAs.aO(object4);
        if (object2 instanceof acd_1 && etu_02 != null) {
            acd_1 acd_12 = (acd_1)object2;
            for (QQ qQ : etu_02.bai().bdh()) {
                if (bl && !qQ.aZw().ac(acd_12) || !this.b(acd_12, qQ) || !this.c(qu_02, qQ)) continue;
                return 0;
            }
            return -1;
        }
        return -2;
    }

    private boolean c(qu_0 qu_02, QQ qQ) {
        return eAs.aP(qQ) == qu_02;
    }

    private boolean b(acd_1 acd_12, QQ qQ) {
        return (this.fnY() == null || qQ.aeV() == this.fnY().aHp()) && qQ.d(acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    etm_0 fnY() {
        return null;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKn;
    }

    static {
        pEa.add(eAC.pwq);
        pEa.add(eAC.pws);
    }
}

