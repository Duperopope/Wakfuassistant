/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAm
 */
public class aam_1
extends aaj_2 {
    private float[] cZB;

    public aam_1() {
        this(10);
    }

    public aam_1(int n) {
        super(n);
        this.cZB = new float[n];
    }

    @Override
    public boolean vS(int n) {
        int n2 = this.dwx.length;
        if (!super.vS(n)) {
            return false;
        }
        float[] fArray = this.cZB;
        this.cZB = new float[n];
        System.arraycopy(fArray, 0, this.cZB, 0, n2);
        return true;
    }

    public void c(long l, float f2) {
        this.bTJ();
        int n = this.gQ(l);
        if (n < 0) {
            n = -n - 1;
        } else {
            ++this.cRf;
            this.dwx[n] = l;
        }
        this.cZB[n] = f2;
    }

    public float gW(long l) {
        if (this.cRf == 0) {
            return 0.0f;
        }
        int n = this.gP(l);
        if (n < 0) {
            return 0.0f;
        }
        return this.ww(n);
    }

    public float ww(int n) {
        float f2 = this.cZB[n];
        this.dwx[n] = this.dwx[this.cRf - 1];
        this.cZB[n] = this.cZB[this.cRf - 1];
        --this.cRf;
        return f2;
    }

    public float gX(long l) {
        int n = this.gP(l);
        if (n < 0) {
            return 0.0f;
        }
        return this.cZB[n];
    }

    public float wj(int n) {
        return this.cZB[n];
    }
}

