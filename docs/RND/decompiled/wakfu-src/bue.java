/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;

public class bue
implements ewr_1 {
    public static final bue jop = new bue();
    private final aah_1<bcp_1> joq = new aah_1();
    private final ArrayList<bcv_1> jor = new ArrayList();
    private final Object jos = new Object();

    private bue() {
    }

    @Override
    public void dHN() {
        this.jor.clear();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void Fw(int n) {
        bqm_0.jbp.b(new brp_0());
        Object object = this.jos;
        synchronized (object) {
            this.joq.b(n, new bcp_1(n));
        }
        bci_2.hDG.daO();
        abg_2.bUP().a((Runnable)new buf(this), 500L, 1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void Fx(int n) {
        Object object = this.jos;
        synchronized (object) {
            this.joq.wp(n);
        }
        bci_2.hDG.daO();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(int n, ewx_1 ewx_12) {
        Object object = this.jos;
        synchronized (object) {
            bcp_1 bcp_12 = this.joq.vK(n);
            bcp_12.dbu();
            this.b(n, ewx_12);
            if (ewx_12 == ewx_1.rCT) {
                cAY.eHc().nP(600074L);
                this.Fy(n);
            } else if (ewx_12 == ewx_1.rCU) {
                cAY.eHc().nP(600125L);
                this.Fy(n);
            }
            this.jor.add(new bch_1(n, ewx_12, bcp_12.daK()));
        }
    }

    private void Fy(int n) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("topHudDialog");
        fbz_2 fbz_22 = (fbz_2)fhs_22.uH("fightChallengesList");
        int n2 = fbz_22.aVo();
        for (int i = 0; i < n2; ++i) {
            bcp_1 bcp_12 = (bcp_1)fbz_22.getValue(i);
            if (bcp_12.d() != n) continue;
            fcv_1 fcv_12 = (fcv_1)fbz_22.getWidget(null, i);
            czu_2.g(fcv_12.getInnerElementMap());
            return;
        }
    }

    private void b(int n, ewx_1 ewx_12) {
        String string;
        ahv_2 ahv_22 = new ahv_2().ceu().e(aPc.eww);
        ahv_22.c(aum_0.cWf().a(140, (long)n, new Object[0]));
        String string2 = ahv_22.ceL();
        if (ewx_12 == ewx_1.rCT) {
            string = aum_0.cWf().c("fightChallenges.success", string2);
        } else if (ewx_12 == ewx_1.rCU) {
            string = aum_0.cWf().c("fightChallenges.failure", string2);
        } else {
            return;
        }
        ahv_22 = new ahv_2().ceC().e(aPc.ewv);
        ahv_22.c(string);
        aPh.czg().iZ(ahv_22.ceL());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Collection<bcp_1> dIL() {
        Object object = this.jos;
        synchronized (object) {
            if (this.joq.bTT()) {
                return null;
            }
            ArrayList<bcp_1> arrayList = new ArrayList<bcp_1>();
            for (bcp_1 bcp_12 : this.joq) {
                arrayList.add(bcp_12);
            }
            return arrayList;
        }
    }

    public Collection<bcv_1> dIM() {
        ArrayList<bcv_1> arrayList = new ArrayList<bcv_1>();
        arrayList.addAll(this.jor);
        return arrayList;
    }
}

