/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brG
 */
public class brg_0
implements bru_0 {
    public static final aox_1 jdi = new brw_0(new brv_0("filtr\u00e9", new aou_1("Id du sort")));
    private final int jdj;

    public brg_0(int n) {
        this.jdj = n;
    }

    @Override
    public String[] dEy() {
        return new String[]{String.valueOf(this.jdj)};
    }

    @Override
    public aox_1 bEt() {
        return jdi;
    }

    @Override
    public int d() {
        return brx_0.jeh.d();
    }
}

