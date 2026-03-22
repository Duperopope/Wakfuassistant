/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from fST
 */
public class fst_1 {
    private static final fst_1 vfa = new fst_1();
    private final ArrayList<ftj_2> vfb = new ArrayList();

    public static fst_1 gGA() {
        return vfa;
    }

    public void a(ftj_2 ftj_22) {
        if (!this.vfb.contains(ftj_22)) {
            this.vfb.add(ftj_22);
        }
    }

    public void b(ftj_2 ftj_22) {
        if (this.vfb.contains(ftj_22)) {
            this.vfb.remove(ftj_22);
        }
    }

    public void cVc() {
        for (ftj_2 ftj_22 : this.vfb) {
            ftj_22.gAI();
        }
    }

    public void a(fhv_2 fhv_22, int n, int n2) {
        if (fhv_22 == null || n == 0 && n2 == 0) {
            return;
        }
        fkj_2.gCW().a(fhv_22, n, n2);
        float f2 = fhv_22.getScale();
        float f3 = fhv_22.bRq() / f2;
        float f4 = fhv_22.bRr() / f2;
        Iterator<fhv_1> iterator = fyw_0.gqw().gqO();
        while (iterator.hasNext()) {
            fey_2 fey_22;
            frp_1 frp_12;
            fes_2 fes_22;
            fhv_1 fhv_12 = iterator.next();
            if (!(fhv_12 instanceof fes_2) || !((fes_22 = (fes_2)fhv_12).getLayoutData() instanceof frp_1) || !(frp_12 = (frp_1)fes_22.getLayoutData()).isInitValue() || fes_22 instanceof fey_2 && (fey_22 = (fey_2)fes_22).getStickData() != null) continue;
            int n3 = fes_22.getWidth();
            int n4 = fes_22.getHeight();
            int n5 = (int)((f3 - (float)n3) * fes_22.getXPercInParent());
            int n6 = (int)((f4 - (float)n4) * fes_22.getYPercInParent());
            n5 = GC.a(n5, 0, (int)(f3 - (float)n3));
            n6 = GC.a(n6, 0, (int)(f4 - (float)n4));
            fes_22.setPosition(n5, n6, 0, false, false);
        }
    }
}

