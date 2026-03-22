/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eJv
 */
public final class ejv_0
extends Enum<ejv_0> {
    public static final /* enum */ ejv_0 qzL = new ejv_0(0);
    public static final /* enum */ ejv_0 qzM = new ejv_0(1);
    public static final /* enum */ ejv_0 qzN = new ejv_0(2);
    public static final /* enum */ ejv_0 qzO = new ejv_0(3);
    private final byte qzP;
    private static final /* synthetic */ ejv_0[] qzQ;

    public static ejv_0[] values() {
        return (ejv_0[])qzQ.clone();
    }

    public static ejv_0 valueOf(String string) {
        return Enum.valueOf(ejv_0.class, string);
    }

    private ejv_0(byte by) {
        this.qzP = by;
    }

    public static ejv_0 eU(byte by) {
        for (ejv_0 ejv_02 : ejv_0.values()) {
            if (ejv_02.qzP != by) continue;
            return ejv_02;
        }
        throw new IllegalArgumentException("Unknown result id=" + by);
    }

    public byte aJr() {
        return this.qzP;
    }

    private static /* synthetic */ ejv_0[] fxl() {
        return new ejv_0[]{qzL, qzM, qzN, qzO};
    }

    static {
        qzQ = ejv_0.fxl();
    }
}

