/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from aAt
 */
public class aat_1<T>
extends aas_1
implements Iterable<T> {
    private T[] dwo;

    public aat_1() {
        this(10);
    }

    public aat_1(int n) {
        super(n);
        this.dwo = new Object[n];
    }

    @Override
    public boolean vS(int n) {
        int n2 = this.dwy.length;
        if (!super.vS(n)) {
            return false;
        }
        T[] TArray = this.dwo;
        this.dwo = new Object[n];
        System.arraycopy(TArray, 0, this.dwo, 0, n2);
        return true;
    }

    public void a(short s, T t) {
        this.bTU();
        int n = this.aI(s);
        if (n < 0) {
            n = -n - 1;
        } else {
            ++this.cRf;
            this.dwy[n] = s;
        }
        this.dwo[n] = t;
    }

    public T aK(short s) {
        if (this.cRf == 0) {
            return null;
        }
        int n = this.aH(s);
        if (n < 0) {
            return null;
        }
        T t = this.dwo[n];
        if (n < this.cRf - 1) {
            this.dwy[n] = this.dwy[this.cRf - 1];
            this.dwo[n] = this.dwo[this.cRf - 1];
            this.dwy[this.cRf - 1] = 0;
            this.dwo[this.cRf - 1] = null;
        } else {
            this.dwy[n] = 0;
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

    public T aL(short s) {
        int n = this.aH(s);
        if (n < 0) {
            return null;
        }
        return this.dwo[n];
    }

    public final T wD(int n) {
        return this.dwo[n];
    }

    @Override
    public final Iterator<T> iterator() {
        return new azh_1<T>(this.dwo, false);
    }
}

