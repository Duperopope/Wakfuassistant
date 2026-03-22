/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from awv
 */
public final class awv_1
extends Enum<awv_1> {
    public static final /* enum */ awv_1 dlK = new awv_1();
    public static final /* enum */ awv_1 dlL = new awv_1();
    public static final /* enum */ awv_1 dlM = new awv_1();
    public static final /* enum */ awv_1 dlN = new awv_1();
    public static final /* enum */ awv_1 dlO = new awv_1();
    public static final /* enum */ awv_1 dlP = new awv_1();
    public static final /* enum */ awv_1 dlQ = new awv_1();
    public static final /* enum */ awv_1 dlR = new awv_1();
    public static final /* enum */ awv_1 dlS = new awv_1();
    private static final /* synthetic */ awv_1[] dlT;

    public static awv_1[] values() {
        return (awv_1[])dlT.clone();
    }

    public static awv_1 valueOf(String string) {
        return Enum.valueOf(awv_1.class, string);
    }

    public int uS(int n) {
        switch (this.ordinal()) {
            case 0: 
            case 3: 
            case 6: {
                return 0;
            }
            case 1: 
            case 4: 
            case 7: {
                return (int)(-Math.max(0.0, (double)n * 0.5));
            }
            case 2: 
            case 5: 
            case 8: {
                return -Math.max(0, n);
            }
        }
        return 0;
    }

    public int uT(int n) {
        switch (this.ordinal()) {
            case 0: 
            case 1: 
            case 2: {
                return -Math.max(0, n);
            }
            case 3: 
            case 4: 
            case 5: {
                return (int)(-Math.max(0.0, (double)n * 0.5));
            }
            case 6: 
            case 7: 
            case 8: {
                return 0;
            }
        }
        return 0;
    }

    public int cf(int n, int n2) {
        switch (this.ordinal()) {
            case 0: 
            case 3: 
            case 6: {
                return 0;
            }
            case 1: 
            case 4: 
            case 7: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case 2: 
            case 5: 
            case 8: {
                return Math.max(0, n2 - n);
            }
        }
        return 0;
    }

    public int cg(int n, int n2) {
        switch (this.ordinal()) {
            case 0: 
            case 1: 
            case 2: {
                return n2 - n;
            }
            case 3: 
            case 4: 
            case 5: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case 6: 
            case 7: 
            case 8: {
                return 0;
            }
        }
        return 0;
    }

    private static /* synthetic */ awv_1[] bON() {
        return new awv_1[]{dlK, dlL, dlM, dlN, dlO, dlP, dlQ, dlR, dlS};
    }

    static {
        dlT = awv_1.bON();
    }
}

