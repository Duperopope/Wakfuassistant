/*
 * Decompiled with CFR 0.152.
 */
public final class eVZ {
    private final long rAD;
    private final long rAE;
    private final int rAF;

    public eVZ(long l, long l2, int n) {
        this.rAD = l;
        this.rAE = l2;
        this.rAF = n;
    }

    public long fNw() {
        return this.rAD;
    }

    public long fNx() {
        return this.rAE;
    }

    public int aZH() {
        return this.rAF;
    }

    public String toString() {
        return "CarryInfoForReconnection{m_carrierId=" + this.rAD + ", m_carriedId=" + this.rAE + ", m_effectId=" + this.rAF + "}";
    }
}

