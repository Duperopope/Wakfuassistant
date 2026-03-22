/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRU
 */
class cru_2
implements aeN {
    private final int nDZ;

    cru_2(int n) {
        this.nDZ = n;
    }

    @Override
    public boolean l(adj_0 adj_02) {
        return adj_02.bqo() == this.nDZ;
    }

    public String toString() {
        return "MobileFilterImpl{m_fightId=" + this.nDZ + "}";
    }
}

