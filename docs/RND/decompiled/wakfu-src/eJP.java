/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.List;

class eJP
implements TObjectProcedure<eJS> {
    final /* synthetic */ List qAL;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    eJP(eJN eJN2, List list) {
        this.qAL = list;
    }

    public boolean t(eJS eJS2) {
        if (eJS2.efO() || eKb.qBe.dK(eJS2.aWP()) || eJS2.fxy()) {
            this.qAL.add(eJS2);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.t((eJS)object);
    }
}

