/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bPU
 */
class bpu_2
implements Runnable {
    private final int kTM;
    private int kTN;
    final /* synthetic */ boolean kTO;
    final /* synthetic */ boolean kTP;
    final /* synthetic */ boolean kTQ;
    final /* synthetic */ bpp_2 kTR;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bpu_2(bpp_2 bpp_22, boolean bl, boolean bl2, boolean bl3) {
        this.kTR = bpp_22;
        this.kTO = bl;
        this.kTP = bl2;
        this.kTQ = bl3;
        this.kTM = this.kTO && this.kTP ? 2 : 1;
        this.kTN = 0;
    }

    @Override
    public void run() {
        if (!this.kTQ) {
            return;
        }
        ++this.kTN;
        if (this.kTN == this.kTM) {
            this.kTR.eiW();
        }
    }
}

