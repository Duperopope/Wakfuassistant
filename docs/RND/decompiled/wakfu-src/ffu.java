/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class ffu
implements Comparator<ffs_0> {
    ffu() {
    }

    public int c(ffs_0 ffs_02, ffs_0 ffs_03) {
        return ffs_02.eDo() - ffs_03.eDo();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.c((ffs_0)object, (ffs_0)object2);
    }
}

