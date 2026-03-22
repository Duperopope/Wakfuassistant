/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bdB
 */
class bdb_1
implements TObjectProcedure<bde_1> {
    final /* synthetic */ TIntHashSet hMa;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bdb_1(TIntHashSet tIntHashSet) {
        this.hMa = tIntHashSet;
    }

    public boolean a(bde_1 bde_12) {
        int n = bde_12.hMe.bTR();
        for (int i = 0; i < n; ++i) {
            for (bdd_1 bdd_12 : bde_12.hMe.vU(i)) {
                this.hMa.add(bdd_12.hMd);
            }
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bde_1)object);
    }
}

