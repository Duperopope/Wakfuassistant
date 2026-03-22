/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cCU
 */
class ccu_2
implements fsh_2 {
    final /* synthetic */ boolean mSr;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ccu_2(boolean bl) {
        this.mSr = bl;
    }

    @Override
    public void onTweenEvent(fsr_2 fsr_22, fsg_2 fsg_22) {
        switch (fsg_22) {
            case veA: {
                fsr_22.b(this);
                if (this.mSr) {
                    abg_2.bUP().a((Runnable)new ccv_2(this), 2500L, 1);
                    break;
                }
                if (cct_2.mSq.size() > 0) {
                    abg_2.bUP().a((Runnable)new ccw_2(this), 2000L, 1);
                    break;
                }
                if (cct_2.mSn != null) {
                    cct_2.mSo.getAppearance().c(cct_2.mSn);
                    cct_2.mSn = null;
                }
                cct_2.mSo = null;
                cct_2.mSp = null;
                fse_1.gFu().f("splashText", (Object)null);
            }
        }
    }
}

