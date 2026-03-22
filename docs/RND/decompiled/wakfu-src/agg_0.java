/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from agG
 */
public class agg_0 {
    private int bUi;
    private float aQI;
    private float aQJ;
    private float aPW;
    private float cut;
    private float awY;

    public void cF(float f2) {
        this.cut = f2;
    }

    public void setSpeed(float f2) {
        this.aPW = f2;
    }

    public void cG(float f2) {
        this.aQJ = this.awY = f2;
        this.aQI = this.awY;
    }

    public float getValue() {
        return this.awY;
    }

    public void aR(float f2) {
        this.aQI = f2;
        this.bUi = 0;
    }

    public void aS(float f2) {
        this.aQJ = f2;
        this.aQI = this.awY;
        this.bUi = 0;
    }

    public float aSK() {
        return this.aQJ;
    }

    public float sj(int n) {
        if (Math.abs(this.aQJ - this.awY) < this.cut) {
            this.cG(this.aQJ);
            return this.aQJ;
        }
        this.bUi += n;
        float f2 = (float)this.bUi * this.aPW / 1000.0f;
        if (f2 > 1.0f) {
            this.awY = this.aQJ;
        } else {
            float f3 = GC.E(f2 * 1.5707964f);
            this.awY = this.aQI + (this.aQJ - this.aQI) * f3;
        }
        return this.awY;
    }
}

