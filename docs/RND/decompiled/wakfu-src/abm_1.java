/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBM
 */
public class abm_1 {
    private int dfd;
    private int dfe;

    public abm_1(int n, int n2) {
        this.dfd = n;
        this.dfe = n2;
    }

    public int bWb() {
        return this.dfd;
    }

    public void ou(int n) {
        this.dfd = n;
    }

    public int bWc() {
        return this.dfe;
    }

    public void ot(int n) {
        this.dfe = n;
    }

    public boolean wL(int n) {
        return n >= this.dfd && n <= this.dfe;
    }

    public boolean wM(int n) {
        return n > this.dfe;
    }

    public boolean wN(int n) {
        return n < this.dfd;
    }

    public int bWd() {
        return this.dfd + (this.dfe - this.dfd) / 2;
    }
}

