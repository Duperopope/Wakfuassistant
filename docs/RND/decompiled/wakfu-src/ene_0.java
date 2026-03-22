/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eNe
 */
public final class ene_0
extends Enum<ene_0> {
    public static final /* enum */ ene_0 qPu = new ene_0(0);
    public static final /* enum */ ene_0 qPv = new ene_0(1);
    public static final /* enum */ ene_0 qPw = new ene_0(2);
    public static final /* enum */ ene_0 qPx = new ene_0(3);
    public final int qPy;
    private static final /* synthetic */ ene_0[] qPz;

    public static ene_0[] values() {
        return (ene_0[])qPz.clone();
    }

    public static ene_0 valueOf(String string) {
        return Enum.valueOf(ene_0.class, string);
    }

    private ene_0(int n2) {
        this.qPy = n2;
    }

    public static ene_0 RO(int n) {
        for (ene_0 ene_02 : ene_0.values()) {
            if (ene_02.qPy != n) continue;
            return ene_02;
        }
        return qPu;
    }

    private static /* synthetic */ ene_0[] fBa() {
        return new ene_0[]{qPu, qPv, qPw, qPx};
    }

    static {
        qPz = ene_0.fBa();
    }
}

