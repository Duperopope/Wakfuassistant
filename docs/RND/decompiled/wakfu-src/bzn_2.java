/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bZN
 */
class bzn_2
implements acv_0 {
    private final asr_2 lEk;
    final /* synthetic */ bzm_2 lEl;

    bzn_2(bzm_2 bzm_22) {
        this.lEl = bzm_22;
        this.lEk = this.lEl.lEj;
    }

    @Override
    public void qF(int n) {
        this.lEk.qF(n);
    }

    @Override
    public int bpb() {
        return 0;
    }

    @Override
    public boolean bpa() {
        return false;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        fArray[0] = fArray[0] * this.lEk.aIU();
        fArray[1] = fArray[1] * this.lEk.aIV();
        fArray[2] = fArray[2] * this.lEk.aIW();
    }
}

