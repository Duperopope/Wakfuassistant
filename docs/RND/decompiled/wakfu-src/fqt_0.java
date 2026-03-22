/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fqt
 */
public final class fqt_0
extends Enum<fqt_0> {
    public static final /* enum */ fqt_0 sTc = new fqt_0(new fqs_0(), 8, 4, true);
    public static final /* enum */ fqt_0 sTd = new fqt_0(new fqx_0(), 6, 4, true);
    public static final /* enum */ fqt_0 sTe = new fqt_0(new fqx_0(), 8, 1, false);
    private static final int sTf;
    private static final int sTg;
    public static final fqt_0[] sTh;
    private static final int sTi = 2;
    private final RU sTj;
    private final short sTk;
    private final byte sTl;
    private byte sTm;
    private byte sTn;
    private final boolean sTo;
    private static final /* synthetic */ fqt_0[] sTp;

    public static fqt_0[] values() {
        return (fqt_0[])sTp.clone();
    }

    public static fqt_0 valueOf(String string) {
        return Enum.valueOf(fqt_0.class, string);
    }

    private fqt_0(RU rU, short s, byte by, boolean bl) {
        this.sTj = rU;
        this.sTk = s;
        this.sTl = by;
        this.sTo = bl;
    }

    public RU gij() {
        return this.sTj;
    }

    public boolean efP() {
        return this.sTo;
    }

    public short gik() {
        return this.sTk;
    }

    public byte fnx() {
        return this.sTl;
    }

    public short eFS() {
        return this.sTm;
    }

    public byte gil() {
        return (byte)(this.sTm * 2);
    }

    public short gim() {
        return this.sTn;
    }

    public static int gin() {
        return sTf;
    }

    public static int gio() {
        return sTg;
    }

    public static fqt_0[] gip() {
        return sTh;
    }

    public static byte e(fqt_0 fqt_02) {
        byte by = 0;
        for (fqt_0 fqt_03 : fqt_0.values()) {
            if (fqt_03 == fqt_02) break;
            by = (byte)(by + fqt_03.fnx());
        }
        return by;
    }

    public static byte f(fqt_0 fqt_02) {
        byte by = 0;
        for (fqt_0 fqt_03 : fqt_0.gip()) {
            if (fqt_03 == fqt_02) break;
            by = (byte)(by + fqt_03.fnx());
        }
        return by;
    }

    public static byte giq() {
        return (byte)(fqt_0.gio() * 2);
    }

    private static /* synthetic */ fqt_0[] gir() {
        return new fqt_0[]{sTc, sTd, sTe};
    }

    static {
        sTp = fqt_0.gir();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        for (fqt_0 fqt_02 : fqt_0.values()) {
            fqt_02.sTm = fqt_0.e(fqt_02);
            n2 += fqt_02.fnx();
            if (!fqt_02.efP()) continue;
            ++n;
            n3 += fqt_02.fnx();
        }
        sTf = n2;
        sTg = n3;
        sTh = new fqt_0[n];
        int n4 = 0;
        for (fqt_0 fqt_03 : fqt_0.values()) {
            if (!fqt_03.efP()) continue;
            fqt_0.sTh[n4] = fqt_03;
            ++n4;
        }
        for (fqt_0 fqt_03 : fqt_0.gip()) {
            fqt_03.sTn = fqt_0.f(fqt_03);
        }
    }
}

