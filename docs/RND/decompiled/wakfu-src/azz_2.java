/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from azZ
 */
public abstract class azz_2 {
    protected int[] dwq;
    protected int cRf;

    protected azz_2(int n) {
        this.dwq = new int[n];
        this.cRf = 0;
    }

    public boolean vS(int n) {
        if (n > this.dwq.length) {
            int[] nArray = this.dwq;
            this.dwq = new int[n];
            System.arraycopy(nArray, 0, this.dwq, 0, nArray.length);
            return true;
        }
        return false;
    }

    protected final int vX(int n) {
        for (int i = this.cRf - 1; i >= 0; --i) {
            if (n != this.dwq[i]) continue;
            return i;
        }
        return -1;
    }

    protected final int vY(int n) {
        for (int i = this.cRf - 1; i >= 0; --i) {
            if (n != this.dwq[i]) continue;
            return -i - 1;
        }
        return this.cRf;
    }

    protected final void bTP() {
        if (this.cRf == this.dwq.length) {
            this.vS(Math.max(this.dwq.length * 2, 1));
        }
    }

    public final boolean vZ(int n) {
        return this.vX(n) != -1;
    }

    public final void bTQ() {
        this.cRf = 0;
    }

    public void clear() {
        this.cRf = 0;
    }

    public final int bTR() {
        return this.cRf;
    }

    public final int wa(int n) {
        return this.dwq[n];
    }

    public void bLA() {
        int[] nArray = this.dwq;
        this.dwq = new int[this.cRf];
        System.arraycopy(nArray, 0, this.dwq, 0, this.cRf);
    }

    public final int[] bTS() {
        int n = this.bTR();
        int[] nArray = new int[n];
        for (int i = 0; i < n; ++i) {
            nArray[i] = this.wa(i);
        }
        return nArray;
    }

    public final boolean bTT() {
        return this.bTR() == 0;
    }
}

