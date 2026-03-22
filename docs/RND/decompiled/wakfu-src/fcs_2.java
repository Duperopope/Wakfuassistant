/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCS
 */
class fcs_2
implements fis_1 {
    final /* synthetic */ fcq_2 ubj;

    fcs_2(fcq_2 fcq_22) {
        this.ubj = fcq_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        flw_2 flw_22 = (flw_2)fiq_12;
        double d2 = flw_22.getValue();
        this.ubj.ag(d2);
        return false;
    }
}

