/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class bQQ
implements TObjectProcedure<fcb_0> {
    final /* synthetic */ bQK kXF;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bQQ(bQP bQP2, bQK bQK2) {
        this.kXF = bQK2;
    }

    public boolean a(fcb_0 fcb_02) {
        if (fsu.fL(fcb_02.fRN())) {
            bQP.a(fcb_02, bQV.kXL, this.kXF);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fcb_0)object);
    }
}

