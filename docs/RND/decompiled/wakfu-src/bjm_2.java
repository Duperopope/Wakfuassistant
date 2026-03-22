/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bjM
 */
class bjm_2
implements TObjectProcedure<bji_2> {
    final /* synthetic */ bdj_2 ipG;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bjm_2(bdj_2 bdj_22) {
        this.ipG = bdj_22;
    }

    public boolean b(bji_2 bji_22) {
        bjk_2.a(this.ipG, bji_22);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((bji_2)object);
    }
}

