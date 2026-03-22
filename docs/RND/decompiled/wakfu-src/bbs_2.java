/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from bbS
 */
public final class bbs_2 {
    private bbs_2() {
    }

    public static void a(evv_2 ... evv_2Array) {
        long l = bbs_2.xl();
        if (l <= 0L) {
            return;
        }
        evx_2.feo().a(l, evv_2Array);
    }

    public static <T extends evv_2> Optional<T> a(eva_1 eva_12) {
        long l = bbs_2.xl();
        if (l <= 0L) {
            return Optional.empty();
        }
        return evx_2.feo().b(l, eva_12);
    }

    public static void cg(byte[] byArray) {
        long l = bbs_2.xl();
        if (l <= 0L) {
            return;
        }
        evx_2.feo().d(l, byArray);
    }

    public static void das() {
        long l = bbs_2.xl();
        if (l <= 0L) {
            return;
        }
        evx_2.feo().pf(l);
    }

    public static long xl() {
        aUQ aUQ2 = aue_0.cVJ().cVO();
        if (aUQ2 == null) {
            return 0L;
        }
        return aUQ2.xl();
    }
}

