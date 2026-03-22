/*
 * Decompiled with CFR 0.152.
 */
public final class fqT
extends Enum<fqT>
implements aoq_1 {
    public static final /* enum */ fqT sWw = new fqT(0);
    public static final /* enum */ fqT sWx = new fqT(1);
    public static final /* enum */ fqT sWy = new fqT(2);
    public static final /* enum */ fqT sWz = new fqT(3);
    public static final /* enum */ fqT sWA = new fqT(4);
    private final byte sWB;
    private static final /* synthetic */ fqT[] sWC;

    public static fqT[] values() {
        return (fqT[])sWC.clone();
    }

    public static fqT valueOf(String string) {
        return Enum.valueOf(fqT.class, string);
    }

    public static fqT hw(byte by) {
        for (fqT fqT2 : fqT.values()) {
            if (fqT2.sWB != by) continue;
            return fqT2;
        }
        return sWw;
    }

    private fqT(byte by) {
        this.sWB = by;
    }

    @Override
    public String aXA() {
        return Byte.toString(this.sWB);
    }

    @Override
    public String aXB() {
        return this.toString();
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ fqT[] gju() {
        return new fqT[]{sWw, sWx, sWy, sWz, sWA};
    }

    static {
        sWC = fqT.gju();
    }
}

