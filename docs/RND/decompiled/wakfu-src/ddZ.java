/*
 * Decompiled with CFR 0.152.
 */
class ddZ
implements alw_2 {
    private final dde_0 ojM;
    final /* synthetic */ afx_1 ojN;
    final /* synthetic */ String ojO;
    final /* synthetic */ afq_2[] ojP;
    final /* synthetic */ String ojQ;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ddZ(ddY ddY2, afx_1 afx_12, String string, afq_2[] afq_2Array, String string2) {
        this.ojN = afx_12;
        this.ojO = string;
        this.ojP = afq_2Array;
        this.ojQ = string2;
        this.ojM = new dde_0(this.ojN, this.ojO, this.ojP);
    }

    @Override
    public void eX(String string) {
        if (string.equals(this.ojQ)) {
            this.ojM.fcu();
            ddi.fcw().rm(this.ojQ);
        }
    }
}

