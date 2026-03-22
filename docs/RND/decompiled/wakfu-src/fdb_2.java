/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDb
 */
class fdb_2
implements fis_1 {
    final /* synthetic */ fcz_2 ubY;

    fdb_2(fcz_2 fcz_22) {
        this.ubY = fcz_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (this.ubY.iNr || fiq_12.gBE() != this.ubY.tQx) {
            return false;
        }
        flp_2 flp_22 = (flp_2)fiq_12;
        if (this.ubY.tMi) {
            int n = flp_22.x((fes_2)flp_22.gBD()) - this.ubY.ubF;
            float f2 = (int)Math.floor((double)this.ubY.tQx.getWidth() / 2.0);
            float f3 = (int)Math.ceil((double)this.ubY.tQx.getWidth() / 2.0);
            if ((float)n < f2) {
                n = (int)f2;
            } else if ((float)n > (float)this.ubY.ukt.width - f3) {
                n = this.ubY.ukt.width - (int)f3;
            }
            float f4 = ((float)n - f2) / ((float)this.ubY.ukt.width - (float)this.ubY.tQx.getWidth());
            this.ubY.setValue(this.ubY.fy(f4));
        } else {
            int n = flp_22.y((fes_2)flp_22.gBD()) - this.ubY.ubG;
            float f5 = (float)Math.floor((double)this.ubY.tQx.getHeight() / 2.0);
            float f6 = (float)Math.ceil((double)this.ubY.tQx.getHeight() / 2.0);
            if ((float)n < f5) {
                n = (int)f5;
            } else if ((float)n > (float)this.ubY.ukt.height - f6) {
                n = this.ubY.ukt.height - (int)f6;
            }
            float f7 = ((float)n - f5) / ((float)this.ubY.ukt.height - (float)this.ubY.tQx.getHeight());
            this.ubY.setValue(this.ubY.fy(f7));
        }
        return true;
    }
}

