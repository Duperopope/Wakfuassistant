/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cdJ
implements adi_1 {
    protected static final Logger lQT = Logger.getLogger(cdJ.class);
    public static final cdJ lQU = new cdJ();

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 13089: {
                this.a((cuN)aam_22);
                return false;
            }
            case 13905: {
                this.a((cuO)aam_22);
                return false;
            }
            case 12772: {
                this.a((cuP)aam_22);
                return false;
            }
            case 13675: {
                cuM cuM2 = (cuM)aam_22;
                bJr bJr2 = (bJr)bjx_0.klY.Ym(cuM2.ctn());
                if (bJr2 == null) {
                    bJr2 = bjx_0.klY.HC(cuM2.ctn());
                }
                String string = aum_0.cWf().a(66, (long)bJr2.gfS().d(), new Object[0]);
                String string2 = aum_0.cWf().c("notification.protectorAcquiredTitle", new Object[0]);
                String string3 = cfh_2.createLink(aum_0.cWf().c("notification.protectorAcquiredText", string), biu_1.kiz, "1");
                dcd dcd2 = new dcd(string2, string3, biu_1.kiz, 600132);
                aaw_1.bUq().h(dcd2);
                return false;
            }
            case 12906: {
                cuS cuS2 = (cuS)aam_22;
                this.a(cuS2);
                return false;
            }
            case 13951: {
                cuR cuR2 = (cuR)aam_22;
                this.a(cuR2);
                return false;
            }
            case 13422: {
                cuU cuU2 = (cuU)aam_22;
                this.a(cuU2);
                return false;
            }
            case 13793: {
                cuT cuT2 = (cuT)aam_22;
                this.a(cuT2);
                return false;
            }
            case 12521: {
                cuK cuK2 = (cuK)aam_22;
                int n = cuK2.ctu();
                bJr bJr3 = (bJr)bjx_0.klY.Ym(cuK2.ctn());
                if (bJr3 == null) {
                    lQT.error((Object)("Reponse pour la mise d'un protecteur inconnu de notre manager " + cuK2.ctn()));
                    return false;
                }
                this.a(bJr3, n);
                return false;
            }
            case 13935: {
                cuL cuL2 = (cuL)aam_22;
                ArrayList<byte[]> arrayList = cuL2.evV();
                for (byte[] byArray : arrayList) {
                    ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
                    int n = bJD.kmg.gr(byteBuffer);
                    bJr bJr4 = (bJr)bjx_0.klY.Ym(n);
                    if (bJr4 != null) {
                        byteBuffer.rewind();
                        bJD.kmg.a(byteBuffer, bJr4);
                        continue;
                    }
                    lQT.error((Object)("Le protecteur ID (" + n + ") n'existe pas. Pas de mise \u00e0 jour, et pas de cr\u00e9ation."));
                }
                bif_2.dYO().dZb();
                return false;
            }
            case 13600: {
                cuQ cuQ2 = (cuQ)aam_22;
                this.a(cuQ2);
                return false;
            }
        }
        return true;
    }

    private void a(cuQ cuQ2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bJr bJr2 = (bJr)bjx_0.klY.Ym(cuQ2.ctn());
        bJv bJv2 = bJr2.eaH();
        bTp bTp2 = bJv2.eaN();
        int n = cuQ2.cqy();
        if (cuQ2.eDu()) {
            switch (cuQ2.eDv()) {
                case sMI: {
                    bTo bTo2 = bTp2.D(n, true);
                    bJv2.XX(n);
                    bJr2.eav().c(fpf.sNA, bTo2.env());
                    bJI bJI2 = (bJI)bTj.eno().doD().eav();
                    bJI2.f(bJr2).dqL();
                    bTo2.enx();
                    break;
                }
                case sMJ: {
                    bTo bTo3 = bTp2.D(n, false);
                    bJv2.XY(n);
                    bJr2.eav().c(fpf.sNA, bTo3.env());
                    bJI bJI3 = (bJI)bTj.eno().doD().eav();
                    bJI3.f(bJr2).dqL();
                    bTo3.enx();
                    break;
                }
                case sMK: {
                    bTo bTo4 = bTp2.D(n, true);
                    bJv2.XZ(n);
                    bTo4.enx();
                    break;
                }
                case sML: {
                    bTo bTo5 = bTp2.D(n, false);
                    bJv2.Ya(n);
                    bTo5.enx();
                    break;
                }
                case sMM: {
                    bTo bTo6 = bTp2.D(n, true);
                    bJv2.a(bgt_02, n);
                    bJr2.eav().c(fpf.sNA, bTo6.enw());
                    boz_2 boz_22 = boc_2.eht().IE(n);
                    if (boz_22 != null) {
                        boz_22.il(true);
                    }
                    bTo6.eny();
                    bJI bJI4 = (bJI)bTj.eno().doD().eav();
                    bJI4.f(bJr2).dqL();
                    break;
                }
                case sMN: {
                    bTo bTo7 = bTp2.D(n, false);
                    bJv2.b(bgt_02, n);
                    bJr2.eav().c(fpf.sNA, bTo7.enw());
                    boz_2 boz_23 = bod_1.ehw().IF(n);
                    if (boz_23 != null) {
                        boz_23.il(true);
                    }
                    bTo7.eny();
                    bJI bJI5 = (bJI)bTj.eno().doD().eav();
                    bJI5.f(bJr2).dqL();
                    break;
                }
            }
        } else {
            lQT.warn((Object)("Le serveur a renvoy\u00e9 une erreur pour l'action " + cuQ2.eDv().name() + " pour le protecteur " + cuQ2.ctn() + " et la famille " + cuQ2.cqy()));
        }
        fiu_1.uCW.N("protectorEcosystemLock", true);
    }

    private void a(cuT cuT2) {
        int n = cuT2.ctn();
        byte by = cuT2.eDy();
        fpb fpb2 = fpb.hi(by);
        bJr bJr2 = (bJr)bjx_0.klY.Ym(n);
        bJr2.eaE().a(fpb2);
        bki_0 bki_02 = (bki_0)bjy_0.kmQ.ebc();
        bki_02.b(fpb2);
        bki_02.f(bJr2);
        fpm.sNJ.b(bki_02);
    }

    private void a(cuU cuU2) {
        int n = cuU2.ctn();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        boolean bl = bgt_02 != null && bgt_02.dnw() == bgt_02.dnx();
        bJr bJr2 = !bl ? (bJr)bjx_0.klY.Ym(n) : bTj.eno().enp();
        if (bJr2 == null) {
            lQT.error((Object)("R\u00e9ception de donn\u00e9es de taxe de protecteur pour un protecteur inconnu protectorId=" + n));
            return;
        }
        byte[] byArray = cuU2.eDz();
        bJD.kmg.a(ByteBuffer.wrap(byArray), bJr2);
        fse_1.gFu().a((aef_2)bTj.eno(), "tax");
    }

    private void a(cuR cuR2) {
        int n = cuR2.ctn();
        bJr bJr2 = (bJr)bjx_0.klY.Ym(n);
        if (bJr2 == null) {
            lQT.error((Object)("R\u00e9ception de donn\u00e9es de gestion de protecteur pour un protecteur inconnu protectorId=" + n));
            return;
        }
        byte[] byArray = cuR2.eDw();
        bJD.kmg.a(ByteBuffer.wrap(byArray), bJr2);
        byte[] byArray2 = cuR2.eDx();
        if (byArray2 != null && byArray2.length > 0) {
            boe_1 boe_12 = new boe_1();
            boe_12.fb(ByteBuffer.wrap(byArray2));
            boh_1.ehH().b(boe_12);
        }
        fse_1.gFu().a((aef_2)bTj.eno(), bTj.lmy);
    }

    private void a(bJr bJr2, int n) {
        fiq_2.gCw().d(fik_2.a(string -> this.b(bJr2, n)).l("protector.question.askMoneyToFight", n, bJr2.getName()).vG(ccp_2.mRE.byf()));
    }

    void b(bJr bJr2, int n) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        long l = bgt_02.dmi();
        if (l < (long)n) {
            aPd.e("protector.error.notEnoughMoneyToFight", new Object[0]);
            return;
        }
        bhx_0 bhx_02 = bJr2.cXa();
        if (bhx_02.djT()) {
            btd_1 btd_12 = btb_1.b(bJr2);
            btd_12.dHV();
            euf_0 euf_02 = btd_12.dHT();
            if (euf_02 == euf_0.rxi) {
                return;
            }
            bNG.egl();
            bNG.a(euf_02.bku(), new Object[0]);
        } else {
            bgt_02.aE(bhx_02);
        }
    }

    private void a(cuS cuS2) {
        int n = cuS2.ctn();
        bJr bJr2 = (bJr)bjx_0.klY.Ym(n);
        if (bJr2 != null) {
            bjx_0.klY.dM(bJr2.d(), cuS2.Xt());
        } else {
            lQT.error((Object)("R\u00e9ception d'un \u00e9v\u00e9nement pour un protecteur inconnu id=" + cuS2.ctn()));
        }
    }

    private void a(cuP cuP2) {
        bJr bJr2 = (bJr)bjx_0.klY.Ym(cuP2.ctn());
        if (bJr2 != null) {
            bjv_0 bjv_02 = (bjv_0)bjy_0.kmL.ebc();
            bjv_02.f(bJr2);
            bjv_02.e(null);
            fpm.sNJ.b(bjv_02);
        } else {
            lQT.error((Object)("R\u00e9ception d'un \u00e9v\u00e9nement pour un protecteur inconnu id=" + cuP2.ctn()));
        }
    }

    private void a(cuO cuO2) {
        bJr bJr2 = (bJr)bjx_0.klY.Ym(cuO2.ctn());
        if (bJr2 != null) {
            bju_0 bju_02 = (bju_0)bjy_0.kmM.ebc();
            bju_02.f(bJr2);
            bju_02.e(fjt.syH.WG(cuO2.Xt()));
            fpm.sNJ.b(bju_02);
            String string = aum_0.cWf().a(66, (long)bJr2.gfS().d(), new Object[0]);
            String string2 = aum_0.cWf().c("notification.protectorLostTitle", new Object[0]);
            String string3 = cfh_2.createLink(aum_0.cWf().c("notification.protectorLostText", string), biu_1.kiz, "1");
            dcd dcd2 = new dcd(string2, string3, biu_1.kiz, 600132);
            aaw_1.bUq().h(dcd2);
        } else {
            lQT.error((Object)("R\u00e9ception d'un \u00e9v\u00e9nement pour un protecteur inconnu id=" + cuO2.ctn()));
        }
    }

    private void a(cuN cuN2) {
        bJr bJr2 = (bJr)bjx_0.klY.Ym(cuN2.ctn());
        if (bJr2 != null) {
            bJO bJO2 = (bJO)bjy_0.kmK.ebc();
            bJO2.f(bJr2);
            bJO2.e(null);
            fpm.sNJ.b(bJO2);
        } else {
            lQT.error((Object)("R\u00e9ception d'un \u00e9v\u00e9nement pour un protecteur inconnu id=" + cuN2.ctn()));
        }
    }

    private void a(cuM cuM2) {
        bJr bJr2 = (bJr)bjx_0.klY.Ym(cuM2.ctn());
        if (bJr2 != null) {
            bJO bJO2 = (bJO)bjy_0.kmK.ebc();
            bJO2.f(bJr2);
            bJO2.e(null);
            fpm.sNJ.b(bJO2);
        } else {
            lQT.error((Object)("R\u00e9ception d'un \u00e9v\u00e9nement pour un protecteur inconnu id=" + cuM2.ctn()));
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

