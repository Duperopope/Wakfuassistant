/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eSD
 */
final class esd_0
implements Comparator<qu_0> {
    private final int rkW;
    private final int rkX;

    esd_0(int n, int n2) {
        this.rkW = n;
        this.rkX = n2;
    }

    public int c(qu_0 qu_02, qu_0 qu_03) {
        int n = qu_02.aZw().cH(this.rkW, this.rkX);
        int n2 = qu_03.aZw().cH(this.rkW, this.rkX);
        return Integer.compare(n2, n);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.c((qu_0)object, (qu_0)object2);
    }
}

