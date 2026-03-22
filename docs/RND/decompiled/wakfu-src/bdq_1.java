/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bdQ
 */
class bdq_1
implements Runnable {
    final /* synthetic */ bdj_2 hMu;
    final /* synthetic */ bdr_1 hMv;
    final /* synthetic */ bdp_1 hMw;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bdq_1(bdp_1 bdp_12, bdj_2 bdj_22, bdr_1 bdr_12) {
        this.hMw = bdp_12;
        this.hMu = bdj_22;
        this.hMv = bdr_12;
    }

    @Override
    public void run() {
        if (this.hMw.dem()) {
            this.hMu.dW(this.hMw.hMl);
            if (this.hMu.bkI().contains("Course") && !this.hMu.bkI().contains("-Fin")) {
                this.hMu.dT(this.hMw.hMl);
                this.hMu.dcQ();
            }
            this.hMw.hMl = null;
        } else {
            bdr_1 bdr_12 = (bdr_1)this.hMw.den();
            if (!bdr_12.equals(this.hMv)) {
                bdr_12.p(this.hMu);
            }
        }
    }
}

