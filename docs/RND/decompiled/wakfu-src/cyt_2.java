/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYT
 */
class cyt_2
implements alx_2 {
    final /* synthetic */ String nZG;
    final /* synthetic */ bpt_1 nZH;
    final /* synthetic */ cyr_2 nZI;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cyt_2(cyr_2 cyr_22, String string, bpt_1 bpt_12) {
        this.nZI = cyr_22;
        this.nZG = string;
        this.nZH = bpt_12;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (!this.nZG.equals(string)) {
            return;
        }
        if (this.nZI.kSK != null) {
            this.nZI.kSK.f(this.nZH);
        }
        fyw_0.gqw().b(this);
    }
}

