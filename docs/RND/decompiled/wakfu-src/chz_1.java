/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHz
 */
class chz_1
implements fis_1 {
    final /* synthetic */ fey_2 mZL;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    chz_1(fey_2 fey_22) {
        this.mZL = fey_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        faw_2 faw_22 = this.mZL.getContainer();
        int n = GC.a(this.mZL.getX(), 0, faw_22.getWidth() - this.mZL.getWidth());
        int n2 = GC.a(this.mZL.getY(), 0, faw_22.getHeight() - this.mZL.getHeight());
        this.mZL.setPosition(n, n2);
        return false;
    }
}

