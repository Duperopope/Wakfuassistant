/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aaI
 */
public class aai_0 {
    public float axp = 1.0f;
    public float axq = 1.0f;
    public float axr = 1.0f;
    public float ayP = 1.0f;
    private float caK = 0.0f;
    private float caL = 0.0f;
    private float caM = 0.0f;
    private float caN = 0.0f;
    private float caG = 0.0f;
    private float caH = 0.0f;
    private float caI = 0.0f;
    private float caJ = 0.0f;
    private float caU;
    private float caV;

    aai_0() {
    }

    void a(float f2, float f3, float f4, float f5, float f6) {
        this.caG = f2;
        this.caH = f3;
        this.caI = f4;
        this.caJ = f5;
        this.caK = this.axp;
        this.caL = this.axq;
        this.caM = this.axr;
        this.caN = this.ayP;
        this.caV = this.caU = f6;
    }

    public boolean rl(int n) {
        if (this.caU < 0.0f) {
            if (this.caU == Float.NEGATIVE_INFINITY) {
                return false;
            }
            this.axp = this.caK = this.caG;
            this.axq = this.caL = this.caH;
            this.axr = this.caM = this.caI;
            this.ayP = this.caN = this.caJ;
            this.caU = Float.NEGATIVE_INFINITY;
            return this.axp == 1.0f && this.axq == 1.0f && this.axr == 1.0f && this.ayP == 1.0f;
        }
        this.caU -= (float)n;
        float f2 = 1.0f - this.caU / this.caV;
        this.axp = this.caK + (this.caG - this.caK) * f2;
        this.axq = this.caL + (this.caH - this.caL) * f2;
        this.axr = this.caM + (this.caI - this.caM) * f2;
        this.ayP = this.caN + (this.caJ - this.caN) * f2;
        return false;
    }
}

