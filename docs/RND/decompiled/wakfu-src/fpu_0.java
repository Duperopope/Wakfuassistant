/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fpU
 */
public final class fpu_0
extends Enum<fpu_0> {
    public static final /* enum */ fpu_0 sRd = new fpu_0(0);
    public static final /* enum */ fpu_0 sRe = new fpu_0(1, 10, 0.2f, 1.25f);
    public static final /* enum */ fpu_0 sRf = new fpu_0(2, 10, 1.0f, 1.5f);
    private final byte sRg;
    private byte sRh;
    private float sRi = 1.0f;
    private float sRj = 0.0f;
    private static final /* synthetic */ fpu_0[] sRk;

    public static fpu_0[] values() {
        return (fpu_0[])sRk.clone();
    }

    public static fpu_0 valueOf(String string) {
        return Enum.valueOf(fpu_0.class, string);
    }

    private fpu_0(int n2) {
        this.sRg = (byte)n2;
    }

    private fpu_0(int n2, int n3, float f2, float f3) {
        this.sRg = (byte)n2;
        this.sRh = (byte)n3;
        this.sRj = f2;
        this.sRi = f3;
    }

    public byte aJr() {
        return this.sRg;
    }

    public byte ghv() {
        return this.sRh;
    }

    public float ghw() {
        return this.sRi;
    }

    public float ghx() {
        return this.sRj;
    }

    public static fpu_0 YK(int n) {
        if (n <= 0) {
            return sRd;
        }
        if (n == fpu_0.sRe.sRg) {
            return sRe;
        }
        if (n == fpu_0.sRf.sRg) {
            return sRf;
        }
        return sRd;
    }

    private static /* synthetic */ fpu_0[] ghy() {
        return new fpu_0[]{sRd, sRe, sRf};
    }

    static {
        sRk = fpu_0.ghy();
    }
}

