/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class aJx
extends agt_0 {
    protected static final Logger ebi = Logger.getLogger(aJx.class);
    private float ebj;
    private float ebk;
    private float ebl;
    private float ebm;
    private float ebn;

    public aJx(afW afW2) {
        super(afW2);
        this.p(-0.4f, -0.4f, -0.4f);
    }

    @Override
    public void p(float f2, float f3, float f4) {
        super.p(f2, f3, f4);
        this.ebl = f2;
        this.ebm = f3;
        this.ebn = f4;
    }

    @Override
    public boolean a(float f2, float f3, float f4, float[] fArray) {
        if (!aJy.chI().chH()) {
            return false;
        }
        float f5 = f2 - this.aPY;
        float f6 = f3 - this.aPZ;
        float f7 = aco_1.bn(f5, f6);
        if (f7 > this.aQK * this.aQK) {
            return false;
        }
        float f8 = GC.J(f7);
        float f9 = aJy.chI().chG();
        float f10 = f9 - this.ebj / 2.0f;
        float f11 = f9 + this.ebj / 2.0f;
        float f12 = f5 / f8;
        float f13 = f6 / f8;
        float f14 = (float)Math.acos(f12);
        float f15 = (float)Math.asin(f13);
        if (f15 > 0.0f) {
            f14 *= -1.0f;
        }
        if ((double)f14 > -Math.PI && f14 < 0.0f) {
            f14 = (float)((double)f14 + Math.PI * 2);
        }
        if (f14 >= f10 && f14 <= f11) {
            float f16 = Math.abs(f14 - f9);
            float f17 = (1.0f - f16 / this.ebj) * (1.0f - f8 / (this.aQK + 1.0f));
            fArray[0] = f17 * this.axp;
            fArray[1] = f17 * this.axq;
            fArray[2] = f17 * this.axr;
        }
        return true;
    }

    @Override
    public boolean bzm() {
        return super.bzm() || aJy.chI().chH() && aJy.chI().chF() != this.ebk;
    }

    @Override
    public void qF(int n) {
        super.qF(n);
        this.ebk = aJy.chI().chF();
        this.axp = this.ebl * this.ebk;
        this.axq = this.ebm * this.ebk;
        this.axr = this.ebn * this.ebk;
    }

    public void em(float f2) {
        this.ebj = f2;
    }
}

