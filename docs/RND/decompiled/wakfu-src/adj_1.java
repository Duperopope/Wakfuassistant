/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from aDJ
 */
public abstract class adj_1
implements adi_1 {
    private final TIntObjectHashMap<aaq_2> dEj;

    protected adj_1(aaq_2 ... aaq_2Array) {
        int n = aaq_2Array.length;
        this.dEj = new TIntObjectHashMap(n);
        for (int i = 0; i < n; ++i) {
            aaq_2 aaq_22 = aaq_2Array[i];
            if (this.dEj.put(aaq_22.bkq(), (Object)aaq_22) == null) continue;
            throw new IllegalArgumentException("Il existe d\u00e9j\u00e0 un traitement de message pour le message " + aaq_22.bkq());
        }
    }

    @Override
    public final boolean b(aam_2 aam_22) {
        aaq_2 aaq_22 = (aaq_2)this.dEj.get(aam_22.d());
        return aaq_22 == null || aaq_22.a(aam_22);
    }

    protected final <T extends aaq_2> void j(TObjectProcedure<T> tObjectProcedure) {
        this.dEj.forEachValue(tObjectProcedure);
    }
}

