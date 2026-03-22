/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fyE
 */
class fye_0
implements aao_2 {
    private frx_1 nJs;
    private fes_2 tCV;

    fye_0() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (this.nJs != null && this.tCV != null) {
            this.nJs.b(this.tCV);
        }
        return false;
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }

    public frx_1 getPopup() {
        return this.nJs;
    }

    public void setPopup(frx_1 frx_12) {
        this.nJs = frx_12;
    }

    public fes_2 getWidget() {
        return this.tCV;
    }

    public void setWidget(fes_2 fes_22) {
        this.tCV = fes_22;
    }
}

