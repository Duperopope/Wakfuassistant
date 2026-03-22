/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAa
 */
public class aaa_1
extends azz_2 {
    private boolean[] dwr;

    public aaa_1() {
        this(10);
    }

    public aaa_1(int n) {
        super(n);
        this.dwr = new boolean[n];
    }

    @Override
    public boolean vS(int n) {
        int n2 = this.dwq.length;
        if (!super.vS(n)) {
            return false;
        }
        boolean[] blArray = this.dwr;
        this.dwr = new boolean[n];
        System.arraycopy(blArray, 0, this.dwr, 0, n2);
        return true;
    }

    public void k(int n, boolean bl) {
        this.bTP();
        int n2 = this.vY(n);
        if (n2 < 0) {
            n2 = -n2 - 1;
        } else {
            ++this.cRf;
            this.dwq[n2] = n;
        }
        this.dwr[n2] = bl;
    }

    public boolean wb(int n) {
        if (this.cRf == 0) {
            return false;
        }
        int n2 = this.vX(n);
        if (n2 < 0) {
            return false;
        }
        boolean bl = this.dwr[n2];
        this.dwq[n2] = this.dwq[this.cRf - 1];
        this.dwr[n2] = this.dwr[this.cRf - 1];
        --this.cRf;
        return bl;
    }

    public boolean vE(int n) {
        int n2 = this.vX(n);
        if (n2 < 0) {
            return false;
        }
        return this.dwr[n2];
    }

    public boolean wc(int n) {
        return this.dwr[n];
    }

    @Override
    public void bLA() {
        super.bLA();
        boolean[] blArray = this.dwr;
        this.dwr = new boolean[this.cRf];
        System.arraycopy(blArray, 0, this.dwr, 0, this.cRf);
    }
}

