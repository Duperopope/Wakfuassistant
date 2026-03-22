/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bra
 */
public class bra_1
implements bru_0 {
    public static final aox_1 jbX = new brw_0(new brv_0("standard", new aou_1[0]), new brv_0("filtr\u00e9", new aou_1("id de l'achievement d\u00e9bloqu\u00e9")));
    private final int jbY;

    public bra_1(int n) {
        this.jbY = n;
    }

    @Override
    public String[] dEy() {
        return new String[]{Integer.toString(this.jbY)};
    }

    @Override
    public aox_1 bEt() {
        return jbX;
    }

    @Override
    public int d() {
        return brx_0.jdP.d();
    }
}

