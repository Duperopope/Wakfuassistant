/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAi
 */
public class aai_1
extends azz_2 {
    private short[] dww;

    public aai_1() {
        this(10);
    }

    public aai_1(int n) {
        super(n);
        this.dww = new short[n];
    }

    @Override
    public boolean vS(int n) {
        int n2 = this.dwq.length;
        if (!super.vS(n)) {
            return false;
        }
        short[] sArray = this.dww;
        this.dww = new short[n];
        System.arraycopy(sArray, 0, this.dww, 0, n2);
        return true;
    }

    public void c(int n, short s) {
        this.bTP();
        int n2 = this.vY(n);
        if (n2 < 0) {
            n2 = -n2 - 1;
        } else {
            ++this.cRf;
            this.dwq[n2] = n;
        }
        this.dww[n2] = s;
    }

    public short wq(int n) {
        if (this.cRf == 0) {
            return 0;
        }
        int n2 = this.vX(n);
        if (n2 < 0) {
            return 0;
        }
        short s = this.dww[n2];
        this.dwq[n2] = this.dwq[this.cRf - 1];
        this.dww[n2] = this.dww[this.cRf - 1];
        --this.cRf;
        return s;
    }

    public short wr(int n) {
        int n2 = this.vX(n);
        if (n2 < 0) {
            return 0;
        }
        return this.dww[n2];
    }

    public short ws(int n) {
        return this.dww[n];
    }

    @Override
    public void bLA() {
        super.bLA();
        short[] sArray = this.dww;
        this.dww = new short[this.cRf];
        System.arraycopy(sArray, 0, this.dww, 0, this.cRf);
    }
}

