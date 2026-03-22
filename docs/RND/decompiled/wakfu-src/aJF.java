/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class aJF
implements Comparator<bgy> {
    aJF() {
    }

    public int a(bgy bgy2, bgy bgy3) {
        int n = bgy2.ffF().Xt();
        int n2 = bgy3.ffF().Xt();
        int n3 = n2 - n;
        return Integer.compare(n3, 0);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bgy)object, (bgy)object2);
    }
}

