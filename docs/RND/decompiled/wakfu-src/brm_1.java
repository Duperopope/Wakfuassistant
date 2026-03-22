/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brm
 */
public class brm_1
implements bru_0 {
    public static final aox_1 jct = new brw_0(new brv_0("filtr\u00e9", new aou_1("Nom de l'onglet (name dans la classe EnchantmentPanel)")));
    private final String jcu;

    public brm_1(String string) {
        this.jcu = string;
    }

    @Override
    public String[] dEy() {
        return new String[]{String.valueOf(this.jcu)};
    }

    @Override
    public aox_1 bEt() {
        return jct;
    }

    @Override
    public int d() {
        return brx_0.jeB.d();
    }
}

