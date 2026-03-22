/*
 * Decompiled with CFR 0.152.
 */
class eOY
implements pu_0 {
    final /* synthetic */ exf_2 rcy;
    final /* synthetic */ eox_0 rcz;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    eOY(eox_0 eox_02, exf_2 exf_22) {
        this.rcz = eox_02;
        this.rcy = exf_22;
    }

    @Override
    public void a(pr_0 pr_02) {
        if (this.rcz.rav == 100) {
            this.rcy.h((exf_2)pr_02);
        } else {
            this.rcy.a((exf_2)pr_02, this.rcz.rav);
        }
    }
}

