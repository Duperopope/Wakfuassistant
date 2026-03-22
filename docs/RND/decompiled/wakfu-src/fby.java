/*
 * Decompiled with CFR 0.152.
 */
public final class fby {
    private int rRL;
    private int rRM;
    private int rRN;
    private int rRO;
    private int rRP;

    public void TT(int n) {
        this.rRN += n;
    }

    public void TU(int n) {
        this.rRO = n;
    }

    public void TV(int n) {
        this.rRL += n;
    }

    public void TW(int n) {
        this.rRM += n;
    }

    public int fRQ() {
        return GC.a(-100, this.rRN + this.rRO, new int[0]);
    }

    public int fRR() {
        return this.rRO;
    }

    public int fRS() {
        return this.rRL;
    }

    public int fRT() {
        return this.rRM;
    }

    public void TX(int n) {
        this.rRP = n;
    }

    public int fRU() {
        return this.rRP;
    }
}

