/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from asQ
 */
public abstract class asq_2 {
    protected float aPY;
    protected float aPZ;
    protected float aQa;
    protected float axp = 1.0f;
    protected float axq = 1.0f;
    protected float axr = 1.0f;
    protected float aQK = 3.0f;
    protected boolean bYX = true;
    protected boolean cSL = true;
    protected int dai = 0;
    private static int bcK = 1;
    private final int daj = asq_2.bte();

    public asq_2() {
        this.aPY = Float.MAX_VALUE;
        this.aPZ = Float.MAX_VALUE;
        this.aQa = Float.MAX_VALUE;
    }

    public final float bKv() {
        return this.aQK;
    }

    public final void cO(float f2) {
        this.aQK = f2;
        this.cSL = true;
    }

    public final float bKw() {
        return this.bYX ? this.axp : 0.0f;
    }

    public final void cP(float f2) {
        this.axp = f2;
        this.cSL = true;
    }

    public final float bKx() {
        return this.bYX ? this.axq : 0.0f;
    }

    public final void cQ(float f2) {
        this.axq = f2;
        this.cSL = true;
    }

    public final float bKy() {
        return this.bYX ? this.axr : 0.0f;
    }

    public final void cR(float f2) {
        this.axr = f2;
        this.cSL = true;
    }

    public void p(float f2, float f3, float f4) {
        if (this.axp == f2 && this.axq == f3 && this.axr == f4) {
            return;
        }
        this.axp = f2;
        this.axq = f3;
        this.axr = f4;
        this.cSL = true;
    }

    public final void q(float f2, float f3, float f4) {
        this.axp += f2;
        this.axq += f3;
        this.axr += f4;
        this.cSL = true;
    }

    public final boolean bKz() {
        return this.bYX;
    }

    public final void cS(boolean bl) {
        if (this.bYX == bl) {
            return;
        }
        this.bYX = bl;
        this.cSL = true;
    }

    public final void bKA() {
        this.cSL = false;
    }

    public final void bKB() {
        this.cSL = true;
    }

    public final float bKC() {
        return this.aPY;
    }

    public final float bKD() {
        return this.aPZ;
    }

    public final float bKE() {
        return this.aQa;
    }

    public final void cS(float f2) {
        this.aPY = f2;
        this.cSL = true;
    }

    public final void cT(float f2) {
        this.aPZ = f2;
        this.cSL = true;
    }

    public final void cU(float f2) {
        this.aQa = f2;
        this.cSL = true;
    }

    public final void r(float f2, float f3, float f4) {
        this.aPY = f2;
        this.aPZ = f3;
        this.aQa = f4;
        this.cSL = true;
    }

    public int d() {
        return this.daj;
    }

    public int bKF() {
        return this.dai;
    }

    public void us(int n) {
        this.dai = n;
    }

    public abstract boolean bzm();

    public abstract void qF(int var1);

    public abstract boolean a(float var1, float var2, float var3, float[] var4);

    static int bte() {
        if (bcK == Integer.MAX_VALUE) {
            bcK = 0;
        }
        return bcK++;
    }
}

