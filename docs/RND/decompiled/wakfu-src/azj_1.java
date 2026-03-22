/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/*
 * Renamed from azJ
 */
public class azj_1<T>
implements Iterator<T> {
    private final List<Iterator<? extends T>> dvU = new ArrayList<Iterator<? extends T>>(2);
    private Iterator<? extends T> dvV;
    private int dvW = -1;

    public azj_1(Collection<? extends Iterator<? extends T>> collection) {
        this.dvU.addAll(collection);
        if (!this.dvU.isEmpty()) {
            this.dvV = this.dvU.get(0);
            this.dvW = 0;
        }
    }

    public azj_1() {
        this(Collections.emptyList());
    }

    public azj_1(Iterator<? extends T> ... iteratorArray) {
        this(Arrays.asList(iteratorArray));
    }

    public azj_1(Iterator<? extends T> iterator) {
        this(Collections.singletonList(iterator));
    }

    public azj_1(Iterator<? extends T> iterator, Iterator<? extends T> iterator2) {
        this(Arrays.asList(iterator, iterator2));
    }

    public void a(Iterator<? extends T> iterator) {
        if (this.dvV == null) {
            this.dvV = iterator;
            this.dvW = this.dvU.size();
        }
        this.dvU.add(iterator);
    }

    @Override
    public boolean hasNext() {
        if (this.dvV == null) {
            return false;
        }
        if (this.dvV.hasNext()) {
            return true;
        }
        int n = this.dvU.size();
        for (int i = this.dvW + 1; i < n; ++i) {
            if (!this.dvU.get(i).hasNext()) continue;
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        if (this.dvV.hasNext()) {
            return this.dvV.next();
        }
        int n = this.dvU.size();
        for (int i = this.dvW + 1; i < n; ++i) {
            this.dvW = i;
            this.dvV = this.dvU.get(i);
            if (!this.dvV.hasNext()) continue;
            return this.dvV.next();
        }
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

