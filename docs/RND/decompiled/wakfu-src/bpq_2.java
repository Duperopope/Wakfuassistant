/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bPQ
 */
class bpq_2
implements boo_0 {
    final /* synthetic */ bpp_2 kTI;

    bpq_2(bpp_2 bpp_22) {
        this.kTI = bpp_22;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void IO(int n) {
        Object object = this.kTI.kTk;
        synchronized (object) {
            bpp_2.kSR.info((Object)"Money initialized.");
            this.kTI.IQ(n);
            this.kTI.kTD = 3;
            this.kTI.eiW();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void cXM() {
        bpp_2.kSR.warn((Object)"Erreur \u00e0 la r\u00e9cup\u00e9ration du wallet.");
        Object object = this.kTI.kTk;
        synchronized (object) {
            this.kTI.kTD = 1;
        }
    }
}

