/*
 * Decompiled with CFR 0.152.
 */
final class aal {
    private static final wt_0[] bYy;
    private static final String bYz = "debug_walkable";
    private static final String bYA = "debug_non_walkable";
    private static final String bYB = "debug_mobosteryl";
    private static final String bYC = "debug_resourcesteryl";
    private static final String bYD = "debug_partition_border";
    private static final String bYE = "debug_partition_border2";
    private static boolean bYF;
    private static boolean bYG;
    static final /* synthetic */ boolean bYH;

    private aal() {
    }

    public static void bQ(boolean bl) {
        bYF = bl;
        try {
            if (bYF) {
                agu_0 agu_02 = agx_0.bze().eF(bYz);
                agu_02.q(new float[]{0.1f, 0.7f, 0.1f, 0.5f});
                agu_0 agu_03 = agx_0.bze().eF(bYA);
                agu_03.q(new float[]{0.7f, 0.1f, 0.1f, 0.5f});
                agu_0 agu_04 = agx_0.bze().eF(bYB);
                agu_04.q(new float[]{0.7f, 0.4f, 0.1f, 0.5f});
                agu_0 agu_05 = agx_0.bze().eF(bYC);
                agu_05.q(new float[]{0.1f, 0.1f, 0.7f, 0.5f});
            } else {
                agx_0.bze().eG(bYz);
                agx_0.bze().eG(bYA);
                agx_0.bze().eG(bYB);
                agx_0.bze().eG(bYC);
            }
        }
        catch (Exception exception) {
            aaj_0.bYa.error((Object)"", (Throwable)exception);
        }
    }

    public static void bR(boolean bl) {
        bYG = bl;
        try {
            if (bYG) {
                agu_0 agu_02 = agx_0.bze().eF(bYD);
                agu_02.q(new float[]{0.9f, 0.9f, 0.9f, 0.8f});
                agu_0 agu_03 = agx_0.bze().eF(bYE);
                agu_03.q(new float[]{0.1f, 0.1f, 0.1f, 0.8f});
            } else {
                agx_0.bze().eG(bYD);
                agx_0.bze().eG(bYE);
            }
        }
        catch (Exception exception) {
            aaj_0.bYa.error((Object)"", (Throwable)exception);
        }
    }

    static boolean brd() {
        return bYF;
    }

    static boolean bre() {
        return bYG;
    }

    static void bc(int n, int n2) {
        if (!bYH && !bYF) {
            throw new AssertionError();
        }
        agx_0.bze().eI(bYz);
        agx_0.bze().eI(bYA);
        agx_0.bze().eI(bYB);
        agx_0.bze().eI(bYC);
        for (int i = n - 18; i < n + 18; ++i) {
            for (int j = n2 - 18; j < n2 + 18; ++j) {
                wy_0 wy_02 = wa_0.aQ(i, j);
                if (wy_02 == null) continue;
                int n3 = wy_02.bmp().a(i, j, bYy, 0);
                for (int i2 = 0; i2 < n3; ++i2) {
                    if (aal.bYy[i2].ban == Short.MIN_VALUE) continue;
                    long l = agx_0.E(i, j, aal.bYy[i2].ban);
                    if (aal.bYy[i2].bNr) {
                        agx_0.bze().a(l, bYA);
                        continue;
                    }
                    boolean bl = wy_02.u(i, j, aal.bYy[i2].ban);
                    if (bl || aal.bYy[i2].bNP == -1) {
                        agx_0.bze().a(l, bYA);
                        continue;
                    }
                    if (bYy[i2].bmd()) {
                        agx_0.bze().a(l, bYB);
                        continue;
                    }
                    if (bYy[i2].bmf()) {
                        agx_0.bze().a(l, bYC);
                        continue;
                    }
                    agx_0.bze().a(l, bYz);
                }
            }
        }
    }

    static void bd(int n, int n2) {
        if (!bYH && !bYF) {
            throw new AssertionError();
        }
        agx_0.bze().eI(bYD);
        agx_0.bze().eI(bYE);
        for (int i = n - 18; i < n + 18; ++i) {
            for (int j = n2 - 18; j < n2 + 18; ++j) {
                wy_0 wy_02 = wa_0.aQ(i, j);
                if (wy_02 == null) continue;
                int n3 = wy_02.bmp().a(i, j, bYy, 0);
                for (int i2 = 0; i2 < n3; ++i2) {
                    if (aal.bYy[i2].ban == Short.MIN_VALUE || !Wa.aH(i, j)) continue;
                    int n4 = Wa.qf(i);
                    int n5 = Wa.qg(j);
                    long l = agx_0.E(i, j, aal.bYy[i2].ban);
                    String string = (n4 + n5) % 2 == 0 ? bYD : bYE;
                    agx_0.bze().a(l, string);
                }
            }
        }
    }

    static {
        bYH = !aaj_0.class.desiredAssertionStatus();
        bYy = wt_0.blX();
    }
}

