/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntIntProcedure
 */
import gnu.trove.procedure.TIntIntProcedure;

class fsI
implements TIntIntProcedure {
    final /* synthetic */ fam_0 teh;
    final /* synthetic */ fsH tei;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fsI(fsH fsH2, fam_0 fam_02) {
        this.tei = fsH2;
        this.teh = fam_02;
    }

    public boolean execute(int n, int n2) {
        this.tei.a(new fsZ(new fsb_0(this.teh), n2, n));
        return true;
    }
}

