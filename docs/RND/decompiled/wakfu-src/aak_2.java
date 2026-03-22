/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAk
 */
public class aak_2
extends aaj_2 {
    private byte[] dws;

    public aak_2() {
        this(10);
    }

    public aak_2(int n) {
        super(n);
        this.dws = new byte[n];
    }

    @Override
    public boolean vS(int n) {
        int n2 = this.dwx.length;
        if (!super.vS(n)) {
            return false;
        }
        byte[] byArray = this.dws;
        this.dws = new byte[n];
        System.arraycopy(byArray, 0, this.dws, 0, n2);
        return true;
    }

    public void a(long l, byte by) {
        this.bTJ();
        int n = this.gQ(l);
        if (n < 0) {
            n = -n - 1;
        } else {
            ++this.cRf;
            this.dwx[n] = l;
        }
        this.dws[n] = by;
    }

    public byte gS(long l) {
        if (this.cRf == 0) {
            return 0;
        }
        int n = this.gP(l);
        if (n < 0) {
            return 0;
        }
        return this.wu(n);
    }

    public byte wu(int n) {
        byte by = this.dws[n];
        this.dwx[n] = this.dwx[this.cRf - 1];
        this.dws[n] = this.dws[this.cRf - 1];
        --this.cRf;
        return by;
    }

    public byte gT(long l) {
        int n = this.gP(l);
        if (n < 0) {
            return 0;
        }
        return this.dws[n];
    }

    public byte we(int n) {
        return this.dws[n];
    }
}

