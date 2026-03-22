/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDn
 */
@fyf_0
public class cdn_2 {
    public static final String PACKAGE = "wakfu.adminTextFormatting";

    public static void openAdminTranslatorDialog(fiq_1 fiq_12) {
        if (fyw_0.gqw().to("adminTextFormattingDialog")) {
            fyw_0.gqw().tl("adminTextFormattingDialog");
            fyw_0.gqw().tc(PACKAGE);
        } else {
            fyw_0.gqw().d(PACKAGE, cdn_2.class);
            ccj_2.g("adminTextFormattingDialog", 32768L);
            aUp aUp2 = (aUp)fse_1.gFu().vY("adminTextFormatting");
            fse_1.gFu().f("adminTextFormatting", aUp2 == null ? new aUp() : aUp2);
        }
    }

    public static void onKeyTyped(fiq_1 fiq_12, fdu_1 fdu_12, fdu_1 fdu_13, aUp aUp2) {
        String string = fdu_12.getText().replaceAll("\u001b", "");
        String string2 = BH.bf(fdu_13.getText());
        aUp2.aa(string, string2);
    }

    public static void clearInputText(fiq_1 fiq_12, aUp aUp2) {
        aUp2.cUP();
    }

    public static void clearParameters(fiq_1 fiq_12, aUp aUp2) {
        aUp2.bbl();
    }
}

