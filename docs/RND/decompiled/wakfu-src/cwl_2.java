/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cWL
 */
public class cwl_2
implements adi_1 {
    private static final cwl_2 nTL = new cwl_2();
    private static Logger oO = Logger.getLogger(cwl_2.class);
    private String aZg;
    private long exa;
    private String nTM;
    private boolean hNy;
    private alx_2 ikv;

    public static cwl_2 eWm() {
        return nTL;
    }

    public void a(String string, long l, String string2) {
        if (!aue_0.cVJ().c(this)) {
            this.aZg = string;
            this.exa = l;
            this.nTM = string2;
            aue_0.cVJ().a(this);
        }
    }

    void eWn() {
        if (this.hNy) {
            fiq_2.gCw().d(fik_2.a(string -> aue_0.cVJ().b(this)).l("contactModerator.suretoclose", new Object[0]));
        } else {
            aue_0.cVJ().b(this);
        }
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18391: {
                this.eWn();
                return false;
            }
            case 16765: {
                ama_1 ama_12 = (ama_1)aam_22;
                byte by = ama_12.bCn();
                int n = aPt.cAg().cAB();
                String string = "contactModerator.closed";
                switch (by) {
                    case 4: {
                        string = "contactModerator.closed";
                        break;
                    }
                    case 5: {
                        string = "contactModerator.disconnected";
                    }
                }
                api_0 api_02 = new api_0(aum_0.cWf().c(string, new Object[0]));
                api_02.m(aPl.exs);
                api_02.yW(n);
                aPh.czg().d(api_02);
                this.hNy = false;
                return false;
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cwm_1(this);
            fyw_0.gqw().a(this.ikv);
            ccj_2.g("moderatorChatDialog", 40976L);
            fyw_0.gqw().d("wakfu.moderatorChat", cfw_2.class);
            dax dax2 = new dax(18635, this.aZg, new cwn_2(this.nTM, this.exa, this.aZg));
            aaw_1.bUq().h(dax2);
            this.hNy = true;
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            cza_2.eZt();
            fyw_0.gqw().tl("moderatorChatDialog");
            fyw_0.gqw().tc("wakfu.moderatorChat");
            if (this.hNy) {
                nf_0 nf_02 = new nf_0();
                aue_0.cVJ().etu().d(nf_02);
                this.hNy = false;
            }
        }
    }
}

