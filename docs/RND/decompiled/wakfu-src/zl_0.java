/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Zl
 */
class zl_0
extends za_0 {
    private abj_0 bUx;
    private String bUy;
    private agf bUu;

    zl_0(zk_0 zk_02) {
        super(zk_02);
    }

    @Override
    public final void boS() {
        String string = this.bUt[0].bor();
        if (!string.equals(this.bUy)) {
            this.bUx.eh(string);
            this.bUy = string;
        }
        float f2 = this.bUt[1].floatValue();
        float f3 = this.bUt[2].floatValue();
        float f4 = this.bUt[3].floatValue();
        float f5 = this.bUt[4].floatValue();
        float f6 = this.bUt[5].floatValue();
        this.bUx.aH(f2, f3);
        this.bUx.cb(f4);
        this.bUx.cc(f5);
        this.bUx.cd(f6);
    }

    @Override
    public final void bhk() {
        acq_0.cge.b(this.bUx);
        this.bUx = null;
        this.bUy = null;
    }

    @Override
    public final void start() {
        this.bUx = new abj_0();
        this.bUx.b(this.bUu);
        acq_0.cge.a(this.bUx);
    }

    @Override
    public void b(aaj_0 aaj_02) {
        super.b(aaj_02);
        this.bUu = aaj_02.bqL();
    }
}

