/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cSY
 */
class csy_2
implements fis_1 {
    private boolean nHL = true;
    final /* synthetic */ fey_2 nHM;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    csy_2(fey_2 fey_22) {
        this.nHM = fey_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (this.nHL) {
            this.nHL = false;
            return true;
        }
        fhs_2 fhs_22 = ((fhv_1)fiq_12.gBE()).getElementMap();
        if (fhs_22 != null && "characterSheetDialog".equals(fhs_22.getId())) {
            boolean bl = fse_1.gFu().dp("displayAllCharacteristics");
            if (bl) {
                this.nHM.setY(this.nHM.getY() - 400);
            } else {
                this.nHM.setY(this.nHM.getY() + 400);
            }
        }
        return true;
    }
}

