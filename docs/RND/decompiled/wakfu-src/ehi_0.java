/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from eHi
 */
public final class ehi_0
extends eAH {
    private static final ArrayList<amz_1[]> pFm = new ArrayList();

    public ehi_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    protected ArrayList<amz_1[]> fnC() {
        return pFm;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.a("caster", object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        acd_1 acd_12 = eAs.d(true, object, object2, object4, object3);
        if (acd_12 == null) {
            return -1;
        }
        etu_0<?> etu_02 = eAs.m(object, object4);
        if (etu_02 == null) {
            return -1;
        }
        if (!ehi_0.b(eyo_02, acd_12, etu_02)) {
            return -1;
        }
        if (!ehi_0.c(eyo_02, acd_12, etu_02)) {
            return -1;
        }
        return 0;
    }

    private static boolean c(eyo_0 eyo_02, acd_1 acd_12, etu_0<?> etu_02) {
        abi_1[] abi_1Array = abi_1.bVP();
        for (int i = 0; i < abi_1Array.length; ++i) {
            abi_1 abi_12 = abi_1Array[i];
            if (ehh_0.a(acd_12, eyo_02, etu_02, abi_12) < 1) continue;
            return true;
        }
        return false;
    }

    private static boolean b(eyo_0 eyo_02, acd_1 acd_12, etu_0<?> etu_02) {
        Collection collection = etu_02.fn(eyo_02.bcP());
        for (exP exP2 : collection) {
            acd_1 acd_13 = exP2.aZw();
            if (!acd_12.cJ(acd_13.getX(), acd_13.getY())) continue;
            return true;
        }
        return false;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMr;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pFm.add(eAC.pwq);
    }
}

