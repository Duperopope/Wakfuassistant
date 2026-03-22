/*
 * Decompiled with CFR 0.152.
 */
public class abz
extends abt_0 {
    private float bdy = 5.0f;
    private float aPH = 0.025f;
    private float bdz = 1500.0f;
    private int bUi;

    public final void btc() {
        this.bUi = 0;
        aca aca2 = new aca(1.0f);
        this.a(aca2);
    }

    @Override
    public void qF(int n) {
        super.qF(n);
        this.bUi += n;
        float f2 = this.bdy * this.bnY();
        float f3 = (float)this.bUi / this.bdz * 1.5707964f;
        float f4 = GC.G(f3);
        float f5 = !this.bsZ() ? 0.0f : f4;
        float f6 = !this.bta() ? 0.0f : f4;
        this.bUu.aQ(f2 * f5, f2 * f6);
        this.bUu.cD(this.bnY() * this.aPH * (GC.G(0.7f * f3) - 0.5f));
    }

    public void i(float f2, float f3, float f4) {
        this.bdz = f2;
        this.bdy = f3;
        this.aPH = f4;
    }
}

