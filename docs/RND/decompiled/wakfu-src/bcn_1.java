/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Renamed from bcN
 */
public final class bcn_1
extends Enum<bcn_1> {
    public static final /* enum */ bcn_1 hJg = new bcn_1(957, List.of(Integer.valueOf(5635), Integer.valueOf(5636), Integer.valueOf(5637)), 32858, "lightGreenBarSmall", "imgEmeraldDofus");
    public static final /* enum */ bcn_1 hJh = new bcn_1(958, List.of(Integer.valueOf(5638), Integer.valueOf(5639), Integer.valueOf(5640)), 32859, "turquoiseBarSmall", "imgTurquoiseDofus");
    public static final /* enum */ bcn_1 hJi = new bcn_1(959, List.of(), 32860, "orangeBarSmall", "imgCrimsonDofus");
    public static final /* enum */ bcn_1 hJj = new bcn_1(960, List.of(), 32861, "yellowBarSmall", "imgOchreDofus");
    public static final /* enum */ bcn_1 hJk = new bcn_1(961, List.of(), 32862, "whiteBarSmall", "imgIvoryDofus");
    public static final /* enum */ bcn_1 hJl = new bcn_1(962, List.of(), 32863, "blackBarSmall", "imgEbonyDofus");
    private static final Map<Integer, bcn_1> hJm;
    private static final Map<Integer, Integer> hJn;
    public static final int hJo = 956;
    private final int hJp;
    private final List<Integer> hJq;
    private final int hJr;
    private final String hJs;
    private final String hJt;
    private static final /* synthetic */ bcn_1[] hJu;

    public static bcn_1[] values() {
        return (bcn_1[])hJu.clone();
    }

    public static bcn_1 valueOf(String string) {
        return Enum.valueOf(bcn_1.class, string);
    }

    private bcn_1(int n2, List<Integer> list, int n3, String string2, String string3) {
        this.hJp = n2;
        this.hJq = list;
        this.hJr = n3;
        this.hJs = string2;
        this.hJt = string3;
    }

    static boolean Br(int n) {
        return n == 956;
    }

    static boolean Bs(int n) {
        return hJm.containsKey(n);
    }

    static boolean a(bcd_2 bcd_22, int n, int n2) {
        return Optional.ofNullable(hJm.get(n)).map(bcn_12 -> bcn_12.hJq.get(n2)).filter(bcd_22::iV).map(bcd_22::oe).orElse(false);
    }

    static Optional<Integer> Bt(int n) {
        return Optional.ofNullable(hJm.get(n)).map(bcn_12 -> bcn_12.hJr);
    }

    static Optional<String> Bu(int n) {
        return Optional.ofNullable(hJm.get(n)).map(bcn_12 -> bcn_12.hJs);
    }

    static Optional<String> Bv(int n) {
        return Optional.ofNullable(hJm.get(n)).map(bcn_12 -> bcn_12.hJt);
    }

    public static Optional<Integer> Bw(int n) {
        return Optional.ofNullable(hJn.get(n));
    }

    private static /* synthetic */ bcn_1[] dcx() {
        return new bcn_1[]{hJg, hJh, hJi, hJj, hJk, hJl};
    }

    static {
        hJu = bcn_1.dcx();
        hJm = Arrays.stream(bcn_1.values()).collect(Collectors.toMap(bcn_12 -> bcn_12.hJp, Function.identity()));
        HashMap hashMap = new HashMap();
        for (bcn_1 bcn_13 : bcn_1.values()) {
            bcn_13.hJq.forEach(n -> hashMap.put(n, bcn_12.hJp));
        }
        hJn = Collections.unmodifiableMap(hashMap);
    }
}

