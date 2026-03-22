/*
 * Decompiled with CFR 0.152.
 */
public class brw
implements bru_0 {
    public static final aox_1 jcQ = new brw_0(new brv_0("standard", new aou_1[0]), new brv_0("filtr\u00e9", new aou_1("Id de l'item"), new aou_1("Id de cat\u00e9gorie")));
    private final fhc_0 jcR;

    public brw(fhc_0 fhc_02) {
        this.jcR = fhc_02;
    }

    @Override
    public String[] dEy() {
        return new String[]{Integer.toString(this.jcR.d()), Integer.toString(this.jcR.dGh().aIi())};
    }

    @Override
    public aox_1 bEt() {
        return jcQ;
    }

    @Override
    public int d() {
        return brx_0.jdW.d();
    }
}

