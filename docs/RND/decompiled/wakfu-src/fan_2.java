/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAN
 */
class fan_2
implements fis_1 {
    final /* synthetic */ fap_2 tPT;
    final /* synthetic */ fak_2 tPU;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fan_2(fak_2 fak_22, fap_2 fap_22) {
        this.tPU = fak_22;
        this.tPT = fap_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        this.tPU.setSelectedDate(this.tPU.bjS.indexOf(this.tPT) + 1);
        return false;
    }
}

