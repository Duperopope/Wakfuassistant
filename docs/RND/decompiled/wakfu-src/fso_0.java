/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fso
 */
public final class fso_0
extends Enum<fso_0> {
    public static final /* enum */ fso_0 tcG = new fso_0(-1, 0.0);
    public static final /* enum */ fso_0 tcH = new fso_0(0, 5.0);
    public static final /* enum */ fso_0 tcI = new fso_0(1, 15.0);
    public static final /* enum */ fso_0 tcJ = new fso_0(2, 30.0);
    public static final /* enum */ fso_0 tcK = new fso_0(3, 50.0);
    public static final /* enum */ fso_0 tcL = new fso_0(4, 100.0);
    public static final /* enum */ fso_0 tcM = new fso_0(5, 200.0);
    public static final int tcN = 6;
    private final int tcO;
    private final double tcP;
    private static final /* synthetic */ fso_0[] tcQ;

    public static fso_0[] values() {
        return (fso_0[])tcQ.clone();
    }

    public static fso_0 valueOf(String string) {
        return Enum.valueOf(fso_0.class, string);
    }

    private fso_0(int n2, double d2) {
        this.tcO = n2;
        this.tcP = d2;
    }

    public static fso_0 ZM(int n) {
        for (fso_0 fso_02 : fso_0.values()) {
            if (fso_02.tcO != n) continue;
            return fso_02;
        }
        return null;
    }

    public double gkZ() {
        return this.tcP;
    }

    public int wp() {
        return this.tcO;
    }

    private static /* synthetic */ fso_0[] gla() {
        return new fso_0[]{tcG, tcH, tcI, tcJ, tcK, tcL, tcM};
    }

    static {
        tcQ = fso_0.gla();
    }
}

