/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class cdl
implements adi_1 {
    private static final cdl lQq = new cdl();
    private static final Logger lQr = Logger.getLogger(cdl.class);

    public static cdl etZ() {
        return lQq;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 12125: {
                csn_0 csn_02 = (csn_0)aam_22;
                byte[] byArray = csn_02.eAO();
                bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(csn_02.KU());
                bgt_02.as(byArray);
                fse_1.gFu().a((aef_2)bgt_02, bgt_02.bxk());
                cln cln2 = new cln();
                cln2.db(bgt_02.Sn());
                aue_0.cVJ().etu().d(cln2);
                return false;
            }
            case 13742: {
                csb_0 csb_02 = (csb_0)aam_22;
                long l = csb_02.bSZ();
                ffV ffV2 = aue_0.cVJ().cVK().jC(l);
                bgn_2 bgn_22 = new bgn_2(ffV2);
                bgn_22.dTP();
                return false;
            }
            case 12056: {
                csm csm2 = (csm)aam_22;
                if (csm2.eAM()) {
                    bex_1.dSm().removeAll();
                }
                ArrayList<Long> arrayList = csm2.eAN();
                for (long l : arrayList) {
                    bex_1.dSm().lj(l);
                }
                return false;
            }
            case 13003: {
                cso cso2 = (cso)aam_22;
                bgt_0 bgt_03 = (bgt_0)fcI.ac(aue_0.cVJ().cVK().Xi(), cso2.bSZ());
                bgt_03.dno().b(cso2.bSZ(), cso2.bfd());
                return false;
            }
            case 12177: {
                csr_0 csr_02 = (csr_0)aam_22;
                ffV ffV3 = csr_02.getItem();
                aPd.f("market.item.sold", csr_02.oP(), aPe.a(ffV3), csr_02.eAU());
                if (aue_0.cVJ().c(cwl_1.eVl()) && cwl_1.eVA()) {
                    cwl_1.eVl().eVp();
                }
                if (fyw_0.gqw().to("marketSoldItemsDetailDialog")) {
                    cwl_1.eVl().O(bhz_2.dWn().dWz().dXw(), true);
                }
                return false;
            }
            case 12380: {
                css_0 css_02 = (css_0)aam_22;
                aPd.f("market.offer.fulfilled", css_02.oP(), aPe.yU(css_02.AK()), css_02.eAU());
                if (aue_0.cVJ().c(cwl_1.eVl()) && cwl_1.eVC()) {
                    cwl_1.eVl().eVq();
                }
                if (fyw_0.gqw().to("marketPurchasedItemsDetailDialog")) {
                    cwl_1.eVl().S(bhz_2.dWn().dWD().dXw(), true);
                }
                return false;
            }
            case 15997: {
                cyk cyk2 = (cyk)aam_22;
                int n = cyk2.aaD();
                long l = cyk2.eAU();
                aPd.f("market.item.sold.connection", n, l);
                return false;
            }
            case 15387: {
                cyn cyn2 = (cyn)aam_22;
                aPd.f("market.offer.fulfilled.connection", cyn2.oP());
                return false;
            }
            case 15313: {
                cyl cyl2 = (cyl)aam_22;
                bgn_1.dUk().x(cyl2.eFu());
                return false;
            }
            case 12918: {
                csp_0 csp_02 = (csp_0)aam_22;
                ffV ffV4 = fga_0.eM(csp_02.eAQ());
                bgt_0 bgt_04 = (bgt_0)fcI.ab(bbs_2.xl(), csp_02.eAP());
                if (bgt_04 == null) {
                    return false;
                }
                bdl_0 bdl_02 = bgt_04.dno();
                if (bdl_02 == null) {
                    return false;
                }
                ffs_0 ffs_02 = bdl_02.sY(csp_02.eAP());
                if (ffs_02 == null) {
                    return false;
                }
                try {
                    short s = csp_02.getDestinationPosition();
                    if (s != -1) {
                        if (ffs_02.h(ffV4, s)) {
                            ffs_02.i(ffV4, s);
                            if (csp_02.eAB()) {
                                bgz_2.a(ffV4, bgt_04);
                            }
                        } else {
                            lQr.error((Object)"Erreur : impossible d'ajouter l'item \u00e0 l'endroit d\u00e9sir\u00e9 par le serveur");
                        }
                    } else if (ffs_02.bq(ffV4)) {
                        ffs_02.bp(ffV4);
                        if (csp_02.eAB()) {
                            bgz_2.a(ffV4, bgt_04);
                        }
                    } else {
                        lQr.error((Object)"Erreur : impossible d'ajouter l'item \u00e0 l'endroit d\u00e9sir\u00e9 par le serveur");
                    }
                }
                catch (SD | Sz | sa_0 sb_02) {
                    lQr.warn((Object)sb_02.getMessage(), (Throwable)sb_02);
                }
                return false;
            }
            case 13804: {
                csf csf2 = (csf)aam_22;
                try {
                    bgo_2.a(csf2.eAz(), csf2.eAB());
                }
                catch (sa_0 sa_02) {
                    lQr.error((Object)"D\u00e9Synchro d'inventaire : Trop d'item", (Throwable)sa_02);
                }
                catch (Sz sz) {
                    lQr.error((Object)"D\u00e9Synchro d'inventaire : Duplication", (Throwable)sz);
                }
                catch (SD sD) {
                    lQr.error((Object)"D\u00e9Synchro d'inventaire : Mauvaise position", (Throwable)sD);
                }
                return false;
            }
            case 13548: {
                cse cse2 = (cse)aam_22;
                sv_2 sv_22 = cse2.eAA();
                try {
                    bgo_2.c(cse2.eAz());
                }
                catch (sa_0 sa_03) {
                    lQr.error((Object)"D\u00e9Synchro d'inventaire : Trop d'item", (Throwable)sa_03);
                }
                catch (Sz sz) {
                    lQr.error((Object)"D\u00e9Synchro d'inventaire : Duplication", (Throwable)sz);
                }
                catch (SD sD) {
                    lQr.error((Object)"D\u00e9Synchro d'inventaire : Mauvaise position", (Throwable)sD);
                }
                bgt_0 bgt_05 = (bgt_0)fcL.rUh.sw(cse2.KU());
                if (bgt_05 == null) {
                    return false;
                }
                bdl_0 bdl_03 = bgt_05.dno();
                bde_0 bde_02 = new bde_0(0L, 0, ffl_0.sgm, 0);
                if (!bde_02.b(sv_22)) {
                    lQr.error((Object)("Erreur lors de la r\u00e9cup\u00e9ration du bag uniqueId=" + sv_22.ZC + ", on ignore les bags restants"));
                    return false;
                }
                bdl_03.f(bde_02);
                bde_02.a(bry_0.jeH);
                bgt_05.dlk();
                cvo_2.oA(bde_02.Lx());
                return false;
            }
            case 13426: {
                csv csv2 = (csv)aam_22;
                long l = csv2.eAW();
                try {
                    bgo_2.c(csv2.eAz());
                }
                catch (sa_0 sa_04) {
                    lQr.error((Object)"D\u00e9Synchro d'inventaire : Trop d'item", (Throwable)sa_04);
                }
                catch (Sz sz) {
                    lQr.error((Object)"D\u00e9Synchro d'inventaire : Duplication", (Throwable)sz);
                }
                catch (SD sD) {
                    lQr.error((Object)"D\u00e9Synchro d'inventaire : Mauvaise position", (Throwable)sD);
                }
                Object t = fcI.ab(aue_0.cVJ().cVK().Xi(), l);
                ((exP)t).dod().tc(l);
                ((exP)t).dlk();
                cvo_2.oA(l);
                return false;
            }
            case 13874: {
                boolean bl;
                csg csg2 = (csg)aam_22;
                bdl_0 bdl_04 = ((bgt_0)fcI.ab(aue_0.cVJ().cVK().Xi(), csg2.eAC())).dno();
                ffs_0 ffs_03 = bdl_04.sZ(csg2.eAC());
                if (ffs_03 == null) {
                    lQr.error((Object)("Bag " + csg2.eAC() + " doesn't exist"));
                    return false;
                }
                bdh_0 bdh_02 = bdl_04.le(ffs_03.Lx());
                boolean bl2 = bl = bdh_02 != null ? bdh_02.dbK() : false;
                if (csg2.eAE()) {
                    ffs_0 ffs_04 = bdl_04.sZ(csg2.eAF());
                    if (ffs_04 == null) {
                        lQr.error((Object)("Bag " + csg2.eAF() + " doesn't exist"));
                    } else {
                        bdh_0 bdh_03 = bdl_04.le(ffs_04.Lx());
                        boolean bl3 = bdh_03 != null ? bdh_03.dbK() : false;
                        ffs_04.dC(csg2.eAG());
                        if (bdh_03 != null) {
                            bdh_03.fm(bl3);
                        }
                    }
                } else if (bdh_02 != null) {
                    bdh_02.dRb();
                }
                ffs_03.dC(csg2.eAD());
                if (bdh_02 != null) {
                    bdh_02.fm(bl);
                }
                bdl_04.dRz();
                return false;
            }
            case 13298: {
                csi csi2 = (csi)aam_22;
                ffS ffS2 = csi2.dMQ();
                boolean bl = csi2.bfb();
                bgt_0 bgt_06 = aue_0.cVJ().cVK();
                if (bgt_06.doC() != null) {
                    bgt_06.doC().a(ffS2, bl);
                }
                return false;
            }
            case 12792: {
                csh_0 csh_02 = (csh_0)aam_22;
                this.a(csh_02);
                return false;
            }
            case 13608: {
                cst_0 cst_02 = (cst_0)aam_22;
                this.a(cst_02);
                return false;
            }
            case 13000: {
                csw_0 csw_02 = (csw_0)aam_22;
                this.a(csw_02);
                return false;
            }
            case 13997: {
                csx_0 csx_02 = (csx_0)aam_22;
                this.a(csx_02);
                return false;
            }
            case 12690: {
                csy_0 csy_02 = (csy_0)aam_22;
                this.mP(csy_02.eBM());
                return false;
            }
            case 12808: {
                csv_0 csv_02 = (csv_0)aam_22;
                this.a(csv_02);
                return false;
            }
            case 12940: {
                csT csT2 = (csT)aam_22;
                long l = csT2.Lx();
                fhe fhe2 = bgr_1.jVu.tu(csT2.KU());
                Optional<ffV> optional = fhe2.A(l);
                cvu_2.eTO().J(csT2.KU(), l);
                if (optional.isEmpty()) {
                    lQr.error((Object)("Try to remove an unknown item id=" + l + " from Equipement Inventory of character " + csT2.KU()));
                }
                return false;
            }
            case 13601: {
                csx csx2 = (csx)aam_22;
                this.a(csx2);
                return false;
            }
            case 12744: {
                csW csW2 = (csW)aam_22;
                this.a(csW2);
                return false;
            }
        }
        return true;
    }

    @Nullable
    private static ffV lR(long l) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        fqo_0 fqo_02 = fqn_0.e(l, bgt_02);
        if (fqo_02.gia() != fqp_0.sSM) {
            return fqo_02.getItem();
        }
        if (cvu_2.eQx()) {
            return cvu_2.eTO().kT(l);
        }
        return null;
    }

    private void a(csv_0 csv_02) {
        long l = csv_02.KU();
        fhk fhk2 = fhj.eN(csv_02.eBI());
        byte by = csv_02.deO();
        fhm fhm2 = fhp.sop.aJ(aue_0.cVJ().cVK().Xi(), l);
        fhm2.a(by, fhk2);
    }

    private void a(csx_0 csx_02) {
        long l = csx_02.eBK();
        int n = csx_02.eBL();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        ffV ffV2 = fcI.an(bgt_02.aZj(), l);
        ffV2.UX(n);
        fse_1.gFu().a((aef_2)ffV2, "iconUrl", "hasMimiSymbic");
    }

    private void mP(long l) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        ffV ffV2 = fcI.an(bgt_02.aZj(), l);
        if (ffV2 == null) {
            lQr.error((Object)("[MIMISYMBIC] On re\u00e7oit une demande de suppression de skin d'un item qui n'existe pas " + l));
            return;
        }
        lQr.info((Object)("[MIMISYMBIC] Suppression du skin de l'item " + String.valueOf(ffV2)));
        ffV2.UX(0);
        fse_1.gFu().a((aef_2)ffV2, "iconUrl", "hasMimiSymbic");
    }

    private void a(csw_0 csw_02) {
        fha_0 fha_02 = csw_02.eBa();
        if (fha_02 != fha_0.smO) {
            fiq_2.gCw().d(fik_2.gBZ().l(switch (fha_02) {
                case fha_0.smP -> "identification.error.no.enough.space";
                case fha_0.smQ -> "identification.error.too.high.level";
                default -> "identification.error.unknownError";
            }, new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
            return;
        }
        long l = csw_02.bSZ();
        fgy_0 fgy_02 = csw_02.eAX();
        fhi_0 fhi_02 = csw_02.eAZ();
        ffV ffV2 = cdl.lR(l);
        if (ffV2 == null) {
            lQr.error((Object)"We received a roll notification for an unknown item");
            return;
        }
        if (fhi_02 != null) {
            boolean bl = (!ffV2.dXg() || !fhi_02.d(ffV2.eAZ())) && fhi_02.fYI() > 0;
            ffV2.a(fhi_02);
            if (bl) {
                byj_1.epo().a(new byu_2(ffV2));
            }
        }
        if (fgy_02 != null) {
            ffV2.a(fgy_02);
        }
        ffV2.bYg();
        fse_1.gFu().a((aef_2)ffV2, "effect", "caracteristic", "effectAndCaracteristic", "allCharacteristics", "identificationNeeded", "slotsIdentificationNeeded");
        bhJ bhJ2 = (bhJ)fcI.ag(bbs_2.xl(), ffV2.LV());
        if (bhJ2 != null) {
            cvu_2.a(ffV2, bhJ2);
        } else {
            eJS eJS2 = bej_1.b(aue_0.cVJ().cVK(), ffV2);
            if (eJS2 != null) {
                cts_1.o(eJS2);
            }
        }
        if (cui_1.eQx()) {
            cui_1.eRw().t(ffV2);
        }
        cAY.eHc().nP(600204L);
        fse_1.gFu().f("itemPopupDetail", ffV2);
    }

    private void a(csx csx2) {
        Object object;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        ffV ffV2 = cdl.lR(csx2.eBb());
        if (ffV2 == null) {
            lQr.error((Object)("We received a sublimation notification for an unknown item : " + csx2.eBb()));
            return;
        }
        long l = csx2.eBc();
        ffV ffV3 = fcI.an(bgt_02.aZj(), l);
        if (ffV3 == null) {
            lQr.error((Object)("We received a sublimation notification with an unknown sublimation item : " + l));
            return;
        }
        fhk_0.b(ffV2, ffV3);
        ffV2.bYg();
        if (cui_1.eQx()) {
            cAY.eHc().nP(600205L);
            object = ffV3.dCC().dCF();
            cui_1.eRw().d(ffV2, (fhr_0)((Object)object));
        }
        object = (bhJ)fcI.ag(bbs_2.xl(), ffV2.LV());
        cvu_2.a(ffV2, object);
    }

    private void a(cst_0 cst_02) {
        int n = cst_02.avr();
        if (aue_0.cVJ().c(csw_2.eOf())) {
            csw_2.eOf().Mu(n);
        }
    }

    private void a(csh_0 csh_02) {
        int n = csh_02.eAH();
        int n2 = csh_02.eAI();
        String string = aum_0.cWf().c("recycle.resultMessage", n, n2);
        byj_1.epo().a(byc_1.a(byh_1.lAA, string));
        aPh.czg().iZ(string);
    }

    private void a(csW csW2) {
        String string = aum_0.cWf().c("account.mimiSymbic.confirmed", aPe.yU(csW2.eBJ()));
        aPh.czg().iZ(string);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

