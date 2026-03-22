/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bKI
implements aeh_2 {
    protected static final Logger kpO = Logger.getLogger(bKI.class);
    public static final long kpP = 10000L;
    public static final String kpQ = "remainingSlots";
    public static final String kpR = "validLevel";
    public static final String kpS = "canDoAlone";
    public static final String kpT = "slots";
    public static final String kpU = "iconskill";
    public static final String kpV = "wait";
    public static final String kpW = "drawNumber";
    private static final short kpX = 100;
    private static final String[] kpY = new String[]{"validLevel", "remainingSlots", "canDoAlone", "slots", "iconskill", "wait"};
    private byte iqt = (byte)-1;
    private long kpZ;
    private fce_2 kqa;
    private fce_2 kqb;
    private boolean iqs;
    private int ejc;
    private long kqc;
    private boolean kqd;
    private bKK kqe;
    private bmv_2 kqf;
    private final aao_2 kqg = new bKJ(this);

    @Override
    public String[] bxk() {
        return kpY;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kpU)) {
            return this.ebR();
        }
        if (string.equals(kpW)) {
            return this.kqf == null ? 1 : this.kqf.fyP() - this.iqt;
        }
        if (string.equals(kpR)) {
            return false;
        }
        if (string.equals(kpQ)) {
            return this.iqt;
        }
        if (string.equals(kpS)) {
            return this.ebN();
        }
        if (string.equals(kpT)) {
            if (this.iqt == 1 && !this.iqs) {
                return 0;
            }
            return this.iqt;
        }
        if (string.equals(kpV)) {
            return this.iqs;
        }
        return null;
    }

    public void hU(boolean bl) {
        this.kqd = bl;
    }

    public final void ebM() {
        if (this.kpZ != 0L) {
            this.iqt = (byte)-1;
            this.kqf = null;
            this.kqe = null;
            abb_2.bUA().hk(this.kpZ);
            if (this.kqd) {
                this.kqa = null;
                this.kqb = null;
                fyw_0.gqw().tl("collectingProgressDialog");
            }
            this.kpZ = 0L;
        }
    }

    private void mZ(String string) {
        fse_1.gFu().a((aef_2)this, string);
    }

    public final void a(bKV bKV2, bmv_2 bmv_22, long l, byte by, boolean bl, double d2) {
        abb_2.bUA().hk(this.kpZ);
        this.kpZ = 0L;
        this.kqf = bmv_22;
        long l2 = System.currentTimeMillis();
        if (bl) {
            this.kqe = new bKO(true, l2, d2);
        } else if (l > 0L) {
            this.kqe = new bKP(true, l2, d2, (1.0 - d2) / (double)l);
        } else {
            this.ebM();
            this.ebS();
            return;
        }
        this.kpZ = abb_2.bUA().a(this.kqg, 100L, 1, -1L);
        boolean bl2 = this.iqs = bl && this.kqf.fyP() > 1;
        if (bl) {
            this.ebQ();
        }
        this.iqt = by;
        if (fyw_0.gqw().to("help" + bKV2.Sn())) {
            fyw_0.gqw().tl("help" + bKV2.Sn());
        }
        ccj_2.g("collectingProgressDialog", 73728L);
        fyw_0.gqw().a("collectingProgressDialog", aue_0.cVJ().cVK().ddI());
        this.ebO();
        fse_1.gFu().b("collectInProgress", this, "collectingProgressDialog");
        this.mZ(kpS);
        this.mZ(kpQ);
    }

    private boolean ebN() {
        return !this.iqs;
    }

    private void ebO() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("collectingProgressDialog");
        if (fhs_22 == null) {
            return;
        }
        this.kqb = (fce_2)fhs_22.uH("progressBarWait");
        this.kqa = (fce_2)fhs_22.uH("progressBar");
        if (this.kqe != null && this.kqa != null && this.kqb != null) {
            this.kqe.a(this.kqa, this.kqb);
        }
    }

    void ebP() {
        if (this.kqe == null) {
            return;
        }
        long l = System.currentTimeMillis();
        if (this.kqa != null && this.kqb != null) {
            this.kqe.a(l, this.kqa, this.kqb);
        }
        this.mZ(kpT);
        this.mZ(kpW);
        this.mZ(kpV);
        if (this.kqe.lH(l) >= 1.0) {
            if (this.kqe.kql) {
                this.ebM();
            } else {
                this.ebS();
            }
        }
    }

    private void ebQ() {
        String string = this.kqf.fyP() <= 1 ? "occupation.error.levelRequired" : "collect.warning.needHelp";
        aPd.e(string, new Object[0]);
    }

    private String ebR() {
        if (this.kqf != null) {
            switch (this.kqf.clf()) {
                case 4: 
                case 22: {
                    return "iconaxe";
                }
                case 3: 
                case 7: 
                case 8: 
                case 18: 
                case 19: 
                case 23: {
                    return "iconcollect";
                }
                case 2: {
                    return "iconreap";
                }
                case 9: {
                    return "iconpickaxe";
                }
                case 16: {
                    return "iconpick";
                }
            }
        }
        return "iconbag";
    }

    private void ebS() {
        aue_0.cVJ().cVK().dnY();
        bkc_2.dsD().dsE();
    }

    public final void a(bmv_2 bmv_22, long l) {
        this.ebM();
        this.kqf = bmv_22;
        long l2 = System.currentTimeMillis();
        if (l > Integer.MAX_VALUE) {
            this.kqe = new bKO(true, l2, 0.0);
            this.ebQ();
        } else if (l > 0L) {
            this.kqe = new bKP(true, l2, 0.0, 1.0 / (double)l);
        } else {
            this.ebM();
            this.ebS();
            return;
        }
        this.kpZ = abb_2.bUA().a(this.kqg, 100L, 1, -1L);
        this.iqt = 0;
        ccj_2.g("collectingProgressDialog", 73728L);
        fyw_0.gqw().a("collectingProgressDialog", aue_0.cVJ().cVK().ddI());
        fse_1.gFu().b("collectInProgress", this, "collectingProgressDialog");
        this.ebO();
        this.mZ(kpS);
        this.mZ(kpQ);
    }

    public void C(long l, long l2) {
        this.ebM();
        this.kqc = l;
        this.kqe = new bKP(true, System.currentTimeMillis(), 0.0, 1.0 / (double)l2);
        this.kpZ = abb_2.bUA().a(this.kqg, 100L, 1, -1L);
        this.iqt = 0;
        ccj_2.g("collectingProgressDialog", 73728L);
        fyw_0.gqw().a("collectingProgressDialog", aue_0.cVJ().cVK().ddI());
        fse_1.gFu().b("collectInProgress", this, "collectingProgressDialog");
        this.ebO();
        this.mZ(kpS);
    }

    public void lF(long l) {
        this.ebM();
        this.kqe = new bKP(true, System.currentTimeMillis(), 0.0, 1.0 / (double)l, true);
        this.kpZ = abb_2.bUA().a(this.kqg, 100L, 1, -1L);
        this.iqt = 0;
        ccj_2.g("collectingProgressDialog", 73728L);
        fyw_0.gqw().a("collectingProgressDialog", aue_0.cVJ().cVK().ddI());
        fse_1.gFu().b("collectInProgress", this, "collectingProgressDialog");
        this.ebO();
        this.mZ(kpS);
    }

    public void C(long l, int n) {
        this.ebM();
        this.ejc = n;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        this.kqe = new bKP(false, System.currentTimeMillis(), 0.0, 1.0 / (double)l);
        this.kpZ = abb_2.bUA().a(this.kqg, 100L, 1, -1L);
        this.iqt = 0;
        ccj_2.g("collectingProgressDialog", 73728L);
        fyw_0.gqw().a("collectingProgressDialog", bgt_02.ddI());
        fse_1.gFu().b("collectInProgress", this, "collectingProgressDialog");
        this.ebO();
        this.mZ(kpS);
    }

    public void lG(long l) {
        this.ebM();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        this.kqe = new bKP(false, System.currentTimeMillis(), 0.0, 1.0 / (double)l);
        this.kpZ = abb_2.bUA().a(this.kqg, 100L, 1, -1L);
        this.iqt = 0;
        ccj_2.g("collectingProgressDialog", 73728L);
        fyw_0.gqw().a("collectingProgressDialog", bgt_02.ddI());
        fse_1.gFu().b("collectInProgress", this, "collectingProgressDialog");
        this.ebO();
        this.mZ(kpS);
    }

    public void ebT() {
        if (this.kqd) {
            this.kqa = null;
            this.kqb = null;
            fyw_0.gqw().tl("collectingProgressDialog");
        }
        abb_2.bUA().hk(this.kpZ);
    }

    public int cms() {
        return this.kqf == null ? this.ejc : this.kqf.cms();
    }

    public long ebU() {
        return this.kqc;
    }

    public void HP(int n) {
        this.iqt = (byte)n;
    }
}

