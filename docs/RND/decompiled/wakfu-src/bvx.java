/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class bvx
implements Comparator<bvj> {
    static final bvx jtr = new bvx(true);
    static final bvx jts = new bvx(false);
    private boolean jtc = true;

    private bvx(boolean bl) {
        this.jtc = bl;
    }

    public int a(bvj bvj2, bvj bvj3) {
        if (bvj2.Xm() > bvj3.Xm()) {
            return this.jtc ? 1 : -1;
        }
        if (bvj2.Xm() < bvj3.Xm()) {
            return this.jtc ? -1 : 1;
        }
        return 0;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bvj)object, (bvj)object2);
    }
}

