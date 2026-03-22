/*
 * Decompiled with CFR 0.152.
 */
public final class bor
extends Enum<bor> {
    public static final /* enum */ bor iPb = new bor(1);
    public static final /* enum */ bor iPc = new bor(2);
    public static final /* enum */ bor iPd = new bor(3);
    public static final /* enum */ bor iPe = new bor(4);
    public static final /* enum */ bor iPf = new bor(5);
    public static final /* enum */ bor iPg = new bor(6);
    public static final /* enum */ bor iPh = new bor(7);
    public static final /* enum */ bor iPi = new bor(8);
    public static final /* enum */ bor iPj = new bor(9);
    public static final /* enum */ bor iPk = new bor(10);
    public static final /* enum */ bor iPl = new bor(11);
    public static final /* enum */ bor iPm = new bor(12);
    public static final /* enum */ bor iPn = new bor(13);
    public static final /* enum */ bor iPo = new bor(14);
    public static final /* enum */ bor iPp = new bor(15);
    public static final /* enum */ bor iPq = new bor(16);
    public static final /* enum */ bor iPr = new bor(17);
    public static final /* enum */ bor iPs = new bor(18);
    public static final /* enum */ bor iPt = new bor(19);
    public static final /* enum */ bor iPu = new bor(20);
    public static final /* enum */ bor iPv = new bor(21);
    private final byte iPw;
    private static final /* synthetic */ bor[] iPx;

    public static bor[] values() {
        return (bor[])iPx.clone();
    }

    public static bor valueOf(String string) {
        return Enum.valueOf(bor.class, string);
    }

    private bor(byte by) {
        this.iPw = by;
    }

    public byte aJr() {
        return this.iPw;
    }

    private static /* synthetic */ bor[] dAQ() {
        return new bor[]{iPb, iPc, iPd, iPe, iPf, iPg, iPh, iPi, iPj, iPk, iPl, iPm, iPn, iPo, iPp, iPq, iPr, iPs, iPt, iPu, iPv};
    }

    static {
        iPx = bor.dAQ();
    }
}

