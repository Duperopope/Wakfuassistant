/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fqp
 */
public final class fqp_0
extends Enum<fqp_0> {
    public static final /* enum */ fqp_0 sSH = new fqp_0(true, false, false, true, false);
    public static final /* enum */ fqp_0 sSI = new fqp_0(false, true, false, true, false);
    public static final /* enum */ fqp_0 sSJ = new fqp_0(true, false, true, false, false);
    public static final /* enum */ fqp_0 sSK = new fqp_0(false, true, true, false, false);
    public static final /* enum */ fqp_0 sSL = new fqp_0(false, true, false, false, true);
    public static final /* enum */ fqp_0 sSM = new fqp_0(false, false, false, false, false);
    private final boolean sSN;
    private final boolean sSO;
    private final boolean sSP;
    private final boolean sSQ;
    private final boolean sSR;
    private static final /* synthetic */ fqp_0[] sSS;

    public static fqp_0[] values() {
        return (fqp_0[])sSS.clone();
    }

    public static fqp_0 valueOf(String string) {
        return Enum.valueOf(fqp_0.class, string);
    }

    private fqp_0(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.sSN = bl;
        this.sSO = bl2;
        this.sSP = bl3;
        this.sSQ = bl4;
        this.sSR = bl5;
    }

    public boolean gic() {
        return this.sSN;
    }

    public boolean fbT() {
        return this.sSO;
    }

    public boolean fXx() {
        return this.sSP || this.sSQ;
    }

    public boolean gid() {
        return this.sSP;
    }

    public boolean dmc() {
        return this.sSQ;
    }

    public boolean aXd() {
        return this.sSR;
    }

    private static /* synthetic */ fqp_0[] gie() {
        return new fqp_0[]{sSH, sSI, sSJ, sSK, sSL, sSM};
    }

    static {
        sSS = fqp_0.gie();
    }
}

