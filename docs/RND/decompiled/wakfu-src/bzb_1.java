/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bZB
 */
public final class bzb_1
extends bzn_1 {
    private static final int lDz = 20;
    private int lCC;
    private final int lDA;
    private final int lDB;

    public bzb_1() {
        this(5000, 20000);
    }

    public bzb_1(int n, int n2) {
        this.lDA = n;
        this.lDB = n2;
    }

    @Override
    public void reset() {
        super.reset();
        this.eqe();
    }

    @Override
    public void qF(int n) {
        super.qF(n);
        this.lCC -= n;
        if (this.lCC >= 0) {
            return;
        }
        this.eqe();
        if (bzb_1.eqf()) {
            this.eqh();
        } else {
            this.eqg();
        }
    }

    private void eqe() {
        this.lCC = GC.q(this.lDA, this.lDB);
    }

    private static boolean eqf() {
        return false;
    }

    private void eqg() {
        bzq_1.a(this.bUu, this.epO());
    }

    private void eqh() {
        bzz_1.c(this.bUu);
    }

    public String toString() {
        return "KatrepatThunderEffect{m_timeBeforeFlash=" + this.lCC + ", m_minTimeBetweenFlash=" + this.lDA + ", m_maxTimeBetweenFlash=" + this.lDB + "}";
    }
}

