/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

/*
 * Renamed from fqm
 */
public class fqm_0 {
    private boolean sSx;
    private Predicate<ffV> sSy;
    private final Set<Integer> sSz = new HashSet<Integer>();
    private final Set<Long> sSA = new HashSet<Long>();
    private fhw_0 iTo = fhw_0.sqV;

    public fqm_0 nJ(boolean bl) {
        this.sSx = bl;
        return this;
    }

    public fqm_0 c(Predicate<ffV> predicate) {
        this.sSy = predicate;
        return this;
    }

    public fqm_0 YX(int n) {
        this.sSz.add(n);
        return this;
    }

    public fqm_0 uB(long l) {
        this.sSA.add(l);
        return this;
    }

    public fqm_0 c(fhw_0 fhw_02) {
        this.iTo = fhw_02;
        return this;
    }

    boolean ghS() {
        return this.sSx;
    }

    public Predicate<? super ffV> ghT() {
        return this.sSy;
    }

    Set<Integer> ghU() {
        return this.sSz;
    }

    Set<Long> ghV() {
        return this.sSA;
    }

    public fhw_0 ghW() {
        return this.iTo;
    }
}

