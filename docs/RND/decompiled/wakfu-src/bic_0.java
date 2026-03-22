/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from biC
 */
public final class bic_0
extends Enum<bic_0> {
    public static final /* enum */ bic_0 ils = new bic_0(0);
    public static final /* enum */ bic_0 ilt = new bic_0(1);
    public static final /* enum */ bic_0 ilu = new bic_0(2);
    private final int ilv;
    private static final bic_0[] ilw;
    private static final /* synthetic */ bic_0[] ilx;

    public static bic_0[] values() {
        return (bic_0[])ilx.clone();
    }

    public static bic_0 valueOf(String string) {
        return Enum.valueOf(bic_0.class, string);
    }

    private bic_0(int n2) {
        this.ilv = n2;
    }

    public int d() {
        return this.ilv;
    }

    public static bic_0 Dd(int n) {
        for (bic_0 bic_02 : ilw) {
            if (bic_02.ilv != n) continue;
            return bic_02;
        }
        return ilu;
    }

    public bic_0 dqs() {
        return ilw[(this.ilv + 1) % ilw.length];
    }

    private static /* synthetic */ bic_0[] dqt() {
        return new bic_0[]{ils, ilt, ilu};
    }

    static {
        ilx = bic_0.dqt();
        ilw = bic_0.values();
    }
}

