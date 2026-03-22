/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fsj
 */
public final class fsj_0
extends Enum<fsj_0> {
    public static final /* enum */ fsj_0 tcj = new fsj_0(1);
    public static final /* enum */ fsj_0 tck = new fsj_0(2);
    public static final /* enum */ fsj_0 tcl = new fsj_0(4);
    public static final fsj_0 tcm;
    private final byte tcn;
    private static final /* synthetic */ fsj_0[] tco;

    public static fsj_0[] values() {
        return (fsj_0[])tco.clone();
    }

    public static fsj_0 valueOf(String string) {
        return Enum.valueOf(fsj_0.class, string);
    }

    private fsj_0(byte by) {
        this.tcn = by;
    }

    public static fsj_0 sX(String string) {
        if (string.equals("Zone libre")) {
            return tcj;
        }
        if (string.equals("Zone limit\u00e9e")) {
            return tck;
        }
        if (string.equals("Zone bloqu\u00e9e")) {
            return tcl;
        }
        return tcm;
    }

    public static fsj_0 hH(byte by) {
        for (fsj_0 fsj_02 : fsj_0.values()) {
            if (fsj_02.tcn != by) continue;
            return fsj_02;
        }
        return tcm;
    }

    public byte aJr() {
        return this.tcn;
    }

    private static /* synthetic */ fsj_0[] gkV() {
        return new fsj_0[]{tcj, tck, tcl};
    }

    static {
        tco = fsj_0.gkV();
        tcm = tcj;
    }
}

