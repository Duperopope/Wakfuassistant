/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bRJ
 */
class brj_2
extends fka_0 {
    static final Logger lbY = Logger.getLogger(brj_2.class);
    private final brk_2 lbZ = new brk_2(this);
    private static final boolean lca = false;
    private static final int lcb = 3000;
    private long lcc = -1L;
    private long lcd = -1L;

    brj_2(bri_2 bri_22) {
        super(bri_22);
    }

    @Override
    public void run() {
        long l = ue_0.bjV().bjg();
        int n = this.sAf.gdd();
        super.run();
        if (n != this.sAf.gdd()) {
            ((bri_2)this.sAf).Jn(n);
            this.lbZ.iy(false);
        }
        if (this.lcd != -1L) {
            long l2 = this.bVs();
            cvz_2.eUZ().No(3000);
            this.lbZ.mo(l2 - this.lcd);
            this.lcc = l;
            this.lcd = -1L;
        }
        if (this.lcc != -1L && l - this.lcc > 3000L) {
            this.lbZ.mo(0L);
            this.lcc = -1L;
        }
        if (this.bVs() <= 0L) {
            this.bVk();
        }
        this.elw();
    }

    @Override
    public void dX(int n, int n2) {
        this.lcd = this.WH(n2);
        super.dX(n, n2);
    }

    @Override
    public boolean bVk() {
        lbY.info((Object)"Purgation de peine termin\u00e9e");
        super.bVk();
        this.elu();
        cje_0 cje_02 = new cje_0();
        cje_02.lT(10006703);
        aue_0.cVJ().etu().d(cje_02);
        return false;
    }

    @Override
    public void elu() {
        lbY.info((Object)"Purgation de peine stopp\u00e9e");
        fse_1.gFu().f("jailFlag", (Object)null);
        if (aue_0.cVJ().c(cvz_2.eUZ())) {
            aue_0.cVJ().b(cvz_2.eUZ());
        }
        abg_2.bUP().h(this);
    }

    @Override
    public void elv() {
        lbY.info((Object)("Purgation de peine d\u00e9marr\u00e9e avec une dur\u00e9e de " + this.bVs() + "ms"));
        fse_1.gFu().f("jailFlag", this.lbZ);
        if (!aue_0.cVJ().c(cvz_2.eUZ())) {
            aue_0.cVJ().a(cvz_2.eUZ());
        }
    }

    public void elw() {
        fse_1.gFu().a((aef_2)this.lbZ, "remainingTime");
    }

    static /* synthetic */ flr_0 a(brj_2 brj_22) {
        return brj_22.sAf;
    }
}

