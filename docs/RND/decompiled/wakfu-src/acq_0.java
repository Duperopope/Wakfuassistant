/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from acq
 */
public final class acq_0
implements asw_2 {
    private static final Logger cgd = Logger.getLogger(acq_0.class);
    public static final acq_0 cge = new acq_0();
    private final ArrayList<acu_0> cgf = new ArrayList();
    private final ArrayList<acu_0> cgg = new ArrayList();
    private final ArrayList<acx_0> cgh = new ArrayList(3000);
    private final ArrayList<acx_0> cgi = new ArrayList(3000);
    private static final Comparator<acv_0> cgj = new acr_0();
    private final acj_0 cgk = acj_0.btR();
    private final ArrayList<acv_0> cgl = new ArrayList(8);
    private final ArrayList<acw_0> cgm = new ArrayList(3);
    private final ArrayList<acv_0> cgn = new ArrayList(8);
    private final ArrayList<ace> cgo = new ArrayList();
    private float cgp;
    private float cgq;
    private boolean cgr = true;
    private boolean cgs = true;
    private boolean cgt = true;
    @Nullable
    private acy_0 cgu = null;
    private final float[] cgv = new float[6];

    private acq_0() {
        this.cgl.add(this.cgk);
    }

    public void aPg() {
        asx_2.day.a(new acl_0(), this);
        this.reset();
    }

    public boolean btz() {
        return this.cgt;
    }

    public void bZ(boolean bl) {
        this.cgt = bl;
    }

    @Nullable
    public acy_0 btA() {
        return this.cgu;
    }

    public void a(@Nullable acy_0 acy_02) {
        this.cgu = acy_02;
    }

    public acf rE(int n) {
        return acm_0.btv().rE(n);
    }

    public void rF(int n) {
        acf acf2 = this.rE(n);
        if (acf2 != null) {
            acf2.setEnabled(true);
        }
    }

    public void rG(int n) {
        acf acf2 = this.rE(n);
        if (acf2 != null) {
            acf2.setEnabled(false);
        }
    }

    public void rD(int n) {
        acm_0.btv().rD(n);
    }

    public void bn(int n, int n2) {
        if (n2 == 0) {
            this.rD(n);
            return;
        }
        acf acf2 = this.rE(n);
        if (acf2 != null) {
            acf2.ut(n2);
        }
    }

    @Override
    public void a(ast_2 ast_22) {
        acm_0.btv().c((acf)ast_22);
    }

    @Override
    public void b(ast_2 ast_22) {
        acm_0.btv().rD(ast_22.d());
    }

    public void a(acu_0 acu_02) {
        if (!this.cgf.contains(acu_02)) {
            this.cgf.add(acu_02);
        }
    }

    public void b(acu_0 acu_02) {
        if (!this.cgg.contains(acu_02)) {
            this.cgg.add(acu_02);
        }
    }

    public void c(acu_0 acu_02) {
        this.cgf.remove(acu_02);
    }

    public void a(acv_0 acv_02) {
        if (!this.cgl.contains(acv_02)) {
            this.cgl.add(acv_02);
            this.cgl.sort(cgj);
            if (acv_02 instanceof acw_0) {
                this.cgm.add((acw_0)acv_02);
            }
        }
    }

    public void b(acv_0 acv_02) {
        this.cgl.remove(acv_02);
        this.cgm.remove(acv_02);
    }

    public void a(ace ace2) {
        if (!this.cgo.contains(ace2)) {
            this.cgo.add(ace2);
        }
    }

    public void b(ace ace2) {
        this.cgo.remove(ace2);
    }

    public void c(afV afV2, int n) {
        this.rH(n);
        if (!this.cgt) {
            return;
        }
        this.d(afV2);
        if (this.cgk.btS()) {
            this.btC();
            this.btB();
            this.cgk.cc(false);
        } else {
            if (this.cgr) {
                this.btC();
            }
            if (this.cgs) {
                this.btB();
            }
        }
        this.btD();
        this.ca(false);
        this.m(this.cgh);
        this.ca(true);
        this.m(this.cgi);
    }

    private void rH(int n) {
        this.rI(n);
        acm_0.btv().b(this.cgq, n);
    }

    private void ca(boolean bl) {
        this.cgn.clear();
        int n = this.cgl.size();
        for (int i = 0; i < n; ++i) {
            acv_0 acv_02 = this.cgl.get(i);
            if (acv_02.bpa() || bl && !acv_02.btH()) continue;
            this.cgn.add(acv_02);
        }
    }

    private void btB() {
        this.cgk.cp(this.cgq);
        this.cgs = false;
    }

    private void btC() {
        this.cgk.co(this.cgp);
        this.cgr = false;
    }

    private void rI(int n) {
        int n2 = this.cgl.size();
        for (int i = 0; i < n2; ++i) {
            this.cgl.get(i).qF(n);
        }
    }

    private void d(afV afV2) {
        int n;
        int n2;
        agf agf2 = afV2.brf();
        int n3 = Integer.MAX_VALUE;
        int n4 = Integer.MIN_VALUE;
        int n5 = Integer.MAX_VALUE;
        int n6 = Integer.MIN_VALUE;
        this.cgh.clear();
        this.cgi.clear();
        int n7 = this.cgf.size();
        for (n2 = 0; n2 < n7; ++n2) {
            this.cgf.get(n2).a(agf2, this.cgh);
        }
        n2 = this.cgg.size();
        for (int i = 0; i < n2; ++i) {
            this.cgg.get(i).a(agf2, this.cgi);
        }
        Iterator iterator = Iterators.concat(this.cgh.iterator(), this.cgi.iterator());
        while (iterator.hasNext()) {
            acx_0 acx_02 = (acx_0)iterator.next();
            n = acx_02.bcC();
            int n8 = acx_02.bcD();
            if (n < n3) {
                n3 = n;
            }
            if (n > n4) {
                n4 = n;
            }
            if (n8 < n5) {
                n5 = n8;
            }
            if (n8 <= n6) continue;
            n6 = n8;
        }
        n = this.cgm.size();
        for (int i = 0; i < n; ++i) {
            this.cgm.get(i).h(n3, n5, n4 - n3 + 1, n6 - n5 + 1);
        }
    }

    private void btD() {
        int n = this.cgm.size();
        for (int i = 0; i < n; ++i) {
            this.cgm.get(i).btl();
        }
    }

    private void m(List<acx_0> list) {
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            acx_0 acx_02 = list.get(i);
            try {
                int n2 = acx_02.bcC();
                int n3 = acx_02.bcD();
                short s = acx_02.bcE();
                short s2 = acx_02.bqi();
                this.b(n2, n3, s, s2, this.cgv);
                if (this.cgu != null && !this.cgu.mustApplyLighting(acx_02)) continue;
                acx_02.p(this.cgv);
                continue;
            }
            catch (RuntimeException runtimeException) {
                cgd.error((Object)("Unable to apply lights on object : " + String.valueOf(acx_02)), (Throwable)runtimeException);
            }
        }
    }

    private void b(int n, int n2, int n3, int n4, float[] fArray) {
        fArray[0] = 1.0f;
        fArray[1] = 1.0f;
        fArray[2] = 1.0f;
        int n5 = this.cgn.size();
        for (int i = 0; i < n5; ++i) {
            this.cgn.get(i).a(n, n2, n3, n4, fArray);
        }
    }

    public void reset() {
        this.cgl.clear();
        this.cgm.clear();
        this.cj(1.0f);
        this.cgr = true;
        this.cgs = true;
        acm_0.btv().btw();
        this.a(this.cgk);
        this.a(acd.btq());
        this.a(acm_0.btv());
    }

    public void btE() {
        this.cgk.cc(true);
    }

    public void aK(float f2, float f3) {
        int n;
        int n2 = this.cgo.size();
        if (!arn_2.aY(this.cgp, f2)) {
            this.cgp = f2;
            this.cgr = true;
            for (n = 0; n < n2; ++n) {
                this.cgo.get(n).cg(this.cgp);
            }
        }
        if (!arn_2.aY(this.cgq, f3)) {
            this.cgq = f3;
            this.cgs = true;
            for (n = 0; n < n2; ++n) {
                this.cgo.get(n).ch(this.cgq);
            }
        }
    }

    public void cj(float f2) {
        float f3 = f2 > 0.001f ? f2 : 0.0f;
        float f4 = f2 < -0.001f ? -f2 : 0.0f;
        this.aK(f3, f4);
    }

    public float btF() {
        return this.cgq;
    }

    public float btG() {
        return this.cgp;
    }
}

