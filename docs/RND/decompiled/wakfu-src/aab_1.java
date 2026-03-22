/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAb
 */
public class aab_1
extends azz_2 {
    private byte[] dws;

    public aab_1() {
        this(10);
    }

    public aab_1(int n) {
        super(n);
        this.dws = new byte[n];
    }

    @Override
    public boolean vS(int n) {
        int n2 = this.dwq.length;
        if (!super.vS(n)) {
            return false;
        }
        byte[] byArray = this.dws;
        this.dws = new byte[n];
        System.arraycopy(byArray, 0, this.dws, 0, n2);
        return true;
    }

    public void b(int n, byte by) {
        this.bTP();
        int n2 = this.vY(n);
        if (n2 < 0) {
            n2 = -n2 - 1;
        } else {
            ++this.cRf;
            this.dwq[n2] = n;
        }
        this.dws[n2] = by;
    }

    public byte wd(int n) {
        if (this.cRf == 0) {
            return 0;
        }
        int n2 = this.vX(n);
        if (n2 < 0) {
            return 0;
        }
        byte by = this.dws[n2];
        this.dwq[n2] = this.dwq[this.cRf - 1];
        this.dws[n2] = this.dws[this.cRf - 1];
        --this.cRf;
        return by;
    }

    public byte vD(int n) {
        int n2 = this.vX(n);
        if (n2 < 0) {
            return 0;
        }
        return this.dws[n2];
    }

    public byte we(int n) {
        return this.dws[n];
    }

    @Override
    public void bLA() {
        super.bLA();
        byte[] byArray = this.dws;
        this.dws = new byte[this.cRf];
        System.arraycopy(byArray, 0, this.dws, 0, this.cRf);
    }
}

