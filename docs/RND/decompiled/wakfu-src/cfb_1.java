/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFb
 */
class cfb_1
implements fis_1 {
    final /* synthetic */ fes_2 mVu;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cfb_1(fes_2 fes_22) {
        this.mVu = fes_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        fse_1.gFu().f("describedState", (Object)null);
        this.mVu.b(fzq_0.tJY, this, true);
        return false;
    }
}

