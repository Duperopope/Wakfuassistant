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
 * Renamed from azU
 */
public class azu_1
implements Iterator<Short> {
    private final TShortObjectIterator dwl;

    public azu_1(TShortObjectHashMap tShortObjectHashMap) {
        this.dwl = tShortObjectHashMap.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.dwl.hasNext();
    }

    public Short bTI() {
        this.dwl.advance();
        return this.dwl.key();
    }

    @Override
    public void remove() {
        this.dwl.remove();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.bTI();
    }
}

