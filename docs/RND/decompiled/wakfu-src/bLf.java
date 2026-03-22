/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class bLf
implements TObjectProcedure<bKV> {
    final /* synthetic */ aaj_0 krU;
    final /* synthetic */ int krV;
    final /* synthetic */ bLe krW;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bLf(bLe bLe2, aaj_0 aaj_02, int n) {
        this.krW = bLe2;
        this.krU = aaj_02;
        this.krV = n;
    }

    public boolean e(bKV bKV2) {
        if (bKV2.a(this.krU, this.krV, bLe.krM)) {
            if (bKV2.ece()) {
                this.krW.krO.add(bKV2);
            } else {
                bLe.a(this.krW).add(bKV2);
            }
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.e((bKV)object);
    }
}

