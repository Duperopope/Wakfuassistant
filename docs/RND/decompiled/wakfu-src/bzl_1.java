/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bZl
 */
class bzl_1
extends bzg_1 {
    private static final bzh_1 lCx = new bzh_1();
    private bzn_1 lCy;

    bzl_1() {
        super(lCx);
    }

    @Override
    void i(afV afV2) {
        super.i(afV2);
        this.lCy = new bzn_1();
        this.lCy.bX(true);
        this.lCy.b(afV2.brf());
        ast_1.bJG().a(this.lCy);
    }

    @Override
    void bhk() {
        super.bhk();
        if (this.lCy != null) {
            this.lCy.bX(false);
            this.lCy = null;
        }
    }

    @Override
    void a(float f2, int n, long l) {
        super.a(f2, n, l);
        if (f2 == 0.0f && this.lCy != null) {
            this.lCy.bX(false);
            this.lCy = null;
        }
    }

    @Override
    void b(afV afV2, float f2, float f3) {
        super.b(afV2, f2, f3);
    }

    static {
        bzl_1.lCx.lCp = 10.0f;
        bzl_1.lCx.lCr = 0.05f;
        bzl_1.lCx.lCo = 80.0f;
        bzl_1.lCx.lCt = 1.0f;
    }
}

