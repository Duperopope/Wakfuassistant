/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.math.DoubleMath
 *  com.google.common.primitives.Longs
 */
import com.google.common.math.DoubleMath;
import com.google.common.primitives.Longs;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Renamed from MG
 */
public class mg_1
implements mj_1 {
    private SortedSet<Long> aWJ;
    private short aWK;
    private short aWL;
    private long[] aWM;
    private final long aWN;
    private final long aWO;

    protected mg_1(long[] lArray, int n, int n2, long l, long l2, double d2) {
        this.a(lArray, n, n2, d2);
        this.aVc();
        this.aWN = l;
        this.aWO = l2;
    }

    private void aVc() {
        List list = Longs.asList((long[])this.aWM);
        this.aWJ = Collections.unmodifiableSortedSet(new TreeSet(list));
    }

    private void a(long[] lArray, int n, int n2, double d2) {
        int n3 = Math.min(n2 - n + 1, lArray.length);
        this.aWL = (short)n;
        this.aWK = (short)(this.aWL + n3 - 1);
        this.aWM = new long[n3];
        if (DoubleMath.fuzzyEquals((double)d2, (double)1.0, (double)0.0)) {
            System.arraycopy(lArray, 0, this.aWM, 0, n3);
        } else {
            for (int i = 0; i < n3; ++i) {
                long l;
                long l2 = lArray[i];
                double d3 = (double)l2 * d2;
                this.aWM[i] = l = Math.round(d3);
            }
        }
        this.aVd();
    }

    private void aVd() {
        for (int i = 0; i < this.aWM.length - 1; ++i) {
            if (this.aWM[i + 1] == this.aWM[i]) {
                throw new IllegalArgumentException(this.nI(i));
            }
            if (this.aWM[i + 1] >= this.aWM[i]) continue;
            throw new IllegalArgumentException(this.nH(i));
        }
    }

    @Override
    public short aVe() {
        return this.aWK;
    }

    @Override
    public short aVf() {
        return this.aWL;
    }

    private long aVg() {
        return this.aWO;
    }

    private long aVh() {
        return this.aWN;
    }

    @Override
    public long nG(int n) {
        if (n < this.aWL) {
            return this.aVh();
        }
        if (n > this.aWK) {
            return this.aVg();
        }
        return this.aWM[n - this.aWL];
    }

    @Override
    public long a(short s, float f2) {
        short s2 = (short)((float)s + f2);
        float f3 = f2 % 1.0f;
        if (s < this.aWL) {
            return this.aVh();
        }
        if (s > this.aWK) {
            return this.aVg();
        }
        return (long)((float)this.aWM[s - this.aWL] + (float)this.N(s2) * f2);
    }

    @Override
    public short cR(long l) {
        return (short)(this.aWJ.headSet(l + 1L).size() + this.aWL - 1);
    }

    @Override
    public long aVi() {
        return this.nG(this.aWL);
    }

    @Override
    public long aVj() {
        return this.nG(this.aWK);
    }

    @Override
    public boolean M(short s) {
        return s >= this.aWL && s <= this.aWK;
    }

    @Override
    public boolean cS(long l) {
        return l >= this.aVi() && l <= this.aVj();
    }

    @Override
    public float a(short s, long l) {
        long l2 = this.N(s);
        if (l2 == 0L) {
            return 0.0f;
        }
        float f2 = (float)this.a(l, s) / (float)l2;
        return Math.max(0.0f, Math.min(f2, 1.0f));
    }

    @Override
    public long cT(long l) {
        return this.a(l, this.cR(l));
    }

    private long a(long l, short s) {
        long l2 = l - this.nG(s);
        return Math.max(0L, Math.min(l2, this.N(s)));
    }

    @Override
    public long N(short s) {
        if (s < this.aWL || s >= this.aWK) {
            return 0L;
        }
        return this.nG(s + 1) - this.nG(s);
    }

    private String nH(int n) {
        return "Tableau mal tri\u00e9 \u00e0 " + n + " - " + this.getClass().getSimpleName();
    }

    private String nI(int n) {
        return "Tableau contenant une valeur double \u00e0 " + n + " - " + this.getClass().getSimpleName();
    }
}

