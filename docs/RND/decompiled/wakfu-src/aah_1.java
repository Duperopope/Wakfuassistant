/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aAh
 */
public class aah_1<T>
extends azz_2
implements Iterable<T> {
    private T[] dwo;

    public aah_1() {
        this(10);
    }

    public aah_1(int n) {
        super(n);
        this.dwo = new Object[n];
    }

    @Override
    public boolean vS(int n) {
        int n2 = this.dwq.length;
        if (!super.vS(n)) {
            return false;
        }
        T[] TArray = this.dwo;
        this.dwo = new Object[n];
        System.arraycopy(TArray, 0, this.dwo, 0, n2);
        return true;
    }

    public void b(int n, T t) {
        this.bTP();
        int n2 = this.vY(n);
        if (n2 < 0) {
            n2 = -n2 - 1;
        } else {
            ++this.cRf;
            this.dwq[n2] = n;
        }
        this.dwo[n2] = t;
    }

    public T wp(int n) {
        if (this.cRf == 0) {
            return null;
        }
        int n2 = this.vX(n);
        if (n2 < 0) {
            return null;
        }
        T t = this.dwo[n2];
        if (n2 < this.cRf - 1) {
            this.dwq[n2] = this.dwq[this.cRf - 1];
            this.dwo[n2] = this.dwo[this.cRf - 1];
            this.dwq[this.cRf - 1] = 0;
            this.dwo[this.cRf - 1] = null;
        } else {
            this.dwq[n2] = 0;
            this.dwo[n2] = null;
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

    public T vK(int n) {
        int n2 = this.vX(n);
        if (n2 < 0) {
            return null;
        }
        return this.dwo[n2];
    }

    public T vU(int n) {
        return this.dwo[n];
    }

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return new azh_1<T>(this.dwo, false);
    }

    @Override
    public void bLA() {
        super.bLA();
        T[] TArray = this.dwo;
        this.dwo = new Object[this.cRf];
        System.arraycopy(TArray, 0, this.dwo, 0, this.cRf);
    }
}

