/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class aJD
implements Comparator<bgy> {
    aJD() {
    }

    public int a(bgy bgy2, bgy bgy3) {
        int n = bgy3.cmL() - bgy2.cmL();
        return Integer.compare(n, 0);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bgy)object, (bgy)object2);
    }
}

