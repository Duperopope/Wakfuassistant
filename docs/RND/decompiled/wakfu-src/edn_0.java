/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eDn
 */
public class edn_0
extends eak_0 {
    private static final List<amz_1[]> pAg = Collections.singletonList(amz_1.cJI);

    @Override
    protected List<amz_1[]> bDC() {
        return pAg;
    }

    public edn_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (object == null) {
            return 0L;
        }
        if (!(object instanceof qu_0)) {
            throw new amf_2("Le crit\u00e8re d'effet est employ\u00e9 pour autre chose qu'un effet");
        }
        return ((qu_0)object).Sn();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGq;
    }
}

