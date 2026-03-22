/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCR
 */
class fcr_1
implements fik_1 {
    private static final int ubg = 50;
    private static final long ubh = 500L;
    private long dfi;
    final /* synthetic */ fcq_2 ubi;

    fcr_1(fcq_2 fcq_22) {
        this.ubi = fcq_22;
    }

    @Override
    public void a(fij_1 fij_12, int n, int n2, fes_2 fes_22) {
        float f2;
        int n3;
        if (this.ubi.uko == null) {
            return;
        }
        this.ubi.uaJ = false;
        if (this.ubi.uaH) {
            if (n < this.ubi.getDisplayX() && n > this.ubi.getDisplayX() - 50) {
                n3 = Math.abs(this.ubi.getDisplayX() - n);
                f2 = (float)n3 / (float)this.ubi.uaP.getWidth();
                this.ubi.uaL = -f2;
                this.guq();
            } else if (n > this.ubi.getDisplayX() + this.ubi.getWidth() && n < this.ubi.getDisplayX() + this.ubi.getWidth() + 50) {
                n3 = Math.abs(this.ubi.getDisplayX() + this.ubi.getWidth() - n);
                this.ubi.uaL = f2 = (float)n3 / (float)this.ubi.uaP.getWidth();
                this.guq();
            }
        }
        if (this.ubi.uaG) {
            if (n2 < this.ubi.getDisplayY() && n2 > this.ubi.getDisplayY() - 50) {
                n3 = Math.abs(this.ubi.getDisplayY() - n2);
                f2 = (float)n3 / (float)this.ubi.uaP.getHeight();
                this.ubi.uaK = -f2;
                this.guq();
            } else if (n2 > this.ubi.getDisplayY() + this.ubi.getHeight() && n2 < this.ubi.getDisplayY() + this.ubi.getHeight() + 50) {
                n3 = Math.abs(this.ubi.getDisplayY() + this.ubi.getHeight() - n2);
                this.ubi.uaK = f2 = (float)n3 / (float)this.ubi.uaP.getHeight();
                this.guq();
            }
        }
        if (this.ubi.uaJ) {
            this.ubi.setNeedsToPreProcess();
        }
    }

    private void guq() {
        if (this.dfi == 0L) {
            this.dfi = System.currentTimeMillis();
        }
        if (this.dfi + 500L < System.currentTimeMillis()) {
            this.ubi.uaJ = true;
        }
    }

    @Override
    public void b(fij_1 fij_12, int n, int n2, fes_2 fes_22) {
        this.ubi.uaK = 0.0f;
        this.ubi.uaL = 0.0f;
        this.ubi.uaJ = false;
        this.ubi.setNeedsToPreProcess();
        this.dfi = 0L;
    }

    @Override
    public boolean aZ(Object object) {
        return this.ubi.uaI == null || this.ubi.uaI.aI(object);
    }
}

