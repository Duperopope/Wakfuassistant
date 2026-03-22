/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class eEJ
extends eAH {
    private static final ArrayList<amz_1[]> pCp = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pCp;
    }

    public eEJ(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        switch (by) {
            case 0: {
                return;
            }
        }
        cKa.error((Object)("Mauvais param\u00e9trage du crit\u00e8re : " + Arrays.toString(arrayList.toArray())));
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.k(object, object2, object4, object3);
        if (exP2 == null) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer la cible du crit\u00e8re");
        }
        if (!(exP2 instanceof eus_1)) {
            throw new amf_2("La cible " + String.valueOf(exP2) + " du crit\u00e8re est invalide");
        }
        evd_2 evd_22 = (evd_2)((eus_1)((Object)exP2)).dpY();
        return evd_22.c(evt_1.owL) ? -1 : 0;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKD;
    }

    static {
        pCp.add(eAC.pwq);
    }
}

