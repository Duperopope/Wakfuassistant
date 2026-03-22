/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTI
 */
class cti_1
implements Runnable {
    final /* synthetic */ ctg_1 nKi;

    cti_1(ctg_1 ctg_12) {
        this.nKi = ctg_12;
    }

    @Override
    public void run() {
        if (this.nKi.kqa != null) {
            this.nKi.kqa.setValue(1.0f);
        }
    }
}

