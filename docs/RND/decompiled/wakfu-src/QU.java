/*
 * Decompiled with CFR 0.152.
 */
public class QU {
    private final QV biQ;
    private long[] biR;

    public QU(QV qV, long[] lArray) {
        this.biQ = qV;
        this.biR = lArray;
    }

    public QV bdj() {
        return this.biQ;
    }

    public void P(int n, int n2) {
        if (this.biR != null && this.biR.length > n) {
            this.biR[n] = n2;
        }
    }

    public void d(long[] lArray) {
        this.biR = lArray;
    }

    public long oP(int n) {
        if (this.biR != null && this.biR.length > n) {
            return this.biR[n];
        }
        return -1L;
    }
}

