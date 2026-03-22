/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBI
 */
class fbi_2
implements fis_1 {
    final /* synthetic */ fbh_2 tVj;

    fbi_2(fbh_2 fbh_22) {
        this.tVj = fbh_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (fiq_12.gBE() == fbj_1.getInstance()) {
            this.tVj.tSy = true;
            this.tVj.setNeedsToPreProcess();
        }
        return false;
    }
}

