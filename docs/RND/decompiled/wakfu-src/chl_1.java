/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cHl
 */
@fyf_0
public class chl_1 {
    public static final String PACKAGE = "wakfu.themeInfo";
    public static final String mZA = "colorPickerValue";
    public static final String mZB = "colorPickerPreview";
    public static final String mZC = "colorPickerHexPreview";
    private static final Logger mZD = Logger.getLogger(chl_1.class);

    public static void copyToClipBoard(flp_2 flp_22, String string) {
        chl_1.pQ(string);
    }

    public static void copyToClipBoard(flp_2 flp_22) {
        if (!(flp_22.gBE() instanceof fdz_1)) {
            return;
        }
        String string = ((fdz_1)flp_22.gBE()).getText();
        chl_1.pQ(string);
    }

    private static void pQ(String string) {
        bh_0.aI(string);
        aPh.czg().iZ(string + " copied to clipboard");
    }

    public static void pasteCodeAndApply(fiq_1 fiq_12, fdu_1 fdu_12) {
        if (fdu_12 == null) {
            return;
        }
        Optional<String> optional = bh_0.aHy();
        if (optional.isEmpty()) {
            return;
        }
        fdu_12.setText(optional);
        chl_1.a(fdu_12, optional.get());
    }

    public static void applyColor(flz_2 flz_22) {
        axb_2 axb_22 = (axb_2)flz_22.getValue();
        chl_1.a(axb_22, ((fhv_1)flz_22.gBE()).getElementMap());
    }

    public static void convertColorCode(fle_2 fle_22) {
        if (fle_22.gDO()) {
            return;
        }
        fdu_1 fdu_12 = (fdu_1)fle_22.gBE();
        String string = fdu_12.getText();
        chl_1.a(fdu_12, string);
    }

    public static void convertColorCode(fli_2 fli_22) {
        fdu_1 fdu_12 = (fdu_1)fli_22.gBE();
        String string = fdu_12.getText();
        chl_1.a(fdu_12, string);
    }

    private static void a(fdu_1 fdu_12, String string) {
        if (string == null || string.isEmpty()) {
            return;
        }
        axb_2 axb_22 = fha_1.uvJ.us(string);
        if (axb_22 == null) {
            return;
        }
        chl_1.a(axb_22, fdu_12.getElementMap());
        fse_1.gFu().b(mZA, axb_22, "themeInfoDialog");
    }

    private static void a(axb_2 axb_22, fhs_2 fhs_22) {
        fse_1.gFu().b(mZB, axb_22, "themeInfoDialog");
        fse_1.gFu().b(mZC, (Object)axb_22.bQk().toUpperCase(), "themeInfoDialog");
        ((fdz_1)fhs_22.uH("colorCodeHex")).setText("#" + axb_22.bQk().toUpperCase());
        ((fdz_1)fhs_22.uH("colorCodeFloat")).setText(String.format("%s,%s,%s,%s", Float.valueOf(GC.a(axb_22.aIU(), 2)), Float.valueOf(GC.a(axb_22.aIV(), 2)), Float.valueOf(GC.a(axb_22.aIW(), 2)), Float.valueOf(GC.a(axb_22.aIX(), 2))));
        ((fdz_1)fhs_22.uH("colorCodeInt")).setText(String.format("%s,%s,%s,%s", axb_22.bPW(), axb_22.bPX(), axb_22.bPY(), axb_22.bPV()));
    }

    public static void toggleNetId(fiq_1 fiq_12, fes_2 fes_22, String string) {
        String string2 = fes_22.getNetEnabledId();
        if (string2 == null) {
            return;
        }
        boolean bl = fiu_1.uCW.vM(string2);
        if (!bl) {
            fiu_1.uCW.vN(string2);
            fiu_1.uCW.c(string2, fes_22);
        }
        mZD.info((Object)("Disable following group : " + string2));
        fiu_1.uCW.N(string2, false);
        abg_2.bUP().a(() -> {
            mZD.info((Object)("Enable following group : " + string2));
            fiu_1.uCW.N(string2, true);
            if (!bl) {
                fiu_1.uCW.d(string2, fes_22);
                fiu_1.uCW.vO(string2);
            }
        }, Integer.parseInt(string), 1);
    }

    public static void saveTextChange(fiq_1 fiq_12, fgt_2 fgt_22, cbj_2 cbj_22) {
        cbj_22.setText(fgt_22.getText());
        mZD.info((Object)"Text updated !");
    }

    public static void notifyTextChange(fiq_1 fiq_12, cbj_2 cbj_22) {
        chl_1.notifyTextChange(fiq_12, cbj_22, null);
    }

    public static void notifyTextChange(fiq_1 fiq_12, cbj_2 cbj_22, @Nullable String string) {
        Runnable runnable = () -> {
            cbj_22.esr();
            mZD.info((Object)String.format("Text change notify ! (Event : %s, timeBeforeNotify : %s)", fiq_12, string));
        };
        if (string == null) {
            runnable.run();
        } else {
            abg_2.bUP().a(runnable, Integer.parseInt(string), 1);
            mZD.info((Object)String.format("Text change notification scheduled in %s ms.", string));
        }
    }
}

