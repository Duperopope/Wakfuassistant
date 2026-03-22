/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eHh
 */
public class ehh_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pFl = new ArrayList();

    public ehh_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    protected ArrayList<amz_1[]> fnC() {
        return pFl;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        eyo_0 eyo_02 = eAs.a("caster", object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1L;
        }
        acd_1 acd_12 = eAs.d(true, object, object2, object4, object3);
        if (acd_12 == null) {
            return -1L;
        }
        etu_0<?> etu_02 = eAs.m(object, object4);
        if (etu_02 == null) {
            return -1L;
        }
        if (!ehh_0.b(eyo_02, acd_12, etu_02)) {
            return -1L;
        }
        return ehh_0.a(eyo_02, acd_12, etu_02);
    }

    private static int a(eyo_0 eyo_02, acd_1 acd_12, etu_0<?> etu_02) {
        abi_1[] abi_1Array = abi_1.bVP();
        int n = 0;
        for (int i = 0; i < abi_1Array.length; ++i) {
            abi_1 abi_12 = abi_1Array[i];
            n += ehh_0.a(acd_12, eyo_02, etu_02, abi_12);
        }
        return n;
    }

    public static int a(acd_1 acd_12, eyo_0 eyo_02, etu_0<?> etu_02, abi_1 abi_12) {
        acd_1 acd_13 = new acd_1(acd_12);
        acd_13.e(abi_12);
        byte by = eyo_02.bcP();
        HashSet hashSet = new HashSet();
        while (etu_02.ax(acd_13) != null) {
            Object t = etu_02.ax(acd_13);
            if (((exP)t).bcP() == by) {
                if (!hashSet.isEmpty()) {
                    return hashSet.size();
                }
                hashSet.clear();
            } else {
                hashSet.add(t);
            }
            acd_13.e(abi_12);
        }
        return 0;
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
        return ehq_0.pMs;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pFl.add(eAC.pwq);
    }
}

