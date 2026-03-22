/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ccC
 */
public final class ccc_1
extends Enum<ccc_1> {
    public static final /* enum */ ccc_1 lPl = new ccc_1(true, false);
    public static final /* enum */ ccc_1 lPm = new ccc_1(false, true);
    public static final /* enum */ ccc_1 lPn = new ccc_1(true, false);
    private final boolean lPo;
    private final boolean lPp;
    private static final /* synthetic */ ccc_1[] lPq;

    public static ccc_1[] values() {
        return (ccc_1[])lPq.clone();
    }

    public static ccc_1 valueOf(String string) {
        return Enum.valueOf(ccc_1.class, string);
    }

    private ccc_1(boolean bl, boolean bl2) {
        this.lPo = bl;
        this.lPp = bl2;
    }

    public boolean etL() {
        return this.lPo;
    }

    public boolean etM() {
        return this.lPp;
    }

    private static /* synthetic */ ccc_1[] etN() {
        return new ccc_1[]{lPl, lPm, lPn};
    }

    static {
        lPq = ccc_1.etN();
    }
}

