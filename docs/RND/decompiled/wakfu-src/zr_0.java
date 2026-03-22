/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Zr
 */
class zr_0
extends za_0 {
    private abq_0 bUz;
    private String bUy = "<unknow>";

    zr_0(zq_0 zq_02) {
        super(zq_02);
    }

    @Override
    public final void boS() {
    }

    @Override
    public final void bhk() {
        this.bUz.reset();
        this.bUz.clear();
        ast_1.bJG().b(this.bUz);
        this.bUz = null;
    }

    @Override
    public final void start() {
        this.bUz = new abq_0();
        this.bUy = "<unknow>";
        this.bUz.rw(2000);
        this.bUz.b(this.bUu);
        this.bUz.a(new abg_1(-18.0f, 18.0f, -18.0f, 18.0f, -18.0f, 18.0f));
        this.bUz.bX(true);
        ast_1.bJG().a(this.bUz);
    }
}

