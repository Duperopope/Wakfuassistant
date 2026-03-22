/*
 * Decompiled with CFR 0.152.
 */
public final class fsn
extends Enum<fsn> {
    public static final /* enum */ fsn tcB = new fsn(3);
    public static final /* enum */ fsn tcC = new fsn(21);
    public static final /* enum */ fsn tcD = new fsn(22);
    private final byte tcE;
    private static final /* synthetic */ fsn[] tcF;

    public static fsn[] values() {
        return (fsn[])tcF.clone();
    }

    public static fsn valueOf(String string) {
        return Enum.valueOf(fsn.class, string);
    }

    private fsn(byte by) {
        this.tcE = by;
    }

    public byte aJr() {
        return this.tcE;
    }

    private static /* synthetic */ fsn[] gkY() {
        return new fsn[]{tcB, tcC, tcD};
    }

    static {
        tcF = fsn.gkY();
    }
}

