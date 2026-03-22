/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public class eRZ
implements Comparator<int[]> {
    private final acd_1 rji;

    protected eRZ(acd_1 acd_12) {
        this.rji = acd_12;
    }

    public int d(int[] nArray, int[] nArray2) {
        int n = this.rji.t(nArray);
        int n2 = this.rji.t(nArray2);
        return GC.c(n, (long)n2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.d((int[])object, (int[])object2);
    }
}

