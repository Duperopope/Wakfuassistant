/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAn
 */
public class aan_1
extends aaj_2 {
    private int[] dwu;

    public aan_1() {
        this(10);
    }

    public aan_1(int n) {
        super(n);
        this.dwu = new int[n];
    }

    @Override
    public boolean vS(int n) {
        int n2 = this.dwx.length;
        if (!super.vS(n)) {
            return false;
        }
        int[] nArray = this.dwu;
        this.dwu = new int[n];
        System.arraycopy(nArray, 0, this.dwu, 0, n2);
        return true;
    }

    public void r(long l, int n) {
        this.bTJ();
        int n2 = this.gQ(l);
        if (n2 < 0) {
            n2 = -n2 - 1;
        } else {
            ++this.cRf;
            this.dwx[n2] = l;
        }
        this.dwu[n2] = n;
    }

    public int gY(long l) {
        if (this.cRf == 0) {
            return 0;
        }
        int n = this.gP(l);
        if (n < 0) {
            return 0;
        }
        return this.wx(n);
    }

    public int wx(int n) {
        int n2 = this.dwu[n];
        this.dwx[n] = this.dwx[this.cRf - 1];
        this.dwu[n] = this.dwu[this.cRf - 1];
        --this.cRf;
        return n2;
    }

    public int gZ(long l) {
        int n = this.gP(l);
        if (n < 0) {
            return 0;
        }
        return this.dwu[n];
    }

    public int wl(int n) {
        return this.dwu[n];
    }
}

