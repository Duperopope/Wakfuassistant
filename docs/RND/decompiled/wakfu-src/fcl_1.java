/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCL
 */
class fcl_1
implements fis_1 {
    final /* synthetic */ fcj_2 uaq;

    fcl_1(fcj_2 fcj_22) {
        this.uaq = fcj_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (fiq_12.gBE() == this.uaq.uah) {
            this.uaq.uaj.setValue(this.uaq.uaj.getValue() + this.uaq.uag);
        }
        if (fiq_12.gBE() == this.uaq.uai) {
            this.uaq.uaj.setValue(this.uaq.uaj.getValue() - this.uaq.uag);
        }
        return false;
    }
}

