/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from eEx
 */
public final class eex_0
extends eAH {
    private static final List<amz_1[]> pBQ = new ArrayList<amz_1[]>();
    private final boolean pBR;

    @Override
    protected List<amz_1[]> bDC() {
        return pBQ;
    }

    public eex_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pBR = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(false, object, object2, object4, object3);
        if (exP2 == null) {
            return -1;
        }
        etu_0 etu_02 = eAs.aO(object4);
        if (etu_02 == null) {
            return -1;
        }
        acd_1 acd_12 = null;
        if (this.pBR) {
            if (object2 instanceof exP) {
                acd_12 = ((exP)object2).eap();
            } else if (object2 instanceof acd_1) {
                acd_12 = (acd_1)object2;
            }
            if (acd_12 == null) {
                return 0;
            }
        } else {
            acd_12 = exP2.aZw();
        }
        Collection<QQ> collection = etu_02.bai().bdh();
        for (QQ qQ : collection) {
            if (eex_0.b(exP2, qQ) || !eex_0.a(acd_12, qQ)) continue;
            return 0;
        }
        return -1;
    }

    private static boolean b(exP exP2, QQ qQ) {
        return qQ.aeV() != etm_0.rnE.aHp() || qQ.bci() != exP2;
    }

    private static boolean a(acd_1 acd_12, QQ qQ) {
        if (qQ.bcC() == acd_12.getX() + 1 && qQ.bcD() == acd_12.getY()) {
            return true;
        }
        if (qQ.bcC() == acd_12.getX() - 1 && qQ.bcD() == acd_12.getY()) {
            return true;
        }
        if (qQ.bcC() == acd_12.getX() && qQ.bcD() == acd_12.getY() + 1) {
            return true;
        }
        if (qQ.bcC() == acd_12.getX() && qQ.bcD() == acd_12.getY() - 1) {
            return true;
        }
        if (qQ.bcC() == acd_12.getX() + 1 && qQ.bcD() == acd_12.getY() + 1) {
            return true;
        }
        if (qQ.bcC() == acd_12.getX() + 1 && qQ.bcD() == acd_12.getY() - 1) {
            return true;
        }
        if (qQ.bcC() == acd_12.getX() - 1 && qQ.bcD() == acd_12.getY() + 1) {
            return true;
        }
        return qQ.bcC() == acd_12.getX() - 1 && qQ.bcD() == acd_12.getY() - 1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pIR;
    }

    static {
        pBQ.add(eAC.pwr);
    }
}

