/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class bvw
implements Comparator<bvj> {
    static final bvw jtp = new bvw(true);
    static final bvw jtq = new bvw(false);
    private boolean jtc = true;

    private bvw(boolean bl) {
        this.jtc = bl;
    }

    public int a(bvj bvj2, bvj bvj3) {
        return this.jtc ? bvj2.getName().compareTo(bvj3.getName()) : bvj3.getName().compareTo(bvj2.getName());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bvj)object, (bvj)object2);
    }
}

