/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/*
 * Renamed from azN
 */
public class azn_1<T>
implements Iterator<T> {
    private final SortedSet<? extends T> dwc;
    private T dwd = null;
    private SortedSet<? extends T> dwe;

    public azn_1(SortedSet<? extends T> sortedSet) {
        this.dwc = sortedSet;
        this.dwe = this.dwc;
    }

    @Override
    public boolean hasNext() {
        return !this.dwe.isEmpty();
    }

    @Override
    public T next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.dwd = this.dwe.last();
        this.bTG();
        return this.dwd;
    }

    private void bTG() {
        this.dwe = this.dwc.headSet(this.dwd);
    }

    @Override
    public void remove() {
        if (this.dwd == null) {
            throw new NoSuchElementException();
        }
        this.dwc.remove(this.dwd);
    }
}

