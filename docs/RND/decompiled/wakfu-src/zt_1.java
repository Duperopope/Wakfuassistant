/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Zt
 */
class zt_1
extends za_0 {
    private abU bUA;
    private String bUy = "<unknow>";

    zt_1(zs_1 zs_12) {
        super(zs_12);
    }

    @Override
    public final void boS() {
    }

    @Override
    public final void bhk() {
        ast_1.bJG().b(this.bUA);
        this.bUA.reset();
        this.bUA.clear();
    }

    @Override
    public final void start() {
        this.bUA = new abU();
        this.bUy = "<unknow>";
        this.bUA.rw(2000);
        this.bUA.b(this.bUu);
        this.bUA.bX(true);
        this.bUA.a(new abg_1(-18.0f, 18.0f, -18.0f, 18.0f, -18.0f, 18.0f));
        ast_1.bJG().a(this.bUA);
    }
}

