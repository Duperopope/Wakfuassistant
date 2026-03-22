/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * Renamed from azM
 */
public class azm_2<T>
implements Iterator<T> {
    private final ListIterator<? extends T> dwb;

    public azm_2(List<? extends T> list) {
        this.dwb = list.listIterator(list.size());
    }

    @Override
    public boolean hasNext() {
        return this.dwb.hasPrevious();
    }

    @Override
    public T next() {
        return this.dwb.previous();
    }

    @Override
    public void remove() {
        this.dwb.remove();
    }
}

