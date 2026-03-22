/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cYC
 */
public class cyc_1
implements adi_1 {
    public static final cyc_1 nYO = new cyc_1();
    protected static final Logger nYP = Logger.getLogger(cyc_1.class);
    private bod_2 nYQ;
    private alx_2 ikv;

    private cyc_1() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16100: {
                dae_0 dae_02 = (dae_0)aam_22;
                String string = dae_02.bCt();
                this.nYQ.nd(string);
                return false;
            }
            case 18293: {
                dae_0 dae_03 = (dae_0)aam_22;
                this.nYQ.dfp();
                return false;
            }
            case 18007: {
                dae_0 dae_04 = (dae_0)aam_22;
                this.nYQ.dfq();
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cyd_2(this);
            this.nYQ = new bod_2();
            fse_1.gFu().f("tutorialBook", this.nYQ);
            fyw_0.gqw().a(this.ikv);
            ccj_2.g("tutorialBookDialog", 32768L);
            fyw_0.gqw().d("wakfu.tutorialBook", chp_1.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.nYQ = null;
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("tutorialBookDialog");
            fyw_0.gqw().tc("wakfu.tutorialBook");
            fse_1.gFu().vX("tutorialBook");
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

