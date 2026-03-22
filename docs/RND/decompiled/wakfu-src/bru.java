/*
 * Decompiled with CFR 0.152.
 */
public class bru
implements bru_0 {
    public static final aox_1 jcJ = new brw_0(new brv_0("standard", new aou_1[0]), new brv_0("[Element|Template|Action] Id", new aou_1("element Id"), new aou_1("model Id"), new aou_1("action Id")));
    private final long jcK;
    private final long jcL;
    private final long jcM;

    public bru(bCA bCA2, long l) {
        this.jcL = l;
        this.jcK = bCA2.Sn();
        this.jcM = bCA2.beA();
    }

    @Override
    public String[] dEy() {
        return new String[]{String.valueOf(this.jcK), String.valueOf(this.jcM), String.valueOf(this.jcL)};
    }

    @Override
    public aox_1 bEt() {
        return jcJ;
    }

    @Override
    public int d() {
        return brx_0.jeb.d();
    }
}

