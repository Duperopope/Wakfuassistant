/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.chat.console.command.UnknownCommand;
import gnu.trove.iterator.TIntObjectIterator;
import org.apache.log4j.Logger;

/*
 * Renamed from aYm
 */
public class aym_0
implements afl {
    private static final aym_0 hxx = new aym_0();
    private static final Logger hxy = Logger.getLogger(aym_0.class);

    public static aym_0 cYl() {
        return hxx;
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.chat", new Object[0]);
    }

    public void a(WL wL) {
        aPb.cyW();
        aPh aPh2 = aPh.czg();
        aPh2.j(aPl.exq);
        aPh2.k(aPl.exr);
        aPh2.i(aPl.exs);
        aPh2.i(aPl.ext);
        aPh2.i(aPl.exu);
        aPh2.j(aPl.exv);
        aPh2.j(aPl.exw);
        aPh2.j(aPl.exx);
        aPh2.j(aPl.exy);
        aPh2.j(aPl.exB);
        aPh2.k(aPl.exC);
        aPh2.j(aPl.exD);
        aPh2.j(aPl.exE);
        aPh2.j(aPl.exF);
        aPh2.j(aPl.exG);
        aPh2.j(aPl.exH);
        aPh2.j(aPl.exI);
        aPh2.j(aPl.exJ);
        aPh2.j(aPl.exK);
        aPh2.j(aPl.exz);
        aPh2.i(aPl.exA);
        aPh2.a(new UnknownCommand(), aPb.cyV(), new aPG());
        wL.b(this);
    }

    public static void cYm() {
        String string = aPb.cyZ();
        String string2 = auc_0.kG("defaultChatFile");
        hxy.info((Object)"Loading chat file.");
        try {
            aPt.cAg().clean();
            if (fq_0.bC(aPb.cza())) {
                aPb.r(string, true);
            } else {
                aPb.r(string2, false);
            }
        }
        catch (Exception exception) {
            hxy.error((Object)"Exception \u00e0 la lecture des param\u00e8tres de chat : ", (Throwable)exception);
            aPt.cAg().cAx();
            aPb.r(string2, false);
        }
        TIntObjectIterator<apr_0> tIntObjectIterator = aPt.cAg().cAn();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            apr_0 apr_02 = (apr_0)tIntObjectIterator.value();
            if (apr_02 == null) continue;
            aym_0.c(apr_02);
        }
        fse_1.gFu().f("chatManager", aPt.cAg());
        aPb.ez(true);
    }

    public static void f(apn_0 apn_02) {
        aym_0.g(apn_02);
        aym_0.a((aOY)apn_02, aPl.exq);
        aym_0.a((aOY)apn_02, aPl.exr);
        aym_0.a((aOY)apn_02, aPl.exC);
        aym_0.a((aOY)apn_02, aPl.exv);
        aym_0.a((aOY)apn_02, aPl.exw);
        aym_0.a((aOY)apn_02, aPl.exx);
        aym_0.a((aOY)apn_02, aPl.exB);
        aym_0.a((aOY)apn_02, aPl.exD);
        aym_0.a((aOY)apn_02, aPl.exE);
        aym_0.a((aOY)apn_02, aPl.exF);
        aym_0.a((aOY)apn_02, aPl.exG);
        aym_0.a((aOY)apn_02, aPl.exH);
        aym_0.a((aOY)apn_02, aPl.exI);
        aym_0.a((aOY)apn_02, aPl.exJ);
        aym_0.a((aOY)apn_02, aPl.exK);
        if (evm_2.b(aue_0.cVJ().cVO().cWq(), evn_2.ovg)) {
            aym_0.a((aOY)apn_02, aPl.exz);
        }
        apn_02.a(apn_02.czN(), false);
    }

    private static void a(aOY aOY2, aPl aPl2) {
        aPO aPO2 = aPb.iE(aPl2.czF().cyR());
        if (aPO2 != null) {
            aOY2.a(aPh.czg().l(aPl2), aOZ.evo, aPO2);
        }
    }

    public static void g(apn_0 apn_02) {
        aPh aPh2 = aPh.czg();
        for (aPl aPl2 : apn_02.cyO()) {
            apj_0 apj_02 = aPh2.l(aPl2);
            if (apj_02 == null) {
                hxy.error((Object)("Trying to register an unknown channel: " + String.valueOf((Object)aPl2)));
                continue;
            }
            for (apj_0 apj_03 : apj_02.czA().values()) {
                apn_02.a(apj_03, aOZ.evn, null);
            }
            apn_02.a(apj_02, aOZ.evn, null);
        }
    }

    public static void c(apr_0 apr_02) {
        apr_02.cAd();
        TIntObjectIterator<apn_0> tIntObjectIterator = apr_02.czR();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            apn_0 apn_02 = (apn_0)tIntObjectIterator.value();
            if (apn_02.cyN()) {
                if (apn_02.czN() == aPa.evw) {
                    aym_0.i(apn_02);
                    continue;
                }
                if (apn_02.czN() != aPa.evr) continue;
                aym_0.h(apn_02);
                continue;
            }
            aym_0.f(apn_02);
        }
    }

    public static apr_0 a(apr_0 apr_02, aPa aPa2, String string) {
        return aym_0.a(-1, apr_02, aPa2, string);
    }

    public static apr_0 a(int n, apr_0 apr_02, aPa aPa2, String string) {
        apr_0 apr_03 = apr_02 == null ? aPt.cAg().cAj() : apr_02;
        apn_0 apn_02 = apr_03.a(n, string, aPa2);
        if (aPa2 == aPa.evr) {
            aym_0.h(apn_02);
        } else if (aPa2 == aPa.evw) {
            aym_0.i(apn_02);
        }
        apr_03.a((aOY)apn_02);
        return apr_03;
    }

    private static void h(apn_0 apn_02) {
        aym_0.a(apn_02, aPl.exr);
    }

    private static void i(apn_0 apn_02) {
        aym_0.a(apn_02, aPl.exC);
    }

    private static void a(apn_0 apn_02, aPl aPl2) {
        String string;
        apw_0 apw_02;
        apj_0 apj_02 = aPh.czg().l(aPl2);
        if (apj_02 == null) {
            apj_02 = aPh.czg().k(aPl2);
        }
        if ((apw_02 = (apw_0)apj_02.jg(string = apn_02.getName())) == null) {
            apw_02 = new apw_0(aPl2, string);
        }
        aPO aPO2 = aPb.iE(aPl2.czF().cyR());
        apn_02.a(apj_02, aOZ.evn, aPO2);
        apn_02.a(apw_02, aOZ.evn, aPO2);
        apn_02.a(apj_02, aOZ.evo, aPO2);
        apn_02.a(apw_02, aOZ.evo, aPO2);
        apn_02.a(aPh.czg().l(aPl.exs), aOZ.evn, null);
        apj_02.a(string, apw_02);
        apn_02.a(aPO2.cBk(), false);
    }

    public void cYn() {
        aPh aPh2 = aPh.czg();
        TIntObjectIterator<apr_0> tIntObjectIterator = aPt.cAg().cAn();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            apr_0 apr_02 = (apr_0)tIntObjectIterator.value();
            if (apr_02 == null) continue;
            TIntObjectIterator<apn_0> tIntObjectIterator2 = apr_02.czR();
            while (tIntObjectIterator2.hasNext()) {
                tIntObjectIterator2.advance();
                apn_0 apn_02 = (apn_0)tIntObjectIterator2.value();
                if (apn_02.cyN()) continue;
                fkL fkL2 = aue_0.cVJ().cVK().ffF().emF();
                if (fkL2 != null) {
                    if (!apn_02.b(aPl.exy)) {
                        apn_02.a(aPh2.l(aPl.exy), aOZ.evo, aPb.iE(aPa.evx.cyR()));
                        apn_02.a(aPh2.l(aPl.exy), aOZ.evo, aPb.iE(aPa.evy.cyR()));
                        apn_02.a(apn_02.czN(), false);
                    }
                } else {
                    apn_02.c(aPl.exy);
                    if (apn_02.czN().cyS()) {
                        apn_02.a(aPa.evq, true);
                    }
                }
                fse_1.gFu().a((aef_2)apn_02, "channelsList");
            }
        }
    }
}

