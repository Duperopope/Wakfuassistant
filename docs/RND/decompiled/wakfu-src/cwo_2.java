/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cWO
 */
public class cwo_2
implements adi_1 {
    protected static final Logger nTR = Logger.getLogger(cwo_2.class);
    private static final cwo_2 nTS = new cwo_2();
    private alx_2 ikv;
    private String nTT;
    private final ArrayList<String> nTU = new ArrayList();
    private final ArrayList<Long> nTV = new ArrayList();

    public static cwo_2 eWo() {
        return nTS;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16445: 
            case 16459: 
            case 17430: {
                dae_0 dae_02 = (dae_0)aam_22;
                String string = dae_02.bCt();
                long l = dae_02.bCp();
                cxo_0 cxo_02 = new cxo_0();
                cxo_02.oB(string);
                cxo_02.nJ(l);
                aue_0.cVJ().etu().d(cxo_02);
                fse_1.gFu().f("speechDirty", false);
                fse_1.gFu().f("speechVisualisationMode", true);
                return false;
            }
            case 19669: {
                cxh_0 cxh_02 = new cxh_0();
                aue_0.cVJ().etu().d(cxh_02);
                this.kK(false);
                return false;
            }
            case 17080: {
                cxe_0 cxe_02 = new cxe_0();
                aue_0.cVJ().etu().d(cxe_02);
                this.kK(false);
                return false;
            }
            case 18894: {
                cxd_0 cxd_02 = new cxd_0();
                cxd_02.dP(brx_1.elI().elX());
                aue_0.cVJ().etu().d(cxd_02);
                this.kK(false);
                return false;
            }
            case 16356: {
                dae_0 dae_03 = (dae_0)aam_22;
                long l = dae_03.bCp();
                String string = dae_03.bCt();
                if (aPd.a(string, ejn_0.qzm)) {
                    return false;
                }
                cxk_0 cxk_02 = new cxk_0();
                cxk_02.dC(l);
                cxk_02.setName(string);
                aue_0.cVJ().etu().d(cxk_02);
                return false;
            }
            case 16432: {
                dae_0 dae_04 = (dae_0)aam_22;
                long l = dae_04.bCp();
                String string = "governmentMemberDetailsDialog_" + l;
                if (fyw_0.gqw().to(string)) {
                    this.a(null, l);
                } else {
                    this.a(brx_1.elI().ems().gbB().e(fkL.ue(l)));
                }
                return false;
            }
            case 17264: {
                dae_0 dae_05 = (dae_0)aam_22;
                long l = dae_05.bCp();
                fjo_0 fjo_02 = brx_1.elI().ems();
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                fkL fkL2 = bgt_02.ffF().emF();
                if (fkL2 == null) {
                    return false;
                }
                fjo_02.a(fkL2, fkL.ue(l), fkO.sCJ);
                return false;
            }
            case 19565: {
                dae_0 dae_06 = (dae_0)aam_22;
                short s = dae_06.bCq();
                cxl_0 cxl_02 = new cxl_0();
                cxl_02.cF(s);
                aue_0.cVJ().etu().d(cxl_02);
                return false;
            }
            case 18937: {
                dae_0 dae_07 = (dae_0)aam_22;
                long l = dae_07.bCp();
                if (this.nTV.contains(l)) {
                    this.nTV.remove(l);
                } else {
                    this.nTV.add(l);
                }
                brx_1.elI().elV();
                fse_1.gFu().f("lawsDirty", !this.nTV.isEmpty());
                return false;
            }
            case 19977: {
                if (this.nTV.isEmpty()) {
                    return false;
                }
                TLongHashSet tLongHashSet = brx_1.elI().emz();
                cxm_0 cxm_02 = new cxm_0();
                cxm_02.b(tLongHashSet);
                aue_0.cVJ().etu().d(cxm_02);
                this.nTV.clear();
                fse_1.gFu().f("lawsDirty", false);
                return false;
            }
            case 18640: {
                brx_1.elI().emA();
                this.nTV.clear();
                brx_1.elI().elV();
                fse_1.gFu().f("lawsDirty", false);
                return false;
            }
            case 17860: {
                dcb_0 dcb_02 = (dcb_0)aam_22;
                cxf_0 cxf_02 = new cxf_0();
                cxf_02.Le(dcb_02.Xt());
                cxf_02.dQ(dcb_02.fbm());
                aue_0.cVJ().etu().d(cxf_02);
                this.kK(false);
                return false;
            }
            case 16353: {
                dae_0 dae_08 = (dae_0)aam_22;
                cxr_0 cxr_02 = new cxr_0();
                cxr_02.Le(dae_08.bCo());
                aue_0.cVJ().etu().d(cxr_02);
                this.kK(false);
                return false;
            }
        }
        return true;
    }

    public void kK(boolean bl) {
        fiu_1.uCW.N("nationLock", bl);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    private fgo_2 getTableModel() {
        fgo_2 fgo_22 = new fgo_2();
        fgo_22.a("territories", new fgq_2(new cwp_1(this)));
        fgo_22.a("wills", new fgq_2(new cwq_1(this)));
        fgo_22.a("taxes", new fgq_2(new cwr_2(this)));
        fgo_22.a("cash", new fgq_2(new cws_1(this)));
        return fgo_22;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            Object object;
            if (aue_0.cVJ().cVK().ffF().ems().equals(fjo_0.sys)) {
                return;
            }
            this.ikv = new cwt_2(this);
            fyw_0.gqw().a(this.ikv);
            fse_1.gFu().f("speechDirty", false);
            fse_1.gFu().f("speechVisualisationMode", true);
            fse_1.gFu().f("lawsDirty", false);
            if (fse_1.gFu().getProperty("nationCurrentPageIndex") == null) {
                fse_1.gFu().f("nationCurrentPageIndex", 0);
            }
            fiu_1.uCW.vN("nationLock");
            ccj_2.g("nationDialog", 32768L);
            fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("nationDialog");
            if (fhs_22 != null) {
                object = this.getTableModel();
                fdq_1 fdq_12 = (fdq_1)fhs_22.uH("protectorTable");
                if (fdq_12 != null) {
                    fdq_12.setTableModel((fgo_2)object);
                }
            }
            object = new cxj_0();
            aue_0.cVJ().etu().d(object);
            fyw_0.gqw().d("wakfu.nation", cfz_2.class);
            cAY.eHc().eHq();
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.clean();
            brx_1.elI().ema();
            fse_1.gFu().vX("speechDirty");
            fse_1.gFu().vX("speechVisualisationMode");
            fse_1.gFu().vX("nationCurrentPageIndex");
            fse_1.gFu().vX("lawsDirty");
            fyw_0.gqw().tl("nationDialog");
            fiu_1.uCW.vO("nationLock");
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tc("wakfu.nation");
            cAY.eHc().eHr();
        }
    }

    private void clean() {
        for (String string : this.nTU) {
            fyw_0.gqw().tl(string);
        }
        this.nTU.clear();
        this.eWp();
        this.nTT = null;
    }

    public void eWp() {
        this.nTV.clear();
    }

    public void a(fkH fkH2) {
        this.a(fkH2, fkH2.emF().Sn());
    }

    public void a(fkH fkH2, long l) {
        String string = "governmentMemberDetailsDialog";
        String string2 = "governmentMemberDetailsDialog_" + l;
        if (!fyw_0.gqw().to(string2) && fkH2 != null) {
            String string3 = this.nTT == null ? "nationDialog" : this.nTT;
            fyw_0.gqw().a(string2, ccj_2.pe("governmentMemberDetailsDialog"), string3, "nationDialog", "governmentMemberDetailsDialog");
            this.nTT = string2;
            brm_2 brm_22 = new brm_2(fkH2, brx_1.elI().mp(fkH2.emF().Sn()));
            fse_1.gFu().b("governmentMemberDetails", brm_22, string2);
            this.nTU.add(string2);
        } else {
            fyw_0.gqw().tl(string2);
            this.nTU.remove(string2);
            if (string2.equals(this.nTT)) {
                this.nTT = null;
            }
        }
    }
}

