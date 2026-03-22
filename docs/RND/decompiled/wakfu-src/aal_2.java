/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAl
 */
public class aal_2
extends aaj_2 {
    private double[] dwt;

    public aal_2() {
        this(10);
    }

    public aal_2(int n) {
        super(n);
        this.dwt = new double[n];
    }

    @Override
    public boolean vS(int n) {
        int n2 = this.dwx.length;
        if (!super.vS(n)) {
            return false;
        }
        double[] dArray = this.dwt;
        this.dwt = new double[n];
        System.arraycopy(dArray, 0, this.dwt, 0, n2);
        return true;
    }

    public void a(long l, double d2) {
        this.bTJ();
        int n = this.gQ(l);
        if (n < 0) {
            n = -n - 1;
        } else {
            ++this.cRf;
            this.dwx[n] = l;
        }
        this.dwt[n] = d2;
    }

    public double gU(long l) {
        if (this.cRf == 0) {
            return 0.0;
        }
        int n = this.gP(l);
        if (n < 0) {
            return 0.0;
        }
        return this.wv(n);
    }

    public double wv(int n) {
        double d2 = this.dwt[n];
        this.dwx[n] = this.dwx[this.cRf - 1];
        this.dwt[n] = this.dwt[this.cRf - 1];
        --this.cRf;
        return d2;
    }

    public double gV(long l) {
        int n = this.gP(l);
        if (n < 0) {
            return 0.0;
        }
        return this.dwt[n];
    }

    public double wh(int n) {
        return this.dwt[n];
    }
}

