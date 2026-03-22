/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from agT
 */
public class agt_0
extends asq_2 {
    protected afW cfP;

    public agt_0(afW afW2) {
        this.cfP = afW2;
    }

    public void a(afW afW2) {
        this.cfP = afW2;
    }

    public afW btr() {
        return this.cfP;
    }

    @Override
    public boolean bzm() {
        if (this.cSL) {
            return true;
        }
        if (this.cfP != null) {
            if (Math.abs(this.aPY - this.cfP.getWorldX()) > 0.01f) {
                this.cSL = true;
            } else if (Math.abs(this.aPZ - this.cfP.getWorldY()) > 0.01f) {
                this.cSL = true;
            } else if (Math.abs(this.aQa - this.cfP.getAltitude()) > 0.01f) {
                this.cSL = true;
            }
        }
        return this.cSL;
    }

    @Override
    public void qF(int n) {
        if (this.cfP != null) {
            this.aPY = this.cfP.getWorldX();
            this.aPZ = this.cfP.getWorldY();
            this.aQa = this.cfP.getAltitude();
        }
    }

    @Override
    public boolean a(float f2, float f3, float f4, float[] fArray) {
        float f5;
        float f6;
        if (!this.bYX) {
            return false;
        }
        float f7 = this.bKC() - f2;
        float f8 = f7 * f7 + (f6 = this.bKD() - f3) * f6 + (f5 = this.bKE() - f4) * f5;
        if (f8 > this.aQK * this.aQK) {
            return false;
        }
        float f9 = GC.J(f8);
        float f10 = 0.5f * (1.0f + GC.H((float)Math.PI * f9 / this.aQK));
        if (f10 <= 0.0f) {
            return false;
        }
        fArray[0] = f10 * this.axp;
        fArray[1] = f10 * this.axq;
        fArray[2] = f10 * this.axr;
        return true;
    }
}

