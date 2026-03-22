/*
 * Decompiled with CFR 0.152.
 */
class cBb
implements Runnable {
    final /* synthetic */ ahd_2 mts;
    final /* synthetic */ float mtt;
    final /* synthetic */ int mtu;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cBb(cAY cAY2, ahd_2 ahd_22, float f2, int n) {
        this.mts = ahd_22;
        this.mtt = f2;
        this.mtu = n;
    }

    @Override
    public void run() {
        this.mts.br(this.mtt, this.mtu);
    }
}

