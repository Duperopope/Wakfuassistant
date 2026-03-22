/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from fbS
 */
class fbs_0
implements TObjectProcedure<enk_0> {
    final /* synthetic */ ArrayList rSE;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fbs_0(ArrayList arrayList) {
        this.rSE = arrayList;
    }

    public boolean y(enk_0 enk_02) {
        if (!enk_02.a(eNi.qWy)) {
            this.rSE.add(enk_02);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.y((enk_0)object);
    }
}

