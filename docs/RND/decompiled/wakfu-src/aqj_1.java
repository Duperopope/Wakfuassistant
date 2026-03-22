/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aqJ
 */
public abstract class aqj_1 {
    protected byte cRa;
    private final int cRb;
    private final int cRc;

    protected aqj_1(int n, int n2) {
        this.cRc = n;
        this.cRb = n2;
        this.cRa = (byte)(this.cRc ^ n2);
    }

    protected final void bGQ() {
        this.cRa = (byte)((long)this.cRa + ((long)this.cRc * this.bGF() + (long)this.cRb));
    }

    protected abstract long bGF();
}

