/*
 * Decompiled with CFR 0.152.
 */
public class brz
implements bru_0 {
    public static final aox_1 jcV = new brw_0(new brv_0("standard", new aou_1[0]), new brv_0("filtr\u00e9", new aou_1("level atteind par le joueur")));
    private final int jcW;

    public brz(int n) {
        this.jcW = n;
    }

    @Override
    public String[] dEy() {
        return new String[]{Integer.toString(this.jcW)};
    }

    @Override
    public aox_1 bEt() {
        return jcV;
    }

    @Override
    public int d() {
        return brx_0.jdR.d();
    }
}

