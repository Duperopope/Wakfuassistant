/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntFloatHashMap
 *  gnu.trove.procedure.TIntFloatProcedure
 */
import gnu.trove.map.hash.TIntFloatHashMap;
import gnu.trove.procedure.TIntFloatProcedure;

class aJv {
    final TIntFloatHashMap ebg;

    aJv(int n) {
        this.ebg = new TIntFloatHashMap(n, 0.9f);
    }

    void c(float[] fArray, int n, int n2, int n3, int n4) {
        for (int i = 0; i < n2; ++i) {
            int n5 = i * n;
            for (int j = 0; j < n; ++j) {
                this.b(n3 + j, n4 + i, fArray[j + n5]);
            }
        }
    }

    private void b(int n, int n2, float f2) {
        int n3 = aJv.as(n, n2);
        float f3 = this.ebg.get(n3);
        if (f3 == 0.0f) {
            this.ebg.put(n3, f2);
        } else {
            this.ebg.put(n3, f2 * f3);
        }
    }

    public final void chE() {
        this.ebg.clear();
    }

    void a(int n, int n2, float[] fArray) {
        float f2 = this.ebg.get(aJv.as(n, n2));
        if (f2 != 0.0f) {
            fArray[0] = fArray[0] * f2;
            fArray[1] = fArray[1] * f2;
            fArray[2] = fArray[2] * f2;
        }
    }

    void bjt() {
        this.ebg.forEachEntry((TIntFloatProcedure)new aJw(this));
    }

    private static int as(int n, int n2) {
        return n & 0xFFFF | n2 << 16;
    }
}

