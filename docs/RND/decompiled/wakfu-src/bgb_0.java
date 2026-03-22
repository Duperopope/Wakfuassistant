/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bgB
 */
class bgb_0
implements Runnable {
    final /* synthetic */ bgt_0 icE;
    final /* synthetic */ bgy icF;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bgb_0(bgy bgy2, bgt_0 bgt_02) {
        this.icF = bgy2;
        this.icE = bgt_02;
    }

    @Override
    public void run() {
        blh_2 blh_22 = this.icE.dlG();
        blh_22.edG();
        blh_22.dlH();
        if (this.icF.bvY() && this.icE.dpH() != null) {
            this.icE.dpH().eej();
        }
    }
}

