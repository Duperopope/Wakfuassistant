/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eEM
extends eAH {
    private int Nf;
    private static final ArrayList<amz_1[]> pCs = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pCs;
    }

    @Deprecated
    public eEM() {
    }

    public eEM(ArrayList<amx_1> arrayList) {
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
        if (object instanceof eyo_0 && object instanceof fhx && ((eyo_0)object).a(eyp_0.pmQ)) {
            return -1;
        }
        if (object4 instanceof PN) {
            pN = (PN)object4;
        } else if (object instanceof PO) {
            pN = ((PO)object).aYx();
        }
        if (pN == null) {
            throw new amf_2("Utilisation du crit\u00e8re IsAchievementComplete hors d'un contexte d'achievement");
        }
        if (pN.iV(this.Nf)) {
            return pN.oe(this.Nf) ? 0 : -1;
        }
        throw new amf_2("Utilisation du crit\u00e8re IsAchievementComplete sur un achievement d'id inexistant id=" + this.Nf);
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHX;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pCs.add(amz_1Array);
    }
}

