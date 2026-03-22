/*
 * Decompiled with CFR 0.152.
 */
public final class fsc
extends Enum<fsc> {
    public static final /* enum */ fsc tbe = new fsc(1);
    public static final /* enum */ fsc tbf = new fsc(3);
    public static final /* enum */ fsc tbg = new fsc(4);
    public static final /* enum */ fsc tbh = new fsc(5);
    public static final /* enum */ fsc tbi = new fsc(7);
    public static final /* enum */ fsc tbj = new fsc(8);
    public static final /* enum */ fsc tbk = new fsc(9);
    public static final /* enum */ fsc tbl = new fsc(10);
    private final byte tbm;
    private static final /* synthetic */ fsc[] tbn;

    public static fsc[] values() {
        return (fsc[])tbn.clone();
    }

    public static fsc valueOf(String string) {
        return Enum.valueOf(fsc.class, string);
    }

    private fsc(byte by) {
        this.tbm = by;
    }

    public byte aJr() {
        return this.tbm;
    }

    private static /* synthetic */ fsc[] gkL() {
        return new fsc[]{tbe, tbf, tbg, tbh, tbi, tbj, tbk, tbl};
    }

    static {
        tbn = fsc.gkL();
    }
}

