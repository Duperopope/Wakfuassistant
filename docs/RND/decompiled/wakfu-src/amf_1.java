/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amf
 */
public final class amf_1 {
    private amf_1() {
    }

    public static int a(amg_1 amg_12, amg_1 amg_13) {
        return Math.max(0, amf_1.c(amg_12, amg_13) - 1);
    }

    public static int b(amg_1 amg_12, amg_1 amg_13) {
        return Math.abs(amg_12.bcC() - amg_13.bcC()) + Math.abs(amg_12.bcD() - amg_13.bcD());
    }

    public static int c(amg_1 amg_12, amg_1 amg_13) {
        int n = amg_12.bcO() + amg_13.bcO();
        int n2 = Math.max(0, Math.abs(amg_12.bcC() - amg_13.bcC()) - n);
        int n3 = Math.max(0, Math.abs(amg_12.bcD() - amg_13.bcD()) - n);
        return n2 + n3;
    }

    public static int a(amg_1 amg_12, acd_1 acd_12) {
        return Math.max(0, amf_1.c(amg_12, acd_12) - 1);
    }

    public static int b(amg_1 amg_12, acd_1 acd_12) {
        return Math.abs(amg_12.bcC() - acd_12.getX()) + Math.abs(amg_12.bcD() - acd_12.getY());
    }

    public static int c(amg_1 amg_12, acd_1 acd_12) {
        int n = Math.max(0, Math.abs(amg_12.bcC() - acd_12.getX()) - amg_12.bcO());
        int n2 = Math.max(0, Math.abs(amg_12.bcD() - acd_12.getY()) - amg_12.bcO());
        return n + n2;
    }

    public static int a(amg_1 amg_12, int n, int n2) {
        int n3 = Math.max(0, Math.abs(amg_12.bcC() - n) - amg_12.bcO());
        int n4 = Math.max(0, Math.abs(amg_12.bcD() - n2) - amg_12.bcO());
        return n3 + n4;
    }
}

