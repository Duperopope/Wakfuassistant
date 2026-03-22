/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cVA
 */
public class cva_2
implements adi_1 {
    protected static final Logger nPY = Logger.getLogger(cva_2.class);
    private static final cva_2 nPZ = new cva_2();
    private static final int nQa = 20000;
    private cvg_1 nQb;
    fes_2 nQc;
    private Runnable nQd;
    private fig_2 nOA;
    private alx_2 ikv;

    public static cva_2 eUD() {
        return nPZ;
    }

    public void a(cvg_1 cvg_12) {
        this.nQb = cvg_12;
        if (!aue_0.cVJ().c(this)) {
            aue_0.cVJ().a(this);
        } else {
            fse_1.gFu().b("infoView", this.nQb, "infoDialog");
        }
    }

    public void eUE() {
        if (this.nQd != null) {
            abg_2.bUP().h(this.nQd);
            this.nQd = null;
        }
        this.nQc.x(fsb_2.class);
        this.nQc.a(new fsb_2(this.nQc.getX(), this.nQc.getY(), this.nQc.getX(), fbj_1.getInstance().getHeight(), this.nQc, 0, 1000, abn.cdr));
        abg_2.bUP().a((Runnable)new cvb_1(this), 1000L, 1);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        aam_22.d();
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cvc_1(this);
            fyw_0.gqw().a(this.ikv);
            this.nOA = new cvd_2(this);
            ccg_2.eJI().a(this.nOA);
            this.nQc = (fes_2)ccj_2.pd("infoDialog");
            this.nQc.setVisible(false);
            this.nQc.setY(fbj_1.getInstance().getHeight());
            fse_1.gFu().b("infoView", this.nQb, "infoDialog");
            abg_2.bUP().a((Runnable)new cve_1(this), 1000L, 1);
            this.nQd = new cvf_2(this);
            abg_2.bUP().a(this.nQd, 20000L, 1);
            fyw_0.gqw().d("wakfu.info", cfc_1.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            ccg_2.eJI().b(this.nOA);
            fyw_0.gqw().tl("infoDialog");
            fyw_0.gqw().tc("wakfu.info");
            if (this.nQd != null) {
                abg_2.bUP().h(this.nQd);
                this.nQd = null;
            }
        }
    }
}

