/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bId
 */
public class bid_1
implements aeh_2 {
    public static final String ked = "priceFieldModes";
    public static final String kee = "quantityFieldModes";
    private static final String[] kef;
    private static final List<bsn_1> keg;
    private static final List<bsn_1> keh;
    private static final String[] kei;

    @Override
    @Nullable
    public Object eu(String string) {
        if (ked.equals(string)) {
            return bic_1.kdW;
        }
        if (kee.equals(string)) {
            return bic_1.kdY;
        }
        bsn_1 bsn_12 = (bsn_1)bsn_1.ew(string);
        if (bsn_12 != null) {
            if (keg.contains(bsn_12)) {
                return bid_1.b(bsn_12);
            }
            if (keh.contains(bsn_12)) {
                return bid_1.c(bsn_12);
            }
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return kei;
    }

    public static boolean b(bsn_1 bsn_12) {
        return ((bsg_1)aie_0.cfn().bmH()).a(bsn_12);
    }

    public static bic_1 c(bsn_1 bsn_12) {
        return bic_1.GV(((bsg_1)aie_0.cfn().bmH()).d(bsn_12));
    }

    static {
        int n;
        kef = new String[]{ked, kee};
        keg = List.of(bsn_1.lkJ, bsn_1.lkK, bsn_1.lkL, bsn_1.lkO, bsn_1.lkR, bsn_1.lkS, bsn_1.lkT);
        keh = List.of(bsn_1.lkM, bsn_1.lkN, bsn_1.lkP, bsn_1.lkQ);
        kei = new String[kef.length + keg.size() + keh.size()];
        System.arraycopy(kef, 0, kei, 0, kef.length);
        for (n = 0; n < keg.size(); ++n) {
            bid_1.kei[bid_1.kef.length + n] = keg.get(n).getKey();
        }
        for (n = 0; n < keh.size(); ++n) {
            bid_1.kei[bid_1.kef.length + bid_1.keg.size() + n] = keh.get(n).getKey();
        }
    }
}

