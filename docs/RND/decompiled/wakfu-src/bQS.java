/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class bQS
implements TObjectProcedure<bQK> {
    final /* synthetic */ fsm_0 kXG;
    final /* synthetic */ bQP kXH;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bQS(bQP bQP2, fsm_0 fsm_02) {
        this.kXH = bQP2;
        this.kXG = fsm_02;
    }

    public boolean a(bQK bQK2) {
        bQK2.kXf.forEachValue((TObjectProcedure)new bQT(this));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bQK)object);
    }
}

