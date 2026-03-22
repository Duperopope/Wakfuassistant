/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from azw
 */
public final class azw_1 {
    private long dvF;
    private int dvn;

    public azw_1() {
    }

    public azw_1(long l, int n) {
        this.dvF = l;
        this.dvn = n;
    }

    public long bTD() {
        return this.dvF;
    }

    public void gO(long l) {
        this.dvF = l;
    }

    public int bTs() {
        return this.dvn;
    }

    public void vO(int n) {
        this.dvn = n;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof azw_1)) {
            return false;
        }
        azw_1 azw_12 = (azw_1)object;
        return this.dvF == azw_12.dvF && this.dvn == azw_12.dvn;
    }

    public int hashCode() {
        int n = (int)(this.dvF ^ this.dvF >>> 32);
        n = 31 * n + this.dvn;
        return n;
    }

    public String toString() {
        return "LongIntPair{m_first=" + this.dvF + ", m_second=" + this.dvn + "}";
    }
}

