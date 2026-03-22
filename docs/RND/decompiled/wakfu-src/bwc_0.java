/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bwc
 */
class bwc_0
implements Comparator<bhJ> {
    bwc_0() {
    }

    public int a(bhJ bhJ2, bhJ bhJ3) {
        bvk_0 bvk_02 = cxs_1.eXb().eXc();
        if (bvk_02 == null) {
            return 0;
        }
        bvl_0 bvl_02 = bvk_02.kR(bhJ2.Sn());
        bvl_0 bvl_03 = bvk_02.kR(bhJ3.Sn());
        if (bvl_02 == null || bvl_03 == null) {
            return 0;
        }
        return bvl_03.dKY() - bvl_02.dKY();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bhJ)object, (bhJ)object2);
    }
}

