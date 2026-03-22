/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXd
 */
class cxd_1
implements fsh_2 {
    final /* synthetic */ faw_2 nUF;
    final /* synthetic */ fsr_2 nUG;
    final /* synthetic */ cwz_1 nUH;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cxd_1(cwz_1 cwz_12, faw_2 faw_22, fsr_2 fsr_22) {
        this.nUH = cwz_12;
        this.nUF = faw_22;
        this.nUG = fsr_22;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void onTweenEvent(fsr_2 fsr_22, fsg_2 fsg_22) {
        switch (fsg_22) {
            case veA: {
                cwz_1 cwz_12 = cwz_1.nUn;
                synchronized (cwz_12) {
                    this.nUH.nUt = false;
                    this.nUF.setY(-200);
                    this.nUF.setVisible(false);
                    this.nUH.nUp.removeLast();
                    this.nUH.eWx();
                    if (!this.nUH.nUo.isEmpty()) {
                        biv_1 biv_12 = this.nUH.nUo.poll();
                        this.nUH.b(biv_12);
                    }
                    this.nUH.eWz();
                    if (this.nUH.eWA()) {
                        this.nUH.eWy();
                    }
                    this.nUG.b(this);
                    break;
                }
            }
        }
    }
}

