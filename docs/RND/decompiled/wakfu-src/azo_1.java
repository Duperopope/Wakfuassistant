/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Renamed from azO
 */
public class azo_1<T>
implements Iterator<T> {
    private T bJn = null;

    public azo_1(T t) {
        this.bJn = t;
    }

    public void V(T t) {
        if (this.bJn != null) {
            throw new UnsupportedOperationException("Can't initialize an already initialized iterator");
        }
        this.bJn = t;
    }

    @Override
    public void remove() {
        if (this.bJn == null) {
            throw new NoSuchElementException();
        }
        this.bJn = null;
    }

    @Override
    public boolean hasNext() {
        return this.bJn != null;
    }

    @Override
    public T next() {
        if (this.bJn != null) {
            T t = this.bJn;
            this.bJn = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}

