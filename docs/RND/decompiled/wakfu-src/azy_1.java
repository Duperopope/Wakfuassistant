/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

/*
 * Renamed from azy
 */
public class azy_1<F, S, T> {
    private F aun;
    private S auo;
    private T dvG;

    public azy_1() {
    }

    public azy_1(F f2, S s, T t) {
        this.aun = f2;
        this.auo = s;
        this.dvG = t;
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

    public T bTE() {
        return this.dvG;
    }

    public void R(T t) {
        this.dvG = t;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        azy_1 azy_12 = (azy_1)object;
        if (!Objects.equals(this.aun, azy_12.aun)) {
            return false;
        }
        if (!Objects.equals(this.auo, azy_12.auo)) {
            return false;
        }
        return Objects.equals(this.dvG, azy_12.dvG);
    }

    public int hashCode() {
        int n = this.aun != null ? this.aun.hashCode() : 0;
        n = 31 * n + (this.auo != null ? this.auo.hashCode() : 0);
        n = 31 * n + (this.dvG != null ? this.dvG.hashCode() : 0);
        return n;
    }
}

