/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.procedure.TIntObjectProcedure;

class foJ
implements TIntObjectProcedure<abm_1> {
    final /* synthetic */ TIntIntHashMap sMp;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    foJ(foI foI2, TIntIntHashMap tIntIntHashMap) {
        this.sMp = tIntIntHashMap;
    }

    public boolean a(int n, abm_1 abm_12) {
        int n2 = this.sMp.get(n);
        if (abm_12.wL(n2)) {
            foI.sMo.aTo();
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (abm_1)object);
    }
}

