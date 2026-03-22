/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTt
 */
class ctt_1
implements ftl_1 {
    final /* synthetic */ fey_2 nJa;
    final /* synthetic */ int nJb;
    final /* synthetic */ int nJc;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ctt_1(cts_1 cts_12, fey_2 fey_22, int n, int n2) {
        this.nJa = fey_22;
        this.nJb = n;
        this.nJc = n2;
    }

    @Override
    public void epr() {
        this.nJa.setPosition(this.nJb, this.nJc + 10 - this.nJa.getHeight());
        this.nJa.b(this);
    }
}

