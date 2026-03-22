/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from azY
 */
public class azy_2<T>
extends azx_2
implements Iterable<T> {
    private T[] dwo;

    public azy_2() {
        this(10);
    }

    public azy_2(int n) {
        super(n);
        this.dwo = new Object[n];
    }

    @Override
    public boolean vS(int n) {
        int n2 = this.dwp.length;
        if (!super.vS(n)) {
            return false;
        }
        T[] TArray = this.dwo;
        this.dwo = new Object[n];
        System.arraycopy(TArray, 0, this.dwo, 0, n2);
        return true;
    }

    public void a(byte by, T t) {
        this.bTM();
        int n = this.aI(by);
        if (n < 0) {
            n = -n - 1;
        } else {
            ++this.cRf;
            this.dwp[n] = by;
        }
        this.dwo[n] = t;
    }

    public T aK(byte by) {
        if (this.cRf == 0) {
            return null;
        }
        int n = this.aH(by);
        if (n < 0) {
            return null;
        }
        T t = this.dwo[n];
        if (n < this.cRf - 1) {
            this.dwp[n] = this.dwp[this.cRf - 1];
            this.dwo[n] = this.dwo[this.cRf - 1];
            this.dwp[this.cRf - 1] = 0;
            this.dwo[this.cRf - 1] = null;
        } else {
            this.dwp[n] = 0;
            this.dwo[n] = null;
        }
        --this.cRf;
        return t;
    }

    @Override
    public void clear() {
        super.clear();
        int n = this.dwo.length;
        for (int i = 0; i < n; ++i) {
            this.dwo[i] = null;
        }
    }

    public T aL(byte by) {
        int n = this.aH(by);
        if (n < 0) {
            return null;
        }
        return this.dwo[n];
    }

    public final T vW(int n) {
        return this.dwo[n];
    }

    @Override
    public final Iterator<T> iterator() {
        return new azh_1<T>(this.dwo, false);
    }
}

