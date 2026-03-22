/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eHd
 */
public class ehd_0
extends eAH {
    private static final ArrayList<amz_1[]> pFh = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pFh;
    }

    public ehd_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object == null || !(object instanceof exP)) {
            throw new amf_2("on test l'appartenance d'une balise \u00e0 autre chose qu'un perso");
        }
        if (object2 instanceof eSN) {
            if (((eSN)object2).bci() != object) {
                return 0;
            }
            return -1;
        }
        if (object2 instanceof acd_1 && object4 instanceof etu_0) {
            etu_0 etu_02 = (etu_0)object4;
            acd_1 acd_12 = (acd_1)object2;
            for (qu_0 qu_02 : etu_02.a(acd_12)) {
                if (!(qu_02 instanceof eSN)) continue;
                if (((eSN)qu_02).bci() != object) {
                    return 0;
                }
                return -1;
            }
        }
        throw new amf_2("on test l'appartenance d'autre chose qu'une balise");
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFQ;
    }

    static {
        pFh.add(amz_1.cJI);
    }
}

