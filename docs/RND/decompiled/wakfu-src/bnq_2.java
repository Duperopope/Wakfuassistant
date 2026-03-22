/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from bnq
 */
class bnq_2
implements TObjectProcedure<bez_1> {
    final /* synthetic */ boolean iHJ;
    final /* synthetic */ ArrayList iHK;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bnq_2(bnp_2 bnp_22, boolean bl, ArrayList arrayList) {
        this.iHJ = bl;
        this.iHK = arrayList;
    }

    public boolean a(bez_1 bez_12) {
        Iterator iterator = bez_12.bk(this.iHJ);
        while (iterator.hasNext()) {
            this.iHK.add((bea_0)iterator.next());
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bez_1)object);
    }
}

