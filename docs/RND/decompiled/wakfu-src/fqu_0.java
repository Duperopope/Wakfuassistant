/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fqu
 */
public final class fqu_0
extends Enum<fqu_0> {
    public static final /* enum */ fqu_0 sTq = new fqu_0(0, 0);
    public static final /* enum */ fqu_0 sTr = new fqu_0(1, 1);
    public static final /* enum */ fqu_0 sTs = new fqu_0(2, 2);
    public static final /* enum */ fqu_0 sTt = new fqu_0(3, 3);
    public static final /* enum */ fqu_0 sTu = new fqu_0(5, 5);
    public static final /* enum */ fqu_0 sTv = new fqu_0(6, 6);
    public static final /* enum */ fqu_0 sTw = new fqu_0(7, 7);
    private final byte sTx;
    private final int sTy;
    private fqv_0 sTz;
    private static final /* synthetic */ fqu_0[] sTA;

    public static fqu_0[] values() {
        return (fqu_0[])sTA.clone();
    }

    public static fqu_0 valueOf(String string) {
        return Enum.valueOf(fqu_0.class, string);
    }

    private fqu_0(byte by, int n2) {
        this.sTx = by;
        this.sTy = n2;
    }

    public byte aJr() {
        return this.sTx;
    }

    public int aVt() {
        return this.sTy;
    }

    public fqv_0 gis() {
        return this.sTz;
    }

    public void a(fqv_0 fqv_02) {
        this.sTz = fqv_02;
    }

    public static fqu_0 ho(byte by) {
        for (fqu_0 fqu_02 : fqu_0.values()) {
            if (fqu_02.aJr() != by) continue;
            return fqu_02;
        }
        return null;
    }

    private static /* synthetic */ fqu_0[] git() {
        return new fqu_0[]{sTq, sTr, sTs, sTt, sTu, sTv, sTw};
    }

    static {
        sTA = fqu_0.git();
    }
}

