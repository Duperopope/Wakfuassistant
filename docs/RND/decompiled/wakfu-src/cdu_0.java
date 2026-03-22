/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from cdu
 */
public class cdu_0
implements adi_1 {
    protected static final Logger lQF = Logger.getLogger(cdu_0.class);
    private static final cdu_0 lQG = new cdu_0();

    @Override
    public boolean b(aam_2 aam_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        switch (aam_22.d()) {
            case 12264: {
                cud_0 cud_02 = (cud_0)aam_22;
                bgy bgy2 = bvz_0.ju(cud_02.eBj());
                if (bgy2 == null) {
                    return false;
                }
                if (cud_02.eCU() == 4 && cud_02.eBi() == 1 && bgy2.djT()) {
                    return true;
                }
                this.a(cud_02.eCU(), cud_02.aKU(), cud_02.eBj(), cud_02.eBi());
                return false;
            }
            case 13897: {
                cua_0 cua_02 = (cua_0)aam_22;
                if (cua_02.eBi() != 1 && cua_02.eCU() != 2) {
                    lQF.error((Object)"Erreur : on recoit un PLANT START MESSAGE pour une occupation ne d\u00e9butant pas / une occupation autre que PLANT");
                    return false;
                }
                int n = cua_02.clf();
                fqy_0 fqy_02 = fqz_0.giz().YY(n);
                if (cua_02.eBj() == bgt_02.Sn()) {
                    long l = cua_02.Tz();
                    int n2 = cua_02.cms();
                    bky_0 bky_02 = new bky_0(cua_02.ewI(), cua_02.ewJ());
                    bky_02.fY(l);
                    bky_02.Dy(n2);
                    bky_02.b(fqy_02);
                    if (bky_02.dsn()) {
                        bky_02.bIH();
                    }
                    return false;
                }
                bgy bgy3 = bgg_0.dlO().ju(cua_02.eBj());
                if (bgy3 == null) {
                    lQF.error((Object)"[PLANT OCCUPATION] Uknown Mobile");
                    return false;
                }
                bdj_2 bdj_22 = bgy3.ddI();
                if (bdj_22.bvF() != null) {
                    bdg_1 bdg_12 = new bdg_1(bgy3, n, cua_02.ewI(), cua_02.ewJ());
                    bgy3.a(bdg_12);
                    return false;
                }
                fqy_0 fqy_03 = fqz_0.giz().YY(n);
                if (fqy_03 != null) {
                    bKV bKV2 = bLe.ecw().dQ(cua_02.ewI(), cua_02.ewJ());
                    if (bKV2 != null) {
                        lQF.warn((Object)"On a recu un d\u00e9but de plantation sur une place non libre ! ");
                    }
                    blq_0.a(bdj_22, fqy_03);
                    return false;
                }
                return false;
            }
            case 12698: {
                cub_0 cub_02 = (cub_0)aam_22;
                if (cub_02.eBi() != 1 && cub_02.eCU() != 26) {
                    lQF.error((Object)"Erreur : on recoit un SEARCH TREASURE START MESSAGE pour une occupation ne d\u00e9butant pas / une occupation autre que SEARCH_TREASURE");
                    return false;
                }
                int n = cub_02.clf();
                fqy_0 fqy_04 = fqz_0.giz().YY(n);
                if (cub_02.eBj() == bgt_02.Sn()) {
                    long l = cub_02.Tz();
                    bkf_2 bkf_22 = new bkf_2(cub_02.getX(), cub_02.getY(), cub_02.bdi());
                    bkf_22.fY(l);
                    bkf_22.b(fqy_04);
                    if (bkf_22.dsn()) {
                        bkf_22.bIH();
                    }
                    return false;
                }
                bgy bgy4 = bgg_0.dlO().ju(cub_02.eBj());
                if (bgy4 == null) {
                    lQF.error((Object)"[SEARCH TREASURE OCCUPATION] Uknown Mobile");
                    return false;
                }
                bdj_2 bdj_23 = bgy4.ddI();
                if (bdj_23.bvF() != null) {
                    bdg_1 bdg_13 = new bdg_1(bgy4, n, cub_02.getX(), cub_02.getY());
                    bgy4.a(bdg_13);
                    return false;
                }
                fqy_0 fqy_05 = fqz_0.giz().YY(n);
                if (fqy_05 != null) {
                    bKV bKV3 = bLe.ecw().dQ(cub_02.getX(), cub_02.getY());
                    if (bKV3 != null) {
                        lQF.error((Object)"On a recu un d\u00e9but de recherche de tr\u00e9sor sur une place non libre ! ");
                    }
                    blq_0.a(bdj_23, fqy_05);
                    return false;
                }
                return false;
            }
            case 12862: {
                ctZ ctZ2 = (ctZ)aam_22;
                if (ctZ2.eCU() != 3) {
                    lQF.error((Object)"Message COLLECT START re\u00e7u avec de mauvais param\u00e8tres");
                    return false;
                }
                byte by = ctZ2.eCX();
                byte by2 = ctZ2.eCY();
                int n = ctZ2.getX();
                int n3 = ctZ2.getY();
                bKV bKV4 = bLe.ecw().dQ(n, n3);
                if (bKV4 == null) {
                    return false;
                }
                bmv_2 bmv_22 = bKV4.HS(ctZ2.avZ());
                if (bmv_22 == null) {
                    return false;
                }
                byte by3 = ctZ2.eCV();
                boolean bl = by3 == 1;
                long l = ctZ2.eBj();
                if (ctZ2.eBi() == 1) {
                    long l2 = ctZ2.eCW();
                    double d2 = ctZ2.eCZ();
                    int n4 = ctZ2.AK();
                    return this.a(bgt_02, by3, by, l, l2, d2, bl, by2, bmv_22, bKV4, n, n3, n4);
                }
                if (ctZ2.eBi() == 3) {
                    return this.a(bgt_02, l, by2, bmv_22, bKV4);
                }
                return false;
            }
            case 13458: {
                coo coo2 = (coo)aam_22;
                if (coo2.eCU() != 6) {
                    lQF.error((Object)"Message COLLECT MONSTER START re\u00e7u avec de mauvais param\u00e8tres");
                    return false;
                }
                bhx_0 bhx_02 = (bhx_0)bgg_0.dlO().ju(coo2.ewf());
                if (bhx_02 == null) {
                    lQF.error((Object)"Message COLLECT MONSTER START re\u00e7u avec une cible invalide");
                    return false;
                }
                bmv_2 bmv_23 = (bmv_2)bhx_02.doQ().OP(coo2.ewd());
                if (bmv_23 == null) {
                    lQF.error((Object)("skillAction inconnu id= " + coo2.ewd()));
                    return false;
                }
                if (coo2.eBj() == bgt_02.Sn()) {
                    eki_0 eki_02 = bgt_02.dpK();
                    if (bmv_23.cms() != 0 && !eki_02.tX(bmv_23.cms())) {
                        lQF.error((Object)("le joueur ne poss\u00e8de pas ce craft " + bmv_23.cms()));
                        return false;
                    }
                    bkh_1 bkh_12 = new bkh_1(bmv_23, bhx_02);
                    bkh_12.jV(coo2.ewe());
                    if (bkh_12.dsn()) {
                        bkh_12.bIH();
                    }
                } else {
                    bgy bgy5 = bgg_0.dlO().ju(coo2.eBj());
                    if (bgy5 == null) {
                        lQF.error((Object)"[COLLECT MODIF] Pas de character retrouv\u00e9");
                    } else {
                        bdj_2 bdj_24 = bgy5.ddI();
                        int n = bmv_23.clf();
                        if (bdj_24.bvF() != null) {
                            bdg_1 bdg_14 = new bdg_1(bgy5, n, bhx_02.aZw().getX(), bhx_02.aZw().getY());
                            bgy5.a(bdg_14);
                        } else {
                            fqy_0 fqy_06 = fqz_0.giz().YY(n);
                            if (fqy_06 != null) {
                                String string;
                                bgy5.l(bhx_02.ddI());
                                String[] stringArray = bdj_24.bkI().split("-");
                                String string2 = string = bhx_02 == null ? "" : blq_0.d(fqy_06);
                                if (!stringArray[0].equals(string)) {
                                    blq_0.a(bdj_24, fqy_06);
                                }
                            } else {
                                lQF.error((Object)("Action Description non trouv\u00e9e pour le monstre " + bhx_02.Sn() + " et le skill " + bmv_23.cms()));
                            }
                        }
                    }
                }
                return false;
            }
            case 13914: {
                cov cov2 = (cov)aam_22;
                if (cov2.eCU() != 13 && cov2.eCU() != 28) {
                    lQF.error((Object)"Message DISTRIBUTION re\u00e7u avec de mauvais param\u00e8tres");
                    return false;
                }
                bba_2 bba_22 = (bba_2)((Object)bzj_2.eqi().my(cov2.ebU()));
                if (bba_22 == null) {
                    lQF.error((Object)"Message START_COLLECT_ON_INTERACTIVE_ELEMENT re\u00e7u avec une cible invalide");
                    return false;
                }
                bgy bgy6 = bgg_0.dlO().ju(cov2.eBj());
                if (bgy6 == null) {
                    lQF.error((Object)"Message START_COLLECT_ON_INTERACTIVE_ELEMENT re\u00e7u avec un character player invalide");
                    return false;
                }
                bks_2 bks_22 = new bks_2(bba_22, cov2.eCU());
                bks_22.jV(cov2.ewe());
                if (bks_22.dsn()) {
                    bks_22.bIH();
                }
                return false;
            }
            case 12843: {
                cou cou2 = (cou)aam_22;
                bbo_1 bbo_12 = (bbo_1)bzj_2.eqi().my(cou2.ewl());
                if (bbo_12 == null) {
                    lQF.error((Object)"Message SIT_OCCUPATION_START_MESSAGE re\u00e7u avec un stool invalide");
                    return false;
                }
                bgy bgy7 = bgg_0.dlO().ju(cou2.fD());
                if (bgy7 == null) {
                    lQF.error((Object)"Message SIT_OCCUPATION_START_MESSAGE re\u00e7u avec un character player invalide");
                    return false;
                }
                bkg_2 bkg_22 = new bkg_2(bgy7, bbo_12);
                if (bkg_22.dsn()) {
                    bkg_22.bIH();
                    if (bgy7 == bgt_02) {
                        aue_0.cVJ().a(cyi_2.eXN());
                    }
                }
                return false;
            }
        }
        return true;
    }

    void a(bmv_2 bmv_22, bgy bgy2, bKV bKV2, bdj_2 bdj_22, byte by) {
        fqy_0 fqy_02 = fqz_0.giz().YY(bmv_22.clf());
        if (fqy_02 == null) {
            lQF.error((Object)("Action Description non trouv\u00e9e pour ressource " + bKV2.Sn() + " et  la skill " + by));
            return;
        }
        bgy2.l(bKV2);
        String[] stringArray = bdj_22.bkI().split("-");
        String string = blq_0.d(fqy_02);
        if (!stringArray[0].equals(string)) {
            blq_0.a(bdj_22, fqy_02);
        }
    }

    public void a(short s, byte[] byArray, long l, short s2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        switch (s) {
            case 20: {
                bgy bgy2 = bgg_0.dlO().ju(l);
                if (bgy2 == null) {
                    lQF.error((Object)("[EMOTE] Personnage inexistant : " + l));
                    return;
                }
                if (s2 == 1) {
                    bko_1 bko_12 = new bko_1(bgy2);
                    bko_12.dX(byArray);
                    if (bko_12.dsn()) {
                        bko_12.bIH();
                    }
                } else if (s2 == 2) {
                    if (bgy2.dpX() != null && bgy2.dpX().dsm() == 20) {
                        bgy2.dnY();
                    } else {
                        lQF.warn((Object)("[EMOTE] Demande d'arr\u00eat d'occupation alors que le personnage est en " + String.valueOf(bgy2.dpX())));
                    }
                }
                return;
            }
            case 1: {
                bgy bgy3 = bgg_0.dlO().ju(l);
                if (bgy3 != null) {
                    if (s2 == 1) {
                        bkd_1 bkd_12 = new bkd_1(bgy3);
                        if (bkd_12.dsn()) {
                            bkd_12.bIH();
                        }
                    } else if (s2 == 2) {
                        if (bgy3.dpX() != null && bgy3.dpX().dsm() == 1) {
                            bgy3.dnY();
                        } else {
                            lQF.error((Object)("[REST_OCCUPATION] Demande d'annulation alors que le personnage est en " + String.valueOf(bgy3.dpX())));
                        }
                    }
                } else {
                    lQF.error((Object)("[REST_OCCUPATION] Personnage inexistant : " + l));
                }
                return;
            }
            case 3: {
                lQF.fatal((Object)"We are not supposed to pass here");
                break;
            }
            case 6: {
                if (s2 != 3) break;
                if (l == bgt_02.Sn()) {
                    if (bgt_02.dps() != null) {
                        if (bgt_02.dps().dsm() != 6) break;
                        bgt_02.i(true, false);
                        return;
                    }
                    lQF.info((Object)"[COLLECT CANCELLATION] No occupation or occupation already ended");
                    return;
                }
                bgy bgy4 = bgg_0.dlO().ju(l);
                if (bgy4 == null) {
                    lQF.error((Object)("[COLLECT CANCELLATION] Character not found " + l));
                    return;
                }
                bdj_2 bdj_22 = bgy4.ddI();
                if (bdj_22.dcM() == null) break;
                bdj_22.dcM().ebM();
                return;
            }
            case 4: {
                bgt_0 bgt_03;
                bhJ bhJ2 = bgt_03 = l == bgt_02.Sn() ? bgt_02 : (bhJ)bvz_0.ju(l);
                if (bgt_03 == null) {
                    lQF.info((Object)"Demande de d\u00e9but ou de fin d'occupation (death) pour un joueur non connu");
                    return;
                }
                switch (s2) {
                    case 1: {
                        bkk_2 bkk_22 = new bkk_2(bgt_03);
                        bkk_22.dX(byArray);
                        if (bkk_22.dsn()) {
                            bkk_22.bIH();
                        }
                        return;
                    }
                    case 2: {
                        bkb_0 bkb_02 = bgt_03.dps();
                        if (!(bkb_02 instanceof bkk_2)) {
                            return;
                        }
                        ((bhJ)bgt_03).dnY();
                        return;
                    }
                }
                return;
            }
            case 7: {
                if (l == bgt_02.Sn() && s2 == 3) {
                    lQF.info((Object)"Recu demande d'annulation du managing du local player");
                    bkb_0 bkb_03 = bgt_02.dps();
                    if (bkb_03 != null && bkb_03 instanceof bku_1) {
                        bgt_02.i(true, false);
                    }
                }
                return;
            }
            case 16: {
                bgy bgy5 = bgg_0.dlO().ju(l);
                if (bgy5 != null) {
                    if (s2 == 3) {
                        bgy5.i(true, false);
                    } else if (s2 == 2) {
                        bgy5.dnY();
                    }
                } else {
                    lQF.error((Object)("[REST_OCCUPATION] Personnage inexistant : " + l));
                }
                return;
            }
            case 25: {
                if (s2 == 1) {
                    // empty if block
                }
                if (s2 == 3) {
                    lQF.info((Object)"Received a cancel occupation for ManageHavenWorldOccupation");
                    bkb_0 bkb_04 = bgt_02.dps();
                    if (bkb_04 instanceof bkv_1) {
                        bgt_02.i(true, false);
                    }
                }
                return;
            }
            case 30: {
                bkb_0 bkb_05;
                if (bgt_02.Sn() != l) {
                    return;
                }
                if (s2 == 1) {
                    bkb_05 = new bkp_1();
                    if (!bkb_05.dsn()) {
                        return;
                    }
                    bkb_05.bIH();
                    bgt_02.a(bkb_05);
                }
                if (s2 == 3 || s2 == 2) {
                    lQF.info((Object)"Received a cancel occupation for EnchantmentMachine");
                    bkb_05 = bgt_02.dps();
                    if (bkb_05 instanceof bkp_1) {
                        bgt_02.i(true, false);
                    }
                }
                return;
            }
            case 32: {
                if (s2 == 3 || s2 == 2) {
                    lQF.info((Object)"Received a cancel occupation for haven world resources collector");
                    bkb_0 bkb_06 = bgt_02.dps();
                    if (bkb_06 instanceof bkr_2) {
                        bgt_02.i(true, false);
                    }
                }
                return;
            }
            default: {
                bgy bgy6 = bgg_0.dlO().ju(l);
                if (bgy6 != null) {
                    if (s2 == 3) {
                        bgy6.i(true, false);
                        break;
                    }
                    if (s2 != 2) break;
                    bgy6.dnY();
                    break;
                }
                lQF.error((Object)("[OCCUPATION] Personnage inexistant : " + l));
            }
        }
        if (s2 == 3) {
            if (l != bgt_02.Sn()) {
                lQF.error((Object)"Message d'annulation re\u00e7u pour un autre client que le localplayer");
                return;
            }
            if (bgt_02.dps() == null) {
                lQF.info((Object)"Occupation d\u00e9ja termin\u00e9e");
                return;
            }
            if (bgt_02.dps().dsm() == s) {
                bgt_02.i(true, false);
            } else {
                lQF.error((Object)"Message d'annulation recu pour une occupation diff\u00e9rente de celle en cours");
            }
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public static cdu_0 euc() {
        return lQG;
    }

    private static void a(bKV bKV2, int n, int n2) {
        int n3 = bKV2.bcC();
        int n4 = bKV2.bcD();
        agZ.bzy().bH(n3, n4);
        int n5 = n - n2;
        if (n5 != n && n5 > 0) {
            int n6 = cdu_0.KO(n5);
            FreeParticleSystem freeParticleSystem = agY.bzw().sk(n6);
            if (freeParticleSystem != null) {
                freeParticleSystem.setVisible(true);
                freeParticleSystem.r(n3, n4, bKV2.bcE() + 10);
                agZ.bzy().b(freeParticleSystem);
            }
        }
    }

    private boolean a(bgt_0 bgt_02, byte by, byte by2, long l, long l2, double d2, boolean bl, byte by3, bmv_2 bmv_22, bKV bKV2, int n, int n2, int n3) {
        if (by == 7) {
            return false;
        }
        if (by == 4) {
            aPd.e("collect.error.resourceOccupied", new Object[0]);
            return false;
        }
        Optional<eki_0> optional = bgt_02.dpJ();
        if (optional.isEmpty()) {
            lQF.error((Object)String.format("[OCCUPATION] Unable to fetch craftHandler of following user %s during start of collectOccupation", l));
            return false;
        }
        if (!optional.get().tX(by2)) {
            lQF.error((Object)("Character hasn't required skill " + by2));
            return false;
        }
        if (by == 5) {
            lQF.error((Object)"We got collect success for starting collect");
            return false;
        }
        if (l == bgt_02.Sn()) {
            bki_1 bki_12 = new bki_1(bmv_22, bKV2);
            bki_12.jV(l2);
            bki_12.br(by3);
            bki_12.go(bl);
            if (bki_12.dsn()) {
                bki_12.U(d2);
            }
            agZ.bzy().bH(n, n2);
        } else {
            Object object;
            bgy bgy2 = bgg_0.dlO().ju(l);
            if (bgy2 == null) {
                lQF.error((Object)("No character found for id " + l));
                return false;
            }
            bdj_2 bdj_22 = bgy2.ddI();
            if (bKV2 == bgt_02.dla() && bgt_02.dps().dsm() == 3) {
                object = (bki_1)bgt_02.dps();
                ((bka_1)object).jV(l2);
                ((bki_1)object).br(by3);
                ((bki_1)object).go(bl);
                if (((bki_1)object).dsn()) {
                    ((bki_1)object).V(d2);
                }
            } else {
                cdu_0.a(bKV2, bmv_22.fyP(), by3);
            }
            object = (bgv_2)fgD.fXh().Vd(n3);
            if (bdj_22.bvF() != null) {
                bdj_22.b(new cdv(this, (bgv_2)object, bdj_22, bmv_22, bgy2, bKV2, by2));
            } else {
                if (object != null) {
                    bdj_22.a((fhc_0)object, (short)ffS.sgS.shb);
                }
                this.a(bmv_22, bgy2, bKV2, bdj_22, by2);
            }
        }
        return false;
    }

    private boolean a(bgt_0 bgt_02, long l, byte by, bmv_2 bmv_22, bKV bKV2) {
        if (l == bgt_02.Sn()) {
            if (!(bgt_02.dps() instanceof bki_1)) {
                return false;
            }
            bgt_02.i(true, false);
            cdu_0.a(bKV2, bmv_22.fyP(), by);
        } else {
            Object object;
            bgy bgy2 = bgg_0.dlO().ju(l);
            if (bgy2 == null) {
                lQF.error((Object)("No character found for id " + l));
                return false;
            }
            if (bKV2 == bgt_02.dla() && bgt_02.dps() instanceof bki_1) {
                object = (bki_1)bgt_02.dps();
                ((bki_1)object).br(by);
                bgt_02.dcM().HP(by);
            } else {
                cdu_0.a(bKV2, bmv_22.fyP(), by);
            }
            object = bgy2.ddI();
            bKI bKI2 = ((bdf_1)object).dcM();
            if (bKI2 != null) {
                bKI2.ebM();
            }
        }
        return false;
    }

    private static int KO(int n) {
        switch (n) {
            case 1: {
                return 800792;
            }
            case 2: {
                return 800793;
            }
            case 3: {
                return 800794;
            }
            case 4: {
                return 800795;
            }
            case 5: {
                return 800796;
            }
        }
        return 0;
    }
}

