/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.Comparator;
import org.apache.log4j.Logger;

/*
 * Renamed from ccL
 */
public class ccl_1
implements adi_1 {
    private static final boolean lPG = false;
    public static final Comparator<bna_1> lPH = Comparator.comparing(bna_1::bjc);
    protected static final Logger lPI = Logger.getLogger(ccl_1.class);
    private static final ccl_1 lPJ = new ccl_1();

    public static ccl_1 etS() {
        return lPJ;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 12748: {
                lPI.info((Object)"[PERSONAL_SPACE_UPDATE_MESSAGE] : Mise \u00e0 jour du sac dimensionnel du propri\u00e9taire");
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                bnv_2 bnv_22 = bgt_02.dnw();
                if (bnv_22 != null) {
                    bnv_22.a(((cun_0)aam_22).eDc());
                }
                return false;
            }
            case 12504: {
                cuz cuz2 = (cuz)aam_22;
                bgt_0 bgt_03 = aue_0.cVJ().cVK();
                bgt_0 bgt_04 = (bgt_0)fcI.ac(bgt_03.Xi(), cuz2.eDj());
                if (bgt_04 == null) {
                    lPI.error((Object)("Unable to find gem owner for item " + cuz2.eDj()));
                    return false;
                }
                bdl_0 bdl_02 = bgt_04.dno();
                ffs_0 ffs_02 = bdl_02.ta(cuz2.eDj());
                if (ffs_02 != null) {
                    ffV ffV2 = ffs_02.sV(cuz2.eDj());
                    bnv_2 bnv_23 = bgt_03.dnx();
                    fnA fnA2 = bnv_23.g(cuz2.eDk(), true) != null ? bnv_23.a(cuz2.eDk(), ffV2, ffs_02.Lx(), true) : bnv_23.b(cuz2.eDk(), ffV2, ffs_02.Lx(), true);
                    if (fnA2 == fnA.sJF) {
                        bnv_23.bv(cuz2.eDk());
                    } else {
                        lPI.error((Object)"DIMENSIONAL_BAG_INVENTORY_TO_ROOM_GEM_EXCHANGE failed!");
                    }
                } else {
                    lPI.error((Object)("Gemme introuvable dans l'inventaire du client : " + cuz2.eDj()));
                }
                return false;
            }
            case 12189: {
                cuA cuA2 = (cuA)aam_22;
                bgt_0 bgt_05 = aue_0.cVJ().cVK();
                bnv_2 bnv_24 = bgt_05.dnx();
                fnA fnA3 = bnv_24.a(cuA2.eDl(), cuA2.eDn(), cuA2.eDo(), cuA2.eDm(), true);
                if (fnA3 != fnA.sJF) {
                    lPI.error((Object)"DIMENSIONAL_BAG_ROOM_TO_INVENTORY_GEM_EXCHANGE failed!");
                } else {
                    bnv_24.bv(cuA2.eDl());
                }
                return false;
            }
            case 13494: {
                cuB cuB2 = (cuB)aam_22;
                bgt_0 bgt_06 = aue_0.cVJ().cVK();
                bnv_2 bnv_25 = bgt_06.dnx();
                fnA fnA4 = bnv_25.a(cuB2.eDr(), cuB2.eDp(), cuB2.eDs(), cuB2.eDq(), true);
                if (fnA4 != fnA.sJF) {
                    lPI.error((Object)"DIMENSIONAL_BAG_ROOMS_GEMS_EXCHANGE_RESULT failed!");
                } else {
                    bnv_25.bv(cuB2.eDr());
                    bnv_25.bv(cuB2.eDs());
                }
                return false;
            }
            case 13594: {
                fse_1.gFu().f("showRoomBagDetails", false);
                aue_0.cVJ().b(cwe_1.eVh());
                if (fyw_0.gqw().to("splitStackDialog")) {
                    fyw_0.gqw().tl("splitStackDialog");
                }
                return false;
            }
            case 12084: {
                cux cux2 = (cux)aam_22;
                long l = cux2.eBZ();
                byte[] byArray = cux2.eDh();
                bgt_0 bgt_07 = aue_0.cVJ().cVK();
                bnv_2 bnv_26 = bgt_07.dnw();
                if (bnv_26 != null && bnv_26.Xi() == l) {
                    tw_1 tw_12 = new tw_1();
                    tw_12.aG(ByteBuffer.wrap(byArray));
                    bnv_26.a(tw_12);
                    if (aue_0.cVJ().c(ctg_1.eQG())) {
                        aue_0.cVJ().b(ctg_1.eQG());
                    }
                }
                return false;
            }
            case 12261: {
                cuv cuv2 = (cuv)aam_22;
                long l = cuv2.eBZ();
                dn_2 dn_22 = cuv2.eDg();
                bgt_0 bgt_08 = aue_0.cVJ().cVK();
                bnv_2 bnv_27 = bgt_08.dnw();
                if (bnv_27 != null && bnv_27.Xi() == l) {
                    bhJ bhJ2 = bnv_27.dyS();
                    eki_0 eki_02 = bhJ2.dpK();
                    eki_02.i(dn_22);
                }
                if (aue_0.cVJ().c(ctg_1.eQG())) {
                    ctg_1.eQO();
                    ctg_1.eQG().dxf();
                    fiq_2.gCw().d(fik_2.gBZ().l("craft.secured.fee.changed", new Object[0]).vG(ccp_2.mRL.byf()).abQ(1));
                    aPd.f("craft.secured.fee.changed", new Object[0]);
                }
                return false;
            }
            case 13807: {
                cpo_0 cpo_02 = (cpo_0)aam_22;
                long l = cpo_02.xl();
                bgt_0 bgt_09 = aue_0.cVJ().cVK();
                if (bgt_09.Xi() == l) {
                    return false;
                }
                bnv_2 bnv_28 = bgt_09.dnw();
                if (bnv_28 == null) {
                    return false;
                }
                eky_0 eky_02 = new eky_0();
                eky_02.f(cpo_02.exG());
                baj_2.hzf.a(l, eky_02);
                return false;
            }
            case 12011: {
                Object object;
                cpm_0 cpm_02 = (cpm_0)aam_22;
                if (BH.aU(cpm_02.exE())) {
                    lPI.error((Object)"A craft notification has been received but the player name is missing.");
                    return false;
                }
                eKR eKR2 = cpm_02.dxR();
                String string = aum_0.cWf().a(15, (long)eKR2.fyZ().azv(), new Object[0]);
                if (cpm_02.aGv()) {
                    object = baj_2.hzf.cZr();
                    object.t(eKR2.cms(), cpm_02.bfd());
                }
                object = cpm_02.aGv() ? aum_0.cWf().c("craft.secured.notification.success", string, cpm_02.exE(), cpm_02.bfd()) : aum_0.cWf().c("craft.secured.notification.failure", string, cpm_02.exE());
                aPh.czg().iZ((String)object);
                return false;
            }
            case 12697: {
                cuk_0 cuk_02 = (cuk_0)aam_22;
                if (cuk_02.evk() == 0) {
                    // empty if block
                }
                return false;
            }
            case 12671: {
                cuF cuF2 = (cuF)aam_22;
                return false;
            }
            case 13281: {
                cus_0 cus_02 = (cus_0)aam_22;
                return false;
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        bgt_0 bgt_02;
        if (!bl && (bgt_02 = aue_0.cVJ().cVK()) != null) {
            bgt_02.a((bnv_2)null);
        }
    }
}

