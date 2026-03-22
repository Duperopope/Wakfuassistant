/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from btj
 */
public final class btj_0 {
    private btj_0() {
    }

    public static void j(bsj_0 bsj_02) {
        Collection collection = bsj_02.dGs();
        for (bgy bgy2 : collection) {
            bgy2.ddI().d(() -> btj_0.a(bgy2, bsj_02));
        }
    }

    public static void a(bgy bgy2, bsj_0 bsj_02) {
        bdt_2 bdt_22 = bgy2.ddI().ddm();
        btk_0 btk_02 = new btk_0(bdt_22);
        abg_2.bUP().a(() -> {
            boolean bl = false;
            if (bsj_02.ba((exP)bgy2)) {
                bl = bgy2.a(btk_02);
            } else if (bsj_02.bb((exP)bgy2)) {
                aUZ.a(bgy2, true);
            } else if (bsj_02.bc((exP)bgy2)) {
                aUZ.c(bgy2, bsj_02.d());
            }
            if (!bl) {
                btj_0.a(bdt_22);
            }
        }, 0L, 1);
    }

    private static void a(bdt_2 bdt_22) {
        boolean bl = bdt_22.ddQ();
        if (bl) {
            bdt_22.ddN();
        }
    }
}

