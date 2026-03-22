/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAc
 */
public class aac_1
extends azz_2 {
    private double[] dwt;

    public aac_1() {
        this(10);
    }

    public aac_1(int n) {
        super(n);
        this.dwt = new double[n];
    }

    @Override
    public boolean vS(int n) {
        int n2 = this.dwq.length;
        if (!super.vS(n)) {
            return false;
        }
        double[] dArray = this.dwt;
        this.dwt = new double[n];
        System.arraycopy(dArray, 0, this.dwt, 0, n2);
        return true;
    }

    public void a(int n, double d2) {
        this.bTP();
        int n2 = this.vY(n);
        if (n2 < 0) {
            n2 = -n2 - 1;
        } else {
            ++this.cRf;
            this.dwq[n2] = n;
        }
        this.dwt[n2] = d2;
    }

    public double wf(int n) {
        if (this.cRf == 0) {
            return 0.0;
        }
        int n2 = this.vX(n);
        if (n2 < 0) {
            return 0.0;
        }
        double d2 = this.dwt[n2];
        this.dwq[n2] = this.dwq[this.cRf - 1];
        this.dwt[n2] = this.dwt[this.cRf - 1];
        --this.cRf;
        return d2;
    }

    public double wg(int n) {
        int n2 = this.vX(n);
        if (n2 < 0) {
            return 0.0;
        }
        return this.dwt[n2];
    }

    public double wh(int n) {
        return this.dwt[n];
    }

    @Override
    public void bLA() {
        super.bLA();
        double[] dArray = this.dwt;
        this.dwt = new double[this.cRf];
        System.arraycopy(dArray, 0, this.dwt, 0, this.cRf);
    }
}

