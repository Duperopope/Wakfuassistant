/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from cVh
 */
class cvh_2
implements Comparator<bvj> {
    cvh_2(cvg_2 cvg_22) {
    }

    public int a(bvj bvj2, bvj bvj3) {
        bve bve2 = bvk.dJZ().kI(bvj2.Xm());
        bve bve3 = bvk.dJZ().kI(bvj3.Xm());
        if (bve2 == null) {
            return -1;
        }
        if (bve3 == null) {
            return 1;
        }
        if (bve3.dJS().bfE() > bve2.dJS().bfE()) {
            return 1;
        }
        if (bve3.dJS().bfE() < bve2.dJS().bfE()) {
            return -1;
        }
        return bve2.getName().compareTo(bve3.getName());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bvj)object, (bvj)object2);
    }
}

