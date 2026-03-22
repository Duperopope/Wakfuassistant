/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bdS
 */
class bds_1
implements Runnable {
    final /* synthetic */ bdj_2 hMy;
    final /* synthetic */ bdr_1 hMz;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bds_1(bdr_1 bdr_12, bdj_2 bdj_22) {
        this.hMz = bdr_12;
        this.hMy = bdj_22;
    }

    @Override
    public void run() {
        if (this.hMy.dZ(this.hMz.hMx)) {
            this.hMy.dW(this.hMz.hMx);
            if (this.hMy.bkI().contains("Course") && !this.hMy.bkI().contains("-Fin")) {
                this.hMy.dT(this.hMz.hMx);
                this.hMy.dcQ();
            }
        }
    }
}

