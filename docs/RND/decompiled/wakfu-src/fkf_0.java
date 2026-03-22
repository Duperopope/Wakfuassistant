/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.SortedSet;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fkf
 */
public final class fkf_0 {
    private static final fkf_0 sAz = new fkf_0();
    public static final fkd_0 sAA = new fkk_0();
    private SortedSet<fkd_0> sAB = new TreeSet<fkd_0>(new fkg_0(this));
    private fkd_0[] sAC;
    private int sAD;
    private int sAE;

    public static fkf_0 gcc() {
        return sAz;
    }

    private fkf_0() {
    }

    @NotNull
    public fkd_0 WJ(int n) {
        if (this.sAC == null || this.sAC.length == 0) {
            return sAA;
        }
        for (int i = 0; i < this.sAC.length; ++i) {
            fkd_0 fkd_02 = this.sAC[i];
            if (n > fkd_02.clW()) continue;
            return fkd_02;
        }
        return this.sAC[this.sAC.length - 1];
    }

    public fkd_0 a(fkd_0 fkd_02) {
        if (this.sAC == null || this.sAC.length == 0) {
            return sAA;
        }
        for (int i = this.sAC.length - 1; i >= 0; --i) {
            fkd_0 fkd_03 = this.sAC[i];
            if (fkd_03.clW() >= fkd_02.clW()) continue;
            return fkd_03;
        }
        return null;
    }

    public fkd_0 b(fkd_0 fkd_02) {
        if (this.sAC == null || this.sAC.length == 0) {
            return sAA;
        }
        for (int i = 0; i < this.sAC.length; ++i) {
            fkd_0 fkd_03 = this.sAC[i];
            if (fkd_02.clW() >= fkd_03.clW()) continue;
            return fkd_03;
        }
        return null;
    }

    public int getMinBound() {
        return this.sAD;
    }

    public int getMaxBound() {
        return this.sAE;
    }

    public void a(int n, int n2, int n3, String string, String string2, fkj_0[] fkj_0Array) {
        fke_0 fke_02 = new fke_0(n, n2, n3, string, string2, fkj_0Array);
        this.sAB.add(fke_02);
    }

    public void gcd() {
        this.sAC = new fkd_0[this.sAB.size()];
        this.sAB.toArray(this.sAC);
        this.sAD = this.sAB.first().clW();
        this.sAE = this.sAB.last().clW();
        this.sAB = null;
    }

    void a(SortedSet<fkd_0> sortedSet) {
        if (this.sAB == null) {
            this.sAB = sortedSet;
        } else {
            this.sAB.clear();
            this.sAB.addAll(sortedSet);
        }
    }

    public fkd_0 WK(int n) {
        for (int i = 0; i < this.sAC.length; ++i) {
            fkd_0 fkd_02 = this.sAC[i];
            if (fkd_02.d() != n) continue;
            return fkd_02;
        }
        return null;
    }
}

