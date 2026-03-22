/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cSR
 */
class csr_1
implements fjb_1 {
    final /* synthetic */ fhv_1 nHu;
    final /* synthetic */ csp_1 nHv;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    csr_1(csp_1 csp_12, fhv_1 fhv_12) {
        this.nHv = csp_12;
        this.nHu = fhv_12;
    }

    @Override
    public void eOq() {
        das das2 = new das();
        das2.lK(16424);
        das2.cC(true);
        eym eym2 = this.nHv.lPj.etM() && this.nHv.lPi != null ? this.nHv.lPi.dfW() : eym.pid;
        bgx_0 bgx_02 = this.nHv.nGX.get(this.nHv.g(eym2));
        das2.a(bgx_02.isEnabled() ? bgx_02 : this.nHv.nGX.get(this.nHv.b(this.nHv.lPj)));
        fry_1 fry_12 = (fry_1)this.nHu.getElementMap().uH("characterSexRadioGroup");
        byte by = this.nHv.eOJ();
        fry_12.setValue(String.valueOf(by));
        aaw_1.bUq().h(das2);
        this.nHv.nHk.b(this);
    }
}

