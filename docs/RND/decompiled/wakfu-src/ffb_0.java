/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from ffB
 */
public class ffb_0<ReferenceItem extends fhc_0, ItemSet extends ffa_0<ReferenceItem>> {
    protected static final Logger sfL = Logger.getLogger(ffb_0.class);
    protected final TShortObjectHashMap<ItemSet> sfM = new TShortObjectHashMap();

    public void c(ItemSet ItemSet) {
        this.sfM.put(((ffa_0)ItemSet).aIi(), ItemSet);
    }

    public ItemSet bX(short s) {
        return (ItemSet)((ffa_0)this.sfM.get(s));
    }

    public ItemSet j(ReferenceItem ReferenceItem) {
        return this.bX(((fhc_0)ReferenceItem).dpq());
    }

    public short[] f(short s, byte by) {
        return Bv.auw;
    }
}

