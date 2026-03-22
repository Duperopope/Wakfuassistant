/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from bZK
 */
class bzk_2
implements TObjectProcedure<ni_1> {
    final /* synthetic */ ArrayList lDV;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bzk_2(bzj_2 bzj_22, ArrayList arrayList) {
        this.lDV = arrayList;
    }

    public boolean b(ni_1 ni_12) {
        this.lDV.add(ni_12);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((ni_1)object);
    }
}

