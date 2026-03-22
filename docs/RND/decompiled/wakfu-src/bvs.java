/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class bvs
implements TObjectProcedure<ezz_1> {
    final /* synthetic */ bvk jtj;

    bvs(bvk bvk2) {
        this.jtj = bvk2;
    }

    public boolean e(ezz_1 ezz_12) {
        this.jtj.jsZ.add(new bvj(ezz_12));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.e((ezz_1)object);
    }
}

