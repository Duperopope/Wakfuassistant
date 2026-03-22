/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDo
 */
@fyf_0
public class cdo_2 {
    public static final String PACKAGE = "wakfu.adminTranslator";
    private static final ccf_2 mTm = new ccf_2();

    public static void openAdminTranslatorDialog(fiq_1 fiq_12) {
        if (fyw_0.gqw().to("adminTranslatorDialog")) {
            fyw_0.gqw().tl("adminTranslatorDialog");
            fyw_0.gqw().tc(PACKAGE);
        } else {
            ccj_2.pd("adminTranslatorDialog");
            fyw_0.gqw().d(PACKAGE, cdo_2.class);
            auq_0 auq_02 = (auq_0)fse_1.gFu().vY("adminTranslator");
            if (auq_02 == null) {
                auq_0 auq_03 = new auq_0();
                auq_03.bkZ();
                fse_1.gFu().f("adminTranslator", auq_03);
            }
        }
    }

    public static void filterTranslationsByKey(fiq_1 fiq_12, auq_0 auq_02, fdv_1 fdv_12, fdv_1 fdv_13) {
        fdv_13.clear();
        String string = fdv_12.getText();
        mTm.a(0, () -> auq_02.ko(string.isBlank() ? null : string));
    }

    public static void filterTranslationsByText(fiq_1 fiq_12, auq_0 auq_02, fdv_1 fdv_12, fdv_1 fdv_13) {
        fdv_12.clear();
        String string = fdv_13.getText();
        mTm.a(0, () -> auq_02.kp(string.isBlank() ? null : string));
    }

    public static void copyTranslationKey(fiq_1 fiq_12, aus_0 aus_02) {
        bh_0.aI(aus_02.getKey());
        byj_1.epo().a(byc_1.a(byh_1.lAy, "Key copied to clipboard"));
    }

    public static void copyTranslationValue(fiq_1 fiq_12, aus_0 aus_02, String string) {
        bh_0.aI(String.valueOf(aus_02.eu(string.toLowerCase())));
        byj_1.epo().a(byc_1.a(byh_1.lAy, String.format("%s translation (of key '%s') copied to clipboard", string.toUpperCase(), aus_02.getKey())));
    }
}

