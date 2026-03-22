/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bSD
 */
public final class bsd_1
extends Enum<bsd_1> {
    public static final /* enum */ bsd_1 lhC = new bsd_1(0, "options.specificEffectAreaDisplayMode.over");
    public static final /* enum */ bsd_1 lhD = new bsd_1(1, "options.specificEffectAreaDisplayMode.click");
    private final byte lhE;
    private final String lhF;
    private static final /* synthetic */ bsd_1[] lhG;

    public static bsd_1[] values() {
        return (bsd_1[])lhG.clone();
    }

    public static bsd_1 valueOf(String string) {
        return Enum.valueOf(bsd_1.class, string);
    }

    private bsd_1(byte by, String string2) {
        this.lhE = by;
        this.lhF = string2;
    }

    public byte emS() {
        return this.lhE;
    }

    public String clY() {
        return this.lhF;
    }

    public static bsd_1 cR(byte by) {
        for (bsd_1 bsd_12 : bsd_1.values()) {
            if (by != bsd_12.lhE) continue;
            return bsd_12;
        }
        return null;
    }

    public static bsd_1 nA(String string) {
        for (bsd_1 bsd_12 : bsd_1.values()) {
            if (!aum_0.cWf().c(bsd_12.lhF, new Object[0]).equals(string)) continue;
            return bsd_12;
        }
        return null;
    }

    public static bsd_1 emW() {
        return bsd_1.cR((byte)((bsg_1)aie_0.cfn().bmH()).d(bsn_1.liU));
    }

    private static /* synthetic */ bsd_1[] emX() {
        return new bsd_1[]{lhC, lhD};
    }

    static {
        lhG = bsd_1.emX();
    }
}

