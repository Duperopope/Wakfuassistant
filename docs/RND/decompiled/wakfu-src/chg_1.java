/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHg
 */
@fyf_0
public class chg_1 {
    public static final String PACKAGE = "wakfu.stateDetails";

    public static void setStateLevel(fiq_1 fiq_12) {
        if (fiq_12 instanceof flw_2) {
            short s = (short)Math.round(((flw_2)fiq_12).getValue());
            fhs_2 fhs_22 = ((fhv_1)fiq_12.gBE()).getElementMap();
            if (fhs_22 == null) {
                return;
            }
            chg_1.c(s, fhs_22);
        }
    }

    public static void keyType(fiq_1 fiq_12, fdu_1 fdu_12) {
        short s;
        if (fdu_12.getText().length() == 0) {
            return;
        }
        fhs_2 fhs_22 = ((fhv_1)fiq_12.gBE()).getElementMap();
        if (fhs_22 == null) {
            return;
        }
        bmg_0 bmg_02 = (bmg_0)fse_1.gFu().aW("describedState", fhs_22.getId());
        if (bmg_02 == null) {
            return;
        }
        short s2 = Bw.r(fdu_12.getText());
        if (s2 > (s = bmg_02.eel())) {
            s2 = s;
        }
        chg_1.c(s2, fhs_22);
    }

    public static void restore(fiq_1 fiq_12) {
        fhs_2 fhs_22 = ((fhv_1)fiq_12.gBD()).getElementMap();
        if (fhs_22 == null) {
            return;
        }
        short s = (short)fse_1.gFu().aV("describedStateLevel", fhs_22.getId());
        chg_1.c(s, fhs_22);
    }

    private static void c(short s, fhs_2 fhs_22) {
        bmg_0 bmg_02 = (bmg_0)fse_1.gFu().aW("describedState", fhs_22.getId());
        if (bmg_02 != null) {
            bmg_02.cg(s);
        }
    }
}

