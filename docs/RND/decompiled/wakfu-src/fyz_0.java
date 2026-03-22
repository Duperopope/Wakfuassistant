/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fyz
 */
class fyz_0
implements Runnable {
    final /* synthetic */ String tCJ;
    final /* synthetic */ fyw_0 tCK;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fyz_0(fyw_0 fyw_02, String string) {
        this.tCK = fyw_02;
        this.tCJ = string;
    }

    @Override
    public void run() {
        for (int i = this.tCK.tCB.size() - 1; i >= 0; --i) {
            alw_2 alw_22 = this.tCK.tCB.get(i);
            if (this.tCK.tCC.contains(alw_22)) continue;
            alw_22.eX(this.tCJ);
        }
    }
}

