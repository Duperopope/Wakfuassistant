/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from QK
 */
final class qk_0 {
    private final int bhP;
    private final long bhQ;
    private final long bhR;

    qk_0(int n, long l, long l2) {
        this.bhP = n;
        this.bhQ = l;
        this.bhR = l2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof qk_0)) {
            return false;
        }
        qk_0 qk_02 = (qk_0)object;
        if (this.bhQ != qk_02.bhQ) {
            return false;
        }
        if (this.bhP != qk_02.bhP) {
            return false;
        }
        return this.bhR == qk_02.bhR;
    }

    public int hashCode() {
        int n = this.bhP;
        n = 31 * n + Long.hashCode(this.bhQ);
        n = 31 * n + Long.hashCode(this.bhR);
        return n;
    }

    public String toString() {
        return "IntLongLong{m_effectId=" + this.bhP + ", m_casterId=" + this.bhQ + ", m_targetId=" + this.bhR + "}";
    }
}

