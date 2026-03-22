/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAe
 */
public class aae_1
extends azz_2 {
    private int[] dwu;

    public aae_1() {
        this(10);
    }

    public aae_1(int n) {
        super(n);
        this.dwu = new int[n];
    }

    @Override
    public boolean vS(int n) {
        int n2 = this.dwq.length;
        if (!super.vS(n)) {
            return false;
        }
        int[] nArray = this.dwu;
        this.dwu = new int[n];
        System.arraycopy(nArray, 0, this.dwu, 0, n2);
        return true;
    }

    public void cA(int n, int n2) {
        this.bTP();
        int n3 = this.vY(n);
        if (n3 < 0) {
            n3 = -n3 - 1;
        } else {
            ++this.cRf;
            this.dwq[n3] = n;
        }
        this.dwu[n3] = n2;
    }

    public int wk(int n) {
        if (this.cRf == 0) {
            return 0;
        }
        int n2 = this.vX(n);
        if (n2 < 0) {
            return 0;
        }
        int n3 = this.dwu[n2];
        this.dwq[n2] = this.dwq[this.cRf - 1];
        this.dwu[n2] = this.dwu[this.cRf - 1];
        --this.cRf;
        return n3;
    }

    public int pF(int n) {
        int n2 = this.vX(n);
        if (n2 < 0) {
            return 0;
        }
        return this.dwu[n2];
    }

    public int wl(int n) {
        return this.dwu[n];
    }

    @Override
    public void bLA() {
        super.bLA();
        int[] nArray = this.dwu;
        this.dwu = new int[this.cRf];
        System.arraycopy(nArray, 0, this.dwu, 0, this.cRf);
    }
}

