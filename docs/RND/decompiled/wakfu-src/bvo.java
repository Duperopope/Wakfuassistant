/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class bvo
implements Comparator<buS> {
    bvo(bvk bvk2) {
    }

    public int a(buS buS2, buS buS3) {
        int n = buS2.tL();
        int n2 = buS3.tL();
        return Integer.compare(n, n2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((buS)object, (buS)object2);
    }
}

