/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTa
 */
class cta_1
implements alx_2 {
    final /* synthetic */ String nHZ;
    final /* synthetic */ int nIa;
    final /* synthetic */ csz_1 nIb;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cta_1(csz_1 csz_12, String string, int n) {
        this.nIb = csz_12;
        this.nHZ = string;
        this.nIa = n;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (this.nHZ.equals(string)) {
            this.nIb.Mw(this.nIa);
            fyw_0.gqw().b(this);
        }
    }
}

