/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eLp
 */
public final class elp_0
extends Enum<elp_0>
implements aoq_1 {
    public static final /* enum */ elp_0 qFZ = new elp_0(0);
    public static final /* enum */ elp_0 qGa = new elp_0(1);
    public static final /* enum */ elp_0 qGb = new elp_0(2);
    public static final /* enum */ elp_0 qGc = new elp_0(3);
    private final byte qGd;
    private static final /* synthetic */ elp_0[] qGe;

    public static elp_0[] values() {
        return (elp_0[])qGe.clone();
    }

    public static elp_0 valueOf(String string) {
        return Enum.valueOf(elp_0.class, string);
    }

    private elp_0(byte by) {
        this.qGd = by;
    }

    @Override
    public String aXA() {
        return Integer.toString(this.qGd);
    }

    @Override
    public String aXB() {
        return this.toString();
    }

    @Override
    public String aXC() {
        return null;
    }

    public static elp_0 fa(byte by) {
        for (elp_0 elp_02 : elp_0.values()) {
            if (elp_02.qGd != by) continue;
            return elp_02;
        }
        return null;
    }

    public byte aJr() {
        return this.qGd;
    }

    private static /* synthetic */ elp_0[] fzF() {
        return new elp_0[]{qFZ, qGa, qGb, qGc};
    }

    static {
        qGe = elp_0.fzF();
    }
}

