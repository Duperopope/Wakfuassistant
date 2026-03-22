/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bDY
 */
class bdy_0
implements TObjectProcedure<ffV> {
    final /* synthetic */ bdx_0 jMb;

    bdy_0(bdx_0 bdx_02) {
        this.jMb = bdx_02;
    }

    public boolean ak(ffV ffV2) {
        this.jMb.jLZ.add(ffV2);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.ak((ffV)object);
    }
}

