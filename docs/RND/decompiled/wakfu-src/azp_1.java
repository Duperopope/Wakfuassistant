/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from azP
 */
public class azp_1<T>
implements Iterator<T> {
    private final List<TLongObjectIterator<T>> dwf = new ArrayList<TLongObjectIterator<T>>(2);
    private TLongObjectIterator<T> dwg = null;
    private int dvW = 0;

    public azp_1() {
    }

    public azp_1(TLongObjectIterator<? extends T> ... tLongObjectIteratorArray) {
        for (TLongObjectIterator<? extends T> tLongObjectIterator : tLongObjectIteratorArray) {
            this.dwf.add(tLongObjectIterator);
        }
        if (this.dwg == null && tLongObjectIteratorArray.length > 0) {
            this.dwg = tLongObjectIteratorArray[0];
        }
    }

    public azp_1(TLongObjectIterator<T> tLongObjectIterator) {
        this.dwf.add(tLongObjectIterator);
        this.dwg = tLongObjectIterator;
    }

    public azp_1(TLongObjectIterator<T> tLongObjectIterator, TLongObjectIterator<T> tLongObjectIterator2) {
        this.dwf.add(tLongObjectIterator);
        this.dwf.add(tLongObjectIterator2);
        this.dwg = tLongObjectIterator;
    }

    public void a(TLongObjectIterator<T> tLongObjectIterator) {
        this.dwf.add(tLongObjectIterator);
        if (this.dwg == null) {
            this.dwg = tLongObjectIterator;
        }
    }

    @Override
    public boolean hasNext() {
        return this.dwg != null && this.dwg.hasNext();
    }

    @Override
    public T next() {
        this.dwg.advance();
        Object object = this.dwg.value();
        if (!this.dwg.hasNext()) {
            while (!this.dwg.hasNext()) {
                ++this.dvW;
                if (this.dvW >= this.dwf.size()) {
                    this.dwg = null;
                    break;
                }
                this.dwg = this.dwf.get(this.dvW);
            }
        }
        return (T)object;
    }

    @Override
    public void remove() {
    }
}

