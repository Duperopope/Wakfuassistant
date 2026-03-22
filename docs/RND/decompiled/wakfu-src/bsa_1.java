/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bSA
 */
public final class bsa_1
extends Enum<bsa_1> {
    public static final /* enum */ bsa_1 lhh = new bsa_1(0, "options.displayHpBar.always");
    public static final /* enum */ bsa_1 lhi = new bsa_1(1, "options.displayHpBar.smart");
    public static final /* enum */ bsa_1 lhj = new bsa_1(2, "options.displayHpBar.never");
    private final byte lhk;
    private final String lhl;
    private static final /* synthetic */ bsa_1[] lhm;

    public static bsa_1[] values() {
        return (bsa_1[])lhm.clone();
    }

    public static bsa_1 valueOf(String string) {
        return Enum.valueOf(bsa_1.class, string);
    }

    private bsa_1(byte by, String string2) {
        this.lhk = by;
        this.lhl = string2;
    }

    public byte emS() {
        return this.lhk;
    }

    public String clY() {
        return this.lhl;
    }

    public static bsa_1 cP(byte by) {
        for (bsa_1 bsa_12 : bsa_1.values()) {
            if (by != bsa_12.lhk) continue;
            return bsa_12;
        }
        return null;
    }

    public static bsa_1 nz(String string) {
        for (bsa_1 bsa_12 : bsa_1.values()) {
            if (!aum_0.cWf().c(bsa_12.lhl, new Object[0]).equals(string)) continue;
            return bsa_12;
        }
        return null;
    }

    public static byte cQ(byte by) {
        bsa_1 bsa_12 = bsa_1.cP(by);
        if (bsa_12 == null) {
            return bsa_1.lhh.lhk;
        }
        switch (bsa_12.ordinal()) {
            case 0: {
                return bsa_1.lhj.lhk;
            }
            case 1: {
                return bsa_1.lhh.lhk;
            }
            case 2: {
                return bsa_1.lhi.lhk;
            }
        }
        return bsa_1.lhh.lhk;
    }

    private static /* synthetic */ bsa_1[] emT() {
        return new bsa_1[]{lhh, lhi, lhj};
    }

    static {
        lhm = bsa_1.emT();
    }
}

