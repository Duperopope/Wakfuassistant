/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from MR
 */
public abstract class mr_2 {
    private final TLongObjectHashMap<ms_2> aXu = new TLongObjectHashMap();

    public void a(ms_2 ms_22) {
        this.aXu.put(ms_22.Sn(), (Object)ms_22);
    }

    public ms_2 cW(long l) {
        return (ms_2)this.aXu.get(l);
    }

    public void aVp() {
        int n = this.aXu.size();
        for (int i = 0; i < n; ++i) {
            ms_2 ms_22 = (ms_2)this.aXu.get((long)i);
            ms_22.aVu();
        }
    }

    public TLongObjectIterator<ms_2> aVq() {
        return this.aXu.iterator();
    }
}

