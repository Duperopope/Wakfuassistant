/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class bvq
implements TObjectProcedure<fab> {
    final /* synthetic */ bvk jti;

    bvq(bvk bvk2) {
        this.jti = bvk2;
    }

    public boolean f(fab fab2) {
        this.jti.jta.add(new bve(fab2));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.f((fab)object);
    }
}

