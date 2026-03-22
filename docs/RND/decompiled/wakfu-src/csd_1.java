/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cSd
 */
class csd_1
implements fis_1 {
    private int nET = 0;
    final /* synthetic */ fey_2 nEU;
    final /* synthetic */ csc_1 nEV;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    csd_1(csc_1 csc_12, fey_2 fey_22) {
        this.nEV = csc_12;
        this.nEU = fey_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (this.nEU.getHeight() == 0) {
            return false;
        }
        if (this.nEV.nER == -1) {
            return false;
        }
        if (this.nET == 0) {
            this.nEU.setY(this.nEV.nER - this.nEU.getHeight());
        } else {
            int n = this.nET - this.nEU.getHeight();
            this.nEU.setY(this.nEU.getY() + n);
        }
        this.nET = this.nEU.getHeight();
        return false;
    }
}

