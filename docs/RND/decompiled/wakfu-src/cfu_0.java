/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.procedure.TLongObjectProcedure;

/*
 * Renamed from cfU
 */
class cfu_0
implements TLongObjectProcedure<eVw> {
    final /* synthetic */ evr_0 lTj;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cfu_0(cft_0 cft_02, evr_0 evr_02) {
        this.lTj = evr_02;
    }

    public boolean a(long l, eVw eVw2) {
        this.lTj.b(l, eVw2);
        return true;
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (eVw)object);
    }
}

