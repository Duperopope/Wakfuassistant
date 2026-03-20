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
implements aDI {
    private static final cdl lQq = new cdl();
    private static final Logger lQr = Logger.getLogger(cdl.class);

    public static cdl etZ() {
        return lQq;
    }

    @Override
    public boolean b(aAM aAM2) {
        switch (aAM2.d()) {
            case 12125: {
                csn csn2 = (csn)aAM2;
                byte[] byArray = csn2.eAO();
                bgT bgT2 = (bgT)fcL.rUh.sw(csn2.KU());
                bgT2.as(byArray);
                fSe.gFu().a((aEF)bgT2, bgT2.bxk());
                cln cln2 = new cln();
                cln2.db(bgT2.Sn());
                aUE.cVJ().etu().d(cln2);
                return false;
            }
            case 13742: {
                csB csB2 = (csB)aAM2;
                long l = csB2.bSZ();
                ffV ffV2 = aUE.cVJ().cVK().jC(l);
                bGn bGn2 = new bGn(ffV2);
                bGn2.dTP();
                return false;
            }
            case 12056: {
                csm csm2 = (csm)aAM2;
                if (csm2.eAM()) {
                    bEx.dSm().removeAll();
                }
                ArrayList<Long> arrayList = csm2.eAN();
                for (long l : arrayList) {
                    bEx.dSm().lj(l);
                }
                return false;
            }
            case 13003: {
                cso cso2 = (cso)aAM2;
                bgT bgT3 = (bgT)fcI.ac(aUE.cVJ().cVK().Xi(), cso2.bSZ());
                bgT3.dno().b(cso2.bSZ(), cso2.bfd());
                return false;
            }
            case 12177: {
                csr csr2 = (csr)aAM2;
                ffV ffV3 = csr2.getItem();
                aPd.f("market.item.sold", csr2.oP(), aPe.a(ffV3), csr2.eAU());
                if (aUE.cVJ().c(cWl.eVl()) && cWl.eVA()) {
                    cWl.eVl().eVp();
                }
                if (fyw.gqw().to("marketSoldItemsDetailDialog")) {
                    cWl.eVl().O(bHz.dWn().dWz().dXw(), true);
                }
                return false;
            }
            case 12380: {
                css css2 = (css)aAM2;
                aPd.f("market.offer.fulfilled", css2.oP(), aPe.yU(css2.AK()), css2.eAU());
                if (aUE.cVJ().c(cWl.eVl()) && cWl.eVC()) {
                    cWl.eVl().eVq();
                }
                if (fyw.gqw().to("marketPurchasedItemsDetailDialog")) {
                    cWl.eVl().S(bHz.dWn().dWD().dXw(), true);
                }
                return false;
            }
            case 15997: {
                cyk cyk2 = (cyk)aAM2;
                int n = cyk2.aaD();
                long l = cyk2.eAU();
                aPd.f("market.item.sold.connection", n, l);
                return false;
            }
            case 15387: {
                cyn cyn2 = (cyn)aAM2;
                aPd.f("market.offer.fulfilled.connection", cyn2.oP());
                return false;
            }
            case 15313: {
                cyl cyl2 = (cyl)aAM2;
                bGN.dUk().x(cyl2.eFu());
                return false;
            }
            case 12918: {
                csp csp2 = (csp)aAM2;
                ffV ffV4 = fgA.eM(csp2.eAQ());
                bgT bgT4 = (bgT)fcI.ab(bbS.xl(), csp2.eAP());
                if (bgT4 == null) {
                    return false;
                }
                bDL bDL2 = bgT4.dno();
                if (bDL2 == null) {
                    return false;
                }
                ffs ffs2 = bDL2.sY(csp2.eAP());
                if (ffs2 == null) {
                    return false;
                }
                try {
                    short s = csp2.getDestinationPosition();
                    if (s != -1) {
                        if (ffs2.h(ffV4, s)) {
                            ffs2.i(ffV4, s);
                            if (csp2.eAB()) {
                                bGZ.a(ffV4, bgT4);
                            }
                        } else {
                            lQr.error((Object)"Erreur : impossible d'ajouter l'item \u00e0 l'endroit d\u00e9sir\u00e9 par le serveur");
                        }
                    } else if (ffs2.bq(ffV4)) {
                        ffs2.bp(ffV4);
                        if (csp2.eAB()) {
                            bGZ.a(ffV4, bgT4);
                        }
                    } else {
                        lQr.error((Object)"Erreur : impossible d'ajouter l'item \u00e0 l'endroit d\u00e9sir\u00e9 par le serveur");
                    }
                }
                catch (SA | SD | Sz sB) {
                    lQr.warn((Object)sB.getMessage(), (Throwable)sB);
                }
                return false;
            }
            case 13804: {
                csf csf2 = (csf)aAM2;
                try {
                    bGO.a(csf2.eAz(), csf2.eAB());
                }
                catch (SA sA) {
                    lQr.error((Object)"D\u00e9Synchro d'inventaire : Trop d'item", (Throwable)sA);
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
                cse cse2 = (cse)aAM2;
                sV sV2 = cse2.eAA();
                try {
                    bGO.c(cse2.eAz());
                }
                catch (SA sA) {
                    lQr.error((Object)"D\u00e9Synchro d'inventaire : Trop d'item", (Throwable)sA);
                }
                catch (Sz sz) {
                    lQr.error((Object)"D\u00e9Synchro d'inventaire : Duplication", (Throwable)sz);
                }
                catch (SD sD) {
                    lQr.error((Object)"D\u00e9Synchro d'inventaire : Mauvaise position", (Throwable)sD);
                }
                bgT bgT5 = (bgT)fcL.rUh.sw(cse2.KU());
                if (bgT5 == null) {
                    return false;
                }
                bDL bDL3 = bgT5.dno();
                bDE bDE2 = new bDE(0L, 0, ffL.sgm, 0);
                if (!bDE2.b(sV2)) {
                    lQr.error((Object)("Erreur lors de la r\u00e9cup\u00e9ration du bag uniqueId=" + sV2.ZC + ", on ignore les bags restants"));
                    return false;
                }
                bDL3.f(bDE2);
                bDE2.a(brY.jeH);
                bgT5.dlk();
                cVO.oA(bDE2.Lx());
                return false;
            }
            case 13426: {
                csv csv2 = (csv)aAM2;
                long l = csv2.eAW();
                try {
                    bGO.c(csv2.eAz());
                }
                catch (SA sA) {
                    lQr.error((Object)"D\u00e9Synchro d'inventaire : Trop d'item", (Throwable)sA);
                }
                catch (Sz sz) {
                    lQr.error((Object)"D\u00e9Synchro d'inventaire : Duplication", (Throwable)sz);
                }
                catch (SD sD) {
                    lQr.error((Object)"D\u00e9Synchro d'inventaire : Mauvaise position", (Throwable)sD);
                }
                Object t = fcI.ab(aUE.cVJ().cVK().Xi(), l);
                ((exP)t).dod().tc(l);
                ((exP)t).dlk();
                cVO.oA(l);
                return false;
            }
            case 13874: {
                boolean bl;
                csg csg2 = (csg)aAM2;
                bDL bDL4 = ((bgT)fcI.ab(aUE.cVJ().cVK().Xi(), csg2.eAC())).dno();
                ffs ffs3 = bDL4.sZ(csg2.eAC());
                if (ffs3 == null) {
                    lQr.error((Object)("Bag " + csg2.eAC() + " doesn't exist"));
                    return false;
                }
                bDH bDH2 = bDL4.le(ffs3.Lx());
                boolean bl2 = bl = bDH2 != null ? bDH2.dbK() : false;
                if (csg2.eAE()) {
                    ffs ffs4 = bDL4.sZ(csg2.eAF());
                    if (ffs4 == null) {
                        lQr.error((Object)("Bag " + csg2.eAF() + " doesn't exist"));
                    } else {
                        bDH bDH3 = bDL4.le(ffs4.Lx());
                        boolean bl3 = bDH3 != null ? bDH3.dbK() : false;
                        ffs4.dC(csg2.eAG());
                        if (bDH3 != null) {
                            bDH3.fm(bl3);
                        }
                    }
                } else if (bDH2 != null) {
                    bDH2.dRb();
                }
                ffs3.dC(csg2.eAD());
                if (bDH2 != null) {
                    bDH2.fm(bl);
                }
                bDL4.dRz();
                return false;
            }
            case 13298: {
                csi csi2 = (csi)aAM2;
                ffS ffS2 = csi2.dMQ();
                boolean bl = csi2.bfb();
                bgT bgT6 = aUE.cVJ().cVK();
                if (bgT6.doC() != null) {
                    bgT6.doC().a(ffS2, bl);
                }
                return false;
            }
            case 12792: {
                csh csh2 = (csh)aAM2;
                this.a(csh2);
                return false;
            }
            case 13608: {
                cst cst2 = (cst)aAM2;
                this.a(cst2);
                return false;
            }
            case 13000: {
                csw csw2 = (csw)aAM2;
                this.a(csw2);
                return false;
            }
            case 13997: {
                csX csX2 = (csX)aAM2;
                this.a(csX2);
                return false;
            }
            case 12690: {
                csY csY2 = (csY)aAM2;
                this.mP(csY2.eBM());
                return false;
            }
            case 12808: {
                csV csV2 = (csV)aAM2;
                this.a(csV2);
                return false;
            }
            case 12940: {
                csT csT2 = (csT)aAM2;
                long l = csT2.Lx();
                fhe fhe2 = bGr.jVu.tu(csT2.KU());
                Optional<ffV> optional = fhe2.A(l);
                cVu.eTO().J(csT2.KU(), l);
                if (optional.isEmpty()) {
                    lQr.error((Object)("Try to remove an unknown item id=" + l + " from Equipement Inventory of character " + csT2.KU()));
                }
                return false;
            }
            case 13601: {
                csx csx2 = (csx)aAM2;
                this.a(csx2);
                return false;
            }
            case 12744: {
                csW csW2 = (csW)aAM2;
                this.a(csW2);
                return false;
            }
        }
        return true;
    }

    @Nullable
    private static ffV lR(long l) {
        bgT bgT2 = aUE.cVJ().cVK();
        fqo fqo2 = fqn.e(l, bgT2);
        if (fqo2.gia() != fqp.sSM) {
            return fqo2.getItem();
        }
        if (cVu.eQx()) {
            return cVu.eTO().kT(l);
        }
        return null;
    }

    private void a(csV csV2) {
        long l = csV2.KU();
        fhk fhk2 = fhj.eN(csV2.eBI());
        byte by = csV2.deO();
        fhm fhm2 = fhp.sop.aJ(aUE.cVJ().cVK().Xi(), l);
        fhm2.a(by, fhk2);
    }

    private void a(csX csX2) {
        long l = csX2.eBK();
        int n = csX2.eBL();
        bgT bgT2 = aUE.cVJ().cVK();
        ffV ffV2 = fcI.an(bgT2.aZj(), l);
        ffV2.UX(n);
        fSe.gFu().a((aEF)ffV2, "iconUrl", "hasMimiSymbic");
    }

    private void mP(long l) {
        bgT bgT2 = aUE.cVJ().cVK();
        ffV ffV2 = fcI.an(bgT2.aZj(), l);
        if (ffV2 == null) {
            lQr.error((Object)("[MIMISYMBIC] On re\u00e7oit une demande de suppression de skin d'un item qui n'existe pas " + l));
            return;
        }
        lQr.info((Object)("[MIMISYMBIC] Suppression du skin de l'item " + String.valueOf(ffV2)));
        ffV2.UX(0);
        fSe.gFu().a((aEF)ffV2, "iconUrl", "hasMimiSymbic");
    }

    private void a(csw csw2) {
        fha fha2 = csw2.eBa();
        if (fha2 != fha.smO) {
            fIQ.gCw().d(fIK.gBZ().l(switch (fha2) {
                case fha.smP -> "identification.error.no.enough.space";
                case fha.smQ -> "identification.error.too.high.level";
                default -> "identification.error.unknownError";
            }, new Object[0]).vG(cCP.mRF.byf()).abQ(1));
            return;
        }
        long l = csw2.bSZ();
        fgY fgY2 = csw2.eAX();
        fhI fhI2 = csw2.eAZ();
        ffV ffV2 = cdl.lR(l);
        if (ffV2 == null) {
            lQr.error((Object)"We received a roll notification for an unknown item");
            return;
        }
        if (fhI2 != null) {
            boolean bl = (!ffV2.dXg() || !fhI2.d(ffV2.eAZ())) && fhI2.fYI() > 0;
            ffV2.a(fhI2);
            if (bl) {
                bYJ.epo().a(new bYu(ffV2));
            }
        }
        if (fgY2 != null) {
            ffV2.a(fgY2);
        }
        ffV2.bYg();
        fSe.gFu().a((aEF)ffV2, "effect", "caracteristic", "effectAndCaracteristic", "allCharacteristics", "identificationNeeded", "slotsIdentificationNeeded");
        bhJ bhJ2 = (bhJ)fcI.ag(bbS.xl(), ffV2.LV());
        if (bhJ2 != null) {
            cVu.a(ffV2, bhJ2);
        } else {
            eJS eJS2 = bEj.b(aUE.cVJ().cVK(), ffV2);
            if (eJS2 != null) {
                cTs.o(eJS2);
            }
        }
        if (cUi.eQx()) {
            cUi.eRw().t(ffV2);
        }
        cAY.eHc().nP(600204L);
        fSe.gFu().f("itemPopupDetail", ffV2);
    }

    private void a(csx csx2) {
        Object object;
        bgT bgT2 = aUE.cVJ().cVK();
        ffV ffV2 = cdl.lR(csx2.eBb());
        if (ffV2 == null) {
            lQr.error((Object)("We received a sublimation notification for an unknown item : " + csx2.eBb()));
            return;
        }
        long l = csx2.eBc();
        ffV ffV3 = fcI.an(bgT2.aZj(), l);
        if (ffV3 == null) {
            lQr.error((Object)("We received a sublimation notification with an unknown sublimation item : " + l));
            return;
        }
        fhK.b(ffV2, ffV3);
        ffV2.bYg();
        if (cUi.eQx()) {
            cAY.eHc().nP(600205L);
            object = ffV3.dCC().dCF();
            cUi.eRw().d(ffV2, (fhR)((Object)object));
        }
        object = (bhJ)fcI.ag(bbS.xl(), ffV2.LV());
        cVu.a(ffV2, object);
    }

    private void a(cst cst2) {
        int n = cst2.avr();
        if (aUE.cVJ().c(cSw.eOf())) {
            cSw.eOf().Mu(n);
        }
    }

    private void a(csh csh2) {
        int n = csh2.eAH();
        int n2 = csh2.eAI();
        String string = aUM.cWf().c("recycle.resultMessage", n, n2);
        bYJ.epo().a(bYC.a(bYH.lAA, string));
        aPh.czg().iZ(string);
    }

    private void a(csW csW2) {
        String string = aUM.cWf().c("account.mimiSymbic.confirmed", aPe.yU(csW2.eBJ()));
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
