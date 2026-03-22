/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class bvn
implements Comparator<bve> {
    bvn(bvk bvk2) {
    }

    public int a(bve bve2, bve bve3) {
        return bve2.dJS().bfE() - bve3.dJS().bfE();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bve)object, (bve)object2);
    }
}

