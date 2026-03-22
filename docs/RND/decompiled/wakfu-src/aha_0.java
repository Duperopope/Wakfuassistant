/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ahA
 */
class aha_0
implements Runnable {
    final /* synthetic */ boolean cyb;
    final /* synthetic */ ahv cyc;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aha_0(ahv ahv2, boolean bl) {
        this.cyc = ahv2;
        this.cyb = bl;
    }

    @Override
    public void run() {
        this.cyc.cs(this.cyb);
    }
}

