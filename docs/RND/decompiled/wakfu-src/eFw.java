/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class eFw
extends eAH {
    private static final ArrayList<amz_1[]> pDh = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pDh;
    }

    public eFw(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object2 == null) {
            return 0;
        }
        if (object == null || !(object instanceof eyo_0)) {
            return -1;
        }
        eyo_0 eyo_02 = (eyo_0)object;
        if (object2 instanceof eyo_0) {
            if (eyo_02.bcP() == ((eyo_0)object2).bcP()) {
                return -1;
            }
            return 0;
        }
        if (object2 instanceof acd_1 && object4 instanceof etu_0) {
            etu_0 etu_02 = (etu_0)object4;
            acd_1 acd_12 = (acd_1)object2;
            Collection collection = etu_02.fp(eyo_02.bcP());
            for (exP exP2 : collection) {
                if (!this.a(acd_12, exP2)) continue;
                return 0;
            }
            rj_0 rj_02 = etu_02.bag().X(acd_12.getX(), acd_12.getY());
            if (rj_02 instanceof eyo_0 && eyo_02.bcP() != ((eyo_0)((Object)rj_02)).bcP()) {
                return 0;
            }
            return -1;
        }
        return -2;
    }

    private boolean a(acd_1 acd_12, exP exP2) {
        if (exP2.bcO() <= 0) {
            return acd_12.equals(exP2.aZw());
        }
        return amf_1.a(exP2, acd_12.getX(), acd_12.getY()) == 0;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFz;
    }

    static {
        pDh.add(amz_1.cJI);
    }
}

