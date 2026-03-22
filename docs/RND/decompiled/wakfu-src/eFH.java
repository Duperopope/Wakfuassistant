/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class eFH
extends eAH {
    private static final List<amz_1[]> pDr = Collections.singletonList(amz_1.cJI);

    @Override
    protected List<amz_1[]> bDC() {
        return pDr;
    }

    public eFH(ArrayList<amx_1> arrayList) {
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        etu_0 etu_02 = eAs.aO(object4);
        if (etu_02 == null) {
            return -1;
        }
        acd_1 acd_12 = eAs.d(false, object, object2, object4, object3);
        if (acd_12 == null) {
            return -1;
        }
        acd_1 acd_13 = eAs.d(true, object, object2, object4, object3);
        if (acd_13 == null) {
            return -1;
        }
        if (acd_12.getX() == acd_13.getX() || acd_12.getY() == acd_13.getY()) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKY;
    }
}

