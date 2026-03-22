/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from cax
 */
class cax_2
implements TObjectProcedure<fam_0> {
    final /* synthetic */ ArrayList lGC;
    final /* synthetic */ ArrayList lGD;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cax_2(cav_2 cav_22, ArrayList arrayList, ArrayList arrayList2) {
        this.lGC = arrayList;
        this.lGD = arrayList2;
    }

    public boolean a(fam_0 fam_02) {
        if (fam_02.erN().coy()) {
            this.lGC.add(fam_02);
        } else {
            this.lGD.add(fam_02);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fam_0)object);
    }
}

