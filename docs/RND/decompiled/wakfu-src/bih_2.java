/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TByteObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bIH
 */
public class bih_2 {
    private static final bih_2 khy = new bih_2();
    private final TByteObjectHashMap<TLongObjectHashMap<biq_1>> khz = new TByteObjectHashMap();
    private bii_2 khA = bii_2.khB;

    private bih_2() {
    }

    public static bih_2 dZf() {
        return khy;
    }

    public void a(bii_2 bii_22, long l, biq_1 biq_12) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.khz.get(bii_22.khH);
        if (tLongObjectHashMap == null) {
            tLongObjectHashMap = new TLongObjectHashMap();
            this.khz.put(bii_22.khH, (Object)tLongObjectHashMap);
        }
        tLongObjectHashMap.put(l, (Object)biq_12);
    }

    public void a(bii_2 bii_22, long l) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.khz.get(bii_22.khH);
        if (tLongObjectHashMap == null) {
            return;
        }
        tLongObjectHashMap.remove(l);
    }

    public void a(bii_2 bii_22) {
        this.khz.remove(bii_22.khH);
    }

    public TLongObjectIterator<biq_1> dZg() {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.khz.get(this.khA.khH);
        if (tLongObjectHashMap == null) {
            return null;
        }
        return tLongObjectHashMap.iterator();
    }

    @Nullable
    public biq_1 b(bii_2 bii_22, long l) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.khz.get(bii_22.aJr());
        if (tLongObjectHashMap == null) {
            return null;
        }
        return (biq_1)tLongObjectHashMap.get(l);
    }

    @Nullable
    public TLongObjectHashMap<biq_1> b(bii_2 bii_22) {
        return (TLongObjectHashMap)this.khz.get(bii_22.aJr());
    }

    public void c(bii_2 bii_22) {
        this.khA = bii_22;
    }

    public bii_2 dZh() {
        return this.khA;
    }

    public void clear() {
        this.khz.clear();
    }
}

