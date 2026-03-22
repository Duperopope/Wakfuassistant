/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eTW
 */
public final class etw_0
extends Enum<etw_0> {
    public static final /* enum */ etw_0 rqS = new etw_0(0);
    public static final /* enum */ etw_0 rqT = new etw_0(1);
    public static final /* enum */ etw_0 rqU = new etw_0(2);
    public static final /* enum */ etw_0 rqV = new etw_0(3);
    public static final /* enum */ etw_0 rqW = new etw_0(4);
    public static final /* enum */ etw_0 rqX = new etw_0(5);
    private final byte rqY;
    private static final /* synthetic */ etw_0[] rqZ;

    public static etw_0[] values() {
        return (etw_0[])rqZ.clone();
    }

    public static etw_0 valueOf(String string) {
        return Enum.valueOf(etw_0.class, string);
    }

    private etw_0(byte by) {
        this.rqY = by;
    }

    public byte aJr() {
        return this.rqY;
    }

    public static etw_0 fk(byte by) {
        for (etw_0 etw_02 : etw_0.values()) {
            if (etw_02.aJr() != by) continue;
            return etw_02;
        }
        return rqS;
    }

    private static /* synthetic */ etw_0[] fJJ() {
        return new etw_0[]{rqS, rqT, rqU, rqV, rqW, rqX};
    }

    static {
        rqZ = etw_0.fJJ();
    }
}

