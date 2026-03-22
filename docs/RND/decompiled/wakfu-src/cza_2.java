/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cZA
 */
public class cza_2 {
    private static final Logger obu = Logger.getLogger(cza_2.class);

    private cza_2() {
    }

    public static fhv_1 a(apr_0 apr_02, String string) {
        String string2 = cza_2.NL(apr_02.czm());
        if (fyw_0.gqw().to(string2)) {
            fyw_0.gqw().tl(string2);
        }
        fhv_1 fhv_12 = string == null ? fyw_0.gqw().a(string2, ccj_2.pe("chatDialog"), 57344L) : fyw_0.gqw().a(string2, ccj_2.pe("chatDialog"), string, string, "chatDialog", 57344L);
        fse_1.gFu().b("chat", apr_02, string2);
        fse_1.gFu().b("chat.scrollOffset", Float.valueOf(-1.0f), string2);
        boolean bl = apr_02.czZ();
        fse_1.gFu().b("chat.minDimension", bl ? aPc.ews : aPc.ewr, string2);
        return fhv_12;
    }

    public static String NL(int n) {
        return "chatDialog" + n;
    }

    public static void a(int n, czp_2 czp_22, boolean bl) {
        fey_2 fey_22 = czp_22.getWindow();
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(cza_2.NL(n));
        if (fhs_22 == null) {
            return;
        }
        fes_2 fes_22 = (fes_2)fhs_22.uH("textEditorRenderableContainer.chatInput");
        fes_2 fes_23 = fhw_2.gAL().gAM();
        if (fes_23 != null && (fes_23 == fes_22 || "viewNameEditor".equals(fes_23.getId())) && !bl) {
            return;
        }
        ArrayList<fzc> arrayList = new ArrayList<fzc>();
        ArrayList<fzc> arrayList2 = new ArrayList<fzc>();
        ArrayList<fzc> arrayList3 = new ArrayList<fzc>();
        ArrayList<fzc> arrayList4 = new ArrayList<fzc>();
        cza_2.a(fhs_22, "chatMainContainer", arrayList2);
        cza_2.a(fhs_22, "chatBottomBackground", arrayList2);
        apr_0 apr_02 = aPt.cAg().ze(n);
        if (apr_02 == null || apr_02.czW() == null) {
            obu.error((Object)("Erreur au fade de la fenetre de chat d'id=" + n));
            return;
        }
        if (fes_22 == null) {
            obu.warn((Object)"le textEditor n'existe pas");
        } else {
            arrayList3.add(fes_22.getAppearance());
        }
        cza_2.a(fhs_22, "alphaCorner", arrayList2);
        cza_2.a(fhs_22, "addButton", arrayList);
        cza_2.a(fhs_22, "addLabel", arrayList);
        fbz_2 fbz_22 = (fbz_2)fhs_22.uH("viewsList");
        for (fcv_1 fcv_12 : fbz_22.getRenderables()) {
            fhs_2 fhs_23 = fcv_12.getInnerElementMap();
            if (fhs_23 == null) continue;
            Object object = fcv_12.getItemValue();
            if (object != null && object.equals(apr_02.czW())) {
                cza_2.a(fhs_23, "viewLabel", arrayList4);
            } else {
                cza_2.a(fhs_23, "viewLabel", arrayList3);
            }
            cza_2.a(fhs_23, "viewButton", arrayList2);
            cza_2.a(fhs_23, "viewDeleteButton", arrayList2);
        }
        cza_2.a(bl, fey_22, arrayList, arrayList2, arrayList3, arrayList4);
        cza_2.a(fhs_22, !bl);
    }

    public static void bG(fey_2 fey_22) {
        fad_1 fad_12 = (fad_1)fey_22.getElementMap().uH("downBundaryButton");
        axb_2 axb_22 = awx_2.dnE;
        awx_2 awx_22 = new awx_2(awx_2.dnF.aTn());
        fym_0 fym_02 = fad_12.getAppearance();
        fsa_2 fsa_22 = new fsa_2(axb_22, awx_22, fym_02, 0, 500, 3, abn.cdr);
        fym_02.a(fsa_22);
    }

    public static void eZs() {
        int n = aPt.cAg().cAA();
        if (n == -1) {
            obu.error((Object)"on tente de fermer la vue de chat d'\u00e9change alors qu'elle n'est pas initialis\u00e9e");
            return;
        }
        aPt.cAg().dc(n, -1);
        aPt.cAg().zj(-1);
    }

    public static void eZt() {
        int n = aPt.cAg().cAB();
        if (n == -1) {
            obu.error((Object)"on tente de fermer la vue de chat de moderation alors qu'elle n'est pas initialis\u00e9e");
            return;
        }
        aPt.cAg().dc(n, -1);
        aPt.cAg().zk(-1);
    }

    public static void a(boolean bl, fey_2 fey_22, ArrayList<fzc> arrayList, ArrayList<fzc> arrayList2, ArrayList<fzc> arrayList3, ArrayList<fzc> arrayList4) {
        fey_22.x(fsz_2.class);
        cza_2.a(arrayList, bl, awx_2.dnC, fey_22);
        cza_2.a(arrayList2, bl, awx_2.dnE, fey_22);
        cza_2.a(arrayList3, bl, awx_2.dnD, fey_22);
        cza_2.a(arrayList4, bl, awx_2.dnS, fey_22);
    }

    private static void a(ArrayList<fzc> arrayList, boolean bl, axb_2 axb_22, fey_2 fey_22) {
        int n;
        int n2;
        if (arrayList.isEmpty()) {
            return;
        }
        fzc fzc2 = arrayList.get(0);
        if (bl) {
            if (fzc2.getModulationColor() == null) {
                return;
            }
            n2 = fzc2.getModulationColor().aTn();
            n = awx_2.dnF.aTn();
        } else {
            n2 = awx_2.dnF.aTn();
            n = axb_22.aTn();
        }
        if (n2 != n) {
            if (bl) {
                cAY.eHc().eHq();
            } else {
                cAY.eHc().eHr();
            }
            awx_2 awx_22 = new awx_2(n2);
            awx_2 awx_23 = new awx_2(n);
            fey_22.a(new fsz_2(awx_22, awx_23, arrayList, 0, 1000, 1, abn.cdr));
        }
    }

    public static void a(fhs_2 fhs_22, boolean bl) {
        cza_2.b(fhs_22, "addButton", bl);
        cza_2.b(fhs_22, "resizePoint0", bl);
        cza_2.b(fhs_22, "resizePoint1", bl);
        cza_2.b(fhs_22, "resizePoint2", bl);
        cza_2.b(fhs_22, "resizePoint3", bl);
        cza_2.b(fhs_22, "resizePoint4", bl);
        cza_2.b(fhs_22, "resizePoint5", bl);
        cza_2.b(fhs_22, "resizePoint6", bl);
        cza_2.b(fhs_22, "resizePoint7", bl);
    }

    private static void b(fhs_2 fhs_22, String string, boolean bl) {
        ((fes_2)fhs_22.uH(string)).setNonBlocking(bl);
    }

    private static void a(fhs_2 fhs_22, String string, ArrayList<fzc> arrayList) {
        fhv_1 fhv_12 = fhs_22.uH(string);
        if (fhv_12 == null) {
            obu.warn((Object)("la propri\u00e9t\u00e9 " + string + " n'existe pas."));
            return;
        }
        assert (fhv_12 instanceof fes_2);
        fys_0 fys_02 = ((fes_2)fhv_12).getAppearance();
        fys_02.x(fsa_2.class);
        arrayList.add(fys_02);
    }

    public static void k(apn_0 apn_02) {
        apr_0 apr_02 = aPt.cAg().c(apn_02);
        if (apr_02 == null || apr_02.czW() == apn_02) {
            return;
        }
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(cza_2.NL(apr_02.czm()));
        if (fhs_22 == null) {
            return;
        }
        fbz_2 fbz_22 = (fbz_2)fhs_22.uH("viewsList");
        fcv_1 fcv_12 = fbz_22.getRenderableByOffset(apn_02.cyJ());
        if (fcv_12 == null) {
            return;
        }
        fhs_2 fhs_23 = fcv_12.getInnerElementMap();
        if (fhs_23 == null) {
            obu.error((Object)"innerElementMap is null, can't blink");
            return;
        }
        fad_1 fad_12 = (fad_1)fhs_23.uH("viewButton");
        if (fad_12 == null) {
            obu.error((Object)"viewButton is null, can't blink");
            return;
        }
        awx_2 awx_22 = new awx_2(awx_2.dnE.aTn());
        awx_2 awx_23 = new awx_2(awx_2.dnF.aTn());
        fys_0 fys_02 = ((fes_2)fad_12).getAppearance();
        fys_02.x(fsa_2.class);
        fsa_2 fsa_22 = new fsa_2(awx_22, awx_23, fys_02, 0, 500, 10, true, abn.cdr);
        fys_02.a(fsa_22);
    }
}

