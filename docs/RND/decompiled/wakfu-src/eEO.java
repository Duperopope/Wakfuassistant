/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eEO
extends eAH {
    private int jbV;
    private static final ArrayList<amz_1[]> pCu = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pCu;
    }

    @Deprecated
    public eEO() {
    }

    public eEO(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
        if (s == 0) {
            this.jbV = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
        }
    }

    public int ewy() {
        return this.jbV;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        PN pN = null;
        if (object4 instanceof PN) {
            pN = (PN)object4;
        } else if (object instanceof PO) {
            pN = ((PO)object).aYx();
        }
        if (pN == null) {
            throw new amf_2("Utilisation du crit\u00e8re IsAchievementObjectiveComplete hors d'un contexte d'achievement (contexte=" + String.valueOf(object4) + ")");
        }
        return pN.oc(this.jbV) ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHW;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pCu.add(amz_1Array);
    }
}

