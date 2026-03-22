/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cWm
 */
class cwm_2
implements ffd_2 {
    final /* synthetic */ fhv_1 nSx;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cwm_2(cwl_1 cwl_12, fhv_1 fhv_12) {
        this.nSx = fhv_12;
    }

    @Override
    public void onChildrenAdded() {
        fes_2 fes_22 = (fes_2)fyw_0.gqw().gqC().uR("marketDialog.createOfferView").uH("offerUnitPriceTE");
        if (fes_22 != null) {
            fes_22.setFocused(true);
        }
        this.nSx.b(this);
    }
}

