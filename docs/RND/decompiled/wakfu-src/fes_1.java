/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fES
 */
class fes_1
implements fis_1 {
    final /* synthetic */ fer_2 unZ;

    fes_1(fer_2 fer_22) {
        this.unZ = fer_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        fad_1 fad_12 = (fad_1)fiq_12.gBE();
        int n = this.unZ.nam.indexOf(fad_12);
        if (n >= 0 && n < this.unZ.dpf.size()) {
            axb_2 axb_22 = (axb_2)this.unZ.dpf.get(n);
            flg_2 flg_22 = flg_2.a((flp_2)fiq_12, this.unZ, fzq_0.tJB, axb_22);
            this.unZ.h(flg_22);
            fiq_12.oZ(flg_22.gBF());
        }
        return false;
    }
}

