/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from caT
 */
class cat_1
implements fsr_0 {
    final /* synthetic */ cas_1 lHR;

    cat_1(cas_1 cas_12) {
        this.lHR = cas_12;
    }

    @Override
    public boolean y(TObjectProcedure<fam_0> tObjectProcedure) {
        if (!this.lHR.lHP.y(tObjectProcedure)) {
            return false;
        }
        return this.lHR.lHH == null || tObjectProcedure.execute((Object)this.lHR.lHH);
    }
}

