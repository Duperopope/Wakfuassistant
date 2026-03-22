/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eKq
 */
public final class ekq_0
extends Enum<ekq_0> {
    public static final /* enum */ ekq_0 qBM = new ekq_0(0);
    public static final /* enum */ ekq_0 qBN = new ekq_0(1);
    public static final /* enum */ ekq_0 qBO = new ekq_0(2);
    public static final /* enum */ ekq_0 qBP = new ekq_0(3);
    public static final /* enum */ ekq_0 qBQ = new ekq_0(4);
    public static final /* enum */ ekq_0 qBR = new ekq_0(5);
    public static final /* enum */ ekq_0 qBS = new ekq_0(6);
    public static final /* enum */ ekq_0 qBT = new ekq_0(7);
    private final int qBU;
    private static final /* synthetic */ ekq_0[] qBV;

    public static ekq_0[] values() {
        return (ekq_0[])qBV.clone();
    }

    public static ekq_0 valueOf(String string) {
        return Enum.valueOf(ekq_0.class, string);
    }

    private ekq_0(int n2) {
        this.qBU = n2;
    }

    public int d() {
        return this.qBU;
    }

    public static ekq_0 Qq(int n) {
        for (ekq_0 ekq_02 : ekq_0.values()) {
            if (ekq_02.qBU != n) continue;
            return ekq_02;
        }
        return null;
    }

    private static /* synthetic */ ekq_0[] fxX() {
        return new ekq_0[]{qBM, qBN, qBO, qBP, qBQ, qBR, qBS, qBT};
    }

    static {
        qBV = ekq_0.fxX();
    }
}

