/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eFI
 */
public class efi_0
extends eAH {
    private static final List<amz_1[]> pDs = Collections.singletonList(amz_1.cJI);

    @Override
    protected List<amz_1[]> bDC() {
        return pDs;
    }

    public efi_0(ArrayList<amx_1> arrayList) {
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
        if ((int)Math.pow(acd_13.getX() - acd_12.getX(), 2.0) == (int)Math.pow(acd_13.getY() - acd_12.getY(), 2.0)) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKZ;
    }
}

