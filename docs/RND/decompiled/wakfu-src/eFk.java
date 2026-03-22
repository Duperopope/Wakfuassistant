/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eFk
extends eAH {
    private static final ArrayList<amz_1[]> pCV = new ArrayList();

    public eFk(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pCV;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(true, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        acd_1 acd_12 = new acd_1(eyo_02.aZw());
        abi_1 abi_12 = eyo_02.bcB();
        acd_12.M(abi_12.dzz, abi_12.dzA, 0);
        egb_0 egb_02 = new egb_0();
        return ((ang_2)egb_02).a(object, acd_12, object3, object4);
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLu;
    }

    static {
        pCV.add(eAC.pwq);
    }
}

