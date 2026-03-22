/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from acn
 */
class acn_0
implements TObjectProcedure<acf> {
    final /* synthetic */ acm_0 cfY;

    acn_0(acm_0 acm_02) {
        this.cfY = acm_02;
    }

    public boolean d(acf acf2) {
        if (acf2.isEnabled() && acf2.aRB() != 0.0f) {
            acf2.a(this.cfY.cfW, 1.0f);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.d((acf)object);
    }
}

