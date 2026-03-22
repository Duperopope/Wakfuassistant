/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public final class aPb {
    private static final Logger evQ = Logger.getLogger(aPb.class);
    private static final String evR = "chat";
    private static final String evS = "selectedChat";
    private static final String evT = "window";
    private static final String evU = "command";
    private static final String evV = "view";
    private static final String evW = "selectedView";
    private static final String evX = "name";
    private static final String evY = "isDefault";
    private static final String evZ = "id";
    private static final String ewa = "isInLine";
    private static final String ewb = "lastDefinedHeight";
    private static final String ewc = "channelName";
    private static final String ewd = "opennedPipes";
    private static final String ewe = "value";
    private static final String ewf = "isPrivate";
    private static final String ewg = "isNameDirty";
    private static final String ewh = "cmdPattern";
    public static final String ewi = "chat.xml";
    private static final Pattern ewj = Pattern.compile(".*\\Q(?:\\E(/[^|^)]+)[|)].*");
    private static final ArrayList<api_0> ewk = new ArrayList();
    private static final HashMap<String, aPO> ewl = new HashMap();
    private static final Set<ewf_0> ewm = new HashSet<ewf_0>();
    private static aPa ewn = null;
    private static aPa ewo = null;
    private static boolean ewp;

    private aPb() {
    }

    public static boolean cyU() {
        return ewp;
    }

    public static URL cyV() {
        return aid_0.class.getResource("/com/ankamagames/wakfu/client/chat/console/ChatCommandDescriptorSet.xml");
    }

    public static void c(api_0 api_02) {
        if (ewk.contains(api_02)) {
            return;
        }
        ewk.add(api_02);
    }

    public static void ez(boolean bl) {
        ewp = bl;
        if (!ewp || ewk.isEmpty()) {
            return;
        }
        for (api_0 api_02 : ewk) {
            aPh.czg().d(api_02);
        }
        ewk.clear();
    }

    public static void r(String string, boolean bl) {
        aqr_2 aqr_22 = aqr_2.bGR();
        aqs_2 aqs_22 = aqr_22.bGS();
        aqr_22.ex(string);
        aqr_22.a(aqs_22, new ape_1[0]);
        aqr_22.close();
        ewm.clear();
        if (bl) {
            aPb.h(aqs_22);
        } else {
            aPb.g(aqs_22);
        }
    }

    private static void g(apb_1 apb_12) {
        ArrayList<apd_1> arrayList = apb_12.eA(evT);
        boolean bl = true;
        aPt aPt2 = aPt.cAg();
        for (apd_1 apd_12 : arrayList) {
            if (apd_12.fq(evZ) == null) {
                evQ.error((Object)"Id null sur au chargement d'une fen\u00eatre de chat");
                continue;
            }
            int n = apd_12.fq(evZ).bCo();
            int n2 = apd_12.fq(evW).bCo();
            apr_0 apr_02 = aPt2.ze(n);
            if (apr_02 == null) {
                apr_02 = aPt2.zc(n);
            }
            apr_02.za(n2);
            ArrayList<apd_1> arrayList2 = apd_12.fo(evV);
            if (arrayList2 == null) continue;
            for (apd_1 apd_13 : arrayList2) {
                if (apd_13.fq(evZ) == null) continue;
                int n3 = apd_13.fq(evZ).bCo();
                String string = apd_13.fq(evX).bCt();
                String string2 = apd_13.fq(ewd).bCt();
                String string3 = apd_13.fq(ewc).bCt();
                aPa aPa2 = aPa.iD(string3);
                if (aPa2 == null) {
                    evQ.error((Object)("Commande inconnue enregistr\u00e9e sur la vue " + string));
                    continue;
                }
                apn_0 apn_02 = new apn_0(n3, string, aPa2, aPl.exL, true);
                apn_02.x(aPb.iF(string2));
                apr_02.b(apn_02);
            }
            if (bl) {
                aPt2.b(apr_02);
            }
            bl = false;
        }
        ((bsg_1)aie_0.cfn().bmH()).ena();
        aPb.cyX();
    }

    public static aPO iE(String string) {
        if (string == null) {
            return null;
        }
        if (ewn != null && string.equals(ewn.cyR())) {
            return ewl.get(aPa.evA.cyR());
        }
        if (ewo != null && string.equals(ewo.cyR())) {
            return ewl.get(aPa.evF.cyR());
        }
        return ewl.get(string);
    }

    public static void cyW() {
        aqr_2 aqr_22 = aqr_2.bGR();
        aqs_2 aqs_22 = aqr_22.bGS();
        aqr_22.ex(aPb.cyV().toString());
        aqr_22.a(aqs_22, new ape_1[0]);
        aqr_22.close();
        ArrayList<apd_1> arrayList = aqs_22.eA(evU);
        for (apd_1 apd_12 : arrayList) {
            apd_1 apd_13;
            apd_1 apd_14 = apd_12.fq(ewc);
            if (apd_14 == null || (apd_13 = apd_12.fq(ewh)) == null) continue;
            String string = apd_14.bCt();
            String string2 = apd_13.bCt();
            Matcher matcher = ewj.matcher(string2);
            if (!matcher.find()) continue;
            String string3 = matcher.group(1);
            aPa aPa2 = aPa.iD(string);
            if (aPa2 == null) continue;
            ewl.put(string, new aPO(aPa2, string3));
        }
    }

    public static void i(Mv mv) {
        ewn = aPa.g(mv);
    }

    public static void j(Mv mv) {
        ewo = aPa.h(mv);
    }

    private static void h(apb_1 apb_12) {
        int n;
        ArrayList<apd_1> arrayList = apb_12.eA(evT);
        boolean bl = false;
        for (apd_1 apd_12 : arrayList) {
            ArrayList<apd_1> arrayList2;
            apd_1 apd_13;
            apd_1 apd_14;
            if (apd_12.fq(evZ) == null) {
                evQ.error((Object)"Id null sur au chargement d'une fen\u00eatre de chat");
                continue;
            }
            n = apd_12.fq(evZ).bCo();
            int n2 = apd_12.fq(evW).bCo();
            apr_0 apr_02 = aPt.cAg().ze(n);
            if (apr_02 == null) {
                apr_02 = aPt.cAg().zc(n);
            }
            if ((apd_14 = apd_12.fq(ewa)) != null) {
                apr_02.eH(apd_14.bCu());
            }
            if ((apd_13 = apd_12.fq(ewb)) != null) {
                apr_02.q(apd_13.bCo());
            }
            if ((arrayList2 = apd_12.fo(evV)) == null) continue;
            for (apd_1 apd_15 : arrayList2) {
                Object object;
                Object object2;
                Object object3;
                Object object4;
                if (apd_15.fq(evZ) == null) continue;
                int n3 = apd_15.fq(evZ).bCo();
                boolean bl2 = apd_15.fq(evY).bCu();
                boolean bl3 = apd_15.fq(ewg).bCu();
                boolean bl4 = apd_15.fq(ewf) != null && apd_15.fq(ewf).bCu();
                bl |= bl2;
                String string = apd_15.fq(evX).bCt();
                if (!bl3 && !bl2 && !bl4 && ((Matcher)(object4 = ((Pattern)(object3 = Pattern.compile("[0-9]+"))).matcher(string))).find()) {
                    object2 = ((Matcher)object4).group();
                    object = Integer.valueOf((String)object2);
                    string = aum_0.cWf().c("chat.pipeName.personnal", object);
                }
                object3 = apd_15.fq(ewd).bCt();
                object4 = apd_15.fq(ewc).bCt();
                object2 = aPa.iD((String)object4);
                if (object2 == null) {
                    evQ.error((Object)("Commande inconnue enregistr\u00e9e sur la vue " + string));
                    continue;
                }
                object = aPb.iF((String)object3);
                apn_0 apn_02 = apr_02.yZ(n3);
                if (apn_02 == null) {
                    if (bl4) {
                        aym_0.a(n3, apr_02, (aPa)object2, string);
                        continue;
                    }
                    apn_02 = new apn_0(n3, string, (aPa)object2, aPl.exL, bl2);
                    apn_02.x((List<aPl>)object);
                    apn_02.eE(bl3);
                } else {
                    apn_02.setName(string);
                    apn_02.eE(bl3);
                    apn_02.b((aPP)object2);
                    apn_02.x((List<aPl>)object);
                    apn_02.eF(bl2);
                }
                apr_02.b(apn_02);
            }
            apn_0 apn_03 = apr_02.za(n2);
            if (apn_03 != null) continue;
            throw new IllegalStateException("Impossible de retrouver la vue de la fen\u00eatre de chat d'id=" + apr_02.czm() + " id de la vue enregistr\u00e9e=" + n2 + " reset config...");
        }
        if (!bl) {
            throw new IllegalStateException("Acucune vue par d\u00e9faut dans la configuration du chat ! On reset la config en attendant de savoir ce qui s'est pass\u00e9");
        }
        ArrayList<apd_1> arrayList3 = apb_12.eA(evS);
        if (arrayList3 != null) {
            apd_1 apd_12;
            if (arrayList3.size() > 1) {
                evQ.warn((Object)"La sauvegarde poss\u00e8de plusieurs r\u00e9f\u00e9rences \u00e0 un chat par d\u00e9faut, \u00e9trange...");
            }
            apd_12 = (apd_1)arrayList3.get(0);
            n = apd_12.fq(ewe).bCo();
            aPt.cAg().zf(n);
        }
        ((bsg_1)aie_0.cfn().bmH()).ena();
        aPb.cyX();
    }

    private static List<aPl> iF(String string) {
        ArrayList<aPl> arrayList = new ArrayList<aPl>();
        for (String string2 : string.split(",")) {
            try {
                arrayList.add(aPl.yX(Integer.parseInt(string2)));
            }
            catch (NumberFormatException numberFormatException) {
                evQ.error((Object)"ClassCastException during getFilters", (Throwable)numberFormatException);
            }
        }
        return arrayList;
    }

    private static void cyX() {
        if (aPb.f(aPl.exx)) {
            aPb.a(ewf_0.oIy);
        }
        aPb.cyY();
    }

    public static void cyY() {
        for (Mv mv : Mv.aVz) {
            ewf_0 ewf_02 = ewf_0.ex(mv.aJr());
            aPl aPl2 = aPl.k(mv);
            if (aPb.a(aPl2, mv)) {
                aPb.a(ewf_02);
            } else {
                aPb.b(ewf_02);
            }
            ewf_0 ewf_03 = ewf_0.ey(mv.aJr());
            aPl aPl3 = aPl.l(mv);
            if (aPb.a(aPl3, mv)) {
                aPb.a(ewf_03);
                continue;
            }
            aPb.b(ewf_03);
        }
    }

    public static boolean e(aPl aPl2) {
        for (apn_0 apn_02 : aPt.cAg().cAt()) {
            if (!apn_02.a(aPl2)) continue;
            return false;
        }
        return true;
    }

    public static boolean f(aPl aPl2) {
        for (apn_0 apn_02 : aPt.cAg().cAt()) {
            if (!apn_02.a(aPl2)) continue;
            return true;
        }
        return false;
    }

    public static boolean a(aPl aPl2, @Nullable Mv mv) {
        if (mv == null) {
            return aPb.f(aPl2);
        }
        if (!((bsg_1)aie_0.cfn().bmH()).t(mv)) {
            return false;
        }
        return aPb.f(aPl2);
    }

    public static void a(ewf_0 ewf_02) {
        if (ewm.contains((Object)ewf_02)) {
            return;
        }
        NK nK = new NK();
        nK.nZ(ewf_02.d());
        aue_0.cVJ().etu().d(nK);
        ewm.add(ewf_02);
    }

    public static void b(ewf_0 ewf_02) {
        if (!ewm.contains((Object)ewf_02)) {
            return;
        }
        NK nK = new NK();
        nK.nZ(ewf_02.d());
        nK.aWs();
        aue_0.cVJ().etu().d(nK);
        ewm.remove((Object)ewf_02);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void buR() {
        Object object;
        evQ.info((Object)"save chat config");
        aqr_2 aqr_22 = aqr_2.bGR();
        aqs_2 aqs_22 = aqr_22.bGS();
        String string = aPb.cza();
        aqr_22.eD(string);
        aqs_22.a(new aqt_2(evR, null));
        aqr_22.a(aqs_22, "");
        aqr_22.close();
        aqr_22.ex(string);
        aqr_22.a(aqs_22, new ape_1[0]);
        aqr_22.close();
        aPt aPt2 = aPt.cAg();
        Object object2 = aPt2.cAn();
        while (object2.hasNext()) {
            object2.advance();
            object = (apr_0)object2.value();
            int n = ((apr_0)object).czm();
            if (aPt2.zh(n)) continue;
            aqt_2 aqt_22 = new aqt_2(evT, null);
            aqt_22.c(new aqu_2(evZ, String.valueOf(n)));
            aqt_22.c(new aqu_2(evW, String.valueOf(((apr_0)object).czX())));
            aqt_22.c(new aqu_2(ewa, String.valueOf(((apr_0)object).czZ())));
            Integer n2 = ((apr_0)object).cAa();
            if (n2 != null) {
                aqt_22.c(new aqu_2(ewb, String.valueOf(n2)));
            }
            int n3 = 0;
            TIntObjectIterator<apn_0> tIntObjectIterator = ((apr_0)object).czR();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                apn_0 apn_02 = (apn_0)tIntObjectIterator.value();
                try {
                    aPb.a(apn_02, aqt_22);
                }
                catch (RuntimeException runtimeException) {
                    evQ.error((Object)"Impossible de sauvegarder une vue", (Throwable)runtimeException);
                }
                finally {
                    ++n3;
                }
            }
            if (n3 == 0) continue;
            aqs_22.bGT().a(aqt_22);
        }
        object2 = aPt.cAg().cAl();
        if (object2 != null) {
            object = new aqt_2(evS, null);
            ((aqt_2)object).c(new aqu_2(ewe, String.valueOf(((apr_0)object2).czm())));
            aqs_22.bGT().a((apd_1)object);
        } else {
            evQ.error((Object)"Impossible de r\u00e9cup\u00e9rer le chat par d\u00e9faut, il y a un probl\u00e8me.");
        }
        aqr_22.eD(string);
        aqr_22.a(aqs_22);
        aqr_22.close();
    }

    private static void a(apn_0 apn_02, aqt_2 aqt_22) {
        aqt_2 aqt_23 = new aqt_2(evV, null);
        aqt_23.c(new aqu_2(evZ, String.valueOf(apn_02.cyJ())));
        aqt_23.c(new aqu_2(evX, apn_02.getName()));
        aqt_23.c(new aqu_2(evY, String.valueOf(apn_02.czL())));
        aqt_23.c(new aqu_2(ewg, String.valueOf(apn_02.czM())));
        aqt_23.c(new aqu_2(ewc, apn_02.cyI().cBm().cyR()));
        aqt_23.c(new aqu_2(ewf, String.valueOf(apn_02.cyN())));
        String string = apn_02.cyO().stream().map(aPl2 -> String.valueOf(aPl2.d())).collect(Collectors.joining(","));
        aqt_23.c(new aqu_2(ewd, string));
        aqt_22.a(aqt_23);
    }

    public static String cyZ() {
        return "file:" + aub_0.cVb().cVn() + "/chat.xml";
    }

    public static String cza() {
        return fo_0.bA(aPb.cyZ()).getFile();
    }

    static void czb() {
        fq_0.bD(aPb.cza());
    }

    public static String a(aPa aPa2) {
        return aPb.iE(aPa2.cyR()).cBl();
    }
}

