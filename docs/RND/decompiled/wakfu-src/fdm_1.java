/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDm
 */
class fdm_1
implements fis_1 {
    final /* synthetic */ fdh_1 udK;

    fdm_1(fdh_1 fdh_12) {
        this.udK = fdh_12;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        int n = this.udK.ude;
        this.udK.ude = Math.max(0, this.udK.ude - 1);
        if (this.udK.ude != n) {
            this.udK.dGB = true;
            this.udK.setNeedsToPreProcess();
        }
        return false;
    }
}

