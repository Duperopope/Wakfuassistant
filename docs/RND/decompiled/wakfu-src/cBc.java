/*
 * Decompiled with CFR 0.152.
 */
class cBc
implements Runnable {
    final /* synthetic */ ahd_2 mtv;
    final /* synthetic */ float mtw;
    final /* synthetic */ int mtx;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cBc(cAY cAY2, ahd_2 ahd_22, float f2, int n) {
        this.mtv = ahd_22;
        this.mtw = f2;
        this.mtx = n;
    }

    @Override
    public void run() {
        this.mtv.br(this.mtw, this.mtx);
    }
}

