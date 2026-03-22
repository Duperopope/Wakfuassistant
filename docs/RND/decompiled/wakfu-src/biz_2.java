/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from bIz
 */
class biz_2
implements TObjectProcedure<fam_0> {
    final /* synthetic */ ArrayList kgG;
    final /* synthetic */ cav_2 kgH;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    biz_2(ArrayList arrayList, cav_2 cav_22) {
        this.kgG = arrayList;
        this.kgH = cav_22;
    }

    public boolean a(fam_0 fam_02) {
        fbk_0 fbk_02 = fam_02.erN();
        if (!fbk_02.coy()) {
            fbn_0 fbn_02 = (fbn_0)fbk_02;
            String string = biy_2.a(fbn_02);
            fso_1 fso_12 = biy_2.b(fbn_02);
            int n = fam_02.fRc() + fam_02.fRg().getWidth() / 2;
            int n2 = fam_02.fRd() + fam_02.fRg().getHeight() / 2;
            this.kgG.add(new fsn_1(n, n2, 0.0f, this.kgH.bhh(), string, fam_02, fso_12, biy_2.kgE));
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fam_0)object);
    }
}

