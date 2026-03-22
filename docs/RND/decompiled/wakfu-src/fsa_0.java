/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from fsA
 */
class fsa_0
implements TObjectProcedure<fam_0> {
    final /* synthetic */ aci_1 tdR;
    final /* synthetic */ ArrayList tdS;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fsa_0(fsz_0 fsz_02, aci_1 aci_12, ArrayList arrayList) {
        this.tdR = aci_12;
        this.tdS = arrayList;
    }

    public boolean a(fam_0 fam_02) {
        if (this.tdR.e(fam_02.fRe())) {
            this.tdS.add(fam_02);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fam_0)object);
    }
}

