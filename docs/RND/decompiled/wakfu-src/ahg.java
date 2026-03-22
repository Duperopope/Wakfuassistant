/*
 * Decompiled with CFR 0.152.
 */
public class ahg
extends ahj {
    private acp_1 cvS = new acp_1();
    private acp_1 cvT = new acp_1();
    private acp_1 cvU = new acp_1();
    private acp_1 cvV = new acp_1();
    private float cfb;
    private float cfa;
    private float cvW;
    private float cvX;
    private float cvY;
    private float bqH;
    private float bqF;
    private float bqG;
    private float cvZ;
    private float cwa;
    private float cwb;
    private float cwc;
    private boolean cwd = true;
    private long cwe;
    private long cwf;

    public ahg(afW afW2) {
        super(afW2);
    }

    public void fY(long l) {
        this.cwe = l;
    }

    public acp_1 bzK() {
        return this.cvS;
    }

    public void b(acp_1 acp_12) {
        this.cvS = acp_12;
        this.cwd = true;
    }

    public acp_1 bzL() {
        return this.cvT;
    }

    public void c(acp_1 acp_12) {
        this.cvT = acp_12;
        this.cwd = true;
    }

    public acp_1 bzM() {
        return this.cvU;
    }

    public void d(acp_1 acp_12) {
        this.cvU = acp_12;
        this.cwd = true;
    }

    public acp_1 bzN() {
        return this.cvV;
    }

    public void e(acp_1 acp_12) {
        this.cvV = acp_12;
        this.cwd = true;
    }

    private void bzO() {
        float f2 = 1.0f;
        float f3 = this.cvS.aSc();
        float f4 = this.cvS.aSd();
        float f5 = this.cvS.aSe();
        float f6 = f3 + this.cvT.aSc() * 1.0f;
        float f7 = f4 + this.cvT.aSd() * 1.0f;
        float f8 = f5 + this.cvT.aSe() * 1.0f;
        float f9 = this.cvU.aSc();
        float f10 = this.cvU.aSd();
        float f11 = this.cvU.aSe();
        float f12 = f9 - this.cvV.aSc() * 1.0f;
        float f13 = f10 - this.cvV.aSd() * 1.0f;
        float f14 = f11 - this.cvV.aSe() * 1.0f;
        this.cfb = f9 - 3.0f * f12 + 3.0f * f6 - f3;
        this.cfa = 3.0f * f12 - 6.0f * f6 + 3.0f * f3;
        this.cvW = 3.0f * f6 - 3.0f * f3;
        this.cvX = f3;
        this.cvY = f10 - 3.0f * f13 + 3.0f * f7 - f4;
        this.bqH = 3.0f * f13 - 6.0f * f7 + 3.0f * f4;
        this.bqF = 3.0f * f7 - 3.0f * f4;
        this.bqG = f4;
        this.cvZ = f11 - 3.0f * f14 + 3.0f * f8 - f5;
        this.cwa = 3.0f * f14 - 6.0f * f8 + 3.0f * f5;
        this.cwb = 3.0f * f8 - 3.0f * f5;
        this.cwc = f5;
        this.cwd = false;
    }

    public acp_1 fZ(long l) {
        if (this.cwd) {
            this.bzO();
        }
        assert (l >= 0L) : "Le temps ne doit pas etre inferieur a 0";
        if (l > this.cwe) {
            l = this.cwe;
        }
        float f2 = (float)l / (float)this.cwe;
        float f3 = f2 * f2;
        float f4 = f3 * f2;
        return new acp_1(this.cfb * f4 + this.cfa * f3 + this.cvW * f2 + this.cvX, this.cvY * f4 + this.bqH * f3 + this.bqF * f2 + this.bqG, this.cvZ * f4 + this.cwa * f3 + this.cwb * f2 + this.cwc);
    }

    public long Tz() {
        return this.cwe;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " (duration:" + this.cwe + ") > from=" + String.valueOf(this.cvS) + ", to=" + String.valueOf(this.cvU) + ", initVel=" + String.valueOf(this.cvT) + ", finalVel=" + String.valueOf(this.cvV) + ".";
    }

    @Override
    public float bzP() {
        return this.cwe;
    }

    @Override
    public void qy(int n) {
        this.cwf += (long)n;
        if (this.cwf > this.cwe) {
            this.bzQ();
        }
        if (this.cwB == null) {
            return;
        }
        acp_1 acp_12 = this.fZ(this.cwf);
        this.cwB.e(acp_12.aSc(), acp_12.aSd(), acp_12.aSe());
    }
}

