/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from azu
 */
public class azu_2
implements Iterable<Long> {
    private static final int dvB = 10;
    protected long[] dvC;
    protected int duV;
    protected int cRf;
    protected int duW;

    public azu_2() {
        this.dvC = new long[10];
        this.duV = 10;
        this.cRf = 0;
        this.duW = 10;
    }

    public azu_2(azu_2 azu_22) {
        this.duV = this.cRf = azu_22.cRf;
        this.dvC = new long[azu_22.cRf];
        this.duW = azu_22.duW;
    }

    public azu_2(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("La taille du tableau doit \u00eatre >= 0");
        }
        this.dvC = new long[n];
        this.duV = n;
        this.cRf = 0;
        this.duW = 10;
    }

    public azu_2(int n, int n2) {
        if (n < 0) {
            throw new IllegalArgumentException("La taille du tableau doit \u00eatre >= 0");
        }
        if (n2 < 1) {
            throw new IllegalArgumentException("L'incr\u00e9ment de taille growth doit \u00eatre >= 1");
        }
        this.dvC = new long[n];
        this.duV = n;
        this.cRf = 0;
        this.duW = n2;
    }

    public void gM(long l) {
        this.vA(this.cRf + 1);
        this.dvC[this.cRf] = l;
        ++this.cRf;
    }

    public void h(long[] lArray) {
        int n = lArray.length;
        this.vA(this.cRf + n);
        System.arraycopy(lArray, 0, this.dvC, this.cRf, n);
        this.cRf += n;
    }

    public void b(long[] lArray, int n) {
        this.vA(this.cRf + n);
        System.arraycopy(lArray, 0, this.dvC, this.cRf, n);
        this.cRf += n;
    }

    public void b(long[] lArray, int n, int n2) {
        this.vA(this.cRf + n2);
        System.arraycopy(lArray, n, this.dvC, this.cRf, n2);
        this.cRf += n2;
    }

    public void a(azu_2 azu_22) {
        this.b(azu_22.dvC, 0, azu_22.cRf);
    }

    public boolean gN(long l) {
        for (int i = 0; i < this.cRf; ++i) {
            if (this.dvC[i] != l) continue;
            if (i < this.cRf - 1) {
                System.arraycopy(this.dvC, i + 1, this.dvC, i, this.cRf - i - 1);
            }
            --this.cRf;
            return true;
        }
        return false;
    }

    public long vR(int n) {
        if (n >= this.cRf) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.dvC[n];
    }

    public int aVo() {
        return this.cRf;
    }

    public boolean aJG() {
        return this.cRf == 0;
    }

    public boolean fa(long l) {
        for (int i = this.cRf - 1; i >= 0; --i) {
            if (this.dvC[i] != l) continue;
            return true;
        }
        return false;
    }

    public long[] bTA() {
        return this.dvC;
    }

    public long[] bTB() {
        long[] lArray = new long[this.cRf];
        System.arraycopy(this.dvC, 0, lArray, 0, this.cRf);
        return lArray;
    }

    private void vA(int n) {
        if (n > this.duV) {
            this.duV = n + this.duW;
            long[] lArray = new long[this.duV];
            System.arraycopy(this.dvC, 0, lArray, 0, this.cRf);
            this.dvC = lArray;
        }
    }

    @Override
    @NotNull
    public Iterator<Long> iterator() {
        return new azv_1(this);
    }
}

