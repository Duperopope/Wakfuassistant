/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.THashMap;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from awp
 */
class awp_2
implements TObjectProcedure<THashMap<String, awq_2>> {
    final /* synthetic */ awo_2 dlz;

    awp_2(awo_2 awo_22) {
        this.dlz = awo_22;
    }

    public boolean a(THashMap<String, awq_2> tHashMap) {
        tHashMap.forEachValue((TObjectProcedure)this.dlz.dlv);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((THashMap<String, awq_2>)((THashMap)object));
    }
}

