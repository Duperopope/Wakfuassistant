/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eAm
 */
public final class eam_0
extends eAH {
    private static final ArrayList<amz_1[]> pvO = new ArrayList();

    public eam_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pvO;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object == null || !(object instanceof eyo_0)) {
            throw new amf_2("on essaie de savoir si la cible est une invoc d'un user invalide " + String.valueOf(object));
        }
        List<eyo_0> list = eAs.c(true, object, object2, object4, object3);
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            eyo_0 eyo_02 = list.get(i);
            if (eyo_02 == null || eyo_02.dOo() != ((eyo_0)object).dOo()) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKA;
    }

    static {
        pvO.add(amz_1.cJI);
    }
}

