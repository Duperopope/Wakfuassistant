/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.procedure.TIntObjectProcedure;

class foK
implements TIntObjectProcedure<abm_1> {
    final /* synthetic */ TIntIntHashMap sMq;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    foK(foI foI2, TIntIntHashMap tIntIntHashMap) {
        this.sMq = tIntIntHashMap;
    }

    public boolean a(int n, abm_1 abm_12) {
        int n2 = this.sMq.get(n);
        if (abm_12.wL(n2)) {
            foI.sMo.aTo();
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (abm_1)object);
    }
}

