/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.List;

class eJO
implements TObjectProcedure<eJS> {
    final /* synthetic */ List qAK;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    eJO(eJN eJN2, List list) {
        this.qAK = list;
    }

    public boolean t(eJS eJS2) {
        this.qAK.add(eJS2);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.t((eJS)object);
    }
}

