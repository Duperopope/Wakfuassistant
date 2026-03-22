/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from adV
 */
final class adv_0 {
    byte cmb;
    byte cmc;
    int cmd;
    int cme;
    int cmf;

    adv_0() {
        this.reset();
    }

    void reset() {
        this.cmb = 0;
        this.cmc = 0;
        this.cmd = Integer.MAX_VALUE;
        this.cme = Integer.MAX_VALUE;
        this.cmf = Integer.MAX_VALUE;
    }

    public boolean bvZ() {
        return this.cmf != Integer.MAX_VALUE;
    }

    boolean A(int n, int n2, int n3) {
        return this.cmd == n && this.cme == n2 && this.cmf == n3;
    }

    public void setPosition(int n, int n2, int n3) {
        this.cmd = n;
        this.cme = n2;
        this.cmf = n3;
    }

    public String toString() {
        return "{" + this.cmd + "," + this.cme + "," + this.cmf + "}";
    }
}

