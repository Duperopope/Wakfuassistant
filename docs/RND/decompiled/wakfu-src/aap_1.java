/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAp
 */
public class aap_1
extends aaj_2 {
    private long[] dwv;

    public aap_1() {
        this(10);
    }

    public aap_1(int n) {
        super(n);
        this.dwv = new long[n];
    }

    @Override
    public boolean vS(int n) {
        int n2 = this.dwx.length;
        if (!super.vS(n)) {
            return false;
        }
        long[] lArray = this.dwv;
        this.dwv = new long[n];
        System.arraycopy(lArray, 0, this.dwv, 0, n2);
        return true;
    }

    public void i(long l, long l2) {
        this.bTJ();
        int n = this.gQ(l);
        if (n < 0) {
            n = -n - 1;
        } else {
            ++this.cRf;
            this.dwx[n] = l;
        }
        this.dwv[n] = l2;
    }

    public long ha(long l) {
        if (this.cRf == 0) {
            return 0L;
        }
        int n = this.gP(l);
        if (n < 0) {
            return 0L;
        }
        return this.wz(n);
    }

    public long wz(int n) {
        long l = this.dwv[n];
        this.dwx[n] = this.dwx[this.cRf - 1];
        this.dwv[n] = this.dwv[this.cRf - 1];
        --this.cRf;
        return l;
    }

    public long hb(long l) {
        int n = this.gP(l);
        if (n < 0) {
            return 0L;
        }
        return this.dwv[n];
    }

    public long wo(int n) {
        return this.dwv[n];
    }
}

