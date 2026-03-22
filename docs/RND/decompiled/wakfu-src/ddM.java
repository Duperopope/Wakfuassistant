/*
 * Decompiled with CFR 0.152.
 */
class ddM
implements fis_1 {
    final /* synthetic */ int[] ohd;
    final /* synthetic */ chj_2 ohe;
    final /* synthetic */ String[] ohf;
    final /* synthetic */ String ohg;
    final /* synthetic */ afx_1 ohh;
    final /* synthetic */ afq_2[] ohi;
    final /* synthetic */ int ohj;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ddM(ddL ddL2, int[] nArray, chj_2 chj_22, String[] stringArray, String string, afx_1 afx_12, afq_2[] afq_2Array, int n) {
        this.ohd = nArray;
        this.ohe = chj_22;
        this.ohf = stringArray;
        this.ohg = string;
        this.ohh = afx_12;
        this.ohi = afq_2Array;
        this.ohj = n;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        this.ohd[0] = this.ohd[0] + 1;
        int n = this.ohd[0];
        this.ohe.setBubbleText(this.ohf[n]);
        if (n == this.ohf.length - 1) {
            this.ohe.a(0, (fis_1)this, new ddN(this));
        }
        return false;
    }
}

