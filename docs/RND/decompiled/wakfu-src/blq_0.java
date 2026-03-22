/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bLQ
 */
public final class blq_0 {
    private blq_0() {
    }

    public static boolean c(fqy_0 fqy_02) {
        return fqy_02 == null || fqy_02.giu().isEmpty();
    }

    public static void a(ads_0 ads_02, fqy_0 fqy_02) {
        blq_0.a(ads_02, fqy_02, true);
    }

    public static void b(ads_0 ads_02, fqy_0 fqy_02) {
        blq_0.a(ads_02, fqy_02, false);
    }

    private static void a(ads_0 ads_02, fqy_0 fqy_02, boolean bl) {
        Object object;
        Object object2 = object = bl ? fqy_02.giu() : blq_0.d(fqy_02) + "-Fin";
        if (((String)object).isEmpty()) {
            return;
        }
        ads_02.dT((String)object);
        ads_02.bH(fqy_02.gix());
    }

    public static String d(fqy_0 fqy_02) {
        String string = fqy_02.giu();
        int n = string.lastIndexOf("-Debut");
        return n == -1 ? string : string.substring(0, n);
    }
}

