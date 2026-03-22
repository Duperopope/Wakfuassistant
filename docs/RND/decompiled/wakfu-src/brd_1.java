/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brd
 */
public final class brd_1
implements bru_0 {
    public static final aox_1 jcb = new brw_0(new brv_0("filtr\u00e9", new aou_1("Id du perso"), new aou_1("Id de breed"), new aou_1("Id du groupe")));
    private final long jcc;
    private final int jcd;
    private final long jce;

    public brd_1(long l, int n, long l2) {
        this.jcc = l;
        this.jcd = n;
        this.jce = l2;
    }

    @Override
    public int d() {
        return brx_0.jej.d();
    }

    @Override
    public String[] dEy() {
        return new String[]{String.valueOf(this.jcc), String.valueOf(this.jcd), String.valueOf(this.jce)};
    }

    @Override
    public aox_1 bEt() {
        return jcb;
    }
}

