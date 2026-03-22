/*
 * Decompiled with CFR 0.152.
 */
public final class fzZ
extends Enum<fzZ> {
    public static final /* enum */ fzZ tLB = new fzZ();
    public static final /* enum */ fzZ tLC = new fzZ();
    public static final /* enum */ fzZ tLD = new fzZ();
    public static final /* enum */ fzZ tLE = new fzZ();
    public static final /* enum */ fzZ tLF = new fzZ();
    public static final /* enum */ fzZ tLG = new fzZ();
    public static final /* enum */ fzZ tLH = new fzZ();
    public static final /* enum */ fzZ tLI = new fzZ();
    private static final /* synthetic */ fzZ[] tLJ;

    public static fzZ[] values() {
        return (fzZ[])tLJ.clone();
    }

    public static fzZ valueOf(String string) {
        return Enum.valueOf(fzZ.class, string);
    }

    public int uS(int n) {
        switch (this.ordinal()) {
            case 0: 
            case 3: 
            case 5: {
                return 0;
            }
            case 1: 
            case 6: {
                return (int)Math.max(0.0, (double)n * 0.5);
            }
            case 2: 
            case 4: 
            case 7: {
                return Math.max(0, n);
            }
        }
        return 0;
    }

    public int uT(int n) {
        switch (this.ordinal()) {
            case 0: 
            case 1: 
            case 2: {
                return Math.max(0, n);
            }
            case 3: 
            case 4: {
                return (int)Math.max(0.0, (double)n * 0.5);
            }
            case 5: 
            case 6: 
            case 7: {
                return 0;
            }
        }
        return 0;
    }

    public int cf(int n, int n2) {
        switch (this.ordinal()) {
            case 0: 
            case 3: 
            case 5: {
                return 0;
            }
            case 1: 
            case 6: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case 2: 
            case 4: 
            case 7: {
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
            case 4: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case 5: 
            case 6: 
            case 7: {
                return 0;
            }
        }
        return 0;
    }

    public fzZ gsb() {
        switch (this.ordinal()) {
            case 0: {
                return tLI;
            }
            case 1: {
                return tLH;
            }
            case 2: {
                return tLG;
            }
            case 3: {
                return tLF;
            }
            case 4: {
                return tLE;
            }
            case 5: {
                return tLD;
            }
            case 6: {
                return tLC;
            }
            case 7: {
                return tLB;
            }
        }
        return null;
    }

    public boolean grT() {
        return this == tLB || this == tLC || this == tLD;
    }

    public boolean grU() {
        return this == tLG || this == tLH || this == tLI;
    }

    public boolean grV() {
        return this == tLB || this == tLE || this == tLG;
    }

    public boolean grW() {
        return this == tLD || this == tLF || this == tLI;
    }

    public static fzZ tH(String string) {
        fzZ[] fzZArray = fzZ.values();
        String string2 = string.toUpperCase();
        for (fzZ fzZ2 : fzZArray) {
            if (!fzZ2.name().equals(string2)) continue;
            return fzZ2;
        }
        return fzZArray[0];
    }

    private static /* synthetic */ fzZ[] gsc() {
        return new fzZ[]{tLB, tLC, tLD, tLE, tLF, tLG, tLH, tLI};
    }

    static {
        tLJ = fzZ.gsc();
    }
}

