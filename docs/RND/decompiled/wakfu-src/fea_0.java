/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from fea
 */
public class fea_0 {
    public static int ah(long l, int n) {
        Optional<evv_2> optional = evx_2.feo().a(l, eva_1.owu);
        if (optional.isEmpty()) {
            return 0;
        }
        evv_2 evv_22 = optional.get();
        if (!(evv_22 instanceof feb_0)) {
            return 0;
        }
        feb_0 feb_02 = (feb_0)evv_22;
        return feb_02.Qe(n);
    }
}

