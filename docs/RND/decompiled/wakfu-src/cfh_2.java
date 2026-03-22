/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from cFH
 */
@fyf_0
public class cfh_2 {
    public static final String PACKAGE = "wakfu.notificationPanel";
    private static final Pattern mWJ = Pattern.compile("\\#\\#(.*)\\#\\#");

    public static String createLink(String string, biu_1 biu_12) {
        return cfh_2.createLink(string, biu_12, null);
    }

    public static String createLink(String string, biu_1 biu_12, String string2) {
        Matcher matcher = mWJ.matcher(string);
        if (matcher.find()) {
            String string3 = matcher.group(1);
            ahv_2 ahv_22 = new ahv_2();
            ahv_22.c(string.substring(0, matcher.start()));
            ahv_22.ceC().ceA().ij(biu_12.name() + (string2 == null ? "" : string2));
            ahv_22.c(string3).ceB().ceD();
            ahv_22.c(string.substring(matcher.end()));
            string = ahv_22.ceL();
        }
        return string;
    }

    public static void forceCycle(flp_2 flp_22) {
        if (flp_22.gEk()) {
            cwz_1.eWv().eWC();
        }
    }

    public static void gotoNotificationLinkTooltip(fiq_1 fiq_12, frx_1 frx_12) {
        fdy_1 fdy_12 = (fdy_1)fiq_12.gBE();
        fgb_2 fgb_22 = fdy_12.getBlockUnderMouse();
        if (fgb_22 != null && fgb_22.gyV() == fgc_2.uuh) {
            fgk_2 fgk_22 = fgb_22.gyW();
            if (fgk_22 == null) {
                return;
            }
            if (fgk_22.gzE() == ahr_2.dSC && ((fgm_1)fgk_22).gzf()) {
                fyd_0.popup(frx_12, fdy_12);
            }
        }
    }

    public static void gotoNotificationLink(flp_2 flp_22, biv_1 biv_12) {
        if (!flp_22.gEm()) {
            cfh_2.forceCycle(flp_22);
            return;
        }
        String string = null;
        fdy_1 fdy_12 = (fdy_1)flp_22.gBE();
        fgb_2 fgb_22 = fdy_12.getBlockUnderMouse();
        biu_1 biu_12 = biv_12.dZx();
        if (fgb_22 != null && fgb_22.gyV() == fgc_2.uuh) {
            String string2;
            fgk_2 fgk_22 = fgb_22.gyW();
            if (fgk_22 == null) {
                return;
            }
            if (fgk_22.gzE() == ahr_2.dSC && (string2 = ((fgm_1)fgk_22).getId()) != null && string2.length() > 0) {
                string = string2.replaceAll(biu_12.name(), "");
            }
        }
        switch (biu_12) {
            case kiv: {
                if (aue_0.cVJ().c(csx_1.ePi())) break;
                aue_0.cVJ().a(csx_1.ePi());
                break;
            }
            case kix: {
                if (aue_0.cVJ().c(cwo_2.eWo())) break;
                fse_1.gFu().f("nationCurrentPageIndex", (byte)2);
                aue_0.cVJ().a(cwo_2.eWo());
                break;
            }
            case kiy: {
                if (string == null) {
                    return;
                }
                int n = Integer.parseInt(string);
                if (aue_0.cVJ().c(cwo_2.eWo())) break;
                boolean bl = n == aue_0.cVJ().cVK().ffF().Xt();
                fse_1.gFu().f("nationCurrentPageIndex", bl ? (byte)2 : 3);
                aue_0.cVJ().a(cwo_2.eWo());
                break;
            }
            case kiw: {
                if (string == null) {
                    return;
                }
                int n = Integer.parseInt(string);
                ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.ljF, n);
                if (!aue_0.cVJ().c(cte_2.eQC())) {
                    aue_0.cVJ().a(cte_2.eQC());
                    break;
                }
                cte_2.eQC().eQD();
                break;
            }
            case kiB: {
                break;
            }
            case kiz: {
                if (string == null) {
                    return;
                }
                if (string.length() > 0) {
                    byte by = Byte.parseByte(string);
                    fse_1.gFu().f("nationCurrentPageIndex", by);
                }
                if (aue_0.cVJ().c(cwo_2.eWo())) break;
                aue_0.cVJ().a(cwo_2.eWo());
                break;
            }
            case kiD: {
                break;
            }
            case kiC: {
                break;
            }
            case kiA: {
                if (aue_0.cVJ().c(cvg_2.eTB())) break;
                aue_0.cVJ().a(cvg_2.eTB());
            }
        }
    }

    public static void selectMessage(flg_2 flg_22) {
        cwz_1.eWv().a((biv_1)flg_22.getItemValue());
    }

    public static void overMessage(fiq_1 fiq_12) {
        cwz_1.eWv().kL(true);
    }

    public static void outMessage(fiq_1 fiq_12) {
        cwz_1.eWv().kL(false);
    }
}

