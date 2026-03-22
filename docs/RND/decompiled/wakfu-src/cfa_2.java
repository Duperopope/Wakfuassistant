/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFA
 */
class cfa_2
implements fsh_2 {
    final /* synthetic */ fdd_2 mWy;
    final /* synthetic */ fsr_2 mWz;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cfa_2(fdd_2 fdd_22, fsr_2 fsr_22) {
        this.mWy = fdd_22;
        this.mWz = fsr_22;
    }

    @Override
    public void onTweenEvent(fsr_2 fsr_22, fsg_2 fsg_22) {
        switch (fsg_22) {
            case veA: {
                cfz_2.mWx = false;
                this.mWy.setSelected(false);
                this.mWz.b(this);
            }
        }
    }
}

