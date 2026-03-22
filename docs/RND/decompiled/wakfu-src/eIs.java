/*
 * Decompiled with CFR 0.152.
 */
public final class eIs
extends Enum<eIs> {
    public static final /* enum */ eIs qwo = new eIs(-1);
    public static final /* enum */ eIs qwp = new eIs(1);
    public static final /* enum */ eIs qwq = new eIs(2);
    public static final /* enum */ eIs qwr = new eIs(3);
    public static final /* enum */ eIs qws = new eIs(4);
    private final byte qwt;
    private static final /* synthetic */ eIs[] qwu;

    public static eIs[] values() {
        return (eIs[])qwu.clone();
    }

    public static eIs valueOf(String string) {
        return Enum.valueOf(eIs.class, string);
    }

    private eIs(byte by) {
        this.qwt = by;
    }

    public byte aJr() {
        return this.qwt;
    }

    public static eIs eP(byte by) {
        for (eIs eIs2 : eIs.values()) {
            if (eIs2.qwt != by) continue;
            return eIs2;
        }
        return qwo;
    }

    private static /* synthetic */ eIs[] fwy() {
        return new eIs[]{qwo, qwp, qwq, qwr, qws};
    }

    static {
        qwu = eIs.fwy();
    }
}

