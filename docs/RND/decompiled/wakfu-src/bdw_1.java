/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bdW
 */
class bdw_1
implements Runnable {
    final /* synthetic */ bdj_2 hMG;
    final /* synthetic */ bdv_1 hMH;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bdw_1(bdv_1 bdv_12, bdj_2 bdj_22) {
        this.hMH = bdv_12;
        this.hMG = bdj_22;
    }

    @Override
    public void run() {
        if (this.hMG.dZ(this.hMH.hMF)) {
            this.hMG.dV(this.hMH.hMF);
            this.hMG.dT(this.hMH.hMF);
            this.hMG.dcQ();
        }
    }
}

