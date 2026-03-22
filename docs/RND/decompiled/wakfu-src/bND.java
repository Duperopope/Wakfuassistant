/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bND
implements aeh_2,
frp,
frq {
    private static final String kDU = "progressBarWait";
    private static final String kDV = "progressBar";
    private static final short kDW = 100;
    private static frp kDX;
    private fce_2 kqa;
    private fce_2 kqb;
    private long kpZ;
    private bKK kqe;
    private Long kDY;
    private final aao_2 kDZ = new bNE(this);

    public static bND lW(long l) {
        bND bND2 = new bND();
        bND2.kDY = l;
        return bND2;
    }

    public void egf() {
        frq.super.a(aue_0.cVJ().cVK(), this);
    }

    @Override
    public long egg() {
        if (this.kDY == null) {
            return frq.super.egg();
        }
        return this.kDY;
    }

    @Override
    public void cby() {
        this.ebO();
        this.b(this.egg(), 0.0);
        if (kDX != null) {
            kDX.cby();
        }
    }

    @Override
    public void egh() {
        if (kDX != null) {
            kDX.egh();
        }
        this.egj();
    }

    @Override
    public void dPF() {
        if (kDX != null) {
            kDX.dPF();
        }
        this.egj();
    }

    private void ebO() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("collectingProgressDialog");
        if (fhs_22 == null) {
            return;
        }
        this.kqb = (fce_2)fhs_22.uH(kDU);
        this.kqa = (fce_2)fhs_22.uH(kDV);
        if (this.kqe == null || this.kqa == null || this.kqb == null) {
            return;
        }
        this.kqe.a(this.kqa, this.kqb);
    }

    public final void b(long l, double d2) {
        abb_2.bUA().hk(this.kpZ);
        this.kpZ = 0L;
        long l2 = System.currentTimeMillis();
        if (l <= 0L) {
            this.dPF();
            return;
        }
        this.kqe = new bKP(true, l2, d2, (1.0 - d2) / (double)l);
        this.kpZ = abb_2.bUA().a(this.kDZ, 100L, 1, -1L);
        ccj_2.g("collectingProgressDialog", 73728L);
        fyw_0.gqw().a("collectingProgressDialog", aue_0.cVJ().cVK().ddI());
        this.ebO();
        fse_1.gFu().b("collectInProgress", this, "collectingProgressDialog");
    }

    void egi() {
        if (this.kqe == null) {
            return;
        }
        long l = System.currentTimeMillis();
        if (this.kqa != null && this.kqb != null) {
            this.kqe.a(l, this.kqa, this.kqb);
        }
        if (this.kqe.lH(l) < 1.0) {
            return;
        }
        this.dPF();
    }

    public static void a(frp frp2) {
        kDX = frp2;
    }

    public final void egj() {
        if (this.kpZ == 0L) {
            return;
        }
        this.kqe = null;
        abb_2.bUA().hk(this.kpZ);
        this.kqa = null;
        this.kqb = null;
        if (fyw_0.gqw().to("collectingProgressDialog")) {
            fyw_0.gqw().tl("collectingProgressDialog");
        }
        this.kpZ = 0L;
        kDX = null;
    }

    @Override
    public String[] bxk() {
        return new String[]{"drawNumber", "iconskill", "slots", "wait"};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if ("drawNumber".equals(string)) {
            return 1;
        }
        if ("iconskill".equals(string)) {
            return "iconfight";
        }
        if ("slots".equals(string)) {
            return 0;
        }
        if ("wait".equals(string)) {
            return false;
        }
        return null;
    }
}

