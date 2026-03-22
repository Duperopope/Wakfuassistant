/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAg
 */
public class aag_1
extends azz_2 {
    private long[] dwv;

    public aag_1() {
        this(10);
    }

    public aag_1(int n) {
        super(n);
        this.dwv = new long[n];
    }

    @Override
    public boolean vS(int n) {
        int n2 = this.dwq.length;
        if (!super.vS(n)) {
            return false;
        }
        long[] lArray = this.dwv;
        this.dwv = new long[n];
        System.arraycopy(lArray, 0, this.dwv, 0, n2);
        return true;
    }

    public void l(int n, long l) {
        this.bTP();
        int n2 = this.vY(n);
        if (n2 < 0) {
            n2 = -n2 - 1;
        } else {
            ++this.cRf;
            this.dwq[n2] = n;
        }
        this.dwv[n2] = l;
    }

    public long wn(int n) {
        if (this.cRf == 0) {
            return 0L;
        }
        int n2 = this.vX(n);
        if (n2 < 0) {
            return 0L;
        }
        long l = this.dwv[n2];
        this.dwq[n2] = this.dwq[this.cRf - 1];
        this.dwv[n2] = this.dwv[this.cRf - 1];
        --this.cRf;
        return l;
    }

    public long vR(int n) {
        int n2 = this.vX(n);
        if (n2 < 0) {
            return 0L;
        }
        return this.dwv[n2];
    }

    public long wo(int n) {
        return this.dwv[n];
    }

    @Override
    public void bLA() {
        super.bLA();
        long[] lArray = this.dwv;
        this.dwv = new long[this.cRf];
        System.arraycopy(lArray, 0, this.dwv, 0, this.cRf);
    }
}

