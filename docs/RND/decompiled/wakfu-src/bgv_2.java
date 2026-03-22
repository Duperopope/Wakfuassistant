/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bGV
 */
public class bgv_2
extends fhc_0
implements aeh_2,
bef_0,
bek_0,
ejl_0,
ffc_2 {
    private final beg_1 jWN = new beg_1(this);
    private bfw_1 jWO;
    private bey_1 jWP;

    bgv_2() {
    }

    void a(bfw_1 bfw_12) {
        this.jWO = bfw_12;
    }

    void a(bey_1 bey_12) {
        this.jWP = bey_12;
    }

    public bfw_1 dUr() {
        return this.jWO;
    }

    @Override
    public String getName() {
        return aum_0.cWf().a(15, (long)this.d(), new Object[0]);
    }

    @Override
    public String dah() {
        return aum_0.cWf().b(15, (long)this.d(), new Object[0]);
    }

    public boolean wq() {
        return aum_0.cWf().e(15, this.d());
    }

    public static String Dm(int n) {
        return aum_0.cWf().a(15, (long)n, new Object[0]);
    }

    public static String Dn(int n) {
        return aum_0.cWf().b(15, (long)n, new Object[0]);
    }

    public static boolean Do(int n) {
        return aum_0.cWf().e(15, n);
    }

    @Override
    public String getDescription() {
        if (!aum_0.cWf().e(16, this.d())) {
            return "";
        }
        return aum_0.cWf().a(16, (long)this.d(), new Object[0]);
    }

    @Override
    public String[] bxk() {
        return this.jWN.bxk();
    }

    @Override
    public Object eu(String string) {
        return this.jWN.eu(string);
    }

    @Override
    public beg_1 dSz() {
        return this.jWN;
    }

    @Override
    public bgv_2 duo() {
        return this;
    }

    public boolean dUs() {
        return aue_0.cVJ().c(ctg_1.eQG()) && ctg_1.eQG().MM(this.d());
    }

    @Override
    public boolean dUt() {
        ang_2 ang_22 = this.a(ffj_0.sgh);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return ang_22 == null || ang_22.b(bgt_02, this, null, bgt_02.fgg());
    }

    public bey_1 dUu() {
        return this.jWP;
    }

    public void dUv() {
        ctd_2.eQA().i(this);
    }

    @Override
    public boolean dUw() {
        if (this.dGh().fZq().length != 0) {
            return true;
        }
        fgl_0 fgl_02 = this.fUZ();
        return fgl_02 instanceof bfs_1;
    }

    public boolean dUx() {
        if (this.dwg() == fgj.siI) {
            return false;
        }
        if (!this.wq()) {
            return false;
        }
        if (this.fVc() != fgW.smf) {
            return false;
        }
        if (this.c(fgg_0.siv)) {
            return false;
        }
        if (!auc_0.cVq().zy(this.aVt())) {
            return false;
        }
        ang_2 ang_22 = this.a(ffj_0.sgg);
        return ang_22 == null || ang_22.b(null, this, this, null);
    }

    @Override
    public String cUG() {
        return this.dah();
    }

    @Override
    @Nullable
    public ejm_0 drG() {
        return ejm_0.qyY;
    }

    @Override
    @Nullable
    public Object drH() {
        return this.d();
    }

    @Override
    public String drI() {
        return this.getName();
    }
}

