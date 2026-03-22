/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.procedure.TLongObjectProcedure;

/*
 * Renamed from blz
 */
class blz_0
implements TLongObjectProcedure<bgl_0> {
    blz_0() {
    }

    public boolean a(long l, bgl_0 bgl_02) {
        fse_1.gFu().a((aef_2)bgl_02, "addRemovePartyEnabled");
        fse_1.gFu().a((aef_2)bgl_02, "isInCompanyGuild");
        fse_1.gFu().a((aef_2)bgl_02, "isInCompanyNation");
        fse_1.gFu().a((aef_2)bgl_02, "canAddToParty");
        return true;
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (bgl_0)object);
    }
}

