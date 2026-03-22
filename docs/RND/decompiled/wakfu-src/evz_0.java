/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.procedure.TLongObjectProcedure;

/*
 * Renamed from eVz
 */
class evz_0
implements TLongObjectProcedure<eVw> {
    final /* synthetic */ azg_1 rAo;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    evz_0(azg_1 azg_12) {
        this.rAo = azg_12;
    }

    public boolean a(long l, eVw eVw2) {
        this.rAo.gK(l);
        byte[] byArray = evx_0.b(eVw2);
        this.rAo.vC(byArray.length);
        this.rAo.dH(byArray);
        return true;
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (eVw)object);
    }
}

