/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDQ
 */
class fdq_2
implements fis_1 {
    final /* synthetic */ String uix;
    final /* synthetic */ fad_1 uiy;
    final /* synthetic */ String uiz;
    final /* synthetic */ fdp_1 uiA;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fdq_2(fdp_1 fdp_12, String string, fad_1 fad_12, String string2) {
        this.uiA = fdp_12;
        this.uix = string;
        this.uiy = fad_12;
        this.uiz = string2;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        this.uiA.uit.setText(this.uix);
        this.uiA.uis.b(this.uiy);
        if (this.uiz != null) {
            abg_2.bUP().a((Runnable)new fdr_1(this), 1L, 1);
        }
        return false;
    }
}

