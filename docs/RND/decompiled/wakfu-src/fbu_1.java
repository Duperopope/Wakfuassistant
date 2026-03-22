/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBU
 */
public class fbu_1
extends fss_2<Boolean> {
    private final float tWI;
    private final float tWJ;
    private final float tWK;
    private final float tWL;
    private float tWM;
    private float tWN;
    final /* synthetic */ fbn_2 tWO;

    public fbu_1(fbn_2 fbn_22, float f2, float f3, float f4, float f5, fes_2 fes_22, int n, int n2, abn abn2) {
        this.tWO = fbn_22;
        super(true, false, fes_22, n, n2, abn2);
        this.tWI = f2;
        this.tWK = f4;
        this.tWJ = f3;
        this.tWL = f5;
        int n3 = -(fbn_22.tWg - fbn_22.uki.getContentWidth());
        this.tWM = (float)fbn_22.dhZ / (float)(n3 == 0 ? 1 : n3);
        int n4 = fbn_22.tWh - fbn_22.uki.getContentHeight();
        this.tWN = (float)fbn_22.dia / (float)(n4 == 0 ? 1 : n4);
    }

    @Override
    public boolean Ma(int n) {
        super.Ma(n);
        if (this.tXJ != null) {
            boolean bl = (Boolean)this.veb;
            if (!bl) {
                this.tWM = this.tWI;
                this.tWN = this.tWK;
            }
            float f2 = bl ? this.tWM : this.tWJ;
            float f3 = bl ? this.tWJ : this.tWM;
            float f4 = bl ? this.tWN : this.tWL;
            float f5 = bl ? this.tWL : this.tWN;
            float f6 = this.tXJ.h(f2, f3, this.bUi, this.bMn);
            float f7 = this.tXJ.h(f4, f5, this.bUi, this.bMn);
            this.tWO.setDeltaX((int)((float)(-(this.tWO.tWg - this.tWO.uki.getContentWidth())) * f6));
            this.tWO.setDeltaY((int)((float)(this.tWO.tWh - this.tWO.uki.getContentHeight()) * f7));
        }
        return true;
    }

    @Override
    public void cbz() {
        super.cbz();
        this.tWO.tWp = null;
    }
}

