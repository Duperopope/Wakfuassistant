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
 * Renamed from azQ
 */
public class azq_1
implements Iterator<Integer> {
    private final TIntObjectIterator dwh;

    public azq_1(TIntObjectHashMap tIntObjectHashMap) {
        this.dwh = tIntObjectHashMap.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.dwh.hasNext();
    }

    public Integer bTH() {
        this.dwh.advance();
        return this.dwh.key();
    }

    @Override
    public void remove() {
        this.dwh.remove();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.bTH();
    }
}

