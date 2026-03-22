/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.Iterator;

/*
 * Renamed from azS
 */
public class azs_1<T>
implements Iterator<T> {
    private final TLongObjectIterator<T> dwj;

    public azs_1(TLongObjectHashMap<T> tLongObjectHashMap) {
        this.dwj = tLongObjectHashMap.iterator();
    }

    public azs_1(TLongObjectIterator<T> tLongObjectIterator) {
        this.dwj = tLongObjectIterator;
    }

    @Override
    public boolean hasNext() {
        return this.dwj.hasNext();
    }

    @Override
    public T next() {
        this.dwj.advance();
        return (T)this.dwj.value();
    }

    @Override
    public void remove() {
        this.dwj.remove();
    }

    public String toString() {
        return "TroveIterator{m_iterator=" + String.valueOf(this.dwj) + "}";
    }
}

