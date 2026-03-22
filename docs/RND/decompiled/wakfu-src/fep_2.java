/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fEP
 */
public class fep_2
implements aao_2 {
    private final fes_2 unQ;
    private long dxy;

    public fep_2(fes_2 fes_22, int n) {
        this.unQ = fes_22;
        this.dxy = abb_2.bUA().a(this, n, 0, 1L);
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }

    public void bhk() {
        abb_2.bUA().hk(this.dxy);
        this.dxy = 0L;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        aba_2 aba_22;
        if (aam_22 instanceof aba_2 && (aba_22 = (aba_2)aam_22).bUx() == this.dxy) {
            if (this.unQ.isElementMapRoot() && this.unQ.getElementMap() != null) {
                fyw_0.gqw().tl(this.unQ.getElementMap().getId());
            } else {
                this.unQ.gAD();
            }
        }
        return false;
    }
}

