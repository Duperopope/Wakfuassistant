/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAj
 */
public abstract class aaj_2 {
    protected long[] dwx;
    protected int cRf;

    protected aaj_2(int n) {
        this.dwx = new long[n];
        this.cRf = 0;
    }

    public boolean vS(int n) {
        if (n > this.dwx.length) {
            int n2 = this.dwx.length;
            long[] lArray = this.dwx;
            this.dwx = new long[n];
            System.arraycopy(lArray, 0, this.dwx, 0, n2);
            return true;
        }
        return false;
    }

    protected int gP(long l) {
        for (int i = this.cRf - 1; i >= 0; --i) {
            if (l != this.dwx[i]) continue;
            return i;
        }
        return -1;
    }

    protected int gQ(long l) {
        for (int i = this.cRf - 1; i >= 0; --i) {
            if (l != this.dwx[i]) continue;
            return -i - 1;
        }
        return this.cRf;
    }

    protected void bTJ() {
        if (this.cRf == this.dwx.length) {
            this.vS(this.dwx.length * 2);
        }
    }

    public final boolean gR(long l) {
        return this.gP(l) != -1;
    }

    public void reset() {
        this.cRf = 0;
    }

    public void clear() {
        this.cRf = 0;
    }

    public int aVo() {
        return this.cRf;
    }

    public long wt(int n) {
        return this.dwx[n];
    }
}

