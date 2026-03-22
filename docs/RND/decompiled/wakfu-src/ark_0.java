/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from aRk
 */
class ark_0
implements TObjectProcedure<ewp_1> {
    final /* synthetic */ ArrayList eJm;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ark_0(aRj aRj2, ArrayList arrayList) {
        this.eJm = arrayList;
    }

    public boolean a(ewp_1 ewp_12) {
        this.eJm.add(new aRl(ewp_12));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ewp_1)object);
    }
}

