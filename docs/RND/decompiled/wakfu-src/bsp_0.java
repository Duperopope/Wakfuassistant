/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Collection;
import org.apache.log4j.Logger;

/*
 * Renamed from bsp
 */
public class bsp_0
extends RK<ffV> {
    private static final Logger jgu = Logger.getLogger(bsp_0.class);
    private final bhJ jgv;
    private bkq_2 jgw;
    private bsm_0 jgx;

    public bsp_0(bhJ bhJ2) {
        this.jgv = bhJ2;
    }

    public bhJ cXb() {
        return this.jgv;
    }

    public boolean bvY() {
        return this.jgv.bvY();
    }

    @Override
    public long Sn() {
        return this.jgv.Sn();
    }

    @Override
    public String getName() {
        return this.jgv.getName();
    }

    public bkq_2 dFJ() {
        return this.jgw;
    }

    public void a(bkq_2 bkq_22) {
        this.jgw = bkq_22;
        this.jgv.a(bkq_22);
    }

    @Override
    public void a(St st) {
        if (!this.bvY()) {
            return;
        }
        switch (st.bfI()) {
            case boH: {
                Sq sq = (Sq)st;
                fse_1.gFu().f("exchange.itemTrade", (Object)null);
                fse_1.gFu().vX("exchange.remotePlayer");
                if (st.bfJ().bfr() != RY.bnk) {
                    if (fyw_0.gqw().to("splitExchangeAmountOfCashDialog")) {
                        fyw_0.gqw().tl("splitExchangeAmountOfCashDialog");
                    }
                    if (fyw_0.gqw().to("splitStackDialog")) {
                        fyw_0.gqw().tl("splitStackDialog");
                    }
                    bsl_0.jfZ.a(null);
                }
                switch (sq.bfF()) {
                    case bow: {
                        RZ rZ = st.bfJ();
                        ckc_0 ckc_02 = new ckc_0();
                        ckc_02.setExchangeId(rZ.Sn());
                        ckc_02.dl((byte)4);
                        aue_0.cVJ().etu().d(ckc_02);
                        break;
                    }
                    case bor: 
                    case boq: {
                        bso_0 bso_02 = (bso_0)st.bfJ();
                        fik_2 fik_22 = bso_02.dFw();
                        if (fik_22 == null) break;
                        fiq_2.gCw().a(fik_22, false);
                        break;
                    }
                    case bos: {
                        long l;
                        bsp_0 bsp_02;
                        bso_0 bso_03 = (bso_0)st.bfJ();
                        fik_2 fik_23 = bso_03.dFw();
                        if (fik_23 != null) {
                            fiq_2.gCw().a(fik_23, false);
                        }
                        if ((bsp_02 = (bsp_0)bso_03.dP(l = st.fD())) != bso_03.bfn()) break;
                        aPd.f("exchange.declinedBy", bsp_02.getName());
                        aue_0.cVJ().b(cup_1.eRM());
                        aue_0.cVJ().b(ccp_1.etW());
                        break;
                    }
                    case bou: {
                        this.c(st);
                        aPd.f("exchange.locallyCanceled", new Object[0]);
                        break;
                    }
                    case bot: {
                        this.c(st);
                        bso_0 bso_04 = (bso_0)st.bfJ();
                        bsp_0 bsp_03 = bso_04.e(this);
                        aPd.f("exchange.canceledBy", bsp_03.getName());
                        break;
                    }
                    case bov: {
                        aPd.f("exchange.done", new Object[0]);
                        aue_0.cVJ().b(cup_1.eRM());
                        aue_0.cVJ().b(ccp_1.etW());
                        break;
                    }
                    case box: {
                        this.c(st);
                        aPd.e("exchange.failed", new Object[0]);
                    }
                }
                break;
            }
            case boF: {
                bso_0 bso_05 = (bso_0)st.bfJ();
                fiq_2.gCw().a(bso_05.dFw(), false);
                aue_0.cVJ().b(cur_1.eRP());
                fse_1.gFu().f("exchange.itemTrade", bso_05);
                bsp_0 bsp_04 = bso_05.e(this);
                fse_1.gFu().f("exchange.remotePlayer", bsp_04.jgv);
                this.jgx = new bsm_0(bso_05);
                if (!aue_0.cVJ().c(cup_1.eRM())) {
                    aue_0.cVJ().a(cup_1.eRM());
                }
                aue_0.cVJ().a(cup_1.eRM());
                aue_0.cVJ().a(ccp_1.etW());
                bqm_0.jbp.b(new bri_1());
                jgu.info((Object)"Le joueur d?marre un ?change");
                break;
            }
            case boE: {
                aue_0.cVJ().a(cur_1.eRP());
                bso_0 bso_06 = (bso_0)st.bfJ();
                fik_2 fik_24 = new fik_2().l("exchangeInvitation.messageIn", ((bsp_0)bso_06.bfn()).getName()).abQ(2).pd(true).vG(ccp_2.mRG.byf()).a(fil_2.gCq()).a((int n, String string) -> {
                    if (aue_0.cVJ().c(cur_1.eRP())) {
                        dbe_0 dbe_02 = new dbe_0();
                        dbe_02.oS(bso_06.Sn());
                        aaw_1.bUq().h(dbe_02);
                    } else {
                        ckc_0 ckc_02 = new ckc_0();
                        ckc_02.setExchangeId(bso_06.Sn());
                        ckc_02.dl((byte)1);
                        aue_0.cVJ().etu().d(ckc_02);
                    }
                });
                boolean bl = fiq_2.gCw().d(fik_24);
                if (bl) {
                    bso_06.a(fik_24);
                    break;
                }
                dbe_0 dbe_02 = new dbe_0();
                dbe_02.oS(bso_06.Sn());
                aaw_1.bUq().h(dbe_02);
                break;
            }
            case boD: {
                aue_0.cVJ().a(cur_1.eRP());
                bso_0 bso_07 = (bso_0)st.bfJ();
                bsp_0 bsp_05 = (bsp_0)bso_07.bfm();
                bgy bgy2 = bgg_0.dlO().ju(bsp_05.Sn());
                Object object = aum_0.cWf().c("exchangeInvitation.messageOut", bsp_05.getName());
                cqq_1 cqq_12 = new cqq_1();
                cqq_12.aH(bgy2);
                String string2 = ((cpm_1)cqq_12).eLv();
                if (string2 != null) {
                    object = (String)object + "\n" + string2;
                }
                fik_2 fik_25 = fik_2.gBY().vE((String)object).abQ(2).vG(ccp_2.mRG.byf()).a((int n, String string) -> {
                    if (n == 400) {
                        dbd_0 dbd_02 = new dbd_0();
                        dbd_02.oS(bso_07.Sn());
                        aaw_1.bUq().h(dbd_02);
                    } else {
                        dbe_0 dbe_02 = new dbe_0();
                        dbe_02.oS(bso_07.Sn());
                        aaw_1.bUq().h(dbe_02);
                    }
                });
                bso_07.a(fik_25);
                fiq_2.gCw().d(fik_25);
                break;
            }
            case boG: {
                Sw sw = (Sw)st;
                bso_0 bso_08 = (bso_0)sw.bfJ();
                if (sw.fD() == this.Sn()) {
                    switch (sw.bfM()) {
                        case boR: {
                            if (fse_1.gFu().getProperty("exchange.sourceBag") == null || fse_1.gFu().getProperty("exchange.sourcePosition") == null) {
                                jgu.error((Object)"Impossible d'ajouter l'objet : le bag / position de la source n'ont pas \u00e9t\u00e9 sp\u00e9cifi\u00e9s");
                                return;
                            }
                            bgt_0 bgt_02 = (bgt_0)this.jgv;
                            Object object = fse_1.gFu().getProperty("exchange.sourceBag").getValue();
                            if (object instanceof bde_0) {
                                short s = -sw.bfO();
                                bgt_02.dno().b(sw.bfN().LV(), s);
                                short s2 = fse_1.gFu().getProperty("exchange.sourcePosition").bGG();
                                this.jgx.a(sw.bfN(), object, s2);
                            }
                            bso_08.dFy();
                            fse_1.gFu().vX("exchange.sourceBag");
                            fse_1.gFu().vX("exchange.sourcePosition");
                            break;
                        }
                        case boS: {
                            Object object = this.jgx.a((ffV)sw.bfN(), sw.bfO());
                            if (object instanceof fgd_0) {
                                cvo_2.eUK().eUQ();
                            }
                            bso_08.dFy();
                            break;
                        }
                        case boQ: {
                            if (sw instanceof etr_0) {
                                bso_08.dFA();
                                fes_2 fes_22 = (fes_2)fyw_0.gqw().gqC().uR("exchangeDialog").uH("localMoney");
                                fes_22.getAppearance().a(new fse_2(1.0f, 0.0f, fes_22, 0, 200, 11, abn.cdr));
                                break;
                            }
                            jgu.error((Object)"Impossible de mettre a jour le portefeuille du client : l'?v?nement re?u n'est pas de la classe WakfuItemExchangerModifiedEvent");
                            break;
                        }
                        case boO: {
                            bgt_0 bgt_03 = (bgt_0)this.jgv;
                            bdl_0 bdl_02 = bgt_03.dno();
                            Collection collection = bdl_02.fVh();
                            block28: for (RT rT2 : sw.auXX()) {
                                for (ffs_0 ffs_02 : collection) {
                                    short s = ffs_02.dK(rT2.LV());
                                    if (s < 0) continue;
                                    this.jgx.a(rT2, ffs_02, s);
                                    short s3 = -rT2.bfd();
                                    ffs_02.b(rT2.LV(), s3);
                                    continue block28;
                                }
                            }
                            bso_08.dFy();
                            break;
                        }
                        case boP: {
                            sw.auXX().forEach(rT -> this.jgx.a((ffV)rT, rT.bfd()));
                            cvo_2.eUK().eUQ();
                            bso_08.dFy();
                        }
                    }
                } else {
                    switch (sw.bfM()) {
                        case boQ: {
                            bso_08.dFB();
                            fes_2 fes_23 = (fes_2)fyw_0.gqw().gqC().uR("exchangeDialog").uH("remoteMoney");
                            fes_23.getAppearance().a(new fse_2(1.0f, 0.0f, fes_23, 0, 200, 11, abn.cdr));
                            if (!(sw instanceof etr_0)) break;
                            etr_0 etr_02 = (etr_0)sw;
                            this.mo(aum_0.cWf().c("exchange.cashChanged", this.jgw.dsx().dFH().getName(), etr_02.exS()));
                            break;
                        }
                        case boR: 
                        case boS: {
                            bso_08.dFz();
                            ffV ffV2 = (ffV)sw.bfN();
                            short s = sw.bfO();
                            String string3 = sw.bfM() == Sy.boR ? "exchange.itemAdded" : "exchange.itemRemoved";
                            String string4 = aum_0.cWf().a(15, (long)ffV2.avr(), new Object[0]);
                            this.mo(aum_0.cWf().c(string3, this.jgw.dsx().dFH().getName(), s, string4));
                            break;
                        }
                        case boO: 
                        case boP: {
                            String string5 = sw.bfM() == Sy.boO ? "exchange.multiple.itemAdded" : "exchange.multiple.itemRemoved";
                            int n2 = sw.bfP();
                            if (n2 <= 0) break;
                            this.mo(aum_0.cWf().c(string5, this.jgw.dsx().dFH().getName(), n2));
                            bso_08.dFz();
                        }
                    }
                }
                bso_08.dFD();
                bso_08.dFC();
                break;
            }
        }
    }

    private void mo(String string) {
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.c(string).ceH();
        apr_0 apr_02 = (apr_0)fse_1.gFu().aW("chat", "exchangeDialog");
        if (apr_02 == null || apr_02.czW() == null) {
            return;
        }
        apr_02.czW().e("history", ahv_22.ceL());
        aeg_2.caa().a((aef_2)apr_02.czW(), "history");
    }

    private void c(St st) {
        bso_0 bso_02 = (bso_0)st.bfJ();
        this.jgx.b(bso_02);
        aue_0.cVJ().b(cup_1.eRM());
        aue_0.cVJ().b(ccp_1.etW());
    }

    public boolean dFK() {
        return false;
    }

    public void dFL() {
        if (this.jgw != null && this.jgv.dps() == this.jgw) {
            this.jgv.dnY();
        }
        this.jgw = null;
    }

    @Override
    public void clear() {
        super.clear();
        this.dFL();
    }
}

