/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cCS
 */
class ccs_2
implements alw_2 {
    final /* synthetic */ String mSj;
    final /* synthetic */ fbt_1 mSk;
    final /* synthetic */ fsh_2 mSl;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ccs_2(String string, fbt_1 fbt_12, fsh_2 fsh_22) {
        this.mSj = string;
        this.mSk = fbt_12;
        this.mSl = fsh_22;
    }

    @Override
    public void eX(String string) {
        if (!string.equals(this.mSj)) {
            return;
        }
        this.mSk.a(new fsx_2(Float.valueOf(0.95f), Float.valueOf(1.0f), this.mSk, 0, 3000, abn.cdr, this.mSk.getImageMesh(), 1));
        fse_2 fse_22 = ccr_2.a(this.mSk, true, 1400);
        fse_22.a(this.mSl);
        this.mSk.a(fse_22);
        fyw_0.gqw().b(this);
    }
}

