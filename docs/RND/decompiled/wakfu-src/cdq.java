/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.procedure.TObjectProcedure;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cdq
implements adi_1 {
    protected static final Logger lQz = Logger.getLogger(cdq.class);
    public static final adi_1 lQA = new cdq();
    private static final TObjectProcedure<bgy> lQB = new cdr();

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        fse_1.gFu().f("nations", bss_2.lgz);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        TIntObjectIterator<fjo_0> tIntObjectIterator = fjt.syH.b(new Integer[0]);
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            tIntObjectIterator.remove();
        }
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 14865: {
                ctg_0 ctg_02 = (ctg_0)aam_22;
                Object object = ctg_02.eCu();
                while (object.hasNext()) {
                    fnf_0 fnf_02;
                    object.advance();
                    int n2 = object.key();
                    byte[] byArray = (byte[])object.value();
                    boolean bl = false;
                    fjo_0 fjo_02 = fjt.syH.WG(n2);
                    if (fjo_02 == null) {
                        lQz.info((Object)("[NATION] Reception d'un message de synchro de nation demandant l'ajout d'une nouvelle nation : " + n2));
                        fjo_02 = fjo_0.WD(n2);
                        fjt.syH.n(fjo_02);
                        bl = true;
                    }
                    fjo_02.j(byArray, exH.pdw);
                    if (cdq.ef(byArray) && (fnf_02 = fjo_02.gbC()) != null) {
                        TIntObjectIterator<fnd_0> tIntObjectIterator = fnf_02.bgC();
                        while (tIntObjectIterator.hasNext()) {
                            tIntObjectIterator.advance();
                            fnd_0 fnd_02 = (fnd_0)tIntObjectIterator.value();
                            bjx_0.klY.dM(fnd_02.d(), fnd_02.Xt());
                        }
                    }
                    if (!bl) continue;
                    fjo_02.gbf();
                }
                brx_1.elI().dhh();
                object = aue_0.cVJ().cVK();
                if (object != null) {
                    if (!fjo_0.a(fjo_0.sys, ((exP)object).ffF().ems())) {
                        bri_2 bri_22 = (bri_2)((exP)object).ffF();
                        bri_22.elh();
                    }
                    ((bgy)object).djo();
                }
                return false;
            }
            case 14282: {
                Object object;
                Object object2;
                Object object3;
                ctw_0 ctw_02 = (ctw_0)aam_22;
                lQz.info((Object)("[NATION] Un vote a commenc\u00e9 pour ma nation, d'une dur\u00e9e de " + String.valueOf(ctw_02.eCS())));
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                if (bgt_02 == null) {
                    return false;
                }
                if (brx_1.elI().emx()) {
                    object3 = aum_0.cWf().c("notification.preventiveElectionTitle", new Object[0]);
                    object2 = cfh_2.createLink(aum_0.cWf().c("notification.preventiveElectionText", new Object[0]), biu_1.kiz, "0");
                    object = new dcd((String)object3, (String)object2, biu_1.kiz, 600132);
                    aaw_1.bUq().h((aam_2)object);
                } else {
                    object3 = aum_0.cWf().c("notification.newElectionTitle", new Object[0]);
                    object2 = cfh_2.createLink(aum_0.cWf().c("notification.newElectionText", new Object[0]), biu_1.kiz, "0");
                    object = new dcd((String)object3, (String)object2, biu_1.kiz, 600132);
                    aaw_1.bUq().h((aam_2)object);
                }
                object3 = bgt_02.ffF();
                object2 = object3.ems();
                ((fjo_0)object2).b(ctw_02.eCT(), ctw_02.eCS(), true);
                object = bgt_02.dnG() >= 1 ? aum_0.cWf().c("nation.vote.start.can.be.candidate", 3000) : (bgt_02.dnG() >= 1 ? aum_0.cWf().c("nation.vote.start.can.vote", (short)1) : aum_0.cWf().c("nation.vote.start.cant.do.anything", (short)1));
                aPh.czg().jb((String)object);
                if (fyw_0.gqw().to("nationDialog")) {
                    brx_1.elI().emb();
                }
                if (aue_0.cVJ().c(cyk_2.eYu())) {
                    aue_0.cVJ().b(cyk_2.eYu());
                }
                return false;
            }
            case 15345: {
                String string2;
                String string3;
                ctt_0 ctt_02 = (ctt_0)aam_22;
                bgt_0 bgt_03 = aue_0.cVJ().cVK();
                if (bgt_03 == null) {
                    return false;
                }
                bri_2 bri_23 = (bri_2)bgt_03.ffF();
                fjo_0 fjo_03 = bri_23.ems();
                bri_23.iu(false);
                bgg_0.dlO().m(lQB);
                String string4 = ctt_02.eCP();
                boolean bl = bgt_03.getName().equals(string4);
                String string5 = ctt_02.eCO();
                boolean bl2 = string5 != null;
                boolean bl3 = ctt_02.eCN();
                boolean bl4 = bl2 && bgt_03.getName().equals(string5);
                boolean bl5 = bri_23.els();
                fjo_03.gbo().gcr();
                fjo_03.b(ctt_02.eCL(), ctt_02.eCM(), false);
                fjo_03.gbw();
                bri_23.elh();
                lQz.info((Object)("[NATION] Un vote commenc\u00e9 le " + String.valueOf(ctt_02.eCK()) + "vient de se terminer pour ma nation. Gouverneur : " + string5 + " Gouverneur \u00e9lu d\u00e9mocratiquement : " + bl3));
                if (bl2) {
                    if (bl4) {
                        string3 = bl ? (bl3 ? aum_0.cWf().c("nation.vote.end.result.reelected", new Object[0]) : aum_0.cWf().c("nation.vote.end.result.reelectedByDefault", new Object[0])) : aum_0.cWf().c("nation.vote.end.result.elected", new Object[0]);
                        string2 = aum_0.cWf().c("notification.governorEndElectionText", new Object[0]);
                    } else {
                        string3 = bl ? (bl5 ? aum_0.cWf().c("nation.vote.end.result.reelectionLost", string5) : aum_0.cWf().c("nation.vote.end.result.noMoreGovernor", string5)) : (bl5 ? aum_0.cWf().c("nation.vote.end.result.electionLost", string5) : (bl3 ? aum_0.cWf().c("nation.vote.end.result.someoneElected", string5) : aum_0.cWf().c("nation.vote.end.result.someoneReelected", string5)));
                        string2 = aum_0.cWf().c("notification.endElectionText", string5);
                    }
                } else {
                    string3 = aum_0.cWf().c("nation.vote.end.result.noGovernor", new Object[0]);
                    string2 = aum_0.cWf().c("notification.noGovernorEndElectionText", new Object[0]);
                }
                String string6 = aum_0.cWf().c("notification.endElectionTitle", new Object[0]);
                String string7 = cfh_2.createLink(string2, biu_1.kiz, "0");
                dcd dcd2 = new dcd(string6, string7, biu_1.kiz);
                aaw_1.bUq().h(dcd2);
                cAY.eHc().b(600133L, 0.0f, 500, 2000, 6400);
                String string8 = aum_0.cWf().c("nation.vote.end", new Object[0]) + "\n" + string3;
                aPh.czg().jb(string8);
                if (fyw_0.gqw().to("nationDialog")) {
                    cxj_0 cxj_02 = new cxj_0();
                    aue_0.cVJ().etu().d(cxj_02);
                }
                if (aue_0.cVJ().c(cyk_2.eYu())) {
                    aue_0.cVJ().b(cyk_2.eYu());
                }
                return false;
            }
            case 14720: {
                ctx_0 ctx_02 = (ctx_0)aam_22;
                int n3 = ctx_02.Xt();
                int n4 = ctx_02.ctn();
                bjx_0.klY.dM(n4, n3);
                lQz.info((Object)("protector " + n4 + " changed to nation " + n3));
                return false;
            }
            case 14489: {
                String string9;
                String string10;
                ctu_0 ctu_02 = (ctu_0)aam_22;
                String string11 = ctu_02.eCI();
                switch (ctu_02.eCQ()) {
                    case oXU: {
                        string10 = aum_0.cWf().c("nation.vote.end.resultDelayed.voteLost", string11);
                        string9 = aum_0.cWf().c("notification.endElectionText", string11);
                        break;
                    }
                    case oXV: {
                        string10 = aum_0.cWf().c("nation.vote.end.resultDelayed.voteLostStatusLost", string11);
                        string9 = aum_0.cWf().c("notification.endElectionText", string11);
                        break;
                    }
                    case oXW: {
                        string10 = aum_0.cWf().c("nation.vote.end.resultDelayed.voteMissed", string11);
                        string9 = aum_0.cWf().c("notification.endElectionText", string11);
                        break;
                    }
                    case oXT: {
                        string10 = aum_0.cWf().c("nation.vote.end.resultDelayed.voteWon", string11);
                        string9 = aum_0.cWf().c("notification.governorEndElectionText", new Object[0]);
                        break;
                    }
                    default: {
                        return false;
                    }
                }
                aPh.czg().jb(string10);
                String string12 = aum_0.cWf().c("notification.endElectionTitle", new Object[0]);
                String string13 = cfh_2.createLink(string9, biu_1.kiz, "0");
                dcd dcd3 = new dcd(string12, string13, biu_1.kiz, 600132);
                aaw_1.bUq().h(dcd3);
                return false;
            }
            case 13385: {
                ctk_0 ctk_02 = (ctk_0)aam_22;
                boolean bl = ctk_02.aGv();
                String string14 = !bl ? aum_0.cWf().c("nation.vote.candidateRegistration.error", new Object[0]) : aum_0.cWf().c("nation.vote.candidateRegistration.success", new Object[0]);
                aPh.czg().iZ(string14);
                return false;
            }
            case 12431: {
                ctf_0 ctf_02 = (ctf_0)aam_22;
                fkw fkw2 = ctf_02.eCs();
                fjo_0 fjo_04 = aue_0.cVJ().cVK().ffF().ems();
                fjo_04.a(fkw2);
                fjo_04.dV(ctf_02.ekU(), ctf_02.eCt());
                return false;
            }
            case 14147: {
                ctv_0 ctv_02 = (ctv_0)aam_22;
                ArrayList<fkw> arrayList = ctv_02.eCR();
                fjo_0 fjo_05 = aue_0.cVJ().cVK().ffF().ems();
                if (fjo_05.gbx()) {
                    fjo_05.P(arrayList);
                    fjo_05.dV(ctv_02.ekU(), ctv_02.eCt());
                } else {
                    ((brw_2)fjo_05.gbA()).b(arrayList, ctv_02.ekU(), ctv_02.eCt());
                }
                brx_1.elI().dhh();
                return false;
            }
            case 14526: {
                ctj_0 ctj_02 = (ctj_0)aam_22;
                if (ctj_02.aGv()) {
                    long l = aue_0.cVJ().cVK().Sn();
                    if (ctj_02.eCv() == l) {
                        aPd.f("nation.desist.result.sender", ctj_02.eCy(), ctj_02.eCz());
                    } else if (ctj_02.eCx() == l) {
                        aPd.f("nation.desist.result.receiver", ctj_02.eCw(), ctj_02.eCz(), ctj_02.eCA());
                    } else {
                        lQz.error((Object)("[NATION] On re\u00e7oit un r\u00e9sultat de d\u00e9sistement de " + ctj_02.eCv() + " pour " + ctj_02.eCx() + " alors qu'on est d'id " + l + ". Message pas arriv\u00e9 au bon destinataire ???"));
                    }
                } else {
                    lQz.error((Object)"[NATION] R\u00e9sultat de la demande de d\u00e9sistement : erreur");
                }
                return false;
            }
            case 13049: {
                ctn_0 ctn_02 = (ctn_0)aam_22;
                fkL fkL2 = ctn_02.emF();
                String string15 = aum_0.cWf().a(57, (long)((int)fkL2.Sn()), new Object[0]);
                fiq_2.gCw().d(fik_2.gBY().l("nation.governmentNominationQuestion", string15).abQ(1).vG(ccp_2.mRE.byf()).a((n, string) -> {
                    bgt_0 bgt_02 = aue_0.cVJ().cVK();
                    fjo_0 fjo_02 = bgt_02.ffF().ems();
                    byte by = n == 400 ? (byte)1 : (byte)2;
                    fjo_02.a(bgt_02.Sn(), by, fkL2.Sn());
                }));
                return false;
            }
            case 15121: {
                cto_0 cto_02 = (cto_0)aam_22;
                String string16 = cto_02.xO();
                fkL fkL3 = cto_02.emF();
                int n5 = cto_02.eCD();
                String string17 = aum_0.cWf().a(57, (long)((int)fkL3.Sn()), new Object[0]);
                if (n5 == 0) {
                    String string18 = aum_0.cWf().c("nation.governmentNominationChatMessage", string16, string17);
                    aPh.czg().jb(string18);
                    String string19 = aum_0.cWf().c("notification.governmentNominationTitle", new Object[0]);
                    String string20 = cfh_2.createLink(aum_0.cWf().c("notification.governmentNominationText", string16, string17), biu_1.kiz);
                    dcd dcd4 = new dcd(string19, string20, biu_1.kiz, 600132);
                    aaw_1.bUq().h(dcd4);
                    if (aue_0.cVJ().c(cwo_2.eWo())) {
                        aue_0.cVJ().b(cwo_2.eWo());
                    }
                } else {
                    bNG.egl();
                    bNG.a(n5, string16, string17);
                }
                return false;
            }
            case 15341: {
                ctp_0 ctp_02 = (ctp_0)aam_22;
                long l = ctp_02.KU();
                String string21 = ctp_02.xO();
                fkL fkL4 = ctp_02.emF();
                int n6 = ctp_02.eCD();
                String string22 = aum_0.cWf().a(57, (long)((int)fkL4.Sn()), new Object[0]);
                if (n6 == 0) {
                    bgy bgy2;
                    String string23 = aum_0.cWf().c("nation.governmentRevokeChatMessage", string21, string22);
                    aPh.czg().jb(string23);
                    String string24 = aum_0.cWf().c("notification.governmentRevokeTitle", new Object[0]);
                    String string25 = cfh_2.createLink(aum_0.cWf().c("notification.governmentRevokeText", string21, string22), biu_1.kiz);
                    dcd dcd5 = new dcd(string24, string25, biu_1.kiz, 600132);
                    aaw_1.bUq().h(dcd5);
                    if (aue_0.cVJ().c(cwo_2.eWo())) {
                        aue_0.cVJ().b(cwo_2.eWo());
                    }
                    if ((bgy2 = bvz_0.ju(l)) instanceof bhJ) {
                        bgy2.dkr();
                    }
                } else {
                    bNG.egl();
                    bNG.a(n6, string21, string22);
                }
                return false;
            }
            case 12983: {
                ctq_0 ctq_02 = (ctq_0)aam_22;
                int n7 = ctq_02.Xt();
                long l = ctq_02.eCE();
                fjn_0 fjn_02 = aue_0.cVJ().cVK().ffF();
                flB flB2 = fjn_02.ems().gbo();
                String string26 = new ahv_2().ceu().ih("cc4444").c(aum_0.cWf().a(97, (long)((int)l), new Object[0])).cev().ceL();
                fkc_0 fkc_02 = cpl_1.eLw();
                if (fkc_02 != null) {
                    int n8 = flB2.um(l);
                    int n9 = flB2.un(l);
                    int n10 = fjn_02.WA(n7);
                    if (n10 > 0) {
                        n8 += n10 * n9 / 100;
                    }
                    String string27 = new ahv_2().ceu().ih("cc4444").c((n8 > 0 ? "+" : "") + n8).cev().ceL();
                    aPd.f("nation.chatLaw", string27, string26);
                }
                return false;
            }
            case 14551: {
                cyp cyp2 = (cyp)aam_22;
                TIntObjectIterator<byte[]> tIntObjectIterator = cyp2.eFx();
                TIntIntIterator tIntIntIterator = cyp2.eFy();
                while (tIntObjectIterator.hasNext() && tIntIntIterator.hasNext()) {
                    tIntObjectIterator.advance();
                    tIntIntIterator.advance();
                    int n11 = tIntObjectIterator.key();
                    byte[] byArray = (byte[])tIntObjectIterator.value();
                    int n12 = tIntIntIterator.value();
                    fjo_0 fjo_06 = fjt.syH.WG(n11);
                    brx_1.elI().dY(n11, n12);
                    fkl_0 fkl_02 = fjo_06.a(fkq_0.sBy);
                    fkl_02.g(ByteBuffer.wrap(byArray), exH.pdw);
                    fkl_02.gcg();
                }
                return false;
            }
            case 14167: {
                cyo cyo2 = (cyo)aam_22;
                long l = cyo2.eFw();
                String string28 = bfW.br((short)(l / 1000L));
                String string29 = bNG.b(cyo2.eFv(), string28);
                bNG.a(cyo2.eFv(), string28);
                fiq_2.gCw().d(fik_2.gBZ().vE(string29).vG(ccp_2.mRF.byf()).abQ(1));
                cwo_2.eWo().kK(true);
                return false;
            }
            case 13045: {
                cpl cpl2 = (cpl)aam_22;
                int n13 = cpl2.ctn();
                boolean bl = cpl2.exj();
                fnf_0.ah(n13, bl);
                brx_1.elI().emc();
                bJK bJK2 = (bJK)bjx_0.klY.HC(n13).gfS();
                String string30 = null;
                if (aum_0.cWf().e(66, bJK2.d())) {
                    string30 = aum_0.cWf().a(66, (long)bJK2.d(), new Object[0]);
                }
                if (bl) {
                    bJS bJS2 = (bJS)bjy_0.kmR.ebc();
                    bJS2.f(bJK2);
                    fpm.sNJ.b(bJS2);
                    if (aue_0.cVJ().cVK().dnU() == bJK2) {
                        dgw.fcT().a(new dgo(dgx.okM, aum_0.cWf().c("notification.chaosStartedTitle", new Object[0]), 500, 2500, "AnimChallenge1"));
                        cAY.eHc().nP(600144L);
                    }
                    dcd dcd6 = new dcd(aum_0.cWf().c("notification.chaosStartedTitle", new Object[0]), aum_0.cWf().c("notification.chaosStartedText", string30), biu_1.kiC);
                    aaw_1.bUq().h(dcd6);
                } else {
                    bjr_0 bjr_02 = (bjr_0)bjy_0.kmS.ebc();
                    bjr_02.f(bJK2);
                    fpm.sNJ.b(bjr_02);
                    dcd dcd7 = new dcd(aum_0.cWf().c("notification.chaosStoppedTitle", new Object[0]), aum_0.cWf().c("notification.chaosStoppedText", string30), biu_1.kiC);
                    aaw_1.bUq().h(dcd7);
                }
                return false;
            }
        }
        return true;
    }

    private static boolean ef(byte[] byArray) {
        if (byArray == null || byArray.length == 0) {
            return false;
        }
        byte by = byArray[0];
        if (by < 0 || by >= fkp_0.values().length) {
            return false;
        }
        for (fkq_0 fkq_02 : fkp_0.values()[by].gch()) {
            if (fkq_02 != fkq_0.sBC) continue;
            return true;
        }
        return false;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

