/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.set.hash.TLongHashSet;

/*
 * Renamed from ana
 */
public class ana_2 {
    private final long cJM;
    private final TLongHashSet cJN = new TLongHashSet();

    public ana_2(long l) {
        this.cJM = l;
    }

    public void fW(long l) {
        this.cJN.add(l);
    }

    public long bDG() {
        return this.cJM;
    }

    public int bDH() {
        return this.cJN.size();
    }

    public boolean gk(long l) {
        return this.cJN.contains(l);
    }

    public long[] bDI() {
        return this.cJN.toArray();
    }

    public boolean b(TLongProcedure tLongProcedure) {
        return this.cJN.forEach(tLongProcedure);
    }

    public void c(TLongProcedure tLongProcedure) {
        TLongIterator tLongIterator = this.cJN.iterator();
        while (tLongIterator.hasNext()) {
            if (tLongProcedure.execute(tLongIterator.next())) continue;
            tLongIterator.remove();
        }
    }
}

