/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fzX
 */
public final class fzx_0
extends Enum<fzx_0> {
    public static final /* enum */ fzx_0 tLq = new fzx_0();
    public static final /* enum */ fzx_0 tLr = new fzx_0();
    public static final /* enum */ fzx_0 tLs = new fzx_0();
    public static final /* enum */ fzx_0 tLt = new fzx_0();
    private static final /* synthetic */ fzx_0[] tLu;

    public static fzx_0[] values() {
        return (fzx_0[])tLu.clone();
    }

    public static fzx_0 valueOf(String string) {
        return Enum.valueOf(fzx_0.class, string);
    }

    public int uS(int n) {
        switch (this.ordinal()) {
            case 3: {
                return 0;
            }
            case 0: 
            case 1: {
                return (int)Math.max(0.0, (double)n * 0.5);
            }
            case 2: {
                return Math.max(0, n);
            }
        }
        return 0;
    }

    public int uT(int n) {
        switch (this.ordinal()) {
            case 0: {
                return Math.max(0, n);
            }
            case 2: 
            case 3: {
                return (int)Math.max(0.0, (double)n * 0.5);
            }
            case 1: {
                return 0;
            }
        }
        return 0;
    }

    public int cf(int n, int n2) {
        switch (this.ordinal()) {
            case 3: {
                return 0;
            }
            case 0: 
            case 1: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case 2: {
                return Math.max(0, n2 - n);
            }
        }
        return 0;
    }

    public int cg(int n, int n2) {
        switch (this.ordinal()) {
            case 0: {
                return n2 - n;
            }
            case 2: 
            case 3: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case 1: {
                return 0;
            }
        }
        return 0;
    }

    public boolean grT() {
        return this == tLq;
    }

    public boolean grU() {
        return this == tLr;
    }

    public boolean grV() {
        return this == tLt;
    }

    public boolean grW() {
        return this == tLs;
    }

    public static fzx_0 tF(String string) {
        fzx_0[] fzx_0Array = fzx_0.values();
        String string2 = string.toUpperCase();
        for (fzx_0 fzx_02 : fzx_0Array) {
            if (!fzx_02.name().equals(string2)) continue;
            return fzx_02;
        }
        return fzx_0Array[0];
    }

    private static /* synthetic */ fzx_0[] grZ() {
        return new fzx_0[]{tLq, tLr, tLs, tLt};
    }

    static {
        tLu = fzx_0.grZ();
    }
}

