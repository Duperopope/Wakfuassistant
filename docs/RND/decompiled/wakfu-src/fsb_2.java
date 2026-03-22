/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fSB
 */
public class fsb_2
extends fss_2 {
    private final int vet;
    private final int veu;
    private final int vev;
    private final int vew;

    public fsb_2(int n, int n2, fes_2 fes_22, int n3, int n4, abn abn2) {
        this(fes_22.getX(), fes_22.getY(), fes_22.getX() + n, fes_22.getY() + n2, fes_22, n3, n4, abn2);
    }

    public fsb_2(int n, int n2, int n3, int n4, fes_2 fes_22, int n5, int n6, abn abn2) {
        super(null, null, fes_22, n5, n6, abn2);
        this.vet = n;
        this.veu = n2;
        this.vev = n3;
        this.vew = n4;
    }

    @Override
    public boolean Ma(int n) {
        if (!super.Ma(n)) {
            return false;
        }
        if (this.tXJ != null) {
            int n2 = (int)this.tXJ.h(this.vet, this.vev, this.bUi, this.bMn);
            int n3 = (int)this.tXJ.h(this.veu, this.vew, this.bUi, this.bMn);
            this.getWidget().setPosition(n2, n3, true);
        }
        return true;
    }

    @Override
    public void cbz() {
        this.getWidget().setPosition(this.vev, this.vew, true);
        super.cbz();
    }

    public String toString() {
        return "[PositionTween] (" + this.vet + ", " + this.veu + ") -> (" + this.vev + ", " + this.vew + ")";
    }
}

