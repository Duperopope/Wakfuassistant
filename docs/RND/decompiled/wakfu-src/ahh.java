/*
 * Decompiled with CFR 0.152.
 */
public class ahh
extends ahj {
    private static final float cwh = 1.0f;
    private final float cwi = 1.0f;
    private int bUi;
    private final float cwj;
    private float cwk = 0.0f;
    private float cwl = 10.0f;
    private final float cwm = this.cwB.getWorldX();
    private final float cwn = this.cwB.getWorldY();

    public ahh(afW afW2, float f2, float f3) {
        super(afW2);
        this.cwk = f2 - this.cwm;
        this.cwl = f3 - this.cwn;
        this.cwj = 1000.0f;
    }

    @Override
    public void qy(int n) {
        this.bUi += n;
        float f2 = (float)this.bUi * 0.001f;
        if (this.cwB == null || f2 > this.cwj) {
            this.bzQ();
            return;
        }
        float f3 = f2 / this.cwj;
        this.cwB.aB(this.cwm + this.cwk * f3, this.cwn + this.cwl * f3);
    }

    @Override
    public float bzP() {
        return this.cwj;
    }
}

