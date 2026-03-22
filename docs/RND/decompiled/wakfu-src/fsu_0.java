/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from fsU
 */
class fsu_0
implements TObjectProcedure<fam_0> {
    final /* synthetic */ fsm_0 teE;
    final /* synthetic */ ArrayList teF;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fsu_0(fsm_0 fsm_02, ArrayList arrayList) {
        this.teE = fsm_02;
        this.teF = arrayList;
    }

    public boolean a(fam_0 fam_02) {
        fsJ fsJ2 = new fsJ(this.teE);
        fsJ2.k(fam_02);
        for (fsX fsX2 : fsJ2.glx()) {
            if (this.teF.contains(fsX2)) continue;
            this.teF.add(fsX2);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fam_0)object);
    }
}

