/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

/*
 * Renamed from azx
 */
public class azx_1<F, S> {
    private F aun;
    private S auo;

    public azx_1() {
    }

    public azx_1(F f2, S s) {
        this.aun = f2;
        this.auo = s;
    }

    public F getFirst() {
        return this.aun;
    }

    public void Q(F f2) {
        this.aun = f2;
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
        if (!(object instanceof azx_1)) {
            return false;
        }
        azx_1 azx_12 = (azx_1)object;
        if (!Objects.equals(this.aun, azx_12.aun)) {
            return false;
        }
        return Objects.equals(this.auo, azx_12.auo);
    }

    public int hashCode() {
        int n = this.aun != null ? this.aun.hashCode() : 0;
        n = 31 * n + (this.auo != null ? this.auo.hashCode() : 0);
        return n;
    }

    public String toString() {
        return "ObjectPair{m_first=" + String.valueOf(this.aun) + ", m_second=" + String.valueOf(this.auo) + "}";
    }
}

