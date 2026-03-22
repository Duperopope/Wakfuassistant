/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.strategy.HashingStrategy
 */
import gnu.trove.strategy.HashingStrategy;

/*
 * Renamed from BT
 */
class bt_0
implements HashingStrategy<float[]> {
    bt_0() {
    }

    public int f(float[] fArray) {
        int n = 1;
        for (float f2 : fArray) {
            n = 31 * n + (int)(f2 * 100000.0f);
        }
        return n;
    }

    public boolean a(float[] fArray, float[] fArray2) {
        for (int i = 0; i < fArray.length; ++i) {
            if (!(Math.abs(fArray[i] - fArray2[i]) >= 1.0E-5f)) continue;
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((float[])object, (float[])object2);
    }

    public /* synthetic */ int computeHashCode(Object object) {
        return this.f((float[])object);
    }
}

