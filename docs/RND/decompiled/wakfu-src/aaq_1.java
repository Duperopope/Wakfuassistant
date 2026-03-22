/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aAq
 */
public class aaq_1<T>
extends aaj_2
implements Iterable<T> {
    private T[] dwo;

    public aaq_1() {
        this(10);
    }

    public aaq_1(int n) {
        super(n);
        this.dwo = new Object[n];
    }

    @Override
    public boolean vS(int n) {
        int n2 = this.dwx.length;
        if (!super.vS(n)) {
            return false;
        }
        T[] TArray = this.dwo;
        this.dwo = new Object[n];
        System.arraycopy(TArray, 0, this.dwo, 0, n2);
        return true;
    }

    public void a(long l, T t) {
        this.bTJ();
        int n = this.gQ(l);
        if (n < 0) {
            n = -n - 1;
        } else {
            ++this.cRf;
            this.dwx[n] = l;
        }
        this.dwo[n] = t;
    }

    public T hc(long l) {
        if (this.cRf == 0) {
            return null;
        }
        int n = this.gP(l);
        if (n < 0) {
            return null;
        }
        return this.wA(n);
    }

    private T wA(int n) {
        T t = this.dwo[n];
        if (n < this.cRf - 1) {
            this.dwx[n] = this.dwx[this.cRf - 1];
            this.dwo[n] = this.dwo[this.cRf - 1];
            this.dwx[this.cRf - 1] = 0L;
            this.dwo[this.cRf - 1] = null;
        } else {
            this.dwx[n] = 0L;
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

    public T hd(long l) {
        int n = this.gP(l);
        if (n < 0) {
            return null;
        }
        return this.dwo[n];
    }

    public T vU(int n) {
        return this.dwo[n];
    }

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return new azh_1<T>(this.dwo, false);
    }
}

