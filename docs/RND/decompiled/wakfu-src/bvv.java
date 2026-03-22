/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class bvv
implements Comparator<bvj> {
    static final bvv jtn = new bvv(true);
    static final bvv jto = new bvv(false);
    private boolean jtc = true;

    private bvv(boolean bl) {
        this.jtc = bl;
    }

    public int a(bvj bvj2, bvj bvj3) {
        return this.jtc ? bvj2.cmL() - bvj3.cmL() : bvj3.cmL() - bvj2.cmL();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bvj)object, (bvj)object2);
    }
}

