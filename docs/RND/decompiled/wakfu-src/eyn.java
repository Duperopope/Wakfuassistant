/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class eyn {
    private static final ImmutableSet<eym> piw = ImmutableSet.of((Object)eym.pid, (Object)eym.pie, (Object)eym.pib, (Object)eym.phW, (Object)eym.pig, (Object)eym.pic, (Object[])new eym[]{eym.phZ, eym.pih, eym.pia, eym.phX, eym.pif, eym.phY, eym.pii, eym.pij, eym.pil, eym.pin, eym.pio, eym.pik});
    private static final ImmutableSet<eym> pix = ImmutableSet.of();
    private static Set<eym> piy = null;
    private static Set<eym> piz = null;
    public static final int piA = 4;
    public static final int piB = 3;
    public static final short piC = 1;

    public static void fhX() {
        List<Long> list = ewo_0.oBF.o(ewr_0.oBU);
        if (list.isEmpty()) {
            piy = Sets.immutableEnumSet(piw);
            piz = Sets.immutableEnumSet(pix);
        } else {
            piy = piw.stream().filter(eym2 -> list.contains(eym2.aWP())).collect(Collectors.toSet());
            piz = pix.stream().filter(eym2 -> list.contains(eym2.aWP())).collect(Collectors.toSet());
        }
    }

    public static Set<eym> fhY() {
        return piy;
    }

    public static Set<eym> fhZ() {
        return piz;
    }

    public static boolean h(eym eym2) {
        if (eym2 == null) {
            return false;
        }
        return eyn.OS(eym2.aWP());
    }

    public static boolean OS(int n) {
        eym eym2 = eym.OR(n);
        return (piy.contains(eym2) || piz.contains(eym2)) && eym2.isInitialized();
    }

    static {
        eyn.fhX();
        ewo_0.oBF.a((ewr_02, object) -> {
            if (ewr_02 != ewr_0.oBU) {
                return;
            }
            eyn.fhX();
        });
    }
}

