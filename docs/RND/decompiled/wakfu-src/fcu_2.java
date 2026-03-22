/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCU
 */
class fcu_2
implements fis_1 {
    final /* synthetic */ fcq_2 ubl;

    fcu_2(fcq_2 fcq_22) {
        this.ubl = fcq_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        flp_2 flp_22 = (flp_2)fiq_12;
        if (this.ubl.uaB) {
            this.ubl.uax.setValue(this.ubl.uax.getValue() - this.ubl.uax.getButtonJump() * (float)flp_22.gEo());
        } else if (this.ubl.uaC) {
            this.ubl.uay.setValue(this.ubl.uay.getValue() + this.ubl.uay.getButtonJump() * (float)flp_22.gEo());
        }
        return true;
    }
}

