/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cZt
 */
public class czt_2 {
    private czt_2() {
    }

    public static void eZi() {
        cvu_2 cvu_22 = cvu_2.eTO();
        if (!cvu_2.eQx()) {
            aue_0.cVJ().a(cvu_22);
        } else {
            aaw_1.bUq().h(new dae_0(18258));
        }
    }

    public static void NF(int n) {
        if (!cvu_2.eQx()) {
            czt_2.eZi();
            czt_2.NI(n);
        } else {
            if (!czt_2.eZj() || czt_2.NH(n)) {
                czt_2.eZi();
                return;
            }
            czt_2.NI(n);
        }
    }

    public static void NG(int n) {
        if (!cvu_2.eQx()) {
            czt_2.eZi();
        }
        czt_2.NI(n);
    }

    private static boolean eZj() {
        return fyw_0.gqw().th("heroBuildDialog") != null;
    }

    private static boolean NH(int n) {
        fhv_1 fhv_12 = fyw_0.gqw().th("heroBuildDialog");
        if (fhv_12 == null) {
            return false;
        }
        fhv_1 fhv_13 = fhv_12.getChildWithId("sheetsTabContainer");
        if (!(fhv_13 instanceof fdh_1)) {
            return false;
        }
        fdh_1 fdh_12 = (fdh_1)fhv_13;
        return fdh_12.getSelectedTabIndex() == n;
    }

    public static void NI(int n) {
        fhv_1 fhv_12 = fyw_0.gqw().th("heroBuildDialog");
        if (fhv_12 == null) {
            return;
        }
        fhv_1 fhv_13 = fhv_12.getChildWithId("sheetsTabContainer");
        if (!(fhv_13 instanceof fdh_1)) {
            return;
        }
        fdh_1 fdh_12 = (fdh_1)fhv_13;
        if (!fdh_12.isEnabledFull()) {
            return;
        }
        fdh_12.setSelectedTabIndex(n);
    }
}

