/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;

/*
 * Renamed from frS
 */
public class frs_0 {
    static final LU tai = new LU();

    public float a(TIntObjectHashMap<abm_1> tIntObjectHashMap, TIntIntHashMap tIntIntHashMap) {
        if (tIntObjectHashMap == null) {
            return 0.0f;
        }
        tai.ns(0);
        if (!tIntObjectHashMap.isEmpty()) {
            tIntObjectHashMap.forEachEntry((TIntObjectProcedure)new frT(this, tIntIntHashMap));
        }
        return (float)tai.aTn() / (float)tIntObjectHashMap.size();
    }
}

