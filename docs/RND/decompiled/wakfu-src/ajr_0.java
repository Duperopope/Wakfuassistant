/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aJR
 */
final class ajr_0
implements aJK {
    private boolean ecp = true;
    private boolean ecq = false;

    ajr_0() {
    }

    @Override
    public void a(bsS bsS2, bgy bgy2) {
        aJL.h(bgy2);
    }

    @Override
    public void b(bsS bsS2, bgy bgy2) {
        aJL.g(bgy2);
    }

    @Override
    public void a(bsS bsS2, QQ qQ) {
    }

    @Override
    public void b(bsS bsS2, QQ qQ) {
    }

    @Override
    public void c(bsS bsS2, QQ qQ) {
    }

    public void ev(boolean bl) {
        this.ecp = bl;
    }

    @Override
    public boolean chJ() {
        return this.ecp;
    }

    public void ew(boolean bl) {
        this.ecq = bl;
    }

    @Override
    public boolean chK() {
        return false;
    }

    @Override
    public void a(bsi_0 bsi_02) {
        this.a((bsS)bsi_02);
    }

    @Override
    public void a(bsS bsS2) {
        aJL.b(bsS2, ajs_0.ecs);
        aJL.d(bsS2);
        if (this.ecq) {
            aJL.h(bsS2);
            aJL.f(bsS2);
        } else {
            aJL.g(bsS2);
            aJL.e(bsS2);
        }
        aJL.c(bsS2);
    }
}

