/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUP
 */
class fup_2
extends fum_2 {
    fup_2() {
    }

    @Override
    int a(fuf_1 fuf_12, Object object, float[][] fArray, int[] nArray, int n) {
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            if (nArray[i] == 0) continue;
            fArray[n2++] = fArray[i];
        }
        if (n2 != 0) {
            return fup_2.a(fuf_12, object, fArray, n2, 1);
        }
        return 0;
    }
}

