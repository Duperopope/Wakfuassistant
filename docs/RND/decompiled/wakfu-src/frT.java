/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.procedure.TIntObjectProcedure;

class frT
implements TIntObjectProcedure<abm_1> {
    final /* synthetic */ TIntIntHashMap taj;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    frT(frs_0 frs_02, TIntIntHashMap tIntIntHashMap) {
        this.taj = tIntIntHashMap;
    }

    public boolean a(int n, abm_1 abm_12) {
        int n2 = this.taj.get(n);
        if (abm_12.wL(n2)) {
            frs_0.tai.aTo();
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (abm_1)object);
    }
}

