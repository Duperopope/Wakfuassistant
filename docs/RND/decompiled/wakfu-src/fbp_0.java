/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fbP
 */
class fbp_0
implements TObjectProcedure<fbk_0> {
    fbp_0() {
    }

    public boolean i(fbk_0 fbk_02) {
        fby_0 fby_02 = fbw_0.rSQ.eG(fbk_02.coj());
        fbo_0.rSA.put(fbk_02.aIi(), (Object)fby_02);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.i((fbk_0)object);
    }
}

