/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eBJ
 */
public class ebj_0
extends eak_0 {
    private static final List<amz_1[]> pxV = Collections.singletonList(amz_1.cJI);

    @Override
    protected List<amz_1[]> bDC() {
        return pxV;
    }

    public ebj_0(ArrayList<amx_1> arrayList) {
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
        if (!(object instanceof anu_1)) {
            pwx.error((Object)("Le crit\u00e8re d'effet est employ\u00e9 pour autre chose qu'un targetFinder.Target : " + String.valueOf(object) + " - " + String.valueOf(object2) + " - " + String.valueOf(object3) + " - " + String.valueOf(object4)));
            return 0L;
        }
        return ((anu_1)object).Sn();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGp;
    }
}

