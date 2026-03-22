/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Iterator;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from ccN
 */
public class ccn_1
implements adi_1 {
    private static final Logger lPM = Logger.getLogger(ccn_1.class);
    private static final ccn_1 lPN = new ccn_1();

    private ccn_1() {
    }

    public static ccn_1 etU() {
        return lPN;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        int n = aam_22.d();
        switch (n) {
            case 1066: {
                this.a((cxL)aam_22);
                return false;
            }
            case 1086: {
                this.a((cxE)aam_22);
                return false;
            }
            case 1048: {
                this.a((cxO)aam_22);
                return false;
            }
            case 1119: {
                this.a((cxF)aam_22);
                return false;
            }
            case 1112: {
                this.a((cxN)aam_22);
                return false;
            }
            case 1062: {
                this.a((cxU)aam_22);
                return false;
            }
            case 1094: {
                this.a((cxT)aam_22);
                return false;
            }
            case 1121: {
                this.a((cxH)aam_22);
                return false;
            }
            case 1136: {
                this.a((cxK)aam_22);
                return false;
            }
            case 1122: {
                this.a((cxJ)aam_22);
                return false;
            }
            case 1083: {
                this.a((cxG)aam_22);
                return false;
            }
            case 1031: {
                this.a((cxQ)aam_22);
                return false;
            }
            case 1177: {
                this.a((cxR)aam_22);
                return false;
            }
            case 1016: {
                this.a((cxP)aam_22);
                return false;
            }
            case 1013: {
                this.a((cxI)aam_22);
                return false;
            }
            case 1055: {
                this.a((cxS)aam_22);
                return false;
            }
            case 1193: {
                this.a((cxM)aam_22);
                return false;
            }
        }
        return true;
    }

    private void a(cxM cxM2) {
        byte by = cxM2.evi();
        lPM.warn((Object)eTv.d("Erreur lors de la modification d'un evenement", by));
        eTw eTw2 = cxM2.dFm();
        aPh.czg().iY(aum_0.cWf().c("calendar.event.modification.error", new Object[0]));
        this.a(by, eTw2);
        bse.dEP().d(eTw2);
        bsf.dEU().dEX();
    }

    private void a(cxR cxR2) {
        byte by = cxR2.evi();
        lPM.warn((Object)eTv.d("Impossible de changer la date de debut de l'\u00e9v\u00e8nement", by));
        aPh.czg().iY(aum_0.cWf().c("calendar.start.date.change.error", new Object[0]));
        this.a(by, bse.dEP().ki(cxR2.esw()));
        bse.dEP().b(cxR2.esw(), cxR2.bjc());
        bsf.dEU().dEX();
    }

    private void a(cxS cxS2) {
        byte by = cxS2.evi();
        lPM.warn((Object)eTv.d("Impossible de changer le titre de l'\u00e9v\u00e8nement", by));
        eTw eTw2 = bse.dEP().ki(cxS2.esw());
        if (eTw2 == null) {
            lPM.warn((Object)"[CALENDAR] Bizarre, on a re\u00e7u une reponse sur un changement de description d'un event mais nous ne connaissons pas cet event");
            return;
        }
        ccn_1.a("calendar.event.title.change.error", eTw2);
        eTw2.oA(cxS2.eFg());
    }

    private void a(cxI cxI2) {
        byte by = cxI2.eFa();
        eTw eTw2 = bse.dEP().ki(cxI2.esw());
        if (eTw2 == null) {
            lPM.error((Object)"On est notifi\u00e9 d'une modification d'un \u00e9v\u00e8nement dont on n'a pas connaissance");
            return;
        }
        switch (by) {
            case 1: {
                eTw2.j(cxI2.eEZ(), cxI2.eEY());
                cun_1.eRJ().eRK();
                ccn_1.a("calendar.event.inscription", cxI2.eEY(), eTw2);
                return;
            }
            case 2: {
                eTw2.qC(cxI2.eEZ());
                cun_1.eRJ().eRK();
                cun_1.eRJ().eRL();
                ccn_1.a("calendar.event.other.leave.participants", cxI2.eEY(), eTw2);
                return;
            }
            case 3: {
                eTw2.qD(cxI2.eEZ());
                cun_1.eRJ().eRK();
                return;
            }
        }
        lPM.error((Object)("[CALENDAR] Action de type inconnue : " + by));
    }

    private void a(cxP cxP2) {
        byte by = cxP2.evi();
        switch (by) {
            case 0: {
                lPM.error((Object)"[CALENDAR] Le serveur ne devrait envoyer aucune reponse si le changement de desc s'est bien passe");
                return;
            }
            case 11: {
                lPM.warn((Object)"[CALENDAR] Impossible de changer la desc de l'\u00e9v\u00e8nement : \u00e9v\u00e8nement inconnu");
                break;
            }
            case 14: {
                lPM.warn((Object)"[CALENDAR] Impossible de changer la desc de l'\u00e9v\u00e8nement personnnage non connect\u00e9");
                break;
            }
            case 13: {
                lPM.warn((Object)"[CALENDAR] Impossible de changer la desc de l'\u00e9v\u00e8nement personnage non propri\u00e9taire de l'evenement");
                break;
            }
            case 26: {
                lPM.warn((Object)"[CALENDAR] Impossible de changer la desc de l'\u00e9v\u00e8nement car on ne dipose pas des droits n\u00e9cessaires");
                break;
            }
            default: {
                lPM.error((Object)"[CALENDAR] Le serveur envoie un code d'erreur non trait\u00e9 dans le cas d'un message de reponse au changement de desc");
            }
        }
        eTw eTw2 = bse.dEP().ki(cxP2.esw());
        if (eTw2 == null) {
            lPM.warn((Object)"[EVENTS_CALENDAR] Bizarre, on a re\u00e7u une reponse sur un changement de description d'un event mais nous ne connaissons pas cet event");
            return;
        }
        ccn_1.a("calendar.event.desc.change.error", eTw2);
        eTw2.oA(cxP2.eFg());
    }

    private void a(cxQ cxQ2) {
        byte by = cxQ2.evi();
        switch (by) {
            case 0: {
                lPM.error((Object)"[CALENDAR] Le serveur ne devrait envoyer aucune reponse si le changement de titre s'est bien passe");
                return;
            }
            case 11: {
                lPM.warn((Object)"[CALENDAR] Impossible de changer le titre de l'\u00e9v\u00e8nement : \u00e9v\u00e8nement inconnu");
                break;
            }
            case 14: {
                lPM.warn((Object)"[CALENDAR] Impossible de changer le titre de l'\u00e9v\u00e8nement personnnage non connect\u00e9");
                break;
            }
            case 13: {
                lPM.warn((Object)"[CLAENDAR] Impossible de changer le titre de l'\u00e9v\u00e8nement personnage non propri\u00e9taire de l'evenement");
                break;
            }
            case 26: {
                lPM.warn((Object)"[CLAENDAR] Impossible de changer le titre de l'\u00e9v\u00e8nement car on ne dispose pas des droits n\u00e9cessaires");
                break;
            }
            case 12: {
                aPd.f("calendar.event.end.date.preceding.start", new Object[0]);
            }
            default: {
                lPM.error((Object)"[CALENDAR] Le serveur envoie un code d'erreur non trait\u00e9 dans le cas d'un message de reponse au changement de desc");
            }
        }
        eTw eTw2 = bse.dEP().ki(cxQ2.esw());
        if (eTw2 == null) {
            lPM.warn((Object)"[EVENTS_CALENDAR] Bizarre, on a re\u00e7u une reponse sur un changement de date de fin d'un event mais nous ne connaissons pas cet event");
            return;
        }
        eTw2.P(cxQ2.bjc());
    }

    private void a(cxO cxO2) {
        byte by = cxO2.evi();
        eTw eTw2 = bse.dEP().ki(cxO2.eFf());
        if (by == 0) {
            ccn_1.a("calendar.event.removed", eTw2);
            bse.dEP().f(eTw2);
            lPM.info((Object)bse.dEP().toString());
            return;
        }
        if (by == 9) {
            lPM.info((Object)"[CALENDAR] Le serveur a rejet\u00e9 la demande pour le retrait d'un evenement au calendrier");
            ccn_1.a("calendar.event.removed.error", eTw2);
            return;
        }
        lPM.error((Object)"[CALENDAR] Le serveur envoie un code d'erreur non trait\u00e9 dans le cas d'un message de reponse au retrait d'un evenement");
    }

    private void a(cxG cxG2) {
        Set<eTw> set = cxG2.eEX();
        Iterator<eTw> iterator = set.iterator();
        while (iterator.hasNext()) {
            bse.dEP().c(iterator.next());
        }
    }

    private void a(cxJ cxJ2) {
        long l = cxJ2.esw();
        eTw eTw2 = bse.dEP().ki(l);
        byte by = cxJ2.bks();
        switch (by) {
            case 8: {
                eTw2.i(cxJ2.eFc(), cxJ2.eFb());
                cun_1.eRJ().eRL();
                ccn_1.a("calendar.event.invitation.accepted", cxJ2.eFb(), eTw2);
                break;
            }
            case 7: {
                ccn_1.a("calendar.event.invitation.refused", cxJ2.eFb(), eTw2);
                break;
            }
            case 5: {
                ccn_1.a("calendar.event.invited.not.connected", cxJ2.eFb(), eTw2);
                break;
            }
            case 6: {
                ccn_1.a("calendar.event.invited.has.pending.invitation", cxJ2.eFb(), eTw2);
                break;
            }
            default: {
                ccn_1.a("calendar.event.invitation.error", cxJ2.eFb(), eTw2);
                this.a(by, eTw2);
            }
        }
    }

    private void a(cxK cxK2) {
        fiq_2.gCw().d(fik_2.gBY().l("calendar.event.invitation.message", cxK2.aXl(), cxK2.eFd()).vG(ccp_2.mRE.byf()).abQ(1).a((int n, String string) -> {
            cwx cwx2 = new cwx();
            cwx2.dM(n == 400 ? (byte)8 : (byte)7);
            cwx2.nH(cxK2.esw());
            aue_0.cVJ().etu().d(cwx2);
        }));
    }

    private void a(cxH cxH2) {
        Set<eTw> set = cxH2.eEX();
        for (eTw eTw2 : set) {
            bse.dEP().c(eTw2);
        }
        bsf.dEU().dEX();
    }

    private void a(cxT cxT2) {
        byte by = cxT2.evi();
        eTw eTw2 = bse.dEP().ki(cxT2.esw());
        if (eTw2 == null) {
            lPM.warn((Object)"On recoit du serveur une reponse d'invalidation de participation sur un event que le client ne connait pas");
            return;
        }
        if (by == 0) {
            String string = eTw2.qC(cxT2.KU());
            eTw2.j(cxT2.KU(), string);
            cun_1.eRJ().eRK();
            cun_1.eRJ().eRL();
            ccn_1.a("calendar.event.participation.invalidation", string, eTw2);
        } else {
            ccn_1.a("calendar.event.participation.unvalidation.error", eTw2);
            this.a(by, eTw2);
        }
    }

    private void a(cxU cxU2) {
        byte by = cxU2.evi();
        eTw eTw2 = bse.dEP().ki(cxU2.esw());
        if (eTw2 == null) {
            lPM.warn((Object)"On recoit du serveur une reponse de validation de participation sur un event que le client ne connait pas");
            return;
        }
        if (by == 0) {
            String string = eTw2.qD(cxU2.KU());
            eTw2.i(cxU2.KU(), string);
            cun_1.eRJ().eRK();
            cun_1.eRJ().eRL();
            ccn_1.a("calendar.event.participation.validation.success", string, eTw2);
        } else {
            ccn_1.a("calendar.event.participation.validation.error", eTw2);
            this.a(by, eTw2);
        }
    }

    private void a(cxN cxN2) {
        byte by = cxN2.evi();
        eTw eTw2 = bse.dEP().ki(cxN2.esw());
        if (eTw2 == null) {
            lPM.warn((Object)"On recoit du serveur une reponse d'inscription sur un event que le client ne connait pas");
            return;
        }
        if (by == 0) {
            eTw2.j(aue_0.cVJ().cVK().Sn(), aue_0.cVJ().cVK().getName());
            cun_1.eRJ().eRK();
            ccn_1.a("calendar.event.you.inscription.success", eTw2);
            return;
        }
        aPh.czg().iY(aum_0.cWf().c("calendar.event.you.inscription.error", eTw2.bAD()));
        this.a(by, eTw2);
        lPM.error((Object)"[CALENDAR] Le serveur envoie un code d'erreur non trait\u00e9 dans le cas d'un message de reponse a la demande d'inscription");
    }

    private void a(cxF cxF2) {
        Set<eTw> set = cxF2.eEX();
        aPd.f("calendar.todays.events", new Object[0]);
        for (eTw eTw2 : set) {
            if (eTw2 == null) continue;
            String string = up_0.a(aum_0.cWf().c("calendar.expectations", bsb.a(eTw2)), eTw2.dis());
            aPh.czg().iZ(string);
        }
    }

    private void a(cxE cxE2) {
        byte by = cxE2.evi();
        eTw eTw2 = bse.dEP().kk(cxE2.eEV());
        if (eTw2 == null) {
            lPM.warn((Object)"Impossible de valider l'ajout de l'evenement chez le client, il ne connait pas l'evenement avec le hashcode specifie");
            aPd.f("calendar.events.add.error", "");
            bsf.dEU().dEX();
            return;
        }
        if (by != 0) {
            this.a(by, eTw2);
            lPM.info((Object)"[CALENDAR] Le serveur a rejet\u00e9 la demande pour l'ajout d'un evenement au calendrier, on retire le dernier evt ajoute par le client");
            bse.dEP().f(eTw2);
            bsf.dEU().dEX();
            return;
        }
        ccn_1.a("calendar.events.add.success", eTw2);
        bse.dEP().k(eTw2);
        bse.dEP().a(eTw2, cxE2.eEW());
        bsf.dEU().dEX();
    }

    private void a(cxL cxL2) {
        Set set = cxL2.eFe().dEQ();
        for (eTw eTw2 : set) {
            bse.dEP().c(eTw2);
        }
        bse.dEP().dES();
        bsf.dEU().dEX();
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void a(byte by, eTw eTw2) {
        switch (by) {
            case 1: {
                ccn_1.b("calendar.events.add.error", eTw2);
                break;
            }
            case 22: {
                aPd.e("calendar.events.too.many.for.owner", (byte)20);
                break;
            }
            case 19: {
                ccn_1.b("calendar.event.already.exists", eTw2);
                break;
            }
            case 27: {
                ccn_1.b("calendar.event.start.date.before.today", eTw2);
                break;
            }
            case 29: {
                ccn_1.b("calendar.event.expired", eTw2);
                break;
            }
            case 28: {
                ccn_1.b("calendar.event.already.registered", eTw2);
                break;
            }
            case 18: {
                ccn_1.b("calendar.event.too.much.registrations", eTw2);
                break;
            }
            case 30: {
                ccn_1.b("calendar.event.not.registered", eTw2);
                break;
            }
            case 17: {
                ccn_1.b("calendar.event.too.much.participants", eTw2);
                break;
            }
            case 13: {
                ccn_1.b("calendar.event.you.not.owner", eTw2);
                break;
            }
            case 32: {
                ccn_1.b("calendar.event.not.participant", eTw2);
                break;
            }
            case 33: {
                ccn_1.b("calendar.event.too.much.in.calendar", eTw2);
                break;
            }
            default: {
                aPd.e("calendar.events.unknown.error", by);
            }
        }
    }

    private static void a(String string, eTw eTw2) {
        aPd.f(string, bsb.a(eTw2));
    }

    private static void a(String string, String string2, eTw eTw2) {
        aPd.f(string, string2, bsb.a(eTw2));
    }

    private static void b(String string, eTw eTw2) {
        aPd.e(string, bsb.a(eTw2));
    }
}

