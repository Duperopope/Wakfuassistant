/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bfk
 */
public final class bfk_2 {
    private static final String hRK = "statSlot";
    private static final String hRL = "statIcon";
    private static final String hRM = "statSlotEmpty";
    private static final Map<eym, exx_2> hRN;
    private static final Map<eym, Integer> hRO;

    private bfk_2() {
    }

    @NotNull
    private static Optional<Integer> c(@NotNull bhJ bhJ2) {
        return Optional.ofNullable(hRN.get(bhJ2.dfW())).map(bhJ2::e).map(exf_2::aYB);
    }

    private static Optional<bfn_2> d(@NotNull bhJ bhJ2) {
        if (bhJ2.dfW() != eym.pij) {
            return Optional.empty();
        }
        return bfk_2.c(bhJ2).flatMap(bfn_2::BL);
    }

    private static Optional<bfm_2> e(@NotNull bhJ bhJ2) {
        if (bhJ2.dfW() != eym.pio) {
            return Optional.empty();
        }
        return bfk_2.c(bhJ2).flatMap(bfm_2::BL);
    }

    public static Optional<Integer> f(@NotNull bhJ bhJ2) {
        return switch (bhJ2.dfW()) {
            case eym.pij -> bfk_2.d(bhJ2).map(bfn_2::dfT);
            case eym.pio -> Optional.empty();
            default -> bfk_2.c(bhJ2);
        };
    }

    public static Optional<String> g(@NotNull bhJ bhJ2) {
        return switch (bhJ2.dfW()) {
            case eym.pig -> Optional.of(aum_0.cWf().c("critere.chrage", new Object[0]));
            case eym.pij -> {
                Optional<String> var1_1 = bfk_2.d(bhJ2).map(bfn_2::axA).map(n -> aum_0.cWf().a(3, (long)n.intValue(), new Object[0]));
                if (var1_1.isEmpty()) {
                    yield Optional.of(aum_0.cWf().c("zobal.no.active.mask", new Object[0]));
                }
                yield var1_1;
            }
            case eym.pio -> {
                Optional<String> var1_2 = bfk_2.e(bhJ2).map(bfm_2::clY).map(string -> aum_0.cWf().c((String)string, new Object[0]));
                if (var1_2.isEmpty()) {
                    yield Optional.of(aum_0.cWf().c(exx_2.rHc.aXB(), new Object[0]));
                }
                yield var1_2;
            }
            default -> Optional.ofNullable(hRN.get(bhJ2.dfW())).map(exx_2::aXB).map(string -> aum_0.cWf().c((String)string, new Object[0]));
        };
    }

    public static Optional<bMn> h(@NotNull bhJ bhJ2) {
        Optional<Integer> optional = switch (bhJ2.dfW()) {
            case eym.pij -> bfk_2.d(bhJ2).map(bfn_2::LR);
            case eym.pio -> bfk_2.e(bhJ2).map(bfm_2::LR);
            default -> Optional.ofNullable(hRO.get(bhJ2.dfW()));
        };
        return optional.map(bhJ2::Da);
    }

    @Nullable
    public static String i(@NotNull bhJ bhJ2) {
        return bfk_2.a(bhJ2, hRK, hRM);
    }

    @Nullable
    public static String j(@NotNull bhJ bhJ2) {
        return bfk_2.a(bhJ2, hRL, null);
    }

    @Nullable
    private static String a(@NotNull bhJ bhJ2, String string, @Nullable String string3) {
        eym eym2 = bhJ2.dfW();
        String string4 = string + eym2.name();
        return switch (eym2) {
            case eym.pij -> bfk_2.d(bhJ2).map(bfn_2::dfR).map(string2 -> string4 + string2).orElse(string3);
            case eym.pio -> bfk_2.e(bhJ2).map(bfm_2::dfR).map(string2 -> string4 + string2).orElse(string3);
            default -> string4;
        };
    }

    public static Optional<String> k(@NotNull bhJ bhJ2) {
        if (bhJ2.dfW() != eym.pio) {
            return Optional.empty();
        }
        return bfk_2.e(bhJ2).map(bfm_2::dfQ).map(biJ::f);
    }

    static {
        EnumMap<eym, exx_2> enumMap = new EnumMap<eym, exx_2>(eym.class);
        enumMap.put(eym.phW, exx_2.rGT);
        enumMap.put(eym.phX, exx_2.rGY);
        enumMap.put(eym.phY, exx_2.rHd);
        enumMap.put(eym.phZ, exx_2.rHf);
        enumMap.put(eym.pia, exx_2.rGU);
        enumMap.put(eym.pib, exx_2.rGZ);
        enumMap.put(eym.pic, exx_2.rHe);
        enumMap.put(eym.pid, exx_2.rHg);
        enumMap.put(eym.pie, exx_2.rGV);
        enumMap.put(eym.pif, exx_2.rHa);
        enumMap.put(eym.pig, exx_2.rGQ);
        enumMap.put(eym.pih, exx_2.rHh);
        enumMap.put(eym.pii, exx_2.rGW);
        enumMap.put(eym.pij, exx_2.rHb);
        enumMap.put(eym.pik, exx_2.rHN);
        enumMap.put(eym.pil, exx_2.rHT);
        enumMap.put(eym.pin, exx_2.rGX);
        enumMap.put(eym.pio, exx_2.rHc);
        hRN = Collections.unmodifiableMap(enumMap);
        EnumMap<eym, Integer> enumMap2 = new EnumMap<eym, Integer>(eym.class);
        enumMap2.put(eym.phW, 6345);
        enumMap2.put(eym.phY, 8552);
        enumMap2.put(eym.phZ, 3114);
        enumMap2.put(eym.pia, 6759);
        enumMap2.put(eym.pib, 3683);
        enumMap2.put(eym.pic, 3869);
        enumMap2.put(eym.pid, 3442);
        enumMap2.put(eym.pie, 7792);
        enumMap2.put(eym.pih, 3300);
        enumMap2.put(eym.pii, 7919);
        hRO = Collections.unmodifiableMap(enumMap2);
    }
}

