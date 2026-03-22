/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from cSQ
 */
class csq_2
implements alw_2 {
    final /* synthetic */ fhv_1 nHs;
    final /* synthetic */ csp_1 nHt;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    csq_2(csp_1 csp_12, fhv_1 fhv_12) {
        this.nHt = csp_12;
        this.nHs = fhv_12;
    }

    @Override
    public void eX(String string) {
        if (!string.equals("characterCreationDialog")) {
            return;
        }
        fyw_0.gqw().b(this);
        Optional.ofNullable(this.nHs.getTweensOfType(fse_2.class).getFirst()).ifPresentOrElse(fse_22 -> fse_22.a((fsr_2 fsr_22, fsg_2 fsg_22) -> {
            if (fsg_22 == fsg_2.veA) {
                (this.nHt.eOJ() == 0 ? this.nHt.nHn : this.nHt.nHm).setModulationColor(awx_2.dnC);
                (this.nHt.eOJ() == 0 ? this.nHt.nHn : this.nHt.nHm).setVisible(true);
            }
        }), () -> (this.nHt.eOJ() == 0 ? this.nHt.nHn : this.nHt.nHm).setVisible(true));
    }
}

