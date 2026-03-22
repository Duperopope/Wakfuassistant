/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAs
 */
public abstract class aas_1 {
    protected short[] dwy;
    protected int cRf;

    public aas_1(int n) {
        this.dwy = new short[n];
        this.cRf = 0;
    }

    public boolean vS(int n) {
        if (n > this.dwy.length) {
            short[] sArray = this.dwy;
            this.dwy = new short[n];
            System.arraycopy(sArray, 0, this.dwy, 0, sArray.length);
            return true;
        }
        return false;
    }

    protected final int aH(short s) {
        for (int i = this.cRf - 1; i >= 0; --i) {
            if (s != this.dwy[i]) continue;
            return i;
        }
        return -1;
    }

    protected final int aI(short s) {
        for (int i = this.cRf - 1; i >= 0; --i) {
            if (s != this.dwy[i]) continue;
            return -i - 1;
        }
        return this.cRf;
    }

    protected final void bTU() {
        if (this.cRf == this.dwy.length) {
            this.vS(this.dwy.length * 2);
        }
    }

    public final boolean aJ(short s) {
        return this.aH(s) != -1;
    }

    public final void bTV() {
        this.cRf = 0;
    }

    public void clear() {
        this.cRf = 0;
    }

    public final int bTW() {
        return this.cRf;
    }

    public final short wC(int n) {
        return this.dwy[n];
    }
}

