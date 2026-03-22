/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAr
 */
public class aar_1
extends aaj_2 {
    private short[] dww;

    public aar_1() {
        this(10);
    }

    public aar_1(int n) {
        super(n);
        this.dww = new short[n];
    }

    @Override
    public boolean vS(int n) {
        int n2 = this.dwx.length;
        if (!super.vS(n)) {
            return false;
        }
        short[] sArray = this.dww;
        this.dww = new short[n];
        System.arraycopy(sArray, 0, this.dww, 0, n2);
        return true;
    }

    public void g(long l, short s) {
        this.bTJ();
        int n = this.gQ(l);
        if (n < 0) {
            n = -n - 1;
        } else {
            ++this.cRf;
            this.dwx[n] = l;
        }
        this.dww[n] = s;
    }

    public short he(long l) {
        if (this.cRf == 0) {
            return 0;
        }
        int n = this.gP(l);
        if (n < 0) {
            return 0;
        }
        return this.wB(n);
    }

    public short wB(int n) {
        short s = this.dww[n];
        this.dwx[n] = this.dwx[this.cRf - 1];
        this.dww[n] = this.dww[this.cRf - 1];
        --this.cRf;
        return s;
    }

    public short hf(long l) {
        int n = this.gP(l);
        if (n < 0) {
            return 0;
        }
        return this.dww[n];
    }

    public short ws(int n) {
        return this.dww[n];
    }
}

