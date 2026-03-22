/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXg
 */
class cxg_1
extends fss_2 {
    private final int nUJ;
    private final int nUK;
    private final boolean nULL;

    cxg_1(int n, int n2, fes_2 fes_22, int n3, int n4, abn abn2, boolean bl) {
        super(null, null, fes_22, n3, n4, abn2);
        this.nUJ = n;
        this.nUK = n2;
        this.nULL = bl;
    }

    @Override
    public boolean Ma(int n) {
        if (!super.Ma(n)) {
            return false;
        }
        if (this.tXJ != null) {
            fes_2 fes_22 = this.getWidget();
            int n2 = faa_2.tLR.cf(fes_22.getWidth(), fes_22.getContainer().getWidth());
            int n3 = (int)this.tXJ.h(this.nUJ, this.nUK, this.bUi, this.bMn);
            this.getWidget().setPosition(n2, n3, true);
        }
        return true;
    }

    @Override
    public void cbz() {
        fes_2 fes_22 = (fes_2)this.ved;
        int n = faa_2.tLR.cf(fes_22.getWidth(), fes_22.getContainer().getWidth());
        this.getWidget().setPosition(n, this.nUK, true);
        this.getWidget().setVisible(this.nULL);
        super.cbz();
    }
}

