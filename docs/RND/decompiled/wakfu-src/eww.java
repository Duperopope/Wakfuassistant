/*
 * Decompiled with CFR 0.152.
 */
public final class eww
extends Enum<eww> {
    public static final /* enum */ eww oHf = new eww(1);
    public static final /* enum */ eww oHg = new eww(2);
    public static final /* enum */ eww oHh = new eww(3);
    public static final /* enum */ eww oHi = new eww(4);
    public static final /* enum */ eww oHj = new eww(5);
    public static final /* enum */ eww oHk = new eww(6);
    public static final /* enum */ eww oHl = new eww(7);
    public static final /* enum */ eww oHm = new eww(8);
    public static final /* enum */ eww oHn = new eww(9);
    public static final /* enum */ eww oHo = new eww(10);
    public static final /* enum */ eww oHp = new eww(11);
    public static final /* enum */ eww oHq = new eww(12);
    public static final /* enum */ eww oHr = new eww(13);
    public static final /* enum */ eww oHs = new eww(14);
    final byte oHt;
    private static final /* synthetic */ eww[] oHu;

    public static eww[] values() {
        return (eww[])oHu.clone();
    }

    public static eww valueOf(String string) {
        return Enum.valueOf(eww.class, string);
    }

    private eww(int n2) {
        this.oHt = GC.ct(n2);
    }

    public static eww ev(byte by) {
        for (eww eww2 : eww.values()) {
            if (by != eww2.oHt) continue;
            return eww2;
        }
        return oHf;
    }

    public byte aJr() {
        return this.oHt;
    }

    private static /* synthetic */ eww[] feX() {
        return new eww[]{oHf, oHg, oHh, oHi, oHj, oHk, oHl, oHm, oHn, oHo, oHp, oHq, oHr, oHs};
    }

    static {
        oHu = eww.feX();
    }
}

