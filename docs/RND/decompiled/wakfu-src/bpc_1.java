/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Comparator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bpC
 */
public final class bpc_1 {
    private static final Comparator<bpb_1> iWJ = Comparator.comparingInt(bpb_1::d);
    private static final Comparator<bpg_1> iWK = Comparator.comparing(bpb_1::dDq);
    private static final Comparator<bpe_1> iWL = Comparator.comparing(bpb_1::dDq);
    public static final Comparator<bpg_1> iWM = iWK.thenComparing(iWJ);
    public static final Comparator<bpe_1> iWN = iWL.thenComparing(iWJ);
    public static final Map<bps_0, Comparator<bpg_1>> iWO = Map.of(bps_0.iVu, Comparator.comparingInt(bpg_1::aVf));
    public static final Map<bps_0, Comparator<bpe_1>> iWP = Map.of(bps_0.iVu, Comparator.comparingInt(bpe_1::aVf), bps_0.iVw, Comparator.comparingInt(bpe_1::dDt));

    private bpc_1() {
    }

    public static Comparator<bpg_1> c(@NotNull bps_0 bps_02) {
        bps_0 bps_03 = bps_02.dCQ();
        boolean bl = bps_02 == bps_03;
        Comparator<bpg_1> comparator = iWO.get((Object)bps_02.dCQ());
        if (comparator == null) {
            return bl ? iWM : iWM.reversed();
        }
        return (bl ? comparator : comparator.reversed()).thenComparing(iWM);
    }

    public static Comparator<bpe_1> d(@NotNull bps_0 bps_02) {
        bps_0 bps_03 = bps_02.dCQ();
        boolean bl = bps_02 == bps_03;
        Comparator<bpe_1> comparator = iWP.get((Object)bps_02.dCQ());
        if (comparator == null) {
            return bl ? iWN : iWN.reversed();
        }
        return (bl ? comparator : comparator.reversed()).thenComparing(iWN);
    }
}

