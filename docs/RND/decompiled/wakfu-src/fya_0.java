/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fyA
 */
class fya_0
implements alx_2 {
    final /* synthetic */ fes_2 tCL;
    final /* synthetic */ fch_1 tCM;
    final /* synthetic */ String tCN;
    final /* synthetic */ String tCO;
    final /* synthetic */ fyw_0 tCP;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fya_0(fyw_0 fyw_02, fes_2 fes_22, fch_1 fch_12, String string, String string2) {
        this.tCP = fyw_02;
        this.tCL = fes_22;
        this.tCM = fch_12;
        this.tCN = string;
        this.tCO = string2;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (this.tCL.getElementMap() != null && string.equals(this.tCL.getElementMap().getId())) {
            this.tCM.getWindowManager().f(this.tCL, this.tCN);
            if (this.tCO != null) {
                this.tCM.getWindowManager().h(this.tCL, this.tCN);
            }
            this.tCP.b(this);
        }
    }
}

