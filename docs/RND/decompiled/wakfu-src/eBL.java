/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class eBL
extends eak_0 {
    private static final List<amz_1[]> pxX = Collections.singletonList(amz_1.cJI);

    @Override
    protected List<amz_1[]> bDC() {
        return pxX;
    }

    public eBL(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(true, object, object2, object4, object3);
        if (eyo_02 == null) {
            return 0L;
        }
        if (!(eyo_02 instanceof anu_1)) {
            pwx.error((Object)("Le crit\u00e8re d'effet est employ\u00e9 pour autre chose qu'un targetFinder.Target : " + String.valueOf(object) + " - " + String.valueOf(object2) + " - " + String.valueOf(object3) + " - " + String.valueOf(object4)));
            return 0L;
        }
        return eyo_02.Sn();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGq;
    }
}

