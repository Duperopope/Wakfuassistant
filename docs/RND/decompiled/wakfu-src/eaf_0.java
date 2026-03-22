/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eAf
 */
public class eaf_0
extends eAH {
    private static final List<amz_1[]> pvB = Collections.singletonList(amz_1.cJI);

    public eaf_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pvB;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof exc_1)) {
            throw new amf_2("On essaye d'acc\u00e9der \u00e0 l'historique de combat d'un objet qui n'en poss\u00e8de pas");
        }
        exc_1 exc_12 = (exc_1)object;
        exb_1 exb_12 = exc_12.fOw();
        return exb_12.fOu() ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJV;
    }
}

