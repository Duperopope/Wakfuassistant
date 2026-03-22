/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ezD
 */
public class ezd_0
extends ezb_0 {
    private static ezd_0 psb;

    public ezd_0() {
    }

    public ezd_0(short s, String string, int n, short s2, exP exP2, int n2, fqP<fqE> fqP2) {
        super(s, string, n, s2, exP2, n2, fqP2);
    }

    public ezd_0(short s, RW<fqE, ym_1> rW, RU<fqE> rU, boolean bl, boolean bl2, boolean bl3) {
        super(s, rW, rU, bl, bl2, bl3);
    }

    public static ezd_0 fmK() {
        return psb;
    }

    public static void a(ezd_0 ezd_02) {
        psb = ezd_02;
    }

    @Override
    protected byte fmH() {
        return 3;
    }
}

