/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cWq
 */
public class cwq_2
implements adi_1 {
    private static final cwq_2 nSE = new cwq_2();
    private alx_2 ikv;

    public static cwq_2 eVS() {
        return nSE;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19294: {
                fiq_2.gCw().d(fik_2.b(string -> {
                    if (string != null && !string.isEmpty()) {
                        if (string.length() <= 220) {
                            ng_0 ng_02 = new ng_0(string);
                            aue_0.cVJ().etu().d(ng_02);
                            fiq_2.gCw().d(fik_2.gBZ().l("contactModerator.waiting", new Object[0]));
                        } else {
                            aPd.e("contactModerator.tooLong", new Object[0]);
                        }
                    } else {
                        aPd.e("contactModerator.tooShort", new Object[0]);
                    }
                }).l("contactModerator.ask", new Object[0]).pe(true));
                aue_0.cVJ().b(this);
                return false;
            }
            case 16075: {
                aue_0.cVJ().a(cxh_2.eWD());
                return false;
            }
            case 17245: {
                aue_0.cVJ().etr();
                return false;
            }
            case 18253: {
                aue_0.cVJ().ett();
                return false;
            }
            case 19531: {
                aue_0.cVJ().b(this);
                return false;
            }
            case 16474: {
                fim_2 fim_22 = string -> {
                    aue_0.cVJ().b(this);
                    aue_0.cVJ().b(cdv_0.euj());
                    cdv_0.euj().eut();
                    bgt_0 bgt_02 = aue_0.cVJ().cVK();
                    if (bgt_02 != null && (bgt_02.dps() == null || bgt_02.dps().dsm() != 4)) {
                        cwr_1 cwr_12 = new cwr_1(this);
                        aue_0.cVJ().a(bgt_02, cwr_12);
                    } else {
                        cwq_2.eVT();
                    }
                };
                fiq_2.gCw().d(fik_2.a(fim_22).l("question.changeCharacter", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
                return false;
            }
        }
        return true;
    }

    public static void eVT() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != null) {
            bgt_02.dlG().edw();
        }
        aie_0.cfn().bmW();
        aue_0.cVJ().a(cdT.eui());
        aue_0.cVJ().a(cyt_1.eXX());
        aue_0.cVJ().a(ccd_1.etO());
        crh_2.eML().cB(true).g(aum_0.cWf().c("charactersLoading.progress", new Object[0]), 0);
        ccz_1.etG().jc(true);
        aue_0.cVJ().a(ccz_1.etG());
        aue_0.cVJ().etu().d(new coa_0());
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
            this.ikv = new cws_2(this);
            fyw_0.gqw().a(this.ikv);
            boolean bl2 = aue_0.cVJ().etp();
            fse_1.gFu().f("isConnected", bl2);
            boolean bl3 = auc_0.cVq().b("displayDisconnectButton", false);
            fse_1.gFu().f("displayDisconnectButton", bl2 && bl3);
            ccj_2.g("menuDialog", 256L);
            fyw_0.gqw().d("wakfu.menu", cfq_2.class);
            cAY.eHc().nP(600023L);
            cfj_1.setSelectedTabIndex(0);
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            boolean bl4 = false;
            if (bgt_02 != null) {
                evd_2 evd_22 = bgt_02.dpL();
                bl4 = ewo_0.oBF.k(ewr_0.oCB) && evd_22.fdT() == evu_2.ovM;
            }
            fse_1.gFu().f("antiAddictionEnabled", bl4);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fse_1.gFu().vX("isConnected");
            fyw_0.gqw().tl("menuDialog");
            fyw_0.gqw().tc("wakfu.menu");
            fyw_0.gqw().b(this.ikv);
            cAY.eHc().nP(600024L);
            cfj_1.setSelectedTabIndex(3);
        }
    }
}

