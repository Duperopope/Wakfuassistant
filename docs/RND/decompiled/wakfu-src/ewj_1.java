/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eWj
 */
final class ewj_1 {
    ewj_1() {
    }

    static boolean a(eum_0 eum_02, eum_0 eum_03, acd_1 acd_12) {
        acd_1 acd_13;
        if (eum_02 == null || eum_03 == null) {
            return true;
        }
        int n = eum_02.bcO() + eum_03.bcO();
        acd_1 acd_14 = acd_12 == null ? eum_03.eap() : acd_12;
        if (acd_14.equals(acd_13 = eum_02.eap())) {
            return true;
        }
        int n2 = Math.abs(acd_13.getX() - acd_14.getX());
        if (n2 > n + 1) {
            return true;
        }
        int n3 = Math.abs(acd_13.getY() - acd_14.getY());
        if (n3 > n + 1) {
            return true;
        }
        return n2 == n + 1 && n3 == n + 1;
    }
}

