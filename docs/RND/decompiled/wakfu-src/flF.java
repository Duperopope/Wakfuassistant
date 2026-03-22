/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.set.hash.TLongHashSet;

public class flF
implements fjw_0 {
    public static final flF sFP = new flF();
    private final TLongObjectHashMap<flv_0> sFQ = new TLongObjectHashMap();
    private final TLongHashSet sFR = new TLongHashSet();
    private final TIntObjectHashMap<TLongHashSet> sFS = new TIntObjectHashMap();

    private flF() {
    }

    public void c(flv_0 flv_02) {
        this.sFQ.put(flv_02.Sn(), (Object)flv_02);
        this.sFR.add(flv_02.Sn());
    }

    public void a(int n, flv_0 flv_02) {
        this.sFQ.put(flv_02.Sn(), (Object)flv_02);
        TLongHashSet tLongHashSet = (TLongHashSet)this.sFS.get(n);
        if (tLongHashSet == null) {
            tLongHashSet = new TLongHashSet();
            this.sFS.put(n, (Object)tLongHashSet);
        }
        tLongHashSet.add(flv_02.Sn());
    }

    @Override
    public void m(fjo_0 fjo_02) {
        flB flB2 = fjo_02.gbo();
        TLongIterator tLongIterator = this.sFR.iterator();
        while (tLongIterator.hasNext()) {
            flB2.b((flv_0)this.sFQ.get(tLongIterator.next()));
        }
        tLongIterator = (TLongHashSet)this.sFS.get(fjo_02.Xt());
        if (tLongIterator == null) {
            return;
        }
        TLongIterator tLongIterator2 = tLongIterator.iterator();
        while (tLongIterator2.hasNext()) {
            flB2.b((flv_0)this.sFQ.get(tLongIterator2.next()));
        }
    }
}

