/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brN
 */
public class brn_1
implements bru_0 {
    public static final aox_1 jdt = new brw_0(new brv_0("standard", new aou_1[0]), new brv_0("filtr\u00e9", new aou_1("id unique de l'action d?\u00e9v\u00e9nement client LAUCH_TUTORIAL")));
    private final int jdu;

    public brn_1(int n) {
        this.jdu = n;
    }

    @Override
    public String[] dEy() {
        return new String[]{Integer.toString(this.jdu)};
    }

    @Override
    public aox_1 bEt() {
        return jdt;
    }

    @Override
    public int d() {
        return brx_0.jer.d();
    }
}

