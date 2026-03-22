/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eEW
 */
public class eew_0
extends eAH {
    private static final ArrayList<amz_1[]> pCE = new ArrayList();
    private final long pCF;

    @Override
    protected List<amz_1[]> bDC() {
        return pCE;
    }

    public eew_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pCF = ((amu_1)arrayList.get(0)).d(null, null, null, null);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object2 == null) {
            for (QQ qQ : ((ety_0)object4).bai().bdh()) {
                if ((long)qQ.aeV() != this.pCF) continue;
                return 0;
            }
            return -1;
        }
        if (object2 instanceof QY) {
            QQ qQ = ((QY)object2).bdd();
            if (qQ == null) {
                return -1;
            }
            return (long)qQ.aeV() == this.pCF ? 0 : -1;
        }
        etu_0 etu_02 = null;
        if (object4 instanceof etu_0) {
            etu_02 = (etu_0)object4;
        } else if (object4 instanceof ent_0) {
            etu_02 = ((ent_0)object4).fBq();
        }
        if (object2 instanceof acd_1 && etu_02 != null) {
            acd_1 acd_12 = (acd_1)object2;
            for (QQ qQ : etu_02.bai().bdh()) {
                if ((long)qQ.aeV() != this.pCF || !qQ.d(acd_12.getX(), acd_12.getY(), acd_12.bdi())) continue;
                return 0;
            }
            return -1;
        }
        return -2;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNi;
    }

    static {
        pCE.add(eAC.pwt);
    }
}

