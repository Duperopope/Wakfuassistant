/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ahq
 */
public final class ahq_0
extends Enum<ahq_0> {
    public static final /* enum */ ahq_0 cxp = new ahq_0(0);
    public static final /* enum */ ahq_0 cxq = new ahq_0(1);
    public static final /* enum */ ahq_0 cxr = new ahq_0(2);
    public static final /* enum */ ahq_0 cxs = new ahq_0(3);
    final int cxt;
    private static final /* synthetic */ ahq_0[] cxu;

    public static ahq_0[] values() {
        return (ahq_0[])cxu.clone();
    }

    public static ahq_0 valueOf(String string) {
        return Enum.valueOf(ahq_0.class, string);
    }

    private ahq_0(int n2) {
        this.cxt = n2;
    }

    private static /* synthetic */ ahq_0[] bAr() {
        return new ahq_0[]{cxp, cxq, cxr, cxs};
    }

    static {
        cxu = ahq_0.bAr();
    }
}

