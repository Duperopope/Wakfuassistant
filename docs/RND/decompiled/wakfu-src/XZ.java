/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

class XZ
implements TObjectProcedure<ArrayList<yn_0>> {
    XZ(XV xV) {
    }

    public boolean c(ArrayList<yn_0> arrayList) {
        int n = arrayList.size();
        float f2 = 1.0f / (float)n;
        for (int i = 0; i < n; ++i) {
            arrayList.get(i).bN(f2);
        }
        arrayList.clear();
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.c((ArrayList)object);
    }
}

