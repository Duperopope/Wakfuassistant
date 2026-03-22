/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

abstract class eEV
extends eAH {
    private static final ArrayList<amz_1[]> pCD = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pCD;
    }

    eEV(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object2 == null) {
            if (this.bDL()) {
                return -1;
            }
            for (QQ qQ : ((ety_0)object4).bai().bdh()) {
                if (!this.x(qQ)) continue;
                return 0;
            }
            return -1;
        }
        if (object2 instanceof QY) {
            return this.x(((QY)object2).bdd()) ? 0 : -1;
        }
        etu_0 etu_02 = null;
        if (object4 instanceof etu_0) {
            etu_02 = (etu_0)object4;
        } else if (object4 instanceof ent_0) {
            etu_02 = ((ent_0)object4).fBq();
        }
        if (object2 instanceof acd_1 && etu_02 != null) {
            for (QQ qQ : etu_02.bai().bdh()) {
                acd_1 acd_12;
                if (!this.a(qQ, acd_12 = (acd_1)object2)) continue;
                return 0;
            }
            return -1;
        }
        return -2;
    }

    protected boolean a(QQ qQ, acd_1 acd_12) {
        if (qQ == null) {
            return false;
        }
        return this.x(qQ) && qQ.d(acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    protected boolean x(QQ qQ) {
        return qQ.aeV() == this.fnY().aHp();
    }

    abstract etm_0 fnY();

    static {
        pCD.add(eAC.pwq);
    }
}

