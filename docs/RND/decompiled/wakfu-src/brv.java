/*
 * Decompiled with CFR 0.152.
 */
public class brv
implements bru_0 {
    public static final aox_1 jcN = new brw_0(new brv_0("standard", new aou_1[0]), new brv_0("filtr\u00e9 sur l'Dd de l'item", new aou_1("Id de l'item"), new aou_1("Id de la famille directe")));
    private final int jcO;
    private final short jcP;

    public brv(fhc_0 fhc_02) {
        this.jcO = fhc_02.d();
        this.jcP = fhc_02.dGh().aIi();
    }

    @Override
    public String[] dEy() {
        return new String[]{Integer.toString(this.jcO), Integer.toString(this.jcP)};
    }

    @Override
    public aox_1 bEt() {
        return jcN;
    }

    @Override
    public int d() {
        return brx_0.jdG.d();
    }
}

