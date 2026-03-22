/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bHa
 */
public class bha_2
extends fil_0 {
    private final long jXc;

    public bha_2(fiq_0 fiq_02) {
        super(fiq_02);
        this.jXc = fiq_02.fVV().pf();
    }

    public void dUJ() {
        this.ij(this.jXc);
    }

    public void bw(short s) {
        if (!this.fZH().pe()) {
            return;
        }
        fij_0 fij_02 = this.fZH().fVV();
        this.ij(fij_02.dnH().nG(s));
    }

    @Override
    public void ij(long l) {
        super.ij(l);
        ffV ffV2 = (ffV)this.fZH();
        ffV2.bYg();
        fse_1.gFu().a((aef_2)((Object)this.fZH()), "ap", "level", "effect", "effectAndCaracteristic", "caracteristic", "criticalEffectDetails");
    }
}

