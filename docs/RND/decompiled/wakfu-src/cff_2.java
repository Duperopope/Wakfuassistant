/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Collection;
import org.apache.log4j.Logger;

/*
 * Renamed from cFF
 */
@fyf_0
public final class cff_2 {
    public static final String PACKAGE = "wakfu.ninePatch";
    private static final Logger mWI = Logger.getLogger(cff_2.class);

    private cff_2() {
    }

    public static void updateField(fiq_1 fiq_12, fix_2 fix_22) {
        fix_22.gBS();
    }

    public static void printInfo(fiq_1 fiq_12, fix_2 fix_22) {
        cbh_2 cbh_22 = (cbh_2)fse_1.gFu().getProperty("ninePatch").getValue();
        mWI.info((Object)("form.isValid() = " + fix_22.isValid()));
        fes_2 fes_22 = (fes_2)fix_22.getElementMap().uH("targetContainer");
        fys_0 fys_02 = fes_22.getAppearance();
        fkd_1 fkd_12 = cbh_22.erZ();
        fys_02.grb();
        fys_02.X(fkd_12);
        cbh_22.esa();
    }

    public static boolean validateForm(fix_2 fix_22) {
        mWI.info((Object)("form = " + String.valueOf(fix_22)));
        Collection<fsf_1> collection = fix_22.getProperties();
        for (fsf_1 fsf_12 : collection) {
            boolean bl = (Boolean)fsf_12.wb("isValid");
            if (bl) continue;
            return false;
        }
        return true;
    }

    public static void computeXCoords(fiq_1 fiq_12, fdu_1 fdu_12, fdu_1 fdu_13, fdu_1 fdu_14) {
        cbh_2 cbh_22 = (cbh_2)fse_1.gFu().getProperty("ninePatch").getValue();
        fdu_12.setTextImmediate(String.valueOf(0));
        int n = cbh_22.getWidth();
        fdu_13.setTextImmediate(String.valueOf(n / 2));
        int n2 = cbh_22.esm();
        fdu_14.setTextImmediate(String.valueOf(n - n2));
    }

    public static void computeYCoords(fiq_1 fiq_12, fdu_1 fdu_12, fdu_1 fdu_13, fdu_1 fdu_14) {
        cbh_2 cbh_22 = (cbh_2)fse_1.gFu().getProperty("ninePatch").getValue();
        fdu_12.setTextImmediate(String.valueOf(0));
        int n = cbh_22.getHeight();
        fdu_13.setTextImmediate(String.valueOf(n / 2));
        int n2 = cbh_22.esp();
        fdu_14.setTextImmediate(String.valueOf(n - n2));
    }

    public static void copyXML(flp_2 flp_22) {
        cbh_2 cbh_22 = (cbh_2)fse_1.gFu().getProperty("ninePatch").getValue();
        if (BH.aU(cbh_22.esq())) {
            return;
        }
        bh_0.aI(cbh_22.esq());
        aPh.czg().iZ("XML definition copied to clipboard");
    }
}

