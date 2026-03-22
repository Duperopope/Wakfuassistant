/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class bvr
implements Comparator<bve> {
    bvr(bvk bvk2) {
    }

    public int a(bve bve2, bve bve3) {
        return Long.compare(bve3.dJR(), bve2.dJR());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bve)object, (bve)object2);
    }
}

