/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  org.apache.log4j.Logger
 */
import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from cSk
 */
public class csk_1
implements adi_1 {
    protected static final Logger nFi = Logger.getLogger(csk_1.class);
    public static final csk_1 nFj = new csk_1();
    private bnb_2 nFk;
    private bnd_2 nFl;
    private alx_2 ikv;
    private int ejc;

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19073: {
                dam_0 dam_02 = (dam_0)aam_22;
                bmv_1 bmv_12 = dam_02.fah();
                if (fyw_0.gqw().to("artisansListDialog")) {
                    return false;
                }
                bmv_1 bmv_13 = (bmv_1)fse_1.gFu().vY("selectedRecipe");
                if (bmv_12 == bmv_13) {
                    bmv_12 = null;
                } else {
                    this.nFl.dxX().forEach(bna_22 -> bna_22.f(dam_02.fah().dxA()));
                }
                fse_1.gFu().f("selectedRecipe", bmv_12);
                return false;
            }
            case 19273: {
                bmv_1 bmv_14;
                Object object;
                if (!fyw_0.gqw().to("artisansListDialog")) {
                    object = (fey_2)ccj_2.g("artisansListDialog", 16L);
                    this.bD((fey_2)object);
                }
                if ((bmv_14 = ((das_0)(object = (das_0)aam_22)).fah()) != null) {
                    fse_1.gFu().b("artisansList", this.nFl, "artisansListDialog");
                    fse_1.gFu().f("selectedRecipe", bmv_14);
                } else {
                    bmv_14 = (bmv_1)fse_1.gFu().vY("selectedRecipe");
                }
                if (bmv_14 == null) {
                    nFi.warn((Object)"Trying to view artisans without having selected a recipe beforehand");
                    return false;
                }
                this.a(bmv_14.dxA(), ((das_0)object).fao());
                return false;
            }
            case 18138: {
                dao_0 dao_02 = (dao_0)aam_22;
                this.a(dao_02.fak());
                return false;
            }
            case 18912: {
                daq_0 daq_02 = (daq_0)aam_22;
                switch (daq_02.fam()) {
                    case ocS: {
                        this.qi(daq_02.dIR());
                        return false;
                    }
                    case ocT: {
                        this.eNX();
                        return false;
                    }
                    case ocU: {
                        this.a(false, Strings.isNullOrEmpty((String)daq_02.dIR()) ? (short)0 : Short.parseShort(daq_02.dIR()));
                        return false;
                    }
                    case ocV: {
                        this.a(true, Strings.isNullOrEmpty((String)daq_02.dIR()) ? (short)0 : Short.parseShort(daq_02.dIR()));
                        return false;
                    }
                }
                return false;
            }
            case 17126: {
                int n = ((dae_0)aam_22).bCo();
                this.nFk.Es(n);
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        aue_0.cVJ().b(czi_2.eYU());
        aue_0.cVJ().b(cup_1.eRM());
        this.ikv = csk_1::dialogUnloaded;
        fyw_0.gqw().a(this.ikv);
        ccj_2.g("artisansBookDialog", 16L).getElementMap();
        fse_1.gFu().b("artisansBook", this.nFk, "artisansBookDialog");
        cAY.eHc().nP(600012L);
        fyw_0.gqw().d("wakfu.artisansBook", cdp_2.class);
        if (!fyw_0.gqw().tb("wakfu.crafts")) {
            fyw_0.gqw().d("wakfu.crafts", ceh_2.class);
        }
        if (!fyw_0.gqw().tb("wakfu.craftTable")) {
            fyw_0.gqw().d("wakfu.craftTable", cei_2.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fyw_0.gqw().b(this.ikv);
        fse_1.gFu().vX("selectedRecipe");
        fse_1.gFu().vX("artisansBook");
        if (fyw_0.gqw().to("artisansBookDialog")) {
            fyw_0.gqw().tl("artisansBookDialog");
        }
        if (fyw_0.gqw().to("artisansListDialog")) {
            fyw_0.gqw().tl("artisansListDialog");
        }
        cAY.eHc().nP(600013L);
        fyw_0.gqw().tc("wakfu.artisansBook");
        if (cte_2.eQE()) {
            fyw_0.gqw().tc("wakfu.crafts");
        }
        if (!aue_0.cVJ().c(ctg_1.eQG())) {
            fyw_0.gqw().tc("wakfu.craftTable");
        }
        aue_0.cVJ().a(czi_2.eYU());
    }

    private void a(eKR eKR2, dat_0 dat_02) {
        cwr_0 cwr_02 = new cwr_0();
        cwr_02.g(eKR2);
        switch (dat_02) {
            case ocY: {
                cwr_02.Lq(0);
                break;
            }
            case ocZ: {
                cwr_02.Lq(13 * (this.nFl.dfz() + 1));
                break;
            }
            case oda: {
                cwr_02.Lq(13 * (this.nFl.dfz() - 1));
            }
        }
        aue_0.cVJ().etu().d(cwr_02);
    }

    private void bD(fey_2 fey_22) {
        fey_22.a(new csl_1(this, fey_22));
    }

    public void a(int n, int n2, int n3, List<bmz_2> list) {
        if (list == null) {
            return;
        }
        bmv_1 bmv_12 = (bmv_1)fse_1.gFu().vY("selectedRecipe");
        ArrayList<bna_2> arrayList = new ArrayList<bna_2>();
        list.forEach(bmz_22 -> {
            boolean bl = apd_0.cAO().cAR().jk(bmz_22.getName()) != null;
            arrayList.add(new bna_2((bmz_2)bmz_22, this.ejc, bl, bmv_12.dxA()));
        });
        this.nFl.K(arrayList);
        this.nFl.Et(n);
        this.nFl.Eu(n3);
        fse_1.gFu().a((aef_2)this.nFl, "currentArtisansPage", "currentPageText", "currentPage", "totalPages");
    }

    private void a(boolean bl, short s) {
        if (bl) {
            this.nFk.Er(s);
        } else {
            this.nFk.Eq(s);
        }
        fse_1.gFu().a((aef_2)this.nFk, "currentPageText", "currentRecipesPage");
    }

    private void qi(String string) {
        this.nFk.ke(string);
        fse_1.gFu().a((aef_2)this.nFk, "currentPageText", "currentRecipesPage");
    }

    private void eNX() {
        this.nFk.dxT();
        fse_1.gFu().a((aef_2)this.nFk, "onlyIngredientsOk", "currentPageText", "currentRecipesPage");
    }

    private void a(dap_0 dap_02) {
        int n;
        if (dap_02 == null) {
            return;
        }
        switch (dap_02) {
            case ocM: {
                n = this.nFk.dfz() + 1;
                if (n < this.nFk.dxd()) break;
                return;
            }
            case ocN: {
                n = this.nFk.dfz() - 1;
                if (n >= 0) break;
                return;
            }
            default: {
                return;
            }
        }
        this.nFk.BH(n);
        fse_1.gFu().a((aef_2)this.nFk, "currentRecipesPage", "currentPageText");
    }

    private static void dialogUnloaded(String string) {
        if ("artisansBookDialog".equals(string)) {
            aue_0.cVJ().b(nFj);
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void l(bCA bCA2) {
        if (!(bCA2 instanceof bxh_0)) {
            return;
        }
        this.ejc = ((bxh_0)bCA2).dNr();
        this.nFk = new bnb_2(this.ejc);
        this.nFl = new bnd_2();
        aue_0.cVJ().a(this);
    }

    public void a(bxh_0 bxh_02) {
        if (bxh_02.dNr() == this.ejc) {
            aue_0.cVJ().b(this);
        }
    }
}

