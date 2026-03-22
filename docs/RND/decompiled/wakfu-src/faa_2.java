/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fAa
 */
public final class faa_2
extends Enum<faa_2> {
    public static final /* enum */ faa_2 tLK = new faa_2();
    public static final /* enum */ faa_2 tLL = new faa_2();
    public static final /* enum */ faa_2 tLM = new faa_2();
    public static final /* enum */ faa_2 tLN = new faa_2();
    public static final /* enum */ faa_2 tLO = new faa_2();
    public static final /* enum */ faa_2 tLP = new faa_2();
    public static final /* enum */ faa_2 tLQ = new faa_2();
    public static final /* enum */ faa_2 tLR = new faa_2();
    public static final /* enum */ faa_2 tLS = new faa_2();
    private static final faa_2[] tLT;
    private static final /* synthetic */ faa_2[] tLU;

    public static faa_2[] values() {
        return (faa_2[])tLU.clone();
    }

    public static faa_2 valueOf(String string) {
        return Enum.valueOf(faa_2.class, string);
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
                return (int)Math.max(0.0, (double)n * 0.5);
            }
            case 2: 
            case 5: 
            case 8: {
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
            case 4: 
            case 5: {
                return (int)Math.max(0.0, (double)n * 0.5);
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

    public int ap(int n, int n2, int n3) {
        switch (this.ordinal()) {
            case 0: 
            case 3: 
            case 6: {
                return n - n3;
            }
            case 1: 
            case 4: 
            case 7: {
                return (int)Math.round((double)(n2 - n3) * 0.5) + n;
            }
            case 2: 
            case 5: 
            case 8: {
                return n + n2;
            }
        }
        return 0;
    }

    public int aq(int n, int n2, int n3) {
        switch (this.ordinal()) {
            case 0: 
            case 1: 
            case 2: {
                return n + n2;
            }
            case 3: 
            case 4: 
            case 5: {
                return (int)Math.round((double)(n2 - n3) * 0.5) + n;
            }
            case 6: 
            case 7: 
            case 8: {
                return n - n3;
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

    public boolean grT() {
        return this == tLK || this == tLL || this == tLM;
    }

    public boolean grU() {
        return this == tLQ || this == tLR || this == tLS;
    }

    public boolean grV() {
        return this == tLK || this == tLN || this == tLQ;
    }

    public boolean grW() {
        return this == tLM || this == tLP || this == tLS;
    }

    public faa_2 gsd() {
        switch (this.ordinal()) {
            case 0: {
                return tLM;
            }
            case 2: {
                return tLK;
            }
            case 3: {
                return tLP;
            }
            case 5: {
                return tLN;
            }
            case 6: {
                return tLS;
            }
            case 8: {
                return tLQ;
            }
        }
        return this;
    }

    public faa_2 gse() {
        switch (this.ordinal()) {
            case 0: {
                return tLQ;
            }
            case 1: {
                return tLR;
            }
            case 2: {
                return tLS;
            }
            case 6: {
                return tLK;
            }
            case 7: {
                return tLL;
            }
            case 8: {
                return tLM;
            }
        }
        return this;
    }

    public faa_2 gsf() {
        return tLT[tLT.length - 1 - this.ordinal()];
    }

    public static faa_2 aU(@NotNull Object object) {
        if (object instanceof faa_2) {
            return (faa_2)((Object)object);
        }
        return faa_2.tI(object.toString());
    }

    public static faa_2 tI(String string) {
        String string2 = string.toUpperCase();
        for (faa_2 faa_22 : tLT) {
            if (!faa_22.name().equals(string2)) continue;
            return faa_22;
        }
        return tLT[0];
    }

    private static /* synthetic */ faa_2[] gsg() {
        return new faa_2[]{tLK, tLL, tLM, tLN, tLO, tLP, tLQ, tLR, tLS};
    }

    static {
        tLU = faa_2.gsg();
        tLT = faa_2.values();
    }
}

