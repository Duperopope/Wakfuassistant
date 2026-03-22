/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cTz
 */
public class ctz_2
implements adi_1 {
    private static final ctz_2 nJu = new ctz_2();
    protected static Logger oO = Logger.getLogger(ctz_2.class);
    private cta_2 nJv;
    private long cJM;
    private int iwj;
    private final alx_2 nJw = string -> {
        if (string.equals("conventionLadderFormDialog")) {
            aue_0.cVJ().b(nJu);
        }
    };

    public static ctz_2 eQl() {
        return nJu;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (aam_22.d() == 17759) {
            dag_0 dag_02 = (dag_0)aam_22;
            cjC cjC2 = new cjC(dag_02.xO(), dag_02.eZY(), dag_02.eZZ(), dag_02.faa(), this.cJM);
            ayf_2 ayf_22 = aue_0.cVJ().etu();
            ayf_22.d(cjC2);
            if (aue_0.cVJ().c(ctz_2.eQl())) {
                aue_0.cVJ().b(ctz_2.eQl());
            }
            return false;
        }
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void jm(long l) {
        this.cJM = l;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            blm_1 blm_12 = new blm_1(this.iwj, this.cJM);
            ccj_2.g("conventionLadderFormDialog", 8448L);
            fse_1.gFu().f("conventionInformation", blm_12);
            fyw_0.gqw().d("wakfu.convention", ced_1.class);
            fyw_0.gqw().a(this.nJw);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().tc("wakfu.convention");
            fyw_0.gqw().b(this.nJw);
            fyw_0.gqw().tl("conventionLadderFormDialog");
            cAY.eHc().nP(600013L);
            fse_1.gFu().f("conventionInformation", (Object)null);
        }
    }

    public void eQm() {
        if (this.nJv != null) {
            return;
        }
        this.nJv = new cta_2();
        fse_1.gFu().f("sessionTimer", this.nJv);
        this.eQq();
        this.nJv.start();
    }

    public void eQn() {
        this.nJv.bhk();
        fse_1.gFu().vX("sessionTimer");
        this.nJv = null;
    }

    public void eQo() {
        api_0 api_02 = new api_0(aum_0.cWf().c("conventionDropChatMessage", new Object[0]));
        api_02.m(aPl.exz);
        aPh.czg().d(api_02);
        cso_2 cso_22 = cso_2.eOa();
        cso_22.Mr(17);
        aue_0.cVJ().a(cso_22);
        cAY.eHc().nP(600062L);
    }

    public void eQp() {
        cso_2 cso_22 = cso_2.eOa();
        cso_22.Mr(16);
        aue_0.cVJ().a(cso_22);
    }

    public void eQq() {
        ccj_2.g("sessionTimerDialog", 8192L);
    }

    public void MF(int n) {
        this.iwj = n;
    }
}

