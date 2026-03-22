/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDl
 */
class fdl_2
implements fis_1 {
    final /* synthetic */ fdh_1 udJ;

    fdl_2(fdh_1 fdh_12) {
        this.udJ = fdh_12;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (this.udJ.isEnabledFull()) {
            int n = this.udJ.ude;
            this.udJ.ude = Math.min(this.udJ.ucO.size() - 1, this.udJ.ude + 1);
            if (this.udJ.ude != n) {
                this.udJ.dGB = true;
                this.udJ.setNeedsToPreProcess();
            }
        }
        return false;
    }
}

