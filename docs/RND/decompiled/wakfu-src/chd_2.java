/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHD
 */
class chd_2
implements fis_1 {
    final /* synthetic */ faw_2 nac;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    chd_2(faw_2 faw_22) {
        this.nac = faw_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (((fhv_1)fiq_12.gBE()).n((fhv_1)this.nac)) {
            return false;
        }
        this.nac.setVisible(false);
        chb_2.mZY = null;
        fse_1.gFu().f("selectedBuilding", (Object)null);
        fbj_1.getInstance().b(fzq_0.tJU, this, true);
        return false;
    }
}

