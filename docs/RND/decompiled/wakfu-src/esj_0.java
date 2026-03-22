/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eSj
 */
final class esj_0
extends eRX
implements eSg {
    private final Comparator<int[]> rjr;

    esj_0(acd_1 acd_12) {
        eRZ eRZ2 = new eRZ(acd_12);
        eRY eRY2 = new eRY(acd_12);
        this.rjr = new adr_1<int[]>(eRZ2, eRY2);
    }

    public int d(int[] nArray, int[] nArray2) {
        return this.rjr.compare(nArray, nArray2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.d((int[])object, (int[])object2);
    }
}

