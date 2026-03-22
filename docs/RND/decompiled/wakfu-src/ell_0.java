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
 * Renamed from eLl
 */
public class ell_0 {
    public static final ell_0 qFB = new ell_0();
    private final TLongObjectHashMap<TLongObjectHashMap<elk_0>> qFC = new TLongObjectHashMap();
    private final TLongObjectHashMap<TLongObjectHashMap<elk_0>> qFD = new TLongObjectHashMap();

    public void b(elk_0 elk_02) {
        long l = elk_02.fzy();
        long l2 = elk_02.fzz();
        if (!this.qFC.containsKey(l)) {
            this.qFC.put(l, (Object)new TLongObjectHashMap());
        }
        if (!this.qFD.containsKey(l2)) {
            this.qFD.put(l2, (Object)new TLongObjectHashMap());
        }
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.qFC.get(l);
        tLongObjectHashMap.put(l2, (Object)elk_02);
        TLongObjectHashMap tLongObjectHashMap2 = (TLongObjectHashMap)this.qFD.get(l2);
        tLongObjectHashMap2.put(l, (Object)elk_02);
    }

    public TLongObjectIterator<elk_0> ql(long l) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.qFC.get(l);
        if (tLongObjectHashMap == null) {
            return null;
        }
        return tLongObjectHashMap.iterator();
    }

    public TLongObjectIterator<elk_0> qm(long l) {
        return ((TLongObjectHashMap)this.qFD.get(l)).iterator();
    }

    public elk_0 T(long l, long l2) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.qFC.get(l);
        if (tLongObjectHashMap == null) {
            return null;
        }
        return (elk_0)tLongObjectHashMap.get(l2);
    }

    public int qn(long l) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.qFC.get(l);
        if (tLongObjectHashMap == null) {
            return -1;
        }
        return tLongObjectHashMap.size();
    }

    public int qo(long l) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.qFD.get(l);
        if (tLongObjectHashMap == null) {
            return -1;
        }
        return tLongObjectHashMap.size();
    }
}

