/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDa
 */
class fda_1
implements fis_1 {
    final /* synthetic */ fcz_2 ubX;

    fda_1(fcz_2 fcz_22) {
        this.ubX = fcz_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (this.ubX.iNr) {
            return false;
        }
        flp_2 flp_22 = (flp_2)fiq_12;
        if (fiq_12.gBE() == this.ubX.tQx) {
            this.ubX.ubF = flp_22.x(this.ubX.tQx) - this.ubX.tQx.getWidth() / 2;
            this.ubX.ubG = flp_22.y(this.ubX.tQx) - this.ubX.tQx.getHeight() / 2;
        } else if (fiq_12.gBE() == fiq_12.gBD()) {
            float f2;
            float f3 = f2 = this.ubX.ubA ? 1.0f / (float)this.ubX.ubB + 0.001f : this.ubX.uag;
            if (this.ubX.tMi && flp_22.x((fes_2)flp_22.gBE()) < this.ubX.tQx.getX() || !this.ubX.tMi && flp_22.y((fes_2)flp_22.gBE()) < this.ubX.tQx.getY()) {
                this.ubX.setValue(this.ubX.fy(this.ubX.fz(this.ubX.awY) - f2));
            } else {
                this.ubX.setValue(this.ubX.fy(this.ubX.fz(this.ubX.awY) + f2));
            }
        }
        return false;
    }
}

