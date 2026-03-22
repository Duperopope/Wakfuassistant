/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.commons.lang3.ArrayUtils
 */
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.procedure.TObjectProcedure;
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from fBx
 */
class fbx_1
implements TIntProcedure {
    final /* synthetic */ int[] tTm;
    final /* synthetic */ TObjectProcedure tTn;
    final /* synthetic */ fbw_1 tTo;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fbx_1(fbw_1 fbw_12, int[] nArray, TObjectProcedure tObjectProcedure) {
        this.tTo = fbw_12;
        this.tTm = nArray;
        this.tTn = tObjectProcedure;
    }

    public boolean execute(int n) {
        if (!ArrayUtils.contains((int[])this.tTm, (int)n)) {
            this.tTn.execute((Object)this.tTo.getContainerFromLayer(n));
        }
        return true;
    }
}

