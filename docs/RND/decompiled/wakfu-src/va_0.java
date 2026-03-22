/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from VA
 */
class va_0
implements Runnable {
    final /* synthetic */ Runnable bIQ;
    final /* synthetic */ long bIR;
    final /* synthetic */ Vy bIS;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    va_0(Vy vy, Runnable runnable, long l) {
        this.bIS = vy;
        this.bIQ = runnable;
        this.bIR = l;
    }

    @Override
    public void run() {
        this.bIQ.run();
        this.bIS.bIO.hc(this.bIR);
    }
}

