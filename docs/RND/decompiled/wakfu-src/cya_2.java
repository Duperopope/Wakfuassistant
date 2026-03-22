/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cYa
 */
public class cya_2
implements adi_1 {
    protected static final Logger nXB = Logger.getLogger(cya_2.class);
    private static final cya_2 nXC = new cya_2();
    private static final int nXD = 20000;
    private cyg_2 nXE;
    fes_2 nQc;
    private Runnable nQd;
    private fig_2 nOA;
    private alx_2 ikv;

    public static cya_2 eXM() {
        return nXC;
    }

    public void a(cyg_2 cyg_22) {
        this.nXE = cyg_22;
        if (!aue_0.cVJ().c(this)) {
            aue_0.cVJ().a(this);
        } else {
            fse_1.gFu().b("shukruteReward", this.nXE, "shukruteRewardDialog");
        }
    }

    public void a(cyh_1 cyh_12) {
        this.nXE.a(cyh_12);
    }

    public void eUE() {
        if (this.nQd != null) {
            abg_2.bUP().h(this.nQd);
            this.nQd = null;
        }
        this.nQc.x(fsb_2.class);
        this.nQc.a(new fsb_2(this.nQc.getX(), this.nQc.getY(), this.nQc.getX(), fbj_1.getInstance().getHeight(), this.nQc, 0, 1000, abn.cdr));
        abg_2.bUP().a((Runnable)new cyb_1(this), 1000L, 1);
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
            this.ikv = new cyc_2(this);
            fyw_0.gqw().a(this.ikv);
            this.nOA = new cyd_1(this);
            ccg_2.eJI().a(this.nOA);
            this.nQc = (fes_2)ccj_2.pd("shukruteRewardDialog");
            this.nQc.setVisible(false);
            this.nQc.setY(fbj_1.getInstance().getHeight());
            fse_1.gFu().b("shukruteReward", this.nXE, "shukruteRewardDialog");
            abg_2.bUP().a((Runnable)new cye_2(this), 1000L, 1);
            this.nQd = new cyf_2(this);
            abg_2.bUP().a(this.nQd, 20000L, 1);
            fyw_0.gqw().d("wakfu.shukrute", cgy_1.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            ccg_2.eJI().b(this.nOA);
            fyw_0.gqw().tl("shukruteRewardDialog");
            fyw_0.gqw().tc("wakfu.shukrute");
            if (this.nQd != null) {
                abg_2.bUP().h(this.nQd);
                this.nQd = null;
            }
        }
    }
}

