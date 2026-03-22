/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eAe
 */
public class eae_0
extends eAH {
    private static final ArrayList<amz_1[]> pvA = new ArrayList();
    private amu_1 pvz;

    public eae_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pvz = (amu_1)arrayList.get(0);
    }

    public int axA() {
        if (this.pvz.bDp() && this.pvz.bDo()) {
            return (int)this.pvz.d(null, null, null, null);
        }
        return -1;
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pvA;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof exc_1)) {
            throw new amf_2("On essaye d'acc\u00e9der \u00e0 l'historique de combat d'un objet qui n'en poss\u00e8de pas: " + String.valueOf(object));
        }
        exc_1 exc_12 = (exc_1)object;
        int n = this.axA();
        exb_1 exb_12 = exc_12.fOw();
        return exb_12.Tc(n) ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJU;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pvA.add(amz_1Array);
    }
}

