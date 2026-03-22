/*
 * Decompiled with CFR 0.152.
 */
public abstract sealed class fbb
extends Enum<fbb>
implements aza_2<faZ>
permits fbc, fbe, fbf, fbg, fbh, fbi, fbj, fbk, fbl, fbd {
    public static final /* enum */ fbb rQl = new fbc(1);
    public static final /* enum */ fbb rQm = new fbe(2);
    public static final /* enum */ fbb rQn = new fbf(3);
    public static final /* enum */ fbb rQo = new fbg(4);
    public static final /* enum */ fbb rQp = new fbh(5);
    public static final /* enum */ fbb rQq = new fbi(6);
    public static final /* enum */ fbb rQr = new fbj(7);
    public static final /* enum */ fbb rQs = new fbk(8);
    public static final /* enum */ fbb rQt = new fbl(9);
    public static final /* enum */ fbb rQu = new fbd(10);
    public final byte rQv;
    private static final /* synthetic */ fbb[] rQw;

    public static fbb[] values() {
        return (fbb[])rQw.clone();
    }

    public static fbb valueOf(String string) {
        return Enum.valueOf(fbb.class, string);
    }

    fbb(int n2) {
        this.rQv = GC.ct(n2);
    }

    public static fbb fZ(byte by) {
        for (fbb fbb2 : fbb.values()) {
            if (fbb2.rQv != by) continue;
            return fbb2;
        }
        throw new fcd_0("[HAVEN_WORLD] Action " + by + " inconnue");
    }

    private static /* synthetic */ fbb[] fRF() {
        return new fbb[]{rQl, rQm, rQn, rQo, rQp, rQq, rQr, rQs, rQt, rQu};
    }

    static {
        rQw = fbb.fRF();
    }
}

