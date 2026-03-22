/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class bvu
implements Comparator<bvj> {
    static final bvu jtl = new bvu(true);
    static final bvu jtm = new bvu(false);
    private boolean jtc = true;

    private bvu(boolean bl) {
        this.jtc = bl;
    }

    public int a(bvj bvj2, bvj bvj3) {
        if (bvj2.Xk() > bvj3.Xk()) {
            return this.jtc ? 1 : -1;
        }
        if (bvj2.Xk() < bvj3.Xk()) {
            return this.jtc ? -1 : 1;
        }
        return 0;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bvj)object, (bvj)object2);
    }
}

