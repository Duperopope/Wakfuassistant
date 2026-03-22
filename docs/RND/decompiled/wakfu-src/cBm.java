/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class cBm
implements TObjectProcedure<bxk_0> {
    final /* synthetic */ aae_1 mwY;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cBm(aae_1 aae_12) {
        this.mwY = aae_12;
    }

    public boolean a(bxk_0 bxk_02) {
        this.mwY.cA(bxk_02.dNt(), this.mwY.pF(bxk_02.dNt()) + 1);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bxk_0)object);
    }
}

