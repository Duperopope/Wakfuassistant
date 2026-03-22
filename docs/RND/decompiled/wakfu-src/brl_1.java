/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brl
 */
public class brl_1
implements bru_0 {
    public static final aox_1 jcq = new brw_0(new brv_0("standard", new aou_1[0]), new brv_0("filtr\u00e9", new aou_1("Id du dialogue"), new aou_1("Id du choix")));
    private final int jcr;
    private final int jcs;

    public brl_1(int n, int n2) {
        this.jcr = n;
        this.jcs = n2;
    }

    @Override
    public String[] dEy() {
        return new String[]{Integer.toString(this.jcr), Integer.toString(this.jcs)};
    }

    @Override
    public aox_1 bEt() {
        return jcq;
    }

    @Override
    public int d() {
        return brx_0.jef.d();
    }
}

