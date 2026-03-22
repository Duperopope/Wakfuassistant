/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXc
 */
class cxc_1
implements fsh_2 {
    final /* synthetic */ fsr_2 nUD;
    final /* synthetic */ cwz_1 nUE;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cxc_1(cwz_1 cwz_12, fsr_2 fsr_22) {
        this.nUE = cwz_12;
        this.nUD = fsr_22;
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
                    this.nUE.nUt = false;
                    if (this.nUE.nUu) {
                        this.nUE.run();
                    } else if (!this.nUE.nUo.isEmpty() && this.nUE.eWB() < 9) {
                        this.nUE.b(this.nUE.nUo.poll());
                    }
                    this.nUD.b(this);
                    break;
                }
            }
        }
    }
}

