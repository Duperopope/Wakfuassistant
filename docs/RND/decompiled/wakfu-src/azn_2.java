/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from azn
 */
public final class azn_2 {
    private int dvm;
    private int dvn;

    public azn_2() {
    }

    public azn_2(int n, int n2) {
        this.dvm = n;
        this.dvn = n2;
    }

    public int bTr() {
        return this.dvm;
    }

    public void vN(int n) {
        this.dvm = n;
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
        if (!(object instanceof azn_2)) {
            return false;
        }
        azn_2 azn_22 = (azn_2)object;
        return this.dvm == azn_22.dvm && this.dvn == azn_22.dvn;
    }

    public int hashCode() {
        int n = this.dvm;
        n = 31 * n + this.dvn;
        return n;
    }

    public String toString() {
        return "IntIntPair{m_first=" + this.dvm + ", m_second=" + this.dvn + "}";
    }
}

