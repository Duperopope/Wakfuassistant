/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eFj
 */
public final class efj_0
extends eAH {
    private static final ArrayList<amz_1[]> pCU = new ArrayList();

    public efj_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    protected ArrayList<amz_1[]> fnC() {
        return pCU;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(false, object, object2, object4, object3);
        abi_1 abi_12 = eyo_02.bcB();
        acd_1 acd_12 = new acd_1(eyo_02.aZw());
        acd_12.e(abi_12);
        eyo_0 eyo_03 = eAs.a("target", null, (Object)acd_12, object4, object3);
        return eyo_03 instanceof exP ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLV;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pCU.add(eAC.pwq);
    }
}

