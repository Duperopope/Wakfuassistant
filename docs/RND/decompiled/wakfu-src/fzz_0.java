/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fzz
 */
public final class fzz_0
extends Enum<fzz_0> {
    public static final /* enum */ fzz_0 tGn = new fzz_0();
    public static final /* enum */ fzz_0 tGo = new fzz_0();
    public static final /* enum */ fzz_0 tGp = new fzz_0();
    private static final /* synthetic */ fzz_0[] tGq;

    public static fzz_0[] values() {
        return (fzz_0[])tGq.clone();
    }

    public static fzz_0 valueOf(String string) {
        return Enum.valueOf(fzz_0.class, string);
    }

    public boolean I(int n, int n2, int n3, int n4) {
        switch (this.ordinal()) {
            case 0: {
                return n >= 0 && n2 >= 0 && n < n3 && n2 < n4;
            }
            case 1: {
                float f2 = (float)n4 / 2.0f;
                float f3 = f2 / ((float)n3 / 2.0f) * (float)n;
                return (float)n2 >= -f3 + f2 && (float)n2 >= f3 - f2 && (float)n2 < f3 + f2 && (float)n2 < -f3 + 3.0f * f2;
            }
            case 2: {
                int n5 = Math.min(n3, n4) / 2;
                return (n -= n3 / 2) * n + (n2 -= n4 / 2) * n2 <= n5 * n5;
            }
        }
        return true;
    }

    public int J(int n, int n2, int n3, int n4) {
        switch (this.ordinal()) {
            case 0: {
                if (n < 0) {
                    return 0;
                }
                if (n > n3) {
                    return n3;
                }
                return n;
            }
            case 2: {
                int n5;
                int n6 = (int)((float)Math.min(n3 / 2, n4 / 2) * 0.8f);
                int n7 = n5 = n < n3 / 2 ? -1 : 1;
                if (n * n + n2 * n2 < n6 * n6) {
                    return n;
                }
                return n5 * (int)Math.sqrt(n6 * n6 * (1 / (n2 * n2 / (n * n) + 1)));
            }
            case 1: {
                float f2;
                float f3;
                float f4 = (float)n3 / 2.0f;
                float f5 = (float)n4 / 2.0f;
                float f6 = ((float)n2 - f5) / ((float)n - f4);
                float f7 = (float)n2 - f6 * (float)n;
                if ((float)n < f4) {
                    if ((float)n2 < f5) {
                        f3 = -f5 / f4;
                        f2 = f5;
                    } else {
                        f3 = f5 / f4;
                        f2 = f5;
                    }
                } else if ((float)n2 < f5) {
                    f3 = f5 / f4;
                    f2 = -f5;
                } else {
                    f3 = -f5 / f4;
                    f2 = 3.0f * f5;
                }
                return (int)((f2 - f7) / (f6 - f3));
            }
        }
        return n;
    }

    public int K(int n, int n2, int n3, int n4) {
        switch (this.ordinal()) {
            case 0: {
                if (n2 < 0) {
                    return 0;
                }
                if (n2 > n4) {
                    return n4;
                }
                return n2;
            }
            case 2: {
                int n5;
                int n6 = (int)((float)Math.min(n3 / 2, n4 / 2) * 0.8f);
                int n7 = n5 = n2 < n4 / 2 ? -1 : 1;
                if (n * n + n2 * n2 < n6 * n6) {
                    return n2;
                }
                return n5 * (int)Math.sqrt(n6 * n6 * (1 / (n * n / (n2 * n2) + 1)));
            }
            case 1: {
                float f2;
                float f3;
                float f4 = (float)n3 / 2.0f;
                float f5 = (float)n4 / 2.0f;
                float f6 = ((float)n2 - f5) / ((float)n - f4);
                float f7 = (float)n2 - f6 * (float)n;
                if ((float)n < f4) {
                    if ((float)n2 < f5) {
                        f3 = -f5 / f4;
                        f2 = f5;
                    } else {
                        f3 = f5 / f4;
                        f2 = f5;
                    }
                } else if ((float)n2 < f5) {
                    f3 = f5 / f4;
                    f2 = -f5;
                } else {
                    f3 = -f5 / f4;
                    f2 = 3.0f * f5;
                }
                float f8 = (f2 - f7) / (f6 - f3);
                return (int)(f6 * f8 + f7);
            }
        }
        return n2;
    }

    public static fzz_0 tu(String string) {
        fzz_0[] fzz_0Array;
        for (fzz_0 fzz_02 : fzz_0Array = fzz_0.values()) {
            if (!fzz_02.name().equals(string.toUpperCase())) continue;
            return fzz_02;
        }
        return fzz_0Array[0];
    }

    private static /* synthetic */ fzz_0[] grA() {
        return new fzz_0[]{tGn, tGo, tGp};
    }

    static {
        tGq = fzz_0.grA();
    }
}

