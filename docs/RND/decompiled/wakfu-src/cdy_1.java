/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDY
 */
@fyf_0
public class cdy_1 {
    public static final String PACKAGE = "wakfu.adminConsole";

    public static void processInputKeyEvent(fli_2 fli_22, fdu_1 fdu_12) {
        switch (fli_22.bCC()) {
            case 10: {
                aqg_0.cBA().jE(fdu_12.getText());
                fdu_12.setText("");
                break;
            }
            case 38: {
                fdu_12.setText(aqg_0.cBA().cBx());
                break;
            }
            case 40: {
                fdu_12.setText(aqg_0.cBA().cBy());
            }
        }
    }

    public static void clear(fiq_1 fiq_12) {
        aqk_0.cBK().clear();
    }
}

