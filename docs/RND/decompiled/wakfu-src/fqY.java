/*
 * Decompiled with CFR 0.152.
 */
public final class fqY
extends Enum<fqY>
implements aoq_1 {
    public static final /* enum */ fqY sXe = new fqY(-1);
    public static final /* enum */ fqY sXf = new fqY(0);
    public static final /* enum */ fqY sXg = new fqY(1);
    private final byte sXh;
    private static final /* synthetic */ fqY[] sXi;

    public static fqY[] values() {
        return (fqY[])sXi.clone();
    }

    public static fqY valueOf(String string) {
        return Enum.valueOf(fqY.class, string);
    }

    public static fqY hz(byte by) {
        for (fqY fqY2 : fqY.values()) {
            if (fqY2.sXh != by) continue;
            return fqY2;
        }
        return sXf;
    }

    private fqY(byte by) {
        this.sXh = by;
    }

    @Override
    public String aXA() {
        return Byte.toString(this.sXh);
    }

    @Override
    public String aXB() {
        return this.toString();
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ fqY[] gjN() {
        return new fqY[]{sXe, sXf, sXg};
    }

    static {
        sXi = fqY.gjN();
    }
}

