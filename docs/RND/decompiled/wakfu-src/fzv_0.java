/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fzV
 */
public final class fzv_0
extends Enum<fzv_0> {
    public static final /* enum */ fzv_0 tKH = new fzv_0();
    public static final /* enum */ fzv_0 tKI = new fzv_0();
    public static final /* enum */ fzv_0 tKJ = new fzv_0();
    public static final /* enum */ fzv_0 tKK = new fzv_0();
    public static final /* enum */ fzv_0 tKL = new fzv_0();
    public static final /* enum */ fzv_0 tKM = new fzv_0();
    public static final /* enum */ fzv_0 tKN = new fzv_0();
    public static final /* enum */ fzv_0 tKO = new fzv_0();
    public static final /* enum */ fzv_0 tKP = new fzv_0();
    public static final /* enum */ fzv_0 tKQ = new fzv_0();
    public static final /* enum */ fzv_0 tKR = new fzv_0();
    public static final /* enum */ fzv_0 tKS = new fzv_0();
    public static final /* enum */ fzv_0 tKT = new fzv_0();
    public static final /* enum */ fzv_0 tKU = new fzv_0();
    public static final /* enum */ fzv_0 tKV = new fzv_0();
    public static final /* enum */ fzv_0 tKW = new fzv_0();
    private static final /* synthetic */ fzv_0[] tKX;

    public static fzv_0[] values() {
        return (fzv_0[])tKX.clone();
    }

    public static fzv_0 valueOf(String string) {
        return Enum.valueOf(fzv_0.class, string);
    }

    public int uS(int n) {
        switch (this.ordinal()) {
            case 0: 
            case 5: 
            case 7: 
            case 9: 
            case 11: {
                return 0;
            }
            case 1: 
            case 12: {
                return (int)Math.max(0.0, (double)n * 0.25);
            }
            case 2: 
            case 13: {
                return (int)Math.max(0.0, (double)n * 0.5);
            }
            case 3: 
            case 14: {
                return (int)Math.max(0.0, (double)n * 0.75);
            }
            case 4: 
            case 6: 
            case 8: 
            case 10: 
            case 15: {
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
            case 8: {
                return (int)Math.max(0.0, (double)n * 0.5);
            }
            case 9: 
            case 10: {
                return (int)Math.max(0.0, (double)n * 0.25);
            }
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
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
            case 9: 
            case 11: {
                return 0;
            }
            case 1: 
            case 12: {
                return (int)Math.round((double)(n2 - n) * 0.25);
            }
            case 2: 
            case 13: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case 3: 
            case 14: {
                return (int)Math.round((double)(n2 - n) * 0.75);
            }
            case 4: 
            case 6: 
            case 8: 
            case 10: 
            case 15: {
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
            case 8: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case 9: 
            case 10: {
                return (int)Math.round((double)(n2 - n) * 0.25);
            }
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return 0;
            }
        }
        return 0;
    }

    public boolean grT() {
        return this == tKM || this == tKH || this == tKI || this == tKJ || this == tKK || this == tKL || this == tKN;
    }

    public boolean grU() {
        return this == tKQ || this == tKS || this == tKT || this == tKU || this == tKV || this == tKW || this == tKR;
    }

    public boolean grV() {
        return this == tKM || this == tKH || this == tKI || this == tKO || this == tKT || this == tKS || this == tKQ;
    }

    public boolean grW() {
        return this == tKN || this == tKL || this == tKK || this == tKP || this == tKV || this == tKW || this == tKR;
    }

    public static fzv_0 tD(String string) {
        fzv_0[] fzv_0Array = fzv_0.values();
        String string2 = string.toUpperCase();
        for (fzv_0 fzv_02 : fzv_0Array) {
            if (!fzv_02.name().equals(string2)) continue;
            return fzv_02;
        }
        return fzv_0Array[0];
    }

    private static /* synthetic */ fzv_0[] grX() {
        return new fzv_0[]{tKH, tKI, tKJ, tKK, tKL, tKM, tKN, tKO, tKP, tKQ, tKR, tKS, tKT, tKU, tKV, tKW};
    }

    static {
        tKX = fzv_0.grX();
    }
}

