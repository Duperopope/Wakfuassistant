/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from cdP
 */
public class cdp_0
implements adi_1 {
    public static final boolean lRd = false;
    private static final cdp_0 lRe = new cdp_0();
    protected static final Logger lRf = Logger.getLogger(cdp_0.class);

    public static cdp_0 euh() {
        return lRe;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        switch (aam_22.d()) {
            case 13690: {
                cvj_0 cvj_02 = (cvj_0)aam_22;
                ait_2.bBq().a(cvj_02.aGD(), cvj_02.aGz(), cvj_02.eEn(), cvj_02.eEo());
                return false;
            }
            case 13197: {
                cvw_0 cvw_02 = (cvw_0)aam_22;
                bgd.diV().b(cvw_02.eDY(), cvw_02.aGD());
                aag_1 aag_12 = cvw_02.eDZ();
                if (aag_12 != null) {
                    int n = aag_12.bTR();
                    for (int i = 0; i < n; ++i) {
                        bgd.diV().a((byte)aag_12.wa(i), aag_12.wo(i), cvw_02.aGD());
                    }
                }
                return false;
            }
            case 13455: {
                cvz_0 cvz_02 = (cvz_0)aam_22;
                bgd.diV().Cw(cvz_02.aGD());
                bJP bJP2 = (bJP)bjy_0.kmO.ebc();
                bJP2.HJ(cvz_02.aGD());
                this.c(bJP2);
                bqm_0.jbp.b(new brc_1());
                return false;
            }
            case 12169: {
                cvv_0 cvv_02 = (cvv_0)aam_22;
                bgd.diV().dj(cvv_02.aGD(), cvv_02.avZ());
                return false;
            }
            case 12626: {
                cvD cvD2 = (cvD)aam_22;
                bgd.diV().a(cvD2.djg(), cvD2.eEk(), cvD2.aGD());
                return false;
            }
            case 12118: {
                cvi_0 cvi_02 = (cvi_0)aam_22;
                lRf.info((Object)("reception d'un message de Reward pour le challenge " + cvi_02.aGD()));
                this.es(cvi_02.aGD(), cvi_02.eEm());
                return false;
            }
            case 13043: {
                cvt_0 cvt_02 = (cvt_0)aam_22;
                bgt_0 bgt_03 = (bgt_0)fcL.rUh.sw(cvt_02.KU());
                long l = cvt_02.Lx();
                Object r = fgD.fXh().Vd(cvt_02.avr());
                if (r != null) {
                    ffV ffV2 = new ffV(l);
                    ffV2.l((fhc_0)r);
                    ffV2.ak(cvt_02.bfd());
                    if (bgt_03.dno().cw(ffV2) == null) {
                        lRf.error((Object)("[Add_item_inventory] : L'ajout d'un item en provenance d'un sc\u00e9nario a \u00e9chou\u00e9. Probl\u00e8me de synchro client/serveur ? Item : " + ((fhc_0)r).d()));
                    } else if (cvt_02.eDX() && ((fhc_0)r).fYv()) {
                        if (!aue_0.cVJ().c(ctg_2.ePq())) {
                            aue_0.cVJ().a(ctg_2.ePq());
                        }
                        ctg_2.ePq().k(((fhc_0)r).d(), cvt_02.bfd());
                    } else {
                        bgz_2.a(ffV2, bgt_03);
                    }
                } else {
                    lRf.error((Object)("[ADD_ITEM_INVENTORY] : Impossible de trouver de r\u00e9f\u00e9renceItem d'id " + cvt_02.avr()));
                }
                return false;
            }
            case 13302: {
                cvG cvG2 = (cvG)aam_22;
                long l = cvG2.Lx();
                bgt_0 bgt_04 = (bgt_0)fcI.ac(bgt_02.Xi(), l);
                if (bej_1.a(bgt_04, l, false) != null) {
                    return false;
                }
                if (bgt_04.doC().dL(l) != null) {
                    return false;
                }
                return false;
            }
            case 13518: {
                fgd_0 fgd_02;
                int n;
                cvh_0 cvh_02 = (cvh_0)aam_22;
                bgt_0 bgt_05 = (bgt_0)fcL.rUh.sw(cvh_02.KU());
                if (bgt_05 == null) {
                    return false;
                }
                int n2 = cvh_02.avr();
                int n3 = cvh_02.eEl();
                if (n3 == -1) {
                    n = bgt_05.dno().UJ(n2);
                } else {
                    n = bgt_05.dno().fQ(n2, n3);
                    n3 -= n;
                }
                if (n != 0) {
                    bgz_2.dK(n2, n);
                }
                if ((fgd_02 = bgt_05.doC()) == null) {
                    return false;
                }
                if (n3 == -1) {
                    fgd_02.pe(n2);
                    bgt_05.dlG().a(n2, fqu_0.sTs, true);
                }
                if (n3 > 0) {
                    fgd_02.ae(n2, n3);
                    bgt_05.dlG().a(n2, fqu_0.sTs, true);
                }
                return false;
            }
            case 12313: {
                cvo_0 cvo_02 = (cvo_0)aam_22;
                long l = cvo_02.Lx();
                ffV ffV3 = (ffV)bgt_02.doC().dN(l);
                try {
                    fdX.fUr().a(bgt_02.doC(), bgt_02.dno().sY(cvo_02.eEq()).fVb(), cvo_02.eEp(), ffV3, bgt_02, bgt_02.fgg());
                }
                catch (sa_0 sa_02) {
                    lRf.warn((Object)"Ne devrait pas arriver : Impossible de d\u00e9s\u00e9quiper cet objet car la capacit\u00e9 maximum du sac a \u00e9t\u00e9 atteinte");
                }
                catch (Sz sz) {
                    lRf.warn((Object)"Ne devrait pas arriver : Impossible d'\u00e9quiper cet objet car l'objet est d\u00e9j\u00e0 pr\u00e9sent");
                }
                cvo_2.eUK().eUQ();
                return false;
            }
            case 12345: {
                bJr bJr2;
                cvy_0 cvy_02 = (cvy_0)aam_22;
                int n = cvy_02.eEb();
                int n4 = cvy_02.eEc();
                int n5 = cvy_02.eEd();
                ux_0 ux_02 = cvy_02.dis();
                int n6 = cvy_02.ctn();
                byte by = cvy_02.dij();
                boolean bl = cvy_02.eEe();
                TIntArrayList tIntArrayList = cvy_02.eEa();
                int n7 = cvy_02.diy();
                ewc_0 ewc_02 = by != -1 ? ewc_0.values()[by] : null;
                lRf.info((Object)("Challenge courant : " + n + " (dans " + n4 + "s)"));
                bfP bfP2 = bfP.dhT();
                bfT bfT2 = bfP2.dhR();
                bfP2.dhY();
                bfT bfT3 = bfP2.dhR();
                if (!bl && bfT3 != null) {
                    bfP2.dhU();
                }
                boolean bl2 = false;
                if (bfP2.dhP() != ewc_02) {
                    bfP2.a(ewc_02, n5);
                    bl2 = true;
                }
                bfP2.Ch(n6);
                if (!bl || n == -1) {
                    bfP2.a(-1, n5, ux_02, tIntArrayList, n6);
                    lRf.info((Object)"Pas de challenge dans cette zone, on s'arr\u00eate l\u00e0");
                    return false;
                }
                bfP2.a(n, n5, ux_02, tIntArrayList, n6);
                bfP2.dhR().Cg(n7);
                if (bl && bl2) {
                    bfP2.dhX();
                }
                if ((bJr2 = (bJr)bjx_0.klY.Ym(n6)) != null) {
                    bjq_0 bjq_02 = (bjq_0)bjy_0.kmO.ebc();
                    bjq_02.f(bJr2);
                    bjq_02.HJ(n);
                    bfU bfU2 = bgd.diV().Cs(n);
                    if (bfU2 != null) {
                        ffV ffV4;
                        bjq_02.eQ(bfU2.diA());
                        ArrayList<bgh> arrayList = bfU2.aFV();
                        if (!arrayList.isEmpty() && (ffV4 = fgD.fXh().Ve(arrayList.get(0).azv())) != null) {
                            bjq_02.mX(aPe.a(ffV4));
                        }
                    }
                    this.c(bjq_02);
                } else {
                    lRf.error((Object)("R\u00e9ception d'un \u00e9venement de challenge pour un protecteur qu'on ne connait pas id=" + n6 + " eventType=CHALLENGE_INFORMATION"));
                }
                return false;
            }
            case 13009: {
                cvB cvB2 = (cvB)aam_22;
                ewc_0 ewc_03 = ewc_0.values()[cvB2.bvd()];
                bfP.dhT().a(ewc_03, cvB2.eEg());
                bfP.dhT().dhX();
                bfT bfT4 = bfP.dhT().dhR();
                if (ewc_03 == ewc_0.oIh && bfP.dhT().dhR() == bfT4 && !bfT4.aGd()) {
                    dgw.fcT().a(new dgo(dgx.okM, bfT4.bAD(), 500, 2500, "AnimChallenge1"));
                    cAY.eHc().nP(600144L);
                    dcd dcd2 = new dcd(aum_0.cWf().c("notification.challengeStartTitle", new Object[0]), aum_0.cWf().c("notification.challengeStartText", new Object[0]), biu_1.kiC);
                    aaw_1.bUq().h(dcd2);
                }
                return false;
            }
            case 12147: {
                coq_0 coq_02 = (coq_0)aam_22;
                switch (coq_02.ewg()) {
                    case 202: {
                        bfT bfT5 = bfP.dhT().dhR();
                        if (bfT5 == null) break;
                        bfT5.fH(false);
                    }
                }
                if (coq_02.ewg() == 0) {
                    aPh aPh2 = aPh.czg();
                    bNG.egl();
                    aPh2.iZ(bNG.b(coq_02.ewg(), new Object[0]));
                } else {
                    bNG.egl();
                    bNG.a(coq_02.ewg(), new Object[0]);
                }
                return false;
            }
            case 12057: {
                cvE cvE2 = (cvE)aam_22;
                ccj_2.g("challengeInputDialog", 40960L);
                bgp bgp2 = new bgp(cvE2.aGD(), cvE2.djg(), cvE2.cak());
                fyw_0.gqw().d("wakfu.challenge", bfX.class);
                fse_1.gFu().f("waitingForInputChallenge", bgp2);
                return false;
            }
            case 12624: {
                cvL cvL2 = (cvL)aam_22;
                bfT bfT6 = bgd.diV().Cr(cvL2.clS());
                bfT6.N(cvL2.aZw());
                return false;
            }
            case 12498: {
                cvx_0 cvx_02 = (cvx_0)aam_22;
                bfT bfT7 = bfP.dhT().dhR();
                if (bfT7 != null) {
                    bfT7.Cg(cvx_02.diy());
                }
                return false;
            }
            case 12078: {
                cvC cvC2 = (cvC)aam_22;
                this.es(cvC2.aGD(), cvC2.eEi());
                boolean bl = bfP.dhT().dib();
                bfT bfT8 = bgd.diV().Cr(cvC2.aGD());
                String string = cvC2.div();
                if (bl) {
                    bfT8.bs((short)(cvC2.coS() + 1));
                    bfT8.Cm(cvC2.eEi());
                    bfT8.lC(string);
                    bfT8.Cn(cvC2.diw());
                    csk_2.eOu().e(bfT8);
                    if (!aue_0.cVJ().c(csk_2.eOu())) {
                        aue_0.cVJ().a(csk_2.eOu());
                    }
                    cAY.eHc().nP(600130L);
                }
                if (bfT8.dig().aGd()) {
                    aPd.f("chat.challenge.chaosEnded", new Object[0]);
                } else if (bl) {
                    String string2 = aue_0.cVJ().cVK().getName();
                    if (string != null && string.length() > 0) {
                        if (!string2.equals(string)) {
                            aPd.f("chat.challenge.won", string, bfT8.bAD());
                        } else {
                            aPd.f("chat.challenge.selfComplete", bfT8.bAD());
                        }
                    } else {
                        aPd.f("chat.challenge.self.won", bfT8.bAD());
                    }
                }
                bfP.dhT().a(ewc_0.oIi);
                bfP.dhT().dhX();
                return false;
            }
            case 13998: {
                cvF cvF2 = (cvF)aam_22;
                afx_1 afx_12 = ait_2.bBq().g(cvF2.aGD(), false);
                bfP.dhT().Ci(cvF2.aGD());
                if (afx_12 != null) {
                    afx_12.caG();
                }
                return false;
            }
            case 12699: {
                cvn_0 cvn_02 = (cvn_0)aam_22;
                afx_1 afx_13 = ait_2.bBq().g(cvn_02.aGD(), false);
                bfT bfT9 = bgd.diV().Cr(cvn_02.aGD());
                boolean bl = bfP.dhT().dib();
                if (bfT9 != null && bl && !bfT9.dig().aGd()) {
                    aPd.f("chat.challenge.failed", bfT9.bAD());
                    bfT9.bs((short)-2);
                    bfT9.Cm(-1);
                    bfT9.lC(null);
                    bfT9.Cn(0);
                    bfT9.Co(cvn_02.eyx());
                }
                if (afx_13 != null) {
                    afx_13.caG();
                }
                return false;
            }
            case 12158: {
                cvA cvA2 = (cvA)aam_22;
                bfT bfT10 = bfP.dhT().dhR();
                if (bfT10 != null) {
                    bfT10.bs(cvA2.dit());
                }
                return false;
            }
            case 13500: {
                crw_0 crw_02 = (crw_0)aam_22;
                cdp_0.a(crw_02.ezX(), crw_02.avZ(), crw_02.ezY());
                return false;
            }
        }
        return true;
    }

    private void es(int n, int n2) {
        bgd.diV().a(n, new TIntArrayList(new int[]{n2}));
        bfP.dhT().dia();
    }

    public void c(bjw_0 bjw_02) {
        int n = bfP.dhT().dhQ();
        bJr bJr2 = (bJr)bjx_0.klY.Ym(n);
        if (bJr2 != null) {
            bjw_02.f(bJr2);
            fpm.sNJ.b(bjw_02);
        } else {
            lRf.error((Object)("R\u00e9ception d'un \u00e9venement de challenge pour un protecteur qu'on ne connait pas id=" + n + " eventType=" + bjw_02.getClass().getSimpleName()));
        }
    }

    @Override
    public long Sn() {
        return 6L;
    }

    @Override
    public void dC(long l) {
    }

    public static afx_1 a(exj_1 exj_12, int n, Map<String, Object> map) {
        String string = exj_12 == exj_1.rIC ? "genericIEActions/%d.lua" : "ie_actions/%d.lua";
        String string2 = String.format(string, n);
        return afs_1.can().a(string2, null, map, (afd_1)new cdq_0(string2), false);
    }
}

