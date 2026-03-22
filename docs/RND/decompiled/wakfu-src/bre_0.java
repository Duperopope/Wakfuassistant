/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bre
 */
public class bre_0
implements bru_0 {
    public static final aox_1 jcf = new brw_0(new brv_0("standard", new aou_1[0]), new brv_0("filtr\u00e9", new aou_1("nom du rang de criminalit\u00e9 (cl\u00e9 de trad)"), new aou_1("Points de criminalit\u00e9")));
    private final fkd_0 jcg;
    private final int jch;

    public bre_0(fkd_0 fkd_02, int n) {
        this.jcg = fkd_02;
        this.jch = n;
    }

    @Override
    public String[] dEy() {
        return new String[]{this.jcg.clY(), String.valueOf(this.jch)};
    }

    @Override
    public aox_1 bEt() {
        return jcf;
    }

    @Override
    public int d() {
        return brx_0.jdS.d();
    }
}

