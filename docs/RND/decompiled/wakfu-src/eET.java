/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eET
extends eAH {
    private static final ArrayList<amz_1[]> pCA = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pCA;
    }

    public eET(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.m(object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        if (!(eyo_02 instanceof exP)) {
            return -1;
        }
        exP exP2 = (exP)eyo_02;
        if (!eut_1.osb.oX(exP2.Xi())) {
            return -1;
        }
        evd_2 evd_22 = eut_1.osb.oY(exP2.Xi());
        int[] nArray = evd_22.cWq();
        return evm_2.c(nArray, evm_2.osZ) ? -1 : 0;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMF;
    }

    static {
        pCA.add(eAC.pwq);
    }
}

