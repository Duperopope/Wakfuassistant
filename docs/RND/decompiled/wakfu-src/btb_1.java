/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from btB
 */
public class btb_1 {
    private btb_1() {
    }

    public static btd_1 d(@NotNull bsS bsS2, @NotNull bgy bgy2) {
        return new bta_1(bsS2, aue_0.cVJ().cVK(), bgy2);
    }

    public static btd_1 e(@NotNull bsS bsS2, @NotNull bgy bgy2) {
        return new btg_1(bsS2, aue_0.cVJ().cVK(), bgy2);
    }

    public static btd_1 s(@NotNull bsS bsS2) {
        return new btz_0(bsS2, aue_0.cVJ().cVK());
    }

    public static btd_1 b(@NotNull bJr bJr2) {
        bsi_0 bsi_02 = bJr2.cXa().dkW();
        if (bsi_02 == null) {
            return new btc_1();
        }
        return new btz_0(bsi_02, aue_0.cVJ().cVK()).dHR();
    }
}

