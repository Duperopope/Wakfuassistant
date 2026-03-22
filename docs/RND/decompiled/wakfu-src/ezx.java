/*
 * Decompiled with CFR 0.152.
 */
public class ezx
extends ezb_0 {
    private static ezx prU;

    public ezx() {
    }

    public ezx(short s, String string, int n, short s2, exP exP2, int n2, fqP<fqE> fqP2) {
        super(s, string, n, s2, exP2, n2, fqP2);
    }

    public ezx(short s, RW<fqE, ym_1> rW, RU<fqE> rU, boolean bl, boolean bl2, boolean bl3) {
        super(s, rW, rU, bl, bl2, bl3);
    }

    public static ezx fmG() {
        return prU;
    }

    public static void a(ezx ezx2) {
        prU = ezx2;
    }

    @Override
    protected byte fmH() {
        return 2;
    }
}

