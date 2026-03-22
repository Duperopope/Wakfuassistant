/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEd
 */
@fyf_0
public class ced_1 {
    public static final String PACKAGE = "wakfu.convention";

    public static void validateForm(flp_2 flp_22, fdu_1 fdu_12, fdu_1 fdu_13, fdu_1 fdu_14) {
        String string = aue_0.cVJ().cVK().getName();
        if (ced_1.a(fdu_12) || ced_1.a(fdu_13)) {
            return;
        }
        dag_0 dag_02 = new dag_0(fdu_12.getText(), string, fdu_14.getText(), fdu_13.getText(), 0L);
        dag_02.lK(17759);
        aaw_1.bUq().h(dag_02);
    }

    private static boolean a(fdu_1 fdu_12) {
        return fdu_12.getText() == null || fdu_12.getText().isEmpty();
    }
}

