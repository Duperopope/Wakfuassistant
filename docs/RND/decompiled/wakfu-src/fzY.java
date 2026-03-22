/*
 * Decompiled with CFR 0.152.
 */
public final class fzY
extends Enum<fzY> {
    public static final /* enum */ fzY tLv = new fzY();
    public static final /* enum */ fzY tLw = new fzY();
    public static final /* enum */ fzY tLx = new fzY();
    public static final /* enum */ fzY tLy = new fzY();
    public static final /* enum */ fzY tLz = new fzY();
    private static final /* synthetic */ fzY[] tLA;

    public static fzY[] values() {
        return (fzY[])tLA.clone();
    }

    public static fzY valueOf(String string) {
        return Enum.valueOf(fzY.class, string);
    }

    public int uS(int n) {
        switch (this.ordinal()) {
            case 3: {
                return 0;
            }
            case 0: 
            case 1: 
            case 4: {
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
            case 3: 
            case 4: {
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
            case 1: 
            case 4: {
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
            case 3: 
            case 4: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case 1: {
                return 0;
            }
        }
        return 0;
    }

    public boolean grT() {
        return this == tLv;
    }

    public boolean grU() {
        return this == tLw;
    }

    public boolean grV() {
        return this == tLy;
    }

    public boolean grW() {
        return this == tLx;
    }

    public static fzY tG(String string) {
        fzY[] fzYArray = fzY.values();
        String string2 = string.toUpperCase();
        for (fzY fzY2 : fzYArray) {
            if (!fzY2.name().equals(string2)) continue;
            return fzY2;
        }
        return fzYArray[0];
    }

    private static /* synthetic */ fzY[] gsa() {
        return new fzY[]{tLv, tLw, tLx, tLy, tLz};
    }

    static {
        tLA = fzY.gsa();
    }
}

