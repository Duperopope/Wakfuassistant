/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

class bQM
implements TObjectProcedure<bQN> {
    final /* synthetic */ ArrayList kXg;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bQM(bQK bQK2, ArrayList arrayList) {
        this.kXg = arrayList;
    }

    public boolean b(bQN bQN2) {
        this.kXg.add(bQN2);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((bQN)object);
    }
}

