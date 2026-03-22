/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brH
 */
public class brh_0
implements bru_0 {
    public static final aox_1 jdk = new brw_0(new brv_0("filtr\u00e9", new aou_1("Id du sort")));
    private final int jdl;

    public brh_0(int n) {
        this.jdl = n;
    }

    @Override
    public String[] dEy() {
        return new String[]{String.valueOf(this.jdl)};
    }

    @Override
    public aox_1 bEt() {
        return jdk;
    }

    @Override
    public int d() {
        return brx_0.jea.d();
    }
}

