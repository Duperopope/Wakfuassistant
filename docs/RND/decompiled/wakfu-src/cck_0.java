/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from cck
 */
public class cck_0
implements adk_2 {
    private static final Logger lOw = Logger.getLogger(cck_0.class);

    @Override
    public void b(ayf_2 ayf_22) {
        lOw.info((Object)("Connexion avec le serveur perdue " + String.valueOf(ayf_22.bSp().bXU())));
        aUxx.gzd.a(auy_0.gzf);
        Runnable runnable = () -> {
            byte by = aue_0.cVJ().etw();
            if (by == 26) {
                return;
            }
            String string = switch (by) {
                case 2 -> aum_0.cWf().c("disconnection.spam", new Object[0]);
                case 99 -> aum_0.cWf().c("disconnection.timeout", new Object[0]);
                case 97 -> aum_0.cWf().c("disconnection.kickedByReco", new Object[0]);
                case 43, 44 -> aum_0.cWf().c("disconnection.kickedByAdmin", new Object[0]);
                case 18, 74 -> aum_0.cWf().c("disconnection.accountBanned", new Object[0]);
                case 52 -> aum_0.cWf().c("disconnection.bannedByAdmin", new Object[0]);
                case 51 -> aum_0.cWf().c("disconnection.architectureNotReady", new Object[0]);
                case 41 -> aum_0.cWf().c("disconnection.sessionDestroyed", new Object[0]);
                case 94 -> aum_0.cWf().c("disconnection.remoteServerDoesNotAnswer", new Object[0]);
                case 33 -> aum_0.cWf().c("disconnection.serverShutdown", new Object[0]);
                case 13 -> aum_0.cWf().c("disconnection.invalidPosition", new Object[0]);
                case 48 -> aum_0.cWf().c("disconnection.openOfflineFlea", new Object[0]);
                case 96 -> aum_0.cWf().c("disconnection.unknown", new Object[0]);
                case 6 -> aum_0.cWf().c("disconnection.serverError", new Object[0]);
                case 24 -> aum_0.cWf().c("disconnection.synchronisationError", new Object[0]);
                case 46 -> aum_0.cWf().c("disconnection.timedSessionEnd", new Object[0]);
                case 78 -> aum_0.cWf().c("disconnection.serverFull", new Object[0]);
                default -> aum_0.cWf().c("connection.closed", new Object[0]);
            };
            Optional<fik_2> optional = fiq_2.gCw().b(fin_2.uCB);
            if (optional.isPresent()) {
                optional.get().a((int n, String string2) -> this.l(by, string));
            } else {
                abg_2.bUP().a(() -> this.l(by, string), 20L, 1);
            }
            aue_0.cVJ().cWa();
        };
        if (aue_0.cVJ().c(cvv_2.nPF) && cvv_2.nPF.eUz()) {
            cvv_2.nPF.D(runnable);
        } else {
            abg_2.bUP().i(runnable);
        }
    }

    @Override
    public void a(ayf_2 ayf_22) {
        lOw.info((Object)("onNewConnection " + String.valueOf(ayf_22.bSp().bXU())));
        aUxx.gzd.a(auy_0.gzh);
        abg_2.bUP().a(() -> {
            aue_0 aue_02 = aue_0.cVJ();
            aue_02.a(ccv_1.etD());
            aue_02.a(cce_1.lPv);
            aue_02.etq();
        }, 20L, 1);
    }

    private void l(byte by, String string) {
        if (aue_0.cVJ().etp()) {
            aie_0.cfn().bmX();
            aue_0.cVJ().a(cvz_1.eUB());
            aie_0.cfn().start();
            aue_0.cVJ().a(cwv_1.nSI);
            if (aie_0.cfn().cfI()) {
                cck_0.etx();
                return;
            }
            aue_0.cVJ().a(csn_2.eNY());
        }
        if (by != 80) {
            fiq_2.gCw().d(fik_2.gBZ().a(fin_2.uCs).vE(string).vG(ccp_2.mRF.byf()).abQ(1));
        }
        crh_2.eML().bCj();
        fiu_1.uCW.N("loginLock", true);
    }

    private static void etx() {
        abg_2.bUP().i(() -> cdd_2.loginWithLauncher(null));
        crh_2.eML().cB(true).g(aum_0.cWf().c("logon.progress", new Object[0]), 0);
        aie_0.cfn().ej(false);
    }
}

