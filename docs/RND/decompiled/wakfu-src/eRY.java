/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public class eRY
implements Comparator<int[]> {
    private final acd_1 rjh;

    protected eRY(acd_1 acd_12) {
        this.rjh = acd_12;
    }

    public int d(int[] nArray, int[] nArray2) {
        double d2 = eRX.a(this.rjh, nArray);
        double d3 = eRX.a(this.rjh, nArray2);
        return Double.compare(d2, d3);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.d((int[])object, (int[])object2);
    }
}

