/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Wd
 */
public class wd_0 {
    public static final long bMi = 86400000L;
    private final int bMj;
    private final float bMk;
    private final float bMl;
    private final ang_2 bMm;
    private final int bMn;
    private final short bMo;

    public wd_0(int n, float f2, float f3, ang_2 ang_22, int n2, short s) {
        this.bMj = n;
        this.bMk = f2;
        this.bMl = f3;
        this.bMm = ang_22;
        this.bMn = n2;
        this.bMo = s;
    }

    public int d() {
        return this.bMj;
    }

    public float blu() {
        return this.bMk;
    }

    public float blv() {
        return this.bMl;
    }

    public ang_2 bdo() {
        return this.bMm;
    }

    public int getDuration() {
        return this.bMn;
    }

    public short blw() {
        return this.bMo;
    }
}

