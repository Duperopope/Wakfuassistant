/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.set.hash.TIntHashSet;

class adw
implements TIntProcedure {
    final /* synthetic */ adz cjN;
    final /* synthetic */ adu cjO;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    adw(adu adu2, adz adz2) {
        this.cjO = adu2;
        this.cjN = adz2;
    }

    public boolean execute(int n) {
        TIntHashSet tIntHashSet = this.cjO.cjK.rO(n);
        if (tIntHashSet != null) {
            for (int n2 : tIntHashSet) {
                this.cjN.y(add_0.rP(n2), add_0.rQ(n2));
            }
        }
        return true;
    }
}

