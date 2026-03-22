/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bYM
 */
final class bym_1
extends Enum<bym_1> {
    public static final /* enum */ bym_1 lBb = new bym_1();
    public static final /* enum */ bym_1 lBc = new bym_1();
    public static final /* enum */ bym_1 lBd = new bym_1();
    public static final /* enum */ bym_1 lBe = new bym_1();
    public static final /* enum */ bym_1 lBf = new bym_1();
    public static final /* enum */ bym_1 lBg = new bym_1();
    private static final /* synthetic */ bym_1[] lBh;

    public static bym_1[] values() {
        return (bym_1[])lBh.clone();
    }

    public static bym_1 valueOf(String string) {
        return Enum.valueOf(bym_1.class, string);
    }

    boolean ept() {
        return this == lBc || this == lBd;
    }

    boolean epu() {
        return this == lBf || this == lBg;
    }

    private static /* synthetic */ bym_1[] epv() {
        return new bym_1[]{lBb, lBc, lBd, lBe, lBf, lBg};
    }

    static {
        lBh = bym_1.epv();
    }
}

