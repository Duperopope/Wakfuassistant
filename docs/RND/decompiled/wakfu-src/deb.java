/*
 * Decompiled with CFR 0.152.
 */
class deb
implements alx_2 {
    private final dde_0 ojR;
    final /* synthetic */ afx_1 ojS;
    final /* synthetic */ String ojT;
    final /* synthetic */ afq_2[] ojU;
    final /* synthetic */ String ojV;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    deb(dea dea2, afx_1 afx_12, String string, afq_2[] afq_2Array, String string2) {
        this.ojS = afx_12;
        this.ojT = string;
        this.ojU = afq_2Array;
        this.ojV = string2;
        this.ojR = new dde_0(this.ojS, this.ojT, this.ojU);
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals(this.ojV)) {
            this.ojR.fcu();
            ddi.fcw().rl(this.ojV);
        }
    }
}

