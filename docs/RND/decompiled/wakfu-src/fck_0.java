/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fck
 */
class fck_0
implements TObjectProcedure<fat_0> {
    final /* synthetic */ fas_0 rTq;
    final /* synthetic */ fcj_0 rTr;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fck_0(fcj_0 fcj_02, fas_0 fas_02) {
        this.rTr = fcj_02;
        this.rTq = fas_02;
    }

    public boolean c(fat_0 fat_02) {
        if (fat_02.evy() == this.rTr.rTp) {
            this.rTr.jEK = this.rTq.Lx();
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.c((fat_0)object);
    }
}

