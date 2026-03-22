/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAd
 */
public class aad_1
extends azz_2 {
    private float[] cZB;

    public aad_1() {
        this(10);
    }

    public aad_1(int n) {
        super(n);
        this.cZB = new float[n];
    }

    @Override
    public boolean vS(int n) {
        int n2 = this.dwq.length;
        if (!super.vS(n)) {
            return false;
        }
        float[] fArray = this.cZB;
        this.cZB = new float[n];
        System.arraycopy(fArray, 0, this.cZB, 0, n2);
        return true;
    }

    public void c(int n, float f2) {
        this.bTP();
        int n2 = this.vY(n);
        if (n2 < 0) {
            n2 = -n2 - 1;
        } else {
            ++this.cRf;
            this.dwq[n2] = n;
        }
        this.cZB[n2] = f2;
    }

    public float wi(int n) {
        if (this.cRf == 0) {
            return 0.0f;
        }
        int n2 = this.vX(n);
        if (n2 < 0) {
            return 0.0f;
        }
        float f2 = this.cZB[n2];
        this.dwq[n2] = this.dwq[this.cRf - 1];
        this.cZB[n2] = this.cZB[this.cRf - 1];
        --this.cRf;
        return f2;
    }

    public float vH(int n) {
        int n2 = this.vX(n);
        if (n2 < 0) {
            return 0.0f;
        }
        return this.cZB[n2];
    }

    public float wj(int n) {
        return this.cZB[n];
    }

    @Override
    public void bLA() {
        super.bLA();
        float[] fArray = this.cZB;
        this.cZB = new float[this.cRf];
        System.arraycopy(fArray, 0, this.cZB, 0, this.cRf);
    }
}

