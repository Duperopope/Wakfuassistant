/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

public class cdb
implements adi_1 {
    private static final Logger lQf = Logger.getLogger(cdb.class);
    public static final cdb lQg = new cdb();
    private bkv_1 lQh;

    private static void a(crz_0 crz_02) {
        faa_0 faa_02 = crz_02.eqJ();
        byte[] byArray = crz_02.eAc();
        byte[] byArray2 = crz_02.eAd();
        long[] lArray = crz_02.eAe();
        caf_2.lFq.a(faa_02);
        caf_2.lFq.dZ(byArray);
        caf_2.lFq.ea(byArray2);
        caf_2.lFq.a(faa_02.aqZ(), lArray);
    }

    private void a(crd_0 crd_02) {
        fby fby2;
        try {
            fby2 = fbz.rRR.sa(crd_02.Ya());
        }
        catch (fbt fbt2) {
            lQf.error((Object)"Exception raised", (Throwable)fbt2);
            return;
        }
        fby2.TU(crd_02.eAh());
    }

    private static void a(fbn fbn2) {
        String string = null;
        switch (fbn2) {
            case rQK: {
                if (aue_0.cVJ().c(czc_2.eYH())) {
                    string = "havenWorldErrorWait";
                    break;
                }
                string = "havenWorldMoneyNeeded";
                break;
            }
            case rQy: 
            case rQz: {
                string = "havenWorldErrorWait";
                break;
            }
            case rQX: 
            case rQO: 
            case rQW: 
            case rQY: 
            case rRd: 
            case rRe: 
            case rQQ: {
                lQf.error((Object)"L'action dans l'\u00e9diteur de havre monde a \u00e9chou\u00e9 !");
                string = "havenWorldErrorWait";
                aue_0.cVJ().b(czc_2.eYH());
                break;
            }
            case rRc: {
                lQf.error((Object)"L'action dans l'\u00e9diteur de havre monde a \u00e9chou\u00e9 !");
                string = "havenWorld.error.iePresent";
                break;
            }
            case rQL: 
            case rQJ: {
                lQf.error((Object)"L'action dans l'\u00e9diteur de havre monde a \u00e9chou\u00e9 ! hack?");
                string = "havenWorldErrorWait";
                aue_0.cVJ().b(czc_2.eYH());
                break;
            }
            case rRb: {
                lQf.error((Object)"L'action dans l'\u00e9diteur de havre monde a \u00e9chou\u00e9 !");
                string = "havenWorldErrorMovingBuilding";
                czc_2.eYH().eYK();
                break;
            }
            default: {
                lQf.error((Object)("Code d'erreur d'havre monde non g\u00e9r\u00e9 " + String.valueOf((Object)fbn2)));
            }
        }
        if (string != null) {
            fiq_2.gCw().d(fik_2.gBZ().l(string, new Object[0]).vG(ccp_2.mRM.byf()).abQ(1));
        }
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 13853: {
                crz_0 crz_02 = (crz_0)aam_22;
                cdb.a(crz_02);
                return false;
            }
            case 12578: {
                cro_0 cro_02 = (cro_0)aam_22;
                this.a(cro_02);
                return false;
            }
            case 12058: {
                crb_0 crb_02 = (crb_0)aam_22;
                this.a(crb_02);
                return false;
            }
            case 13355: {
                this.a((crf_0)aam_22);
                return false;
            }
            case 13161: {
                this.a((crc_0)aam_22);
                return false;
            }
            case 13769: {
                crh_0 crh_02 = (crh_0)aam_22;
                faz_0 faz_02 = crh_02.eAj();
                if (crh_02.eAk() != fbn.rQx) {
                    fiq_2.gCw().d(fik_2.gBZ().l("havenWorldForbidden", new Object[0]).vG(ccp_2.mRM.byf()).abQ(1));
                    return false;
                }
                if (this.lQh == null) {
                    return false;
                }
                this.lQh.dsA().c(faz_02);
                if (this.lQh.dsn()) {
                    this.lQh.bIH();
                } else {
                    this.lQh.k(false, true);
                }
                return false;
            }
            case 13768: {
                crm_0 crm_02 = (crm_0)aam_22;
                fbn fbn2 = crm_02.eAk();
                if (fbn2 == fbn.rQx) {
                    faZ faZ2 = crm_02.eAm();
                    if (aue_0.cVJ().c(czc_2.eYH())) {
                        czc_2.eYH().b(faZ2);
                    }
                } else {
                    if (aue_0.cVJ().c(czc_2.eYH())) {
                        faZ faZ3 = crm_02.eAm();
                        czc_2.eYH().a(faZ3, fbn2);
                    }
                    cdb.a(fbn2);
                    return false;
                }
                czc_2.eYH().eYP();
                return false;
            }
            case 13460: {
                crp_0 crp_02 = (crp_0)aam_22;
                if (this.lQh == null || this.lQh.dsA() == null) {
                    return false;
                }
                faz_0 faz_03 = this.lQh.dsA().eAj();
                if (faz_03.Ya() != crp_02.Ya()) {
                    return false;
                }
                fab_0 fab_02 = new fab_0(faz_03);
                fab_02.TR(crp_02.eAn());
                return false;
            }
            case 15608: {
                cyi cyi2 = (cyi)aam_22;
                long l = cyi2.efY();
                czc_2.eYH().oO(l);
                if (aue_0.cVJ().c(czc_2.eYH())) {
                    czc_2.eYH().eYK();
                }
                return false;
            }
            case 12197: {
                this.a((crd_0)aam_22);
                return false;
            }
            case 1149: {
                cyj cyj2 = (cyj)aam_22;
                List<faa_0> list = cyj2.eFs();
                cvo_1.eTI().az(list);
                cvo_1.eTI().Ne(cyj2.eFt());
                return false;
            }
            case 12033: {
                crg_0 crg_02 = (crg_0)aam_22;
                String string = aum_0.cWf().c("notification.havenWorld.closingText", crg_02.cax());
                cwy_2.nUc.y(string, 8);
            }
        }
        return true;
    }

    private void a(crc_0 crc_02) {
        cav_2 cav_22 = caf_2.lFq.eqP();
        cav_22.D(crc_02.ZC(), crc_02.azv());
    }

    private void a(crb_0 crb_02) {
        cav_2 cav_22 = caf_2.lFq.eqP();
        cav_22.a(crb_02.eAg());
    }

    private void a(crf_0 crf_02) {
        cav_2 cav_22 = caf_2.lFq.eqP();
        cav_22.mF(crf_02.ZC());
    }

    private void a(cro_0 cro_02) {
        short s = cro_02.eAo();
        short s2 = cro_02.eAp();
        short s3 = cro_02.eAq();
        short s4 = cro_02.eAr();
        short s5 = cro_02.eAs();
        short s6 = cro_02.eAt();
        cav_2 cav_22 = caf_2.lFq.eqP();
        cav_22.a(s, s2, s3, s4, s5, s6);
        if (this.lQh == null || this.lQh.dsA() == null) {
            return;
        }
        faz_0 faz_02 = this.lQh.dsA().eAj();
        fab_0 fab_02 = new fab_0(faz_02);
        if (faz_02.Y(s, s2) == null) {
            fab_02.Z(s, s2);
        }
        fab_02.c(s, s2, s3, s4, s5, s6);
        if (aue_0.cVJ().c(czc_2.eYH())) {
            czc_2.eYH().eYK();
        }
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }

    public void a(bkv_1 bkv_12) {
        this.lQh = bkv_12;
    }
}

