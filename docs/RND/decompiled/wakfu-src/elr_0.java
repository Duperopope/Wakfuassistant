/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eLr
 */
public class elr_0 {
    public static final elr_0 qGh = new elr_0();
    private final aah_1<ekw_0> qGi = new aah_1();
    private final aah_1<ely_0> qGj = new aah_1();

    public void a(ely_0 ely_02) {
        int n = ely_02.d();
        this.qGj.b(n, ely_02);
        if (ely_02.cmw()) {
            this.qGi.b(n, new ekw_0());
        }
    }

    public ely_0 Ri(int n) {
        return this.qGj.vK(n);
    }

    public ekw_0 QW(int n) {
        return this.qGi.vK(n);
    }

    public void E(TObjectProcedure<ely_0> tObjectProcedure) {
        int n = this.qGj.bTR();
        for (int i = 0; i < n; ++i) {
            ely_0 ely_02 = this.qGj.vU(i);
            if (!ely_02.cmv() || tObjectProcedure.execute((Object)ely_02)) continue;
            return;
        }
    }

    public int qK() {
        return this.qGj.bTR();
    }

    public void F(TObjectProcedure<ely_0> tObjectProcedure) {
        int n = this.qGj.bTR();
        for (int i = 0; i < n; ++i) {
            ely_0 ely_02 = this.qGj.vU(i);
            if (tObjectProcedure.execute((Object)ely_02)) continue;
            return;
        }
    }

    public boolean M(int ... nArray) {
        int n = this.qGj.bTR();
        for (int i = 0; i < n; ++i) {
            ely_0 ely_02 = this.qGj.vU(i);
            for (int j = 0; j < nArray.length; ++j) {
                int n2 = nArray[j];
                if (!ely_02.Rc(n2)) continue;
                return true;
            }
        }
        return false;
    }

    public elt_0 Rj(int n) {
        int n2 = this.qGj.bTR();
        for (int i = 0; i < n2; ++i) {
            ely_0 ely_02 = this.qGj.vU(i);
            elt_0 elt_02 = ely_02.Rn(n);
            if (elt_02 == null) continue;
            return elt_02;
        }
        return null;
    }
}

