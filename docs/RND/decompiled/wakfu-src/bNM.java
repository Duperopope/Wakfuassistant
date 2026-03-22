/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class bNM
implements TObjectProcedure<frg_0> {
    final /* synthetic */ long kIH;
    final /* synthetic */ bgt_0 kII;
    final /* synthetic */ bco_0 kIJ;
    final /* synthetic */ bNL kIK;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bNM(bNL bNL2, long l, bgt_0 bgt_02, bco_0 bco_02) {
        this.kIK = bNL2;
        this.kIH = l;
        this.kII = bgt_02;
        this.kIJ = bco_02;
    }

    public boolean a(frg_0 frg_02) {
        this.kIK.a(frg_02, this.kIH, this.kII, this.kIJ);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((frg_0)object);
    }
}

