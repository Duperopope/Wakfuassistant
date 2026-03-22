/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortObjectIterator
 *  gnu.trove.map.hash.TShortObjectHashMap
 */
import gnu.trove.iterator.TShortObjectIterator;
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.Iterator;

/*
 * Renamed from azV
 */
public class azv_2<T>
implements Iterator<T> {
    private final TShortObjectIterator<T> dwm;

    public azv_2(TShortObjectHashMap<T> tShortObjectHashMap) {
        this.dwm = tShortObjectHashMap.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.dwm.hasNext();
    }

    @Override
    public T next() {
        this.dwm.advance();
        return (T)this.dwm.value();
    }

    @Override
    public void remove() {
        this.dwm.remove();
    }
}

