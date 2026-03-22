/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from azk
 */
public final class azk_2 {
    public static final int dvd = -1;
    private int dve;
    private int[] dvf;
    public int dvg;
    public int dvh;

    public azk_2(int n) {
        this.dvf = new int[n];
        this.bTl();
    }

    public final int bTk() {
        if (this.dve >= this.dvf.length) {
            return -1;
        }
        int n = this.dve;
        this.dve = this.dvf[this.dve];
        --this.dvg;
        ++this.dvh;
        return n;
    }

    public final void vI(int n) {
        this.dvf[n] = this.dve;
        this.dve = n;
        ++this.dvg;
        --this.dvh;
    }

    public final void bTl() {
        this.dve = 0;
        int n = this.dvf.length;
        for (int i = 0; i < n; ++i) {
            this.dvf[i] = i + 1;
        }
        this.dvg = n;
        this.dvh = 0;
    }

    public final int bTm() {
        return this.dvg;
    }

    public final int bTn() {
        return this.dvh;
    }

    public final int bTo() {
        return this.dvf.length;
    }

    public final void vJ(int n) {
        assert (n > this.dvf.length);
        int[] nArray = new int[n];
        for (int i = this.dvf.length; i < nArray.length; ++i) {
            nArray[i] = i + 1;
        }
        System.arraycopy(this.dvf, 0, nArray, 0, this.dvf.length);
        this.dvf = nArray;
        this.dvg = n - this.dvh;
    }
}

