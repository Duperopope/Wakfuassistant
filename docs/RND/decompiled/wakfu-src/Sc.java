/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class Sc
implements TObjectProcedure<RZ> {
    final /* synthetic */ long bnB;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    Sc(Sb sb, long l) {
        this.bnB = l;
    }

    public boolean c(RZ rZ) {
        if (rZ.bfl() == this.bnB || rZ.Qy() == this.bnB) {
            rZ.dS(this.bnB);
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.c((RZ)object);
    }
}

