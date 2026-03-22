/*
 * Decompiled with CFR 0.152.
 */
abstract sealed class bzn
extends Enum<bzn>
permits bzo, bzp_0 {
    public static final /* enum */ bzn jDM = new bzo();
    public static final /* enum */ bzn jDN = new bzp_0();
    private static final /* synthetic */ bzn[] jDO;

    public static bzn[] values() {
        return (bzn[])jDO.clone();
    }

    public static bzn valueOf(String string) {
        return Enum.valueOf(bzn.class, string);
    }

    static boolean a(long l, bjn_1 bjn_12) {
        long l2 = caf_2.lFq.rT(bjn_12.Ya());
        return l == l2;
    }

    public abstract boolean a(bzm_0 var1, RG var2);

    private static /* synthetic */ bzn[] dOI() {
        return new bzn[]{jDM, jDN};
    }

    static {
        jDO = bzn.dOI();
    }
}

