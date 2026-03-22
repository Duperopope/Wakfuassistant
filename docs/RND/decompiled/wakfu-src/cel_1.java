/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEL
 */
class cel_1
implements Runnable {
    final /* synthetic */ boolean mVh;
    final /* synthetic */ int mVi;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cel_1(boolean bl, int n) {
        this.mVh = bl;
        this.mVi = n;
    }

    @Override
    public void run() {
        cek_2.doFadeAll(this.mVh, this.mVi);
        cek_2.mVg = null;
    }
}

