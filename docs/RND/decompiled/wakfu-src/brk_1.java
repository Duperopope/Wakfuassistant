/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brk
 */
public class brk_1
implements bru_0 {
    public static final aox_1 jco = new brw_0(new brv_0("filtr\u00e9", new aou_1("Cat\u00e9gorie de recette")));
    private final int jcp;

    public brk_1(int n) {
        this.jcp = n;
    }

    @Override
    public String[] dEy() {
        return new String[]{String.valueOf(this.jcp)};
    }

    @Override
    public aox_1 bEt() {
        return jco;
    }

    @Override
    public int d() {
        return brx_0.jdT.d();
    }
}

