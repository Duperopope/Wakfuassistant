/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fgB
 */
class fgb_0
implements TObjectProcedure<ffV> {
    final /* synthetic */ kI sjP;
    final /* synthetic */ ffs_0 sjQ;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fgb_0(kI kI2, ffs_0 ffs_02) {
        this.sjP = kI2;
        this.sjQ = ffs_02;
    }

    public boolean ak(ffV ffV2) {
        this.sjP.b(fga_0.b(ffV2, this.sjQ));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.ak((ffV)object);
    }
}

