/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brn
 */
public class brn_0
implements bru_0 {
    public static final aox_1 jcv = new brw_0(new brv_0("standard", new aou_1[0]), new brv_0("filtr\u00e9", new aou_1("id de l'instance")), new brv_0("Ancien monde", new aou_1("id de l'instance"), new aou_1("id de l'ancienne instance")));
    private final long jcw;
    private final long jcx;

    public brn_0(long l, long l2) {
        this.jcw = l;
        this.jcx = l2;
    }

    @Override
    public String[] dEy() {
        return new String[]{Long.toString(this.jcx), Long.toString(this.jcw)};
    }

    @Override
    public aox_1 bEt() {
        return jcv;
    }

    @Override
    public int d() {
        return brx_0.jdQ.d();
    }
}

