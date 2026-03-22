/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aBq
 */
class abq_2 {
    final int dyH;
    int dvq;
    final ArrayList<Runnable> dyI = new ArrayList();

    abq_2(int n) {
        this.dyH = n;
        this.dvq = 0;
    }

    boolean j(Runnable runnable) {
        return !this.dyI.contains(runnable);
    }

    ArrayList<Runnable> bVa() {
        return this.dyI;
    }

    void k(Runnable runnable) {
        if (!this.dyI.contains(runnable)) {
            this.dyI.add(runnable);
        }
    }
}

