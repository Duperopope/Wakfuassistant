/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from eGB
 */
public class egb_0
extends eAH {
    private static final ArrayList<amz_1[]> pEB = new ArrayList();
    private boolean pEC = false;

    @Override
    protected List<amz_1[]> bDC() {
        return pEB;
    }

    egb_0() {
    }

    public egb_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        if (arrayList.size() >= 1) {
            this.pEC = ((amz_2)arrayList.get(0)).b(null, null, null, null);
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object2 == null) {
            return 0;
        }
        if (object == null || !(object instanceof exP)) {
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
        if (object2 instanceof acd_1) {
            acd_1 acd_12 = (acd_1)object2;
            rh_0 rh_02 = etu_02.bag();
            if (!rh_02.T(acd_12.getX(), acd_12.getY())) {
                return -1;
            }
            Collection<QQ> collection = etu_02.bai().bdh();
            for (QQ qQ : collection) {
                if (!qQ.aZw().ac(acd_12)) continue;
                if (this.pEC) {
                    return -1;
                }
                if (!qQ.bcS()) continue;
                return -1;
            }
            rj_0 rj_02 = rh_02.X(acd_12.getX(), acd_12.getY());
            if (rj_02 == null) {
                return 0;
            }
            return -1;
        }
        if (object2 instanceof QY) {
            if (this.pEC) {
                return -1;
            }
            QQ qQ = ((QY)object2).bdd();
            if (qQ != null && qQ.bcS()) {
                return -1;
            }
            return 0;
        }
        return -2;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pIS;
    }

    static {
        pEB.add(eAC.pwq);
        pEB.add(eAC.pws);
    }
}

