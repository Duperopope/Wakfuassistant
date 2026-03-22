/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bSv
 */
class bsv_2
implements Runnable {
    final /* synthetic */ int lgT;
    final /* synthetic */ bsu_2 lgU;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bsv_2(bsu_2 bsu_22, int n) {
        this.lgU = bsu_22;
        this.lgT = n;
    }

    @Override
    public void run() {
        this.lgU.b(aue_0.cVJ().cVK(), this.lgT);
    }
}

