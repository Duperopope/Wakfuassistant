/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cET
 */
@fyf_0
public class cet_2 {
    public static final String PACKAGE = "wakfu.guildHavenWorld";
    private static final String mVm = "havenWorldElementContainer";

    public static void selectTab(flv_2 flv_22) {
        if (!flv_22.bqr()) {
            return;
        }
        fcu_1 fcu_12 = (fcu_1)flv_22.gBE();
        String string = fcu_12.getValue();
        fhs_2 fhs_22 = fcu_12.getElementMap();
        cet_2.b(fhs_22);
        cet_2.a(fhs_22, mVm + string, true);
    }

    private static void b(fhs_2 fhs_22) {
        cet_2.a(fhs_22, "havenWorldElementContainer1", false);
        cet_2.a(fhs_22, "havenWorldElementContainer2", false);
        cet_2.a(fhs_22, "havenWorldElementContainer3", false);
        cet_2.a(fhs_22, "havenWorldElementContainer4", false);
    }

    private static void a(fhs_2 fhs_22, String string, boolean bl) {
        fes_2 fes_22 = (fes_2)fhs_22.uH(string);
        if (fes_22 != null) {
            fes_22.setVisible(bl);
        }
    }

    public static void changeHavenWorldLock(flp_2 flp_22) {
        Object object = fse_1.gFu().vY("havenWorld");
        if (!(object instanceof bqy_0)) {
            return;
        }
        ((bqy_0)object).eku();
        caf_2.lFq.eqS();
    }
}

