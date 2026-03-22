/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import org.apache.log4j.Logger;

/*
 * Renamed from Td
 */
public class td_0<TQuotaType extends ta_0<TQuotaObjectType>, TQuotaObjectType extends PH> {
    private static final Logger brZ = Logger.getLogger(td_0.class);
    private static final boolean bsa = false;
    protected final TIntObjectHashMap<TQuotaType> bsb = new TIntObjectHashMap();

    protected td_0() {
    }

    public void a(TQuotaType TQuotaType) {
        if (this.bsb.containsKey(((sz_0)TQuotaType).avr())) {
            brZ.warn((Object)("Surcharge du quota pour le referenceId " + ((sz_0)TQuotaType).avr() + " : \u00e9trange"));
        }
        this.bsb.put(((sz_0)TQuotaType).avr(), TQuotaType);
    }

    protected void a(TQuotaObjectType TQuotaObjectType) {
        ta_0 ta_02 = (ta_0)this.bsb.get(TQuotaObjectType.avr());
        if (ta_02 != null) {
            ta_02.a(TQuotaObjectType);
        }
    }

    protected void b(TQuotaObjectType TQuotaObjectType) {
        ta_0 ta_02 = (ta_0)this.bsb.get(TQuotaObjectType.avr());
        if (ta_02 != null) {
            ta_02.b(TQuotaObjectType);
        }
    }

    public boolean pn(int n) {
        ta_0 ta_02 = (ta_0)this.bsb.get(n);
        if (ta_02 != null) {
            return ta_02.bgx();
        }
        return true;
    }

    public boolean po(int n) {
        return this.bsb.get(n) != null;
    }

    public TIntObjectIterator<TQuotaType> bgC() {
        return this.bsb.iterator();
    }

    public TIntObjectHashMap<TQuotaType> bgD() {
        return this.bsb;
    }

    public void reset() {
        this.bsb.forEachValue((TObjectProcedure)new te_0(this));
    }
}

