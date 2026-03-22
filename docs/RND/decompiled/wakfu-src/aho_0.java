/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ahO
 */
public class aho_0 {
    public static final byte cyz = 1;
    public static final byte cyA = 2;
    public static final byte cyB = 3;
    public static final float cyC = -2.0f;
    private final float cyD;
    private final float cyE;
    private final byte cyF;
    private boolean cyG;

    public aho_0(float f2, float f3, byte by) {
        this.cyD = f2;
        this.cyE = f3;
        this.cyF = by;
    }

    public int bJ(int n, int n2) {
        if (this.cyD == -2.0f) {
            return n2;
        }
        return (int)((float)n * this.cyD);
    }

    public int bK(int n, int n2) {
        if (this.cyE == -2.0f) {
            return n2;
        }
        return (int)((float)n * this.cyE);
    }

    public int bL(int n, int n2) {
        switch (this.cyF) {
            case 1: 
            case 3: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case 2: {
                return Math.max(0, n2 - n);
            }
        }
        return 0;
    }

    public int bM(int n, int n2) {
        switch (this.cyF) {
            case 1: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case 2: 
            case 3: {
                return 0;
            }
        }
        return 0;
    }

    public boolean bBb() {
        return this.cyG;
    }

    public void cw(boolean bl) {
        this.cyG = bl;
    }
}

