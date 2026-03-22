/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from cZl
 */
public class czl_2
implements adi_1 {
    protected static final Logger oaJ = Logger.getLogger(czl_2.class);
    private static final czl_2 oaK = new czl_2();
    private final bNT oaL = new bNT();
    private bco_0 oaM;
    private alx_2 ikv;

    public static czl_2 eYY() {
        return oaK;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (czb_2.o(aam_22)) {
            return false;
        }
        switch (aam_22.d()) {
            case 19141: {
                dae_0 dae_02 = (dae_0)aam_22;
                long l = dae_02.bCp();
                this.oaL.lY(l);
                return false;
            }
            case 18667: {
                dae_0 dae_03 = (dae_0)aam_22;
                String string = dae_03.bCt();
                this.oaL.ke(string);
                return false;
            }
            case 17094: {
                bNP bNP2;
                dae_0 dae_04 = (dae_0)aam_22;
                String string = dae_04.bCt();
                this.oaL.ke(string);
                List<bNP> list = this.oaL.egz();
                if (list.size() == 1) {
                    bNP2 = list.get(0);
                } else if (list.size() == 2 && list.get(0).cjd() == 10001) {
                    bNP2 = list.get(1);
                } else {
                    return false;
                }
                List<bNS> list2 = bNP2.egv();
                if (list2.size() != 1) {
                    return false;
                }
                bNS bNS2 = list2.get(0);
                if (bNS2 == null) {
                    return false;
                }
                this.oh(bNS2.Sn());
                return false;
            }
            case 18468: {
                dae_0 dae_05 = (dae_0)aam_22;
                long l = dae_05.bCp();
                this.oh(l);
                return false;
            }
        }
        return true;
    }

    public void oh(long l) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bOa bOa2 = (bOa)frz.a(this.oaM.dQh());
        bOa2.c(bgt_02, this.oaM, l);
    }

    public void c(bco_0 bco_02) {
        this.oaM = bco_02;
        if (bco_02.dQh() == fre_0.sYZ) {
            this.oaL.p(bco_02.Sn(), false);
        } else if (bco_02.dQh() == fre_0.sZd) {
            this.oaL.p(bco_02.Sn(), true);
        } else {
            oaJ.error((Object)"Type de voyage inconnu, on ne peut pas initialiser le provider");
        }
        aue_0.cVJ().a(this);
    }

    public void eYZ() {
        fes_2 fes_22 = (fes_2)fyw_0.gqw().th("zaapDialog");
        if (fes_22 != null) {
            fes_22.setVisible(false);
        }
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
        if (bl) {
            return;
        }
        bNT.kIG = "";
        this.ikv = string -> {
            if (string.equals("zaapDialog")) {
                aue_0.cVJ().b(czl_2.eYY());
            }
        };
        fyw_0.gqw().a(this.ikv);
        fse_1.gFu().f("ticketOffice", this.oaL);
        fse_1.gFu().f("boatTicketOffice", false);
        ccj_2.pd("zaapDialog");
        fyw_0.gqw().d("wakfu.zaap", chh_1.class);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fyw_0.gqw().b(this.ikv);
        fyw_0.gqw().tl("zaapDialog");
        fse_1.gFu().vX("ticketOffice");
        fyw_0.gqw().tc("wakfu.zaap");
        this.oaM = null;
    }
}

