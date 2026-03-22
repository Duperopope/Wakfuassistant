/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brM
 */
public class brm_0
implements bru_0 {
    public static final aox_1 jdr = new brw_0(new brv_0("standard", new aou_1[0]), new brv_0("standard", new aou_1("Id du territoire")));
    private final long jds;

    public brm_0(long l) {
        this.jds = l;
    }

    @Override
    public String[] dEy() {
        return new String[]{Long.toString(this.jds)};
    }

    @Override
    public aox_1 bEt() {
        return jdr;
    }

    @Override
    public int d() {
        return brx_0.jdO.d();
    }
}

