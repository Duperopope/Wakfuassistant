/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from agv
 */
class agv_0
implements TLongProcedure {
    final /* synthetic */ TObjectProcedure cub;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    agv_0(agu_0 agu_02, TObjectProcedure tObjectProcedure) {
        this.cub = tObjectProcedure;
    }

    public boolean execute(long l) {
        return this.cub.execute((Object)agx_0.fX(l));
    }
}

