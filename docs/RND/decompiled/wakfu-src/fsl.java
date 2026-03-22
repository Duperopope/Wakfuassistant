/*
 * Decompiled with CFR 0.152.
 */
public final class fsl
extends Enum<fsl> {
    public static final /* enum */ fsl tcr = new fsl(200);
    public static final /* enum */ fsl tcs = new fsl(201);
    public static final /* enum */ fsl tct = new fsl(202);
    public static final /* enum */ fsl tcu = new fsl(203);
    private final int tcv;
    private static final /* synthetic */ fsl[] tcw;

    public static fsl[] values() {
        return (fsl[])tcw.clone();
    }

    public static fsl valueOf(String string) {
        return Enum.valueOf(fsl.class, string);
    }

    private fsl(int n2) {
        this.tcv = n2;
    }

    public int d() {
        return this.tcv;
    }

    public static fsl ZL(int n) {
        for (fsl fsl2 : fsl.values()) {
            if (fsl2.tcv != n) continue;
            return fsl2;
        }
        return null;
    }

    private static /* synthetic */ fsl[] gkW() {
        return new fsl[]{tcr, tcs, tct, tcu};
    }

    static {
        tcw = fsl.gkW();
    }
}

