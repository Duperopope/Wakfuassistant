/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from avZ
 */
class avz_2
implements Runnable {
    final /* synthetic */ int djs;
    final /* synthetic */ int djt;
    final /* synthetic */ avy_2 dju;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    avz_2(avy_2 avy_22, int n, int n2) {
        this.dju = avy_22;
        this.djs = n;
        this.djt = n2;
    }

    @Override
    public void run() {
        this.dju.djq.setSize(this.djs, this.djt);
        this.dju.djp.pack();
    }
}

