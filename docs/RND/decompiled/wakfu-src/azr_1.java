/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

/*
 * Renamed from azr
 */
public class azr_1<S> {
    private int dvm;
    private S auo;

    public azr_1() {
    }

    public azr_1(int n, S s) {
        this.dvm = n;
        this.auo = s;
    }

    public int bTr() {
        return this.dvm;
    }

    public void vN(int n) {
        this.dvm = n;
    }

    public S aHI() {
        return this.auo;
    }

    public void N(S s) {
        this.auo = s;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof azr_1)) {
            return false;
        }
        azr_1 azr_12 = (azr_1)object;
        if (this.dvm != azr_12.dvm) {
            return false;
        }
        return Objects.equals(this.auo, azr_12.auo);
    }

    public int hashCode() {
        int n = this.dvm;
        n = 31 * n + (this.auo != null ? this.auo.hashCode() : 0);
        return n;
    }

    public String toString() {
        return "IntObjectPair{m_first=" + this.dvm + ", m_second=" + String.valueOf(this.auo) + "}";
    }
}

