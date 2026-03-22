/*
 * Decompiled with CFR 0.152.
 */
public class fdY
extends ffz_0<RL<ffV, uy_1>, RL<ffV, uy_1>> {
    protected static final fdY rZD = new fdY();

    protected fdY() {
    }

    @Override
    public int a(RL<ffV, uy_1> rL, RL<ffV, uy_1> rL2, ffV ffV2, qu_0 qu_02, qm_0 qm_02) {
        return -1;
    }

    public int a(RL<ffV, uy_1> rL, RL<ffV, uy_1> rL2, short s, ffV ffV2, short s2, ffV ffV3, qu_0 qu_02, qm_0 qm_02) {
        if (ffV2.bfd() > s2 && s2 != -1) {
            if (s == -1) {
                fdY.a("Cannot move item to position -1", qu_02, ffV2);
                return 1;
            }
            ffV ffV4 = rL2.ai(s);
            if (ffV4 == ffV2) {
                fdY.a("Cannot move item into itself", qu_02, ffV2);
                return 1;
            }
            if (ffV4 != null) {
                if (!ffV4.n(ffV2)) {
                    return 1;
                }
                if (ffV4.bfd() + s2 < ffV4.bfe()) {
                    ffV4.al(s2);
                    ffV2.al(-s2);
                    return 0;
                }
                int n = ffV4.bfe() - ffV4.bfd();
                ffV4.al((short)n);
                if (ffV2.bfd() <= n) {
                    rL.d(ffV2);
                } else {
                    ffV2.al((short)(-n));
                }
                return 0;
            }
            ffV3.ak(s2);
            if (rL2.beR().a(rL2, ffV3) >= 0) {
                rL.b(ffV2.LV(), -s2);
                try {
                    rL2.a(ffV3, s);
                }
                catch (Exception exception) {
                    fdY.a("Could not add item to position " + s, qu_02, ffV3, exception);
                }
                return 0;
            }
            return 1;
        }
        ffV ffV5 = rL2.ai(s);
        if (ffV5 == ffV2) {
            fdY.a("Cannot move item into itself", qu_02, ffV2);
            return 1;
        }
        if (ffV5 == null) {
            if (rL.beR().b(rL, ffV2) >= 0 && rL2.beR().a(rL2, ffV2) >= 0 && rL.c(ffV2)) {
                try {
                    rL2.a(ffV2, s);
                }
                catch (Exception exception) {
                    fdY.a("Could not add item to position " + s, qu_02, ffV2, exception);
                }
                return 0;
            }
            return 1;
        }
        if (!ffV5.n(ffV2)) {
            if (rL2.beR().a(rL2, ffV5, ffV2) >= 0 && rL.beR().a(rL, ffV2, ffV5) >= 0) {
                short s3 = rL.dK(ffV2.LV());
                rL.c(ffV2);
                rL2.c(ffV5);
                try {
                    rL.a(ffV5, s3);
                }
                catch (Exception exception) {
                    fdY.a("Could not add item to position " + s3, qu_02, ffV5, exception);
                }
                try {
                    rL2.a(ffV2, s);
                }
                catch (Exception exception) {
                    fdY.a("Could not add item to position " + s, qu_02, ffV2, exception);
                }
                if (rL.beR().a(rL, qu_02, qm_02)) {
                    return 0;
                }
                rL.c(ffV5);
                rL2.c(ffV2);
                try {
                    rL.a(ffV2, s3);
                }
                catch (Exception exception) {
                    fdY.a("Could not add item to position " + s3, qu_02, ffV2, exception);
                }
                try {
                    rL2.a(ffV5, s);
                }
                catch (Exception exception) {
                    fdY.a("Could not add item to position " + s, qu_02, ffV5, exception);
                }
                return 1;
            }
            return 1;
        }
        if (ffV5.bfd() + ffV2.bfd() <= ffV5.bfe()) {
            rL2.b(ffV5.LV(), ffV2.bfd());
            rL.d(ffV2);
            return 0;
        }
        int n = ffV5.bfe() - ffV5.bfd();
        rL2.b(ffV5.LV(), (short)n);
        rL.b(ffV2.LV(), (short)(-n));
        return 0;
    }

    private static void a(String string, qu_0 qu_02, ffV ffV2) {
        String string2 = qu_02 == null ? "null" : qu_02.toString();
        String string3 = ffV2 == null ? "null" : ffV2.fWz();
        sfF.warn((Object)("[Item] " + string + " (player=" + string2 + ", item=" + string3 + ")"), new Throwable("for stacktrace"));
    }

    private static void a(String string, qu_0 qu_02, ffV ffV2, Throwable throwable) {
        String string2 = qu_02 == null ? "null" : qu_02.toString();
        String string3 = ffV2 == null ? "null" : ffV2.fWz();
        sfF.error((Object)("[Item] " + string + " (player=" + string2 + ", item=" + string3 + ")"), throwable);
    }

    @Override
    public int a(RL<ffV, uy_1> rL, short s, RL<ffV, uy_1> rL2, short s2, ffV ffV2, qu_0 qu_02, qm_0 qm_02) {
        return -1;
    }

    public static fdY fUs() {
        return rZD;
    }
}

