/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class boq
implements TObjectProcedure<bos> {
    final /* synthetic */ boolean iOY;
    final /* synthetic */ bon iOZ;
    final /* synthetic */ boo iPa;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    boq(boo boo2, boolean bl, bon bon2) {
        this.iPa = boo2;
        this.iOY = bl;
        this.iOZ = bon2;
    }

    public boolean a(bos bos2) {
        bos2.az(this.iOY);
        if (this.iOZ.I(this.iPa.iOT, bos2.aIi())) {
            this.iOZ.J(this.iPa.iOT, bos2.aIi());
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bos)object);
    }
}

