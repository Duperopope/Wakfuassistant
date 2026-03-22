/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fSy
 */
public class fsy_2
extends fss_2 {
    private final float veo;
    private final float vep;

    public fsy_2(float f2, float f3, fbz_2 fbz_22, int n, int n2, abn abn2) {
        super(null, null, fbz_22, n, n2, abn2);
        this.veo = f2;
        this.vep = f3;
    }

    @Override
    public boolean Ma(int n) {
        if (!super.Ma(n)) {
            return false;
        }
        if (this.tXJ != null) {
            float f2 = this.tXJ.h(this.veo, this.vep, this.bUi, this.bMn);
            ((fbz_2)this.getWidget()).setListOffset(f2);
        }
        return true;
    }

    @Override
    public void cbz() {
        ((fbz_2)this.getWidget()).setListOffset(this.vep);
        super.cbz();
    }

    public String toString() {
        return "[ListOffsetTween] (" + this.veo + ") -> (" + this.vep + ")";
    }
}

