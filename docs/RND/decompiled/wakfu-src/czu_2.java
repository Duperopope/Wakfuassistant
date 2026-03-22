/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cZu
 */
public class czu_2 {
    private czu_2() {
    }

    public static void h(fes_2 fes_22) {
        awx_2 awx_22 = new awx_2(aid_0.dVa.aTn());
        awx_2 awx_23 = new awx_2(awx_2.dnF.aTn());
        fys_0 fys_02 = fes_22.getAppearance();
        fsa_2 fsa_22 = new fsa_2(awx_22, awx_23, fys_02, 0, 500, -1, abn.cdr);
        fys_02.a(fsa_22);
        czv_2 czv_22 = new czv_2(fys_02, fes_22);
        fes_22.a(fzq_0.tJU, czv_22, false);
    }

    public static void g(fhs_2 fhs_22) {
        Object object;
        Object object2;
        fes_2 fes_22 = null;
        ArrayList<fzc> arrayList = new ArrayList<fzc>();
        Object object3 = new fsq_1(fhs_22);
        while (((fsq_1)object3).hasNext()) {
            object2 = ((fsq_1)object3).gGy();
            if (!(object2 instanceof fes_2)) continue;
            object = (fes_2)object2;
            if (fes_22 == null) {
                fes_22 = object;
            }
            arrayList.add(((fes_2)object).getAppearance());
        }
        if (fes_22 == null) {
            return;
        }
        object3 = new awx_2(awx_2.dnF.aTn());
        object2 = new awx_2(awx_2.dnC.aTn());
        object = new fsz_2((axb_2)object3, (axb_2)object2, arrayList, 0, 250, 6, abn.cdr);
        fes_22.a((fsr_2)object);
    }
}

