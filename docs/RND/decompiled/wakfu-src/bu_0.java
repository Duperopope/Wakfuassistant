/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.strategy.HashingStrategy
 */
import gnu.trove.strategy.HashingStrategy;
import java.util.Arrays;

/*
 * Renamed from BU
 */
class bu_0
implements HashingStrategy<short[]> {
    bu_0() {
    }

    public final int d(short[] sArray) {
        int n = 1;
        for (short s : sArray) {
            n = 31 * n + s;
        }
        return n;
    }

    public final boolean a(short[] sArray, short[] sArray2) {
        return Arrays.equals(sArray, sArray2);
    }

    public /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((short[])object, (short[])object2);
    }

    public /* synthetic */ int computeHashCode(Object object) {
        return this.d((short[])object);
    }
}

