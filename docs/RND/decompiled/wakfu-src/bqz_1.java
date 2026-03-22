/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bqZ
 */
public class bqz_1
implements bru_0 {
    public static final aox_1 jbU = new brw_0(new brv_0("standard", new aou_1[0]), new brv_0("filtr\u00e9", new aou_1("id de l'objectif d\u00e9bloqu\u00e9")), new brv_0("filtr\u00e9", new aou_1("id de l'objectif d\u00e9bloqu\u00e9"), new aou_1("id de l'achievement")));
    private final int jbV;
    private final int jbW;

    public bqz_1(int n, int n2) {
        this.jbV = n;
        this.jbW = n2;
    }

    @Override
    public String[] dEy() {
        return new String[]{Integer.toString(this.jbV), Integer.toString(this.jbW)};
    }

    @Override
    public aox_1 bEt() {
        return jbU;
    }

    @Override
    public int d() {
        return brx_0.jec.d();
    }
}

