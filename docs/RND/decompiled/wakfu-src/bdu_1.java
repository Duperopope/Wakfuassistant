/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bdU
 */
class bdu_1
implements Runnable {
    final /* synthetic */ bdj_2 hMC;
    final /* synthetic */ bdv_1 hMD;
    final /* synthetic */ bdt_1 hME;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bdu_1(bdt_1 bdt_12, bdj_2 bdj_22, bdv_1 bdv_12) {
        this.hME = bdt_12;
        this.hMC = bdj_22;
        this.hMD = bdv_12;
    }

    @Override
    public void run() {
        if (this.hME.dem()) {
            this.hMC.dV(this.hME.hMl);
            this.hMC.dT(this.hME.hMl);
            this.hME.hMl = null;
            this.hMC.dcQ();
        } else {
            bdv_1 bdv_12 = (bdv_1)this.hME.den();
            if (!bdv_12.equals(this.hMD)) {
                bdv_12.p(this.hMC);
            }
        }
    }
}

