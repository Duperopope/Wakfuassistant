/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eLH
 */
class elh_0
implements TObjectProcedure<ely_0> {
    int qHw = 1;
    final /* synthetic */ elg_0 qHx;
    final /* synthetic */ eLG qHy;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    elh_0(eLG eLG2, elg_0 elg_02) {
        this.qHy = eLG2;
        this.qHx = elg_02;
    }

    public boolean b(ely_0 ely_02) {
        if (this.qHx.Re(ely_02.d()) >= this.qHy.qHv) {
            if (this.qHw >= this.qHy.qHu) {
                this.qHy.hZs = true;
                return false;
            }
            ++this.qHw;
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((ely_0)object);
    }
}

