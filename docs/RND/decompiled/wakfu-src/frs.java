/*
 * Decompiled with CFR 0.152.
 */
public final class frs
extends Enum<frs> {
    public static final /* enum */ frs sYc = new frs();
    public static final /* enum */ frs sYd = new frs();
    public static final /* enum */ frs sYe = new frs();
    public static final /* enum */ frs sYf = new frs();
    private static final frs[] sYg;
    private static final /* synthetic */ frs[] sYh;

    public static frs[] values() {
        return (frs[])sYh.clone();
    }

    public static frs valueOf(String string) {
        return Enum.valueOf(frs.class, string);
    }

    public static frs hB(byte by) {
        return sYg[by];
    }

    private static /* synthetic */ frs[] gka() {
        return new frs[]{sYc, sYd, sYe, sYf};
    }

    static {
        sYh = frs.gka();
        sYg = frs.values();
    }
}

