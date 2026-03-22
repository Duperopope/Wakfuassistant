/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 */
import com.google.common.collect.Ordering;
import java.util.Comparator;

final class eSh
extends eRX
implements eSg {
    private final Comparator<int[]> rjq;

    public eSh(acd_1 acd_12) {
        eRZ eRZ2 = new eRZ(acd_12);
        eRY eRY2 = new eRY(acd_12);
        adr_1 adr_12 = new adr_1(eRZ2, eRY2);
        this.rjq = Ordering.from(adr_12).reverse();
    }

    public int d(int[] nArray, int[] nArray2) {
        return this.rjq.compare(nArray, nArray2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.d((int[])object, (int[])object2);
    }
}

