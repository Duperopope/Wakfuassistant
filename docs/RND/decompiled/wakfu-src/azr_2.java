/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.Iterator;

/*
 * Renamed from azR
 */
public class azr_2<T>
implements Iterator<T> {
    private final TIntObjectIterator<T> dwi;

    public azr_2(TIntObjectHashMap<T> tIntObjectHashMap) {
        this.dwi = tIntObjectHashMap.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.dwi.hasNext();
    }

    @Override
    public T next() {
        this.dwi.advance();
        return (T)this.dwi.value();
    }

    @Override
    public void remove() {
        this.dwi.remove();
    }
}

