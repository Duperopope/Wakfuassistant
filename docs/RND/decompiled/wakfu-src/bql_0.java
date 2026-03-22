/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Optional;

/*
 * Renamed from bqL
 */
public class bql_0 {
    private static final String jbf = "event.client.";
    private final int jbg;
    private final int jbh;
    private final String[] jbi;
    private final ang_2 jbj;
    private final int jbk;
    private final int jbl;
    private final boolean jbm;
    private boolean Na;
    private final fiH<bqu_0> jbn;

    public bql_0(int n, int n2, String[] stringArray, ang_2 ang_22, int n3, int n4, boolean bl) {
        this.jbg = n;
        this.jbh = n2;
        this.jbi = stringArray;
        this.jbj = ang_22;
        this.jbk = n3;
        this.jbl = n4;
        this.Na = bl;
        this.jbm = bl;
        this.jbn = new fiH();
    }

    public void a(bru_0 bru_02) {
        int n;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        Object CPS = ((bsg_1)aie_0.cfn().bmH()).bxm();
        if (this.jbl > 0 && CPS != null && (n = CPS.hF(jbf + this.jbg)) >= this.jbl) {
            return;
        }
        if (this.jbj != null && !this.jbj.b(bgt_02, null, bru_02, bgt_02.bdV())) {
            return;
        }
        n = ve_0.pV(100);
        if (n > this.jbk) {
            return;
        }
        Optional<bqu_0> optional = this.jbn.w(bgt_02, null, bru_02, bgt_02.bdV());
        if (optional.isPresent()) {
            ArrayList<bqq_0> arrayList = optional.get().aGT();
            int n2 = arrayList.size();
            for (int i = 0; i < n2; ++i) {
                arrayList.get(i).bGy();
            }
        }
        if (this.jbl > 0 && CPS != null) {
            int n3 = CPS.hF(jbf + this.jbg);
            CPS.k(jbf + this.jbg, n3 + 1);
        }
    }

    public fiH<bqu_0> dEz() {
        return this.jbn;
    }

    public void a(bqu_0 bqu_02) {
        this.jbn.a(bqu_02);
    }

    public int dEA() {
        return this.jbh;
    }

    public String[] dEB() {
        return this.jbi;
    }

    public ang_2 dEC() {
        return this.jbj;
    }

    public float dED() {
        return this.jbk;
    }

    public int d() {
        return this.jbg;
    }

    public boolean apo() {
        return this.Na;
    }

    public void T(boolean bl) {
        this.Na = bl;
    }

    public void dEE() {
        this.Na = this.jbm;
    }
}

