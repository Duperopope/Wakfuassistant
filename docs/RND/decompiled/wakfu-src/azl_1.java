/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from azL
 */
public class azl_1<E>
implements Iterator<E> {
    private final Iterator<E> dwa;

    public azl_1(Iterator<E> iterator) {
        this.dwa = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.dwa.hasNext();
    }

    @Override
    public E next() {
        return this.dwa.next();
    }

    @Override
    @Deprecated
    public void remove() {
        throw new UnsupportedOperationException("Impossible de modifier la collection de base avec cet iterator");
    }
}

