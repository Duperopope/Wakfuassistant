/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eSC
 */
final class esc_0
implements Comparator<qu_0> {
    private final int rkU;
    private final int rkV;

    esc_0(int n, int n2) {
        this.rkU = n;
        this.rkV = n2;
    }

    public int c(qu_0 qu_02, qu_0 qu_03) {
        int n = qu_02.aZw().cH(this.rkU, this.rkV);
        int n2 = qu_03.aZw().cH(this.rkU, this.rkV);
        return Integer.compare(n, n2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.c((qu_0)object, (qu_0)object2);
    }
}

