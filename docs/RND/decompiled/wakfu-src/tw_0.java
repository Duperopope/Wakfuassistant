/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Tw
 */
public class tw_0 {
    public static final int bsI = 1;
    private int bsJ;
    private Tx bsK;
    private long bsL;

    public tw_0() {
        this.bsJ = 1;
        this.bsK = Tx.bsO;
    }

    public tw_0(int n, Tx tx) {
        this.bsJ = n;
        this.bsK = tx;
    }

    public Tx bhn() {
        return this.bsK;
    }

    public void a(Tx tx) {
        this.bsK = tx;
    }

    public int bho() {
        return this.bsJ;
    }

    public void pv(int n) {
        this.bsJ = n;
    }

    public long bhp() {
        return this.bsL;
    }

    public void el(long l) {
        this.bsL = l;
    }
}

