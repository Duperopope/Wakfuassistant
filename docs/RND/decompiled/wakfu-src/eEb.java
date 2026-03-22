/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class eEb
extends eAH {
    private static final List<amz_1[]> pBn = Collections.singletonList(amz_1.cJI);

    @Override
    protected List<amz_1[]> bDC() {
        return pBn;
    }

    public eEb(ArrayList<amx_1> arrayList) {
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(false, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        etu_0 etu_02 = eAs.aO(object4);
        if (etu_02 == null) {
            return -1;
        }
        eyo_0 eyo_03 = eAs.b(true, object, object2, object4, object3);
        acd_1[] acd_1Array = eAs.aN(object2);
        if (acd_1Array == null) {
            return -1;
        }
        for (acd_1 acd_12 : acd_1Array) {
            if (!(eyo_03 != null ? eUo.a(eyo_02, etu_02.bag(), acd_12.getX(), acd_12.getY(), acd_12.bdi(), eyo_03) : eUo.a(eyo_02, etu_02, acd_12.getX(), acd_12.getY(), acd_12.bdi()))) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJP;
    }
}

