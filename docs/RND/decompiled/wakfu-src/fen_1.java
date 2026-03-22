/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fEn
 */
class fen_1
implements fsh_2 {
    final /* synthetic */ fsz_2 ujP;
    final /* synthetic */ fem_1 ujQ;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fen_1(fem_1 fem_12, fsz_2 fsz_22) {
        this.ujQ = fem_12;
        this.ujP = fsz_22;
    }

    @Override
    public void onTweenEvent(fsr_2 fsr_22, fsg_2 fsg_22) {
        switch (fsg_22) {
            case veA: {
                fhs_2 fhs_22 = this.ujQ.getElementMap();
                fes_2 fes_22 = (fes_2)fhs_22.uH("image");
                if (fes_22 != null) {
                    fes_22.getAppearance().setModulationColor(awx_2.dnF);
                }
                if ((fes_22 = (fes_2)fhs_22.uH("container")) != null) {
                    fes_22.getAppearance().setModulationColor(awx_2.dnF);
                }
                if ((fes_22 = (fes_2)fhs_22.uH("text")) != null) {
                    fes_22.getAppearance().setModulationColor(awx_2.dnF);
                }
                this.ujQ.bmX();
                this.ujP.b(this);
                return;
            }
        }
    }
}

