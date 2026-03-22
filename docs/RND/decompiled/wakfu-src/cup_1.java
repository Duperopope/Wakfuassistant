/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cUp
 */
public class cup_1
extends crw_2 {
    private static final cup_1 nLT = new cup_1();
    private static final Logger nLU = Logger.getLogger(cup_1.class);
    private boolean nLV;
    alx_2 ikv;

    public static cup_1 eRM() {
        return nLT;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (aam_22 instanceof aba_2) {
            fse_1.gFu().f("exchange.valid", true);
            abb_2.bUA().b(this);
            return false;
        }
        switch (aam_22.d()) {
            case 18252: {
                dbi_0 dbi_02 = (dbi_0)aam_22;
                ckh_0 ckh_02 = new ckh_0();
                ckh_02.setExchangeId(dbi_02.exN());
                aue_0.cVJ().etu().d(ckh_02);
                fse_1.gFu().a((aef_2)aue_0.cVJ().cVK(), "states");
                return false;
            }
            case 19601: {
                dbg_0 dbg_02;
                if (fyw_0.gqw().to("splitStackDialog")) {
                    fyw_0.gqw().tl("splitStackDialog");
                }
                if (fyw_0.gqw().to("splitExchangeAmountOfCashDialog")) {
                    fyw_0.gqw().tl("splitExchangeAmountOfCashDialog");
                }
                if ((dbg_02 = (dbg_0)aam_22).exR().isEmpty()) {
                    return false;
                }
                cka_0 cka_02 = new cka_0();
                cka_02.setExchangeId(dbg_02.exN());
                for (ffV ffV2 : dbg_02.exR()) {
                    if (!cup_1.bD(ffV2)) continue;
                    cka_02.nc(ffV2.LV());
                }
                aue_0.cVJ().etu().d(cka_02);
                return false;
            }
            case 17012: {
                dbf_0 dbf_02;
                ffV ffV3;
                if (fse_1.gFu().getProperty("exchange.sourceBag") == null || fse_1.gFu().getProperty("exchange.sourcePosition") == null) {
                    nLU.error((Object)"Impossible d'ajouter l'objet : le bag / position de la source n'ont pas \u00e9t\u00e9 sp\u00e9cifi\u00e9s");
                    return false;
                }
                if (fyw_0.gqw().to("splitStackDialog")) {
                    fyw_0.gqw().tl("splitStackDialog");
                }
                if (fyw_0.gqw().to("splitExchangeAmountOfCashDialog")) {
                    fyw_0.gqw().tl("splitExchangeAmountOfCashDialog");
                }
                if (!this.bE(ffV3 = (dbf_02 = (dbf_0)aam_22).getItem())) {
                    aPd.e("exchange.itemUnexchangeable", new Object[0]);
                    return false;
                }
                long l = ffV3.LV();
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                if (!bgt_02.dno().fa(l)) {
                    for (bli_1 bli_12 : bgt_02.dnf()) {
                        blp_0 blp_02;
                        if (bli_12 == null || bli_12.dtZ() || (blp_02 = (blp_0)cts_1.MC(bli_12.xT())) == null || !blp_02.dme().dM(l)) continue;
                        aPd.e("exchange.itemFromCompanion", new Object[0]);
                        break;
                    }
                    return false;
                }
                cjz_0 cjz_02 = new cjz_0();
                cjz_02.setExchangeId(dbf_02.exN());
                cjz_02.nb(l);
                cjz_02.cA((short)dbf_02.cnN());
                aue_0.cVJ().etu().d(cjz_02);
                this.eRN();
                return false;
            }
            case 18792: {
                if (fyw_0.gqw().to("splitStackDialog")) {
                    fyw_0.gqw().tl("splitStackDialog");
                }
                if (fyw_0.gqw().to("splitExchangeAmountOfCashDialog")) {
                    fyw_0.gqw().tl("splitExchangeAmountOfCashDialog");
                }
                dbg_0 dbg_03 = (dbg_0)aam_22;
                ckf_0 ckf_02 = new ckf_0(dbg_03.exN());
                for (ffV ffV4 : dbg_03.exR()) {
                    ckf_02.nc(ffV4.LV());
                }
                aue_0.cVJ().etu().d(ckf_02);
                this.eRN();
                return false;
            }
            case 19598: {
                if (fyw_0.gqw().to("splitStackDialog")) {
                    fyw_0.gqw().tl("splitStackDialog");
                }
                if (fyw_0.gqw().to("splitExchangeAmountOfCashDialog")) {
                    fyw_0.gqw().tl("splitExchangeAmountOfCashDialog");
                }
                dbf_0 dbf_03 = (dbf_0)aam_22;
                cke_0 cke_02 = new cke_0();
                cke_02.setExchangeId(dbf_03.exN());
                cke_02.nb(dbf_03.getItem().LV());
                cke_02.cA((short)dbf_03.cnN());
                aue_0.cVJ().etu().d(cke_02);
                this.eRN();
                return false;
            }
            case 19004: {
                bsl_0.jfZ.dFt().km(((dae_0)aam_22).bCp());
                return false;
            }
            case 19012: {
                dbh_0 dbh_02 = (dbh_0)aam_22;
                bgt_0 bgt_03 = aue_0.cVJ().cVK();
                bso_0 bso_02 = bsl_0.jfZ.dFt();
                long l = bso_02.dFI();
                bsp_0 bsp_02 = (bsp_0)bso_02.dP(bgt_03.Sn());
                long l2 = bsp_02.beL();
                if (l2 == l) {
                    return false;
                }
                long l3 = bgt_03.dmi() + l2;
                if (l3 < l) {
                    l = l3;
                }
                ckg_0 ckg_02 = new ckg_0();
                ckg_02.ne(l);
                ckg_02.setExchangeId(dbh_02.exN());
                aue_0.cVJ().etu().d(ckg_02);
                this.eRN();
                bsp_02.dH(l);
                fse_1.gFu().a((aef_2)bso_02, "kamaValueHasChanged");
                return false;
            }
            case 19944: {
                dae_0 dae_02 = (dae_0)aam_22;
                long l = dae_02.bCp();
                ckb_0 ckb_02 = new ckb_0();
                ckb_02.setExchangeId(l);
                aue_0.cVJ().etu().d(ckb_02);
                return false;
            }
        }
        return true;
    }

    private static boolean bD(@NotNull ffV ffV2) {
        if (ffV2.fWm()) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        ang_2 ang_22 = ffV2.dOg().a(ffj_0.sgg);
        return ang_22 == null || ang_22.b(bgt_02, fcI.sk(bgt_02.Xi()), ffV2, bgt_02.fgg());
    }

    public boolean bE(ffV ffV2) {
        return !ffV2.fWm() && (ffV2.dOg().a(ffj_0.sgg) == null || ffV2.dOg().a(ffj_0.sgg).b(aue_0.cVJ().cVK(), aue_0.cVJ().cVK().aZw(), ffV2, aue_0.cVJ().cVK().fgg()));
    }

    public void eRN() {
        if (!aue_0.cVJ().c(this)) {
            return;
        }
        fse_1.gFu().f("exchange.valid", false);
        abb_2.bUA().b(this);
        abb_2.bUA().a(this, 5000L, 0);
    }

    public boolean dnj() {
        return this.nLV;
    }

    public void fY(boolean bl) {
        this.nLV = bl;
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }

    void eRO() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            nLU.error((Object)"on tente d'annuler l'\u00e9change mais le joueur n'existe d\u00e9j\u00e0 plus");
            return;
        }
        bso_0 bso_02 = bsl_0.jfZ.dFt();
        if (bso_02 != null) {
            ckb_0 ckb_02 = new ckb_0();
            ckb_02.setExchangeId(bso_02.Sn());
            aue_0.cVJ().etu().d(ckb_02);
        }
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        Object object;
        aef_2 aef_22;
        super.a(aye_22, bl);
        if (bl) {
            return;
        }
        fse_1.gFu().f("exchange.valid", true);
        this.ikv = new cuq_1(this);
        fyw_0.gqw().a(this.ikv);
        fey_2 fey_22 = (fey_2)ccj_2.g("exchangeDialog", 32784L);
        if (fey_22 == null) {
            nLU.error((Object)("Impossible de r\u00e9cup\u00e9rer la fen\u00eatre d'\u00e9change !!! loaded=" + fyw_0.gqw().to("exchangeDialog")));
        } else {
            this.bB(fey_22);
        }
        if (this.nEc && (aef_22 = bvz_0.dLl()) != null) {
            object = bwa_0.jwi.aj((bhJ)aef_22);
            fse_1.gFu().b("characterSheet", object, "inventoryDialog");
            dae_0 dae_02 = new dae_0(19148);
            dae_02.gj(((exP)((Object)aef_22)).Sn());
            aaw_1.bUq().h(dae_02);
        }
        aue_0.cVJ().b(czi_2.eYU());
        aue_0.cVJ().b(cui_1.eRw());
        aue_0.cVJ().b(ctg_1.eQG());
        aue_0.cVJ().b(dcJ.fce());
        cvo_2.eUK().eUM();
        cwd_2.eVe().eVg();
        fse_1.gFu().f("equipment.can.transfer.bag", true);
        fyw_0.gqw().d("wakfu.exchange", cec_2.class);
        aef_22 = bsl_0.jfZ.dFt();
        object = new dae_0();
        ((ama_1)object).lK(19272);
        ((ama_1)object).fa(((bso_0)aef_22).dFH().getName());
        aaw_1.bUq().h((aam_2)object);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            cza_2.eZs();
            if (fyw_0.gqw().to("splitStackDialog")) {
                fyw_0.gqw().tl("splitStackDialog");
            }
            abb_2.bUA().b(this);
            fyw_0.gqw().tl("exchangeDialog");
            this.nLV = false;
            fse_1.gFu().f("equipment.can.transfer.bag", false);
            fyw_0.gqw().tc("wakfu.exchange");
            if (aue_0.cVJ().cVK() == null) {
                return;
            }
            aue_0.cVJ().a(czi_2.eYU());
        }
    }
}

