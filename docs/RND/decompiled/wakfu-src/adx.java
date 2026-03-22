/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIterator
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.iterator.TIntIterator;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.set.hash.TIntHashSet;

class adx
implements TIntProcedure {
    final /* synthetic */ ady cjP;
    final /* synthetic */ adu cjQ;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    adx(adu adu2, ady ady2) {
        this.cjQ = adu2;
        this.cjP = ady2;
    }

    public boolean execute(int n) {
        TIntHashSet tIntHashSet = this.cjQ.cjK.rO(n);
        if (tIntHashSet != null) {
            TIntIterator tIntIterator = tIntHashSet.iterator();
            while (tIntIterator.hasNext()) {
                this.cjP.rT(tIntIterator.next());
            }
        }
        return true;
    }
}

