/*
 * Decompiled with CFR 0.152.
 */
public final class fsb
extends Enum<fsb> {
    public static final /* enum */ fsb taY = new fsb();
    public static final /* enum */ fsb taZ = new fsb();
    public static final /* enum */ fsb tba = new fsb();
    public static final int tbb = -20;
    public static final int tbc = 40;
    private static final /* synthetic */ fsb[] tbd;

    public static fsb[] values() {
        return (fsb[])tbd.clone();
    }

    public static fsb valueOf(String string) {
        return Enum.valueOf(fsb.class, string);
    }

    public static fsb ZK(int n) {
        if (n < 0) {
            return taY;
        }
        if (n > 20) {
            return tba;
        }
        return taZ;
    }

    private static /* synthetic */ fsb[] gkK() {
        return new fsb[]{taY, taZ, tba};
    }

    static {
        tbd = fsb.gkK();
    }
}

