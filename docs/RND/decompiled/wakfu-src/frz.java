/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public abstract class frz {
    private static final frb_0 sYL = frb_0.sYO;
    private static final Map<fre_0, frd_0> sYM = new EnumMap<fre_0, frd_0>(fre_0.class);

    public static boolean a(long l, fre_0 fre_02, int n) {
        switch (fre_02) {
            case sYZ: {
                return frz.a(l, zd_2.aoC, n);
            }
            case sZa: {
                return frz.a(l, zd_2.aoD, n);
            }
        }
        return true;
    }

    public static boolean a(long l, zd_2 zd_22, int n) {
        if (zd_22 == zd_2.aoC && frb_0.sYO.gkl().contains(n)) {
            return true;
        }
        Optional<frw> optional = evx_2.feo().b(l, eva_1.owC);
        return optional.map(frw2 -> frw2.b(zd_22)).map(set -> set.contains(n)).orElse(false);
    }

    public static Set<Integer> a(long l, zd_2 zd_22) {
        Optional<frw> optional = evx_2.feo().b(l, eva_1.owC);
        return optional.map(frw2 -> frw2.b(zd_22)).orElse(Collections.emptySet());
    }

    public static boolean b(long l, zd_2 zd_22, int n) {
        Optional<frw> optional = evx_2.feo().b(l, eva_1.owC);
        return optional.map(frw2 -> frw2.b(zd_22).add(n)).orElse(false);
    }

    public static void a(frd_0 ... frd_0Array) {
        for (frd_0 frd_02 : frd_0Array) {
            if (sYM.containsKey(frd_02.egC())) {
                throw new IllegalArgumentException("Provider is already registered : " + String.valueOf(frd_02));
            }
            sYM.put(frd_02.egC(), frd_02);
        }
    }

    public static frb_0 gki() {
        return sYL;
    }

    public static <Provider extends frd_0> Provider a(fre_0 fre_02) {
        return (Provider)sYM.get(fre_02);
    }
}

