/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bne
 */
public final class bne_1
extends Enum<bne_1>
implements aoq_1 {
    public static final /* enum */ bne_1 iGh = new bne_1(0);
    public static final /* enum */ bne_1 iGi = new bne_1(1);
    public static final /* enum */ bne_1 iGj = new bne_1(2);
    public static final /* enum */ bne_1 iGk = new bne_1(3);
    public static final /* enum */ bne_1 iGl = new bne_1(4);
    public static final /* enum */ bne_1 iGm = new bne_1(5);
    public static final /* enum */ bne_1 iGn = new bne_1(6);
    public static final /* enum */ bne_1 iGo = new bne_1(7);
    public static final /* enum */ bne_1 iGp = new bne_1(8);
    public static final /* enum */ bne_1 iGq = new bne_1(9);
    private final int iGr;
    private static final /* synthetic */ bne_1[] iGs;

    public static bne_1[] values() {
        return (bne_1[])iGs.clone();
    }

    public static bne_1 valueOf(String string) {
        return Enum.valueOf(bne_1.class, string);
    }

    private bne_1(int n2) {
        this.iGr = n2;
    }

    public int d() {
        return this.iGr;
    }

    @Override
    public String aXA() {
        return Integer.toString(this.iGr);
    }

    @Override
    public String aXB() {
        return this.toString();
    }

    @Override
    public String aXC() {
        return null;
    }

    public static bne_1 bu(byte by) {
        for (bne_1 bne_12 : bne_1.values()) {
            if (bne_12.iGr != by) continue;
            return bne_12;
        }
        return iGh;
    }

    private static /* synthetic */ bne_1[] dxZ() {
        return new bne_1[]{iGh, iGi, iGj, iGk, iGl, iGm, iGn, iGo, iGp, iGq};
    }

    static {
        iGs = bne_1.dxZ();
    }
}

