/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCP
 */
class fcp_1
implements aao_2 {
    final /* synthetic */ fcj_2 uau;

    fcp_1(fcj_2 fcj_22) {
        this.uau = fcj_22;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        aba_2 aba_22 = (aba_2)aam_22;
        if (aba_22.bUy() == 1) {
            this.uau.setValue(this.uau.getValue() + this.uau.getButtonJump());
        } else if (aba_22.bUy() == 2) {
            this.uau.setValue(this.uau.getValue() - this.uau.getButtonJump());
        }
        this.uau.guj();
        return false;
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }
}

