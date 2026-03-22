/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBS
 */
class fbs_2
implements fis_1 {
    final /* synthetic */ fbn_2 tWC;

    fbs_2(fbn_2 fbn_22) {
        this.tWC = fbn_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (this.tWC.tWj && !this.tWC.tVW) {
            this.tWC.setManualInnerMove(!this.tWC.tWi);
        }
        return false;
    }
}

