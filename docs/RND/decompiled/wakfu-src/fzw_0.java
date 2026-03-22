/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fzW
 */
public final class fzw_0
extends Enum<fzw_0> {
    public static final /* enum */ fzw_0 tKY = new fzw_0();
    public static final /* enum */ fzw_0 tKZ = new fzw_0();
    public static final /* enum */ fzw_0 tLa = new fzw_0();
    public static final /* enum */ fzw_0 tLb = new fzw_0();
    public static final /* enum */ fzw_0 tLc = new fzw_0();
    public static final /* enum */ fzw_0 tLd = new fzw_0();
    public static final /* enum */ fzw_0 tLe = new fzw_0();
    public static final /* enum */ fzw_0 tLf = new fzw_0();
    public static final /* enum */ fzw_0 tLg = new fzw_0();
    public static final /* enum */ fzw_0 tLh = new fzw_0();
    public static final /* enum */ fzw_0 tLi = new fzw_0();
    public static final /* enum */ fzw_0 tLj = new fzw_0();
    public static final /* enum */ fzw_0 tLk = new fzw_0();
    public static final /* enum */ fzw_0 tLl = new fzw_0();
    public static final /* enum */ fzw_0 tLm = new fzw_0();
    public static final /* enum */ fzw_0 tLn = new fzw_0();
    public static final /* enum */ fzw_0 tLo = new fzw_0();
    private static final /* synthetic */ fzw_0[] tLp;

    public static fzw_0[] values() {
        return (fzw_0[])tLp.clone();
    }

    public static fzw_0 valueOf(String string) {
        return Enum.valueOf(fzw_0.class, string);
    }

    public int uS(int n) {
        switch (this.ordinal()) {
            case 0: 
            case 5: 
            case 7: 
            case 10: 
            case 12: {
                return 0;
            }
            case 1: 
            case 13: {
                return (int)Math.max(0.0, (double)n * 0.25);
            }
            case 2: 
            case 8: 
            case 14: {
                return (int)Math.max(0.0, (double)n * 0.5);
            }
            case 3: 
            case 15: {
                return (int)Math.max(0.0, (double)n * 0.75);
            }
            case 4: 
            case 6: 
            case 9: 
            case 11: 
            case 16: {
                return Math.max(0, n);
            }
        }
        return 0;
    }

    public int uT(int n) {
        switch (this.ordinal()) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                return Math.max(0, n);
            }
            case 5: 
            case 6: {
                return (int)Math.max(0.0, (double)n * 0.75);
            }
            case 7: 
            case 8: 
            case 9: {
                return (int)Math.max(0.0, (double)n * 0.5);
            }
            case 10: 
            case 11: {
                return (int)Math.max(0.0, (double)n * 0.25);
            }
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: {
                return 0;
            }
        }
        return 0;
    }

    public int cf(int n, int n2) {
        switch (this.ordinal()) {
            case 0: 
            case 5: 
            case 7: 
            case 10: 
            case 12: {
                return 0;
            }
            case 1: 
            case 13: {
                return (int)Math.round((double)(n2 - n) * 0.25);
            }
            case 2: 
            case 8: 
            case 14: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case 3: 
            case 15: {
                return (int)Math.round((double)(n2 - n) * 0.75);
            }
            case 4: 
            case 6: 
            case 9: 
            case 11: 
            case 16: {
                return Math.max(0, n2 - n);
            }
        }
        return 0;
    }

    public int cg(int n, int n2) {
        switch (this.ordinal()) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                return n2 - n;
            }
            case 5: 
            case 6: {
                return (int)Math.round((double)(n2 - n) * 0.75);
            }
            case 7: 
            case 8: 
            case 9: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case 10: 
            case 11: {
                return (int)Math.round((double)(n2 - n) * 0.25);
            }
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: {
                return 0;
            }
        }
        return 0;
    }

    public boolean grT() {
        return this == tLd || this == tKY || this == tKZ || this == tLa || this == tLb || this == tLc || this == tLe;
    }

    public boolean grU() {
        return this == tLi || this == tLk || this == tLl || this == tLm || this == tLn || this == tLo || this == tLj;
    }

    public boolean grV() {
        return this == tLd || this == tKY || this == tKZ || this == tLf || this == tLl || this == tLk || this == tLi;
    }

    public boolean grW() {
        return this == tLe || this == tLc || this == tLb || this == tLh || this == tLn || this == tLo || this == tLj;
    }

    public static fzw_0 tE(String string) {
        fzw_0[] fzw_0Array = fzw_0.values();
        String string2 = string.toUpperCase();
        for (fzw_0 fzw_02 : fzw_0Array) {
            if (!fzw_02.name().equals(string2)) continue;
            return fzw_02;
        }
        return fzw_0Array[0];
    }

    private static /* synthetic */ fzw_0[] grY() {
        return new fzw_0[]{tKY, tKZ, tLa, tLb, tLc, tLd, tLe, tLf, tLg, tLh, tLi, tLj, tLk, tLl, tLm, tLn, tLo};
    }

    static {
        tLp = fzw_0.grY();
    }
}

