/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eEP
extends eAH {
    private int Nf;
    private static final ArrayList<amz_1[]> pCv = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pCv;
    }

    @Deprecated
    public eEP() {
    }

    public eEP(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
        if (s == 0) {
            this.Nf = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
        }
    }

    public int apw() {
        return this.Nf;
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
            throw new amf_2("Utilisation du crit\u00e8re IsAchievementRepeatable hors d'un contexte d'achievement");
        }
        if (pN.iV(this.Nf)) {
            return pN.of(this.Nf) ? 0 : -1;
        }
        throw new amf_2("Utilisation du crit\u00e8re IsAchievementRepeatable sur un achievement d'id inexistant id=" + this.Nf);
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLj;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pCv.add(amz_1Array);
    }
}

