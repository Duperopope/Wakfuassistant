/*
 * Decompiled with CFR 0.152.
 */
public final class fqK {
    public static int a(fqO fqO2, exP exP2) {
        int n = fqO2.r(exx_2.rHH);
        if (n == 0) {
            return 0;
        }
        int n2 = 0;
        if (n >= 0 && exP2.a(exx_2.rHJ)) {
            n2 = exP2.c(exx_2.rHJ);
        } else if (exP2.a(exx_2.rHI)) {
            n2 = exP2.c(exx_2.rHI);
        }
        return fqK.go(n, n2);
    }

    private static int go(int n, int n2) {
        float f2 = (float)(n * n2) / 100.0f;
        int n3 = n;
        n3 = n2 > 0 ? (n3 += GC.B(f2)) : (n3 += GC.C(f2));
        return n3;
    }
}

