/*
 * Decompiled with CFR 0.152.
 */
public final class dgx
extends Enum<dgx> {
    public static final /* enum */ dgx okG = new dgx(new dgu());
    public static final /* enum */ dgx okH = new dgx(new dgj());
    public static final /* enum */ dgx okI = new dgx(new dgk());
    public static final /* enum */ dgx okJ = new dgx(new dgr());
    public static final /* enum */ dgx okK = new dgx(new dgy());
    public static final /* enum */ dgx okL = new dgx(new dgq());
    public static final /* enum */ dgx okM = new dgx(new dgp());
    public static final /* enum */ dgx okN = new dgx(new dgl());
    public static final /* enum */ dgx okO = new dgx(new dgt());
    private final dgh okP;
    private static final /* synthetic */ dgx[] okQ;

    public static dgx[] values() {
        return (dgx[])okQ.clone();
    }

    public static dgx valueOf(String string) {
        return Enum.valueOf(dgx.class, string);
    }

    private dgx(dgh dgh2) {
        this.okP = dgh2;
    }

    public dgh fcU() {
        return this.okP;
    }

    private static /* synthetic */ dgx[] fcV() {
        return new dgx[]{okG, okH, okI, okJ, okK, okL, okM, okN, okO};
    }

    static {
        okQ = dgx.fcV();
    }
}

