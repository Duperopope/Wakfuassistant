/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.TIntObjectMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.Collection;

/*
 * Renamed from fju
 */
class fju_0
implements TIntObjectIterator<fjo_0> {
    private final TIntObjectHashMap<fjo_0> syM;
    private final TIntObjectIterator<fjo_0> syN;
    private final TIntObjectMap<fjo_0> syO;

    fju_0(TIntObjectMap<fjo_0> tIntObjectMap, Collection<Integer> collection) {
        this.syM = new TIntObjectHashMap(tIntObjectMap);
        this.syM.retainEntries((TIntObjectProcedure)new fjv_0(this, collection));
        this.syN = this.syM.iterator();
        this.syO = tIntObjectMap;
    }

    public void advance() {
        this.syN.advance();
    }

    public boolean hasNext() {
        return this.syN.hasNext();
    }

    public void remove() {
        this.syO.remove(this.syN.key());
        this.syN.remove();
    }

    public int key() {
        return this.syN.key();
    }

    public fjo_0 gbT() {
        return (fjo_0)this.syN.value();
    }

    public fjo_0 o(fjo_0 fjo_02) {
        return (fjo_0)this.syO.put(this.syN.key(), (Object)fjo_02);
    }

    public /* synthetic */ Object setValue(Object object) {
        return this.o((fjo_0)object);
    }

    public /* synthetic */ Object value() {
        return this.gbT();
    }
}

