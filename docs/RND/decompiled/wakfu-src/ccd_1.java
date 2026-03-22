/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.chat.console.command.AwayCommand;
import gnu.trove.iterator.TIntObjectIterator;
import java.util.ArrayList;
import java.util.function.Function;
import org.apache.log4j.Logger;

/*
 * Renamed from ccD
 */
public class ccd_1
implements adi_1 {
    protected static final Logger lPr = Logger.getLogger(ccd_1.class);
    private static final ccd_1 lPs = new ccd_1();
    private static final String lPt = "UNDEFINED";
    private static final String lPu = "[Zone] ";

    public static ccd_1 etO() {
        return lPs;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 691: {
                nm_0 nm_02 = (nm_0)aam_22;
                api_0 api_02 = new api_0(nm_02);
                int n = nm_02.aWt();
                ewf_0 ewf_02 = ewf_0.Ow(n);
                if (ewf_02 == null || !((bsg_1)aie_0.cfn().bmH()).t(ewf_02.aUXX())) {
                    return false;
                }
                aPl string2 = aPl.c(ewf_02);
                if (string2 == aPl.exp) {
                    return false;
                }
                api_02.m(string2);
                aPh.czg().d(api_02);
                return false;
            }
            case 615: {
                nw_0 nw_02 = (nw_0)aam_22;
                String string = nw_02.aWL();
                long l = nw_02.aWM();
                String eS2 = nw_02.getMessage();
                cwl_2.eWm().a(string, l, eS2);
                return false;
            }
            case 728: {
                nx_0 nx_02 = (nx_0)aam_22;
                int n = nx_02.aWN();
                this.KN(n);
                return false;
            }
            case 666: {
                ny_1 ny_12 = (ny_1)aam_22;
                dae_0 dae_02 = new dae_0(16765);
                dae_02.ay(ny_12.aVT());
                aaw_1.bUq().h(dae_02);
                return false;
            }
            case 648: {
                nt_1 nt_12 = (nt_1)aam_22;
                boolean bl = nt_12.aWH();
                fse_1.gFu().f("hasModeratorChatRequest", !bl);
                return false;
            }
            case 686: {
                ol_1 ol_12 = (ol_1)aam_22;
                String string = "unknown";
                switch (ol_12.aWW()) {
                    case 2: {
                        string = "contactModerator.noRequest";
                        break;
                    }
                    case 1: {
                        string = "contactModerator.contactdisconnected";
                        break;
                    }
                    case 3: {
                        string = "contactModerator.error.ignored";
                    }
                }
                aPd.e(string, new Object[0]);
                return false;
            }
            case 628: {
                NP nP = (NP)aam_22;
                apc_0 apc_02 = new apc_0(nP.xO(), nP.aWA(), true, nP.aWB(), true, nP.aWC(), nP.aWD(), "", nP.aWE());
                apd_0.cAO().a((short)1, apc_02);
                ahv_2 ahv_22 = new ahv_2();
                apn_0.a(ahv_22, "characterName_" + nP.aWB(), nP.xO());
                aPd.f("chat.notify.addFriend", ahv_22.ceL(), nP.aWA());
                return false;
            }
            case 674: {
                nr_1 nr_12 = (nr_1)aam_22;
                String string = "";
                if (apd_0.cAO().cAQ().y(nr_12.aWG()) != null) {
                    string = apd_0.cAO().cAQ().y(nr_12.aWG()).getName();
                }
                if (!apd_0.cAO().a((short)1, nr_12.aWG())) {
                    aPd.e("error.chat.userNotFound", string);
                } else {
                    aPd.f("chat.notify.removeFriend", string);
                }
                return false;
            }
            case 684: {
                oa_0 oa_02 = (oa_0)aam_22;
                aPw aPw2 = apd_0.cAO().cAQ();
                if (aPw2 != null) {
                    apc_0 apc_03 = aPw2.ii(oa_02.fD());
                    if (apc_03 == null) {
                        apc_03 = aPw2.jj(oa_02.aWA());
                    }
                    if (apc_03 != null) {
                        apc_03.setName(oa_02.aWA());
                        apc_03.dm(oa_02.xO());
                        apc_03.eN(true);
                        apc_03.dC(oa_02.fD());
                        apc_03.jo(oa_02.xV());
                        apc_03.aT(oa_02.aWP());
                        apc_03.aQ(oa_02.aWO());
                        apc_03.ij(oa_02.pf());
                        if (apc_03.cAK()) {
                            ahv_2 ahv_23 = new ahv_2();
                            apn_0.a(ahv_23, "characterName_" + oa_02.fD(), oa_02.xO());
                            aPd.f("chat.notify.friendOnline", ahv_23.ceL(), oa_02.aWA(), apc_03.cAL());
                        }
                    } else {
                        lPr.error((Object)("Ami inconnu " + oa_02.aWA()));
                        aPd.e("error.chat.userNotFound", oa_02.aWA());
                        return false;
                    }
                    apc_03.cAN();
                }
                return false;
            }
            case 673: {
                nz_1 nz_12 = (nz_1)aam_22;
                aPw aPw3 = apd_0.cAO().cAQ();
                if (aPw3 != null) {
                    apc_0 apc_04 = aPw3.ii(nz_12.fD());
                    if (apc_04 == null) {
                        apc_04 = aPw3.jj(nz_12.aWA());
                    }
                    if (apc_04 != null) {
                        apc_04.dC(nz_12.fD());
                        apc_04.dm("");
                        apc_04.eN(false);
                        apc_04.aT((short)-1);
                        apc_04.ij(-1L);
                        if (apc_04.cAK()) {
                            aPd.f("chat.notify.friendOffline", nz_12.xO(), nz_12.aWA(), apc_04.cAL());
                        }
                        fse_1.gFu().a((aef_2)apc_04, apc_04.bxk());
                        fse_1.gFu().a((aef_2)aPw3, "contentList");
                    } else {
                        lPr.error((Object)("Ami inconnu " + nz_12.aWA()));
                    }
                }
                return false;
            }
            case 744: {
                nq_1 nq_12 = (nq_1)aam_22;
                lPr.info((Object)"Received FriendListMessage");
                if (nq_12.aWF() == null) {
                    lPr.error((Object)"Error : Received friend list is null");
                    return false;
                }
                ArrayList<apc_0> arrayList = new ArrayList<apc_0>();
                for (eS object : nq_12.aWF().yr()) {
                    arrayList.add(new apc_0(object.xO(), object.xn(), object.xM(), object.xl(), object.xR(), (short)object.xT(), (byte)object.sY(), object.xV(), object.pf()));
                }
                apd_0.cAO().a((short)1, arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (eS bl : nq_12.aWF().yw()) {
                    apc_0 apc_06 = new apc_0(bl.xl(), bl.xn(), bl.xO());
                    apc_06.eN(bl.xM());
                    arrayList2.add(apc_06);
                }
                apd_0.cAO().a((short)2, arrayList2);
                return false;
            }
            case 742: {
                chZ chZ2 = (chZ)aam_22;
                aPw aPw4 = apd_0.cAO().cAQ();
                if (aPw4 == null) {
                    return false;
                }
                for (long string3 : chZ2.evf()) {
                    apc_0 l2 = aPw4.y(string3);
                    if (l2 == null) continue;
                    l2.l(chZ2.mV(string3));
                    l2.b(chZ2.mW(string3));
                    fse_1.gFu().a((aef_2)l2, "characterNameWithLanguages");
                }
                return false;
            }
            case 664: {
                nu_0 nu_02 = (nu_0)aam_22;
                apc_0 apc_07 = new apc_0(nu_02.aWJ(), nu_02.aWI(), nu_02.xO());
                apc_07.eN(nu_02.aWJ() != -1L);
                apd_0.cAO().a((short)2, apc_07);
                aPd.f("chat.notify.addIgnore", nu_02.xO(), nu_02.aWI());
                return false;
            }
            case 730: {
                nv_1 nv_12 = (nv_1)aam_22;
                if (!apd_0.cAO().a((short)2, nv_12.aWK())) {
                    aPd.e("error.chat.userNotFound", nv_12.aWI());
                } else {
                    aPd.e("chat.notify.removeIgnore", nv_12.aWI());
                }
                return false;
            }
            case 773: {
                oc_0 oc_02 = (oc_0)aam_22;
                aPw aPw5 = apd_0.cAO().cAR();
                if (aPw5 != null) {
                    apc_0 apc_08 = aPw5.ii(oc_02.fD());
                    if (apc_08 == null) {
                        apc_08 = aPw5.jj(oc_02.aWI());
                    }
                    if (apc_08 != null) {
                        apc_08.dm(oc_02.aWQ());
                        apc_08.eN(true);
                        apc_08.setName(oc_02.aWI());
                        apc_08.dC(oc_02.fD());
                        apc_08.cAN();
                    } else {
                        lPr.error((Object)("Ignor\u00e9 inconnu " + oc_02.aWI()));
                    }
                }
                return false;
            }
            case 688: {
                ob_0 ob_02 = (ob_0)aam_22;
                aPw aPw6 = apd_0.cAO().cAR();
                if (aPw6 != null) {
                    apc_0 apc_09 = aPw6.ii(ob_02.fD());
                    if (apc_09 == null) {
                        apc_09 = aPw6.jj(ob_02.aWI());
                    }
                    if (apc_09 != null) {
                        apc_09.dC(ob_02.fD());
                        apc_09.dm("");
                        apc_09.eN(false);
                        apc_09.cAN();
                    } else {
                        lPr.error((Object)("Ignor\u00e9 inconnu " + ob_02.aWI()));
                    }
                }
                return false;
            }
            case 705: {
                of_0 of_02 = (of_0)aam_22;
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                long l = bgt_02.aZj();
                boolean bl = l == of_02.aWu();
                long bl3 = bl ? bgt_02.Sn() : of_02.aWu();
                boolean api_03 = bl || of_02.aWv();
                String bl4 = bl ? of_02.aWR() : of_02.aWw();
                long string5 = bl ? of_02.aWS() : of_02.aWu();
                aPm aPm2 = new aPm(bl4, bl3, of_02.q(), string5);
                aPm2.eD(api_03);
                aPm2.y(of_02.aWx());
                aPm2.a(of_02.aWy());
                aPh.czg().a(aPm2, bl4, bl);
                aPh.czg().jd(bl4);
                if (AwayCommand.eAb && !bl && !AwayCommand.eAc.isEmpty()) {
                    aPd.Q(AwayCommand.eAc, of_02.aWw());
                }
                this.etQ();
                return false;
            }
            case 725: {
                api_0 api_02;
                String tIntObjectIterator2;
                oh_0 oh_02 = (oh_0)aam_22;
                long l = oh_02.aWu();
                String fik_22 = ccd_1.f(oh_02.aWw(), l);
                boolean tIntObjectIterator = oh_02.aWU();
                boolean apr_02 = oh_02.aWT();
                String string = tIntObjectIterator2 = tIntObjectIterator ? aum_0.cWf().c(oh_02.q(), new Object[0]) : oh_02.q();
                if (tIntObjectIterator2.startsWith("\"")) {
                    tIntObjectIterator2 = tIntObjectIterator2.substring(1);
                }
                if (tIntObjectIterator2.endsWith("\"")) {
                    tIntObjectIterator2 = tIntObjectIterator2.substring(0, tIntObjectIterator2.length() - 1);
                }
                if (apr_02) {
                    boolean ahv_25 = aue_0.cVJ().cVK().aZj() == oh_02.aWu();
                    String string2 = ahv_25 ? oh_02.aWR() : oh_02.aWw();
                    long l2 = ahv_25 ? oh_02.aWS() : oh_02.aWu();
                    ahv_2 ahv_22 = ccd_1.a("characterName_" + l2, ahv_25, string2, aPl.exA.getColor(), tIntObjectIterator2);
                    api_02 = new api_0(string2, l2, ahv_22.ceL());
                } else {
                    ahv_2 ahv_23 = new ahv_2();
                    ahv_23.e(aPl.exA.getColor());
                    ahv_23.c(lPu);
                    if (!lPt.equalsIgnoreCase(fik_22)) {
                        ahv_23.c(fik_22).c(" : ");
                    }
                    ahv_23.c(tIntObjectIterator2);
                    api_02 = new api_0(ahv_23.ceL());
                }
                api_02.m(aPl.exs);
                if (api_02.getMessage().isEmpty()) {
                    return false;
                }
                aPh.czg().d(api_02);
                if (oh_02.q().toUpperCase().contains(aue_0.cVJ().cVK().getName().toUpperCase())) {
                    this.etQ();
                }
                return false;
            }
            case 784: {
                ok_1 ok_12 = (ok_1)aam_22;
                ccd_1.a(ok_12, aPl.exq);
                if (ok_12.q().toUpperCase().contains(aue_0.cVJ().cVK().getName().toUpperCase())) {
                    this.etQ();
                }
                return false;
            }
            case 651: {
                oi_0 oi_02 = (oi_0)aam_22;
                ccd_1.a(oi_02, aPl.exx);
                return false;
            }
            case 762: {
                og_0 og_02 = (og_0)aam_22;
                aPl aPl3 = ccd_1.a(aPl::l, og_02.aWz());
                if (aPl3 != aPl.exp) {
                    ccd_1.a(og_02, aPl3);
                }
                return false;
            }
            case 760: {
                oe_0 oe_02 = (oe_0)aam_22;
                ccd_1.a(oe_02, aPl.exy);
                if (oe_02.aWu() != aue_0.cVJ().cVK().Sn()) {
                    this.etP();
                }
                return false;
            }
            case 678: {
                NL nL = (NL)aam_22;
                ccd_1.a(nL, aPl.exB);
                return false;
            }
            case 712: {
                ns_1 ns_12 = (ns_1)aam_22;
                ccd_1.a(ns_12, aPl.exw);
                return false;
            }
            case 704: {
                od_0 od_02 = (od_0)aam_22;
                ccd_1.a(od_02, aPl.exv);
                return false;
            }
            case 668: {
                no_0 no_02 = (no_0)aam_22;
                aPl aPl4 = ccd_1.a(aPl::k, no_02.aWz());
                if (aPl4 != aPl.exp) {
                    ccd_1.a(no_02, aPl4);
                }
                return false;
            }
            case 719: {
                oj_0 oj_02 = (oj_0)aam_22;
                aPd.f("info.chat.doNotDisturbStatus", oj_02.aWV() ? 1 : 0);
                return false;
            }
            case 785: {
                om_1 om_12 = (om_1)aam_22;
                short s = om_12.aWX();
                ape_0.aU(s);
                return false;
            }
            case 12572: {
                chY chY2 = (chY)aam_22;
                boolean bl = chY2.evd();
                boolean bl5 = chY2.eve();
                if (bl && bl5) {
                    fik_2 string = new fik_2().l("moderationPanel.restrictLanguages.text", new Object[0]).abQ(2).vG(ccp_2.mRF.byf()).pd(true).a(fil_2.gCp());
                    fiq_2.gCw().d(string);
                    ((bsg_1)aie_0.cfn().bmH()).s(aup_0.cWl());
                }
                fse_1.gFu().f("isClientLanguageRestricted", bl);
                cxh_2.eWK();
                return false;
            }
            case 12471: {
                cpn cpn2 = (cpn)aam_22;
                long l = cpn2.KU();
                String string = cpn2.xO();
                TIntObjectIterator<apr_0> tIntObjectIterator = aPt.cAg().cAn();
                while (tIntObjectIterator.hasNext()) {
                    tIntObjectIterator.advance();
                    apr_0 apr_02 = (apr_0)tIntObjectIterator.value();
                    TIntObjectIterator<apn_0> tIntObjectIterator2 = apr_02.czR();
                    while (tIntObjectIterator2.hasNext()) {
                        tIntObjectIterator2.advance();
                        ((apn_0)tIntObjectIterator2.value()).c(l, string);
                        ((apn_0)tIntObjectIterator2.value()).cyE();
                    }
                }
                return false;
            }
        }
        return true;
    }

    private static aPl a(Function<Mv, aPl> function, byte by) {
        Mv mv = Mv.y(by);
        if (!((bsg_1)aie_0.cfn().bmH()).t(mv)) {
            return aPl.exp;
        }
        aPl aPl2 = function.apply(mv);
        if (aPl2 == aPl.exp) {
            lPr.warn((Object)("Message received in unknown community channel with language : " + String.valueOf((Object)mv)));
        }
        return aPl2;
    }

    private static void a(nn_0 nn_02, aPl aPl2) {
        api_0 api_02 = new api_0(nn_02);
        api_02.m(aPl2);
        aPh.czg().d(api_02);
    }

    private static String f(String string, long l) {
        if (!string.isEmpty()) {
            return string;
        }
        bgy bgy2 = bgg_0.dlO().ju(l);
        return bgy2 != null ? bgy2.getName() : lPt;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    private void etP() {
        cAY.eHc().nP(600109L);
    }

    private void etQ() {
        cAY.eHc().nP(600145L);
    }

    public void KN(int n) {
        fse_1.gFu().f("numModeratorHelpRequestText", "Requests:" + n);
    }

    private static ahv_2 a(String string, boolean bl, String string2, axb_2 axb_22, String string3) {
        ahv_2 ahv_22 = new ahv_2();
        if (axb_22 != null) {
            ahv_22.ceC();
            ahv_22.e(axb_22);
        }
        if (bl) {
            ahv_22.c(aum_0.cWf().c("chat.to", new Object[0])).c(" ");
        }
        if (string2 != null) {
            ccd_1.a(ahv_22, string, string2);
        }
        ahv_22.c(aum_0.cWf().c("colon", new Object[0])).c(string3);
        if (axb_22 != null) {
            ahv_22.ceD();
        }
        return ahv_22;
    }

    public static void a(ahv_2 ahv_22, String string, String string2) {
        ahv_22.ceu().ceA();
        ahv_22.ij(string);
        ahv_22.c(string2);
        ahv_22.ceB().cev();
    }
}

