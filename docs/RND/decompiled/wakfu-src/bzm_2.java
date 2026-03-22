/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bZM
 */
class bzm_2 {
    acv_0 lEi;
    final asr_2 lEj = new asr_2(asr_2.dak);

    bzm_2() {
    }

    public void start() {
        this.lEj.a(0.9f, 0.87f, 0.8f, 1000);
        this.lEi = new bzn_2(this);
        acq_0.cge.a(this.lEi);
    }

    public void rz(int n) {
        this.lEj.a(1.0f, 1.0f, 1.0f, n);
        abg_2.bUP().a((Runnable)new bzo_2(this), (long)n);
    }
}

