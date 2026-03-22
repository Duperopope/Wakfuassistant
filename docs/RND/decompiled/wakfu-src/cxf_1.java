/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cXF
 */
public class cxf_1
implements adi_1 {
    private static final cxf_1 nWM = new cxf_1();
    private static final Logger nWN = Logger.getLogger(cxf_1.class);
    private bJr jmi;
    private alx_2 ikv;
    private adp_0 nRy;
    private float nWO;

    public static cxf_1 eXs() {
        return nWM;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (aam_22 instanceof aba_2) {
            bTj.eno().dhE();
            return false;
        }
        switch (aam_22.d()) {
            case 17732: {
                bkq_0 bkq_02 = (bkq_0)fse_1.gFu().vY("selectedProtectorMerchantItem");
                bkn_0 bkn_02 = bkq_02.ebn();
                bkm_0 bkm_02 = ((dcs)aam_22).fbO();
                if (bkm_02 == null) {
                    return false;
                }
                fim_2 fim_22 = string -> {
                    long l = bkn_02.LV();
                    bTg bTg2 = (bTg)this.jmi.eav().d(bkm_02.ebf());
                    ffp_0<ffV> ffp_02 = bkm_02.a(bTg2, l, (short)1, null, -1L, -1L);
                    if (ffp_02.fVH() == 0) {
                        cnB cnB2 = new cnB();
                        cnB2.Ck(this.jmi.d());
                        cnB2.nF(bkm_02.Lx());
                        cnB2.mZ(l);
                        aie_0.cfo().etu().d(cnB2);
                        cnG cnG2 = new cnG();
                        cnG2.Ck(this.jmi.d());
                        aie_0.cfo().etu().d(cnG2);
                        fse_1.gFu().a((aef_2)bTj.eno(), "boughtChallenges", "challengeInventory", "climateInventory", "walletHandler");
                    }
                };
                String string2 = bkm_02.fVu() != fgz_0.sjL ? "question.confirmPurchase" : "question.confirmPurchaseReplace";
                fiq_2.gCw().d(fik_2.a(fim_22).l(string2, new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
                return false;
            }
            case 19216: {
                fiq_2.gCw().d(fik_2.a(string -> this.eXt()).l("question.confirmTaxChanges", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
                return false;
            }
            case 18824: {
                dae_0 dae_02 = (dae_0)aam_22;
                int n = dae_02.bCo();
                fpf fpf2 = fpf.hj(dae_02.bCn());
                fiq_2.gCw().d(fik_2.a(string -> {
                    cnA cnA2 = new cnA();
                    cnA2.a(this.jmi.d(), fpf2, n);
                    aue_0.cVJ().etu().d(cnA2);
                    this.jmi.eav().b(fpf2, n);
                    this.jmi.eav().tt(n);
                    switch (fpf2) {
                        case sNy: {
                            bTj.eno().doD().eau().ebk();
                            break;
                        }
                        case sNz: {
                            fse_1.gFu().a((aef_2)bTj.eno(), "climateInventory");
                            break;
                        }
                    }
                }).l("question.confirmAllocateBudget", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
                return false;
            }
            case 17465: {
                dae_0 dae_03 = (dae_0)aam_22;
                int n = (int)dae_03.bCp();
                int n2 = dae_03.bCo();
                fiq_2.gCw().d(fik_2.a(string -> {
                    cxs_0 cxs_02 = new cxs_0();
                    cxs_02.Lu(n2);
                    cxs_02.Ls(this.jmi.d());
                    cxs_02.Lt(n);
                    aue_0.cVJ().etu().d(cxs_02);
                    this.jmi.eav().tt(n2);
                    abg_2.bUP().a((Runnable)new cxg_2(this), 1000L, 1);
                }).l("question.confirmTransferKamas", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
                return false;
            }
            case 18673: {
                dae_0 dae_04 = (dae_0)aam_22;
                int n = dae_04.bCo();
                boolean bl = dae_04.bCu();
                TIntArrayList tIntArrayList = this.jmi.eaB();
                int n3 = tIntArrayList.indexOf(n);
                if (bl && n3 == -1) {
                    tIntArrayList.add(n);
                } else if (!bl && n3 != -1) {
                    tIntArrayList.removeAt(n3);
                } else {
                    return false;
                }
                cnC cnC2 = new cnC();
                cnC2.HJ(n);
                cnC2.Ck(this.jmi.d());
                cnC2.jt(bl);
                aue_0.cVJ().etu().d(cnC2);
                return false;
            }
            case 16190: {
                dae_0 dae_05 = (dae_0)aam_22;
                boolean bl = dae_05.bCu();
                bJr bJr2 = bTj.eno().doD();
                bTp bTp2 = bJr2.eaH().eaN();
                bTo bTo2 = bTp2.D(dae_05.bCo(), bl);
                if (bJr2.eav().c(fpf.sNA) >= (long)bTo2.env()) {
                    fiq_2.gCw().d(fik_2.a(string -> {
                        if (bl) {
                            bJr2.eaH().Hs(dae_05.bCo());
                        } else {
                            bJr2.eaH().Ht(dae_05.bCo());
                        }
                        fiu_1.uCW.N("protectorEcosystemLock", false);
                    }).l("question.confirmPurchaseGeneral", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
                } else {
                    fiq_2.gCw().d(fik_2.gBZ().l("error.notEnoughKamas", new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
                }
                return false;
            }
            case 18405: {
                dae_0 dae_06 = (dae_0)aam_22;
                boolean bl = dae_06.bCu();
                bJr bJr3 = bTj.eno().doD();
                fiq_2.gCw().d(fik_2.a(string -> {
                    if (bl) {
                        bJr3.eaH().Hu(dae_06.bCo());
                    } else {
                        bJr3.eaH().Hv(dae_06.bCo());
                    }
                    fiu_1.uCW.N("protectorEcosystemLock", false);
                }).l("question.confirmUnprotect", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
                return false;
            }
            case 19366: {
                dae_0 dae_07 = (dae_0)aam_22;
                boolean bl = dae_07.bCu();
                bJr bJr4 = bTj.eno().doD();
                bTp bTp3 = bJr4.eaH().eaN();
                bTo bTo3 = bTp3.D(dae_07.bCo(), bl);
                fiq_2.gCw().d(fik_2.a(string -> {
                    if (bl) {
                        bJr4.eaH().Hw(dae_07.bCo());
                    } else {
                        bJr4.eaH().Hx(dae_07.bCo());
                    }
                    fiu_1.uCW.N("protectorEcosystemLock", false);
                }).l("question.confirmPurchaseGeneral", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
                return false;
            }
            case 16827: {
                return false;
            }
        }
        return true;
    }

    private void eXt() {
        this.nWO = bTj.eno().b(frk.sXG).dar().getValue();
        cnD cnD2 = new cnD();
        cnD2.Ck(this.jmi.d());
        cnD2.d(bTj.eno().b(frk.sXG).dar());
        aie_0.cfo().etu().d(cnD2);
    }

    @Override
    public long Sn() {
        return 4L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            this.nRy = new cxh_1(this);
            bgt_02.ddI().a(this.nRy);
            this.jmi = bTj.eno().doD();
            if (this.jmi == null) {
                nWN.error((Object)"Impossible d'initialiser l'interface de management du protecteur, aucun protecteur n'est d\u00e9finie dans la vue !");
                return;
            }
            cnG cnG2 = new cnG();
            cnG2.Ck(this.jmi.d());
            aie_0.cfo().etu().d(cnG2);
            aie_0.cfo().etu().d(new cxn_0());
            fse_1.gFu().f("selectedProtectorMerchantItem", (Object)null);
            this.nWO = bTj.eno().b(frk.sXG).dar().getValue();
            this.ikv = new cxi_2(this);
            fyw_0.gqw().a(this.ikv);
            fse_1.gFu().f("weather.manager", boh_1.ehH());
            fiu_1.uCW.vN("protectorEcosystemLock");
            fhv_1 fhv_12 = ccj_2.g("protectorManagementDialog", 32768L);
            fse_1.gFu().a("currentPage", (Object)0, fhv_12.getElementMap());
            fyw_0.gqw().d("wakfu.protectorManagement", cgo_1.class);
            abb_2.bUA().a(this, 1000L, -1);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            bTj.eno().b(frk.sXG).dar().setValue(this.nWO);
            aue_0.cVJ().cVK().ddI().b(this.nRy);
            this.nRy = null;
            fiu_1.uCW.vO("protectorEcosystemLock");
            fyw_0.gqw().tc("wakfu.protectorManagement");
            fyw_0.gqw().b(this.ikv);
            fse_1.gFu().vX("selectedProtectorMerchantItem");
            fse_1.gFu().vX("weather.manager");
            fyw_0.gqw().tl("protectorManagementDialog");
            abb_2.bUA().b(this);
        }
    }
}

