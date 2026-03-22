/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;

/*
 * Renamed from nk
 */
public class nk_1 {
    private final int Ni;
    private final boolean Nj;

    public nk_1(int n, boolean bl) {
        this.Ni = n;
        this.Nj = bl;
    }

    public int d() {
        return this.Ni;
    }

    public boolean app() {
        return this.Nj;
    }

    public static Function<nk_1, Integer> apy() {
        return new nl_1();
    }

    public String toString() {
        return "ObjectiveData{m_id=" + this.Ni + ", m_complete=" + this.Nj + "}";
    }
}

