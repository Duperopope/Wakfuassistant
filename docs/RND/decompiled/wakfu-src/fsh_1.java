/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fSh
 */
public final class fsh_1
extends Enum<fsh_1> {
    public static final /* enum */ fsh_1 vdp = new fsh_1();
    public static final /* enum */ fsh_1 vdq = new fsh_1();
    public static final /* enum */ fsh_1 vdr = new fsh_1();
    private static final /* synthetic */ fsh_1[] vds;

    public static fsh_1[] values() {
        return (fsh_1[])vds.clone();
    }

    public static fsh_1 valueOf(String string) {
        return Enum.valueOf(fsh_1.class, string);
    }

    private static /* synthetic */ fsh_1[] gFG() {
        return new fsh_1[]{vdp, vdq, vdr};
    }

    static {
        vds = fsh_1.gFG();
    }
}

