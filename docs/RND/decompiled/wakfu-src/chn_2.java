/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHN
 */
class chn_2
implements fis_1 {
    final /* synthetic */ chm_2 nbm;

    chn_2(chm_2 chm_22) {
        this.nbm = chm_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        Object t = fiq_12.gBE();
        int n = this.nbm.naY.indexOf(t);
        if (n != -1) {
            fbv_2 fbv_22 = this.nbm.naY.get(n);
            int n2 = this.nbm.nbf[n] - 1;
            fyd_0.popup(this.nbm.naR, fbv_22);
        }
        return false;
    }
}

