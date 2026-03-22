/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from azq
 */
public final class azq_2 {
    private int dvm;
    private long dvx;

    public azq_2() {
    }

    public azq_2(int n, long l) {
        this.dvm = n;
        this.dvx = l;
    }

    public int bTr() {
        return this.dvm;
    }

    public void vN(int n) {
        this.dvm = n;
    }

    public long bTz() {
        return this.dvx;
    }

    public void gL(long l) {
        this.dvx = l;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof azq_2)) {
            return false;
        }
        azq_2 azq_22 = (azq_2)object;
        return this.dvm == azq_22.dvm && this.dvx == azq_22.dvx;
    }

    public int hashCode() {
        int n = this.dvm;
        n = 31 * n + (int)(this.dvx ^ this.dvx >>> 32);
        return n;
    }

    public String toString() {
        return "IntLongPair{m_first=" + this.dvm + ", m_second=" + this.dvx + "}";
    }
}

