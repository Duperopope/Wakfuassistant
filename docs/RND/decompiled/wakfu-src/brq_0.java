/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brq
 */
public class brq_0
implements bru_0 {
    public static final aox_1 jcC = new brw_0(new brv_0("standard", new aou_1[0]), new brv_0("filtr\u00e9", new aou_1("Breed opposant"), new aou_1("Group Id")));
    private final int jcD;
    private final long jcE;

    public brq_0(int n, long l) {
        this.jcD = n;
        this.jcE = l;
    }

    @Override
    public String[] dEy() {
        return new String[]{Integer.toString(this.jcD), Long.toString(this.jcE)};
    }

    @Override
    public aox_1 bEt() {
        return jcC;
    }

    @Override
    public int d() {
        return brx_0.jee.d();
    }
}

