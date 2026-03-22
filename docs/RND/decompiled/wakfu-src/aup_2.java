/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from auP
 */
class aup_2
implements TObjectProcedure<aul_2> {
    final /* synthetic */ ArrayList dfz;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aup_2(ArrayList arrayList) {
        this.dfz = arrayList;
    }

    public boolean a(aul_2 aul_22) {
        aul_22.gz(aum_2.dfy);
        if (aul_22.dfl < aum_2.dfy - 500L) {
            this.dfz.add(aul_22.dfh);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((aul_2)object);
    }
}

