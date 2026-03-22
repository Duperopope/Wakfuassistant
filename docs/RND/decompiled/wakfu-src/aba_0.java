/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from abA
 */
public class aba_0
extends abt_0 {
    private float bdy = 0.5f;
    private float bdz = 77.0f;
    private int bUi;

    @Override
    public void qF(int n) {
        super.qF(n);
        this.bUi += n;
        float f2 = this.bnY() * this.bdy;
        float f3 = (float)this.bUi / this.bdz * 1.5707964f;
        float f4 = !this.bsZ() ? 0.0f : Math.abs(GC.H(f3)) - 1.0f;
        float f5 = !this.bta() ? 0.0f : -Math.abs(GC.G(f3));
        this.bUu.aQ(f2 * f4, f2 * f5);
    }

    public final void btd() {
        this.bUi = 0;
        aca aca2 = new aca(1.0f);
        this.a(aca2);
    }

    public final void aF(float f2, float f3) {
        this.bdz = f2;
        this.bdy = f3;
    }
}

