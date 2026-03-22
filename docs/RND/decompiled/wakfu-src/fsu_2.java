/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fSu
 */
public class fsu_2
extends fss_2 {
    private final float vei;
    private final float vej;

    public fsu_2(float f2, float f3, fax_1 fax_12, int n, int n2, abn abn2) {
        super(null, null, fax_12, n, n2, abn2);
        this.vei = f2;
        this.vej = f3;
    }

    @Override
    public boolean Ma(int n) {
        if (!super.Ma(n)) {
            return false;
        }
        if (this.tXJ != null) {
            float f2 = this.tXJ.h(this.vei, this.vej, this.bUi, this.bMn);
            ((fax_1)this.getWidget()).setScale(f2);
        }
        return true;
    }

    @Override
    public void cbz() {
        ((fax_1)this.getWidget()).setScale(this.vej);
        super.cbz();
    }

    public String toString() {
        return "[AnimatedElementViewerScaleTween] (" + this.vei + ") -> (" + this.vej + ")";
    }
}

