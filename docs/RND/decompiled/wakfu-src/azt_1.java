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
 * Renamed from azT
 */
public class azt_1
implements Iterator<Long> {
    private final TLongObjectIterator dwk;

    public azt_1(TLongObjectHashMap tLongObjectHashMap) {
        this.dwk = tLongObjectHashMap.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.dwk.hasNext();
    }

    public Long bTC() {
        this.dwk.advance();
        return this.dwk.key();
    }

    @Override
    public void remove() {
        this.dwk.remove();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.bTC();
    }
}

