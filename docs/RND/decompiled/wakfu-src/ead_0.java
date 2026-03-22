/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eAd
 */
public final class ead_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pvy = new ArrayList();
    private amu_1 pvz;

    @Deprecated
    public ead_0() {
    }

    public ead_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pvz = (amu_1)arrayList.get(0);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pvy;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJW;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof exc_1)) {
            throw new amf_2("On essaye d'acc\u00e9der \u00e0 l'historique de combat d'un objet qui n'en poss\u00e8de pas");
        }
        int n = (int)this.pvz.d(object, object2, object3, object4);
        exc_1 exc_12 = (exc_1)object;
        exb_1 exb_12 = exc_12.fOw();
        return exb_12.Td(n);
    }

    static {
        pvy.add(new amz_1[]{amz_1.cJy});
    }
}

