/*
 * Decompiled with CFR 0.152.
 */
class acY
implements asp_2 {
    private final long cid = System.currentTimeMillis();
    private boolean cie = false;
    final /* synthetic */ aaj_0 cif;
    final /* synthetic */ int cig;
    final /* synthetic */ acV cih;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    acY(acV acV2, aaj_0 aaj_02, int n) {
        this.cih = acV2;
        this.cif = aaj_02;
        this.cig = n;
    }

    @Override
    public boolean isValid() {
        if (!this.cif.bqY()) {
            if (!this.cie && System.currentTimeMillis() - this.cid < (long)this.cig) {
                this.cie = true;
            }
            return false;
        }
        asj_2.bJt().b(this);
        this.cih.chY = null;
        return true;
    }
}

