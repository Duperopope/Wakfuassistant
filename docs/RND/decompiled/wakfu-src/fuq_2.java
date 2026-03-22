/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUQ
 */
class fuq_2
extends fum_2 {
    fuq_2() {
    }

    @Override
    int a(fuf_1 fuf_12, Object object, float[][] fArray, int[] nArray, int n) {
        int n2 = 0;
        for (n2 = 0; n2 < n && nArray[n2] == 0; ++n2) {
        }
        if (n2 == n) {
            return 0;
        }
        return fuq_2.a(fuf_12, object, fArray, n);
    }
}

